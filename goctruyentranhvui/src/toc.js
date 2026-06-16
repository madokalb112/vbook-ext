load('config.js');

function execute(url) {
    url = toBaseUrl(url);
    let response = fetch(url, {
        method: "GET",
        headers: gttHeaders({ Referer: BASE_URL })
    });
    if (!response.ok) return null;

    let bookId = response.text().match(/id: "(\d+)"/)[1];
    let json = fetch(BASE_URL + '/api/comic/' + bookId + '/chapter?limit=-1', {
        method: "GET",
        headers: gttHeaders()
    }).json();

    let allChap = json.result.chapters;
    let data = [];
    for (let i = allChap.length - 1; i >= 0; i--) {
        let chap = allChap[i];
        if (chap.type !== 'DOUBLE') {
            data.push({
                name: '#' + chap.numberChapter,
                url: url + '/chuong-' + chap.numberChapter,
                host: BASE_URL + '/danh-sach'
            });
        }
    }
    return Response.success(data);
}
