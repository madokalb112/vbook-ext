load('config.js');

function execute() {
    let response = request(BASE_URL + "/");
    if (response.ok) {
        let doc = response.html();
        let data = [];
        let seen = {};

        doc.select("a[href*='/the-loai/']").forEach(function(e) {
            let href = normalizeUrl(e.attr("href"));
            let title = cleanText(e.text()).replace(/^»\s*/, "");
            if (title && href && !seen[href]) {
                seen[href] = true;
                data.push({
                    title: title,
                    input: href,
                    script: "gen.js"
                });
            }
        });

        return Response.success(data);
    }

    return null;
}
