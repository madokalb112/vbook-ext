load('config.js');

function chapterRows(mangaId, referer) {
    let data = [];
    let page = 1;
    while (page <= 20) {
        let api = BASE_URL + '/api/v1/chapters/' + encodeURIComponent(mangaId) + '?limit=100&sort=asc&page=' + page;
        let json = requestJson(api, referer);
        let rows = jsonRows(json);
        for (let i = 0; i < rows.length; i++) data.push(rows[i]);
        let last = parseInt(json && (json.lastPage || json.totalPages) ? (json.lastPage || json.totalPages) : page);
        if (!rows.length || page >= last) break;
        page++;
    }
    return data;
}

function execute(url) {
    let slug = mangaSlugFromUrl(url);
    if (!slug) return Response.error('URL truyen khong hop le.');
    let referer = normalizeUrl(url);
    let detail = requestJson(BASE_URL + '/api/v1/mangas/slug/' + encodeURIComponent(slug), referer);
    if (!detail || !detail.id) return Response.error('Khong lay duoc danh sach chuong.');

    let rows = chapterRows(detail.id, referer);
    if (rows.length === 0 && detail.chapters) rows = detail.chapters;
    rows.sort(function(a, b) {
        let av = parseFloat(a.order || a.chapterNumber || 0);
        let bv = parseFloat(b.order || b.chapterNumber || 0);
        return av - bv;
    });

    let data = [];
    let seen = {};
    for (let i = 0; i < rows.length; i++) {
        let row = rows[i];
        if (!row.slug || seen[row.slug]) continue;
        seen[row.slug] = true;
        data.push({name: chapterName(row), url: chapterUrl(slug, row), host: BASE_URL});
    }
    return Response.success(data);
}
