let BASE_URL = "https://otakusic.com";
try {
    if (CONFIG_URL) BASE_URL = CONFIG_URL.replace(/\/+$/, "");
} catch (error) {
}

let API_URL = BASE_URL + "/api/v1";
let DESKTOP_UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36";

try {
    load("cookie.js");
} catch (error) {
}

function cleanText(text) {
    if (!text) return "";
    return ("" + text).replace(/\s+/g, " ").trim();
}

function foldText(text) {
    text = cleanText(text).toLowerCase();
    try {
        text = text.normalize("NFD").replace(/[\u0300-\u036f]/g, "");
    } catch (error) {
    }
    return text.replace(/\u0111/g, "d").replace(/\u0110/g, "d");
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

function stripTrailingSlash(url) {
    if (!url) return "";
    return ("" + url).replace(/\/+$/, "");
}

function cookieHeader() {
    try {
        if (COOKIE_HEADER) return COOKIE_HEADER;
    } catch (error) {
    }
    return "";
}

function normalizeUrl(url) {
    if (!url) return "";
    url = decodeHtml(url).trim();
    if (url.startsWith("//")) return "https:" + url;
    if (url.startsWith("/")) return stripTrailingSlash(BASE_URL) + url;
    if (!/^https?:\/\//i.test(url)) return stripTrailingSlash(BASE_URL) + "/" + url.replace(/^\/+/, "");
    return url.replace(/^https?:\/\/(?:www\.)?otakusic\.com/i, BASE_URL);
}

function normalizeImage(url) {
    if (!url) return "";
    url = decodeHtml(url).trim();
    if (url.startsWith("//")) return "https:" + url;
    if (url.startsWith("/")) return stripTrailingSlash(BASE_URL) + url;
    return url;
}

function pathOf(url) {
    url = normalizeUrl(url);
    let match = /^https?:\/\/[^/]+(\/[^?#]*)?/i.exec(url);
    return match && match[1] ? match[1] : "/";
}

function slugFromUrl(url) {
    let path = pathOf(url).replace(/\/+$/, "");
    let match = /\/chi-tiet\/([^/?#]+)/i.exec(path);
    if (match) return match[1];
    match = /\/doc-truyen\/([^/?#]+)\/[^/?#]+/i.exec(path);
    if (match) return match[1];
    return "";
}

function chapterSlugFromUrl(url) {
    let path = pathOf(url).replace(/\/+$/, "");
    let match = /\/doc-truyen\/[^/?#]+\/([^/?#]+)/i.exec(path);
    let slug = match ? match[1] : "";
    if (/^\d+(?:\.\d+)?$/i.test(slug)) return "chuong-" + slug;
    return slug;
}

function storyUrl(slug) {
    return BASE_URL + "/chi-tiet/" + slug;
}

function storyUrlFromAny(url) {
    let slug = slugFromUrl(url);
    return slug ? storyUrl(slug) : normalizeUrl(url);
}

function chapterUrl(mangaSlug, chapterSlug) {
    return BASE_URL + "/doc-truyen/" + mangaSlug + "/" + chapterSlug;
}

function requestHeaders(extra) {
    let headers = {
        "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
        "Accept-Language": "vi-VN,vi;q=0.9,en-US;q=0.8",
        "Referer": BASE_URL + "/",
        "User-Agent": DESKTOP_UA
    };
    let cookie = cookieHeader();
    if (cookie) headers["Cookie"] = cookie;
    if (extra) {
        for (let key in extra) headers[key] = extra[key];
    }
    return headers;
}

function request(url, options) {
    options = options || {};
    options.headers = requestHeaders(options.headers || {});
    return fetch(normalizeUrl(url), options);
}

function requestJson(url, referer) {
    return fetch(normalizeUrl(url), {
        headers: requestHeaders({
            "Accept": "application/json",
            "Referer": referer || BASE_URL + "/",
            "X-Requested-With": "XMLHttpRequest"
        })
    });
}

function getDoc(url) {
    let response = request(url);
    if (response.ok) return response.html();
    return null;
}

function addPageParam(url, page) {
    url = normalizeUrl(url || BASE_URL + "/tim-kiem");
    if (!page || page === "1") return url;
    if (("" + page).indexOf("http") === 0 || ("" + page).indexOf("/") === 0) return normalizeUrl(page);
    if (/[?&]page=\d+/i.test(url)) return url.replace(/([?&]page=)\d+/i, "$1" + page);
    return url + (url.indexOf("?") >= 0 ? "&" : "?") + "page=" + encodeURIComponent(page);
}

function pageNumber(url) {
    let match = /[?&]page=(\d+)/i.exec(url || "");
    return match ? parseInt(match[1]) : 1;
}

function nextPage(doc, currentUrl) {
    let current = pageNumber(currentUrl);
    let links = doc.select("a[href*='page=']");
    let best = 0;
    let bestHref = "";
    for (let i = 0; i < links.size(); i++) {
        let href = normalizeUrl(links.get(i).attr("href"));
        let p = pageNumber(href);
        if (p > current && (!best || p < best)) {
            best = p;
            bestHref = href;
        }
    }
    return bestHref;
}

function imageHeaders(referer) {
    return {
        "Referer": normalizeUrl(referer || BASE_URL + "/"),
        "User-Agent": DESKTOP_UA
    };
}

function firstText(node, selectors) {
    for (let i = 0; i < selectors.length; i++) {
        let item = node.select(selectors[i]).first();
        let text = item ? cleanText(item.text()) : "";
        if (text) return text;
    }
    return "";
}

function firstHtml(node, selectors) {
    for (let i = 0; i < selectors.length; i++) {
        let item = node.select(selectors[i]).first();
        if (item && cleanText(item.text())) return item.html();
    }
    return "";
}

function execute() {
    return Response.success({baseUrl: BASE_URL, ok: true});
}
