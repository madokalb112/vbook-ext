load('config.js');

function detailLine(label, value) {
    if (!value) return "";
    return "<b>" + label + ":</b> " + value;
}

function collectGenres(doc) {
    let genres = [];
    let seen = {};
    let links = doc.select(".meta a[href*='/genre/'], .manga-detail a[href*='/genre/']");
    for (let i = 0; i < links.size(); i++) {
        let a = links.get(i);
        let title = cleanText(a.text());
        let href = normalizeUrl(a.attr("href"));
        if (title && href && !seen[href]) {
            seen[href] = true;
            genres.push({title: title, input: href, script: "gen.js"});
        }
    }
    return genres;
}

function labelLinks(doc, label) {
    let wanted = label.toLowerCase();
    let rows = doc.select(".meta div, .meta p, .info p, .manga-detail .meta > *");
    let values = [];
    let seen = {};
    for (let i = 0; i < rows.size(); i++) {
        let row = rows.get(i);
        let text = cleanText(row.text()).toLowerCase();
        if (text.indexOf(wanted) < 0) continue;
        let links = row.select("a");
        for (let j = 0; j < links.size(); j++) {
            let name = cleanText(links.get(j).text());
            if (name && !seen[name]) {
                seen[name] = true;
                values.push(name);
            }
        }
        if (values.length === 0) {
            let raw = cleanText(row.text()).replace(/^[^:]+:\s*/, "");
            if (raw) values.push(raw);
        }
    }
    return values.join(", ");
}

function statusText(doc) {
    let rows = doc.select(".manga-detail .info > p, .info p, .meta div, .meta p");
    for (let i = 0; i < rows.size(); i++) {
        let text = cleanText(rows.get(i).text());
        let low = text.toLowerCase();
        if (low.indexOf("status") >= 0 || low === "releasing" || low === "completed") return text.replace(/^[^:]+:\s*/, "");
    }
    return "";
}

function execute(url) {
    url = storyUrlFromAny(url);
    let doc = getDoc(url);
    if (!doc) return Response.error("Khong lay duoc thong tin truyen MangaFire.");
    let name = firstText(doc, ["h1", ".manga-detail h1", ".info h1"]);
    if (!name) name = metaContent(doc, "meta[property=og:title]").replace(/ Manga.*/i, "");
    if (!name) return Response.error("Khong tim thay thong tin truyen.");
    let cover = imageFromNode(doc.select("img[itemprop=image], .manga-detail img, .poster img").first());
    if (!cover) cover = metaImage(doc);
    let author = labelLinks(doc, "author");
    let status = statusText(doc);
    let alt = firstText(doc, [".manga-detail h6", "h6"]);
    let type = labelLinks(doc, "type");
    let details = [];
    let altLine = detailLine("Other name", alt);
    let typeLine = detailLine("Type", type);
    let statusLine = detailLine("Status", status);
    if (altLine) details.push(altLine);
    if (typeLine) details.push(typeLine);
    if (statusLine) details.push(statusLine);
    let description = firstHtml(doc, ["#synopsis .modal-content", ".description", "[itemprop=description]"]);
    if (!cleanText(description)) description = metaContent(doc, "meta[name=description], meta[property=og:description]");
    return Response.success({name: name, cover: cover, author: author, description: description, detail: details.join("<br>"), ongoing: status.toLowerCase().indexOf("completed") < 0, genres: collectGenres(doc), host: BASE_URL});
}
