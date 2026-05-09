load('config.js');

function chapterNumber(text) {
    text = foldText(text || "").replace(/_/g, "-");
    let match = /(?:chuong|chapter|chap|ngoai-truyen|tap-dac-biet)[-\s]*(\d+(?:[-.]\d+)?)/i.exec(text);
    if (!match) match = /(\d+(?:[-.]\d+)?)/.exec(text);
    return match ? parseFloat(match[1].replace("-", ".")) : 0;
}

function chaptersUrl(url, page) {
    return stripTrailingSlash(normalizeUrl(url)) + "/ajax/chapters/?t=" + (page || 1);
}

function parseChapters(doc) {
    let data = [];
    let seen = {};
    doc.select("li.wp-manga-chapter a[href], .wp-manga-chapter a[href], .chapter-item .chapter a[href]").forEach(function(a) {
        let href = a.attr("href");
        if (!isChapterUrl(href)) return;
        let link = normalizeUrl(href);
        if (seen[link]) return;
        seen[link] = true;
        data.push({
            name: cleanText(a.text()) || cleanText(a.attr("title")),
            url: link,
            host: BASE_URL
        });
    });
    return data;
}

function execute(url) {
    let text = "";
    try {
        text = postText(chaptersUrl(url, 1), "", normalizeUrl(url));
    } catch (error) {
    }

    let doc = text ? Html.parse(text) : getDoc(url);
    if (!doc) return null;

    let data = parseChapters(doc);
    if (data.length === 0) data = parseChapters(getDoc(url));
    if (data.length > 1 && chapterNumber(data[0].name + " " + data[0].url) > chapterNumber(data[data.length - 1].name + " " + data[data.length - 1].url)) {
        data.reverse();
    }
    return Response.success(data);
}
