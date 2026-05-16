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


function collectComicImages(doc, url) {
    let data = [];
    let seen = {};
    let nodes = doc.select(".vw-imgs img[src], .vw-imgs img[data-src], .vw-imgs img[data-original], .vw-imgs img[data-lazy-src]");
    for (let i = 0; i < nodes.size(); i++) {
        pushComicImage(data, seen, imageAttr(nodes.get(i)), url);
    }
    return data;
}

function pushComicImage(data, seen, link, referer) {
    link = normalizeImage(decodeImageUrl(link));
    if (!link || seen[link]) return;
    if (link.indexOf("data:image") === 0) return;
    if (!/\.(jpg|jpeg|png|webp)(?:[?#].*)?$/i.test(link)) return;
    seen[link] = true;
    let headers = imageHeaders(referer);
    data.push({link: link, headers: headers, header: headers});
}

function decodeImageUrl(link) {
    if (!link) return "";
    return decodeHtml(("" + link)
        .replace(/\\u002F/g, "/")
        .replace(/\\\//g, "/")
        .replace(/\\u0026/g, "&")
        .replace(/\\u003D/g, "=")
        .replace(/\\u003F/g, "?"));
}

function collectComicImagesFromBlock(block, url) {
    let data = [];
    let seen = {};
    let re = /\b(?:data-original|data-src|data-lazy-src|data-cfsrc|src)=["']([^"']+)["']/gi;
    let match = null;
    while ((match = re.exec(block || "")) !== null) {
        pushComicImage(data, seen, match[1], url);
    }
    re = /\b(?:data-srcset|data-lazy-srcset|srcset)=["']([^"']+)["']/gi;
    while ((match = re.exec(block || "")) !== null) {
        pushComicImage(data, seen, cleanText(match[1]).split(",")[0].split(/\s+/)[0], url);
    }
    return data;
}

function collectComicImagesFromText(text, url) {
    text = decodeImageUrl(text || "");
    let match = null;
    let re = /<div\b[^>]*class=["'][^"']*\bvw-imgs\b[^"']*["'][^>]*>([\s\S]*?)<\/div>/gi;
    while ((match = re.exec(text)) !== null) {
        let fromBlock = collectComicImagesFromBlock(match[1], url);
        if (fromBlock.length > 0) return fromBlock;
    }

    let data = [];
    let seen = {};
    re = /"images"\s*:\s*\[([\s\S]*?)\]/gi;
    while ((match = re.exec(text)) !== null) {
        let srcRe = /"src"\s*:\s*"([^"]+)"/gi;
        let src = null;
        while ((src = srcRe.exec(match[1])) !== null) {
            pushComicImage(data, seen, src[1], url);
        }
        if (data.length > 0) return data;
    }

    re = /<link\b(?=[^>]*\bas=["']image["'])(?=[^>]*\bhref=["']([^"']+)["'])[^>]*>/gi;
    while ((match = re.exec(text)) !== null) {
        pushComicImage(data, seen, match[1], url);
    }
    return data;
}

function collectComicImagesFromLines(text, url) {
    let data = [];
    let seen = {};
    let parts = (text || "").split(/\r?\n/);
    for (let i = 0; i < parts.length; i++) {
        pushComicImage(data, seen, parts[i], url);
    }
    return data;
}

function browserComicImages(url) {
    let browser = null;
    try {
        browser = Engine.newBrowser();
        try { browser.setUserAgent(MOBILE_UA); } catch (error) {}
        browser.launch(normalizeUrl(url), 30000);
        for (let i = 0; i < 18; i++) {
            sleepMs(1000);
            let script = "(function(){var list=[],seen={};function add(s){s=(s||'').trim();if(!s||seen[s])return;seen[s]=1;list.push(s);}var nodes=document.querySelectorAll('.vw-imgs img');for(var i=0;i<nodes.length;i++){var img=nodes[i];add(img.currentSrc||img.src||img.getAttribute('data-original')||img.getAttribute('data-src')||img.getAttribute('data-lazy-src')||img.getAttribute('src')||'');}if(list.length)return list.join('\\n');var links=document.querySelectorAll('link[rel=\"preload\"][as=\"image\"],link[as=\"image\"]');for(var j=0;j<links.length;j++){add(links[j].href||links[j].getAttribute('href')||'');}return list.join('\\n');})()";
            let raw = "";
            try { raw = browser.callJs(script, 8000); } catch (error) {}
            let images = collectComicImagesFromLines("" + (raw || ""), url);
            if (images.length > 0) {
                try { browser.close(); } catch (error) {}
                return images;
            }
        }

        let html = "";
        try { html = browser.html(); } catch (error) {}
        if (html) {
            if (html.select) {
                let images = collectComicImages(html, url);
                if (images.length > 0) {
                    try { browser.close(); } catch (error) {}
                    return images;
                }
            } else {
                let images = collectComicImagesFromText("" + html, url);
                if (images.length > 0) {
                    try { browser.close(); } catch (error) {}
                    return images;
                }
            }
        }
    } catch (error) {
    }
    try { if (browser) browser.close(); } catch (error) {}
    return [];
}

function browserNovelHtml(url) {
    let browser = null;
    try {
        browser = Engine.newBrowser();
        try { browser.setUserAgent(MOBILE_UA); } catch (error) {}
        browser.launch(normalizeUrl(url), 30000);
        for (let i = 0; i < 16; i++) {
            sleepMs(1500);
            let script = "(function(){var all=document.querySelectorAll('*');for(var i=0;i<all.length;i++){var r=all[i].__novelShadow||all[i].shadowRoot;if(r&&r.querySelector&&r.querySelector('p')){return r.innerHTML;}}return '';})()";
            let html = "";
            try { html = browser.callJs(script, 5000); } catch (error) {}
            if (html && cleanText(stripTags(html)).length > 80) {
                try { browser.close(); } catch (error) {}
                return "" + html;
            }
        }
    } catch (error) {
    }
    try { if (browser) browser.close(); } catch (error) {}
    return "";
}

function cleanNovelHtml(html) {
    html = html || "";
    html = html.replace(/<style[\s\S]*?<\/style>/gi, "");
    html = html.replace(/<script[\s\S]*?<\/script>/gi, "");
    html = html.replace(/\s*(class|id|style|onclick)="[^"]*"/gi, "");
    return html.trim();
}

function chapterTitle(url) {
    let text = getText(url);
    if (!text) return "";
    let doc = null;
    try { doc = Html.parse(text); } catch (error) {}
    if (!doc) return "";
    return firstText(doc, ["main h1", "h1"]);
}

function execute(url) {
    url = normalizeUrl(url);
    if (isNovelChapterUrl(url)) {
        let html = cleanNovelHtml(browserNovelHtml(url));
        if (!html || cleanText(stripTags(html)).length < 80) return Response.error(docErrorMessage("Khong lay duoc noi dung novel."));
        let title = chapterTitle(url);
        return Response.success((title ? "<h2>" + escapeHtml(title) + "</h2>\n" : "") + html);
    }

    let text = getText(url);
    let images = collectComicImagesFromText(text, url);
    if (images.length > 0) return Response.success(images);

    let doc = null;
    if (text) {
        try { doc = Html.parse(text); } catch (error) {}
    }
    if (doc && !isChallengeDoc(doc)) {
        images = collectComicImages(doc, url);
        if (images.length > 0) return Response.success(images);
    }

    images = browserComicImages(url);
    if (images.length === 0) return Response.error("Khong tim thay anh chapter.");
    return Response.success(images);
}

