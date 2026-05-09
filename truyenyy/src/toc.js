load('config.js');

function chapterName(a) {
    let text = cleanText(a.text());
    text = text.replace(/\s*Ch\.\s*\d+\s*$/i, "");
    let href = a.attr("href");
    let num = chapterNumber(href + " " + text);
    if (num > 0 && text.indexOf("Chuong") !== 0 && foldText(text).indexOf("chuong") !== 0) {
        return "Chuong " + num + (text ? ": " + text.replace(/^\d+\s*/, "") : "");
    }
    return text;
}

function execute(url) {
    let target = normalizeUrl(url);
    if (isStoryUrl(target)) target = stripTrailingSlash(target) + "/danh-sach-chuong";
    let doc = getDoc(target);
    if (!doc) return null;

    let data = [];
    let seen = {};
    let links = doc.select("ul.divide-y a[href*='/chuong-']");
    if (links.size() === 0) links = doc.select("a[href*='/chuong-']");
    links.forEach(function(a) {
        let href = a.attr("href");
        if (!isChapterUrl(href)) return;
        let link = normalizeUrl(href);
        if (seen[link]) return;
        seen[link] = true;
        data.push({name: chapterName(a), url: link, host: BASE_URL});
    });

    if (data.length > 1 && chapterNumber(data[0].url + " " + data[0].name) > chapterNumber(data[data.length - 1].url + " " + data[data.length - 1].name)) {
        data.reverse();
    }
    return Response.success(data);
}
