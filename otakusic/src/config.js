let BASE_URL = 'https://otakusic.com';
try {
    if (CONFIG_URL) {
        BASE_URL = ("" + CONFIG_URL).replace(/\/+$/, "");
    }
} catch (error) {
}

let API_URL = BASE_URL + "/api/v1";
let IMG_BASE = "https://img.otakusic.com";
let DESKTOP_UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36";
let ANDROID_UA = "Mozilla/5.0 (Linux; Android 12; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Mobile Safari/537.36";

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
    return url.replace(/^https?:\/\/(?:www\.)?otakusic\.com/i, stripTrailingSlash(BASE_URL));
}

function normalizeImage(url) {
    if (!url) return "";
    url = ("" + url).replace(/&amp;/g, "&").trim();
    if (url.indexOf("data:image") === 0) return "";
    if (url.startsWith("//")) return "https:" + url;
    url = url.replace(/^https?:\/\/(?:www\.)?otakusic\.com\/manga\//i, IMG_BASE + "/manga/");
    url = url.replace(/^https?:\/\/(?:www\.)?otakusic\.com\/uploads\//i, IMG_BASE + "/manga/uploads/");
    if (url.startsWith("/manga/")) return IMG_BASE + url;
    if (url.indexOf("manga/uploads/") === 0) return IMG_BASE + "/" + url;
    if (url.indexOf("uploads/chapter/") === 0 || url.indexOf("uploads/chapters/") === 0) return IMG_BASE + "/manga/" + url;
    if (url.startsWith("/")) return stripTrailingSlash(BASE_URL) + url;
    if (!/^https?:\/\//i.test(url)) return stripTrailingSlash(BASE_URL) + "/" + url.replace(/^\/+/, "");
    return url;
}

function isBadImage(url) {
    url = normalizeImage(url);
    if (!url) return true;
    return url.indexOf("no_image") >= 0 ||
        url.indexOf("loading") >= 0 ||
        url.indexOf("/logo") >= 0 ||
        url.indexOf("placeholder") >= 0;
}

function imageFromNode(node) {
    if (!node) return "";
    let candidates = [
        node.attr("src"),
        node.attr("data-src"),
        node.attr("data-original"),
        node.attr("data-lazy-src"),
        node.attr("data-url")
    ];
    for (let i = 0; i < candidates.length; i++) {
        let url = normalizeImage(candidates[i]);
        if (url && !isBadImage(url)) return url;
    }
    return normalizeImage(candidates[0]);
}

function imageAttr(node) {
    if (!node) return "";
    let srcset = node.attr("data-srcset") || node.attr("srcset");
    if (srcset) return cleanText(srcset.split(",")[0].split(" ")[0]);
    return node.attr("data-src") ||
        node.attr("data-original") ||
        node.attr("data-lazy-src") ||
        node.attr("data-url") ||
        node.attr("src") ||
        node.attr(":src");
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

function requestJson(url, referer) {
    return fetch(normalizeUrl(url), {
        headers: {
            "Accept": "application/json, text/plain, */*",
            "Accept-Language": "vi-VN,vi;q=0.9,en-US;q=0.8,en;q=0.7",
            "Referer": referer || BASE_URL + "/",
            "User-Agent": DESKTOP_UA,
            "X-Requested-With": "XMLHttpRequest"
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
    let browser = null;
    try {
        browser = Engine.newBrowser();
        try {
            browser.setUserAgent(ANDROID_UA);
        } catch (uaError) {
            try {
                browser.setUserAgent(UserAgent.android());
            } catch (error) {
            }
        }
        let doc = browser.launch(normalizeUrl(url), 30000);
        for (let i = 0; i < 4 && isChallenge(doc); i++) {
            sleep(4000);
            doc = browser.html();
        }
        return isChallenge(doc) ? null : doc;
    } catch (error) {
        return null;
    } finally {
        try {
            if (browser) browser.close();
        } catch (closeError) {
        }
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

function slugFromUrl(url) {
    let path = pathOf(url).replace(/\/+$/, "");
    let match = /\/chi-tiet\/([^/?#]+)/i.exec(path);
    if (match) return match[1];
    match = /\/doc-truyen\/([^/?#]+)\/[^/?#]+/i.exec(path);
    if (match) return match[1];
    match = /\/api\/v1\/manga\/([^/?#]+)\/[^/?#]+\/images/i.exec(path);
    return match ? match[1] : "";
}

function chapterSlugFromUrl(url) {
    let path = pathOf(url).replace(/\/+$/, "");
    let match = /\/doc-truyen\/[^/?#]+\/([^/?#]+)/i.exec(path);
    if (!match) match = /\/api\/v1\/manga\/[^/?#]+\/([^/?#]+)\/images/i.exec(path);
    return match ? match[1] : "";
}

function chapterUrl(mangaSlug, chapterSlug) {
    return BASE_URL + "/doc-truyen/" + mangaSlug + "/" + chapterSlug;
}

function storyUrl(slug) {
    return BASE_URL + "/chi-tiet/" + slug;
}

function extractSlug(url) {
    return slugFromUrl(url);
}

function isDetailUrl(url) {
    return /\/chi-tiet\/[^\/?#]+/i.test(url || "");
}

function addQuery(url, key, value) {
    if (value === null || value === undefined || value === "") return url;
    let parts = url.split("?");
    let base = parts[0];
    let query = parts.length > 1 ? parts[1].split("&") : [];
    let found = false;
    for (let i = 0; i < query.length; i++) {
        if (query[i].split("=")[0] === key) {
            query[i] = key + "=" + encodeURIComponent(value);
            found = true;
        }
    }
    if (!found) {
        query.push(key + "=" + encodeURIComponent(value));
    }
    return base + "?" + query.join("&");
}

function nextPage(doc, currentUrl) {
    let nextNode = doc.select("a[rel=next], .pagination a.next, .pagination li.active + li a, nav a[aria-label=Next]").first();
    if (nextNode) {
        let href = nextNode.attr("href");
        if (href && href !== "#" && href !== "javascript:void(0)") return normalizeUrl(href);
    }
    let links = doc.select(".pagination a, nav.pagination a, ul.pagination a");
    let currentPage = 1;
    let match = /[?&]page=(\d+)/i.exec(currentUrl || "");
    if (match) currentPage = parseInt(match[1]);
    for (let i = 0; i < links.size(); i++) {
        let link = links.get(i);
        let text = cleanText(link.text());
        if (/^\d+$/.test(text) && parseInt(text) > currentPage) {
            let href = link.attr("href");
            if (href && href !== "#") return normalizeUrl(href);
            return addQuery(currentUrl, "page", text);
        }
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
        let html = node ? cleanText(node.html()) : "";
        if (html) return node.html();
    }
    return "";
}

function readJson(response) {
    try {
        return response.json();
    } catch (error) {
        return null;
    }
}

function jsonRows(json) {
    if (!json) return [];
    if (json.data) {
        if (json.data.length !== undefined) return json.data;
        if (json.data.data && json.data.data.length !== undefined) return json.data.data;
    }
    if (json.images && json.images.length !== undefined) return json.images;
    if (json.items && json.items.length !== undefined) return json.items;
    if (json.length !== undefined) return json;
    return [];
}

function jsonHasMore(json, page, rows) {
    if (!json) return false;
    if (json.has_more !== undefined) return !!json.has_more;
    if (json.hasMore !== undefined) return !!json.hasMore;
    if (json.next_page_url) return true;
    if (json.data && json.data.next_page_url) return true;
    let current = parseInt(json.current_page || (json.data && json.data.current_page) || page);
    let last = parseInt(json.last_page || (json.data && json.data.last_page) || 0);
    if (last) return current < last;
    return rows && rows.length > 0;
}

function imageHeaders(referer) {
    return {
        "Referer": normalizeUrl(referer || BASE_URL + "/"),
        "Origin": BASE_URL,
        "User-Agent": DESKTOP_UA,
        "Accept": "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8"
    };
}

function execute() {
    return Response.success({
        baseUrl: BASE_URL,
        ok: true
    });
}
