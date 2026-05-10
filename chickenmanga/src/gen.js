var BASE_URL = "https://www.chickenmanga.com";
var DESKTOP_UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36";

function cleanText(text) {
    if (!text) return "";
    return decodeHtml(("" + text).replace(/<script[\s\S]*?<\/script>/gi, " ").replace(/<style[\s\S]*?<\/style>/gi, " ").replace(/<[^>]+>/g, " ")).replace(/\s+/g, " ").trim();
}

function decodeHtml(text) {
    if (!text) return "";
    return ("" + text)
        .replace(/&amp;/g, "&")
        .replace(/&lt;/g, "<")
        .replace(/&gt;/g, ">")
        .replace(/&quot;/g, '"')
        .replace(/&#39;/g, "'")
        .replace(/&nbsp;/g, " ")
        .replace(/&#(\d+);/g, function (_, n) {
            return String.fromCharCode(parseInt(n, 10));
        })
        .replace(/&#x([0-9a-f]+);/ig, function (_, n) {
            return String.fromCharCode(parseInt(n, 16));
        });
}

function normalizeUrl(url) {
    if (!url) return "";
    url = decodeHtml(url).trim();
    if (url.indexOf("//") === 0) return "https:" + url;
    if (url.indexOf("/") === 0) return BASE_URL + url;
    if (!/^https?:\/\//i.test(url)) return BASE_URL + "/" + url.replace(/^\/+/, "");
    return url;
}

function normalizeImage(url) {
    url = normalizeUrl(url);
    if (url.indexOf("data:image") === 0) return "";
    return url;
}

function headers(referer, accept) {
    return {
        "Accept": accept || "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
        "Referer": referer || BASE_URL + "/",
        "User-Agent": DESKTOP_UA
    };
}

function browserText(url) {
    var browser = null;
    try {
        if (typeof Engine === "undefined" || !Engine.newBrowser) return "";
        browser = Engine.newBrowser();
        try {
            browser.setUserAgent(DESKTOP_UA);
        } catch (uaError) {
        }
        var doc = browser.launch(url, 30000);
        try {
            sleep(1200);
            doc = browser.html();
        } catch (sleepError) {
        }
        return doc ? "" + doc : "";
    } catch (error) {
        return "";
    } finally {
        try {
            if (browser) browser.close();
        } catch (closeError) {
        }
    }
}

function requestText(url, referer) {
    try {
        var response = fetch(url, {headers: headers(referer)});
        if (response && response.ok) return response.text();
    } catch (error) {
    }
    return browserText(url);
}

function setParam(url, key, value) {
    url = normalizeUrl(url);
    var hash = "";
    var hashIndex = url.indexOf("#");
    if (hashIndex >= 0) {
        hash = url.substring(hashIndex);
        url = url.substring(0, hashIndex);
    }
    var qIndex = url.indexOf("?");
    var base = qIndex >= 0 ? url.substring(0, qIndex) : url;
    var query = qIndex >= 0 ? url.substring(qIndex + 1) : "";
    var parts = query ? query.split("&") : [];
    var out = [];
    var found = false;
    for (var i = 0; i < parts.length; i++) {
        if (!parts[i]) continue;
        var eq = parts[i].indexOf("=");
        var k = eq >= 0 ? decodeURIComponent(parts[i].substring(0, eq)) : decodeURIComponent(parts[i]);
        if (k === key) {
            found = true;
            if (value !== null && value !== "") out.push(encodeURIComponent(key) + "=" + encodeURIComponent(value));
        } else {
            out.push(parts[i]);
        }
    }
    if (!found && value !== null && value !== "") out.push(encodeURIComponent(key) + "=" + encodeURIComponent(value));
    return base + (out.length ? "?" + out.join("&") : "") + hash;
}

function ensureLang(url) {
    if (url.indexOf("ba_lang=") >= 0) return url;
    return setParam(url, "ba_lang", "vi");
}

function pageUrl(input, page) {
    var url = input || BASE_URL + "/classification/index?ba_lang=vi&redu_id=Truy%E1%BB%87n+m%E1%BB%9Bi+ra";
    if (url === "recent") url = BASE_URL + "/classification/index?ba_lang=vi&redu_id=Truy%E1%BB%87n+m%E1%BB%9Bi+ra";
    if (url === "hot") url = BASE_URL + "/classification/index?ba_lang=vi&redu_id=Truy%E1%BB%87n+hot";
    url = ensureLang(normalizeUrl(url));
    var p = parseInt(page || "1", 10);
    if (!p || p < 1) p = 1;
    if (p > 1) url = setParam(url, "page", "" + p);
    return url;
}

function firstAttr(block, names) {
    for (var i = 0; i < names.length; i++) {
        var re = new RegExp("\\s" + names[i] + "\\s*=\\s*['\"]([^'\"]+)['\"]", "i");
        var m = re.exec(block);
        if (m) return decodeHtml(m[1]);
    }
    return "";
}

function classText(block, className) {
    var re = new RegExp("<[^>]*class\\s*=\\s*['\"][^'\"]*" + className + "[^'\"]*['\"][^>]*>([\\s\\S]*?)<\\/[^>]+>", "i");
    var m = re.exec(block);
    return m ? cleanText(m[1]) : "";
}

function metaNumber(html, name) {
    var re = new RegExp(name + "\\s*:\\s*(\\d+)", "i");
    var m = re.exec(html || "");
    return m ? parseInt(m[1], 10) : 0;
}

function collectCards(html) {
    var data = [];
    var seen = {};
    var re = /<a\b[^>]*class\s*=\s*["'][^"']*\bmanga-item\b[^"']*["'][^>]*href\s*=\s*["']([^"']+)["'][^>]*>([\s\S]*?)<\/a>/ig;
    var m;
    while ((m = re.exec(html || "")) !== null) {
        var block = m[2];
        var link = normalizeUrl(m[1]);
        if (!link || seen[link]) continue;
        var name = classText(block, "manga-title");
        if (!name) name = cleanText(firstAttr(block, ["title", "alt"]));
        var coverBlock = /<img\b[^>]*>/i.exec(block);
        var cover = coverBlock ? normalizeImage(firstAttr(coverBlock[0], ["data-src", "src"])) : "";
        var chapter = classText(block, "manga-chapter");
        if (!name) continue;
        seen[link] = true;
        data.push({name: name, link: link, cover: cover, description: chapter, host: BASE_URL});
    }
    return data;
}

function nextPage(html, url, page, count) {
    if (url.indexOf("/classification/index") < 0) return "";
    var current = metaNumber(html, "currentPage") || parseInt(page || "1", 10) || 1;
    var pageSize = metaNumber(html, "pageSize") || 64;
    var total = metaNumber(html, "totalCount");
    if (total && current * pageSize >= total) return "";
    if (count >= pageSize) return "" + (current + 1);
    return "";
}

function execute(url, page) {
    var requestUrl = pageUrl(url, page);
    var html = requestText(requestUrl, BASE_URL + "/");
    if (!html) return Response.error("Khong tai duoc danh sach ChickenManga.");
    var data = collectCards(html);
    return Response.success(data, nextPage(html, requestUrl, page, data.length));
}
