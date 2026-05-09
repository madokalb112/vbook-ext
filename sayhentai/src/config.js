let BASE_URL = 'https://sayhentai.sh';
try {
    if (CONFIG_URL) {
        BASE_URL = CONFIG_URL;
    }
} catch (error) {
}

function normalizeUrl(url) {
    if (!url) return url;
    if (url.startsWith("//")) return "https:" + url;
    if (url.startsWith("/")) return BASE_URL + url;
    return url.replace(/^(?:https?:\/\/)?(?:[^@\n]+@)?(?:www\.)?([^:\/\n?]+)/img, BASE_URL);
}

function normalizeImage(url) {
    if (!url) return "";
    url = url.replace(/&amp;/g, "&");
    if (url.startsWith("//")) return "https:" + url;
    if (url.startsWith("/")) return BASE_URL + url;
    return url;
}

function cleanText(text) {
    if (!text) return "";
    return text.replace(/\s+/g, " ").trim();
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

function appendPage(url, page) {
    if (!page) return normalizeUrl(url);
    if (page.indexOf("http") === 0) return normalizeUrl(page);
    let requestUrl = normalizeUrl(url);
    return requestUrl + (requestUrl.indexOf("?") >= 0 ? "&" : "?") + "page=" + page;
}

function nextPage(doc) {
    let node = doc.select("link[rel=next], a[rel=next], .pagination a[rel=next], .wp-pagenavi a.nextpostslink, a.next.page-numbers").first();
    let href = node ? node.attr("href") : "";
    return href ? normalizeUrl(href) : "";
}
