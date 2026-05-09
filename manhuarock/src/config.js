let BASE_URL = "https://manhuarock4.site";
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
    return url.replace(/^https?:\/\/(?:www\.)?manhuarock\d+\.site/i, stripTrailingSlash(BASE_URL));
}

function normalizeImage(url) {
    if (!url) return "";
    url = decodeHtml(url).trim();
    if (url.startsWith("//")) return "https:" + url;
    if (url.startsWith("/")) return stripTrailingSlash(BASE_URL) + url;
    return url;
}

function hostBase(url) {
    let match = /^(https?:\/\/(?:www\.)?manhuarock\d+\.site)/i.exec(url || "");
    return match ? match[1].replace(/\/+$/, "") : "";
}

function setBaseUrl(baseUrl) {
    if (!baseUrl) return;
    BASE_URL = stripTrailingSlash(baseUrl);
    HOME_URL = BASE_URL + "/";
}

function candidateUrls(url) {
    let normalized = normalizeUrl(url);
    let urls = [normalized];
    if (!/^https?:\/\/(?:www\.)?manhuarock\d+\.site/i.test(normalized)) return urls;
    for (let i = 4; i <= 99; i++) {
        let next = normalized.replace(/^https?:\/\/(?:www\.)?manhuarock\d+\.site/i, "https://manhuarock" + i + ".site");
        if (urls.indexOf(next) < 0) urls.push(next);
    }
    return urls;
}

function request(url, options) {
    options = options || {};
    let headers = options.headers || {};
    headers["Accept"] = headers["Accept"] || "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8";
    headers["Accept-Language"] = headers["Accept-Language"] || "vi-VN,vi;q=0.9,en-US;q=0.8,en;q=0.7";
    headers["Referer"] = headers["Referer"] || HOME_URL;
    headers["User-Agent"] = headers["User-Agent"] || DESKTOP_UA;
    options.headers = headers;
    return fetch(normalizeUrl(url), options);
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
    let urls = candidateUrls(url);
    for (let i = 0; i < urls.length; i++) {
        try {
            let response = request(urls[i]);
            if (!response.ok) continue;
            let doc = response.html();
            if (isChallenge(doc)) continue;
            let host = hostBase(urls[i]);
            if (host) setBaseUrl(host);
            return doc;
        } catch (error) {
        }
    }
    return null;
}

function getText(url, options) {
    let urls = candidateUrls(url);
    for (let i = 0; i < urls.length; i++) {
        try {
            let response = request(urls[i], options || {});
            if (!response.ok) continue;
            let host = hostBase(urls[i]);
            if (host) setBaseUrl(host);
            return response.text();
        } catch (error) {
        }
    }
    return "";
}

