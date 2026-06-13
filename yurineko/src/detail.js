load('config.js');

function names(rows) {
    let data = [];
    rows = rows || [];
    for (let i = 0; i < rows.length; i++) {
        let name = cleanText(rows[i].name || rows[i].title || '');
        if (name && data.indexOf(name) < 0) data.push(name);
    }
    return data.join(', ');
}

function tagGenres(row) {
    let data = [];
    let tags = row.tags || row.genres || [];
    for (let i = 0; i < tags.length; i++) {
        let slug = cleanText(tags[i].slug || '');
        let title = cleanText(tags[i].name || tags[i].title || '');
        if (!slug || !title) continue;
        let api = BASE_URL + '/api/v1/mangas?limit=24&sort=latest&tags=' + encodeURIComponent(slug);
        data.push({title: title, input: api, script: 'gen.js'});
    }
    return data;
}

function execute(url) {
    let slug = mangaSlugFromUrl(url);
    if (!slug) return Response.error('URL truyen khong hop le.');
    let api = BASE_URL + '/api/v1/mangas/slug/' + encodeURIComponent(slug);
    let row = requestJson(api, normalizeUrl(url));
    if (!row || !row.id) return Response.error('Khong tim thay thong tin truyen.');

    let detail = [];
    let alt = row.alternativeTitles && row.alternativeTitles.length ? row.alternativeTitles.join(', ') : '';
    if (alt) detail.push('<b>Ten khac:</b> ' + alt);
    if (row.status) detail.push('<b>Tinh trang:</b> ' + row.status);
    if (row.views || row.views === 0) detail.push('<b>Luot xem:</b> ' + row.views);
    if (row.group && row.group.name) detail.push('<b>Nhom:</b> ' + row.group.name);

    return Response.success({
        name: cleanText(row.title || row.name || ''),
        cover: normalizeImage(row.thumbnailUrl || row.bgImage || ''),
        author: names(row.linkedAuthors || row.linkedArtists || []),
        description: row.description || '',
        detail: detail.join('<br>'),
        ongoing: row.status !== 'COMPLETED',
        genres: tagGenres(row),
        host: BASE_URL
    });
}
