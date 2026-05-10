load('config.js');

function getGenres(doc) {
    let genres = [];
    let seen = {};
    var selectors = [
        "main a[href*='/the-loai/']",
        "article a[href*='/the-loai/']",
        "#content a[href*='/the-loai/']",
        ".detail a[href*='/the-loai/']",
        ".manga-detail a[href*='/the-loai/']",
        ".comic-detail a[href*='/the-loai/']"
    ];
    for (var s = 0; s < selectors.length; s++) {
        var n = doc.select(selectors[s]);
        if (n.size() > 0 && n.size() < 40) {
            n.forEach(function(e) {
                var title = cleanText(e.text());
                var link = normalizeUrl(e.attr("href"));
                if (!title || seen[link]) return;
                seen[link] = true;
                genres.push({title: title, input: link, script: "gen.js"});
            });
            return genres;
        }
    }

    var all = doc.select("a[href*='/the-loai/']");
    var total = all.size();
    if (total === 0) return genres;

    var navSize = doc.select("nav a[href*='/the-loai/']").size();
    var headerSize = doc.select("header a[href*='/the-loai/']").size();
    var footerSize = doc.select("footer a[href*='/the-loai/']").size();
    var skipStart = Math.max(navSize, headerSize);
    var skipEnd = footerSize;

    if (skipStart === 0 && total > 40) {
        skipStart = total - skipEnd - 30;
        if (skipStart < 0) skipStart = 0;
    }

    var endIdx = total - skipEnd;
    for (var i = skipStart; i < endIdx; i++) {
        var e = all.get(i);
        var title = cleanText(e.text());
        var link = normalizeUrl(e.attr("href"));
        if (!title || seen[link]) continue;
        seen[link] = true;
        genres.push({title: title, input: link, script: "gen.js"});
    }

    if (genres.length > 30) genres = genres.slice(0, 30);
    return genres;
}

function getInfoValue(doc, labels) {
    let nodes = doc.select(".info-item, .manga-info li, .comic-info li, li, p, div");
    for (let i = 0; i < nodes.size(); i++) {
        let node = nodes.get(i);
        let text = foldText(node.text());
        for (let j = 0; j < labels.length; j++) {
            if (text.indexOf(labels[j]) === 0 || text.indexOf(labels[j] + ":") >= 0) {
                let raw = cleanText(node.text());
                let idx = raw.indexOf(":");
                if (idx >= 0) return cleanText(raw.substring(idx + 1));
            }
        }
    }
    return "";
}

function buildDetail(doc) {
    let lines = [];
    let author = getInfoValue(doc, ["tac gia", "author"]);
    let group = getInfoValue(doc, ["nhom dich", "group"]);
    let year = getInfoValue(doc, ["nam phat hanh", "year"]);
    let updated = getInfoValue(doc, ["cap nhat lan cuoi", "cap nhat", "update"]);
    let total = getInfoValue(doc, ["tong chuong", "total chapter"]);

    if (author && author !== "Dang cap nhat" && foldText(author) !== "dang cap nhat") lines.push("<b>Tac gia:</b> " + author);
    if (group && foldText(group) !== "dang cap nhat") lines.push("<b>Nhom dich:</b> " + group);
    if (year && foldText(year) !== "dang cap nhat") lines.push("<b>Nam phat hanh:</b> " + year);
    if (total) lines.push("<b>Tong chuong:</b> " + total);
    if (updated) lines.push("<b>Cap nhat:</b> " + updated);

    return lines.join("<br>");
}

function execute(url) {
    let slug = extractSlug(url);
    if (!slug) return Response.error("Khong tim thay slug truyen.");

    let detailUrl = BASE_URL + "/chi-tiet/" + slug;
    let doc = getDoc(detailUrl);
    if (!doc) return null;

    let name = firstText(doc, [
        "h1",
        ".manga-name",
        ".comic-name",
        ".story-name",
        "meta[property=og:title]"
    ]);
    if (!name) {
        name = cleanText(doc.select("meta[property=og:title]").attr("content"));
        if (name) name = name.replace(/\s*\|\s*Otakusic\s*$/i, "");
    }
    if (!name) return Response.error("Khong tim thay thong tin truyen.");

    let cover = "";
    let coverNode = doc.select("img[src*='manga/uploads/manga/" + slug + "']").first();
    if (!coverNode) coverNode = doc.select("img[data-src*='manga/uploads/manga/" + slug + "']").first();
    if (!coverNode) coverNode = doc.select(".manga-cover img, .comic-cover img, .story-cover img, .thumb img, .book_avatar img, img[itemprop=image]").first();
    if (coverNode) cover = imageFromNode(coverNode);
    if (!cover || isBadImage(cover)) {
        cover = normalizeImage(
            doc.select("meta[property=og:image]").attr("content") ||
            doc.select("meta[itemprop=image]").attr("content") ||
            doc.select("meta[name=twitter:image]").attr("content")
        );
    }
    if (isBadImage(cover)) cover = "";

    let author = getInfoValue(doc, ["tac gia", "author"]);
    if (foldText(author) === "dang cap nhat") author = "";

    let statusText = "";
    let statusNode = doc.select("a[href*='status=']").first();
    if (statusNode) statusText = cleanText(statusNode.text());

    let description = cleanText(doc.select("meta[property=og:description]").attr("content"));
    if (!description) {
        description = firstHtml(doc, [
            ".manga-description",
            ".comic-description",
            ".story-description",
            ".summary",
            "#summary"
        ]);
    }

    return Response.success({
        name: name,
        cover: cover,
        host: BASE_URL,
        author: author,
        description: description,
        detail: buildDetail(doc),
        ongoing: foldText(statusText).indexOf("hoan thanh") < 0 && foldText(statusText).indexOf("completed") < 0,
        genres: getGenres(doc)
    });
}
