load('config.js');

function addChapter(data, seen, text, href) {
    if (!href || !isChapterUrl(href)) return;
    let url = normalizeUrl(href);
    if (seen[url]) return;
    let name = cleanText(text);
    if (!name || foldText(name) === "xem") name = "Chap " + chapterNumber(url);
    seen[url] = true;
    data.push({
        name: name,
        url: url,
        host: BASE_URL
    });
}

function execute(url) {
    url = storyUrlFromAny(url);
    let doc = getDoc(url);
    if (!doc) return Response.error("Khong lay duoc danh sach chuong. Co the bi Cloudflare chan.");

    let data = [];
    let seen = {};
    doc.select(".list-chapter a[href*='/chap-']").forEach(function(e) {
        addChapter(data, seen, e.text(), e.attr("href"));
    });

    if (data.length === 0) {
        doc.select(".chapters-select option[value*='/chap-']").forEach(function(e) {
            addChapter(data, seen, e.text(), e.attr("value"));
        });
    }

    return Response.success(data);
}