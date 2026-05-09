load('config.js');

function fallbackGenres() {
    let items = [
        ["Action", "/the-loai/action"],
        ["Adult", "/the-loai/adult"],
        ["Adventure", "/the-loai/adventure"],
        ["Comedy", "/the-loai/comedy"],
        ["Chuyen sinh", "/the-loai/chuyen-sinh"],
        ["Co dai", "/the-loai/co-dai"],
        ["Drama", "/the-loai/drama"],
        ["Fantasy", "/the-loai/fantasy"],
        ["Harem", "/the-loai/harem"],
        ["Horror", "/the-loai/horror"],
        ["Isekai", "/the-loai/isekai"],
        ["Josei", "/the-loai/josei"],
        ["Manhua", "/the-loai/manhua"],
        ["Manhwa", "/the-loai/manhwa"],
        ["Martial Arts", "/the-loai/martial-arts"],
        ["Mature", "/the-loai/mature"],
        ["Mystery", "/the-loai/mystery"],
        ["Ngon tinh", "/the-loai/ngon-tinh"],
        ["Romance", "/the-loai/romance"],
        ["School Life", "/the-loai/school-life"],
        ["Seinen", "/the-loai/seinen"],
        ["Shoujo", "/the-loai/shoujo"],
        ["Shounen", "/the-loai/shounen"],
        ["Slice of Life", "/the-loai/slice-of-life"],
        ["Sports", "/the-loai/sports"],
        ["Supernatural", "/the-loai/supernatural"],
        ["Truyen mau", "/the-loai/truyen-mau"],
        ["Webtoon", "/the-loai/webtoon"]
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
    doc.select(".book_tags_content a[href^=/the-loai/], a[href^=/the-loai/], a[href*='/the-loai/']").forEach(function(e) {
        let href = e.attr("href");
        let title = cleanText(e.text());
        if (!title || seen[href]) return;
        seen[href] = true;
        genres.push({
            input: normalizeUrl(href),
            title: title,
            script: "gen.js"
        });
    });

    if (genres.length === 0) genres = fallbackGenres();
    return Response.success(genres);
}
