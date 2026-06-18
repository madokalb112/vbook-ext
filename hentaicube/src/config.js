let BASE_URL = "https://hentaicube.xyz";
let CDN_HOST = "https://cdn.hentaicube.xyz";
let READER_API = BASE_URL + "/wp-json/manga-reader/v1/images";
try {
    if (CONFIG_URL) BASE_URL = stripTrailingSlash(CONFIG_URL);
    READER_API = BASE_URL + "/wp-json/manga-reader/v1/images";
} catch (error) {
}

let LAST_ERROR = "";
let MOBILE_UA = "Mozilla/5.0 (Linux; Android 13; SM-G981B) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/146.0.0.0 Mobile Safari/537.36";

function cleanText(text) {
    if (!text) return "";
    return ("" + text).replace(/\s+/g, " ").trim();
}

function foldText(text) {
    text = cleanText(text).toLowerCase();
    try {
        text = text.normalize("NFD").replace(/[\u0300-\u036f]/g, "");
    } catch (error) {
    }
    return text.replace(/\u0111/g, "d").replace(/\u0110/g, "d");
}

function stripTrailingSlash(url) {
    if (!url) return url;
    return ("" + url).replace(/\/+$/, "");
}

function normalizeUrl(url) {
    if (!url) return "";
    url = ("" + url).replace(/&amp;/g, "&").trim();
    if (url.startsWith("//")) return "https:" + url;
    if (url.startsWith("/")) return stripTrailingSlash(BASE_URL) + url;
    if (!/^https?:\/\//i.test(url)) return stripTrailingSlash(BASE_URL) + "/" + url.replace(/^\/+/, "");
    return url.replace(/^https?:\/\/(?:www\.)?hentaicube\.xyz/i, stripTrailingSlash(BASE_URL));
}

function normalizeImage(url) {
    if (!url) return "";
    url = ("" + url).replace(/&amp;/g, "&").trim();
    if (url.startsWith("//")) return "https:" + url;
    if (url.startsWith("/")) return stripTrailingSlash(BASE_URL) + url;
    if (!/^https?:\/\//i.test(url)) return stripTrailingSlash(BASE_URL) + "/" + url.replace(/^\/+/, "");
    return url;
}

function sourceCookie() {
    let cookie = "";
    try { if (CONFIG_URL) cookie = localCookie.getCookie(CONFIG_URL); } catch (e) {}
    if (!cookie) try { cookie = localCookie.getCookie(BASE_URL); } catch (e) {}
    if (!cookie) try { cookie = localCookie.getCookie(BASE_URL + "/"); } catch (e) {}
    if (!cookie) try { cookie = localCookie.getCookie(); } catch (e) {}
    return cookie || "";
}

function request(url, options) {
    options = options || {};
    let headers = options.headers || {};
    headers["Accept"] = headers["Accept"] || "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8";
    headers["Accept-Language"] = headers["Accept-Language"] || "vi-VN,vi;q=0.9,en;q=0.8";
    headers["Referer"] = headers["Referer"] || BASE_URL + "/";
    headers["User-Agent"] = headers["User-Agent"] || MOBILE_UA;
    let cookie = sourceCookie();
    if (cookie && !headers.Cookie) headers.Cookie = cookie;
    options.headers = headers;
    return fetch(normalizeUrl(url), options);
}

function isBlockedText(text) {
    text = foldText(text || "");
    return text.indexOf("just a moment") >= 0 ||
        text.indexOf("checking your browser") >= 0 ||
        text.indexOf("challenge-platform") >= 0 ||
        text.indexOf("/cdn-cgi/challenge-platform/") >= 0 ||
        (text.indexOf("cloudflare") >= 0 && text.indexOf("challenge") >= 0 && text.indexOf("cf-chl") >= 0);
}

function getText(url, options) {
    LAST_ERROR = "";
    try {
        let response = request(url, options);
        if (!response) {
            LAST_ERROR = "Khong nhan duoc phan hoi tu HentaiCB.";
            return "";
        }
        if (!response.ok) {
            LAST_ERROR = "HentaiCB bi chan HTTP/Cloudflare. Mo Trang nguon de lay cookie.";
            return "";
        }
        let text = response.text() || "";
        if (isBlockedText(text)) {
            LAST_ERROR = "HentaiCB bi Cloudflare challenge. Mo link bang WebView roi thu lai.";
            return "";
        }
        return text;
    } catch (error) {
        LAST_ERROR = "Khong tai duoc HentaiCB: " + error;
    }
    return "";
}

function getDoc(url) {
    LAST_ERROR = "";
    try {
        let response = request(url);
        if (response && response.ok) {
            let doc = response.html();
            if (!isChallengeDoc(doc)) return doc;
        }
    } catch (error) {
    }
    return browserDoc(url);
}

function postText(url, body, referer) {
    return getText(url, {
        method: "POST",
        headers: {
            "Accept": "text/html, */*; q=0.01",
            "Content-Type": "application/x-www-form-urlencoded; charset=UTF-8",
            "Origin": BASE_URL,
            "Referer": referer || BASE_URL + "/",
            "X-Requested-With": "XMLHttpRequest"
        },
        body: body || ""
    });
}

function loadError() {
    return Response.error(LAST_ERROR || "Khong tai duoc HentaiCB.");
}

function isChallengeDoc(doc) {
    if (!doc) return true;
    let html = "";
    try {
        html = doc.html ? doc.html() : "";
    } catch (error) {
    }
    let title = "";
    try {
        title = cleanText(doc.select("title").text());
    } catch (error2) {
    }
    return title.indexOf("Just a moment") >= 0 ||
        html.indexOf("cf-chl") >= 0 ||
        html.indexOf("__cf_chl_") >= 0 ||
        html.indexOf("window._cf_chl_opt") >= 0 ||
        html.indexOf("challenge-platform") >= 0 ||
        html.indexOf("Enable JavaScript and cookies") >= 0;
}

function browserDoc(url) {
    let browser = null;
    try {
        browser = Engine.newBrowser();
        let ua = MOBILE_UA;
        try {
            ua = UserAgent.android();
        } catch (uaError) {
        }
        browser.setUserAgent(ua);
        let doc = browser.launch(normalizeUrl(url), 45000);
        for (let i = 0; i < 8 && isChallengeDoc(doc); i++) {
            sleep(3000);
            doc = browser.html();
        }
        if (isChallengeDoc(doc)) {
            LAST_ERROR = "HentaiCB van bi Cloudflare chan trong browser an.";
            return null;
        }
        return doc;
    } catch (error) {
        LAST_ERROR = "Khong mo duoc browser an de vuot Cloudflare: " + error;
        return null;
    } finally {
        try {
            if (browser) browser.close();
        } catch (closeError) {
        }
    }
}

function pathOf(url) {
    url = normalizeUrl(url);
    let match = /^https?:\/\/[^/]+(\/[^?#]*)?/i.exec(url);
    return match && match[1] ? match[1] : "/";
}

function isStoryUrl(url) {
    let path = pathOf(url).replace(/\/+$/, "");
    return /^\/read\/[^/]+$/i.test(path);
}

function isChapterUrl(url) {
    let path = pathOf(url).replace(/\/+$/, "");
    return /^\/read\/[^/]+\/(chap-[^/]+|oneshot)$/i.test(path);
}

function storyUrlFromAny(url) {
    url = normalizeUrl(url);
    let match = /^(https?:\/\/[^/]+\/read\/[^/?#\/]+)/i.exec(url);
    return match ? match[1] + "/" : url;
}

function imageAttr(e) {
    if (!e) return "";
    let srcset = e.attr("data-srcset") || e.attr("srcset");
    if (srcset) return cleanText(srcset.split(",")[0].split(" ")[0]);
    return e.attr("data-original") || e.attr("data-src") || e.attr("data-lazy-src") || e.attr("data-cfsrc") || e.attr("src");
}

function imageFromNode(e) {
    return normalizeImage(imageAttr(e));
}

function imageHeaders(referer) {
    return {
        "Accept": "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
        Referer: referer || BASE_URL + "/",
        "User-Agent": MOBILE_UA
    };
}

function cdnImageHeaders() {
    return {
        "Accept": "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
        Referer: BASE_URL + "/",
        "User-Agent": MOBILE_UA
    };
}

function chapterParts(url) {
    let path = pathOf(url).replace(/\/+$/, "");
    let match = /^\/read\/([^/]+)\/([^/]+)$/i.exec(path);
    if (!match) return null;
    return {manga: match[1], chapter: match[2]};
}

function readerApiUrl(parts) {
    return READER_API + "?manga=" + encodeURIComponent(parts.manga) +
        "&chapter=" + encodeURIComponent(parts.chapter);
}

function requestJson(url, options) {
    try {
        let response = request(url, options);
        if (response && response.ok) return response.json();
    } catch (error) {
    }
    return null;
}

function readerImages(chapterUrl) {
    let parts = chapterParts(chapterUrl);
    if (!parts) {
        LAST_ERROR = "Link chapter khong hop le.";
        return null;
    }

    chapterUrl = normalizeUrl(chapterUrl);
    let headers = {
        "Accept": "application/json",
        "Referer": chapterUrl
    };

    let json = requestJson(readerApiUrl(parts), {headers: headers});
    if (json && json.images && json.images.length) return json.images;

    try {
        request(chapterUrl);
    } catch (error) {
    }

    json = requestJson(READER_API, {headers: headers});
    if (json && json.images && json.images.length) return json.images;

    let html = getText(chapterUrl);
    if (html) {
        json = requestJson(READER_API, {headers: headers});
        if (json && json.images && json.images.length) return json.images;
    }

    LAST_ERROR = "Khong lay duoc danh sach anh tu API manga-reader.";
    return null;
}

function fetchAjaxHtml(url, referer) {
    try {
        let response = request(url, {
            method: "POST",
            headers: {
                "Accept": "text/html, */*; q=0.01",
                "Content-Type": "application/x-www-form-urlencoded; charset=UTF-8",
                "Origin": BASE_URL,
                "Referer": referer || BASE_URL + "/",
                "X-Requested-With": "XMLHttpRequest"
            },
            body: ""
        });
        if (response && response.ok) {
            let text = response.text() || "";
            if (text && !isBlockedText(text)) return text;
        }
    } catch (error) {
    }
    return "";
}

function metaContent(doc, selector) {
    let node = doc.select(selector).first();
    return node ? cleanText(node.attr("content")) : "";
}

function metaImage(doc) {
    return normalizeImage(metaContent(doc, "meta[property=og:image], meta[property='og:image:secure_url'], meta[name=twitter:image], meta[itemprop=image]"));
}

function firstText(node, selectors) {
    for (let i = 0; i < selectors.length; i++) {
        let e = node.select(selectors[i]).first();
        let text = e ? cleanText(e.text()) : "";
        if (text) return text;
    }
    return "";
}

function firstHtml(node, selectors) {
    for (let i = 0; i < selectors.length; i++) {
        let e = node.select(selectors[i]).first();
        if (e && cleanText(e.text())) return e.html();
    }
    return "";
}

function stripHtml(text) {
    return cleanText((text || "").replace(/<[^>]+>/g, " "));
}

function chapterNumber(text) {
    let folded = foldText(text || "").replace(/_/g, "-");
    if (folded.indexOf("oneshot") >= 0) return 99999;
    let match = /(?:chapter|chap|chuong|episode|ep|part|c)\s*[-:#.]?\s*(\d+(?:[-.]\d+)?)/i.exec(folded);
    if (!match) match = /chap-(\d+(?:[-.]\d+)?)/i.exec(folded);
    if (!match) match = /(\d+(?:[-.]\d+)?)/.exec(folded);
    return match ? parseFloat(match[1].replace("-", ".")) : 0;
}

function sortChapters(data) {
    if (!data || data.length < 2) return data;
    let mapped = [];
    let count = 0;
    for (let i = 0; i < data.length; i++) {
        let value = chapterNumber(data[i].name + " " + data[i].url);
        if (value > 0) count++;
        mapped.push({item: data[i], index: i, value: value});
    }
    if (count < 2) return data;
    mapped.sort(function(a, b) {
        if (a.value > 0 && b.value > 0 && a.value !== b.value) return a.value - b.value;
        if (a.value === 0 && b.value > 0) return -1;
        if (a.value > 0 && b.value === 0) return 1;
        return a.index - b.index;
    });
    let sorted = [];
    for (let j = 0; j < mapped.length; j++) sorted.push(mapped[j].item);
    return sorted;
}

function pageNumberFromUrl(url) {
    let m = /\/page\/(\d+)/i.exec(url || "");
    if (!m) m = /[?&](?:paged|page)=(\d+)/i.exec(url || "");
    return m ? parseInt(m[1]) : 1;
}

function listPageUrl(url, page) {
    if (!url) url = "/read/";
    if (!page || page === "1") return normalizeUrl(url);
    if (("" + page).indexOf("http") === 0 || ("" + page).indexOf("/") === 0) return normalizeUrl(page);

    let target = normalizeUrl(url);
    let parts = target.split("?");
    let base = stripTrailingSlash(parts[0].replace(/\/page\/\d+\/?$/i, ""));
    let query = parts.length > 1 ? "?" + parts.slice(1).join("?") : "";
    return base + "/page/" + page + "/" + query;
}

function nextPage(doc, currentUrl) {
    let selectors = [
        "a.nextpostslink[href]",
        ".wp-pagenavi a.nextpostslink[href]",
        ".nav-links a.next[href]",
        ".pagination a.next[href]",
        "a.page-numbers.next[href]",
        "a[rel=next][href]"
    ];
    for (let i = 0; i < selectors.length; i++) {
        let e = doc.select(selectors[i]).first();
        if (e) return normalizeUrl(e.attr("href"));
    }

    let current = pageNumberFromUrl(currentUrl || "");
    let links = doc.select("a[href*='/page/'], a[href*='paged=']");
    let best = 0;
    let bestHref = "";
    for (let j = 0; j < links.size(); j++) {
        let href = links.get(j).attr("href");
        let page = pageNumberFromUrl(href);
        if (page > current && (!best || page < best)) {
            best = page;
            bestHref = href;
        }
    }
    return bestHref ? normalizeUrl(bestHref) : "";
}

function execute() {
    return Response.success({baseUrl: BASE_URL, ok: true});
}
