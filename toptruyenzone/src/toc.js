load('config.js');

function execute(url) {
    let doc = getDoc(url);
    if (!doc) return null;

    let data = [];
    let seen = {};
    doc.select("#list-chapter-dt a.chapter[href], .list-chapter a.chapter[href]").forEach(function(e) {
        let href = e.attr("href");
        let name = cleanText(e.text());
        if (!href || !name) return;
        if (e.attr("data-id") === "9999") return;
        if (foldText(name).indexOf("truy cap") >= 0) return;

        let link = normalizeUrl(href);
        if (seen[link]) return;
        seen[link] = true;
        data.push({
            name: name,
            url: link,
            host: BASE_URL
        });
    });

    return Response.success(data.reverse());
}
