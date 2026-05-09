load('config.js');

function execute(key, page) {
    let requestUrl = page && page.indexOf("http") === 0 ? page : BASE_URL + "/tim-kiem-nang-cao";
    let options = {
        headers: {
            "Referer": BASE_URL + "/",
            "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36"
        }
    };

    if (!page || page.indexOf("http") !== 0) {
        options.queries = {
            keyword: key,
            page: page ? page : "1"
        };
    }

    let response = fetch(requestUrl, options);
    if (response.ok) {
        let doc = response.html();
        let data = [];

        doc.select(".comic-list .comic-item").forEach(function(e) {
            let linkNode = e.select(".comic-title-link a[href]").first();
            if (!linkNode) {
                linkNode = e.select(".comic-img a[href]").first();
            }

            let imgNode = e.select(".comic-img img").first();
            let cover = "";
            if (imgNode) {
                cover = imgNode.attr("data-src") || imgNode.attr("data-original") || imgNode.attr("src");
            }

            if (linkNode) {
                data.push({
                    name: linkNode.text().replace(/\s+/g, " ").trim(),
                    link: linkNode.attr("href"),
                    cover: normalizeImage(cover),
                    description: e.select(".comic-chapter").first().text(),
                    host: BASE_URL
                });
            }
        });

        return Response.success(data, nextPage(doc));
    }

    return null;
}
