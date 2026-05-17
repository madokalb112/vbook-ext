load('config.js');

function execute() {
    let headers = {
        "Referer": BASE_URL + "/",
        "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/142.0.0.0 Safari/537.36"
    };

    let response = fetch(BASE_URL + "/tim-truyen", {
        headers: headers
    });
    if (response.ok) {
        let doc = response.html();
        let genres = [{
            title: "Toan bo",
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
            title = title.replace(/^Truyen\s+/i, "").trim();
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
