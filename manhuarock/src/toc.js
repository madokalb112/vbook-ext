load('config.js');

function chapterName(url, text) {
    let num = chapterNumber(url + " " + text);
    if (num || num === 0) return "Chapter " + ("" + num).replace(/\.0$/, "");
    text = cleanText(text);
    return text || "Chapter";
}

function execute(url) {
    url = storyUrlFromAny(url);
    let doc = getDoc(url);
    if (!doc) return Response.error("Khong tai duoc danh sach chapter.");

    let data = [];
    let seen = {};
    let links = doc.select(".row-content-chapter a.chapter-name[href], a[href*='/chap-'], a[href*='/chapter-']");
    for (let i = 0; i < links.size(); i++) {
        let a = links.get(i);
        let href = a.attr("href");
        if (!isChapterUrl(href)) continue;
        let link = normalizeUrl(href);
        if (storyUrlFromAny(link) !== url || seen[link]) continue;
        seen[link] = true;
        data.push({name: chapterName(link, a.text() || a.attr("title")), url: link, host: BASE_URL});
    }

    data.sort(function(a, b) {
        let an = chapterNumber(a.url + " " + a.name);
        let bn = chapterNumber(b.url + " " + b.name);
        if (an === bn) return a.url.localeCompare(b.url);
        return an - bn;
    });
    return Response.success(data);
}
