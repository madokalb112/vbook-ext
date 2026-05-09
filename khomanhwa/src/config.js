let BASE_URL = "https://khomanhwa.com";
try {
    if (CONFIG_URL) BASE_URL = ("" + CONFIG_URL).replace(/\/+$/, "");
} catch (error) {
}

let HOME_URL = BASE_URL + "/";
let DESKTOP_UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36";

function stripTrailingSlash(url) {
    if (!url) return "";
    return ("" + url).replace(/\/+$/, "");
}

function cleanText(text) {
    if (!text) return "";
    return ("" + text).replace(/\s+/g, " ").trim();
}

function decodeHtml(text) {
    if (!text) return "";
    return ("" + text)
        .replace(/&amp;/g, "&")
        .replace(/&quot;/g, "\"")
        .replace(/&#039;/g, "'")
        .replace(/&apos;/g, "'")
        .replace(/&lt;/g, "<")
        .replace(/&gt;/g, ">");
}

function foldText(text) {
    text = cleanText(text).toLowerCase();
    try {
        text = text.normalize("NFD").replace(/[\u0300-\u036f]/g, "");
    } catch (error) {
    }
    return text.replace(/\u0111/g, "d").replace(/\u0110/g, "d");
}

function normalizeUrl(url) {
    if (!url) return HOME_URL;
    url = decodeHtml(url).trim();
    if (url.startsWith("//")) return "https:" + url;
    if (url.startsWith("/")) return stripTrailingSlash(BASE_URL) + url;
    if (!/^https?:\/\//i.test(url)) return stripTrailingSlash(BASE_URL) + "/" + url.replace(/^\/+/, "");
    return url;
}

function normalizeImage(url) {
    if (!url) return "";
    url = decodeHtml(url).trim();
    if (url.startsWith("//")) return "https:" + url;
    if (url.startsWith("/")) return stripTrailingSlash(BASE_URL) + url;
    return url;
}

function hostOf(url) {
    let match = /^https?:\/\/([^/?#]+)/i.exec(normalizeUrl(url));
    return match ? match[1].toLowerCase().replace(/^www\./, "") : "";
}

function sameHost(url) {
    return hostOf(url) === hostOf(BASE_URL);
}

function request(url, options) {
    options = options || {};
    let targetUrl = normalizeUrl(url);
    let headers = options.headers || {};
    headers["Accept"] = headers["Accept"] || "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8";
    headers["Accept-Language"] = headers["Accept-Language"] || "vi-VN,vi;q=0.9,en-US;q=0.8,en;q=0.7";
    headers["Referer"] = headers["Referer"] || HOME_URL;
    headers["User-Agent"] = headers["User-Agent"] || DESKTOP_UA;
    options.headers = headers;
    return fetch(targetUrl, options);
}

function isChallenge(doc) {
    if (!doc) return true;
    let html = doc.html ? doc.html() : "";
    let title = cleanText(doc.select("title").text());
    return title.indexOf("Just a moment") >= 0 ||
        html.indexOf("cf-chl") >= 0 ||
        html.indexOf("__cf_chl_") >= 0 ||
        html.indexOf("Enable JavaScript and cookies") >= 0;
}

function getDoc(url) {
    try {
        let response = request(url);
        if (!response.ok) return null;
        let doc = response.html();
        if (isChallenge(doc)) return null;
        return doc;
    } catch (error) {
        return null;
    }
}

function pathOf(url) {
    url = normalizeUrl(url);
    let match = /^https?:\/\/[^/]+(\/[^?#]*)?/i.exec(url);
    return match && match[1] ? match[1] : "/";
}

function isKnownPagePath(part) {
    part = (part || "").toLowerCase();
    return part === "" ||
        part === "search" ||
        part === "latest" ||
        part === "popular" ||
        part === "uncensored" ||
        part === "completed" ||
        part === "genre" ||
        part === "login" ||
        part === "register" ||
        part === "title-requests" ||
        part === "assets" ||
        part === "cdn-cgi" ||
        part === "api" ||
        part === "ajax_search.php";
}

function isChapterUrl(url) {
    let raw = cleanText(url).toLowerCase();
    if (raw.indexOf("javascript:") === 0 || raw.indexOf("mailto:") === 0 || raw.indexOf("tel:") === 0 || raw.indexOf("#") === 0) return false;
    if (!sameHost(url)) return false;
    let path = pathOf(url).replace(/\/+$/, "");
    return /^\/[^/]+\/chapter-[^/]+$/i.test(path);
}

function isStoryUrl(url) {
    let raw = cleanText(url).toLowerCase();
    if (raw.indexOf("javascript:") === 0 || raw.indexOf("mailto:") === 0 || raw.indexOf("tel:") === 0 || raw.indexOf("#") === 0) return false;
    if (!sameHost(url)) return false;
    let path = pathOf(url).replace(/\/+$/, "");
    let match = /^\/([^/.]+)$/i.exec(path);
    if (!match) return false;
    return !isKnownPagePath(match[1]);
}

function storyUrlFromAny(url) {
    url = normalizeUrl(url).replace(/[?#].*$/, "").replace(/\/+$/, "");
    if (isChapterUrl(url)) return url.replace(/\/chapter-[^/]+$/i, "");
    return url;
}

function storySlug(url) {
    let match = /^\/([^/?#]+)/i.exec(pathOf(storyUrlFromAny(url)));
    return match ? match[1] : "";
}

function chapterNumber(urlOrText) {
    let text = urlOrText || "";
    let match = /chapter[-\s]*(\d+(?:[.-]\d+)?)/i.exec(text);
    if (!match) match = /ch\.?\s*(\d+(?:[.-]\d+)?)/i.exec(text);
    if (!match) match = /(\d+(?:[.-]\d+)?)/.exec(text);
    return match ? parseFloat(match[1].replace("-", ".")) : 0;
}

function imageAttr(e) {
    if (!e) return "";
    let srcset = e.attr("data-srcset") || e.attr("srcset");
    if (srcset) return cleanText(srcset.split(",")[0].split(" ")[0]);
    return e.attr("data-original") || e.attr("data-src") || e.attr("data-lazy-src") || e.attr("src");
}

function validImage(url) {
    url = normalizeImage(url);
    if (!url || url.indexOf("data:image") === 0) return false;
    if (!/\.(jpg|jpeg|png|webp)(?:[?#].*)?$/i.test(url)) return false;
    let low = url.toLowerCase();
    return low.indexOf("/assets/") < 0 &&
        low.indexOf("favicon") < 0 &&
        low.indexOf("placeholder") < 0 &&
        low.indexOf("loading") < 0 &&
        low.indexOf("/icons/") < 0 &&
        low.indexOf("badge") < 0;
}

function imageFromElement(element) {
    let result = {url: "", alt: ""};
    if (!element) return result;
    let img = element.select("img[src], img[data-src], img[data-original], img[data-lazy-src], img[srcset], img[data-srcset]").first();
    if (!img) return result;
    let url = normalizeImage(imageAttr(img));
    if (!validImage(url)) return result;
    result.url = url;
    result.alt = cleanText(img.attr("alt") || img.attr("title"));
    return result;
}

function imageForStoryInDoc(doc, storyUrl, title) {
    let result = {url: "", alt: ""};
    if (!doc) return result;
    let target = storyUrlFromAny(storyUrl);
    let links = doc.select("a[href]");
    for (let i = 0; i < links.size(); i++) {
        let a = links.get(i);
        if (storyUrlFromAny(a.attr("href")) !== target) continue;
        result = imageFromElement(a);
        if (result.url) return result;
    }

    let foldedTitle = foldText(title || "");
    let images = doc.select("img[src], img[data-src], img[data-original], img[data-lazy-src]");
    for (let j = 0; j < images.size(); j++) {
        let img = images.get(j);
        let url = normalizeImage(imageAttr(img));
        if (!validImage(url)) continue;
        let alt = cleanText(img.attr("alt") || img.attr("title"));
        if (foldedTitle && foldText(alt) === foldedTitle) return {url: url, alt: alt};
    }
    return {url: "", alt: ""};
}

function cleanTitle(text) {
    text = cleanText(text || "");
    text = text.replace(/\s+Ch(?:apter|\.)?\s*\d+(?:[.,-]\d+)?.*$/i, "");
    text = text.replace(/\s+\d+\s+chap(?:ter)?s?.*$/i, "");
    return cleanText(text);
}

function titleLooksBad(text) {
    let folded = foldText(text || "");
    return !text ||
        text.length > 120 ||
        folded === "home" ||
        folded === "series" ||
        folded === "latest" ||
        folded === "popular" ||
        folded.indexOf("chapter ") === 0;
}

function titleFromSlug(slug) {
    let parts = (slug || "").split("-");
    for (let i = 0; i < parts.length; i++) {
        if (parts[i]) parts[i] = parts[i].charAt(0).toUpperCase() + parts[i].slice(1);
    }
    return parts.join(" ");
}

function metaContent(doc, selector) {
    let node = doc.select(selector).first();
    return node ? cleanText(node.attr("content")) : "";
}

function textOfFirst(element, selector) {
    if (!element) return "";
    let node = element.select(selector).first();
    return node ? cleanText(node.text()) : "";
}

function pageNumberFromUrl(url) {
    let match = /[?&]page=(\d+)/i.exec(url || "");
    return match ? parseInt(match[1]) : 1;
}

function addPageParam(url, page) {
    url = normalizeUrl(url || HOME_URL);
    if (!page || page === "1") return url;
    if (("" + page).indexOf("http") === 0 || ("" + page).indexOf("/") === 0) return normalizeUrl(page);
    if (/[?&]page=\d+/i.test(url)) return url.replace(/([?&]page=)\d+/i, "$1" + encodeURIComponent(page));
    return url + (url.indexOf("?") >= 0 ? "&" : "?") + "page=" + encodeURIComponent(page);
}

function listPageUrl(url, page) {
    return addPageParam(url || HOME_URL, page);
}

function samePath(left, right) {
    return pathOf(left).replace(/\/+$/, "") === pathOf(right).replace(/\/+$/, "");
}

function nextPage(doc, currentUrl) {
    let current = pageNumberFromUrl(currentUrl || "");
    let best = 0;
    let bestHref = "";
    let links = doc.select("nav.pagination a[href*='page='], a[href*='page=']");
    for (let i = 0; i < links.size(); i++) {
        let href = normalizeUrl(links.get(i).attr("href"));
        if (!samePath(href, currentUrl)) continue;
        let p = pageNumberFromUrl(href);
        if (p > current && (!best || p < best)) {
            best = p;
            bestHref = href;
        }
    }
    return bestHref;
}

function imageHeaders(referer) {
    return {
        "Referer": normalizeUrl(referer || HOME_URL),
        "User-Agent": DESKTOP_UA,
        "Accept": "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8"
    };
}

function execute() {
    return Response.success({baseUrl: BASE_URL, homeUrl: HOME_URL, ok: true});
}
