load("config.js");

function fallbackGenres() {
    let items = [
        ["Hot Nhat", "/the-loai/hot-nhat.html"],
        ["Moi Nhat", "/the-loai/moi-nhat.html"],
        ["Tinh Yeu", "/the-loai/tinh-yeu.html"],
        ["Boy Love", "/the-loai/boy-love.html"],
        ["Manga", "/the-loai/manga.html"],
        ["Hentai", "/the-loai/hentai.html"],
        ["Manhua", "/the-loai/manhua.html"],
        ["Manhwa", "/the-loai/manhwa.html"],
        ["Chuyen Sinh", "/the-loai/chuyen-sinh.html"],
        ["Co Dai", "/the-loai/co-dai.html"],
        ["Dam My", "/the-loai/dam-my.html"],
        ["Trinh Tham", "/the-loai/trinh-tham.html"],
        ["Xuyen Khong", "/the-loai/xuyen-khong.html"],
        ["Hoc Duong", "/the-loai/hoc-duong.html"],
        ["Hanh Dong", "/the-loai/hanh-dong.html"],
        ["Phieu Luu", "/the-loai/phieu-luu.html"],
        ["Hai Huoc", "/the-loai/hai-huoc.html"],
        ["Kinh Di", "/the-loai/kinh-di.html"],
        ["Tong Tai", "/the-loai/tong-tai.html"],
        ["18+", "/the-loai/18+.html"],
        ["Vien Tuong", "/the-loai/vien-tuong.html"],
        ["Oneshot", "/the-loai/oneshot.html"],
        ["Supernatural", "/the-loai/supernatural.html"],
        ["Da Full", "/the-loai/da-full.html"],
        ["Historic", "/the-loai/historic.html"],
        ["Girl Love", "/the-loai/girl-love.html"],
        ["Drama", "/the-loai/drama.html"],
        ["Fantasy", "/the-loai/fantasy.html"],
        ["15+", "/the-loai/15.html"],
        ["Horror", "/the-loai/horror.html"],
        ["Psychological", "/the-loai/psychological.html"]
    ];
    let genres = [];
    for (let i = 0; i < items.length; i++) {
        genres.push({title: items[i][0], input: BASE_URL + items[i][1], script: "gen.js"});
    }
    return genres;
}

function execute() {
    let doc = getDoc(BASE_URL);
    if (!doc) return Response.success(fallbackGenres());

    let genres = [];
    let seen = {};
    doc.select(".sub_menu a[href*='/the-loai/'], .main_menu a[href*='/the-loai/'], a[href*='/the-loai/']").forEach(function(e) {
        let href = e.attr("href");
        let title = cleanText(e.text() || e.attr("title"));
        let link = normalizeUrl(href);
        if (!title || !/\/the-loai\/[^/?#]+\.html/i.test(link) || seen[link]) return;
        seen[link] = true;
        genres.push({
            title: title,
            input: link,
            script: "gen.js"
        });
    });

    if (genres.length === 0) genres = fallbackGenres();
    return Response.success(genres);
}
