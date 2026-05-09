load('config.js');

function infoValue(doc, label, nextLabels) {
    let text = foldText(doc.select("body").text());
    let h1 = doc.select("h1").first();
    let title = h1 ? foldText(h1.text()) : "";
    let from = title ? text.indexOf(title) : 0;
    if (from < 0) from = 0;

    let start = text.indexOf(label, from);
    if (start < 0) start = text.indexOf(label);
    if (start < 0) return "";
    start += label.length;
    let end = text.length;
    for (let i = 0; i < nextLabels.length; i++) {
        let idx = text.indexOf(nextLabels[i], start);
        if (idx >= 0 && idx < end) end = idx;
    }
    return cleanText(text.substring(start, end));
}

function detailLine(label, value) {
    if (!value) return "";
    return "<b>" + label + ":</b> " + value;
}

function slugifyGenre(text) {
    text = foldText(text || "");
    text = text.replace(/[^a-z0-9]+/g, "-").replace(/^-+|-+$/g, "");
    return text;
}

function knownGenreMap(doc) {
    let map = {};
    let links = doc.select("a[href*='/the-loai/'], a[href*='/tag/']");
    for (let i = 0; i < links.size(); i++) {
        let a = links.get(i);
        let title = cleanText(a.text() || a.attr("title")).replace(/\s+HOT$/i, "");
        let href = normalizeUrl(a.attr("href"));
        if (title && href) map[foldText(title)] = {title: title, href: href};
    }
    return map;
}

function genresFromDoc(doc) {
    let map = knownGenreMap(doc);
    let raw = infoValue(doc, "the loai", ["truyen tranh", "danh sach chuong", "doc tu dau", "doc moi nhat"]);
    let data = [];
    let seen = {};
    if (!raw) return data;

    let rawKey = foldText(raw);
    if (map[rawKey]) {
        return [{title: map[rawKey].title, input: map[rawKey].href, script: "gen.js"}];
    }

    let parts = raw.split(/[,;|]+/);
    if (parts.length === 1) parts = raw.split(/\s{2,}/);
    for (let i = 0; i < parts.length; i++) {
        let title = cleanText(parts[i]).replace(/\s+HOT$/i, "");
        if (!title || title.length > 40) continue;
        let key = foldText(title);
        let known = map[key];
        let href = known ? known.href : (BASE_URL + "/the-loai/" + slugifyGenre(title));
        if (known) title = known.title;
        if (seen[href]) continue;
        seen[href] = true;
        data.push({title: title, input: href, script: "gen.js"});
    }
    return data;
}

function execute(url) {
    url = normalizeUrl(storyUrlFromAny(url));
    let doc = getDoc(url);
    if (!doc) return Response.error("Khong tai duoc thong tin truyen.");

    let slug = storySlug(url);
    let name = cleanText(doc.select("h1").first() ? doc.select("h1").first().text() : "");
    if (!name) name = cleanText(metaContent(doc, "meta[property=og:title]").replace(/\s*-\s*ThienThaiTruyen.*$/i, ""));
    if (!name) name = titleFromSlug(slug);

    let image = imageForSlug(doc, slug);
    let status = infoValue(doc, "trang thai", ["loai", "tac gia", "nhom dich", "luot xem", "ngay cap nhat", "the loai"]);
    let author = infoValue(doc, "tac gia", ["nhom dich", "luot xem", "ngay cap nhat", "type", "trang thai", "the loai"]);
    let type = infoValue(doc, "type", ["trang thai", "the loai", "theo doi"]);
    let group = infoValue(doc, "nhom dich", ["luot xem", "ngay cap nhat", "type", "trang thai", "the loai"]);

    let lines = [];
    let typeLine = detailLine("Type", type);
    let statusLine = detailLine("Status", status);
    let groupLine = detailLine("Group", group);
    if (typeLine) lines.push(typeLine);
    if (statusLine) lines.push(statusLine);
    if (groupLine) lines.push(groupLine);

    return Response.success({
        name: name,
        cover: image.url,
        host: BASE_URL,
        author: author,
        description: metaContent(doc, "meta[name=description], meta[property=og:description]"),
        detail: lines.join("<br>"),
        ongoing: foldText(status).indexOf("hoan thanh") < 0,
        genres: genresFromDoc(doc)
    });
}
