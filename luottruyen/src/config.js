let BASE_URL = 'https://luottruyen7.com';
try {
    if (CONFIG_URL) {
        BASE_URL = stripTrailingSlash(CONFIG_URL);
    }
} catch (error) {
}

let DESKTOP_UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/142.0.0.0 Safari/537.36";
let SOURCE_HOST_RE = /^https?:\/\/(?:www\.)?luottruyen\d*\.com/i;

function stripTrailingSlash(url) {
    if (!url) return "";
    return ("" + url).replace(/\/+$/, "");
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
        .replace(/&gt;/g, ">");
}

function absoluteUrl(url) {
    if (!url) return "";
    url = decodeHtml(url).trim();
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
    return absoluteUrl(url).replace(SOURCE_HOST_RE, stripTrailingSlash(BASE_URL));
}

function hostBase(url) {
    let match = /^(https?:\/\/(?:www\.)?luottruyen\d*\.com)/i.exec(url || "");
    return match ? match[1].replace(/\/+$/, "") : "";
}

function sourceNumber() {
    let match = /luottruyen(\d*)\.com/i.exec(BASE_URL || "");
    if (!match || !match[1]) return 7;
    return parseInt(match[1]);
}

function setBaseUrl(baseUrl) {
    if (!baseUrl) return;
    BASE_URL = stripTrailingSlash(baseUrl);
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
    return null;
}

function resolveBaseUrl() {
    return !!getDoc(BASE_URL + "/tim-truyen");
}

function sourceCookie() {
    let cookie = "";
    try { cookie = localCookie.getCookie(BASE_URL); } catch (error) {}
    if (!cookie) {
        try { cookie = localCookie.getCookie(BASE_URL + "/"); } catch (error) {}
    }
    if (!cookie) {
        try { cookie = localCookie.getCookie(); } catch (error) {}
    }
    return cookie || "";
}
