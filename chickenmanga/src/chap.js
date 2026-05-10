var BASE_URL = "https://www.chickenmanga.com";
var DESKTOP_UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36";

function cleanText(text) {
    if (!text) return "";
    return ("" + text).replace(/\s+/g, " ").trim();
}

function decodeHtml(text) {
    if (!text) return "";
    return ("" + text)
        .replace(/&amp;/g, "&")
        .replace(/&lt;/g, "<")
        .replace(/&gt;/g, ">")
        .replace(/&quot;/g, '"')
        .replace(/&#39;/g, "'")
        .replace(/&nbsp;/g, " ");
}

function normalizeImage(url) {
    if (!url) return "";
    url = decodeHtml("" + url).trim();
    if (url.indexOf("//") === 0) return "https:" + url;
    if (url.indexOf("/") === 0) return BASE_URL + url;
    return url;
}

function headers(referer, accept) {
    return {
        "Accept": accept || "application/json, text/plain, */*",
        "Referer": referer || BASE_URL + "/",
        "User-Agent": DESKTOP_UA
    };
}

function requestJson(url, referer) {
    try {
        var response = fetch(url, {headers: headers(referer)});
        if (response && response.ok) return response.json();
    } catch (error) {
    }
    return null;
}

function chapterIdFromUrl(url) {
    var m = /\/animationDetail\/\d+\/(\d+)/i.exec(url || "");
    if (m) return m[1];
    m = /[?&](?:chapter_id|chapterId|id)=(\d+)/i.exec(url || "");
    return m ? m[1] : "";
}

function imageSort(row) {
    var n = parseFloat(row && row.sorts);
    if (!isNaN(n)) return n;
    n = parseFloat(row && row.ID);
    return isNaN(n) ? 0 : n;
}

function validImage(url) {
    url = normalizeImage(url);
    return /\.(?:jpg|jpeg|png|webp|gif)(?:[?#].*)?$/i.test(url) || url.indexOf("/storage/") >= 0;
}

function imageHeaders(referer) {
    return {
        "Accept": "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
        "Referer": referer || BASE_URL + "/",
        "User-Agent": DESKTOP_UA
    };
}

function rowLink(row, referer) {
    var link = normalizeImage(row.resource_addr || row.vietnamese_address || row.english_address || row.chinese_address || row.japanese_address || "");
    if (link) return link;
    if (!row.ID) return "";
    var json = requestJson(BASE_URL + "/manga/api/image-status?id=" + encodeURIComponent(String(row.ID)), referer);
    if (json && json.code === 0 && json.data && json.data.imgurl) return normalizeImage(json.data.imgurl);
    return "";
}

function execute(url) {
    var chapterId = chapterIdFromUrl(url || "");
    if (!chapterId) return Response.error("URL chapter ChickenManga khong hop le.");
    var api = BASE_URL + "/manga/api/chaptersdetails?chapter_id=" + encodeURIComponent(chapterId) + "&lang=vi";
    var json = requestJson(api, url || BASE_URL + "/");
    var rows = json && json.code === 0 && json.data ? json.data : [];
    if (!rows || rows.length === undefined) return Response.error("Khong tai duoc chapter ChickenManga.");
    rows = rows.slice();
    rows.sort(function (a, b) {
        return imageSort(a) - imageSort(b);
    });
    var data = [];
    var seen = {};
    for (var i = 0; i < rows.length; i++) {
        var link = rowLink(rows[i], url || BASE_URL + "/");
        if (!validImage(link) || seen[link]) continue;
        seen[link] = true;
        var h = imageHeaders(url || BASE_URL + "/");
        data.push({link: link, headers: h, header: h});
    }
    if (data.length === 0) return Response.error("Khong tim thay anh chapter.");
    return Response.success(data);
}
