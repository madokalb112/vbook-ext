load('config.js');

function comicFromLink(doc, a) {
    let link = normalizeUrl(a.attr("href"));
    if (!isStoryUrl(link)) return null;

    let slug = storySlug(link);
    let image = imageFromElement(a);
    let name = cleanTitle(a.attr("title") ||
        textOfFirst(a, "strong") ||
        textOfFirst(a, "h2") ||
        textOfFirst(a, "h3") ||
        image.alt ||
        a.text());

    if (!image.url) image = imageForStoryInDoc(doc, link, name);
    if (titleLooksBad(name) && image.alt) name = cleanTitle(image.alt);
    if (!name) name = titleFromSlug(slug);

    return {
        name: name,
        link: storyUrlFromAny(link),
        cover: image.url,
        description: "",
        host: BASE_URL
    };
}

function parseListPage(doc) {
    let data = [];
    let seen = {};
    let links = doc.select("a.series-card[href], a.popular-slide[href], a.related-card[href], a.release-cover[href], a[href]");
    for (let i = 0; i < links.size(); i++) {
        let item = comicFromLink(doc, links.get(i));
        if (!item || !item.name || seen[item.link]) continue;
        seen[item.link] = true;
        data.push(item);
    }
    return data;
}

function execute(url, page) {
    let requestUrl = listPageUrl(url || HOME_URL, page);
    let doc = getDoc(requestUrl);
    if (!doc) return Response.error("Khong tai duoc danh sach truyen.");
    return Response.success(parseListPage(doc), nextPage(doc, requestUrl));
}
