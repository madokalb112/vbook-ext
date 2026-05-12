load("config.js");

function infoRows(doc) {
    return doc.select(".box_info_right .txt .info-item, .box_info_right .info-item, .txt .info-item, .info-item");
}

function infoValue(doc, labels) {
    let rows = infoRows(doc);
    for (let i = 0; i < rows.size(); i++) {
        let text = cleanText(rows.get(i).text());
        let folded = foldText(text);
        for (let j = 0; j < labels.length; j++) {
            if (folded.indexOf(labels[j]) === 0 || folded.indexOf(labels[j] + ":") >= 0) {
                let idx = text.indexOf(":");
                if (idx >= 0) return cleanText(text.substring(idx + 1));
            }
        }
    }
    return "";
}

function buildDetail(doc) {
    let lines = [];
    let rows = infoRows(doc);
    let seen = {};
    for (let i = 0; i < rows.size(); i++) {
        let text = cleanText(rows.get(i).text());
        let idx = text.indexOf(":");
        if (idx < 0) continue;
        let label = cleanText(text.substring(0, idx));
        let value = cleanText(text.substring(idx + 1));
        if (!label || !value || seen[label]) continue;
        seen[label] = true;
        lines.push("<b>" + label + ":</b> " + value);
    }
    return lines.join("<br>");
}

function getGenres(doc) {
    let genres = [];
    let seen = {};
    doc.select(".list-tag-story a[href*='/the-loai/'], .box_info_right a[href*='/the-loai/']").forEach(function(e) {
        let title = cleanText(e.text());
        let link = normalizeUrl(e.attr("href"));
        if (!title || !/\/the-loai\/[^/?#]+\.html/i.test(link) || seen[link]) return;
        seen[link] = true;
        genres.push({title: title, input: link, script: "gen.js"});
    });
    return genres;
}

function execute(url) {
    url = storyUrlFromChapter(url);
    let doc = getDoc(url);
    if (!doc) return null;

    let name = firstText(doc, ["h1", ".box_info_right h1", "meta[property=og:title]"]);
    if (!name) name = cleanText(doc.select("meta[property=og:title]").attr("content"));
    if (!name) return Response.error("Khong tim thay thong tin truyen.");

    let cover = imageFromNode(doc.select(".box_info_left img, .book_avatar img, img[itemprop=image]").first());
    if (!cover || isBadImage(cover)) {
        cover = normalizeImage(
            doc.select("meta[property=og:image]").attr("content") ||
            doc.select("meta[name=twitter:image]").attr("content")
        );
    }

    let status = infoValue(doc, ["tinh trang", "trang thai", "status"]);
    let author = infoValue(doc, ["tac gia", "author"]);
    if (!author) author = infoValue(doc, ["nhom dich", "group"]);

    return Response.success({
        name: name,
        cover: normalizeImage(cover),
        host: BASE_URL,
        author: author,
        description: firstHtml(doc, [
            ".story-detail-info",
            "div.story-detail-info",
            ".detail-content",
            ".summary"
        ]),
        detail: buildDetail(doc),
        ongoing: foldText(status).indexOf("hoan thanh") < 0 && foldText(status).indexOf("full") < 0,
        genres: getGenres(doc)
    });
}
