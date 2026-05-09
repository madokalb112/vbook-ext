load('config.js');

function execute() {
    let doc = getDoc(BASE_URL + "/");
    if (!doc) return null;

    let data = [];
    let seen = {};
    doc.select("a[href*='/the/'], a[href*='/the-loai/']").forEach(function(e) {
        let href = normalizeUrl(e.attr("href"));
        let title = cleanText(e.text());
        if (!title || !href || seen[href]) return;
        seen[href] = true;
        data.push({
            title: title,
            input: href,
            script: "gen.js"
        });
    });

    return Response.success(data);
}
