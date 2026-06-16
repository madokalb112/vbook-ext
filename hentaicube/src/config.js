var BASE_URL = "https://hentaicube.xyz";
try {
    if (CONFIG_URL) BASE_URL = ("" + CONFIG_URL).replace(/\?.*$/, "").replace(/\/+$/, "");
} catch (e) {}

var DESKTOP_UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/142.0.0.0 Safari/537.36";
var ANDROID_UA = "Mozilla/5.0 (Linux; Android 12; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/142.0.0.0 Mobile Safari/537.36";

function clean(t) {
    if (!t) return "";
    return ("" + t).replace(/\s+/g, " ").trim();
}

function decodeHtml(t) {
    if (!t) return "";
    return ("" + t)
        .replace(/&amp;/g, "&")
        .replace(/&quot;/g, "\"")
        .replace(/&#0?39;/g, "'")
        .replace(/&apos;/g, "'")
        .replace(/&lt;/g, "<")
        .replace(/&gt;/g, ">")
        .replace(/&nbsp;/g, " ");
}

function absUrl(u) {
    if (!u) return "";
    u = decodeHtml(u).trim();
    if (u === "#" || u.indexOf("javascript:") === 0) return "";
    if (u.indexOf("//") === 0) return "https:" + u;
    if (u.charAt(0) === "/") return BASE_URL + u;
    if (!/^https?:\/\//i.test(u)) return BASE_URL + "/" + u.replace(/^\/+/, "");
    return u.replace(/^https?:\/\/(?:www\.)?hentaicube\.xyz/i, BASE_URL);
}

function imgSrc(e) {
    if (!e) return "";
    var s = e.attr("data-src") || e.attr("data-lazy-src") || e.attr("data-original") || e.attr("src");
    if (!s) {
        var ss = e.attr("data-srcset") || e.attr("srcset");
        if (ss) s = ss.split(",")[0].trim().split(" ")[0];
    }
    return absUrl(clean(s));
}

// strip Madara thumbnail size suffix -> full image
function fullImage(u) {
    u = absUrl(u);
    return u.replace(/-\d+x\d+(\.(?:webp|jpe?g|png|gif))/i, "$1");
}

function cleanTitle(t) {
    t = clean(t);
    t = t.replace(/\s*Online\s*\|\s*HENTAICUBE\s*$/i, "");
    t = t.replace(/\s*\|\s*HENTAICUBE\s*$/i, "");
    return clean(t);
}

function isStoryUrl(u) {
    var p = absUrl(u).replace(/[?#].*$/, "").replace(/\/+$/, "");
    return /\/read\/[^/]+$/i.test(p) && !/\/read\/page\/\d+$/i.test(p);
}

function isChapterUrl(u) {
    var p = absUrl(u).replace(/[?#].*$/, "").replace(/\/+$/, "");
    if (/\/read\/page\/\d+$/i.test(p)) return false;
    return /\/read\/[^/]+\/[^/]+$/i.test(p);
}

function storyUrl(u) {
    var m = /^(https?:\/\/[^/]+\/read\/[^/?#]+)/i.exec(absUrl(u));
    return m ? m[1] + "/" : absUrl(u);
}

function storySlug(u) {
    var m = /\/read\/([^/?#]+)/i.exec(storyUrl(u));
    return m ? m[1] : "";
}

// fetch HTML via headless browser (Cloudflare blocks plain fetch on /read/*)
function browserDoc(url, waitMs) {
    var b = null;
    try {
        b = Engine.newBrowser();
        try { b.setUserAgent(ANDROID_UA); } catch (e) {}
        var doc = b.launch(absUrl(url), 60000);
        var deadline = waitMs || 12000;
        var waited = 0;
        while (waited < deadline && isChallenge(doc)) {
            sleep(2500);
            waited += 2500;
            doc = b.html();
        }
        return isChallenge(doc) ? null : doc;
    } catch (e) {
        return null;
    } finally {
        try { if (b) b.close(); } catch (e2) {}
    }
}

function isChallenge(doc) {
    if (!doc) return true;
    var t = "";
    try { t = clean(doc.select("title").text()); } catch (e) {}
    t = t.toLowerCase();
    return t.indexOf("just a moment") >= 0 || t.indexOf("chờ một chút") >= 0 || t === "hentaicube.xyz";
}

// plain fetch first (works for list/search/home), browser fallback
function getDoc(url) {
    var u = absUrl(url);
    try {
        var r = fetch(u, {
            headers: {
                "User-Agent": DESKTOP_UA,
                "Referer": BASE_URL + "/",
                "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
                "Accept-Language": "vi-VN,vi;q=0.9,en;q=0.8"
            }
        });
        if (r && r.ok) {
            var doc = r.html();
            if (!isChallenge(doc)) return doc;
        }
    } catch (e) {}
    return browserDoc(u);
}

function imageHeaders(referer) {
    var h = {
        "Referer": absUrl(referer || BASE_URL + "/"),
        "Origin": BASE_URL,
        "User-Agent": DESKTOP_UA,
        "Accept": "image/avif,image/webp,image/apng,image/*,*/*;q=0.8"
    };
    return h;
}

function execute() {
    return Response.success({baseUrl: BASE_URL});
}
