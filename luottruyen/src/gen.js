load("config.js");

function storyLink(node) {
    if (!node) return null;
    let links = node.select("h3 a[href*='/truyen-tranh/'], a.jtip[href*='/truyen-tranh/'], a[href*='/truyen-tranh/']");
    for (let i = 0; i < links.size(); i++) {
        let href = normalizeUrl(links.get(i).attr("href"));
        if (/\/truyen-tranh\/[^/?#]+-\d+\/?(?:[?#].*)?$/i.test(href)) return links.get(i);
    }
    return links.first();
}

function coverFrom(node) {
    let img = node ? node.select(".image img, img").first() : null;
    let cover = normalizeImage(imageAttr(img));
    return validImage(cover) ? cover : "";
}

function itemFromNode(node) {
    let linkNode = storyLink(node);
    if (!linkNode) return null;
    let link = normalizeUrl(linkNode.attr("href"));
    let name = cleanText(linkNode.attr("title") || linkNode.text());
    if (!name) {
        let img = node.select("img").first();
        name = cleanText(img ? (img.attr("alt") || img.attr("title")) : "");
    }
    if (!name || !link) return null;

    let chapterNode = node.select(".chapter a, a[href*='chapter']").first();
    let chapter = chapterNode ? cleanText(chapterNode.text()) : "";
    return {name: name, link: link, cover: coverFrom(node), description: chapter, host: BASE_URL};
}

function parseList(doc) {
    let data = [];
    let seen = {};
    let nodes = doc.select(".items .item");
    if (nodes.size() === 0) nodes = doc.select(".item");

    nodes.forEach(function(node) {
        let item = itemFromNode(node);
        if (!item || seen[item.link]) return;
        seen[item.link] = true;
        data.push(item);
    });

    if (data.length > 0) return data;

    doc.select("a[href*='/truyen-tranh/']").forEach(function(a) {
        let href = normalizeUrl(a.attr("href"));
        if (!/\/truyen-tranh\/[^/?#]+-\d+\/?(?:[?#].*)?$/i.test(href) || seen[href]) return;
        let name = cleanText(a.attr("title") || a.text());
        if (!name || /^chapter\s/i.test(name)) return;
        seen[href] = true;
        data.push({name: name, link: href, cover: "", description: "", host: BASE_URL});
    });
    return data;
}

function currentPageFrom(urlOrPage) {
    let text = "" + (urlOrPage || "1");
    let match = /[?&]page=(\d+)/i.exec(text);
    if (match) return parseInt(match[1]);
    return /^\d+$/.test(text) ? parseInt(text) : 1;
}

function nextPage(doc, urlOrPage) {
    let current = currentPageFrom(urlOrPage);
    let activeNext = doc.select(".pagination li.active + li a, .pagination .active + li a").first();
    if (activeNext) {
        let text = cleanText(activeNext.text());
        let href = activeNext.attr("href");
        if (href && href !== "#") return normalizeUrl(href);
        if (/^\d+$/.test(text) && parseInt(text) > current) return text;
    }
    let links = doc.select(".pagination a[href], ul.pagination a[href], .page_redirect a[href]");
    let best = 0;
    let bestHref = "";
    for (let i = 0; i < links.size(); i++) {
        let a = links.get(i);
        let text = cleanText(a.text());
        let href = normalizeUrl(a.attr("href"));
        let p = 0;
        if (/^\d+$/.test(text)) p = parseInt(text);
        let match = /[?&]page=(\d+)/i.exec(href);
        if (!p && match) p = parseInt(match[1]);
        if (p > current && (!best || p < best)) {
            best = p;
            bestHref = href || ("" + p);
        }
    }
    return bestHref;
}

function execute(url, page) {
    let requestUrl = page && ("" + page).indexOf("http") === 0 ? page : normalizeUrl(url || BASE_URL + "/tim-truyen");
    if (page && /^\d+$/.test("" + page)) requestUrl = addQuery(requestUrl, "page", page);
    let doc = getDoc(requestUrl);
    if (!doc) return null;
    return Response.success(parseList(doc), nextPage(doc, requestUrl));
}
