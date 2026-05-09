load('config.js');

function execute(key, page) {
    if (!page) page = '1';

    let response = fetch(BASE_URL + "/tim-truyen", {
        method: "GET",
        queries: {
            keyword: key,
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
                cover = imgNode.attr("data-original") || imgNode.attr("data-src") || imgNode.attr("src");
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
