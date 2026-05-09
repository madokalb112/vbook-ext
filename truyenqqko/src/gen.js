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
    let imgNode = e.select(".book_avatar img, .story-thumb img, .thumb img, .image img, img").first();
    let cover = imageFromNode(imgNode);

    let name = firstText(e, [
        ".book_name a",
        ".book_name",
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
        ".chapter",
        ".chapter_latest",
        ".item-chapter"
    ]);

    if (cover && cover.indexOf('http') < 0) {
        cover = normalizeImage(cover);
    }

    return {
        name: name,
        link: linkNode ? normalizeUrl(linkNode.attr("href")) : "",
        cover: cover,
        description: description,
        host: BASE_URL
    };
}

function collectByCards(doc) {
    let data = [];
    let seen = {};
    let nodes = doc.select("#main_homepage .list_grid li, .list_grid li, .book-item, .story-item, .item-comic, .comic-item");

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
    doc.select("a[href]").forEach(function(e) {
        let href = e.attr("href");
        if (!isStoryUrl(href)) return;

        let link = normalizeUrl(href);
        if (seen[link]) return;
        let name = cleanText(e.attr("title") || e.text());
        if (!name || /chapter|chap/i.test(name)) return;

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

function rememberCover(map, item) {
    if (!item) return;
    let link = normalizeUrl(item.url || item["@id"] || "");
    let cover = normalizeImage(item.image || item.thumbnail || "");
    if (link && cover && !isBadImage(cover)) map[link] = cover;
}

function collectJsonLdCovers(doc) {
    let map = {};
    doc.select("script[type='application/ld+json']").forEach(function(script) {
        let text = cleanText(script.html() || script.data() || script.text());
        if (!text || text.indexOf("itemListElement") < 0) return;
        try {
            let json = JSON.parse(text);
            let list = json.itemListElement || [];
            for (let i = 0; i < list.length; i++) {
                rememberCover(map, list[i].item || list[i]);
            }
        } catch (error) {
        }
    });
    return map;
}

function execute(url, page) {
    let doc = getDoc(listPageUrl(url, page));
    if (!doc) return null;

    let data = collectByCards(doc);
    if (data.length === 0) data = collectByLinks(doc);
    let coverMap = collectJsonLdCovers(doc);
    for (let i = 0; i < data.length; i++) {
        let link = normalizeUrl(data[i].link);
        if ((!data[i].cover || isBadImage(data[i].cover)) && coverMap[link]) {
            data[i].cover = coverMap[link];
        }
    }
    return Response.success(data, nextPage(doc, page));
}
