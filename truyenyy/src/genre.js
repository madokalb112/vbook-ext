load('config.js');

function execute() {
    let doc = getDoc(BASE_URL + "/");
    if (!doc) return null;

    let data = [];
    let seen = {};
    doc.select("a[href]").forEach(function(a) {
        let href = a.attr("href");
        if (!href || href.indexOf("/") !== 0 || href.indexOf("/truyen/") === 0 || href.indexOf("/tim-kiem") === 0) return;
        let title = cleanText(a.text()).replace(/^Truyen\s+/i, "");
        let folded = foldText(title);
        if (!title || title.length > 40 || folded.indexOf("yy") === 0 || folded.indexOf("tai app") >= 0) return;
        let link = normalizeUrl(href);
        if (seen[link]) return;
        seen[link] = true;
        data.push({title: title, input: link, script: "gen.js"});
    });
    return Response.success(data);
}
