load('config.js');

function fallbackGenres() {
    return [
        { title: "Manhwa", input: BASE_URL + "/genre/manhwa", script: "gen.js" },
        { title: "Manga", input: BASE_URL + "/genre/manga", script: "gen.js" },
        { title: "One shot", input: BASE_URL + "/genre/one-shot", script: "gen.js" },
        { title: "Doujinshi", input: BASE_URL + "/genre/doujinshi", script: "gen.js" },
        { title: "Adult", input: BASE_URL + "/genre/adult", script: "gen.js" }
    ];
}

function execute() {
    let response = request(BASE_URL + "/genre");
    if (response.ok) {
        let doc = response.html();
        let data = [];
        let seen = {};

        doc.select("a.genre-card[href], .genres-grid a[href]").forEach(function(e) {
            let title = cleanText(e.select(".name").text()) || cleanText(e.text());
            let href = e.attr("href");
            if (title && href && !seen[href]) {
                seen[href] = true;
                data.push({
                    title: title,
                    input: normalizeUrl(href),
                    script: "gen.js"
                });
            }
        });

        if (data.length > 0) {
            return Response.success(data);
        }
    }

    return Response.success(fallbackGenres());
}
