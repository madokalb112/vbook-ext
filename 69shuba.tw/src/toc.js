load("config.js");

function parseChapters(doc, bookId, seen) {
    let data = [];
    let links = doc.select("a[href*='/read/" + bookId + "/']");
    for (let i = 0; i < links.size(); i++) {
        let a = links.get(i);
        let link = normalizeUrl(a.attr("href"));
        if (!isChapterUrl(link) || seen[link]) continue;
        let name = cleanText(a.text() || a.attr("title"));
        if (!name || name === "上一页" || name === "下一页" || name === "返回目录" || name === "返回目錄") continue;
        seen[link] = true;
        data.push({
            name: name,
            url: link,
            host: BASE_URL
        });
    }
    return data;
}

function execute(url) {
    let bookId = storyIdFromUrl(url);
    if (!bookId) return Response.error("Url truyen khong hop le.");

    let firstUrl = tocUrl(bookId, 1);
    let session = openBrowserSession(firstUrl);
    if (!session) return loadError();

    let data = [];
    let seenChapters = {};
    let seenPages = {};
    let target = firstUrl;
    let doc = session.doc && !isChallengeDoc(session.doc) ? session.doc : browserFetchDoc(session, firstUrl);

    try {
        for (let i = 0; i < 60 && target && !seenPages[target]; i++) {
            if (!doc) break;
            seenPages[target] = true;
            let rows = parseChapters(doc, bookId, seenChapters);
            for (let j = 0; j < rows.length; j++) data.push(rows[j]);
            target = nextPage(doc, target, "/indexlist/" + bookId + "/");
            if (!target || seenPages[target]) break;
            doc = browserFetchDoc(session, target);
        }
    } finally {
        closeBrowserSession(session);
    }

    if (data.length === 0) return loadError("Khong tim thay danh sach chuong.");
    if (data.length > 1 && chapterNumber(data[0].name) > chapterNumber(data[data.length - 1].name)) data.reverse();
    return Response.success(data);
}
