let BASE_URL = "https://luottruyen8.com";
let SOURCE_URL = BASE_URL + "/tim-truyen";

try {
    if (CONFIG_URL) {
        SOURCE_URL = stripTrailingSlash("" + CONFIG_URL);
        BASE_URL = sourceBaseUrl(SOURCE_URL);
    }
} catch (error) {
}

let DESKTOP_UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/142.0.0.0 Safari/537.36";
let ANDROID_UA = "Mozilla/5.0 (Linux; Android 12; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Mobile Safari/537.36";
let SOURCE_HOST_RE = /^https?:\/\/(?:www\.)?luottruyen\d*\.com/i;

function stripTrailingSlash(url) {
    if (!url) return "";
    return ("" + url).replace(/\/+$/, "");
}

function sourceBaseUrl(url) {
    let match = /^(https?:\/\/[^/?#]+)/i.exec(url || "");
    return match ? stripTrailingSlash(match[1]) : stripTrailingSlash(url || BASE_URL);
}

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

function foldText(text) {
    text = cleanText(decodeHtml(text)).toLowerCase();
    try {
        text = text.normalize("NFD").replace(/[\u0300-\u036f]/g, "");
    } catch (error) {
    }
    return text.replace(/\u0111/g, "d").replace(/\u0110/g, "d");
}

function absoluteUrl(url) {
    if (!url) return "";
    url = decodeHtml(url).trim();
    if (/^(data|javascript|mailto|tel):/i.test(url)) return url;
    if (url.startsWith("//")) return "https:" + url;
    if (url.startsWith("/")) return stripTrailingSlash(BASE_URL) + url;
    if (!/^https?:\/\//i.test(url)) return stripTrailingSlash(BASE_URL) + "/" + url.replace(/^\/+/, "");
    return url;
}

function normalizeUrl(url) {
    url = absoluteUrl(url);
    return url.replace(SOURCE_HOST_RE, stripTrailingSlash(BASE_URL));
}

function normalizeImage(url) {
    if (!url) return "";
    url = absoluteUrl(url);
    return url.replace(SOURCE_HOST_RE, stripTrailingSlash(BASE_URL));
}

function hostBase(url) {
    let match = /^(https?:\/\/(?:www\.)?luottruyen\d*\.com)/i.exec(url || "");
    return match ? stripTrailingSlash(match[1]) : "";
}

function sourceNumber() {
    let match = /luottruyen(\d*)\.com/i.exec(BASE_URL || "");
    if (!match || !match[1]) return 8;
    return parseInt(match[1]);
}

function setBaseUrl(baseUrl) {
    if (!baseUrl) return;
    BASE_URL = stripTrailingSlash(baseUrl);
    SOURCE_URL = BASE_URL + "/tim-truyen";
}

function responseBase(response, fallback) {
    try {
        let base = hostBase(response.url);
        if (base) return base;
    } catch (error) {
    }
    return fallback;
}

function candidateUrls(url) {
    let normalized = normalizeUrl(url);
    let urls = [normalized];
    if (!SOURCE_HOST_RE.test(normalized)) return urls;

    let start = sourceNumber();
    for (let i = start; i <= 99; i++) {
        let next = normalized.replace(SOURCE_HOST_RE, "https://luottruyen" + i + ".com");
        if (urls.indexOf(next) < 0) urls.push(next);
    }
    return urls;
}

function cloneOptions(options) {
    let copy = {};
    options = options || {};
    for (let key in options) copy[key] = options[key];
    if (options.headers) {
        copy.headers = {};
        for (let header in options.headers) copy.headers[header] = options.headers[header];
    }
    return copy;
}

function sameSourceUrl(url, baseUrl) {
    if (!url) return url;
    return absoluteUrl(url).replace(SOURCE_HOST_RE, stripTrailingSlash(baseUrl || BASE_URL));
}

function requestOptions(options, baseUrl) {
    options = cloneOptions(options);
    let headers = options.headers || {};
    let targetBase = stripTrailingSlash(baseUrl || BASE_URL);
    headers["Accept"] = headers["Accept"] || "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8";
    headers["Accept-Language"] = headers["Accept-Language"] || "vi-VN,vi;q=0.9,en-US;q=0.8,en;q=0.7";
    headers["User-Agent"] = headers["User-Agent"] || DESKTOP_UA;
    headers["Referer"] = headers["Referer"] ? sameSourceUrl(headers["Referer"], targetBase) : targetBase + "/";
    if (headers["Origin"]) headers["Origin"] = targetBase;
    options.headers = headers;
    return options;
}

function request(url, options) {
    let urls = candidateUrls(url);
    let lastResponse = null;
    for (let i = 0; i < urls.length; i++) {
        let target = urls[i];
        let base = hostBase(target) || BASE_URL;
        try {
            let response = fetch(target, requestOptions(options, base));
            lastResponse = response;
            if (response.ok) {
                if (hostBase(target)) setBaseUrl(responseBase(response, base));
                return response;
            }
        } catch (error) {
        }
    }
    if (lastResponse) return lastResponse;
    return fetch(normalizeUrl(url), requestOptions(options, BASE_URL));
}

function isChallenge(doc) {
    if (!doc) return true;
    let html = doc.html ? doc.html() : "";
    let title = cleanText(doc.select("title").text());
    return title.indexOf("Just a moment") >= 0 ||
        html.indexOf("cf-chl") >= 0 ||
        html.indexOf("__cf_chl_") >= 0 ||
        html.indexOf("Enable JavaScript and cookies") >= 0;
}

function getDoc(url, options) {
    let urls = candidateUrls(url);
    for (let i = 0; i < urls.length; i++) {
        let target = urls[i];
        let base = hostBase(target) || BASE_URL;
        try {
            let response = fetch(target, requestOptions(options, base));
            if (!response.ok) continue;
            let doc = response.html();
            if (isChallenge(doc)) continue;
            if (hostBase(target)) setBaseUrl(responseBase(response, base));
            return doc;
        } catch (error) {
        }
    }
    return browserDoc(url);
}

function browserDoc(url) {
    let browser = null;
    try {
        browser = Engine.newBrowser();
        try { browser.setUserAgent(ANDROID_UA); } catch (uaError) {
            try { browser.setUserAgent(UserAgent.android()); } catch (error) {}
        }
        let doc = browser.launch(normalizeUrl(url), 45000);
        for (let i = 0; i < 5 && isChallenge(doc); i++) {
            sleep(3000);
            doc = browser.html();
        }
        return isChallenge(doc) ? null : doc;
    } catch (error) {
        return null;
    } finally {
        try { if (browser) browser.close(); } catch (closeError) {}
    }
}

function sourceCookie() {
    let cookie = "";
    try { if (CONFIG_URL) cookie = localCookie.getCookie(CONFIG_URL); } catch (error) {}
    if (!cookie) try { cookie = localCookie.getCookie(SOURCE_URL); } catch (error) {}
    if (!cookie) try { cookie = localCookie.getCookie(BASE_URL); } catch (error) {}
    if (!cookie) try { cookie = localCookie.getCookie(BASE_URL + "/"); } catch (error) {}
    if (!cookie) try { cookie = localCookie.getCookie(); } catch (error) {}
    return cookie || "";
}

function pathOf(url) {
    url = normalizeUrl(url || "");
    let match = /^https?:\/\/[^/]+(\/[^?#]*)?/i.exec(url);
    return match && match[1] ? match[1] : "/";
}

function storySlug(url) {
    let path = pathOf(url).replace(/\/+$/, "");
    let match = /^\/truyen-tranh\/([^/?#]+)/i.exec(path);
    if (!match) return "";
    return match[1].replace(/-\d+$/, "");
}

function chapterNumber(text) {
    text = foldText(text || "").replace(/_/g, "-");
    let match = /(?:chuong|chapter|chap|ch\.?)\s*-?\s*(\d+(?:[.-]\d+)?)/i.exec(text);
    if (!match) match = /(\d+(?:[.-]\d+)?)/.exec(text);
    return match ? parseFloat(match[1].replace("-", ".")) : 0;
}

function imageAttr(e) {
    if (!e) return "";
    let srcset = e.attr("data-srcset") || e.attr("srcset");
    if (srcset) return cleanText(srcset.split(",")[0].split(" ")[0]);
    return e.attr("data-original") ||
        e.attr("data-src") ||
        e.attr("data-lazy-src") ||
        e.attr("data-cdn") ||
        e.attr("src") ||
        "";
}

function validImage(url) {
    url = normalizeImage(url);
    if (!url || url.indexOf("data:image") === 0) return false;
    if (!/\.(jpg|jpeg|png|webp|gif)(?:[?#].*)?$/i.test(url)) return false;
    let low = url.toLowerCase();
    return low.indexOf("/favicon") < 0 &&
        low.indexOf("/logo") < 0 &&
        low.indexOf("/scripts/") < 0 &&
        low.indexOf("/content/images/logo") < 0 &&
        low.indexOf("/content/images/avata") < 0 &&
        low.indexOf("banner") < 0 &&
        low.indexOf("loading") < 0;
}

function imageHeaders(referer) {
    return {
        "Referer": normalizeUrl(referer || BASE_URL + "/"),
        "Origin": BASE_URL,
        "User-Agent": DESKTOP_UA,
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
        "User-Agent": DESKTOP_UA
    };
}

function addQuery(url, key, value) {
    url = normalizeUrl(url);
    if (value === null || value === undefined || value === "") return url;
    let hash = "";
    let hashIndex = url.indexOf("#");
    if (hashIndex >= 0) {
        hash = url.substring(hashIndex);
        url = url.substring(0, hashIndex);
    }
    let parts = url.split("?");
    let base = parts[0];
    let query = parts.length > 1 && parts[1] ? parts[1].split("&") : [];
    let found = false;
    for (let i = 0; i < query.length; i++) {
        if (query[i].split("=")[0] === key) {
            query[i] = key + "=" + encodeURIComponent(value);
            found = true;
        }
    }
    if (!found) query.push(key + "=" + encodeURIComponent(value));
    return base + "?" + query.join("&") + hash;
}

function execute() {
    return Response.success({baseUrl: BASE_URL, sourceUrl: SOURCE_URL, ok: true});
}
