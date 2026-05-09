load('config.js');

function authorNames(manga) {
    let names = [];
    let rel = manga && manga.relationships ? manga.relationships : {};
    let lists = [rel.authors, rel.artists];
    let seen = {};
    for (let i = 0; i < lists.length; i++) {
        let list = lists[i] || [];
        for (let j = 0; j < list.length; j++) {
            let name = cleanText(list[j].name);
            if (name && !seen[name]) {
                seen[name] = true;
                names.push(name);
            }
        }
    }
    return names.join(", ");
}

function mangaFromItem(item) {
    if (item && item.relationships && item.relationships.manga) {
        return item.relationships.manga;
    }
    return item;
}

function comicItem(item) {
    let manga = mangaFromItem(item);
    if (!manga || !manga.id || !manga.title) return null;

    let description = "";
    if (item && item.chapter) {
        description = "Ch. " + item.chapter;
        if (item.volume) description = "Vol. " + item.volume + " - " + description;
    }
    if (manga.status) {
        description += (description ? " - " : "") + manga.status;
    }
    let authors = authorNames(manga);
    if (authors) {
        description += (description ? " - " : "") + authors;
    }

    return {
        name: cleanText(manga.title),
        link: BASE_URL + "/manga/" + manga.id + "/" + slugify(manga.title),
        cover: coverUrl(manga),
        description: description,
        host: BASE_URL
    };
}

function execute(url, page) {
    let requestUrl = page && page.indexOf("http") === 0 ? page : normalizeUrl(url);
    let response = requestJson(requestUrl);
    if (response.ok) {
        let json = response.json();
        let items = json.data || [];
        let data = [];
        let seen = {};

        for (let i = 0; i < items.length; i++) {
            let item = comicItem(items[i]);
            if (item && item.name && item.link && !seen[item.link]) {
                seen[item.link] = true;
                data.push(item);
            }
        }

        return Response.success(data, nextApiPage(requestUrl, json));
    }

    return null;
}
