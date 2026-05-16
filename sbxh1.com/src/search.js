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


function itemDescription(node) {
    let parts = [];
    let author = firstText(node, [".nv-author", ".rank-meta span:first-child", ".podium-author"]);
    let genre = firstText(node, [".genre", ".rank-tag-line", ".podium-tags", ".hero-v2-tags"]);
    let ep = firstText(node, [".ep", ".nv-meta", ".rank-views", ".podium-views"]);
    if (author && author !== "-") parts.push(author);
    if (genre) parts.push(genre);
    if (ep) parts.push(ep);
    return parts.join(" - ");
}

function storyItem(node) {
    let linkNode = node;
    if (!linkNode.attr || !isStoryUrl(linkNode.attr("href"))) {
        linkNode = node.select("a[href*='/manhwa/'], a[href*='/webtoon/'], a[href*='/novel/']").first();
    }
    if (!linkNode) return null;
    let link = normalizeUrl(linkNode.attr("href"));
    if (!isStoryUrl(link)) return null;

    let img = node.select("img").first();
    let name = firstText(node, [".subject", ".nv-title", ".rank-title", ".podium-title", "h1", "h2", "h3"]);
    if (!name && img) name = cleanText(img.attr("alt") || img.attr("title"));
    if (!name) name = cleanText(linkNode.attr("title") || linkNode.text());
    name = name.replace(/^NEW\s*/i, "");
    if (!name || name.length > 160) return null;

    return {
        name: name,
        link: link,
        cover: imageFromNode(node),
        description: itemDescription(node),
        host: BASE_URL
    };
}

function collectItems(doc) {
    let data = [];
    let seen = {};
    let selectors = [
        "a.card[href*='/manhwa/']",
        "a.card[href*='/webtoon/']",
        "a.novel-card[href*='/novel/']",
        "a.rank-row[href*='/webtoon/']",
        "a.podium-card[href*='/webtoon/']",
        "a[href*='/manhwa/'].podium-card",
        "a[href*='/webtoon/'].podium-card"
    ];
    for (let s = 0; s < selectors.length; s++) {
        let nodes = doc.select(selectors[s]);
        for (let i = 0; i < nodes.size(); i++) {
            let item = storyItem(nodes.get(i));
            if (item && item.link && !seen[item.link]) {
                seen[item.link] = true;
                data.push(item);
            }
        }
    }
    if (data.length > 0) return data;

    let links = doc.select("a[href*='/manhwa/'], a[href*='/webtoon/'], a[href*='/novel/']");
    for (let j = 0; j < links.size(); j++) {
        let a = links.get(j);
        let link = normalizeUrl(a.attr("href"));
        if (!isStoryUrl(link) || seen[link]) continue;
        let name = cleanText(a.attr("title") || a.text());
        if (!name || name.length > 120) {
            let img = a.select("img").first();
            if (img) name = cleanText(img.attr("alt") || img.attr("title"));
        }
        if (!name || name.length > 120) continue;
        seen[link] = true;
        data.push({name: name, link: link, cover: imageFromNode(a), description: "", host: BASE_URL});
    }
    return data;
}

function browserListDoc(url) {
    let browser = null;
    let result = null;
    try {
        if (typeof Engine === "undefined" || !Engine.newBrowser) return null;
        browser = Engine.newBrowser();
        try { browser.setUserAgent(MOBILE_UA); } catch (error) {}
        browser.launch(normalizeUrl(url), 60000);
        let lastState = "";
        let stable = 0;
        for (let i = 0; i < 16; i++) {
            sleepMs(1200);
            let state = "";
            try {
                state = browser.callJs("(function(){window.scrollTo(0,document.body?document.body.scrollHeight:999999);var n=document.querySelectorAll(\"a[href*='/manhwa/'],a[href*='/webtoon/'],a[href*='/novel/']\").length;var h=Math.max(document.body?document.body.scrollHeight:0,document.documentElement?document.documentElement.scrollHeight:0);return n+':'+h;})()", 8000);
            } catch (error) {}
            if (state && state === lastState) stable++;
            else stable = 0;
            lastState = state || lastState;
            if (stable >= 3 && parseInt((state || "0").split(":")[0]) > 30) break;
        }
        let html = "";
        try {
            html = browser.callJs("(function(){return document.documentElement?document.documentElement.outerHTML:'';})()", 8000);
        } catch (error2) {}
        if (!html) {
            try { html = browser.html(); } catch (error3) {}
        }
        try {
            if (html && html.select) result = html;
            else if (html) result = Html.parse("" + html);
        } catch (error4) {}
    } catch (error5) {
    }
    try { if (browser) browser.close(); } catch (error6) {}
    return result;
}

function expandLazyList(requestUrl, doc, data) {
    if (!doc || data.length < 15 || data.length > 30) return {doc: doc, data: data};
    let fullDoc = browserListDoc(requestUrl);
    if (!fullDoc || isChallengeDoc(fullDoc)) return {doc: doc, data: data};
    let fullData = collectItems(fullDoc);
    if (fullData.length > data.length) return {doc: fullDoc, data: fullData};
    return {doc: doc, data: data};
}

function execute(url, page) {
    let requestUrl = listPageUrl(url || BASE_URL + "/manhwa", page);
    let doc = getDoc(requestUrl);
    if (!doc) return Response.error(docErrorMessage("Khong lay duoc danh sach NewToki."));
    let data = collectItems(doc);
    let expanded = expandLazyList(requestUrl, doc, data);
    doc = expanded.doc;
    data = expanded.data;
    return Response.success(data, nextPage(doc, requestUrl));
}


function execute(key, page) {
    if (!key) return Response.success([], "");
    let url = BASE_URL + "/search?q=" + encodeURIComponent(key);
    if (page && page !== "1") url = addPageParam(url, page);
    let doc = getDoc(url);
    if (!doc) return Response.error(docErrorMessage("Khong tim kiem duoc NewToki."));
    let data = collectItems(doc);
    let expanded = expandLazyList(url, doc, data);
    doc = expanded.doc;
    data = expanded.data;
    return Response.success(data, nextPage(doc, url));
}


