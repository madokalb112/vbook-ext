load('config.js');

function chapterNumber(text) {
    let match = /(?:chapter|chap|chuong|ch\.?)\s*-?\s*(\d+(?:[-.]\d+)?)/i.exec(text || "");
    if (!match) match = /-chap-(\d+(?:[-.]\d+)?)/i.exec(text || "");
    return match ? parseFloat(match[1].replace("-", ".")) : 0;
}

function execute(url) {
    let doc = getDoc(url);
    if (!doc) return null;

    let temp = [];
    let seen = {};
    doc.select(".works-chapter-list a[href], .list_chapter a[href], .chapter-list a[href], .list-chapter a[href], .chapters a[href], a[href*='-chap-']").forEach(function(e) {
        let href = e.attr("href");
        if (!href || !isChapterUrl(href)) return;
        let link = normalizeUrl(href);
        if (seen[link]) return;
        seen[link] = true;
        temp.push({
            name: cleanText(e.text()) || cleanText(e.attr("title")),
            url: link,
            host: BASE_URL
        });
    });

    if (temp.length > 1 && chapterNumber(temp[0].url + " " + temp[0].name) > chapterNumber(temp[temp.length - 1].url + " " + temp[temp.length - 1].name)) {
        temp.reverse();
    }

    return Response.success(temp);
}
