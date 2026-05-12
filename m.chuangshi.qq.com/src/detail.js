load("config.js");

function buildGenres(book) {
    let genres = [];
    let seen = {};
    let categories = nonRootCategories(book);
    for (let i = 0; i < categories.length; i++) {
        let category = categories[i];
        let input = BASE_URL + "/tab/" + category.id;
        if (!category.title || seen[input]) continue;
        seen[input] = true;
        genres.push({
            title: category.title,
            input: input,
            script: "gen.js"
        });
    }
    return genres;
}

function buildDetail(book, data) {
    let lines = [];
    let categories = [];
    let catRows = nonRootCategories(book);
    for (let i = 0; i < catRows.length; i++) {
        categories.push(catRows[i].title);
    }
    let tags = tagNames(book.tags);

    if (book.author) lines.push("<b>Tac gia:</b> " + escapeHtml(cleanText(book.author)));
    if (categories.length) lines.push("<b>The loai:</b> " + escapeHtml(categories.join(" / ")));
    lines.push("<b>Trang thai:</b> " + escapeHtml(bookStatusText(book)));
    if (book.totalChapters) lines.push("<b>Tong chuong:</b> " + book.totalChapters);
    if (book.totalWords) lines.push("<b>Do dai:</b> " + escapeHtml(formatWords(book.totalWords)));
    if (book.bookUpdatetime) lines.push("<b>Cap nhat:</b> " + escapeHtml(cleanText(book.bookUpdatetime)));
    if (tags.length) lines.push("<b>Tag:</b> " + escapeHtml(tags.join(", ")));
    if (data.bookScore && data.bookScore.score) {
        let count = data.bookScore.count ? " (" + data.bookScore.count + ")" : "";
        lines.push("<b>Diem:</b> " + escapeHtml("" + data.bookScore.score + count));
    }
    if (data.favorNum) lines.push("<b>Yeu thich:</b> " + escapeHtml(formatNumber(data.favorNum)));
    if (data.fansNum) lines.push("<b>Fan:</b> " + escapeHtml(formatNumber(data.fansNum)));
    if (book.copyrightInfo) lines.push("<b>Nguon:</b> " + escapeHtml(cleanText(book.copyrightInfo)));
    return lines.join("<br>");
}

function execute(url) {
    let bid = bookIdFromUrl(url);
    if (!bid) return Response.error("Url truyen khong hop le.");

    let data = apiData("/book/detail", {bid: bid}, url);
    if (!data || !data.book) return Response.error("Khong tim thay thong tin truyen.");

    let book = data.book;
    return Response.success({
        name: cleanText(book.title),
        cover: normalizeImage(book.cover),
        host: BASE_URL,
        author: cleanText(book.author),
        description: cleanText(book.intro),
        detail: buildDetail(book, data),
        ongoing: !book.finished,
        genres: buildGenres(book)
    });
}
