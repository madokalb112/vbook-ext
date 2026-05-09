load('config.js');

function storyLinkNode(e) {
    let links = e.select("a[href^='/truyen/'], a[href*='truyenyy.co/truyen/']");
    for (let i = 0; i < links.size(); i++) {
        let a = links.get(i);
        let href = a.attr("href");
        if (isStoryUrl(href) && !isTocUrl(href) && !isChapterUrl(href)) return a;
    }
    return null;
}

function cardFromNode(e) {
    let a = storyLinkNode(e);
    if (!a) return null;
    let link = normalizeUrl(a.attr("href"));
    let name = cleanText(a.select("h2, h3, h4").text()) || cleanText(a.attr("title") || a.text());
    if (!name) name = firstText(e, ["h2", "h3", "h4", ".font-title"]);
    if (!name || foldText(name).indexOf("chuong") === 0 || foldText(name).indexOf("ds.chuong") >= 0) return null;

    let img = e.select("img.cover-image, img[src*='cover'], img[src*='images/public'], img").first();
    let parts = [];
    let ps = e.select("p");
    for (let i = 0; i < ps.size() && parts.length < 3; i++) {
        let text = cleanText(ps.get(i).text());
        let folded = foldText(text);
        if (!text || text === name || folded.indexOf("chuong") === 0 || folded.indexOf("ds.chuong") >= 0) continue;
        if (parts.indexOf(text) < 0) parts.push(text);
    }

    return {
        name: name,
        link: link,
        cover: imageFromNode(img),
        description: parts.join(" - "),
        host: BASE_URL
    };
}

function collectStories(doc) {
    let data = [];
    let seen = {};
    let nodes = doc.select("li:has(a[href^='/truyen/']):has(img), div:has(a[href^='/truyen/']):has(img.cover-image), div:has(a[href*='truyenyy.co/truyen/']):has(img)");
    nodes.forEach(function(e) {
        let item = cardFromNode(e);
        if (!item || !item.name || !item.link || seen[item.link]) return;
        seen[item.link] = true;
        data.push(item);
    });

    if (data.length === 0) {
        doc.select("a[href^='/truyen/'], a[href*='truyenyy.co/truyen/']").forEach(function(a) {
            let href = a.attr("href");
            if (!isStoryUrl(href) || isTocUrl(href) || isChapterUrl(href)) return;
            let link = normalizeUrl(href);
            if (seen[link]) return;
            let name = cleanText(a.attr("title") || a.text());
            if (!name || foldText(name).indexOf("chuong") === 0 || foldText(name).indexOf("ds.chuong") >= 0) return;
            seen[link] = true;
            data.push({name: name, link: link, cover: "", description: "", host: BASE_URL});
        });
    }
    return data;
}

function execute(url, page) {
    let doc = getDoc(listPageUrl(url, page));
    if (!doc) return null;
    let data = collectStories(doc);
    return Response.success(data, data.length > 0 ? nextPageFromHtml(doc, page) : "");
}
