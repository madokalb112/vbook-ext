let BASE_URL = 'https://yurineko.org';
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
    if (url.startsWith("//")) return "https:" + url;
    if (url.startsWith("/")) return BASE_URL + url;
    return url;
}

function request(url) {
    return fetch(normalizeUrl(url), {
        headers: {
            "Referer": BASE_URL + "/",
            "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36"
        }
    });
}

function nextPage(doc) {
    let node = doc.select("ul.pagination li.next:not(.disabled) a, ul.pager li.next:not(.disabled) a, li.next:not(.disabled) a").first();
    let href = node ? node.attr("href") : "";
    return href ? normalizeUrl(href) : "";
}
