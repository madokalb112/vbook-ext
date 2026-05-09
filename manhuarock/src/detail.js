load('config.js');

function detailLine(label, value) {
    if (!value) return "";
    return "<b>" + label + ":</b> " + value;
}

function infoValue(doc, label) {
    let wanted = foldText(label);
    let items = doc.select(".post-content_item");
    for (let i = 0; i < items.size(); i++) {
        let item = items.get(i);
        let heading = foldText(textOfFirst(item, ".summary-heading h5, h5"));
        if (heading !== wanted) continue;
        return cleanText(item.select(".summary-content").text());
    }
    return "";
}

function genresFromDoc(doc) {
    let data = [];
    let seen = {};
    let links = doc.select(".genres-content a[href*='/the-loai/']");
    for (let i = 0; i < links.size(); i++) {
        let a = links.get(i);
        let href = normalizeUrl(a.attr("href"));
        let title = cleanText(a.attr("title") || a.text());
        if (!title || seen[href]) continue;
        seen[href] = true;
        data.push({title: title, input: href, script: "gen.js"});
    }
    return data;
}

function execute(url) {
    url = storyUrlFromAny(url);
    let doc = getDoc(url);
    if (!doc) return Response.error("Khong tai duoc thong tin truyen.");

    let slug = storySlug(url);
    let name = cleanTitle(textOfFirst(doc, ".post-title h1, h1"));
    if (!name) name = cleanTitle(metaContent(doc, "meta[property=og:title]").replace(/\s*ti.ng vi.t.*$/i, ""));
    if (!name) name = titleFromSlug(slug);

    let cover = normalizeImage(metaContent(doc, "meta[property=og:image], meta[name=thumbnail], meta[itemprop=image]"));
    if (!validImage(cover)) {
        let image = imageForStoryInDoc(doc, url, name);
        cover = image.url;
    }

    let author = infoValue(doc, "Tac gia");
    let group = infoValue(doc, "Nhom dich");
    let otherName = infoValue(doc, "Ten khac");
    let type = infoValue(doc, "Kieu truyen");
    let year = infoValue(doc, "Nam phat hanh");
    let status = infoValue(doc, "Tinh Trang");
    let views = infoValue(doc, "Luot Xem");
    let description = cleanText(doc.select(".panel-story-description .dsct p, .dsct p").first() ? doc.select(".panel-story-description .dsct p, .dsct p").first().text() : "");
    if (!description) description = metaContent(doc, "meta[name=description], meta[property=og:description]");

    let lines = [];
    let otherLine = detailLine("Ten khac", otherName);
    let typeLine = detailLine("Kieu truyen", type);
    let groupLine = detailLine("Nhom dich", group);
    let yearLine = detailLine("Nam", year);
    let statusLine = detailLine("Tinh trang", status);
    let viewsLine = detailLine("Luot xem", views);
    if (otherLine) lines.push(otherLine);
    if (typeLine) lines.push(typeLine);
    if (groupLine) lines.push(groupLine);
    if (yearLine) lines.push(yearLine);
    if (statusLine) lines.push(statusLine);
    if (viewsLine) lines.push(viewsLine);

    return Response.success({
        name: name,
        cover: cover,
        host: BASE_URL,
        author: author,
        description: description,
        detail: lines.join("<br>"),
        ongoing: foldText(status).indexOf("hoan thanh") < 0,
        genres: genresFromDoc(doc)
    });
}
