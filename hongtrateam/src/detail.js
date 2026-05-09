load('config.js');

function rowLabel(row) {
    let node = row.select(".summary-heading h5, .summary-heading, .label, b, strong").first();
    return node ? cleanText(node.text()).replace(/:$/, "") : "";
}

function rowValue(row) {
    let node = row.select(".summary-content").first();
    return node ? cleanText(node.text()) : "";
}

function valueByLabels(doc, labels) {
    let rows = doc.select(".post-content_item, .summary-content_wrap .post-content_item");
    for (let i = 0; i < rows.size(); i++) {
        let row = rows.get(i);
        let label = foldText(rowLabel(row));
        for (let j = 0; j < labels.length; j++) {
            if (label.indexOf(labels[j]) >= 0) return rowValue(row);
        }
    }
    return "";
}

function buildDetail(doc) {
    let lines = [];
    let seen = {};
    doc.select(".post-content_item").forEach(function(row) {
        let label = rowLabel(row);
        let value = rowValue(row);
        if (!label || !value || seen[label]) return;
        seen[label] = true;
        lines.push("<b>" + label + ":</b> " + value);
    });
    return lines.join("<br>");
}

function getGenres(doc) {
    let data = [];
    let seen = {};
    doc.select(".genres-content a[href], .tags-content a[href], a[href*='/the-loai/'], a[href*='/the/']").forEach(function(a) {
        let href = normalizeUrl(a.attr("href"));
        let title = cleanText(a.text());
        if (!title || !href || seen[href]) return;
        seen[href] = true;
        data.push({title: title, input: href, script: "gen.js"});
    });
    return data;
}

function execute(url) {
    let doc = getDoc(url);
    if (!doc) return null;

    let name = firstText(doc, [".post-title h1", "h1", "meta[property=og:title]"]);
    if (!name) name = stripProtected(doc.select("meta[property=og:title]").attr("content"));
    if (!name) return Response.error("Khong tim thay thong tin truyen.");

    let cover = metaImage(doc);
    if (!cover) cover = imageFromNode(doc.select(".summary_image img, .profile-manga img, .item-thumb img").first());

    let author = valueByLabels(doc, ["tac gia", "author"]);
    if (!author) author = cleanText(doc.select(".author-content a").text());
    let status = valueByLabels(doc, ["tinh trang", "trang thai", "status"]);
    let statusFold = foldText(status);

    return Response.success({
        name: name,
        cover: cover,
        host: BASE_URL,
        author: author,
        description: firstHtml(doc, [".description-summary .summary__content", ".description-summary", ".summary__content"]),
        detail: buildDetail(doc),
        ongoing: statusFold.indexOf("hoan thanh") < 0 && statusFold.indexOf("full") < 0 && statusFold.indexOf("end") < 0,
        genres: getGenres(doc)
    });
}
