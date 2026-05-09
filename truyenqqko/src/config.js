let BASE_URL = 'https://truyenqqko.com';
try {
    if (CONFIG_URL) {
        BASE_URL = CONFIG_URL;
    }
} catch (error) {
}

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
    return url.replace(/\/+$/, "");
}

function normalizeUrl(url) {
    if (!url) return url;
    url = ("" + url).replace(/&amp;/g, "&").trim();
    if (url.startsWith("//")) return "https:" + url;
    if (url.startsWith("/")) return stripTrailingSlash(BASE_URL) + url;
    if (!/^https?:\/\//i.test(url)) return stripTrailingSlash(BASE_URL) + "/" + url.replace(/^\/+/, "");
    return url.replace(/^(?:https?:\/\/)?(?:[^@\n]+@)?(?:www\.)?([^:\/\n?]+)/img, stripTrailingSlash(BASE_URL));
}

function normalizeImage(url) {
    if (!url) return "";
    url = ("" + url).replace(/&amp;/g, "&").trim();
    if (url.startsWith("//")) return "https:" + url;
    if (url.startsWith("/")) return stripTrailingSlash(BASE_URL) + url;
    if (!/^https?:\/\//i.test(url)) return stripTrailingSlash(BASE_URL) + "/" + url.replace(/^\/+/, "");
    return url;
}

function isBadImage(url) {
    url = normalizeImage(url);
    if (!url) return true;
    return url.indexOf("/files/images/no_image") >= 0 ||
        url.indexOf("/template/frontend/images/og-image") >= 0 ||
        url.indexOf("/template/frontend/images/logo") >= 0 ||
        url.indexOf("no_image") >= 0 ||
        url.indexOf("loading") >= 0;
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

function imageFromNode(node) {
    if (!node) return "";
    return firstGoodImage([
        node.attr("src"),
        node.attr("data-original"),
        node.attr("data-src"),
        node.attr("data-lazy-src"),
        node.attr("data-fb"),
        node.attr("data-ni")
    ]);
}

function isProxyCover(url) {
    return !!url && normalizeImage(url).indexOf(stripTrailingSlash(BASE_URL) + "/img/") === 0;
}

function metaCover(doc) {
    let first = "";
    let metas = doc.select("meta[itemprop=image], meta[property=og:image], meta[property='og:image:secure_url'], meta[name=twitter:image], meta[name=thumbnail]");
    for (let i = 0; i < metas.size(); i++) {
        let cover = normalizeImage(metas.get(i).attr("content"));
        if (!first && cover) first = cover;
        if (isProxyCover(cover)) return cover;
    }
    return first;
}

function detailCover(url) {
    let doc = getDoc(url);
    if (!doc) return "";
    let cover = metaCover(doc);
    if (cover) return cover;
    return normalizeImage(imageFromNode(doc.select(".book_avatar img, img[itemprop=image], .story-cover img, .thumb img").first()));
}

function request(url) {
    return fetch(normalizeUrl(url), {
        headers: {
            "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
            "Accept-Language": "vi-VN,vi;q=0.9,en-US;q=0.8,en;q=0.7",
            "Referer": "https://truyenqqviet.com/",
            "User-Agent": "Mozilla/5.0 (Linux; Android 12; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0 Mobile Safari/537.36"
        }
    });
}

function isChallenge(doc) {
    if (!doc) return true;
    let html = doc.html ? doc.html() : "";
    let title = cleanText(doc.select("title").text());
    return title.indexOf("Just a moment") >= 0 ||
        html.indexOf("cf-chl") >= 0 ||
        html.indexOf("__cf_chl_") >= 0 ||
        html.indexOf("window._cf_chl_opt") >= 0 ||
        html.indexOf("Enable JavaScript and cookies") >= 0;
}

function browserDoc(url) {
    try {
        let browser = Engine.newBrowser();
        browser.setUserAgent(UserAgent.android());
        let doc = browser.launch(normalizeUrl(url), 30000);
        for (let i = 0; i < 4 && isChallenge(doc); i++) {
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
    return /\/truyen-tranh\/[0-9a-z-]+-\d+-chap-\d+(?:-\d+)?$/i.test(path);
}

function isStoryUrl(url) {
    if (!url) return false;
    let path = pathOf(url).replace(/\/+$/, "");
    if (!path || path === "") return false;
    if (isChapterUrl(url)) return false;
    return /^\/truyen-tranh\/[0-9a-z-]+-\d+$/i.test(path);
}

function listPageUrl(url, page) {
    if (!page || page === "1") return normalizeUrl(url || "/");
    if (("" + page).indexOf("http") === 0 || ("" + page).indexOf("/") === 0) {
        return normalizeUrl(page);
    }

    let requestUrl = stripTrailingSlash(normalizeUrl(url || "/"));
    if (requestUrl.indexOf("?") >= 0) return requestUrl + "&page=" + page;
    return requestUrl + "/trang-" + page;
}

function nextPage(doc, page) {
    let nextNode = doc.select(".page_redirect a:has(p.active) + a, .page_redirect a:has(.active) + a, .pagination li.active + li a, .pagination a[rel=next], .pagination a.next, a.next").first();
    if (!nextNode) {
        let current = parseFloat(page || "1");
        let links = doc.select(".page_redirect a, .pagination a, nav a");
        for (let i = 0; i < links.size(); i++) {
            let text = cleanText(links.get(i).text());
            if (/^\d+$/.test(text) && parseFloat(text) > current) return text;
        }
        return "";
    }

    let href = nextNode.attr("href");
    if (href && href !== "#") return normalizeUrl(href);

    let text = cleanText(nextNode.text());
    return /^\d+$/.test(text) ? text : "";
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
        let html = node ? cleanText(node.html()) : "";
        if (html) return node.html();
    }
    return "";
}

function execute() {
    return Response.success({
        baseUrl: BASE_URL,
        ok: true
    });
}
