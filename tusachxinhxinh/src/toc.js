load('config.js');

function chapterName(url, text) {
    let raw = url + " " + text;
    let num = chapterNumber(raw);
    if (/\d/.test(raw)) return "Chapter " + ("" + num).replace(/\.0$/, "");
    text = cleanText(text);
    return text || "Chapter";
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
    if (!doc) return Response.error("Khong tai duoc danh sach chapter.");

    let data = [];
    let seen = {};
    let links = doc.select(".chapter-table a[href*='chap'], a.text-capitalize[href*='chap']");
    for (let i = 0; i < links.size(); i++) {
        let a = links.get(i);
        let href = a.attr("href");
        if (!isChapterUrl(href)) continue;
        let link = normalizeUrl(href);
        if (seen[link]) continue;
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
