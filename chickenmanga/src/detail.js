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

function ensureLang(url) {
    url = normalizeUrl(url);
    if (url.indexOf("ba_lang=") >= 0) return url;
    return url + (url.indexOf("?") >= 0 ? "&" : "?") + "ba_lang=vi";
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

function metaContent(html, property) {
    var re = new RegExp("<meta[^>]+(?:property|name)=['\"]" + property + "['\"][^>]+content=['\"]([^'\"]*)['\"]", "i");
    var m = re.exec(html || "");
    return m ? cleanText(m[1]) : "";
}

function detailLine(label, value) {
    value = cleanText(value || "");
    return value ? "<b>" + label + ":</b> " + value : "";
}

function isOngoing(status) {
    status = (cleanText(status || "")).toLowerCase();
    return status.indexOf("hoan thanh") < 0 && status.indexOf("completed") < 0 && status.indexOf("end") < 0;
}

function keywordGenres(comic) {
    var raw = cleanText((comic && (comic.vietnamese_seo_keyword || comic.english_seo_keyword || comic.chinese_seo_keyword)) || "");
    var data = [];
    var seen = {};
    if (!raw) return data;
    var parts = raw.split(/[,;|]+/);
    for (var i = 0; i < parts.length; i++) {
        var title = cleanText(parts[i]);
        if (!title || seen[title.toLowerCase()]) continue;
        seen[title.toLowerCase()] = true;
        data.push({
            title: title,
            input: title,
            script: "search.js"
        });
    }
    return data;
}

function execute(url) {
    url = ensureLang(url || BASE_URL + "/");
    var html = requestText(url, BASE_URL + "/");
    if (!html) return Response.error("Khong tai duoc thong tin ChickenManga.");
    var boot = extractJson(html, "window.__PC_DETAIL_BOOTSTRAP__ =");
    var comic = boot && boot.comic ? boot.comic : null;
    if (!comic) return Response.error("Khong tim thay thong tin truyen.");

    var name = cleanText(comic.vietnamese_name || comic.chinese_name || comic.english_name || comic.name || metaContent(html, "og:title"));
    var author = cleanText(comic.vietnamese_author || comic.chinese_author || comic.english_author || comic.japanese_author || "");
    var status = cleanText(comic.comic_status_vi || comic.comic_status || comic.comic_status_en || "");
    var description = cleanText(comic.vietnamese_description || comic.chinese_description || comic.english_description || metaContent(html, "description") || metaContent(html, "og:description"));
    var cover = normalizeImage(comic.cover || comic.cover_vi || comic.cover_addr_vi || comic.cover_addr || comic.cover_en || comic.cover_addr_en || "");
    var lines = [];
    var statusLine = detailLine("Status", status);
    var viewsLine = detailLine("Views", comic.view);
    var chaptersLine = detailLine("Chapters", boot.chapterstotal);
    if (statusLine) lines.push(statusLine);
    if (chaptersLine) lines.push(chaptersLine);
    if (viewsLine) lines.push(viewsLine);

    return Response.success({
        name: name,
        cover: cover,
        author: author || "Dang cap nhat",
        description: description,
        detail: lines.join("<br>"),
        host: BASE_URL,
        ongoing: isOngoing(status),
        genres: keywordGenres(comic)
    });
}
