load('gen.js');

function execute(key, page) {
    let api = BASE_URL + '/api/v1/mangas?limit=24&sort=latest';
    api = addQuery(api, 'search', key || '');
    if (page && ('' + page).indexOf('http') === 0) api = page;
    else if (page && /^\d+$/.test('' + page)) api = addQuery(api, 'page', page);
    return executeGen(api);
}

function executeGen(api) {
    let json = requestJson(api, BASE_URL + '/search');
    let rows = jsonRows(json);
    let data = [];
    for (let i = 0; i < rows.length; i++) {
        let item = mangaItem(rows[i]);
        if (item.name && item.link) data.push(item);
    }
    return Response.success(data, nextPageUrl(api, json));
}
