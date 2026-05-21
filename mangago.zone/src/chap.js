load('config.js');

function extractMeta(html) {
    var m = /current_page\s*=\s*(\d+)\s*,\s*total_pages\s*=\s*(\d+)/i.exec(html || "");
    if (!m) return null;
    return {currentPage: parseInt(m[1], 10), totalPages: parseInt(m[2], 10)};
}

function extractImages(html) {
    var data = {};
    var re = /<img\b[^>]*\bid="page(\d+)"[^>]*\bsrc="([^"]+)"/ig;
    var m;
    while ((m = re.exec(html || "")) !== null) {
        var idx = parseInt(m[1], 10);
        var link = normalizeImage(decodeHtml(m[2]));
        if (link && !data[idx]) data[idx] = link;
    }
    return data;
}

function loadChapterHtml(url) {
    var pattern = /<img\b[^>]*\bid="page\d+"[^>]*\bsrc="https?:\/\/[^"]*mangapicgallery/i;
    var html = browserTextUntil(url, pattern, 4000);
    if (html && pattern.test(html)) return html;
    var fallback = requestText(url, BASE_URL + "/");
    return fallback || html || "";
}

function execute(url) {
    var ids = chapterIdsFromUrl(url || "");
    if (!ids) return Response.error("URL chapter Mangago khong hop le.");

    var firstUrl = chapterPageUrl(ids.workId, ids.chapterId, 1);
    var firstHtml = loadChapterHtml(firstUrl);
    if (!firstHtml) return Response.error("Khong tai duoc chapter Mangago.");

    var meta = extractMeta(firstHtml);
    if (!meta) return Response.error("Khong tim thay thong tin chapter.");
    var totalPages = meta.totalPages;
    if (!totalPages || totalPages < 1) return Response.error("Chapter khong co trang nao.");

    var images = extractImages(firstHtml);
    var loadedCount = 0;
    for (var k in images) {
        if (images.hasOwnProperty(k)) loadedCount++;
    }

    var attempts = 0;
    while (loadedCount < totalPages && attempts < totalPages) {
        attempts++;
        var nextPage = 0;
        for (var i = 1; i <= totalPages; i++) {
            if (!images[i]) { nextPage = i; break; }
        }
        if (!nextPage) break;
        var nextUrl = chapterPageUrl(ids.workId, ids.chapterId, nextPage);
        var nextHtml = loadChapterHtml(nextUrl);
        if (!nextHtml) break;
        var nextImages = extractImages(nextHtml);
        var added = 0;
        for (var idx in nextImages) {
            if (!nextImages.hasOwnProperty(idx)) continue;
            if (!images[idx]) {
                images[idx] = nextImages[idx];
                added++;
            }
        }
        if (added === 0) break;
        loadedCount = 0;
        for (var j in images) {
            if (images.hasOwnProperty(j)) loadedCount++;
        }
    }

    var data = [];
    var hdr = imageHeaders(firstUrl);
    for (var p = 1; p <= totalPages; p++) {
        var link = images[p];
        if (!link) continue;
        data.push({link: link, headers: hdr, header: hdr});
    }

    if (data.length === 0) return Response.error("Khong tim thay anh chapter Mangago.");
    return Response.success(data);
}
