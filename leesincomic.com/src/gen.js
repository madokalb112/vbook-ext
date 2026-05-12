load("config.js");

function storyLinkNode(e) {
    let links = e.select("a[href]");
    for (let i = 0; i < links.size(); i++) {
        let link = links.get(i);
        if (isStoryUrl(link.attr("href"))) return link;
    }
    return null;
}

function stripCounters(text) {
    text = cleanText(text);
    return text.replace(/^\d[\d,.]*\s+\d[\d,.]*\s+/, "").trim();
}

function chapterSummary(e) {
    let chap = firstText(e, [".update .chap_name", ".chap_name", ".last_chapter", ".chapter"]);
    let time = firstText(e, [".update .time", ".time", ".chapter_time"]);
    chap = cleanText(chap).replace(/^(?:free|coin|vip)\s*/i, "").trim();
    if (chap && time) return chap + " - " + time;
    return chap || time;
}

function comicItem(e) {
    let linkNode = storyLinkNode(e);
    let imgNode = e.select(".img img, .book_avatar img, .thumb img, img").first();
    let cover = imageFromNode(imgNode);

    let name = firstText(e, [
        ".name",
        ".book_name",
        ".story-name",
        "h3 a",
        "h2 a"
    ]);
    if (!name && imgNode) name = cleanText(imgNode.attr("alt") || imgNode.attr("title"));
    if (!name && linkNode) name = cleanText(linkNode.attr("title") || linkNode.text());
    name = stripCounters(name);

    return {
        name: name,
        link: linkNode ? normalizeUrl(linkNode.attr("href")) : "",
        cover: cover,
        description: chapterSummary(e),
        host: BASE_URL
    };
}

function collectItems(doc) {
    let data = [];
    let seen = {};
    doc.select(".box_list .li_truyen, .li_truyen").forEach(function(e) {
        let item = comicItem(e);
        if (!item.name || !item.link || seen[item.link]) return;
        seen[item.link] = true;
        data.push(item);
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

        let imgNode = e.select("img").first();
        let name = cleanText(e.attr("title") || e.text());
        if (!name && imgNode) name = cleanText(imgNode.attr("alt") || imgNode.attr("title"));
        name = stripCounters(name);
        if (!name) return;

        seen[link] = true;
        data.push({
            name: name,
            link: link,
            cover: imageFromNode(imgNode),
            description: "",
            host: BASE_URL
        });
    });
    return data;
}

function execute(url, page) {
    let requestUrl = listPageUrl(url, page);
    let doc = getDoc(requestUrl);
    if (!doc) return null;

    let data = collectItems(doc);
    if (data.length === 0) data = collectByLinks(doc);

    return Response.success(data, nextPage(doc, requestUrl));
}