function pathOf(url) {
    url = normalizeUrl(url);
    let match = /^https?:\/\/[^/]+(\/[^?#]*)?/i.exec(url);
    return match && match[1] ? match[1] : "/";
}

function isManhuaRockUrl(url) {
    return /^https?:\/\/(?:www\.)?manhuarock\d+\.site/i.test(normalizeUrl(url));
}

function isStoryUrl(url) {
    let raw = cleanText(url).toLowerCase();
    if (raw.indexOf("javascript:") === 0 || raw.indexOf("mailto:") === 0 || raw.indexOf("tel:") === 0 || raw.indexOf("#") === 0) return false;
    if (!isManhuaRockUrl(url)) return false;
    let path = pathOf(url).replace(/\/+$/, "");
    return /^\/truyen-tranh\/[^/]+(?:\.html)?$/i.test(path);
}

function isChapterUrl(url) {
    let raw = cleanText(url).toLowerCase();
    if (raw.indexOf("javascript:") === 0 || raw.indexOf("mailto:") === 0 || raw.indexOf("tel:") === 0 || raw.indexOf("#") === 0) return false;
    if (!isManhuaRockUrl(url)) return false;
    let path = pathOf(url).replace(/\/+$/, "");
    return /^\/truyen-tranh\/[^/]+\/(?:chap|chapter)-[^/]+(?:\.html)?$/i.test(path);
}

function storyUrlFromAny(url) {
    url = normalizeUrl(url).replace(/[?#].*$/, "").replace(/\/+$/, "");
    let path = pathOf(url).replace(/\/+$/, "");
    let match = /^\/truyen-tranh\/([^/]+)\/(?:chap|chapter)-[^/]+(?:\.html)?$/i.exec(path);
    if (match) return BASE_URL + "/truyen-tranh/" + match[1] + ".html";
    match = /^\/truyen-tranh\/([^/]+?)(?:\.html)?$/i.exec(path);
    if (match) return BASE_URL + "/truyen-tranh/" + match[1].replace(/\.html$/i, "") + ".html";
    return url;
}

function storySlug(url) {
    let match = /^\/truyen-tranh\/([^/?#]+?)(?:\.html)?$/i.exec(pathOf(storyUrlFromAny(url)).replace(/\/+$/, ""));
    return match ? match[1].replace(/\.html$/i, "") : "";
}

function chapterNumber(text) {
    text = foldText(text || "").replace(/_/g, "-");
    let match = /(?:chuong|chapter|chap|ch\.?)\s*-?\s*(\d+(?:[.-]\d+)?)/i.exec(text);
    if (!match) match = /\/(?:chap|chapter)-(\d+(?:[.-]\d+)?)/i.exec(text);
    if (!match) match = /(\d+(?:[.-]\d+)?)/.exec(text);
    return match ? parseFloat(match[1].replace("-", ".")) : 0;
}

function imageAttr(e) {
    if (!e) return "";
    let srcset = e.attr("data-srcset") || e.attr("srcset");
    if (srcset) return cleanText(srcset.split(",")[0].split(" ")[0]);
    return e.attr("data-original") || e.attr("data-src") || e.attr("data-lazy-src") || e.attr("data-cfsrc") || e.attr("src");
}

function validImage(url) {
    url = normalizeImage(url);
    if (!url || url.indexOf("data:image") === 0) return false;
    if (!/\.(jpg|jpeg|png|webp)(?:[?#].*)?$/i.test(url)) return false;
    let low = url.toLowerCase();
    return low.indexOf("/favicon") < 0 &&
        low.indexOf("/logo") < 0 &&
        low.indexOf("2ten-min") < 0 &&
        low.indexOf("search-loading") < 0 &&
        low.indexOf("no-avatar") < 0 &&
        low.indexOf("avatar") < 0 &&
        low.indexOf("credit-web") < 0 &&
        low.indexOf("km_x2") < 0 &&
        low.indexOf("promotion") < 0 &&
        low.indexOf("apple-touch-icon") < 0;
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
        if (!isStoryUrl(a.attr("href"))) continue;
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
        if (foldedTitle && foldText(alt).indexOf(foldedTitle) >= 0) return {url: url, alt: alt};
    }
    return {url: "", alt: ""};
}

function cleanTitle(text) {
    text = cleanText(text || "");
    text = text.replace(/^Truy.n tranh\s+/i, "");
    text = text.replace(/^.*?truy.n tranh\s+/i, "");
    text = text.replace(/\s+(?:Chapter|Chap|Chuong|Ch\.?)\s*\d+(?:[.,-]\d+)?.*$/i, "");
    text = text.replace(/\s+-\s*Manhuarock.*$/i, "");
    return cleanText(text);
}

function titleLooksBad(text) {
    let folded = foldText(text || "");
    return !text ||
        text.length > 140 ||
        folded === "trang chu" ||
        folded === "danh sach truyen" ||
        folded === "the loai" ||
        folded.indexOf("doc tu dau") >= 0 ||
        folded.indexOf("doc moi nhat") >= 0 ||
        folded.indexOf("chapter ") === 0;
}

function titleFromSlug(slug) {
    let parts = (slug || "").replace(/\.html$/i, "").split("-");
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
    if (match) return parseInt(match[1]);
    match = /\/(\d+)\/?(?:[?#].*)?$/i.exec(pathOf(url || ""));
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

function nextPage(doc, currentUrl) {
    let current = pageNumberFromUrl(currentUrl || "");
    let best = 0;
    let bestHref = "";
    let links = doc.select(".pagination a[href], a[data-page][href]");
    for (let i = 0; i < links.size(); i++) {
        let a = links.get(i);
        let href = normalizeUrl(a.attr("href"));
        let cls = foldText(a.attr("class"));
        let text = foldText(a.text());
        let p = parseInt(a.attr("data-page") || pageNumberFromUrl(href));
        if ((cls.indexOf("next") >= 0 || text === "»" || text === "next") && href) return href;
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

function ajaxHeaders(referer) {
    return {
        "Accept": "application/json, text/javascript, */*; q=0.01",
        "Referer": normalizeUrl(referer || HOME_URL),
        "User-Agent": DESKTOP_UA,
        "X-Requested-With": "XMLHttpRequest"
    };
}

function execute() {
    return Response.success({baseUrl: BASE_URL, homeUrl: HOME_URL, ok: true});
}
