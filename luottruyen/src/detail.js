load("config.js");

function rowText(row) {
    let node = row ? (row.select("p.col-xs-10").first() || row.select("p").last()) : null;
    return node ? cleanText(node.text()) : "";
}

function detailLines(doc) {
    let lines = [];
    let view = cleanText(doc.select(".avatar .view").text());
    let author = rowText(doc.select(".list-info .author").first());
    let status = rowText(doc.select(".list-info .status").first());
    let kind = cleanText(doc.select(".kind").text());
    if (view) lines.push("<b>Lượt xem:</b> " + view);
    if (author) lines.push("<b>Tác giả:</b> " + author);
    if (status) lines.push("<b>Tình trạng:</b> " + status);
    if (kind) lines.push("<b>Thể loại:</b> " + kind);
    return lines.join("<br>");
}

function genresFromDoc(doc) {
    let data = [];
    let seen = {};
    doc.select(".kind a[href]").forEach(function(a) {
        let href = normalizeUrl(a.attr("href"));
        let title = cleanText(a.text());
        if (!title || seen[href]) return;
        seen[href] = true;
        data.push({title: title, input: href, script: "gen.js"});
    });
    return data;
}

function coverFromDoc(doc) {
    let cover = normalizeImage(doc.select("#AvatarComic").attr("value"));
    if (validImage(cover)) return cover;
    let img = doc.select(".detail-info img, .avatar img, img[itemprop=image], meta[property=og:image]").first();
    if (img) {
        cover = normalizeImage(img.attr("content") || imageAttr(img));
        if (validImage(cover)) return cover;
    }
    return "";
}

function execute(url) {
    url = normalizeUrl(url);
    let doc = getDoc(url);
    if (!doc) return null;

    let nameNode = doc.select("h1.title-detail, h1").first();
    let name = nameNode ? cleanText(nameNode.text()) : "";
    if (!name) name = cleanText(doc.select("meta[property=og:title]").attr("content")).replace(/\s+-\s+LuotTruyen.*$/i, "");
    if (!name) return Response.error("Không tìm thấy thông tin truyện.");

    let author = rowText(doc.select(".list-info .author").first());
    if (foldText(author) === "dang cap nhat") author = "";

    let status = rowText(doc.select(".list-info .status").first());
    let description = doc.select("#summary").html() || doc.select(".detail-content").html();
    if (!description) description = cleanText(doc.select("meta[property=og:description]").attr("content"));

    return Response.success({
        name: name,
        cover: coverFromDoc(doc),
        author: author,
        description: description,
        detail: detailLines(doc),
        ongoing: foldText(status).indexOf("hoan thanh") < 0,
        genres: genresFromDoc(doc),
        host: BASE_URL
    });
}
