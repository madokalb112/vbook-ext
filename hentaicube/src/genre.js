load('config.js');

function fallbackGenres() {
    return [
        {title: "Truyện màu", input: "/theloai/full-color/", script: "gen.js"},
        {title: "Không che", input: "/theloai/khong-che/", script: "gen.js"},
        {title: "Webtoon", input: "/theloai/webtoon/", script: "gen.js"},
        {title: "Manhwa", input: "/theloai/manhwa/", script: "gen.js"}
    ];
}

function execute() {
    let doc = getDoc(BASE_URL + "/the-loai-genres/");
    if (!doc) return Response.success(fallbackGenres());

    let data = [];
    let seen = {};
    doc.select("a[href*='/theloai/']").forEach(function(a) {
        let title = cleanText(a.text());
        let href = normalizeUrl(a.attr("href"));
        if (!title || !href || seen[href]) return;
        seen[href] = true;
        data.push({title: title, input: href, script: "gen.js"});
    });

    return Response.success(data.length > 0 ? data : fallbackGenres());
}
