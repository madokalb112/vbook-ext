load('config.js');

function fallbackGenres() {
    let items = [
        ["Action", "/the-loai/action"],
        ["Adventure", "/the-loai/adventure"],
        ["Adult", "/the-loai/adult"],
        ["Comedy", "/the-loai/comedy"],
        ["Drama", "/the-loai/drama"],
        ["Fantasy", "/the-loai/fantasy"],
        ["Harem", "/the-loai/harem"],
        ["Historical", "/the-loai/historical"],
        ["Manhua", "/the-loai/manhua"],
        ["Manhwa", "/the-loai/manhwa"],
        ["Manga", "/the-loai/manga"],
        ["Martial Arts", "/the-loai/martial-arts"],
        ["Ngon Tinh", "/the-loai/ngon-tinh"],
        ["Romance", "/the-loai/romance"],
        ["School Life", "/the-loai/school-life"],
        ["Shounen", "/the-loai/shounen"],
        ["Truyen Mau", "/the-loai/truyen-mau"],
        ["Xuyen Khong", "/the-loai/xuyen-khong"]
    ];
    let result = [];
    for (let i = 0; i < items.length; i++) result.push({title: items[i][0], input: items[i][1], script: "gen.js"});
    return result;
}

function execute() {
    let doc = getDoc(HOME_URL);
    if (!doc) return Response.success(fallbackGenres());

    let data = [];
    let seen = {};
    let links = doc.select("a[href*='/the-loai/']");
    for (let i = 0; i < links.size(); i++) {
        let a = links.get(i);
        let href = normalizeUrl(a.attr("href"));
        let title = cleanText(a.attr("title") || a.text());
        title = title.replace(/^.*?\s+/, function(prefix) {
            return prefix.indexOf("fa") >= 0 ? "" : prefix;
        });
        if (!title || seen[href]) continue;
        seen[href] = true;
        data.push({title: title, input: href, script: "gen.js"});
    }
    if (data.length === 0) data = fallbackGenres();
    return Response.success(data);
}
