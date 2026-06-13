load('config.js');

function itemDescription(row) {
    let chapter = row.chapters && row.chapters.length ? row.chapters[0] : null;
    if (!chapter) return '';
    return chapterName(chapter);
}

function mangaItem(row) {
    return {
        name: cleanText(row.title || row.name || ''),
        link: mangaUrl(row),
        cover: normalizeImage(row.thumbnailUrl || row.cover || row.image || ''),
        description: itemDescription(row),
        host: BASE_URL
    };
}

function nextPageUrl(api, json) {
    let page = parseInt(json && json.page ? json.page : 1);
    let last = parseInt(json && json.lastPage ? json.lastPage : 0);
    if (!last || page >= last) return '';
    return addQuery(api, 'page', page + 1);
}

function execute(url, page) {
    let api = normalizeUrl(url || apiMangaListUrl());
    if (page && ('' + page).indexOf('http') === 0) api = normalizeUrl(page);
    else if (page && /^\d+$/.test('' + page)) api = addQuery(api, 'page', page);
    if (api.indexOf('/api/v1/mangas') < 0) api = apiMangaListUrl();

    let json = requestJson(api, BASE_URL + '/');
    let rows = jsonRows(json);
    let data = [];
    for (let i = 0; i < rows.length; i++) {
        let item = mangaItem(rows[i]);
        if (item.name && item.link) data.push(item);
    }
    return Response.success(data, nextPageUrl(api, json));
}
