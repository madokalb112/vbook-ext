load('config.js');

function detailLine(label, value) {
    if (!value) return "";
    return "<b>" + label + ":</b> " + value;
}

function collectGenres(doc) {
    let genres = [];
    let seen = {};
    let blocks = doc.select(".book__detail-text");
    for (let i = 0; i < blocks.size(); i++) {
        let text = foldText(blocks.get(i).text());
        if (text.indexOf("tag") !== 0 && text.indexOf("the loai") !== 0) continue;
        blocks.get(i).select("a[href*='/the-loai/']").forEach(function(e) {
            let title = cleanText(e.text());
            let href = normalizeUrl(e.attr("href"));
            if (title && href && !seen[href]) {
                seen[href] = true;
                genres.push({
                    title: title,
                    input: href,
                    script: "gen.js"
                });
            }
        });
    }
    return genres;
}

function isBadDetailCover(url) {
    url = normalizeImage(url);
    if (!url) return true;
    if (url.indexOf("data:image") === 0) return true;
    if (url.indexOf("/themes/") >= 0) return true;
    if (url.indexOf("/images/icons/") >= 0) return true;
    if (url.indexOf("logo") >= 0 || url.indexOf("warning") >= 0) return true;
    return false;
}

function detailCover(doc) {
    let nodes = doc.select(".book__detail-image img, .comic-detail-page img");
    for (let i = 0; i < nodes.size(); i++) {
        let cover = imageFromNode(nodes.get(i));
        if (!isBadDetailCover(cover)) return cover;
    }

    let meta = metaImage(doc);
    if (!isBadDetailCover(meta)) return meta;
    return "";
}

function titleFromMeta(doc) {
    let title = cleanText(doc.select("title").text());
    if (!title) return "";
    return cleanText(title.split(" - ")[0]);
}

function execute(url) {
    url = storyUrlFromAny(url);
    let doc = getDoc(url);
    if (!doc) return Response.error("Khong lay duoc thong tin truyen. Co the bi Cloudflare chan.");

    let name = firstText(doc, [".book__detail-name", ".detail__name", "h1"]);
    if (!name) name = titleFromMeta(doc);
    if (!name) return Response.error("Khong tim thay thong tin truyen.");

    let cover = detailCover(doc);

    let author = labelValue(doc, "Tac gia");
    let translator = labelValue(doc, "Chuyen ngu");
    let designer = labelValue(doc, "Designer");
    let schedule = labelValue(doc, "Lich dang");
    let cost = labelValue(doc, "Tieu hao");
    let status = labelValue(doc, "Tinh trang");

    let details = [];
    let translatorLine = detailLine("Chuyen ngu", translator);
    let designerLine = detailLine("Designer", designer);
    let scheduleLine = detailLine("Lich dang", schedule);
    let costLine = detailLine("Tieu hao", cost);
    let statusLine = detailLine("Tinh trang", status);
    if (translatorLine) details.push(translatorLine);
    if (designerLine) details.push(designerLine);
    if (scheduleLine) details.push(scheduleLine);
    if (costLine) details.push(costLine);
    if (statusLine) details.push(statusLine);

    let description = firstHtml(doc, [".tab-comic-description", ".book__detail-description", ".detail__des", ".description"]);
    if (!cleanText(description)) description = metaContent(doc, "meta[name=description], meta[property=og:description]");

    let foldedStatus = foldText(status);
    let ongoing = foldedStatus.indexOf("hoan") < 0 &&
        foldedStatus.indexOf("full") < 0 &&
        foldedStatus.indexOf("complete") < 0;

    return Response.success({
        name: name,
        cover: cover,
        author: author,
        description: description,
        detail: details.join("<br>"),
        ongoing: ongoing,
        genres: collectGenres(doc),
        host: BASE_URL
    });
}