load("config.js");

function execute(url) {
    let bid = bookIdFromUrl(url);
    if (!bid) return Response.error("Url truyen khong hop le.");

    let data = apiData("/book/chapter-list", {bid: bid}, chapterListUrl(bid));
    let chapters = data && data.chapters ? data.chapters : [];
    if (!chapters.length) return Response.error("Khong tim thay danh sach chuong.");

    let result = [];
    for (let i = 0; i < chapters.length; i++) {
        let chapter = chapters[i];
        if (!chapter || !chapter.uuid) continue;
        let name = cleanText(chapter.title) || ("\u7b2c" + (chapter.seq || (i + 1)) + "\u7ae0");
        if (chapter.free === false) name += " [VIP]";
        result.push({
            name: name,
            url: chapterUrl(bid, chapter.uuid),
            host: BASE_URL
        });
    }
    return Response.success(result);
}
