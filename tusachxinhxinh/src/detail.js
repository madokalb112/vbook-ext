load('config.js');

function detailLine(label, value) {
    if (!value) return "";
    return "<b>" + label + ":</b> " + value;
}

function introValue(doc, label) {
    let html = doc.select(".comic-intro-text").html();
    if (!html) return "";
    let chunks = html.split(/<strong[^>]*>/i);
    for (let i = 0; i < chunks.length; i++) {
        let parts = chunks[i].split(/<\/strong>/i);
        if (parts.length < 2) continue;
        let currentLabel = foldText(stripTags(parts[0]));
        if (currentLabel.indexOf(label) < 0) continue;
        let valueHtml = parts[1].split(/<br\s*\/?>/i)[0];
        return stripTags(valueHtml);
    }
    return "";
}

function genresFromDoc(doc) {
    let data = [];
    let seen = {};
    let links = doc.select(".tags a[href*='/the-loai/'], a[href*='/the-loai/']");
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

function storyDocFor(url) {
    url = normalizeUrl(url);
    if (isChapterUrl(url)) {
        let chapterDoc = getDoc(url);
        let storyUrl = resolveStoryUrlFromDoc(chapterDoc);
        if (storyUrl) return {url: storyUrl, doc: getDoc(storyUrl)};
    }
    let storyUrl = storyUrlFromAny(url);
    return {url: storyUrl, doc: getDoc(storyUrl)};
}

function execute(url) {
    let resolved = storyDocFor(url);
    let doc = resolved.doc;
    url = resolved.url;
    if (!doc) return Response.error("Khong tai duoc thong tin truyen.");

    let slug = storySlug(url);
    let name = cleanTitle(textOfFirst(doc, ".info-title, .post-title h1, h1"));
    if (!name) name = cleanTitle(metaContent(doc, "meta[property=og:title]").replace(/\s*[-–]\s*Truyen Tranh.*$/i, ""));
    if (!name) name = titleFromSlug(slug);

    let cover = normalizeImage(imageAttr(doc.select(".comic-intro img.img-thumbnail, img[itemprop=image]").first()));
    if (!validImage(cover)) cover = normalizeImage(metaContent(doc, "meta[property=og:image], meta[name=thumbnail], meta[itemprop=image]"));
    if (!validImage(cover)) {
        let image = imageForStoryInDoc(doc, url, name);
        cover = image.url;
    }

    let author = introValue(doc, "tac gia");
    let artist = introValue(doc, "minh hoa");
    let group = introValue(doc, "nhom dich");
    let otherName = introValue(doc, "ten khac");
    let status = cleanText(doc.select(".comic-stt").text()) || introValue(doc, "tinh trang");
    let views = introValue(doc, "tong luot xem");
    let description = cleanText(doc.select(".hide-long-text").text()).replace(/\s*[-–]\s*Xem Them\s*[-–]\s*$/i, "");
    if (!description) description = metaContent(doc, "meta[name=description], meta[property=og:description]");

    let lines = [];
    let otherLine = detailLine("Ten khac", otherName);
    let artistLine = detailLine("Minh hoa", artist);
    let groupLine = detailLine("Nhom dich", group);
    let statusLine = detailLine("Tinh trang", status);
    let viewsLine = detailLine("Luot xem", views);
    if (otherLine) lines.push(otherLine);
    if (artistLine) lines.push(artistLine);
    if (groupLine) lines.push(groupLine);
    if (statusLine) lines.push(statusLine);
    if (viewsLine) lines.push(viewsLine);

    let foldedStatus = foldText(status);
    return Response.success({
        name: name,
        cover: cover,
        host: BASE_URL,
        author: author,
        description: description,
        detail: lines.join("<br>"),
        ongoing: foldedStatus.indexOf("hoan thanh") < 0 && foldedStatus.indexOf("tron bo") < 0 && foldedStatus.indexOf("het") < 0,
        genres: genresFromDoc(doc)
    });
}
