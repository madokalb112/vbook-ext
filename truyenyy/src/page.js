load('config.js');

function execute(url) {
    let story = storyUrlFromAny(url);
    let listUrl = stripTrailingSlash(story) + "/danh-sach-chuong";
    let doc = getDoc(listUrl);
    if (!doc) return Response.success([listUrl]);

    let total = parseTotalPages(doc.html());
    if (!total || total < 1) total = 1;
    let pages = [];
    for (let i = 1; i <= total; i++) {
        pages.push(i === 1 ? listUrl : listUrl + "?p=" + i);
    }
    return Response.success(pages);
}
