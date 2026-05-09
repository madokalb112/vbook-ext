load('config.js');

function comicItem(e) {
    let linkNode = e.select("a[href*='/truyen-'][href$='.html']").first();
    if (!linkNode) {
        linkNode = e.select(".post-title a[href], .line-2 a[href], .item-summary a[href], .info-item a[href], .item-thumb > a[href], .img-item > a[href]").first();
    }

    let imgNode = e.select(".item-thumb img, .img-item img, img").first();
    let cover = "";
    if (imgNode) {
        cover = imgNode.attr("data-src") || imgNode.attr("data-original") || imgNode.attr("data-lazy-src") || imgNode.attr("src");
    }

    let name = linkNode ? cleanText(linkNode.text()) : "";
    if (!name && linkNode) {
        name = cleanText(linkNode.attr("title"));
    }
    if (!name && imgNode) {
        name = cleanText(imgNode.attr("alt") || imgNode.attr("title"));
    }

    let chapterNode = e.select(".chapter a, .chapter-item a, .btn-link").first();
    let timeNode = e.select(".post-on, .chapter-release-date").first();
    let chapter = chapterNode ? cleanText(chapterNode.text()) : "";
    let time = timeNode ? cleanText(timeNode.text()) : "";
    let description = chapter;
    if (time) {
        description += (description ? " - " : "") + time;
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
        let nodes = doc.select(".manga-content .page-item-detail, .listing .page-item-detail, .slide-home .item, .page-item-detail");

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
