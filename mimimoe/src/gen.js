load('config.js');

function comicItem(manga) {
    if (!manga) return null;

    let authors = [];
    if (manga.authors) {
        for (let i = 0; i < manga.authors.length; i++) {
            if (manga.authors[i] && manga.authors[i].name) {
                authors.push(cleanText(manga.authors[i].name));
            }
        }
    }

    let description = "";
    if (manga.chapter_count) {
        description = manga.chapter_count + " chap";
    }
    if (manga.view) {
        description += (description ? " - " : "") + manga.view + " views";
    }
    if (authors.length > 0) {
        description += (description ? " - " : "") + authors.join(", ");
    }

    return {
        name: cleanText(manga.title),
        link: BASE_URL + "/manga/" + manga.id,
        cover: normalizeImage(manga.cover_url),
        description: description,
        host: BASE_URL
    };
}

function itemsFromJson(json) {
    if (!json) return [];
    if (json.items) return json.items;
    if (json.length !== undefined) return json;
    return [];
}

function execute(url, page) {
    let requestUrl = page && page.indexOf("http") === 0 ? page : apiUrl(url);
    let response = requestJson(requestUrl);
    if (response.ok) {
        let json = response.json();
        let items = itemsFromJson(json);
        let data = [];
        let seen = {};

        for (let i = 0; i < items.length; i++) {
            let item = comicItem(items[i]);
            if (item && item.name && item.link && !seen[item.link]) {
                seen[item.link] = true;
                data.push(item);
            }
        }

        return Response.success(data, nextCursorUrl(requestUrl, json));
    }

    return null;
}
