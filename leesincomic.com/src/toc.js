load("config.js");

function cleanChapterName(text) {
    text = cleanText(text).replace(/^(?:free|coin|vip)\s*/i, "").trim();
    if (!text) return "";
    if (/^(?:chap(?:ter)?|chuong|ch\.|oneshot|extra|ngoai truyen)/i.test(text)) return text;
    if (/^\d+(?:[-.]\d+)?$/i.test(text)) return "Chuong " + text;
    return text;
}

function chapterName(a, row) {
    let name = "";
    if (row) name = firstText(row, [".chap_name", ".chapter-name", ".name"]);
    if (!name) name = cleanText(a.text());
    name = cleanChapterName(name);
    if (name) return name;

    let title = cleanText(a.attr("title"));
    if (title) return title;

    let match = /\/([^\/?#]+)\.html/i.exec(a.attr("href") || "");
    if (!match) return "Chuong";
    let slug = match[1].replace(/^chap(?:ter)?-?/i, "").replace(/^chuong-?/i, "");
    return cleanChapterName(slug) || "Chuong";
}

function execute(url) {
    let doc = getDoc(storyUrlFromChapter(url));
    if (!doc) return null;

    let temp = [];
    let seen = {};
    doc.select(".list-chapters .chapter-item, .list-chapters .row, .chapter-item").forEach(function(row) {
        let a = row.select("a[href]").first();
        if (!a) return;
        let href = a.attr("href");
        if (!isChapterUrl(href)) return;
        let link = normalizeUrl(href);
        if (seen[link]) return;
        seen[link] = true;
        temp.push({
            name: chapterName(a, row),
            url: link,
            host: BASE_URL
        });
    });

    if (temp.length === 0) {
        doc.select("a[href]").forEach(function(a) {
            let href = a.attr("href");
            if (!isChapterUrl(href)) return;
            let link = normalizeUrl(href);
            if (seen[link]) return;
            seen[link] = true;
            temp.push({
                name: chapterName(a, null),
                url: link,
                host: BASE_URL
            });
        });
    }

    if (temp.length > 1) temp.reverse();
    return Response.success(temp);
}
