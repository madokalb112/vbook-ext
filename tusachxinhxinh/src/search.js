load('gen.js');

function searchApiUrl(key) {
    return BASE_URL + "/wp-json/initlise/v1/search?term=" + encodeURIComponent(key || "");
}

function storyFromSearchItem(item) {
    let url = normalizeUrl(item.url || "");
    if (isStoryUrl(url)) return url;
    let category = stripTags(item.category || "");
    let slug = slugifyTitle(category);
    if (slug) return BASE_URL + "/truyen-tranh/" + slug + "/";
    if (isChapterUrl(url)) {
        let guessed = storyUrlFromAny(url);
        if (guessed) return guessed;
    }
    return storyUrlFromAny(url);
}

function nameFromSearchItem(item) {
    let category = stripTags(item.category || "");
    if (category) return cleanTitle(category);
    return cleanTitle(stripTags(item.title || ""));
}

function parseSearchJson(text) {
    let data = [];
    let seen = {};
    if (!text) return data;
    let json;
    try {
        json = JSON.parse(text);
    } catch (error) {
        return data;
    }
    if (!json || !json.length) return data;

    for (let i = 0; i < json.length && i < 30; i++) {
        let item = json[i];
        let key = foldText(item.category || item.title || item.url || "");
        if (!key || seen[key]) continue;
        let link = storyFromSearchItem(item);
        if (!link || seen[link]) continue;
        let name = nameFromSearchItem(item);
        if (!name) name = titleFromSlug(storySlug(link));
        seen[key] = true;
        seen[link] = true;
        data.push({
            name: name,
            link: link,
            cover: normalizeImage(item.thumb || ""),
            description: stripTags(item.excerpt || item.date || ""),
            host: BASE_URL
        });
    }
    return data;
}

function execute(key, page) {
    if (page && page !== "1") return Response.success([], "");
    let text = getText(searchApiUrl(key), {headers: ajaxHeaders(HOME_URL)});
    let data = parseSearchJson(text);
    if (data.length > 0) return Response.success(data, "");

    let doc = getDoc(BASE_URL + "/?s=" + encodeURIComponent(key || ""));
    if (!doc) return Response.success([], "");
    return Response.success(parseListPage(doc), nextPage(doc, BASE_URL + "/?s=" + encodeURIComponent(key || "")));
}
