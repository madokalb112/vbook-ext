load('config.js');

function fallbackGenres() {
    let items = [
        ["Action", "/the-loai/action"],
        ["Adventure", "/the-loai/adventure"],
        ["Comedy", "/the-loai/comedy"],
        ["Drama", "/the-loai/drama"],
        ["Ecchi", "/the-loai/ecchi"],
        ["Fantasy", "/the-loai/fantasy"],
        ["Harem", "/the-loai/harem"],
        ["Historical", "/the-loai/historical"],
        ["Horror", "/the-loai/horror"],
        ["Josei", "/the-loai/josei"],
        ["Manga", "/the-loai/manga"],
        ["Manhua", "/the-loai/manhua"],
        ["Manhwa", "/the-loai/manhwa"],
        ["Martial Arts", "/the-loai/martial-arts"],
        ["Mystery", "/the-loai/mystery"],
        ["Romance", "/the-loai/romance"],
        ["School Life", "/the-loai/school-life"],
        ["Sci-fi", "/the-loai/sci-fi"],
        ["Seinen", "/the-loai/seinen"],
        ["Shoujo", "/the-loai/shoujo"],
        ["Shounen", "/the-loai/shounen"],
        ["Slice of Life", "/the-loai/slice-of-life"],
        ["Supernatural", "/the-loai/supernatural"],
        ["Webtoon", "/the-loai/webtoon"],
        ["BL", "/the-loai/bl"],
        ["GL", "/the-loai/gl"],
        ["Dam My", "/the-loai/dam-my"],
        ["Ngon Tinh", "/the-loai/ngon-tinh"],
        ["Chuyen Sinh", "/the-loai/chuyen-sinh"],
        ["Xuyen Khong", "/the-loai/xuyen-khong"],
        ["Co Trang", "/the-loai/co-trang"],
        ["Isekai", "/the-loai/isekai"]
    ];
    let genres = [];
    for (let i = 0; i < items.length; i++) {
        genres.push({title: items[i][0], input: items[i][1], script: "gen.js"});
    }
    return genres;
}

function execute() {
    let doc = getDoc(BASE_URL);
    if (!doc) return Response.success(fallbackGenres());

    let genres = [];
    let seen = {};
    doc.select("a[href*='/the-loai/']").forEach(function(e) {
        let href = e.attr("href");
        let title = cleanText(e.attr("title") || e.text());
        let link = normalizeUrl(href);
        if (!title || seen[link]) return;
        seen[link] = true;
        genres.push({
            input: link,
            title: title,
            script: "gen.js"
        });
    });

    if (genres.length === 0) genres = fallbackGenres();
    return Response.success(genres);
}
