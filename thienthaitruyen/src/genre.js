load('config.js');

function fallbackGenres() {
    let items = [
        ["Adult", "/the-loai/adult"],
        ["Ecchi", "/the-loai/ecchi"],
        ["Harem", "/the-loai/harem"],
        ["Hentai", "/the-loai/hentai"],
        ["Manhwa", "/the-loai/manhwa"],
        ["Smut", "/the-loai/smut"],
        ["Truyen tranh 18+", "/the-loai/truyen-tranh-18"],
        ["Webtoon", "/the-loai/webtoon"],
        ["Manhua", "/the-loai/manhua"],
        ["Manga", "/the-loai/manga"],
        ["NTR", "/the-loai/ntr"],
        ["Milf", "/the-loai/milf"],
        ["Yuri", "/the-loai/yuri"],
        ["Yaoi", "/the-loai/yaoi"],
        ["Thien Thai", "/the-loai/thien-thai"]
    ];
    let result = [];
    for (let i = 0; i < items.length; i++) result.push({title: items[i][0], input: items[i][1], script: "gen.js"});
    return result;
}

function execute() {
    let doc = getDoc("/the-loai");
    if (!doc) doc = getDoc(OFFICIAL_URL);
    if (!doc) return Response.success(fallbackGenres());

    let data = [];
    let seen = {};
    let links = doc.select("a[href*='/the-loai/'], a[href*='/tag/']");
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
