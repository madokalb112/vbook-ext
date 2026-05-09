load('config.js');

function fallbackGenres() {
    let items = [
        ["Action", "/the-loai/action-26"],
        ["Adventure", "/the-loai/adventure-27"],
        ["Anime", "/the-loai/anime-62"],
        ["Chuyen Sinh", "/the-loai/chuyen-sinh-91"],
        ["Co Dai", "/the-loai/co-dai-90"],
        ["Comedy", "/the-loai/comedy-28"],
        ["Drama", "/the-loai/drama-29"],
        ["Fantasy", "/the-loai/fantasy-30"],
        ["Harem", "/the-loai/harem-47"],
        ["Horror", "/the-loai/horror-44"],
        ["Isekai", "/the-loai/isekai-85"],
        ["Josei", "/the-loai/josei-54"],
        ["Manhua", "/the-loai/manhua-35"],
        ["Manhwa", "/the-loai/manhwa-49"],
        ["Martial Arts", "/the-loai/martial-arts-41"],
        ["Mystery", "/the-loai/mystery-39"],
        ["Ngon Tinh", "/the-loai/ngon-tinh-87"],
        ["Romance", "/the-loai/romance-36"],
        ["School Life", "/the-loai/school-life-37"],
        ["Shoujo", "/the-loai/shoujo-38"],
        ["Shounen", "/the-loai/shounen-31"],
        ["Xuyen Khong", "/the-loai/xuyen-khong-88"]
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
    doc.select(".book_tags_content a[href*='/the-loai/'], a[href*='/the-loai/']").forEach(function(e) {
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
