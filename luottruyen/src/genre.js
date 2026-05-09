load('config.js');

function execute() {
    let response = fetch(BASE_URL + "/tim-truyen");
    if (response.ok) {
        let doc = response.html();
        let genres = [{
            title: "Toàn bộ",
            input: BASE_URL + "/tim-truyen",
            script: "gen.js"
        }];
        let seen = {};
        seen[BASE_URL + "/tim-truyen"] = true;

        doc.select("a[href*=tim-truyen]").forEach(e => {
            let href = normalizeUrl(e.attr("href"));
            if (!href || href.indexOf("/tim-truyen/") < 0 || seen[href]) {
                return;
            }

            let title = e.attr("title") || e.attr("data-title") || e.text();
            title = title.replace(/^Truyện\s+/i, "").trim();
            if (!title) {
                return;
            }

            seen[href] = true;
            genres.push({
                title: title,
                input: href,
                script: "gen.js"
            });
        });

        return Response.success(genres);
    }

    return null;
}
