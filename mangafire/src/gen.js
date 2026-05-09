load('config.js');

function cardDescription(e) {
    let parts = [];
    let status = firstText(e, [".above > span", ".info .type", ".type"]);
    let chapter = firstText(e, ["ul.content[data-name=chap] li a span", ".below p", ".content li a span"]);
    let summary = firstText(e, [".below > span"]);
    if (status) parts.push(status);
    if (chapter && chapter !== status) parts.push(chapter);
    if (summary && parts.length < 2) parts.push(summary);
    return parts.join(" - ");
}

function comicItem(e) {
    let linkNode = e.select("a[href*='/manga/']").first();
    if (!linkNode) return null;
    let link = normalizeUrl(linkNode.attr("href"));
    if (!isStoryUrl(link)) return null;
    let imgNode = e.select("a.poster img, .poster img, img").first();
    let name = cleanText(linkNode.text() || linkNode.attr("title"));
    if (!name && imgNode) name = cleanText(imgNode.attr("alt") || imgNode.attr("title"));
    if (!name) return null;
    return {name: name, link: link, cover: imageFromNode(imgNode), description: cardDescription(e), host: BASE_URL};
}

function collectCards(doc) {
    let data = [];
    let seen = {};
    let selectors = [".tab-content .unit", "div.unit[class*=item-]", ".swiper-slide .swiper-inner", ".original.card-lg .unit"];
    for (let s = 0; s < selectors.length; s++) {
        let nodes = doc.select(selectors[s]);
        for (let i = 0; i < nodes.size(); i++) {
            let item = comicItem(nodes.get(i));
            if (item && item.link && !seen[item.link]) {
                seen[item.link] = true;
                data.push(item);
            }
        }
    }
    return data;
}

function collectLinks(doc, seen) {
    let data = [];
    let links = doc.select("a[href*='/manga/']");
    for (let i = 0; i < links.size(); i++) {
        let a = links.get(i);
        let link = normalizeUrl(a.attr("href"));
        if (!isStoryUrl(link) || seen[link]) continue;
        let name = cleanText(a.text() || a.attr("title"));
        if (!name || name.length < 2) continue;
        seen[link] = true;
        data.push({name: name, link: link, cover: "", description: "", host: BASE_URL});
    }
    return data;
}

function execute(url, page) {
    let requestUrl = listPageUrl(url || HOME_URL, page);
    let doc = getDoc(requestUrl);
    if (!doc) return Response.error("Khong lay duoc danh sach MangaFire.");
    let data = collectCards(doc);
    let seen = {};
    for (let i = 0; i < data.length; i++) seen[data[i].link] = true;
    if (data.length === 0) data = collectLinks(doc, seen);
    return Response.success(data, nextPage(doc, requestUrl));
}
