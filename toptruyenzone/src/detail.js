load('config.js');

function buildDetail(doc) {
    let lines = [];
    let seen = {};
    doc.select(".info-detail-comic li").forEach(function(row) {
        let label = cleanText(row.select(".info-name").text()).replace(/:$/, "");
        let value = cleanText(row.select(".detail-info").text());
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
    doc.select(".info-detail-comic .category a[href*='/tim-truyen/'], .cat-detail a[href*='/tim-truyen/']").forEach(function(e) {
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

function metaContent(doc, selector) {
    return cleanText(doc.select(selector).attr("content"));
}

function execute(url) {
    let doc = getDoc(url);
    if (!doc) return null;

    let name = firstText(doc, ["h1.title-manga", "meta[itemprop=name]"]);
    if (!name) name = metaContent(doc, "meta[property=og:title]").replace(/\[.*$/, "");
    if (!name) return Response.error("Khong tim thay thong tin truyen.");

    let cover = imageFromNode(doc.select(".image-info img, img.image-comic").first());
    if (!cover) {
        cover = metaContent(doc, "meta[name=thumbnail]") ||
            metaContent(doc, "meta[itemprop=image]") ||
            metaContent(doc, "meta[property='og:image']");
    }

    let status = detailValue(doc, ["tinh trang", "status"]);
    let author = detailValue(doc, ["tac gia", "author"]);
    let description = firstHtml(doc, [".detail-summary", ".summary-content .detail-summary"]);
    if (!description) description = metaContent(doc, "meta[name=description], meta[property='og:description']");

    return Response.success({
        name: name,
        cover: normalizeImage(cover),
        author: author || "Dang cap nhat",
        description: description,
        detail: buildDetail(doc),
        host: BASE_URL,
        ongoing: foldText(status).indexOf("hoan thanh") < 0 && foldText(status).indexOf("full") < 0,
        genres: getGenres(doc)
    });
}
