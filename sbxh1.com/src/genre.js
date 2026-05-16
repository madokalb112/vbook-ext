let BASE_URL = "https://sbxh1.com";
try {
    if (CONFIG_URL) BASE_URL = ("" + CONFIG_URL).replace(/\/+$/, "");
} catch (error) {
}

let HOME_URL = BASE_URL + "/";
let MOBILE_UA = "Mozilla/5.0 (Linux; Android 9; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Mobile Safari/537.36";
try { MOBILE_UA = UserAgent.android(); } catch (error) {}
let DESKTOP_UA = MOBILE_UA;
let LAST_ERROR = "";

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
        .replace(/&nbsp;/g, " ");
}

function escapeHtml(text) {
    return ("" + (text || ""))
        .replace(/&/g, "&amp;")
        .replace(/</g, "&lt;")
        .replace(/>/g, "&gt;");
}

function escapeAttr(text) {
    return escapeHtml(text).replace(/"/g, "&quot;");
}

function stripTags(html) {
    if (!html) return "";
    return cleanText(decodeHtml(("" + html).replace(/<script[\s\S]*?<\/script>/gi, " ").replace(/<style[\s\S]*?<\/style>/gi, " ").replace(/<[^>]+>/g, " ")));
}

function normalizeUrl(url) {
    if (!url) return "";
    url = decodeHtml(url).trim();
    if (/^(javascript|mailto|tel):/i.test(url)) return "";
    if (url.startsWith("//")) return "https:" + url;
    if (url.startsWith("/")) return BASE_URL + url;
    if (!/^https?:\/\//i.test(url)) return BASE_URL + "/" + url.replace(/^\/+/, "");
    return url.replace(/^https?:\/\/(?:www\.)?sbxh1\.com/i, BASE_URL);
}

function normalizeImage(url) {
    if (!url) return "";
    url = decodeHtml(url).trim();
    if (url.startsWith("//")) return "https:" + url;
    if (url.startsWith("/")) return BASE_URL + url;
    return url;
}

function pathOf(url) {
    url = normalizeUrl(url);
    let match = /^https?:\/\/[^/]+(\/[^?#]*)?/i.exec(url);
    return match && match[1] ? match[1] : "/";
}

function isStoryUrl(url) {
    let path = pathOf(url).replace(/\/+$/, "");
    return /^\/(?:manhwa|webtoon|novel)\/[^/]+$/i.test(path);
}

function isComicStoryUrl(url) {
    let path = pathOf(url).replace(/\/+$/, "");
    return /^\/(?:manhwa|webtoon)\/[^/]+$/i.test(path);
}

function isNovelStoryUrl(url) {
    let path = pathOf(url).replace(/\/+$/, "");
    return /^\/novel\/[^/]+$/i.test(path);
}

function isComicChapterUrl(url) {
    let path = pathOf(url).replace(/\/+$/, "");
    return /^\/(?:manhwa|webtoon)\/[^/]+\/[^/]+$/i.test(path);
}

function isNovelChapterUrl(url) {
    let path = pathOf(url).replace(/\/+$/, "");
    return /^\/novel\/[^/]+\/[^/]+$/i.test(path);
}

function storyUrlFromAny(url) {
    url = normalizeUrl(url).replace(/[?#].*$/, "").replace(/\/+$/, "");
    let path = pathOf(url).replace(/\/+$/, "");
    let match = /^(\/(?:manhwa|webtoon|novel)\/[^/]+)(?:\/[^/]+)?$/i.exec(path);
    return match ? BASE_URL + match[1] : url;
}

function queryParam(url, key) {
    let re = new RegExp("[?&]" + key + "=([^&#]*)", "i");
    let match = re.exec(url || "");
    return match ? decodeURIComponent(match[1].replace(/\+/g, " ")) : "";
}

function addPageParam(url, page) {
    url = normalizeUrl(url || HOME_URL);
    if (!page || page === 1 || page === "1") return url;
    if (("" + page).indexOf("http") === 0 || ("" + page).indexOf("/") === 0) return normalizeUrl(page);
    if (/[?&]page=\d+/i.test(url)) return url.replace(/([?&]page=)\d+/i, "$1" + encodeURIComponent(page));
    return url + (url.indexOf("?") >= 0 ? "&" : "?") + "page=" + encodeURIComponent(page);
}

function listPageUrl(url, page) {
    return addPageParam(url || BASE_URL + "/manhwa", page);
}

function sourceCookie() {
    let cookie = "";
    try { cookie = localCookie.getCookie(BASE_URL); } catch (error) {}
    if (!cookie) {
        try { cookie = localCookie.getCookie(HOME_URL); } catch (error2) {}
    }
    if (!cookie) {
        try { cookie = localCookie.getCookie(); } catch (error3) {}
    }
    return cookie || "";
}

function requestDirect(url, options) {
    options = options || {};
    let headers = options.headers || {};
    headers["Accept"] = headers["Accept"] || "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8";
    headers["Accept-Language"] = headers["Accept-Language"] || "ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7";
    headers["Referer"] = headers["Referer"] || HOME_URL;
    headers["User-Agent"] = headers["User-Agent"] || DESKTOP_UA;
    let cookie = sourceCookie();
    if (cookie) headers["Cookie"] = headers["Cookie"] || cookie;
    options.headers = headers;
    return fetch(normalizeUrl(url), options);
}

function isChallengeText(text) {
    text = text || "";
    return text.indexOf("cf-chl") >= 0 ||
        text.indexOf("__cf_chl_") >= 0 ||
        text.indexOf("Just a moment") >= 0 ||
        text.indexOf("Enable JavaScript and cookies") >= 0 ||
        text.indexOf("cf-mitigated") >= 0;
}

function cloudflareMessage() {
    return "Bi Cloudflare/Turnstile chan. Bam Trang nguon, vuot kiem tra tren sbxh1.com trong WebView, roi quay lai bam Tai lai.";
}

function docErrorMessage(prefix) {
    return prefix + " " + (LAST_ERROR || cloudflareMessage());
}

function isChallengeDoc(doc) {
    if (!doc) return true;
    let title = cleanText(doc.select("title").text());
    let html = doc.html ? doc.html() : "";
    return title.indexOf("Just a moment") >= 0 || isChallengeText(html);
}

function sleepMs(ms) {
    try { sleep(ms); } catch (error) {}
}

function browserDoc(url, waitMs) {
    let browser = null;
    let result = null;
    try {
        if (typeof Engine === "undefined" || !Engine.newBrowser) {
            LAST_ERROR = "VBook khong ho tro Engine.newBrowser.";
            return null;
        }
        browser = Engine.newBrowser();
        try { browser.setUserAgent(MOBILE_UA); } catch (error) {}
        let initial = browser.launch(normalizeUrl(url), 60000);
        let loops = Math.max(1, Math.ceil((waitMs || 30000) / 1500));
        for (let i = 0; i < loops; i++) {
            sleepMs(1500);
            let html = null;
            try {
                html = browser.callJs("(function(){return document.documentElement?document.documentElement.outerHTML:'';})()", 5000);
            } catch (callError) {
            }
            try {
                if (!html) html = browser.html();
            } catch (htmlError) {
            }
            try {
                if (html && html.select) result = html;
                else if (html) result = Html.parse("" + html);
                else if (initial && initial.select) result = initial;
                else if (initial) result = Html.parse("" + initial);
            } catch (parseError) {
            }
            if (result && !isChallengeDoc(result) && cleanText(result.select("body").text()).length > 20) {
                LAST_ERROR = "";
                break;
            }
            if (result && isChallengeDoc(result)) LAST_ERROR = cloudflareMessage();
            result = null;
        }
    } catch (error) {
        LAST_ERROR = "Khong mo duoc WebView: " + error;
    }
    try { if (browser) browser.close(); } catch (error) {}
    return result;
}

function getText(url, options) {
    try {
        let response = requestDirect(url, options || {});
        if (response.ok) {
            let text = response.text();
            if (text && !isChallengeText(text)) {
                LAST_ERROR = "";
                return text;
            }
            if (isChallengeText(text)) LAST_ERROR = cloudflareMessage();
        } else {
            LAST_ERROR = "HTTP " + response.status + " khi tai " + normalizeUrl(url) + ".";
        }
    } catch (error) {
        LAST_ERROR = "Fetch loi: " + error;
    }
    return "";
}

function getDoc(url) {
    let text = getText(url);
    if (text) {
        try {
            let doc = Html.parse(text);
            if (!isChallengeDoc(doc)) return doc;
        } catch (error) {
        }
    }
    let doc = browserDoc(url, 30000);
    if (doc && !isChallengeDoc(doc)) return doc;
    return null;
}

function metaContent(doc, selector) {
    let node = doc ? doc.select(selector).first() : null;
    return node ? cleanText(node.attr("content")) : "";
}

function firstText(node, selectors) {
    if (!node) return "";
    for (let i = 0; i < selectors.length; i++) {
        let e = node.select(selectors[i]).first();
        let text = e ? cleanText(e.text()) : "";
        if (text) return text;
    }
    return "";
}

function firstHtml(node, selectors) {
    if (!node) return "";
    for (let i = 0; i < selectors.length; i++) {
        let e = node.select(selectors[i]).first();
        if (e && cleanText(e.text())) return e.html();
    }
    return "";
}

function imageAttr(e) {
    if (!e) return "";
    let srcset = e.attr("data-srcset") || e.attr("data-lazy-srcset") || e.attr("srcset");
    if (srcset) return cleanText(srcset.split(",")[0].split(/\s+/)[0]);
    return e.attr("data-original") || e.attr("data-src") || e.attr("data-lazy-src") || e.attr("data-cfsrc") || e.attr("src");
}

function validCover(url) {
    url = normalizeImage(url);
    if (!url || url.indexOf("data:image") === 0) return false;
    let low = url.toLowerCase();
    return low.indexOf("/platforms/") < 0 &&
        low.indexOf("/brand/") < 0 &&
        low.indexOf("/favicon") < 0 &&
        low.indexOf("logo") < 0 &&
        low.indexOf("/board_uploads/2026/05/15/") < 0;
}

function imageFromNode(node) {
    if (!node) return "";
    let imgs = node.select ? node.select("img") : null;
    if (imgs && imgs.size && imgs.size() > 0) {
        for (let i = imgs.size() - 1; i >= 0; i--) {
            let img = imgs.get(i);
            let src = normalizeImage(imageAttr(img));
            if (validCover(src)) return src;
        }
    }
    if (node.attr) {
        let src = normalizeImage(imageAttr(node));
        if (validCover(src)) return src;
    }
    return "";
}

function genreLinks(doc) {
    let data = [];
    let seen = {};
    let links = doc.select(".hero-v2-tags a[href], .nd-info .hero-v2-tags a[href]");
    for (let i = 0; i < links.size(); i++) {
        let a = links.get(i);
        let title = cleanText(a.text()).replace(/^#\s*/, "");
        let href = normalizeUrl(a.attr("href"));
        if (title && href && !seen[href]) {
            seen[href] = true;
            data.push({title: title, input: href, script: "gen.js"});
        }
    }
    return data;
}

function nextPage(doc, currentUrl) {
    if (!doc) return "";
    let rel = doc.select("a[rel=next][href], .pagination a.next[href], a.next[href]").first();
    if (rel) return normalizeUrl(rel.attr("href"));
    let current = parseInt(queryParam(currentUrl, "page") || "1");
    let links = doc.select("a[href*='page=']");
    let best = 0;
    let bestHref = "";
    for (let i = 0; i < links.size(); i++) {
        let href = links.get(i).attr("href");
        let p = parseInt(queryParam(href, "page") || "0");
        if (p > current && (!best || p < best)) {
            best = p;
            bestHref = href;
        }
    }
    return bestHref ? normalizeUrl(bestHref) : "";
}

function chapterNumber(text) {
    text = cleanText(text || "").replace(/,/g, "");
    let match = /(\d+(?:\.\d+)?)/.exec(text);
    return match ? parseFloat(match[1]) : 0;
}

function imageHeaders(referer) {
    return {
        "Referer": normalizeUrl(referer || HOME_URL),
        "Origin": BASE_URL,
        "User-Agent": DESKTOP_UA,
        "Accept": "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8"
    };
}


function addGenre(data, seen, title, input) {
    input = normalizeUrl(input);
    title = cleanText(title);
    if (!title || !input || seen[input]) return;
    seen[input] = true;
    data.push({title: title, input: input, script: "gen.js"});
}

function genreNameFromUrl(url) {
    let value = queryParam(url, "g");
    if (!value) return "";
    try {
        value = decodeURIComponent(value);
    } catch (error) {
    }
    return cleanText(value.replace(/\+/g, " "));
}

function liveGenreDoc(path) {
    let text = getText(BASE_URL + path);
    if (!text) return null;
    try {
        let doc = Html.parse(text);
        if (!isChallengeDoc(doc)) return doc;
    } catch (error) {
    }
    return null;
}

function collectLiveGenres(data, seen, path, prefix) {
    let doc = liveGenreDoc(path);
    if (!doc) return;
    let links = doc.select("a[href*='?g='], a[href*='&g=']");
    for (let i = 0; i < links.size(); i++) {
        let a = links.get(i);
        let href = normalizeUrl(a.attr("href"));
        let name = cleanText(a.text()) || genreNameFromUrl(href);
        if (!name) continue;
        addGenre(data, seen, prefix + " " + name, href);
    }
}

function addFallbackGroup(data, seen, prefix, path, items) {
    addGenre(data, seen, prefix + " All", BASE_URL + path);
    for (let i = 0; i < items.length; i++) {
        addGenre(data, seen, prefix + " " + items[i][0], BASE_URL + path + "?g=" + items[i][1]);
    }
}

function execute() {
    let data = [];
    let seen = {};

    collectLiveGenres(data, seen, "/ing", "Webtoon");
    collectLiveGenres(data, seen, "/end", "Completed");
    collectLiveGenres(data, seen, "/manhwa", "Manhwa");
    collectLiveGenres(data, seen, "/novel", "Novel");
    if (data.length > 12) return Response.success(data);

    let comic = [
        ["Fantasy", "%ED%8C%90%ED%83%80%EC%A7%80"],
        ["Action", "%EC%95%A1%EC%85%98"],
        ["Romance", "%EB%A1%9C%EB%A7%A8%EC%8A%A4"],
        ["Romance Fantasy", "%EB%A1%9C%ED%8C%90"],
        ["Martial Arts", "%EB%AC%B4%ED%98%91"],
        ["Drama", "%EB%93%9C%EB%9D%BC%EB%A7%88"],
        ["Comedy", "%EA%B0%9C%EA%B7%B8"],
        ["Slice of Life", "%EC%9D%BC%EC%83%81"],
        ["Sports", "%EC%8A%A4%ED%8F%AC%EC%B8%A0"],
        ["School", "%ED%95%99%EC%9B%90"],
        ["Thriller", "%EC%8A%A4%EB%A6%B4%EB%9F%AC"],
        ["Mystery", "%EB%AF%B8%EC%8A%A4%ED%84%B0%EB%A6%AC"],
        ["Horror", "%EA%B3%B5%ED%8F%AC"],
        ["SF", "SF"],
        ["BL", "BL"],
        ["BG", "BG"],
        ["Girls Love", "%EB%B0%B1%ED%95%A9"],
        ["Adult", "%EC%84%B1%EC%9D%B8"]
    ];
    let novel = [
        ["Fantasy", "%ED%8C%90%ED%83%80%EC%A7%80"],
        ["Modern Fantasy", "%ED%98%84%ED%8C%90"],
        ["Martial Arts", "%EB%AC%B4%ED%98%91"],
        ["Modern", "%ED%98%84%EB%8C%80"],
        ["Romance", "%EB%A1%9C%EB%A7%A8%EC%8A%A4"],
        ["Romance Fantasy", "%EB%A1%9C%ED%8C%90"],
        ["Game", "%EA%B2%8C%EC%9E%84"],
        ["Sports", "%EC%8A%A4%ED%8F%AC%EC%B8%A0"],
        ["Fusion", "%ED%93%A8%EC%A0%84"],
        ["Alternate History", "%EB%8C%80%EC%B2%B4%EC%97%AD%EC%82%AC"],
        ["Reincarnation", "%EC%A0%84%EC%83%9D"],
        ["Regression", "%ED%9A%8C%EA%B7%80"],
        ["Adult", "%EC%84%B1%EC%9D%B8"],
        ["BL", "BL"]
    ];

    addFallbackGroup(data, seen, "Webtoon", "/ing", comic);
    addFallbackGroup(data, seen, "Completed", "/end", comic);
    addFallbackGroup(data, seen, "Manhwa", "/manhwa", comic);
    addFallbackGroup(data, seen, "Novel", "/novel", novel);
    return Response.success(data);
}

