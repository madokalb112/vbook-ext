load('config.js');

function storyLinkNode(e) {
    let selectors = [
        ".book__lg-title a[href]",
        ".book-vertical__name a[href]",
        ".book__list-name a[href]",
        "a[href*='/truyen-tranh/']"
    ];
    for (let i = 0; i < selectors.length; i++) {
        let nodes = e.select(selectors[i]);
        for (let j = 0; j < nodes.size(); j++) {
            let a = nodes.get(j);
            if (isStoryUrl(a.attr("href"))) return a;
        }
    }
    return null;
}

function itemName(e, linkNode, imgNode) {
    let name = firstText(e, [
        ".book__lg-title a",
        ".book-vertical__name a",
        ".book__list-name a",
        ".book__name a",
        "h3 a",
        "h4 a"
    ]);
    if (!name && linkNode) name = cleanText(linkNode.attr("title") || linkNode.text());
    if (!name && imgNode) name = cleanText(imgNode.attr("alt") || imgNode.attr("title"));
    return name;
}

function itemDescription(e) {
    let parts = [];
    let chapter = firstText(e, [".chapter-link a", ".book__chapter a", ".latest-chapter a"]);
    let status = firstText(e, [".book-vertical-stage", ".book__status", ".status"]);
    let time = firstText(e, [".chapter-time", ".time", ".date", ".updated-at"]);
    if (chapter) parts.push(chapter);
    if (status && status !== chapter) parts.push(status);
    if (time && time !== chapter && time !== status) parts.push(time);
    return parts.join(" - ");
}

function comicItem(e) {
    let linkNode = storyLinkNode(e);
    let imgNode = e.select(".book__lg-image img, .book-vertical__image img, .book__list-image img, img").first();
    let name = itemName(e, linkNode, imgNode);
    let link = linkNode ? normalizeUrl(linkNode.attr("href")) : "";
    return {
        name: name,
        link: link,
        cover: imageFromNode(imgNode),
        description: itemDescription(e),
        host: BASE_URL
    };
}

function collectCards(doc) {
    let data = [];
    let seen = {};
    let nodes = doc.select(".book-vertical__item, .book__list-item, .book__item, .book-item");
    nodes.forEach(function(e) {
        let item = comicItem(e);
        if (item.name && item.link && isStoryUrl(item.link) && !seen[item.link]) {
            seen[item.link] = true;
            data.push(item);
        }
    });
    return data;
}

function collectLinks(doc) {
    let data = [];
    let seen = {};
    doc.select("a[href*='/truyen-tranh/']").forEach(function(a) {
        let href = a.attr("href");
        if (!isStoryUrl(href)) return;
        let link = normalizeUrl(href);
        if (seen[link]) return;
        let name = cleanText(a.attr("title") || a.text());
        if (!name || foldText(name) === "xem") return;
        seen[link] = true;
        data.push({name: name, link: link, cover: "", description: "", host: BASE_URL});
    });
    return data;
}

function execute(url, page) {
    let requestUrl = listPageUrl(url || "/", page);
    let doc = getDoc(requestUrl);
    if (!doc) return Response.error("Khong lay duoc trang. Co the bi Cloudflare chan.");

    let data = collectCards(doc);
    if (data.length === 0) data = collectLinks(doc);
    return Response.success(data, nextPage(doc, requestUrl));
}