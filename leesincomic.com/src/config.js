let BASE_URL = "https://leesincomic.com";
try {
    if (CONFIG_URL) {
        BASE_URL = ("" + CONFIG_URL).replace(/\/+$/, "");
    }
} catch (error) {
}

let DESKTOP_UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36";
let MOBILE_UA = "Mozilla/5.0 (Linux; Android 12; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Mobile Safari/537.36";

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
    if (!url) return url;
    url = cleanText(("" + url).replace(/&amp;/g, "&"));
    if (url.indexOf("//") === 0) return "https:" + url;
    if (url.indexOf("/") === 0) return stripTrailingSlash(BASE_URL) + url;
    if (!/^https?:\/\//i.test(url)) return stripTrailingSlash(BASE_URL) + "/" + url.replace(/^\/+/, "");
    return url.replace(/^https?:\/\/(?:www\.)?leesincomic\.com/i, stripTrailingSlash(BASE_URL));
}

function normalizeImage(url) {
    if (!url) return "";
    url = cleanText(("" + url).replace(/&amp;/g, "&"));
    if (!url || url.indexOf("data:image") === 0) return "";
    if (url.indexOf("//") === 0) return "https:" + url;
    if (url.indexOf("/") === 0) return stripTrailingSlash(BASE_URL) + url;
    if (!/^https?:\/\//i.test(url)) return stripTrailingSlash(BASE_URL) + "/" + url.replace(/^\/+/, "");
    return url;
}

function isBadImage(url) {
    url = normalizeImage(url);
    if (!url) return true;
    return url.indexOf("/images/loadx") >= 0 ||
        url.indexOf("/loading.gif") >= 0 ||
        url.indexOf("/logo.png") >= 0 ||
        url.indexOf("no-images") >= 0 ||
        url.indexOf("no_image") >= 0 ||
        url.indexOf("placeholder") >= 0;
}

function firstGoodImage(items) {
    let fallback = "";
    for (let i = 0; i < items.length; i++) {
        let url = normalizeImage(items[i]);
        if (!url) continue;
        if (!fallback) fallback = url;
        if (!isBadImage(url)) return url;
    }
    return fallback;
}

function imageAttr(node) {
    if (!node) return "";
    let srcset = node.attr("data-srcset") || node.attr("srcset");
    if (srcset) {
        let first = cleanText(srcset.split(",")[0]);
        if (first) return cleanText(first.split(" ")[0]);
    }
    return node.attr("data-src") ||
        node.attr("data-original") ||
        node.attr("data-lazy-src") ||
        node.attr("data-url") ||
        node.attr("src") ||
        node.attr(":src") ||
        "";
}

function imageFromNode(node) {
    if (!node) return "";
    return firstGoodImage([
        imageAttr(node),
        node.attr("data-fb"),
        node.attr("data-ni"),
        node.attr("src")
    ]);
}

function request(url) {
    return fetch(normalizeUrl(url), {
        headers: {
            "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
            "Accept-Language": "vi-VN,vi;q=0.9,en-US;q=0.8,en;q=0.7",
            "Referer": BASE_URL + "/",
            "User-Agent": DESKTOP_UA
        }
    });
}

function postForm(url, body, referer) {
    return fetch(normalizeUrl(url), {
        method: "POST",
        headers: {
            "Accept": "application/json, text/plain, */*",
            "Accept-Language": "vi-VN,vi;q=0.9,en-US;q=0.8,en;q=0.7",
            "Content-Type": "application/x-www-form-urlencoded; charset=UTF-8",
            "Origin": BASE_URL,
            "Referer": referer || BASE_URL + "/",
            "User-Agent": MOBILE_UA,
            "X-Requested-With": "XMLHttpRequest"
        },
        body: body || {}
    });
}

function getDoc(url) {
    try {
        let response = request(url);
        if (response.ok) return response.html();
    } catch (error) {
    }
    return null;
}

function pathOf(url) {
    url = normalizeUrl(url);
    let match = /^https?:\/\/[^/]+(\/[^?#]*)?/i.exec(url);
    return match && match[1] ? match[1] : "/";
}

function isChapterUrl(url) {
    let path = pathOf(url).replace(/\/+$/, "");
    return /^\/truyen-tranh\/[^/?#]+\/[^/?#]+\.html$/i.test(path);
}

function isStoryUrl(url) {
    let path = pathOf(url).replace(/\/+$/, "");
    if (!path || isChapterUrl(url)) return false;
    return /^\/truyen-tranh\/[^/?#]+\.html$/i.test(path);
}

function storyUrlFromChapter(url) {
    url = normalizeUrl(url);
    if (!isChapterUrl(url)) return url;
    return url.replace(/(\/truyen-tranh\/[^/?#]+)\/[^/?#]+\.html([?#].*)?$/i, "$1.html");
}

function addQuery(url, key, value) {
    if (value === null || value === undefined || value === "") return url;
    let parts = (url || "").split("?");
    let base = parts[0];
    let pairs = parts.length > 1 ? parts[1].split("&") : [];
    let out = [];
    let found = false;
    for (let i = 0; i < pairs.length; i++) {
        if (!pairs[i]) continue;
        let name = pairs[i].split("=")[0];
        if (name === key) {
            out.push(key + "=" + encodeURIComponent(value));
            found = true;
        } else {
            out.push(pairs[i]);
        }
    }
    if (!found) out.push(key + "=" + encodeURIComponent(value));
    return base + "?" + out.join("&");
}

function listPageUrl(url, page) {
    if (!page || page === "1") return normalizeUrl(url || "/");
    if (("" + page).indexOf("http") === 0 || ("" + page).indexOf("/") === 0) return normalizeUrl(page);
    return addQuery(normalizeUrl(url || "/"), "page", page);
}

function nextPage(doc, currentUrl) {
    let nextNode = doc.select(".page_redirect a.active + a, .pagination a.active + a, .pagination a[rel=next], a.next").first();
    if (nextNode) {
        let href = nextNode.attr("href");
        if (href && href !== "#") return normalizeUrl(href);
    }

    let currentPage = 1;
    let match = /[?&]page=(\d+)/i.exec(currentUrl || "");
    if (match) currentPage = parseInt(match[1], 10);

    let links = doc.select(".page_redirect a, .pagination a, nav a");
    for (let i = 0; i < links.size(); i++) {
        let link = links.get(i);
        let text = cleanText(link.text());
        if (!/^\d+$/.test(text)) continue;
        let page = parseInt(text, 10);
        if (page <= currentPage) continue;
        let href = link.attr("href");
        if (href && href !== "#") return normalizeUrl(href);
        return text;
    }
    return "";
}

function firstText(doc, selectors) {
    for (let i = 0; i < selectors.length; i++) {
        let node = doc.select(selectors[i]).first();
        let text = node ? cleanText(node.text()) : "";
        if (text) return text;
    }
    return "";
}

function firstHtml(doc, selectors) {
    for (let i = 0; i < selectors.length; i++) {
        let node = doc.select(selectors[i]).first();
        if (node) {
            let html = cleanText(node.html());
            if (html) return node.html();
        }
    }
    return "";
}

function chapterNumber(text) {
    let value = cleanText(text || "");
    let match = /(?:chapter|chap|chuong|ch\.?)\s*-?\s*(\d+(?:[-.]\d+)?)/i.exec(value);
    if (!match) match = /\/(?:chap(?:ter)?-)?(\d+(?:[-.]\d+)?)\.html/i.exec(value);
    if (!match) match = /\/-(\d+(?:[-.]\d+)?)\.html/i.exec(value);
    if (!match) match = /\/(\d+(?:[-.]\d+)?)\.html/i.exec(value);
    if (!match) match = /(\d+(?:\.\d+)?)\s*$/i.exec(value);
    return match ? parseFloat(match[1].replace("-", ".")) : 0;
}
