load('config.js');

function normalizeLower(text) {
    return cleanText(text).toLowerCase();
}

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
    let rows = doc.select(".book-meta .line, .book_info .list-info li, .book_info li, .detail-info li, .story-info li, .manga-info li, .info li");
    for (let i = 0; i < rows.size(); i++) {
        let row = rows.get(i);
        let text = normalizeLower(row.text());
        for (let j = 0; j < labels.length; j++) {
            if (text.indexOf(labels[j]) >= 0) return rowValue(row);
        }
    }
    return "";
}

function buildDetail(doc) {
    let lines = [];
    let rows = doc.select(".book-meta .line, .book_info .list-info li, .book_info li, .detail-info li, .story-info li, .manga-info li, .info li");
    let seen = {};
    rows.forEach(function(row) {
        let labelNode = row.select(".title, .name, .label, b, strong").first();
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
        if (label && value && !seen[label]) {
            seen[label] = true;
            lines.push("<b>" + label + ":</b> " + value);
        }
    });
    return lines.join("<br>");
}

function getGenres(doc) {
    let genres = [];
    let seen = {};
    let genreRows = doc.select(".book-meta .line:contains(Thể loại), .book-meta .line:contains(The loai), .book_info .list01, .kind, .genres");
    genreRows.select("a[href*='/the-loai/']").forEach(function(e) {
        let href = e.attr("href");
        let title = cleanText(e.text());
        if (!title || seen[href]) return;
        seen[href] = true;
        genres.push({
            title: title,
            input: normalizeUrl(href),
            script: "gen.js"
        });
    });

    if (genres.length === 0) {
        let links = doc.select(".mainCol a[href*='/the-loai/'], .detailCol a[href*='/the-loai/']");
        links.forEach(function(e) {
            let href = e.attr("href");
            let title = cleanText(e.text());
            if (!title || seen[href]) return;
            seen[href] = true;
            genres.push({
                title: title,
                input: normalizeUrl(href),
                script: "gen.js"
            });
        });
    }
    return genres;
}

function execute(url) {
    url = migrateLegacyUrl(url);
    let doc = getDoc(url);
    if (!doc) return null;

    let name = firstText(doc, [
        "h1[itemprop=name]",
        ".book-info h1",
        ".book_info h1",
        ".detail-info h1",
        ".story-info h1"
    ]);
    if (!name) return Response.error("Khong tim thay thong tin truyen.");

    let coverNode = doc.select(".poster img, .book-info img[itemprop=image], img[itemprop=image], img[src*='/media/book/'], img[data-src*='/media/book/'], .book_avatar img, .story-cover img, .detail-info img, .thumb img").first();
    let cover = coverNode ? (coverNode.attr("data-original") || coverNode.attr("data-src") || coverNode.attr("src")) : "";
    if (!cover) cover = doc.select("meta[property=og:image]").attr("content") || doc.select("meta[name=twitter:image]").attr("content");
    let status = infoValue(doc, ["tình trạng", "tinh trang", "trạng thái", "trang thai", "status"]);
    let author = infoValue(doc, ["tác giả", "tac gia", "author"]);
    if (!author) author = firstText(doc, [".book_info .author a.org", ".author a", "[itemprop=author]"]);

    return Response.success({
        name: name,
        cover: normalizeImage(cover),
        host: BASE_URL,
        author: author,
        description: firstHtml(doc, [
            "div.story-detail-info",
            ".story-detail-info",
            ".content-text",
            "#gioithieu",
            ".book_detail .detail-content",
            ".detail-content",
            "#summary",
            ".summary"
        ]),
        detail: buildDetail(doc),
        ongoing: normalizeLower(status).indexOf("hoan thanh") < 0 && normalizeLower(status).indexOf("full") < 0,
        genres: getGenres(doc)
    });
}
