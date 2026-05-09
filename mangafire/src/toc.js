load('config.js');

function chapterName(a, li) {
    let first = a.select("span").first();
    let name = cleanText(first ? first.text() : "");
    if (!name) name = cleanText(a.attr("title") || a.text());
    let number = cleanText(li.attr("data-number"));
    if (number && name.toLowerCase().indexOf("chapter") < 0 && name.toLowerCase().indexOf("chap") < 0) name = "Chapter " + number + (name ? ": " + name : "");
    return name || "Chapter " + number;
}

function parseChapterHtml(html) {
    let doc = htmlFragment(html);
    let data = [];
    let seen = {};
    let nodes = doc.select("li.item, li");
    for (let i = 0; i < nodes.size(); i++) {
        let li = nodes.get(i);
        let a = li.select("a[href*='/read/']").first();
        if (!a) continue;
        let href = normalizeUrl(a.attr("href"));
        if (!isChapterUrl(href) || seen[href]) continue;
        seen[href] = true;
        data.push({name: chapterName(a, li), url: href, host: BASE_URL});
    }
    data.reverse();
    return data;
}

function execute(url) {
    let id = mangaId(url);
    if (!id) return Response.error("Khong tim thay ID truyen.");
    let api = BASE_URL + "/ajax/manga/" + id + "/chapter/en";
    let response = requestJson(api, storyUrlFromAny(url));
    if (response.ok) {
        let json = response.json();
        if (json && json.result) {
            let data = parseChapterHtml(json.result);
            if (data.length > 0) return Response.success(data);
        }
    }
    let doc = getDoc(storyUrlFromAny(url));
    if (!doc) return Response.error("Khong lay duoc danh sach chapter.");
    let data = parseChapterHtml(doc.select(".tab-content[data-name=chapter], .list-body").html());
    if (data.length === 0) return Response.error("Khong tim thay chapter.");
    return Response.success(data);
}
