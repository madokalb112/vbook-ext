load('config.js');

function fallbackGenres() {
    let items = [
        ["Action", "/tim-truyen/action"],
        ["Adventure", "/tim-truyen/phieu-luu"],
        ["Comedy", "/tim-truyen/comedy"],
        ["Fantasy", "/tim-truyen/fantasy"],
        ["Manhua", "/tim-truyen/manhua"],
        ["Manhwa", "/tim-truyen/manhwa"],
        ["Manga", "/tim-truyen/manga"],
        ["Ngon Tinh", "/tim-truyen/ngon-tinh"],
        ["Romance", "/tim-truyen/romance"],
        ["Truyen Mau", "/tim-truyen/truyen-mau"],
        ["Xuyen Khong", "/tim-truyen/xuyen-khong"]
    ];
    let genres = [];
    for (let i = 0; i < items.length; i++) {
        genres.push({ title: items[i][0], input: items[i][1], script: "gen.js" });
    }
    return genres;
}

function addGenre(genres, seen, title, href) {
    title = cleanText(title);
    href = normalizeUrl(href);
    if (!title || !href || seen[href]) return;
    if (foldText(title).indexOf("tat ca") >= 0) return;
    seen[href] = true;
    genres.push({
        title: title,
        input: href,
        script: "gen.js"
    });
}

function execute() {
    let doc = getDoc(BASE_URL + "/tim-truyen");
    if (!doc) return Response.success(fallbackGenres());

    let genres = [];
    let seen = {};
    doc.select(".category-detail-1[href*='/tim-truyen/']").forEach(function(e) {
        addGenre(genres, seen, e.attr("title") || e.text(), e.attr("href"));
    });

    doc.select(".list-category-mobile option[value*='/tim-truyen/']").forEach(function(e) {
        addGenre(genres, seen, e.text(), e.attr("value"));
    });

    if (genres.length === 0) genres = fallbackGenres();
    return Response.success(genres);
}
