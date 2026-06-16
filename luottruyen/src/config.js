// LuotTruyen (ASP.NET MVC). Site rotates domain luottruyenN.com periodically.
// Chapters need the .truyen_AUTH login cookie; everything else is public.

let BASE_URL = "https://luottruyen9.com";
let SOURCE_URL = BASE_URL + "/tim-truyen";

try {
    if (CONFIG_URL) {
        SOURCE_URL = ("" + CONFIG_URL).replace(/\/+$/, "");
        let m = /^(https?:\/\/[^/?#]+)/i.exec(SOURCE_URL);
        BASE_URL = m ? m[1] : BASE_URL;
    }
} catch (e) {}

let HOST_RE = /^https?:\/\/(?:www\.)?luottruyen\d*\.com/i;

// Mobile UA: modern Chrome, no "; wv" — avoids embedded-WebView blocks.
let USER_AGENT = "Mozilla/5.0 (Linux; Android 13; SM-G981B) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/146.0.0.0 Mobile Safari/537.36 Edg/146.0.0.0";

function stripSlash(url) { return url ? ("" + url).replace(/\/+$/, "") : ""; }

function cleanText(t) { return t ? ("" + t).replace(/\s+/g, " ").trim() : ""; }

function decodeHtml(t) {
    if (!t) return "";
    return ("" + t).replace(/&amp;/g, "&").replace(/&quot;/g, '"')
        .replace(/&#039;/g, "'").replace(/&apos;/g, "'")
        .replace(/&lt;/g, "<").replace(/&gt;/g, ">").replace(/&nbsp;/g, " ");
}

function foldText(t) {
    t = cleanText(decodeHtml(t)).toLowerCase();
    try { t = t.normalize("NFD").replace(/[̀-ͯ]/g, ""); } catch (e) {}
    return t.replace(/đ/g, "d").replace(/Đ/g, "d");
}

function absoluteUrl(url) {
    if (!url) return "";
    url = decodeHtml(url).trim();
    if (/^(data|javascript|mailto|tel):/i.test(url)) return url;
    if (url.indexOf("//") === 0) return "https:" + url;
    if (url.indexOf("/") === 0) return stripSlash(BASE_URL) + url;
    if (!/^https?:\/\//i.test(url)) return stripSlash(BASE_URL) + "/" + url.replace(/^\/+/, "");
    return url;
}

function normalizeUrl(url) { return absoluteUrl(url).replace(HOST_RE, stripSlash(BASE_URL)); }
function normalizeImage(url) { return normalizeUrl(url); }

function setBaseUrl(url) {
    let m = HOST_RE.exec(url || "");
    if (m) { BASE_URL = stripSlash(m[0]); SOURCE_URL = BASE_URL + "/tim-truyen"; }
}

// Domain rotation: if the current number is dead, try the next few.
function candidateUrls(url) {
    let norm = normalizeUrl(url);
    let urls = [norm];
    if (!HOST_RE.test(norm)) return urls;
    let cur = parseInt((/luottruyen(\d*)\.com/i.exec(BASE_URL) || [])[1] || "9") || 9;
    for (let i = cur; i <= cur + 15; i++) {
        let next = norm.replace(HOST_RE, "https://luottruyen" + i + ".com");
        if (urls.indexOf(next) < 0) urls.push(next);
    }
    return urls;
}

function baseHeaders(extra) {
    let h = {
        "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
        "Accept-Language": "vi-VN,vi;q=0.9,en-US;q=0.8,en;q=0.7",
        "User-Agent": USER_AGENT,
        "Referer": stripSlash(BASE_URL) + "/"
    };
    if (extra) for (let k in extra) h[k] = extra[k];
    return h;
}

// GET with domain rotation. Returns a response or the last failing one.
function request(url, options) {
    options = options || {};
    options.headers = baseHeaders(options.headers);
    let urls = candidateUrls(url);
    let last = null;
    for (let i = 0; i < urls.length; i++) {
        try {
            let res = fetch(urls[i], options);
            last = res;
            if (res.ok) { setBaseUrl(urls[i]); return res; }
        } catch (e) {}
    }
    return last || fetch(normalizeUrl(url), options);
}

function getDoc(url, options) {
    let res = request(url, options);
    if (!res || !res.ok) return null;
    let doc = res.html();
    return isChallenge(doc) ? browserDoc(url) : doc;
}

function isChallenge(doc) {
    if (!doc) return true;
    let title = cleanText(doc.select("title").text());
    let html = doc.html ? doc.html() : "";
    return title.indexOf("Just a moment") >= 0 ||
        html.indexOf("cf-chl") >= 0 || html.indexOf("__cf_chl_") >= 0;
}

function browserDoc(url) {
    let browser = null;
    try {
        if (typeof Engine === "undefined") return null;
        browser = Engine.newBrowser();
        try { browser.setUserAgent(USER_AGENT); } catch (e) {}
        let doc = browser.launch(normalizeUrl(url), 45000);
        for (let i = 0; i < 5 && isChallenge(doc); i++) { sleep(3000); doc = browser.html(); }
        return isChallenge(doc) ? null : doc;
    } catch (e) {
        return null;
    } finally {
        try { if (browser) browser.close(); } catch (e) {}
    }
}

// Login session cookie from the WebView (set after user logs in via "Trang nguồn").
function sourceCookie() {
    let c = "";
    try { if (CONFIG_URL) c = localCookie.getCookie(CONFIG_URL); } catch (e) {}
    if (!c) try { c = localCookie.getCookie(BASE_URL); } catch (e) {}
    if (!c) try { c = localCookie.getCookie(BASE_URL + "/"); } catch (e) {}
    if (!c) try { c = localCookie.getCookie(); } catch (e) {}
    return c || "";
}

function pathOf(url) {
    let m = /^https?:\/\/[^/]+(\/[^?#]*)?/i.exec(normalizeUrl(url || ""));
    return m && m[1] ? m[1] : "/";
}

function storySlug(url) {
    let m = /^\/truyen-tranh\/([^/?#]+)/i.exec(pathOf(url).replace(/\/+$/, ""));
    return m ? m[1].replace(/-\d+$/, "") : "";
}

function imageAttr(e) {
    if (!e) return "";
    let srcset = e.attr("data-srcset") || e.attr("srcset");
    if (srcset) return cleanText(srcset.split(",")[0].split(" ")[0]);
    return e.attr("data-original") || e.attr("data-src") ||
        e.attr("data-lazy-src") || e.attr("data-cdn") || e.attr("src") || "";
}

function validImage(url) {
    url = normalizeImage(url);
    if (!url || url.indexOf("data:image") === 0) return false;
    if (!/\.(jpg|jpeg|png|webp|gif)(?:[?#].*)?$/i.test(url)) return false;
    let low = url.toLowerCase();
    return low.indexOf("/favicon") < 0 && low.indexOf("/logo") < 0 &&
        low.indexOf("/scripts/") < 0 && low.indexOf("/content/images/") < 0 &&
        low.indexOf("banner") < 0 && low.indexOf("loading") < 0;
}

function imageHeaders(referer) {
    return {
        "Referer": normalizeUrl(referer || BASE_URL + "/"),
        "Origin": BASE_URL,
        "User-Agent": USER_AGENT,
        "Accept-Language": "vi-VN,vi;q=0.9,en-US;q=0.8,en;q=0.7",
        "Accept": "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8"
    };
}

function ajaxHeaders(referer) {
    return {
        "Accept": "*/*",
        "Content-Type": "application/x-www-form-urlencoded; charset=UTF-8",
        "X-Requested-With": "XMLHttpRequest",
        "Origin": BASE_URL,
        "Referer": normalizeUrl(referer || BASE_URL + "/"),
        "User-Agent": USER_AGENT
    };
}

function addQuery(url, key, value) {
    url = normalizeUrl(url);
    if (value === null || value === undefined || value === "") return url;
    let parts = url.split("#");
    let hash = parts.length > 1 ? "#" + parts[1] : "";
    let qp = parts[0].split("?");
    let query = qp.length > 1 && qp[1] ? qp[1].split("&") : [];
    let found = false;
    for (let i = 0; i < query.length; i++) {
        if (query[i].split("=")[0] === key) { query[i] = key + "=" + encodeURIComponent(value); found = true; }
    }
    if (!found) query.push(key + "=" + encodeURIComponent(value));
    return qp[0] + "?" + query.join("&") + hash;
}

// ---- Shared list parsing (used by gen.js + search.js; kept here so each
// consumer only needs load("config.js") — nested load() fails in test mode) ----

function storyLink(node) {
    let links = node.select("h3 a[href*='/truyen-tranh/'], a[href*='/truyen-tranh/']");
    for (let i = 0; i < links.size(); i++) {
        let href = normalizeUrl(links.get(i).attr("href"));
        if (/\/truyen-tranh\/[^/?#]+-\d+\/?(?:[?#].*)?$/i.test(href)) return links.get(i);
    }
    return links.first();
}

function itemFromNode(node) {
    let linkNode = storyLink(node);
    if (!linkNode) return null;
    let link = normalizeUrl(linkNode.attr("href"));
    let name = cleanText(linkNode.attr("title") || linkNode.text());
    if (!name) {
        let img = node.select("img").first();
        name = cleanText(img ? (img.attr("alt") || img.attr("title")) : "");
    }
    if (!name || !link) return null;

    let img = node.select(".image img, img").first();
    let cover = normalizeImage(imageAttr(img));
    let chapNode = node.select(".chapter a, a[href*='chapter']").first();
    return {
        name: name,
        link: link,
        cover: validImage(cover) ? cover : "",
        description: chapNode ? cleanText(chapNode.text()) : "",
        host: BASE_URL
    };
}

function parseList(doc) {
    let data = [];
    let seen = {};
    let nodes = doc.select(".items .item");
    if (nodes.size() === 0) nodes = doc.select(".item");
    nodes.forEach(function(node) {
        let item = itemFromNode(node);
        if (!item || seen[item.link]) return;
        seen[item.link] = true;
        data.push(item);
    });
    if (data.length > 0) return data;

    doc.select("a[href*='/truyen-tranh/']").forEach(function(a) {
        let href = normalizeUrl(a.attr("href"));
        if (!/\/truyen-tranh\/[^/?#]+-\d+\/?(?:[?#].*)?$/i.test(href) || seen[href]) return;
        let name = cleanText(a.attr("title") || a.text());
        if (!name || /^chapter\s/i.test(name)) return;
        seen[href] = true;
        data.push({name: name, link: href, cover: "", description: "", host: BASE_URL});
    });
    return data;
}

function currentPage(urlOrPage) {
    let text = "" + (urlOrPage || "1");
    let m = /[?&]page=(\d+)/i.exec(text);
    if (m) return parseInt(m[1]);
    return /^\d+$/.test(text) ? parseInt(text) : 1;
}

function nextPage(doc, urlOrPage) {
    let current = currentPage(urlOrPage);
    let links = doc.select(".pagination a[href], ul.pagination a[href], .page_redirect a[href]");
    let best = 0, bestHref = "";
    for (let i = 0; i < links.size(); i++) {
        let a = links.get(i);
        let text = cleanText(a.text());
        let href = normalizeUrl(a.attr("href"));
        let p = /^\d+$/.test(text) ? parseInt(text) : 0;
        let m = /[?&]page=(\d+)/i.exec(href);
        if (!p && m) p = parseInt(m[1]);
        if (p > current && (!best || p < best)) { best = p; bestHref = href || ("" + p); }
    }
    return bestHref;
}
