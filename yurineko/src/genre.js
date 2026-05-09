load('config.js');

function execute() {
    let response = request(BASE_URL + "/");
    if (response.ok) {
        let doc = response.html();
        let genres = [];
        let seen = {};

        doc.select("a[href*=/the-loai/]").forEach(function(e) {
            let href = normalizeUrl(e.attr("href"));
            let title = e.text().replace(/\s+/g, " ").trim();
            if (!href || !title || seen[href]) {
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
