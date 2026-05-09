let BASE_URL = 'https://hongtrateam.com';
try {
    if (CONFIG_URL) BASE_URL = CONFIG_URL;
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
    return ("" + url).replace(/\/+$/, "");
}

function normalizeUrl(url) {
    if (!url) return "";
    url = ("" + url).replace(/&amp;/g, "&").trim();
    if (url.startsWith("//")) return "https:" + url;
    if (url.startsWith("/")) return stripTrailingSlash(BASE_URL) + url;
    if (!/^https?:\/\//i.test(url)) return stripTrailingSlash(BASE_URL) + "/" + url.replace(/^\/+/, "");
    return url.replace(/^http:\/\/hongtrateam\.com/i, BASE_URL);
}

function normalizeImage(url) {
    if (!url) return "";
    url = ("" + url).replace(/&amp;/g, "&").trim();
    if (url.startsWith("//")) return "https:" + url;
    if (url.startsWith("/")) return stripTrailingSlash(BASE_URL) + url;
    if (!/^https?:\/\//i.test(url)) return stripTrailingSlash(BASE_URL) + "/" + url.replace(/^\/+/, "");
    return url;
}

function request(url, options) {
    options = options || {};
    let headers = options.headers || {};
    headers["Accept"] = headers["Accept"] || "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8";
    headers["Accept-Language"] = headers["Accept-Language"] || "vi-VN,vi;q=0.9,en-US;q=0.8,en;q=0.7";
    headers["Referer"] = headers["Referer"] || BASE_URL + "/";
    headers["User-Agent"] = headers["User-Agent"] || "Mozilla/5.0 (Linux; Android 12; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0 Mobile Safari/537.36";
    options.headers = headers;
    return fetch(normalizeUrl(url), options);
}

function getDoc(url) {
    try {
        let response = request(url);
        if (response.ok) return response.html();
    } catch (error) {
    }
    return null;
}

function postText(url, body, referer) {
    let headers = {
        "Accept": "text/html, */*; q=0.01",
        "Content-Type": "application/x-www-form-urlencoded; charset=UTF-8",
        "Origin": BASE_URL,
        "Referer": referer || BASE_URL + "/",
        "X-Requested-With": "XMLHttpRequest"
    };
    return request(url, {
        method: "POST",
        headers: headers,
        body: body || ""
    }).text();
}

function pathOf(url) {
    url = normalizeUrl(url);
    let match = /^https?:\/\/[^/]+(\/[^?#]*)?/i.exec(url);
    return match && match[1] ? match[1] : "/";
}

function isStoryUrl(url) {
    let path = pathOf(url).replace(/\/+$/, "");
    return /^\/truyen\/[^/]+$/i.test(path);
}

function isChapterUrl(url) {
    let path = pathOf(url).replace(/\/+$/, "");
    return /^\/truyen\/[^/]+\/[^/]+$/i.test(path);
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

function firstText(node, selectors) {
    for (let i = 0; i < selectors.length; i++) {
        let e = node.select(selectors[i]).first();
        let text = e ? cleanText(e.text()) : "";
        if (text) return stripProtected(text);
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

function stripProtected(text) {
    return cleanText(text).replace(/^B\u1ea3o v\u1ec7:\s*/i, "");
}

function metaImage(doc) {
    let node = doc.select("meta[property=og:image], meta[property='og:image:secure_url'], meta[name=twitter:image], meta[itemprop=image]").first();
    return node ? normalizeImage(node.attr("content")) : "";
}

function detailCover(url) {
    let doc = getDoc(url);
    if (!doc) return "";
    let cover = metaImage(doc);
    if (cover) return cover;
    return imageFromNode(doc.select(".summary_image img, .profile-manga img, .item-thumb img").first());
}

function listPageUrl(url, page) {
    if (!url) url = "/";
    if (!page || page === "1") return normalizeUrl(url);
    if (("" + page).indexOf("http") === 0 || ("" + page).indexOf("/") === 0) return normalizeUrl(page);
    let base = stripTrailingSlash(normalizeUrl(url));
    return base + "/page/" + page + "/";
}

function nextPage(doc) {
    let selectors = [
        ".sfwppa-link-next[href]",
        "a.nextpostslink[href]",
        ".nav-previous a[href]",
        ".pagination a.next[href]",
        "a[rel=next][href]"
    ];
    for (let i = 0; i < selectors.length; i++) {
        let e = doc.select(selectors[i]).first();
        if (e) return normalizeUrl(e.attr("href"));
    }

    let links = doc.select("a[href*='/page/']");
    for (let j = 0; j < links.size(); j++) {
        let a = links.get(j);
        let text = foldText(a.text());
        let cls = foldText(a.attr("class"));
        if (text.indexOf("cu hon") >= 0 || text.indexOf("older") >= 0 || text === "?" || cls.indexOf("next") >= 0) {
            return normalizeUrl(a.attr("href"));
        }
    }
    return "";
}

function imageHeaders(url) {
    return {
        "Referer": normalizeUrl(url),
        "User-Agent": "Mozilla/5.0 (Linux; Android 12; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0 Mobile Safari/537.36"
    };
}

function execute() {
    return Response.success({ baseUrl: BASE_URL, ok: true });
}
