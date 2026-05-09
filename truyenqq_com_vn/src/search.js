load('config.js');

function storyLinkNode(e) {
    let links = e.select("a[href]");
    for (let i = 0; i < links.size(); i++) {
        let link = links.get(i);
        if (isStoryUrl(link.attr("href"))) return link;
    }
    return null;
}

function comicItem(e) {
    let linkNode = storyLinkNode(e);
    let imgNode = e.select("img[src*='/media/book/'], img[data-src*='/media/book/'], .poster img, .book_avatar img, .story-thumb img, .thumb img, .image img, img").first();
    let cover = "";
    if (imgNode) {
        cover = imgNode.attr("data-original") || imgNode.attr("data-src") || imgNode.attr("data-lazy-src") || imgNode.attr("src");
    }

    let name = firstText(e, [
        ".book_name a",
        ".book_name",
        ".caption h3",
        ".book-title a",
        ".book-title",
        ".item-name a",
        ".item-name",
        ".story-name a",
        ".story-name",
        ".title a",
        ".title",
        "h3 a",
        "h2 a"
    ]);
    if (!name && linkNode) name = cleanText(linkNode.attr("title") || linkNode.text());
    if (!name && imgNode) name = cleanText(imgNode.attr("alt") || imgNode.attr("title"));

    let description = firstText(e, [
        ".last_chapter",
        ".last-chapter",
        ".chapter-name",
        ".caption p",
        ".chapter",
        ".chapter_latest",
        ".item-chapter",
        ".book_update",
        ".comic-update"
    ]);

    return {
        name: name,
        link: linkNode ? normalizeUrl(linkNode.attr("href")) : "",
        cover: normalizeImage(cover),
        description: description,
        host: BASE_URL
    };
}

function collectByCards(doc) {
    let data = [];
    let seen = {};
    let nodes = doc.select(".listing .item, .listing .inner .item, .main-wrapper .listing .item");

    nodes.forEach(function(e) {
        let item = comicItem(e);
        if (item.name && item.link && !seen[item.link]) {
            seen[item.link] = true;
            data.push(item);
        }
    });

    return data;
}

function collectByLinks(doc) {
    let data = [];
    let seen = {};
    doc.select(".listing a[href], .main-wrapper .listing a[href]").forEach(function(e) {
        let href = e.attr("href");
        if (!isStoryUrl(href)) return;

        let link = normalizeUrl(href);
        if (seen[link]) return;
        let name = cleanText(e.text() || e.attr("title")).replace(/\s*đọc online\s*$/i, "");
        if (/chapter|chap/i.test(name)) return;
        if (!name) return;

        seen[link] = true;
        data.push({
            name: name,
            link: link,
            cover: "",
            description: "",
            host: BASE_URL
        });
    });
    return data;
}

function searchUrl(key, page) {
    if (!page) page = "1";
    let path = "/tim-kiem";
    if (page !== "1") path += "/trang-" + page;
    return BASE_URL + path + "?s=" + encodeURIComponent(key);
}

function execute(key, page) {
    let doc = getDoc(searchUrl(key, page));
    if (!doc) return null;

    let data = collectByCards(doc);
    if (data.length === 0) data = collectByLinks(doc);
    return Response.success(data, nextPage(doc, page));
}
