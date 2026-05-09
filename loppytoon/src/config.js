let BASE_URL = 'https://loppytoon.com';
try {
    if (CONFIG_URL) {
        BASE_URL = CONFIG_URL;
    }
} catch (error) {
}

function cleanText(text) {
    if (!text) return "";
    return ("" + text).replace(/\s+/g, " ").trim();
}

function normalizeUrl(url) {
    if (!url) return url;
    if (url.startsWith("//")) return "https:" + url;
    if (url.startsWith("/")) return BASE_URL + url;
    return url.replace(/^(?:https?:\/\/)?(?:[^@\n]+@)?(?:www\.)?([^:\/\n?]+)/img, BASE_URL);
}

function normalizeImage(url) {
    if (!url) return "";
    url = ("" + url).replace(/&amp;/g, "&");
    if (url.startsWith("//")) return "https:" + url;
    if (url.startsWith("/")) return BASE_URL + url;
    if (url.indexOf("story_avatars/") === 0 || url.indexOf("chapter_") === 0) return BASE_URL + "/storage/" + url;
    return url;
}

function request(url) {
    return fetch(normalizeUrl(url), {
        headers: {
            "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
            "Referer": BASE_URL + "/",
            "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36"
        }
    });
}

function requestJson(url) {
    return fetch(normalizeUrl(url), {
        headers: {
            "Accept": "application/json, text/plain, */*",
            "Referer": BASE_URL + "/",
            "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36"
        }
    });
}

function appendPage(url, page) {
    if (!page) return normalizeUrl(url);
    if (page.indexOf("http") === 0) return normalizeUrl(page);
    let requestUrl = normalizeUrl(url);
    return requestUrl + (requestUrl.indexOf("?") >= 0 ? "&" : "?") + "page=" + page;
}

function nextPage(doc) {
    let node = doc.select(".pagination i.fa-chevron-right[onclick], .pagination a[rel=next], .pagination a.next").first();
    let href = "";
    if (node) {
        href = node.attr("href");
        let onclick = node.attr("onclick");
        if (!href && onclick) {
            let match = /window\.location=['"]([^'"]+)['"]/.exec(onclick);
            if (match) href = match[1];
        }
    }
    return href ? normalizeUrl(href) : "";
}

function execute() {
    return Response.success({
        baseUrl: BASE_URL,
        ok: true
    });
}
