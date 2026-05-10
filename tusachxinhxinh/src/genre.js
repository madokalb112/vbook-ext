load('config.js');

function fallbackGenres() {
    let items = [
        ["Drama", "/the-loai/drama/"],
        ["Fantasy", "/the-loai/fantasy/"],
        ["Manhwa", "/the-loai/manhwa/"],
        ["Webtoon", "/the-loai/webtoon/"],
        ["Full Color", "/the-loai/full-color/"],
        ["Hien Dai", "/the-loai/hien-dai/"],
        ["Ngon Tinh", "/the-loai/ngon-tinh/"],
        ["Comedy", "/the-loai/comedy/"],
        ["Romance", "/the-loai/romance/"],
        ["School Life", "/the-loai/school-life/"]
    ];
    let result = [];
    for (let i = 0; i < items.length; i++) result.push({title: items[i][0], input: items[i][1], script: "gen.js"});
    return result;
}

function execute() {
    let doc = getDoc(BASE_URL + "/danh-sach-truyen/");
    if (!doc) return Response.success(fallbackGenres());

    let data = [];
    let seen = {};
    let links = doc.select("a[href*='/the-loai/']");
    for (let i = 0; i < links.size(); i++) {
        let a = links.get(i);
        let href = normalizeUrl(a.attr("href"));
        let title = cleanText(a.attr("title") || a.text());
        if (!title || seen[href]) continue;
        seen[href] = true;
        data.push({title: title, input: href, script: "gen.js"});
    }
    if (data.length === 0) data = fallbackGenres();
    return Response.success(data);
}
