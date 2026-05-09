load('config.js');

function valueAfterLabel(doc, label) {
    let foldedLabel = foldText(label);
    let nodes = doc.select("p, span");
    for (let i = 0; i < nodes.size(); i++) {
        let text = cleanText(nodes.get(i).text());
        if (foldText(text) !== foldedLabel) continue;
        for (let j = i + 1; j < nodes.size() && j < i + 6; j++) {
            let value = cleanText(nodes.get(j).text());
            let folded = foldText(value);
            if (!value || folded === foldedLabel) continue;
            if (folded === "the loai" || folded === "trang thai" || folded === "so chuong" || folded === "cap nhat") break;
            return value;
        }
    }
    return "";
}

function getGenres(doc) {
    let data = [];
    let seen = {};
    doc.select("a[href]").forEach(function(a) {
        let href = a.attr("href");
        if (!href || href.indexOf("/") !== 0 || href.indexOf("/truyen/") === 0 || href.indexOf("/tim-kiem") === 0) return;
        let title = cleanText(a.text()).replace(/^Truyen\s+/i, "");
        let folded = foldText(title);
        if (!title || title.length > 40 || folded.indexOf("chuong") >= 0 || folded.indexOf("yy") === 0) return;
        let link = normalizeUrl(href);
        if (seen[link]) return;
        seen[link] = true;
        data.push({title: title, input: link, script: "gen.js"});
    });
    return data;
}

function latestChapters(doc) {
    let lines = [];
    let seen = {};
    doc.select("a[href*='/chuong-']").forEach(function(a) {
        let href = a.attr("href");
        if (!isChapterUrl(href) || seen[href]) return;
        seen[href] = true;
        let text = cleanText(a.text());
        if (text) lines.push(text);
    });
    return lines.slice(0, 5).join("<br>");
}

function execute(url) {
    let doc = getDoc(url);
    if (!doc) return null;

    let name = firstText(doc, ["h1"]);
    if (!name) name = metaContent(doc, "meta[property=og:title], meta[name=twitter:title]");
    let cover = metaImage(doc) || imageFromNode(doc.select("img[src*='cover'], img[src*='images/public']").first());
    let author = firstText(doc, ["h1 + span p", "h1 + span", "span:has(svg) p"]);
    let description = metaContent(doc, "meta[name=description], meta[property=og:description]");
    let status = valueAfterLabel(doc, "Trang thai") || valueAfterLabel(doc, "Tr?ng th?i");
    let total = valueAfterLabel(doc, "So chuong") || valueAfterLabel(doc, "S? ch??ng");
    let updated = valueAfterLabel(doc, "Cap nhat") || valueAfterLabel(doc, "C?p nh?t");
    let categories = valueAfterLabel(doc, "The loai") || valueAfterLabel(doc, "Th? lo?i");

    let detail = [];
    if (categories) detail.push("<b>The loai:</b> " + categories);
    if (status) detail.push("<b>Trang thai:</b> " + status);
    if (total) detail.push("<b>So chuong:</b> " + total);
    if (updated) detail.push("<b>Cap nhat:</b> " + updated);
    let latest = latestChapters(doc);
    if (latest) detail.push("<b>Moi cap nhat:</b><br>" + latest);

    return Response.success({
        name: name,
        cover: cover,
        host: BASE_URL,
        author: author,
        description: description ? description.replace(/\n/g, "<br>") : "",
        detail: detail.join("<br>"),
        ongoing: foldText(status).indexOf("con tiep") >= 0 || foldText(status).indexOf("dang ra") >= 0 || foldText(status).indexOf("hoan thanh") < 0,
        genres: getGenres(doc)
    });
}
