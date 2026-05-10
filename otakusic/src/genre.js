load("config.js");

function execute() {
    let doc = getDoc(BASE_URL + "/");
    if (!doc) return null;

    let data = [{
        title: "Tat ca",
        input: BASE_URL + "/tim-kiem",
        script: "gen.js"
    }];
    let seen = {};
    seen[BASE_URL + "/tim-kiem"] = true;

    let links = doc.select("a[href*='/the-loai/']");
    for (let i = 0; i < links.size(); i++) {
        let a = links.get(i);
        let href = normalizeUrl(a.attr("href"));
        let title = cleanText(a.text());
        if (!href || !title || seen[href]) continue;
        seen[href] = true;
        data.push({
            title: title,
            input: href,
            script: "gen.js"
        });
    }

    return Response.success(data);
}
