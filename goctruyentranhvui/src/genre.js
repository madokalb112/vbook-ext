load('config.js');

function execute() {
    let response = fetch(BASE_URL + '/danh-sach', {
        method: "GET",
        headers: gttHeaders({ Referer: BASE_URL })
    });
    if (!response.ok) return null;

    let doc = response.html();
    let data = [];
    doc.select('.block-category .item-status').forEach(e => data.push({
        title: e.select('span').text(),
        input: e.select('.cbox').attr('data-code'),
        script: 'source.js'
    }));
    return Response.success(data);
}
