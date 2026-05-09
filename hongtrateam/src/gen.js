load('config.js');

function storyLinkNode(e) {
    let links = e.select("a[href]");
    for (let i = 0; i < links.size(); i++) {
        let a = links.get(i);
        if (isStoryUrl(a.attr("href"))) return a;
    }
    return null;
}

function itemDescription(e) {
    let parts = [];
    e.select(".list-chapter .chapter a, .chapter-item .chapter a, .chapter a").forEach(function(a) {
        let text = cleanText(a.text());
        if (text && parts.length < 3) parts.push(text);
    });
    let date = firstText(e, [".timediff", ".post-on", ".manga-views"]);
    if (date) parts.push(date);
    return parts.join(" - ");
}

function comicItem(e) {
    let linkNode = storyLinkNode(e);
    let imgNode = e.select(".item-thumb img, .popular-img img, .tab-thumb img, .summary_image img, img").first();
    let name = firstText(e, [
        ".post-title a",
        ".widget-title a",
        ".manga-title a",
        "h3 a",
        "h4 a"
    ]);
    if (!name && linkNode) name = stripProtected(linkNode.attr("title") || linkNode.text());
    if (!name && imgNode) name = stripProtected(imgNode.attr("alt") || imgNode.attr("title"));

    return {
        name: name,
        link: linkNode ? normalizeUrl(linkNode.attr("href")) : "",
        cover: imageFromNode(imgNode),
        description: itemDescription(e),
        host: BASE_URL
    };
}

function collectCards(doc) {
    let data = [];
    let seen = {};
    let nodes = doc.select(".page-item-detail, .popular-item-wrap, .c-tabs-item__content, .row.c-tabs-item__content");
    nodes.forEach(function(e) {
        let item = comicItem(e);
        if (item.name && item.link && !seen[item.link]) {
            seen[item.link] = true;
            data.push(item);
        }
    });
    return data;
}

function collectLinks(doc) {
    let data = [];
    let seen = {};
    doc.select("a[href*='/truyen/']").forEach(function(a) {
        let href = a.attr("href");
        if (!isStoryUrl(href)) return;
        let link = normalizeUrl(href);
        if (seen[link]) return;
        let name = stripProtected(a.attr("title") || a.text());
        if (!name || foldText(name).indexOf("chapter") >= 0 || foldText(name).indexOf("chuong") >= 0) return;
        seen[link] = true;
        data.push({name: name, link: link, cover: detailCover(link), description: "", host: BASE_URL});
    });
    return data;
}

function execute(url, page) {
    let doc = getDoc(listPageUrl(url, page));
    if (!doc) return null;

    let data = collectCards(doc);
    if (data.length === 0) data = collectLinks(doc);
    return Response.success(data, nextPage(doc));
}
