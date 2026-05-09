load('config.js');

function comicFromLink(doc, a) {
    let href = a.attr("href");
    let link = normalizeUrl(href);
    let slug = storySlug(link);
    let image = imageForSlug(doc, slug);
    let name = cleanTitle(a.attr("title") || a.text());
    let altName = cleanTitle(image.alt);
    if (titleLooksBad(name) && altName) name = altName;
    if (!name) name = altName || titleFromSlug(slug);

    return {
        name: name,
        link: link,
        cover: image.url,
        description: "",
        host: BASE_URL
    };
}

function parseListPage(doc) {
    let data = [];
    let seen = {};
    let links = doc.select("a[href*='/truyen-tranh/']");
    for (let i = 0; i < links.size(); i++) {
        let a = links.get(i);
        let href = a.attr("href");
        if (!isStoryUrl(href)) continue;
        let item = comicFromLink(doc, a);
        if (!item.name || seen[item.link]) continue;
        seen[item.link] = data.length + 1;
        data.push(item);
    }
    return data;
}

function execute(url, page) {
    let requestUrl = listPageUrl(url || OFFICIAL_URL, page);
    let doc = getDoc(requestUrl);
    if (!doc) return Response.error("Khong tai duoc danh sach truyen.");
    return Response.success(parseListPage(doc), nextPage(doc, requestUrl));
}
