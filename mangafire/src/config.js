let BASE_URL = "https://mangafire.to";
try {
    if (CONFIG_URL) BASE_URL = CONFIG_URL.replace(/\/+$/, "");
} catch (error) {
}

let HOME_URL = BASE_URL + "/home";
let DESKTOP_UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36";
let MOBILE_UA = "Mozilla/5.0 (Linux; Android 12; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0 Mobile Safari/537.36";

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

function normalizeUrl(url) {
    if (!url) return "";
    url = decodeHtml(url).trim();
    if (url.startsWith("//")) return "https:" + url;
    if (url.startsWith("/")) return BASE_URL + url;
    if (!/^https?:\/\//i.test(url)) return BASE_URL + "/" + url.replace(/^\/+/, "");
    return url.replace(/^https?:\/\/(?:www\.)?mangafire\.to/i, BASE_URL);
}

function normalizeImage(url) {
    if (!url) return "";
    url = decodeHtml(url).trim();
    if (url.startsWith("//")) return "https:" + url;
    if (url.startsWith("/")) return BASE_URL + url;
    return url;
}

function normalizeUrlList(urls) {
    let data = [];
    if (!urls) return data;
    if (typeof urls === "string") return urls.split(/\s+/);
    try {
        for (let i = 0; i < urls.length; i++) data.push("" + urls[i]);
        return data;
    } catch (error) {
    }
    try {
        let size = urls.size();
        for (let i = 0; i < size; i++) data.push("" + urls.get(i));
    } catch (error) {
    }
    return data;
}

function request(url, options) {
    options = options || {};
    let headers = options.headers || {};
    headers["Accept"] = headers["Accept"] || "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8";
    headers["Accept-Language"] = headers["Accept-Language"] || "en-US,en;q=0.9";
    headers["Referer"] = headers["Referer"] || HOME_URL;
    headers["User-Agent"] = headers["User-Agent"] || DESKTOP_UA;
    options.headers = headers;
    return fetch(normalizeUrl(url), options);
}

function requestJson(url, referer) {
    return fetch(normalizeUrl(url), {
        headers: {
            "Accept": "application/json, text/javascript, */*; q=0.01",
            "Accept-Language": "en-US,en;q=0.9",
            "Referer": referer || HOME_URL,
            "User-Agent": DESKTOP_UA,
            "X-Requested-With": "XMLHttpRequest"
        }
    });
}

function getDoc(url) {
    let response = request(url);
    if (response.ok) return response.html();
    return null;
}

function htmlFragment(html) {
    return Html.parse("<div>" + (html || "") + "</div>");
}

function pathOf(url) {
    url = normalizeUrl(url);
    let match = /^https?:\/\/[^/]+(\/[^?#]*)?/i.exec(url);
    return match && match[1] ? match[1] : "/";
}

function isStoryUrl(url) {
    return /^\/manga\/[^/]+\.[^/.?#]+\/?$/i.test(pathOf(url).replace(/\/+$/, ""));
}

function isChapterUrl(url) {
    return /^\/read\/[^/]+\.[^/]+\/[^/]+\/(chapter|volume)-[^/]+\/?$/i.test(pathOf(url).replace(/\/+$/, ""));
}

function storyUrlFromAny(url) {
    url = normalizeUrl(url);
    return url.replace(/\/read\/([^/]+)\/[^/]+\/(?:chapter|volume)-[^/?#]+\/?(?:[?#].*)?$/i, "/manga/$1");
}

function mangaSlug(url) {
    let match = /\/manga\/([^/?#]+)/i.exec(normalizeUrl(storyUrlFromAny(url)));
    if (match) return match[1];
    match = /\/read\/([^/]+)/i.exec(normalizeUrl(url));
    return match ? match[1] : "";
}

function mangaId(url) {
    let slug = mangaSlug(url);
    let match = /\.([^/.?#]+)$/.exec(slug);
    return match ? match[1] : slug;
}

function imageAttr(e) {
    if (!e) return "";
    let srcset = e.attr("data-srcset") || e.attr("srcset");
    if (srcset) return cleanText(srcset.split(",")[0].split(" ")[0]);
    return e.attr("data-original") || e.attr("data-src") || e.attr("data-lazy-src") || e.attr("data-cfsrc") || e.attr("src");
}

function imageFromNode(e) {
    return normalizeImage(imageAttr(e));
}

function metaContent(doc, selector) {
    let node = doc.select(selector).first();
    return node ? cleanText(node.attr("content")) : "";
}

function metaImage(doc) {
    return normalizeImage(metaContent(doc, "meta[property=og:image], meta[property='og:image:secure_url'], meta[name=twitter:image], meta[itemprop=image]"));
}

function firstText(node, selectors) {
    for (let i = 0; i < selectors.length; i++) {
        let e = node.select(selectors[i]).first();
        let text = e ? cleanText(e.text()) : "";
        if (text) return text;
    }
    return "";
}

function firstHtml(node, selectors) {
    for (let i = 0; i < selectors.length; i++) {
        let e = node.select(selectors[i]).first();
        if (e && cleanText(e.text())) return e.html();
    }
    return "";
}

function pageNumberFromUrl(url) {
    let match = /[?&]page=(\d+)/i.exec(url || "");
    return match ? parseInt(match[1]) : 1;
}

function addPageParam(url, page) {
    url = normalizeUrl(url || HOME_URL);
    if (!page || page === "1") return url;
    if (("" + page).indexOf("http") === 0 || ("" + page).indexOf("/") === 0) return normalizeUrl(page);
    if (/[?&]page=\d+/i.test(url)) return url.replace(/([?&]page=)\d+/i, "$1" + page);
    return url + (url.indexOf("?") >= 0 ? "&" : "?") + "page=" + encodeURIComponent(page);
}

function listPageUrl(url, page) {
    return addPageParam(url || HOME_URL, page);
}

function nextPage(doc, currentUrl) {
    let rel = doc.select(".pagination a[rel=next][href], a[rel=next][href]").first();
    if (rel) return normalizeUrl(rel.attr("href"));
    let current = pageNumberFromUrl(currentUrl || "");
    let best = 0;
    let bestHref = "";
    let links = doc.select(".pagination a[href*='page='], a.page-link[href*='page=']");
    for (let i = 0; i < links.size(); i++) {
        let href = links.get(i).attr("href");
        let p = pageNumberFromUrl(href);
        if (p > current && (!best || p < best)) {
            best = p;
            bestHref = href;
        }
    }
    return bestHref ? normalizeUrl(bestHref) : "";
}

function imageHeaders(referer) {
    return {"Referer": normalizeUrl(referer || HOME_URL), "User-Agent": DESKTOP_UA};
}

function execute() {
    return Response.success({baseUrl: BASE_URL, homeUrl: HOME_URL, ok: true});
}
