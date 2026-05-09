load('config.js');

function searchItem(e) {
    let linkNode = e.select(".book__list-name a[href], a[href*='/truyen-tranh/']").first();
    if (!linkNode || !isStoryUrl(linkNode.attr("href"))) return null;
    let imgNode = e.select(".book__list-image img, img").first();
    let chapter = firstText(e, [".chapter-link a", ".book__chapter a"]);
    let status = firstText(e, [".status", ".book__status"]);
    let desc = [];
    if (chapter) desc.push(chapter);
    if (status) desc.push(status);
    return {
        name: cleanText(linkNode.text() || linkNode.attr("title")),
        link: normalizeUrl(linkNode.attr("href")),
        cover: imageFromNode(imgNode),
        description: desc.join(" - "),
        host: BASE_URL
    };
}

function execute(key, page) {
    let searchUrl = BASE_URL + "/tim-kiem?s=" + encodeURIComponent(key || "");
    let requestUrl = addPageParam(searchUrl, page);
    let doc = getDoc(requestUrl);
    if (!doc) return Response.error("Khong lay duoc ket qua tim kiem. Co the bi Cloudflare chan.");

    let data = [];
    let seen = {};
    doc.select(".book__list-item").forEach(function(e) {
        let item = searchItem(e);
        if (item && item.name && item.link && !seen[item.link]) {
            seen[item.link] = true;
            data.push(item);
        }
    });

    return Response.success(data, nextPage(doc, requestUrl));
}