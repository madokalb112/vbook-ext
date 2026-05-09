let BASE_URL = 'https://truyenyy.co';
try {
    if (CONFIG_URL) BASE_URL = CONFIG_URL;
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

function stripTrailingSlash(url) {
    if (!url) return url;
    return ("" + url).replace(/\/+$/, "");
}

function normalizeUrl(url) {
    if (!url) return "";
    url = ("" + url).replace(/&amp;/g, "&").trim();
    if (url.startsWith("//")) return "https:" + url;
    if (url.startsWith("/")) return stripTrailingSlash(BASE_URL) + url;
    if (!/^https?:\/\//i.test(url)) return stripTrailingSlash(BASE_URL) + "/" + url.replace(/^\/+/, "");
    return url.replace(/^http:\/\/truyenyy\.co/i, BASE_URL);
}

function normalizeImage(url) {
    if (!url) return "";
    url = ("" + url).replace(/&amp;/g, "&").trim();
    if (url.startsWith("//")) return "https:" + url;
    if (url.startsWith("/")) return stripTrailingSlash(BASE_URL) + url;
    return url;
}

function request(url) {
    return fetch(normalizeUrl(url), {
        headers: {
            "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
            "Accept-Language": "vi-VN,vi;q=0.9,en-US;q=0.8,en;q=0.7",
            "Referer": BASE_URL + "/",
            "User-Agent": "Mozilla/5.0 (Linux; Android 12; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0 Mobile Safari/537.36"
        }
    });
}

function getDoc(url) {
    try {
        let response = request(url);
        if (response.ok) return response.html();
    } catch (error) {
    }
    return null;
}

function pathOf(url) {
    url = normalizeUrl(url);
    let match = /^https?:\/\/[^/]+(\/[^?#]*)?/i.exec(url);
    return match && match[1] ? match[1] : "/";
}

function isStoryUrl(url) {
    let path = pathOf(url).replace(/\/+$/, "");
    return /^\/truyen\/[^/]+$/i.test(path);
}

function isChapterUrl(url) {
    let path = pathOf(url).replace(/\/+$/, "");
    return /^\/truyen\/[^/]+\/chuong-[^/]+$/i.test(path);
}

function isTocUrl(url) {
    let path = pathOf(url).replace(/\/+$/, "");
    return /^\/truyen\/[^/]+\/danh-sach-chuong$/i.test(path);
}

function storyUrlFromAny(url) {
    url = normalizeUrl(url);
    let match = /^(https?:\/\/[^/]+\/truyen\/[^/?#\/]+)/i.exec(url);
    return match ? match[1] : url;
}

function imageAttr(e) {
    if (!e) return "";
    let srcset = e.attr("data-srcset") || e.attr("srcset");
    if (srcset) return cleanText(srcset.split(",")[0].split(" ")[0]);
    return e.attr("data-original") || e.attr("data-src") || e.attr("data-lazy-src") || e.attr("src");
}

function imageFromNode(e) {
    return normalizeImage(imageAttr(e));
}

function metaContent(doc, selector) {
    let node = doc.select(selector).first();
    return node ? cleanText(node.attr("content")) : "";
}

function metaImage(doc) {
    return normalizeImage(metaContent(doc, "meta[property=og:image], meta[name=twitter:image]"));
}

function firstText(node, selectors) {
    for (let i = 0; i < selectors.length; i++) {
        let e = node.select(selectors[i]).first();
        let text = e ? cleanText(e.text()) : "";
        if (text) return text;
    }
    return "";
}

function absoluteSearchUrl(key, page) {
    let url = BASE_URL + "/tim-kiem/nang-cao?q=" + encodeURIComponent(key || "");
    if (page && page !== "1") url += "&p=" + encodeURIComponent(page);
    return url;
}

function listPageUrl(url, page) {
    if (!url) url = "/truyen-moi-cap-nhat";
    url = normalizeUrl(url);
    if (!page || page === "1") return url;
    let sep = url.indexOf("?") >= 0 ? "&" : "?";
    return url + sep + "p=" + encodeURIComponent(page);
}

function parseTotalPages(html) {
    html = html || "";
    let m = /\\"meta\\":\{\\"page\\":\d+,\\"size\\":\d+,\\"totalPages\\":(\d+)/.exec(html);
    if (m) return parseInt(m[1]);
    m = /"meta":\{"page":\d+,"size":\d+,"totalPages":(\d+)/.exec(html);
    if (m) return parseInt(m[1]);
    m = /\\"totalPages\\":(\d+)/.exec(html);
    if (m) return parseInt(m[1]);
    m = /"totalPages":(\d+)/.exec(html);
    return m ? parseInt(m[1]) : 1;
}

function nextPageFromHtml(doc, page) {
    let current = parseInt(page || "1");
    let total = parseTotalPages(doc.html ? doc.html() : "");
    if (total && current < total) return "" + (current + 1);
    return "";
}

function chapterNumber(text) {
    let m = /chuong[-\s]*(\d+(?:[-.]\d+)?)/i.exec(foldText(text || ""));
    if (!m) m = /(\d+(?:[-.]\d+)?)/.exec(text || "");
    return m ? parseFloat(m[1].replace("-", ".")) : 0;
}

function execute() {
    return Response.success({ baseUrl: BASE_URL, ok: true });
}
