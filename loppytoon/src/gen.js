load('config.js');

function comicItem(e) {
    let linkNode = e.select("a[href*='/truyen/']").first();
    let imgNode = e.select(".comic-cover img, img.cover-image, img").first();
    let cover = "";
    if (imgNode) {
        cover = imgNode.attr("data-src") || imgNode.attr("data-original") || imgNode.attr("src");
    }

    let name = cleanText(e.select(".comic-title, .hot-comic-info .comic-title").first() ? e.select(".comic-title, .hot-comic-info .comic-title").first().text() : "");
    if (!name && imgNode) {
        name = cleanText(imgNode.attr("alt") || imgNode.attr("title"));
    }
    if (!name && linkNode) {
        name = cleanText(linkNode.attr("title") || linkNode.text());
    }

    let chapterNode = e.select(".comic-chapter").first();
    let viewsNode = e.select(".comic-views").first();
    let description = chapterNode ? cleanText(chapterNode.text()) : "";
    let views = viewsNode ? cleanText(viewsNode.text()) : "";
    if (views) {
        description += (description ? " - " : "") + views;
    }

    return {
        name: name,
        link: linkNode ? normalizeUrl(linkNode.attr("href")) : "",
        cover: normalizeImage(cover),
        description: description,
        host: BASE_URL
    };
}

function execute(url, page) {
    let requestUrl = appendPage(url, page);
    let response = request(requestUrl);
    if (response.ok) {
        let doc = response.html();
        let data = [];
        let seen = {};
        let nodes = doc.select(".comic-item, .hot-comic-item");

        nodes.forEach(function(e) {
            let item = comicItem(e);
            if (item.name && item.link && !seen[item.link]) {
                seen[item.link] = true;
                data.push(item);
            }
        });

        return Response.success(data, nextPage(doc));
    }

    return null;
}
