var BASE_URL = "https://www.mangago.zone";
var DESKTOP_UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/142.0.0.0 Safari/537.36";

function decodeHtml(text) {
    if (!text) return "";
    return ("" + text)
        .replace(/&amp;/g, "&")
        .replace(/&lt;/g, "<")
        .replace(/&gt;/g, ">")
        .replace(/&quot;/g, "\"")
        .replace(/&#39;/g, "'")
        .replace(/&#039;/g, "'")
        .replace(/&apos;/g, "'")
        .replace(/&nbsp;/g, " ")
        .replace(/&#(\d+);/g, function (_, n) { return String.fromCharCode(parseInt(n, 10)); })
        .replace(/&#x([0-9a-f]+);/ig, function (_, n) { return String.fromCharCode(parseInt(n, 16)); });
}

function cleanText(text) {
    if (!text) return "";
    return decodeHtml(("" + text).replace(/<script[\s\S]*?<\/script>/gi, " ").replace(/<style[\s\S]*?<\/style>/gi, " ").replace(/<[^>]+>/g, " ")).replace(/\s+/g, " ").trim();
}

function normalizeUrl(url) {
    if (!url) return "";
    url = decodeHtml(url).trim();
    if (url.indexOf("//") === 0) return "https:" + url;
    if (url.indexOf("/") === 0) return BASE_URL + url;
    if (!/^https?:\/\//i.test(url)) return BASE_URL + "/" + url.replace(/^\/+/, "");
    return url;
}

function normalizeImage(url) {
    url = normalizeUrl(url);
    if (!url) return "";
    if (url.indexOf("data:image") === 0) return "";
    return url;
}

function headers(referer) {
    return {
        "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
        "Accept-Language": "en-US,en;q=0.9",
        "Referer": referer || BASE_URL + "/",
        "User-Agent": DESKTOP_UA
    };
}

function imageHeaders(referer) {
    return {
        "Accept": "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
        "Referer": referer || BASE_URL + "/",
        "User-Agent": DESKTOP_UA
    };
}

function requestText(url, referer) {
    try {
        var response = fetch(url, {headers: headers(referer)});
        if (response && response.ok) return response.text();
    } catch (error) {
    }
    return "";
}

function browserText(url, waitMs) {
    var browser = null;
    try {
        if (typeof Engine === "undefined" || !Engine.newBrowser) return "";
        browser = Engine.newBrowser();
        try { browser.setUserAgent(DESKTOP_UA); } catch (uaError) {}
        var doc = browser.launch(url, 30000);
        try { sleep(waitMs || 1500); doc = browser.html(); } catch (sleepError) {}
        return doc ? "" + doc : "";
    } catch (error) {
        return "";
    } finally {
        try { if (browser) browser.close(); } catch (closeError) {}
    }
}

function browserTextUntil(url, pattern, maxMs) {
    var browser = null;
    try {
        if (typeof Engine === "undefined" || !Engine.newBrowser) return "";
        browser = Engine.newBrowser();
        try { browser.setUserAgent(DESKTOP_UA); } catch (uaError) {}
        browser.launch(url, 30000);
        var elapsed = 0;
        var step = 200;
        var limit = maxMs || 4000;
        var html = "";
        while (elapsed < limit) {
            try { sleep(step); } catch (sleepError) {}
            elapsed += step;
            try { html = browser.html(); } catch (htmlError) { html = ""; }
            if (html && pattern && pattern.test(html)) return "" + html;
        }
        return html ? "" + html : "";
    } catch (error) {
        return "";
    } finally {
        try { if (browser) browser.close(); } catch (closeError) {}
    }
}

function getDoc(url, referer) {
    try {
        var response = fetch(url, {headers: headers(referer)});
        if (response && response.ok) return response.html();
    } catch (error) {
    }
    return null;
}

function isWorkUrl(url) {
    return /\/work\/\d+\/?/i.test(url || "");
}

function workIdFromUrl(url) {
    var m = /\/work\/(\d+)/i.exec(url || "");
    return m ? m[1] : "";
}

function chapterIdsFromUrl(url) {
    var m = /\/chapter\/(\d+)\/(\d+)(?:\/(\d+))?/i.exec(url || "");
    if (!m) return null;
    return {workId: m[1], chapterId: m[2], page: m[3] ? parseInt(m[3], 10) : 1};
}

function chapterBaseUrl(workId, chapterId) {
    return BASE_URL + "/chapter/" + encodeURIComponent(workId) + "/" + encodeURIComponent(chapterId) + "/";
}

function chapterPageUrl(workId, chapterId, page) {
    if (!page || page === 1) return chapterBaseUrl(workId, chapterId);
    return chapterBaseUrl(workId, chapterId) + page + "/";
}
