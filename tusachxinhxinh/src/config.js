let BASE_URL = "https://tusachxinhxinh12.online";
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
        .replace(/&gt;/g, ">")
        .replace(/&#8211;/g, "-")
        .replace(/&#8212;/g, "-")
        .replace(/&nbsp;/g, " ");
}

function stripTags(html) {
    if (!html) return "";
    return cleanText(decodeHtml(("" + html).replace(/<[^>]+>/g, " ")));
}

function foldText(text) {
    text = cleanText(decodeHtml(text)).toLowerCase();
    try {
        text = text.normalize("NFD").replace(/[\u0300-\u036f]/g, "");
    } catch (error) {
    }
    return text.replace(/\u0111/g, "d").replace(/\u0110/g, "d");
}

function absoluteUrl(url) {
    if (!url) return HOME_URL;
    url = decodeHtml(url).trim();
    if (/^(data|javascript|mailto|tel):/i.test(url)) return url;
    if (url.startsWith("//")) return "https:" + url;
    if (url.startsWith("/")) return stripTrailingSlash(BASE_URL) + url;
    if (!/^https?:\/\//i.test(url)) return stripTrailingSlash(BASE_URL) + "/" + url.replace(/^\/+/, "");
    return url;
}

function normalizeUrl(url) {
    url = absoluteUrl(url);
    return url.replace(/^https?:\/\/(?:www\.)?tusachxinhxinh\d+\.online/i, stripTrailingSlash(BASE_URL));
}

function normalizeImage(url) {
    if (!url) return "";
    url = absoluteUrl(url);
    return url.replace(/^https?:\/\/(?:www\.)?tusachxinhxinh\d+\.online/i, stripTrailingSlash(BASE_URL));
}

function hostBase(url) {
    let match = /^(https?:\/\/(?:www\.)?tusachxinhxinh\d+\.online)/i.exec(url || "");
    return match ? match[1].replace(/\/+$/, "") : "";
}

function sourceNumber() {
    let match = /tusachxinhxinh(\d+)\.online/i.exec(BASE_URL);
    return match ? parseInt(match[1]) : 12;
}

function setBaseUrl(baseUrl) {
    if (!baseUrl) return;
    BASE_URL = stripTrailingSlash(baseUrl);
    HOME_URL = BASE_URL + "/";
}

function candidateUrls(url) {
    let normalized = normalizeUrl(url);
    let urls = [normalized];
    if (!/^https?:\/\/(?:www\.)?tusachxinhxinh\d+\.online/i.test(normalized)) return urls;
    let start = sourceNumber();
    for (let i = start; i <= 99; i++) {
        let next = normalized.replace(/^https?:\/\/(?:www\.)?tusachxinhxinh\d+\.online/i, "https://tusachxinhxinh" + i + ".online");
        if (urls.indexOf(next) < 0) urls.push(next);
    }
    return urls;
}

function requestDirect(url, options) {
    options = options || {};
    let headers = options.headers || {};
    headers["Accept"] = headers["Accept"] || "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8";
    headers["Accept-Language"] = headers["Accept-Language"] || "vi-VN,vi;q=0.9,en-US;q=0.8,en;q=0.7";
    headers["Referer"] = headers["Referer"] || HOME_URL;
    headers["User-Agent"] = headers["User-Agent"] || DESKTOP_UA;
    options.headers = headers;
    return fetch(absoluteUrl(url), options);
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
            let response = requestDirect(urls[i]);
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
            let response = requestDirect(urls[i], options || {});
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

function isTusachUrl(url) {
    return /^https?:\/\/(?:www\.)?tusachxinhxinh\d+\.online/i.test(absoluteUrl(url));
}

function isStoryUrl(url) {
    let raw = cleanText(url).toLowerCase();
    if (raw.indexOf("javascript:") === 0 || raw.indexOf("mailto:") === 0 || raw.indexOf("tel:") === 0 || raw.indexOf("#") === 0) return false;
    if (!isTusachUrl(url)) return false;
    let path = pathOf(url).replace(/\/+$/, "");
    return /^\/truyen-tranh\/[^/]+$/i.test(path);
}

function isChapterUrl(url) {
    let raw = cleanText(url).toLowerCase();
    if (raw.indexOf("javascript:") === 0 || raw.indexOf("mailto:") === 0 || raw.indexOf("tel:") === 0 || raw.indexOf("#") === 0) return false;
    if (!isTusachUrl(url)) return false;
    let path = pathOf(url).replace(/\/+$/, "");
    if (/^\/(wp-|truyen-tranh\/|the-loai\/|nhom\/|danh-sach|tin-tuc|tieu-thuyet|vat-pham|chuyen-muc|wp-json)/i.test(path)) return false;
    return /^\/[^/?#]*(?:chap|chapter)-[^/?#]+$/i.test(path);
}

function storyUrlFromAny(url) {
    url = normalizeUrl(url).replace(/[?#].*$/, "").replace(/\/+$/, "");
    let path = pathOf(url).replace(/\/+$/, "");
    let match = /^\/truyen-tranh\/([^/]+)$/i.exec(path);
    if (match) return BASE_URL + "/truyen-tranh/" + match[1] + "/";
    match = /^\/([^/]*?)-(?:chap|chapter)-[^/]+$/i.exec(path);
    if (match && match[1]) return BASE_URL + "/truyen-tranh/" + match[1] + "/";
    return url;
}

function resolveStoryUrlFromDoc(doc) {
    if (!doc) return "";
    let link = doc.select("a#category-link[href*='/truyen-tranh/'], a#post-category-link[href*='/truyen-tranh/'], .post-credit .credit-title a[href*='/truyen-tranh/'], .breadcrumb a[href*='/truyen-tranh/']").first();
    return link ? storyUrlFromAny(link.attr("href")) : "";
}

function storySlug(url) {
    let match = /^\/truyen-tranh\/([^/?#]+)$/i.exec(pathOf(storyUrlFromAny(url)).replace(/\/+$/, ""));
    return match ? match[1] : "";
}

function chapterNumber(text) {
    text = foldText(text || "").replace(/_/g, "-");
    let match = /(?:chuong|chapter|chap|ch\.?)\s*-?\s*(nt)?\s*(\d+(?:[.-]\d+)?)/i.exec(text);
    if (!match) match = /\/[^/]*(?:chap|chapter)-[^/]*?(\d+(?:[.-]\d+)?)/i.exec(text);
    if (!match) match = /(\d+(?:[.-]\d+)?)/.exec(text);
    let value = match ? (match[2] || match[1]) : "";
    return value ? parseFloat(value.replace("-", ".")) : 0;
}

function imageAttr(e) {
    if (!e) return "";
    let src = e.attr("src");
    if (src && src.indexOf("data:image") !== 0) return cleanText(src);
    return e.attr("data-src") ||
        e.attr("data-lazy-src") ||
        e.attr("data-original") ||
        e.attr("data-thumb") ||
        e.attr("data-cfsrc") ||
        src ||
        "";
}

function validImage(url) {
    url = normalizeImage(url);
    if (!url || url.indexOf("data:image") === 0) return false;
    if (!/\.(jpg|jpeg|png|webp|gif)(?:[?#].*)?$/i.test(url)) return false;
    let low = url.toLowerCase();
    return low.indexOf("/favicon") < 0 &&
        low.indexOf("/logo") < 0 &&
        low.indexOf("apple-touch-icon") < 0 &&
        low.indexOf("thumbnail.svg") < 0 &&
        low.indexOf("default-avt") < 0 &&
        low.indexOf("avatar") < 0 &&
        low.indexOf("huong-dan-tat-ad") < 0 &&
        low.indexOf("/images/loading") < 0 &&
        low.indexOf("728-90") < 0 &&
        low.indexOf("500-x-60") < 0 &&
        low.indexOf("float_") < 0 &&
        low.indexOf("balloon_") < 0;
}

function imageFromElement(element) {
    let result = {url: "", alt: ""};
    if (!element) return result;
    let img = element.select("img[src], img[data-src], img[data-original], img[data-lazy-src], img[data-thumb]").first();
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
    let links = doc.select("a[href*='/truyen-tranh/']");
    for (let i = 0; i < links.size(); i++) {
        let a = links.get(i);
        if (!isStoryUrl(a.attr("href"))) continue;
        if (storyUrlFromAny(a.attr("href")) !== target) continue;
        result = imageFromElement(a.parent ? a.parent() : a);
        if (!result.url) result = imageFromElement(a);
        if (result.url) return result;
    }

    let foldedTitle = foldText(title || "");
    let images = doc.select("img[src], img[data-src], img[data-original], img[data-lazy-src], img[data-thumb]");
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
    text = cleanText(decodeHtml(text || ""));
    text = text.replace(/^Truyen tranh\s+/i, "");
    text = text.replace(/^Truyen Tranh\s+/i, "");
    text = text.replace(/\s+(?:Chapter|Chap|Chuong|Ch\.?)\s*\w+(?:[.,-]\d+)?.*$/i, "");
    text = text.replace(/\s+[-–]\s+Tu Sach Xinh Xinh.*$/i, "");
    return cleanText(text);
}

function titleLooksBad(text) {
    let folded = foldText(text || "");
    return !text ||
        text.length > 160 ||
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

function slugifyTitle(text) {
    text = foldText(stripTags(text || ""));
    text = text.replace(/[^a-z0-9]+/g, "-").replace(/^-+|-+$/g, "").replace(/-+/g, "-");
    return text;
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
    let match = /\/page\/(\d+)\/?(?:[?#].*)?$/i.exec(pathOf(url || ""));
    if (match) return parseInt(match[1]);
    match = /[?&]page=(\d+)/i.exec(url || "");
    return match ? parseInt(match[1]) : 1;
}

function addPageParam(url, page) {
    url = normalizeUrl(url || HOME_URL);
    if (!page || page === "1" || page === 1) return url;
    if (("" + page).indexOf("http") === 0 || ("" + page).indexOf("/") === 0) return normalizeUrl(page);
    if (/\/page\/\d+\/?(?:[?#].*)?$/i.test(url)) return url.replace(/\/page\/\d+\/?/i, "/page/" + encodeURIComponent(page) + "/");
    let clean = url.replace(/[?#].*$/, "").replace(/\/+$/, "");
    return clean + "/page/" + encodeURIComponent(page) + "/";
}

function listPageUrl(url, page) {
    return addPageParam(url || (BASE_URL + "/danh-sach-truyen/"), page);
}

function nextPage(doc, currentUrl) {
    let current = pageNumberFromUrl(currentUrl || "");
    let links = doc.select("li.next a[href], a.next[href], .pagination a[href], .wp-pagenavi a[href]");
    for (let i = 0; i < links.size(); i++) {
        let a = links.get(i);
        let href = normalizeUrl(a.attr("href"));
        let cls = foldText(a.attr("class") + " " + (a.parent ? a.parent().attr("class") : ""));
        let text = foldText(a.text());
        if (href && cls.indexOf("disabled") < 0 && (cls.indexOf("next") >= 0 || text.indexOf("sau") >= 0 || text === "next")) return href;
    }

    let options = doc.select("select option[value]");
    for (let j = 0; j < options.size(); j++) {
        let option = options.get(j);
        let href = option.attr("value");
        let p = pageNumberFromUrl(href);
        if (p === current + 1) return normalizeUrl(href);
    }
    return "";
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
