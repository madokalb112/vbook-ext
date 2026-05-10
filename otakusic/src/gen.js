load('config.js');

function isBadName(name) {
    if (!name || name.length < 2) return true;
    if (/^M[oớ]i\s+[\d,.]+/i.test(name)) return true;
    if (/^(chapter|chap|ch\.)\s/i.test(name)) return true;
    if (/^[\d,.]+\s*(chapter|chap|ch\.)/i.test(name)) return true;
    let f = foldText(name);
    if (f === "doc lien" || f === "chi tiet" || f === "xem them") return true;
    return false;
}

function comicItem(e) {
    let linkNode = null;
    let links = e.select("a[href*='/chi-tiet/']");
    for (let i = 0; i < links.size(); i++) {
        let href = links.get(i).attr("href");
        if (isDetailUrl(href)) {
            linkNode = links.get(i);
            break;
        }
    }

    if (!linkNode) {
        links = e.select("a[href]");
        for (let i = 0; i < links.size(); i++) {
            let href = links.get(i).attr("href");
            if (isDetailUrl(href)) {
                linkNode = links.get(i);
                break;
            }
        }
    }

    let imgNode = e.select("img").first();
    let cover = imageFromNode(imgNode);

    let name = "";
    let nameNode = e.select("h3 a, h4 a, h3, h4, .manga-name a, .comic-name a, .title a").first();
    if (nameNode) name = cleanText(nameNode.text());
    if (isBadName(name)) name = "";
    if (!name) {
        links = e.select("a[href*='/chi-tiet/']");
        for (let i = 0; i < links.size(); i++) {
            let candidate = cleanText(links.get(i).attr("title") || links.get(i).text());
            if (!isBadName(candidate)) { name = candidate; break; }
        }
    }
    if (!name && linkNode) name = cleanText(linkNode.attr("title") || linkNode.text());
    if (!name && imgNode) name = cleanText(imgNode.attr("alt") || imgNode.attr("title"));

    let description = "";
    let chapNode = e.select("[class*=chapter], [class*=Chapter]").first();
    if (chapNode) description = cleanText(chapNode.text());
    if (!description) {
        let text = cleanText(e.text());
        var chapMatch = /Chapter[:\s#]*(\d+)/i.exec(text);
        if (chapMatch) description = "Chapter " + chapMatch[1];
    }

    return {
        name: name,
        link: linkNode ? normalizeUrl(linkNode.attr("href")) : "",
        cover: cover,
        description: description,
        host: BASE_URL
    };
}

function collectCards(doc) {
    let data = [];
    let seen = {};
    let selectors = [
        ".comic-item",
        ".manga-item",
        ".story-item",
        ".book-item",
        ".item-comic",
        ".card",
        "[class*=comic-card]",
        "[class*=manga-card]"
    ];

    for (let s = 0; s < selectors.length; s++) {
        let nodes = doc.select(selectors[s]);
        if (nodes.size() > 0) {
            nodes.forEach(function(e) {
                let item = comicItem(e);
                if (item.name && item.link && !seen[item.link]) {
                    seen[item.link] = true;
                    data.push(item);
                }
            });
            if (data.length > 0) return data;
        }
    }

    return data;
}

function collectByLinks(doc) {
    let data = [];
    let seen = {};
    let covers = {};

    doc.select("a[href*='/chi-tiet/']").forEach(function(e) {
        let href = e.attr("href");
        if (!isDetailUrl(href)) return;
        let link = normalizeUrl(href);
        if (covers[link]) return;
        let imgNode = e.select("img").first();
        if (imgNode) covers[link] = imageFromNode(imgNode);
    });

    doc.select("a[href*='/chi-tiet/']").forEach(function(e) {
        let href = e.attr("href");
        if (!isDetailUrl(href)) return;
        let link = normalizeUrl(href);
        if (seen[link]) return;

        let name = "";
        let imgNode = e.select("img").first();
        if (imgNode) {
            name = cleanText(imgNode.attr("alt") || imgNode.attr("title"));
        }
        if (!name || isBadName(name)) {
            name = cleanText(e.attr("title") || e.text());
        }
        if (isBadName(name)) return;

        seen[link] = true;
        data.push({
            name: name,
            link: link,
            cover: covers[link] || "",
            description: "",
            host: BASE_URL
        });
    });
    return data;
}

function execute(url, page) {
    let requestUrl = page && ("" + page).indexOf("http") === 0 ? page : normalizeUrl(url);
    if (page && /^\d+$/.test("" + page)) {
        requestUrl = addQuery(normalizeUrl(url), "page", page);
    }

    let doc = getDoc(requestUrl);
    if (!doc) return null;

    let data = collectCards(doc);
    if (data.length === 0) data = collectByLinks(doc);

    return Response.success(data, nextPage(doc, requestUrl));
}
