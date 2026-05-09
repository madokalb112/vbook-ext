load('config.js');

function rowValue(row) {
    if (!row) return "";
    let resultNode = row.select(".result").first();
    if (resultNode) return cleanText(resultNode.text());
    let valueNode = row.select("p, span, a").last();
    let value = valueNode ? cleanText(valueNode.text()) : "";
    if (!value) value = cleanText(row.text()).replace(/^[^:]+:\s*/, "");
    return value;
}

function infoValue(doc, labels) {
    let rows = doc.select(".book_info .list-info li, .book_info li, .detail-info li, .story-info li, .manga-info li, .info li");
    for (let i = 0; i < rows.size(); i++) {
        let row = rows.get(i);
        let text = foldText(row.text());
        for (let j = 0; j < labels.length; j++) {
            if (text.indexOf(labels[j]) >= 0) return rowValue(row);
        }
    }
    return "";
}

function buildDetail(doc) {
    let lines = [];
    let rows = doc.select(".book_info .list-info li, .book_info li, .detail-info li, .story-info li, .manga-info li, .info li");
    let seen = {};
    rows.forEach(function(row) {
        let labelNode = row.select(".name, .title, .label, b, strong").first();
        let label = labelNode ? cleanText(labelNode.text()).replace(/:$/, "") : "";
        let value = rowValue(row);
        if (!label) {
            let text = cleanText(row.text());
            let parts = text.split(":");
            if (parts.length > 1) {
                label = cleanText(parts[0]);
                value = cleanText(parts.slice(1).join(":"));
            }
        }
        if (label && value && label !== value && !seen[label]) {
            seen[label] = true;
            lines.push("<b>" + label + ":</b> " + value);
        }
    });
    return lines.join("<br>");
}

function getGenres(doc) {
    let genres = [];
    let seen = {};
    doc.select(".book_info .list01 a[href*='/the-loai/'], .book_info a[href*='/the-loai/'], .kind a[href*='/the-loai/'], .genres a[href*='/the-loai/']").forEach(function(e) {
        let href = e.attr("href");
        let title = cleanText(e.text());
        let link = normalizeUrl(href);
        if (!title || seen[link]) return;
        seen[link] = true;
        genres.push({
            title: title,
            input: link,
            script: "gen.js"
        });
    });
    return genres;
}

function execute(url) {
    let doc = getDoc(url);
    if (!doc) return null;

    let name = firstText(doc, [
        "h1[itemprop=name]",
        ".book_info h1",
        ".detail-info h1",
        ".story-info h1"
    ]);
    if (!name) name = cleanText(doc.select("meta[itemprop=name]").attr("content"));
    if (!name) return Response.error("Khong tim thay thong tin truyen.");

    let cover = metaCover(doc);
    let coverNode = doc.select(".book_avatar img, img[itemprop=image], .story-cover img, .thumb img").first();
    if (!cover) cover = imageFromNode(coverNode);
    if (!cover) {
        cover = doc.select("meta[itemprop=image]").attr("content") ||
            doc.select("meta[property=og:image]").attr("content") ||
            doc.select("meta[name=twitter:image]").attr("content");
    }

    let status = infoValue(doc, ["tinh trang", "trang thai", "status"]);
    let author = infoValue(doc, ["tac gia", "author"]);
    if (!author) author = firstText(doc, [".book_info .author a.org", ".author a", "[itemprop=author]"]);

    cover = normalizeImage(cover);

    return Response.success({
        name: name,
        cover: cover,
        host: BASE_URL,
        author: author,
        description: firstHtml(doc, [
            "div.story-detail-info",
            ".story-detail-info",
            ".detail-content",
            "#summary",
            ".summary"
        ]),
        detail: buildDetail(doc),
        ongoing: foldText(status).indexOf("hoan thanh") < 0 && foldText(status).indexOf("full") < 0,
        genres: getGenres(doc)
    });
}
