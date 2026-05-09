let BASE_URL = 'https://mimimoe.moe';
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
    return url;
}

function apiUrl(path) {
    if (!path) return BASE_URL + "/api/manga?limit=24&cursor_res=true";
    if (path.indexOf("http") === 0) return normalizeUrl(path);
    if (path.indexOf("/") !== 0) path = "/" + path;
    return BASE_URL + path;
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
    return fetch(apiUrl(url), {
        headers: {
            "Accept": "application/json, text/plain, */*",
            "Referer": BASE_URL + "/",
            "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36"
        }
    });
}

function addQuery(url, key, value) {
    if (value === null || value === undefined || value === "") return url;
    let hash = "";
    let hashIndex = url.indexOf("#");
    if (hashIndex >= 0) {
        hash = url.substring(hashIndex);
        url = url.substring(0, hashIndex);
    }

    let parts = url.split("?");
    let base = parts[0];
    let query = parts.length > 1 ? parts[1].split("&") : [];
    let found = false;
    for (let i = 0; i < query.length; i++) {
        if (query[i].split("=")[0] === key) {
            query[i] = key + "=" + encodeURIComponent(value);
            found = true;
        }
    }
    if (!found) {
        query.push(key + "=" + encodeURIComponent(value));
    }

    return base + "?" + query.join("&") + hash;
}

function nextCursorUrl(url, json) {
    if (!json || !json.next_cursor) return "";
    url = addQuery(apiUrl(url), "cursor_res", "true");
    return addQuery(url, "cursor", json.next_cursor);
}

function extractMangaId(url) {
    let match = /\/manga\/(\d+)/.exec(url || "");
    if (match) return match[1];
    match = /(\d+)/.exec(url || "");
    return match ? match[1] : "";
}

function extractChapterId(url) {
    let match = /\/chapter\/(\d+)/.exec(url || "");
    if (match) return match[1];
    match = /(\d+)(?:\/)?$/.exec(url || "");
    return match ? match[1] : "";
}

function execute() {
    return Response.success({
        baseUrl: BASE_URL,
        ok: true
    });
}
