load('config.js');

function execute() {
    let json = requestJson(BASE_URL + '/api/v1/tags', BASE_URL + '/categories');
    let rows = jsonRows(json);
    let data = [{title: 'Tat ca', input: apiMangaListUrl(), script: 'gen.js'}];
    let seen = {};
    for (let i = 0; i < rows.length; i++) {
        let slug = cleanText(rows[i].slug || '');
        let title = cleanText(rows[i].name || '');
        if (!slug || !title || seen[slug]) continue;
        seen[slug] = true;
        let api = BASE_URL + '/api/v1/mangas?limit=24&sort=latest&tags=' + encodeURIComponent(slug);
        data.push({title: title, input: api, script: 'gen.js'});
    }
    return Response.success(data);
}
