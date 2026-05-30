load('config.js');

function execute(url, page) {
    if (!page) page = '1';
    url = normalizeUrl(url);

    let headers = {
        "Referer": BASE_URL + "/",
        "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/142.0.0.0 Safari/537.36"
    };

    let response = request(url, {
        method: "GET",
        headers: headers,
        queries: {
            page: page
        }
    });

    if (response.ok) {
        let doc = response.html();
        let next = doc.select(".pagination").select("li.active + li").text();
        let data = [];

        doc.select(".items .item").forEach(e => {
            let linkNode = e.select("h3 a").first();
            if (!linkNode) {
                linkNode = e.select("a.jtip").first();
            }

            let imgNode = e.select(".image img").first();
            let cover = "";
            if (imgNode) {
                cover = imgNode.attr("src") || imgNode.attr("data-original") || imgNode.attr("data-src");
            }

            data.push({
                name: linkNode.text(),
                link: linkNode.attr("href"),
                cover: normalizeImage(cover),
                description: e.select(".chapter a").first().text(),
                host: BASE_URL
            });
        });

        return Response.success(data, next);
    }

    return null;
}
