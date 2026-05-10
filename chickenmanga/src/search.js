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

function headers(referer) {
    return {
        "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
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

function extractJson(html, marker) {
    var start = (html || "").indexOf(marker);
    if (start < 0) return null;
    start += marker.length;
    var end = html.indexOf(";</script>", start);
    if (end < 0) end = html.indexOf(";\r", start);
    if (end < 0) end = html.indexOf(";\n", start);
    if (end < 0) end = html.indexOf("</script>", start);
    if (end < 0) return null;
    var text = html.substring(start, end).trim();
    try {
        return JSON.parse(text);
    } catch (error) {
        return null;
    }
}

function itemFromRow(row) {
    if (!row) return null;
    var name = cleanText(row.title || row.name || "");
    var link = normalizeUrl(row.detailUrl || row.url || row.link || "");
    if (!name || !link) return null;
    return {
        name: name,
        link: link,
        cover: normalizeImage(row.cover || row.image || row.image_url || ""),
        description: cleanText(row.chapter || row.status || row.author || ""),
        host: BASE_URL
    };
}

function rowsFromBoot(boot) {
    var data = [];
    var seen = {};
    var lists = [];
    if (boot && boot.featuredManga) lists.push([boot.featuredManga]);
    if (boot && boot.mangaList) lists.push(boot.mangaList);
    for (var i = 0; i < lists.length; i++) {
        var list = lists[i];
        for (var j = 0; j < list.length; j++) {
            var item = itemFromRow(list[j]);
            if (!item || seen[item.link]) continue;
            seen[item.link] = true;
            data.push(item);
        }
    }
    return data;
}

function nextPage(boot, count) {
    if (!boot) return "";
    var current = parseInt(boot.currentPage || "1", 10) || 1;
    var pageSize = parseInt(boot.pageSize || "20", 10) || 20;
    var total = parseInt(boot.total || "0", 10) || 0;
    if (total && current * pageSize < total) return "" + (current + 1);
    if (!total && count >= pageSize) return "" + (current + 1);
    return "";
}

function execute(key, page) {
    key = cleanText(key || "");
    if (!key) return Response.success([], "");
    var p = parseInt(page || "1", 10);
    if (!p || p < 1) p = 1;
    var url = BASE_URL + "/search/index?text=" + encodeURIComponent(key) + "&ba_lang=vi";
    if (p > 1) url += "&page=" + p;
    var html = requestText(url, BASE_URL + "/");
    if (!html) return Response.error("Khong tim kiem duoc ChickenManga.");
    var boot = extractJson(html, "window.PC_SEARCH_PAGE =");
    var data = rowsFromBoot(boot);
    return Response.success(data, nextPage(boot, data.length));
}
