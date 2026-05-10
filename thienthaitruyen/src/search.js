let BASE_URL = "https://thienthaitruyen8.com";
try {
    if (CONFIG_URL) BASE_URL = CONFIG_URL.replace(/\/official\/?$/i, "").replace(/\/+$/, "");
} catch (error) {
}

let OFFICIAL_URL = BASE_URL + "/official";
let DESKTOP_UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36";

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

function foldText(text) {
    text = cleanText(text).toLowerCase();
    try {
        text = text.normalize("NFD").replace(/[\u0300-\u036f]/g, "");
    } catch (error) {
    }
    return text.replace(/\u0111/g, "d").replace(/\u0110/g, "d");
}

function normalizeUrl(url) {
    if (!url) return "";
    url = decodeHtml(url).trim();
    if (url.startsWith("//")) return "https:" + url;
    if (url.startsWith("/")) return stripTrailingSlash(BASE_URL) + url;
    if (!/^https?:\/\//i.test(url)) return stripTrailingSlash(BASE_URL) + "/" + url.replace(/^\/+/, "");
    return url;
}

function normalizeImage(url) {
    if (!url) return "";
    url = decodeHtml(url).trim();
    if (url.startsWith("//")) return "https:" + url;
    if (url.startsWith("/")) return stripTrailingSlash(BASE_URL) + url;
    return url;
}

function request(url, options) {
    options = options || {};
    let targetUrl = normalizeUrl(url);
    let headers = options.headers || {};
    headers["Accept"] = headers["Accept"] || "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8";
    headers["Accept-Language"] = headers["Accept-Language"] || "vi-VN,vi;q=0.9,en-US;q=0.8,en;q=0.7";
    headers["Referer"] = headers["Referer"] || OFFICIAL_URL;
    headers["User-Agent"] = headers["User-Agent"] || DESKTOP_UA;
    options.headers = headers;
    return fetch(targetUrl, options);
}

function hostBase(url) {
    let match = /^(https?:\/\/(?:www\.)?thienthaitruyen\d+\.com)/i.exec(url || "");
    return match ? match[1].replace(/\/+$/, "") : "";
}

function setBaseUrl(baseUrl) {
    if (!baseUrl) return;
    BASE_URL = stripTrailingSlash(baseUrl);
    OFFICIAL_URL = BASE_URL + "/official";
}

function candidateUrls(url) {
    let normalized = normalizeUrl(url);
    let urls = [normalized];
    if (!/^https?:\/\/(?:www\.)?thienthaitruyen\d+\.com/i.test(normalized)) return urls;
    for (let i = 8; i <= 99; i++) {
        let next = normalized.replace(/^https?:\/\/(?:www\.)?thienthaitruyen\d+\.com/i, "https://thienthaitruyen" + i + ".com");
        if (urls.indexOf(next) < 0) urls.push(next);
    }
    return urls;
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

function getDoc(url) {
    let urls = candidateUrls(url);
    for (let i = 0; i < urls.length; i++) {
        try {
            let response = request(urls[i]);
            if (response.ok) {
                let doc = response.html();
                if (!isChallenge(doc)) {
                    let host = hostBase(urls[i]);
                    if (host) setBaseUrl(host);
                    return doc;
                }
            }
        } catch (error) {
        }
    }
    return null;
}

function pathOf(url) {
    url = normalizeUrl(url);
    let match = /^https?:\/\/[^/]+(\/[^?#]*)?/i.exec(url);
    return match && match[1] ? match[1] : "/";
}

function isStoryUrl(url) {
    let path = pathOf(url).replace(/\/+$/, "");
    return /^\/truyen-tranh\/[^/]+$/i.test(path);
}

function storyUrlFromAny(url) {
    url = normalizeUrl(url);
    return url.replace(/\/chuong-[^/?#]+\/?(?:[?#].*)?$/i, "");
}

function storySlug(url) {
    let match = /\/truyen-tranh\/([^/?#]+)/i.exec(normalizeUrl(storyUrlFromAny(url)));
    return match ? match[1] : "";
}

function imageAttr(e) {
    if (!e) return "";
    let srcset = e.attr("data-srcset") || e.attr("srcset");
    if (srcset) return cleanText(srcset.split(",")[0].split(" ")[0]);
    return e.attr("data-original") || e.attr("data-src") || e.attr("data-lazy-src") || e.attr("src");
}

function validImage(url) {
    url = normalizeImage(url);
    if (!url || url.indexOf("data:image") === 0) return false;
    if (!/\.(jpg|jpeg|png|webp)(?:[?#].*)?$/i.test(url)) return false;
    let low = url.toLowerCase();
    return low.indexOf("/logo") < 0 &&
        low.indexOf("/icons/") < 0 &&
        low.indexOf("star") < 0 &&
        low.indexOf("crown") < 0 &&
        low.indexOf("banner") < 0 &&
        low.indexOf("loading") < 0 &&
        low.indexOf("thumb-default") < 0 &&
        low.indexOf("thumb-loading") < 0 &&
        low.indexOf("og-image") < 0;
}

function imageForSlug(doc, slug) {
    let result = {url: "", alt: ""};
    if (!doc || !slug) return result;
    let nodes = doc.select("img[src], img[data-src], img[data-original], img[data-lazy-src]");
    for (let i = 0; i < nodes.size(); i++) {
        let img = nodes.get(i);
        let url = normalizeImage(imageAttr(img));
        if (!validImage(url)) continue;
        if (url.indexOf("/" + slug + "/") < 0) continue;
        result.url = url;
        result.alt = cleanText(img.attr("alt") || img.attr("title"));
        return result;
    }
    return result;
}

function cleanTitle(text) {
    text = cleanText(text || "");
    text = text.replace(/^Trending\s*-\s*/i, "");
    text = text.replace(/^.*?truy.n\s+/i, "");
    text = text.replace(/\s+Thi.n\s+Thai\s+Truy.n.*$/i, "");
    text = text.replace(/\s+Ch\S*ng\s+\d+(?:[.,]\d+)?.*$/i, "");
    text = text.replace(/^(?:manga|manhwa|manhua|damconuong|cmanga|sayhentai|hanul|thegioisach|truyenvn|manhwax)\s+/i, "");
    return cleanText(text);
}

function titleLooksBad(text) {
    let folded = foldText(text || "");
    return !text || text.length > 90 || folded.indexOf("chuong ") >= 0 || folded.indexOf("dang ra ") === 0 || folded.indexOf("hoan thanh ") === 0;
}

function titleFromSlug(slug) {
    let parts = (slug || "").split("-");
    for (let i = 0; i < parts.length; i++) {
        if (parts[i]) parts[i] = parts[i].charAt(0).toUpperCase() + parts[i].slice(1);
    }
    return parts.join(" ");
}

function pageNumberFromUrl(url) {
    let match = /[?&]page=(\d+)/i.exec(url || "");
    return match ? parseInt(match[1]) : 1;
}

function nextPage(doc, currentUrl) {
    let current = pageNumberFromUrl(currentUrl || "");
    let best = 0;
    let bestHref = "";
    let links = doc.select("a[href*='page=']");
    for (let i = 0; i < links.size(); i++) {
        let href = normalizeUrl(links.get(i).attr("href"));
        let p = pageNumberFromUrl(href);
        if (p > current && (!best || p < best)) {
            best = p;
            bestHref = href;
        }
    }
    return bestHref;
}

function comicFromLink(doc, a) {
    let href = a.attr("href");
    let link = normalizeUrl(href);
    let slug = storySlug(link);
    let image = imageForSlug(doc, slug);
    let name = cleanTitle(a.attr("title") || a.text());
    let altName = cleanTitle(image.alt);
    if (titleLooksBad(name) && altName) name = altName;
    if (!name) name = altName || titleFromSlug(slug);

    return {
        name: name,
        link: link,
        cover: image.url,
        description: "",
        host: BASE_URL
    };
}

function parseListPage(doc) {
    let data = [];
    let seen = {};
    let links = doc.select("a[href*='/truyen-tranh/']");
    for (let i = 0; i < links.size(); i++) {
        let a = links.get(i);
        let href = a.attr("href");
        if (!isStoryUrl(href)) continue;
        let item = comicFromLink(doc, a);
        if (!item.name || seen[item.link]) continue;
        seen[item.link] = data.length + 1;
        data.push(item);
    }
    return data;
}

function execute(key, page) {
    let requestUrl = BASE_URL + "/tim-kiem-nang-cao?name=" + encodeURIComponent(key || "");
    if (page && page !== "1") {
        if (("" + page).indexOf("http") === 0 || ("" + page).indexOf("/") === 0) requestUrl = normalizeUrl(page);
        else requestUrl += "&page=" + encodeURIComponent(page);
    }
    let doc = getDoc(requestUrl);
    if (!doc) return Response.success([], "");
    return Response.success(parseListPage(doc), nextPage(doc, requestUrl));
}
