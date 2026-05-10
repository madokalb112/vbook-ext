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

function ensureLang(url) {
    url = normalizeUrl(url);
    if (url.indexOf("ba_lang=") >= 0) return url;
    return url + (url.indexOf("?") >= 0 ? "&" : "?") + "ba_lang=vi";
}

function headers(referer, accept) {
    return {
        "Accept": accept || "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
        "Referer": referer || BASE_URL + "/",
        "User-Agent": DESKTOP_UA
    };
}

function requestText(url, referer) {
    try {
        var response = fetch(url, {headers: headers(referer)});
        if (response && response.ok) return response.text();
    } catch (error) {
    }
    return "";
}

function requestJson(url, referer) {
    try {
        var response = fetch(url, {headers: headers(referer, "application/json, text/plain, */*")});
        if (response && response.ok) return response.json();
    } catch (error) {
    }
    var text = requestText(url, referer);
    if (!text) return null;
    try {
        return JSON.parse(text);
    } catch (jsonError) {
        return null;
    }
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

function comicIdFromUrl(url) {
    var m = /\/animationDetail\/(\d+)\/\d+/i.exec(url || "");
    if (m) return m[1];
    m = /[?&](?:detailId|comics_id|id)=(\d+)/i.exec(url || "");
    return m ? m[1] : "";
}

function chapterSort(row) {
    var n = parseFloat(row && row.sorts);
    if (!isNaN(n)) return n;
    var name = cleanText((row && (row.chapter_name || row.vietnamese_name || row.english_name || row.chinese_name)) || "");
    var m = /(\d+(?:\.\d+)?)/.exec(name);
    return m ? parseFloat(m[1]) : 0;
}

function itemName(row) {
    return cleanText(row.chapter_name || row.vietnamese_name || row.english_name || row.chinese_name || ("Chapter " + chapterSort(row)));
}

function chaptersFromApi(comicId, referer) {
    var json = requestJson(BASE_URL + "/manga/api/chapters?comics_id=" + encodeURIComponent(comicId) + "&lang=vi", referer);
    var rows = json && json.data && json.data.chapters ? json.data.chapters : [];
    if (!rows || rows.length === undefined) return [];
    rows = rows.slice();
    rows.sort(function (a, b) {
        return chapterSort(a) - chapterSort(b);
    });
    var data = [];
    for (var i = 0; i < rows.length; i++) {
        var id = rows[i].ID || rows[i].id;
        if (!id) continue;
        var link = BASE_URL + "/animationDetail/" + encodeURIComponent(comicId) + "/" + encodeURIComponent(String(id)) + "?ba_lang=vi";
        data.push({name: itemName(rows[i]), url: link, link: link, input: link, host: BASE_URL});
    }
    return data;
}

function chaptersFromHtml(html, comicId) {
    var data = [];
    var rows = [];
    var re = /<[^>]*class\s*=\s*["'][^"']*pc-detail-chapter-col[^"']*["'][^>]*data-chapter-order\s*=\s*["']([^"']+)["'][^>]*data-chapter-id\s*=\s*["']([^"']+)["'][^>]*>([\s\S]*?)<\/el-col>/ig;
    var m;
    while ((m = re.exec(html || "")) !== null) {
        rows.push({order: parseInt(m[1], 10) || 0, id: m[2], name: cleanText(m[3])});
    }
    rows.sort(function (a, b) {
        return a.order - b.order;
    });
    for (var i = 0; i < rows.length; i++) {
        var link = BASE_URL + "/animationDetail/" + encodeURIComponent(comicId) + "/" + encodeURIComponent(rows[i].id) + "?ba_lang=vi";
        data.push({name: rows[i].name || ("Chapter " + (i + 1)), url: link, link: link, input: link, host: BASE_URL});
    }
    return data;
}

function execute(url) {
    url = ensureLang(url || BASE_URL + "/");
    var comicId = comicIdFromUrl(url);
    var html = "";
    if (!comicId) {
        html = requestText(url, BASE_URL + "/");
        var boot = extractJson(html, "window.__PC_DETAIL_BOOTSTRAP__ =");
        comicId = boot && boot.comicsId ? "" + boot.comicsId : "";
    }
    if (!comicId) return Response.error("Khong tim thay ID truyen ChickenManga.");
    var data = chaptersFromApi(comicId, url);
    if (data.length === 0) {
        if (!html) html = requestText(url, BASE_URL + "/");
        data = chaptersFromHtml(html, comicId);
    }
    if (data.length === 0) return Response.error("Khong tai duoc danh sach chapter.");
    return Response.success(data);
}
