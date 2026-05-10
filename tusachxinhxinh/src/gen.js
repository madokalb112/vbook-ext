load('config.js');

function comicFromItem(item) {
    let a = item.select(".comic-img a[href*='/truyen-tranh/'], .comic-title-link a[href*='/truyen-tranh/'], a[href*='/truyen-tranh/']").first();
    if (!a) return null;
    let link = normalizeUrl(a.attr("href"));
    if (!isStoryUrl(link)) return null;

    let slug = storySlug(link);
    let image = imageFromElement(item);
    let name = cleanTitle(a.attr("title") ||
        textOfFirst(item, ".comic-title") ||
        image.alt ||
        a.text());

    if (titleLooksBad(name) && image.alt) name = cleanTitle(image.alt);
    if (!name) name = titleFromSlug(slug);

    return {
        name: name,
        link: storyUrlFromAny(link),
        cover: image.url,
        description: cleanText(textOfFirst(item, ".comic-chapter")),
        host: BASE_URL
    };
}

function comicFromLink(doc, a) {
    let link = normalizeUrl(a.attr("href"));
    if (!isStoryUrl(link)) return null;

    let slug = storySlug(link);
    let image = imageFromElement(a);
    let name = cleanTitle(a.attr("title") ||
        textOfFirst(a, ".comic-title") ||
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
    let items = doc.select(".comic-item");
    for (let i = 0; i < items.size(); i++) {
        let item = comicFromItem(items.get(i));
        if (!item || !item.name || seen[item.link]) continue;
        seen[item.link] = true;
        data.push(item);
    }

    if (data.length > 0) return data;

    let links = doc.select("a[href*='/truyen-tranh/']");
    for (let j = 0; j < links.size(); j++) {
        let item = comicFromLink(doc, links.get(j));
        if (!item || !item.name || seen[item.link]) continue;
        seen[item.link] = true;
        data.push(item);
    }
    return data;
}

function execute(url, page) {
    let requestUrl = listPageUrl(url || (BASE_URL + "/danh-sach-truyen/"), page);
    let doc = getDoc(requestUrl);
    if (!doc) return Response.error("Khong tai duoc danh sach truyen.");
    return Response.success(parseListPage(doc), nextPage(doc, requestUrl));
}
