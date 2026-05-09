let BASE_URL = 'https://luvevalands2.co';
try {
    if (CONFIG_URL) BASE_URL = CONFIG_URL;
} catch (error) {
}

let MOBILE_UA = "Mozilla/5.0 (Linux; Android 12; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0 Mobile Safari/537.36";

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
    url = url.replace(/^https?:\/\/(?:www\.)?luvevalands2\.co/i, stripTrailingSlash(BASE_URL));
    url = url.replace(/^https?:\/\/(?:www\.)?luvevaland\.co/i, stripTrailingSlash(BASE_URL));
    return url;
}

function normalizeImage(url) {
    if (!url) return "";
    url = ("" + url).replace(/&amp;/g, "&").trim();
    if (url.startsWith("//")) return "https:" + url;
    if (url.startsWith("/")) return stripTrailingSlash(BASE_URL) + url;
    if (!/^https?:\/\//i.test(url)) return stripTrailingSlash(BASE_URL) + "/" + url.replace(/^\/+/, "");
    return url.replace(/^https?:\/\/cdn\.lustaveland\.com/i, "https://picevaland.xyz");
}

function request(url, options) {
    options = options || {};
    let headers = options.headers || {};
    headers["Accept"] = headers["Accept"] || "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8";
    headers["Accept-Language"] = headers["Accept-Language"] || "vi-VN,vi;q=0.9,en-US;q=0.8,en;q=0.7";
    headers["Referer"] = headers["Referer"] || BASE_URL + "/";
    headers["User-Agent"] = headers["User-Agent"] || MOBILE_UA;
    options.headers = headers;
    return fetch(normalizeUrl(url), options);
}

function hasSiteContent(doc) {
    if (!doc) return false;
    return doc.select(".book-vertical__item, .book__list-item, .book__detail-container, .chapter-content, .list-chapter, .header__logo-container").size() > 0;
}

function isChallenge(doc) {
    if (!doc) return true;
    if (hasSiteContent(doc)) return false;
    let html = doc.html ? doc.html() : "";
    let title = cleanText(doc.select("title").text());
    return title.indexOf("Just a moment") >= 0 ||
        html.indexOf("cf-chl") >= 0 ||
        html.indexOf("__cf_chl_") >= 0 ||
        html.indexOf("window._cf_chl_opt") >= 0 ||
        html.indexOf("challenge-platform") >= 0 ||
        html.indexOf("cf_clearance") >= 0 ||
        html.indexOf("Enable JavaScript and cookies") >= 0 ||
        html.indexOf("window.location.href") >= 0;
}

function browserDoc(url) {
    try {
        let browser = Engine.newBrowser();
        browser.setUserAgent(UserAgent.android());
        let doc = browser.launch(normalizeUrl(url), 30000);
        for (let i = 0; i < 5 && isChallenge(doc); i++) {
            sleep(4000);
            doc = browser.html();
        }
        browser.close();
        return isChallenge(doc) ? null : doc;
    } catch (error) {
        return null;
    }
}

function getDoc(url) {
    url = normalizeUrl(url);
    try {
        let response = request(url);
        if (response.ok) {
            let doc = response.html();
            if (!isChallenge(doc)) return doc;
        }
    } catch (error) {
    }
    return browserDoc(url);
}

function pathOf(url) {
    url = normalizeUrl(url);
    let match = /^https?:\/\/[^/]+(\/[^?#]*)?/i.exec(url);
    return match && match[1] ? match[1] : "/";
}

function isChapterUrl(url) {
    let path = pathOf(url).replace(/\/+$/, "");
    return /^\/truyen-tranh\/[^/]+\.\d+\/chap-[^/]+\.\d+$/i.test(path);
}

function isStoryUrl(url) {
    let path = pathOf(url).replace(/\/+$/, "");
    return /^\/truyen-tranh\/[^/]+\.\d+$/i.test(path);
}

function storyUrlFromAny(url) {
    url = normalizeUrl(url);
    return url.replace(/\/chap-[^/?#]+\.\d+\/?(?:[?#].*)?$/i, "");
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

function labelValue(doc, label) {
    let target = foldText(label);
    let nodes = doc.select(".book__detail-text, .detail__info, li, p");
    for (let i = 0; i < nodes.size(); i++) {
        let text = cleanText(nodes.get(i).text());
        let folded = foldText(text);
        if (folded.indexOf(target + ":") === 0 || folded.indexOf(target + " ") === 0) {
            return cleanText(text.replace(/^[^:]+:\s*/, ""));
        }
    }
    return "";
}

function pageNumberFromUrl(url) {
    let match = /[?&]page=(\d+)/i.exec(url || "");
    return match ? parseInt(match[1]) : 1;
}

function addPageParam(url, page) {
    url = normalizeUrl(url);
    if (!page || page === "1") return url;
    if (("" + page).indexOf("http") === 0 || ("" + page).indexOf("/") === 0) return normalizeUrl(page);
    if (/[?&]page=\d+/i.test(url)) return url.replace(/([?&]page=)\d+/i, "$1" + page);
    return url + (url.indexOf("?") >= 0 ? "&" : "?") + "page=" + encodeURIComponent(page);
}

function listPageUrl(url, page) {
    if (!url) url = "/";
    return addPageParam(url, page);
}

function nextPage(doc, currentUrl) {
    let rel = doc.select(".pagination a[rel=next][href], a[rel=next][href]").first();
    if (rel) return normalizeUrl(rel.attr("href"));

    let current = pageNumberFromUrl(currentUrl || "");
    let best = 0;
    let bestHref = "";
    let links = doc.select(".pagination a[href*='page='], a.page-link[href*='page=']");
    for (let i = 0; i < links.size(); i++) {
        let href = links.get(i).attr("href");
        let p = pageNumberFromUrl(href);
        if (p > current && (!best || p < best)) {
            best = p;
            bestHref = href;
        }
    }
    return bestHref ? normalizeUrl(bestHref) : "";
}

function chapterNumber(text) {
    let folded = foldText(text || "");
    let match = /chap[-\s]*(\d+(?:[.-]\d+)?)/i.exec(folded);
    if (!match) match = /chuong[-\s]*(\d+(?:[.-]\d+)?)/i.exec(folded);
    if (!match) match = /(\d+(?:[.-]\d+)?)/.exec(folded);
    return match ? parseFloat(match[1].replace("-", ".")) : 0;
}

function imageHeaders(url) {
    return {
        "Referer": normalizeUrl(url),
        "User-Agent": MOBILE_UA
    };
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

function execute() {
    return Response.success({baseUrl: BASE_URL, ok: true});
}