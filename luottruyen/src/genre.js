load("config.js");

function genreTitle(node) {
    let title = cleanText(node.attr("title") || node.attr("data-title") || node.text());
    title = title.replace(/^Truyen\s+/i, "");
    title = title.replace(/\s+\d+\s*$/, "");
    return cleanText(title);
}

function execute() {
    let doc = getDoc(BASE_URL + "/tim-truyen");
    if (!doc) return null;

    let data = [{title: "Toan bo", input: BASE_URL + "/tim-truyen", script: "gen.js"}];
    let seen = {};
    seen[BASE_URL + "/tim-truyen"] = true;

    doc.select("a[href*='/tim-truyen/']").forEach(function(a) {
        let href = normalizeUrl(a.attr("href"));
        if (!href || seen[href]) return;
        if (href.indexOf("?") >= 0) return;
        let title = genreTitle(a);
        if (!title || title.length > 60) return;
        seen[href] = true;
        data.push({title: title, input: href, script: "gen.js"});
    });

    return Response.success(data);
}
