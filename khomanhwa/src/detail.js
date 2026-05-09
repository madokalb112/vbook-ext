load('config.js');

function detailLine(label, value) {
    if (!value) return "";
    return "<b>" + label + ":</b> " + value;
}

function queryValue(url, key) {
    let match = new RegExp("[?&]" + key + "=([^&#]+)", "i").exec(url || "");
    if (!match) return "";
    try {
        return decodeURIComponent(match[1].replace(/\+/g, " "));
    } catch (error) {
        return match[1].replace(/\+/g, " ");
    }
}

function factValue(doc, key) {
    let links = doc.select("a[href*='" + key + "=']");
    for (let i = 0; i < links.size(); i++) {
        let a = links.get(i);
        let value = textOfFirst(a, "span") || cleanText(a.text()) || queryValue(a.attr("href"), key);
        value = cleanText(value.replace(/\bSearch\b/ig, ""));
        if (value) return value;
    }
    return "";
}

function cleanGenreTitle(text) {
    return cleanText(text || "").replace(/\s+\d+$/g, "");
}

function genresFromDoc(doc) {
    let data = [];
    let seen = {};
    let links = doc.select("a[href*='genre?g='], a[href*='/genre?g=']");
    for (let i = 0; i < links.size(); i++) {
        let a = links.get(i);
        let href = normalizeUrl(a.attr("href"));
        let title = cleanGenreTitle(a.text()) || queryValue(href, "g");
        let key = foldText(title);
        if (!title || seen[key]) continue;
        seen[key] = true;
        data.push({title: title, input: href, script: "gen.js"});
    }
    return data;
}

function execute(url) {
    url = storyUrlFromAny(url);
    let doc = getDoc(url);
    if (!doc) return Response.error("Khong tai duoc thong tin truyen.");

    let slug = storySlug(url);
    let h1 = doc.select("h1").first();
    let name = h1 ? cleanTitle(h1.text()) : "";
    if (!name) name = cleanTitle(metaContent(doc, "meta[property=og:title]").replace(/\s*-\s*KhoManhwa.*$/i, ""));
    if (!name) name = titleFromSlug(slug);

    let cover = metaContent(doc, "meta[property=og:image]");
    if (!validImage(cover)) {
        let image = imageForStoryInDoc(doc, url, name);
        cover = image.url;
    }

    let status = factValue(doc, "status");
    let author = factValue(doc, "author");
    let artist = factValue(doc, "artist");
    let lines = [];
    let statusLine = detailLine("Status", status);
    let artistLine = detailLine("Artist", artist);
    if (statusLine) lines.push(statusLine);
    if (artistLine) lines.push(artistLine);

    return Response.success({
        name: name,
        cover: cover,
        host: BASE_URL,
        author: author,
        description: metaContent(doc, "meta[name=description], meta[property=og:description]"),
        detail: lines.join("<br>"),
        ongoing: foldText(status).indexOf("completed") < 0,
        genres: genresFromDoc(doc)
    });
}
