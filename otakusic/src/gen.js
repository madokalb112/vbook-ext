load("config.js");

function itemFromApi(row) {
    let categories = [];
    try {
        let cats = row.categories || [];
        for (let i = 0; i < cats.length; i++) {
            if (cats[i].name) categories.push(cats[i].name);
        }
    } catch (error) {
    }
    return {
        name: cleanText(row.name),
        link: storyUrl(row.slug),
        cover: normalizeImage(row.image_url || row.thumb_url),
        description: categories.join(", "),
        host: BASE_URL
    };
}

function listFromApi(url) {
    let response = requestJson(url);
    if (!response.ok) return null;
    let json = response.json();
    let rows = json && json.data ? json.data : [];
    let data = [];
    for (let i = 0; i < rows.length; i++) {
        if (rows[i].slug) data.push(itemFromApi(rows[i]));
    }
    return Response.success(data);
}

function itemFromCard(card) {
    let linkNode = card.select("a[href*='/chi-tiet/']").first();
    if (!linkNode) return null;

    let img = card.select("img[src*='/manga/uploads/manga/']").first();
    let titleNode = card.select("h4").first();
    let name = cleanText(card.attr("title")) || cleanText(titleNode ? titleNode.text() : "") || cleanText(img ? img.attr("alt") : "");
    let cover = img ? (img.attr("data-src") || img.attr("src")) : "";

    let desc = "";
    let chapter = card.select("span:contains(Chapter), div:contains(Chapter)").last();
    if (chapter) desc = cleanText(chapter.text()).replace(/^.*?(Chapter\s*:?\s*[0-9.]+).*$/i, "$1");

    if (!name) return null;
    return {
        name: name,
        link: normalizeUrl(linkNode.attr("href")),
        cover: normalizeImage(cover),
        description: desc,
        host: BASE_URL
    };
}

function listFromHtml(url, page) {
    let requestUrl = addPageParam(url, page);
    let doc = getDoc(requestUrl);
    if (!doc) return null;

    let data = [];
    let seen = {};
    let cards = doc.select(".card-wrapper[id]");
    for (let i = 0; i < cards.size(); i++) {
        let item = itemFromCard(cards.get(i));
        if (!item || !item.link || seen[item.link]) continue;
        seen[item.link] = true;
        data.push(item);
    }

    if (data.length === 0) {
        let links = doc.select("a[href*='/chi-tiet/']");
        for (let i = 0; i < links.size(); i++) {
            let a = links.get(i);
            let href = normalizeUrl(a.attr("href"));
            let name = cleanText(a.attr("title") || a.text());
            if (!href || !name || seen[href]) continue;
            seen[href] = true;
            data.push({name: name, link: href, cover: "", description: "", host: BASE_URL});
        }
    }

    return Response.success(data, nextPage(doc, requestUrl));
}

function execute(url, page) {
    url = normalizeUrl(url || BASE_URL + "/tim-kiem");
    if (url.indexOf(API_URL + "/manga/ranking") === 0) {
        return listFromApi(url);
    }
    return listFromHtml(url, page);
}
