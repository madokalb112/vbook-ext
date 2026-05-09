load('config.js');

function comicItem(e) {
    let linkNode = e.select(".comic-title-link a[href]").first();
    if (!linkNode) {
        linkNode = e.select(".comic-img a[href]").first();
    }

    let imgNode = e.select(".comic-img img").first();
    let cover = "";
    if (imgNode) {
        cover = imgNode.attr("data-src") || imgNode.attr("data-original") || imgNode.attr("src");
    }

    return {
        name: linkNode ? linkNode.text().replace(/\s+/g, " ").trim() : "",
        link: linkNode ? linkNode.attr("href") : "",
        cover: normalizeImage(cover),
        description: e.select(".comic-chapter").first().text(),
        host: BASE_URL
    };
}

function execute(url, page) {
    let requestUrl = page && page.indexOf("http") === 0 ? page : normalizeUrl(url);
    if (page && page.indexOf("http") !== 0) {
        requestUrl = requestUrl + (requestUrl.indexOf("?") >= 0 ? "&" : "?") + "page=" + page;
    }

    let response = request(requestUrl);
    if (response.ok) {
        let doc = response.html();
        let data = [];

        doc.select(".comic-list .comic-item").forEach(function(e) {
            let item = comicItem(e);
            if (item.name && item.link) {
                data.push(item);
            }
        });

        return Response.success(data, nextPage(doc));
    }

    return null;
}
