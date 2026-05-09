let BASE_URL = 'https://suicaodex.com';
let API_URL = 'https://wd.suicaodex.com';
let IMAGE_URL = 'https://i.suicaodex.com';
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
    return url;
}

function normalizeImage(url) {
    if (!url) return "";
    url = ("" + url).replace(/&amp;/g, "&");
    if (url.startsWith("//")) return "https:" + url;
    if (url.startsWith("/")) return BASE_URL + url;
    return url;
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

function addQuery(url, key, value) {
    if (value === null || value === undefined || value === "") return url;
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
    return base + "?" + query.join("&");
}

function nextApiPage(url, json) {
    if (!json || !json.limit || !json.page || !json.total) return "";
    if (json.page * json.limit >= json.total) return "";
    return addQuery(url, "page", json.page + 1);
}

function slugify(text) {
    text = cleanText(text).toLowerCase();
    text = text.replace(/đ/g, "d");
    text = text.replace(/[^a-z0-9]+/g, "-");
    text = text.replace(/^-+|-+$/g, "");
    return text || "manga";
}

function extractMangaId(url) {
    let match = /\/manga\/([^\/?#]+)/.exec(url || "");
    if (match) return match[1];
    match = /\/moetruyen\/manga\/([^\/?#]+)/.exec(url || "");
    if (match) return match[1];
    return cleanText(url);
}

function extractChapterId(url) {
    let match = /\/chapter\/([^\/?#]+)/.exec(url || "");
    if (match) return match[1];
    return cleanText(url);
}

function coverUrl(manga) {
    if (!manga || !manga.relationships || !manga.relationships.cover || !manga.relationships.cover.id) return "";
    let cover = manga.relationships.cover;
    let ext = cover.ext || ".webp";
    return IMAGE_URL + "/covers/" + manga.id + "/" + cover.id + ext;
}

function execute() {
    return Response.success({
        baseUrl: BASE_URL,
        apiUrl: API_URL,
        ok: true
    });
}
