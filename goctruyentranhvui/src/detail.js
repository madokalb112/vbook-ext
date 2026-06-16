load('config.js');

function execute(url) {
    url = toBaseUrl(url);
    let response = fetch(url, {
        method: "GET",
        headers: gttHeaders({ Referer: BASE_URL })
    });
    if (!response.ok) return null;

    let doc = response.html();
    let info = ".information-section .row";
    let genres = doc.select(".v-item-group .group-content a").map(e => ({
        title: e.text(),
        input: e.attr('href').match(/=(.+)/)[1],
        script: "source.js"
    }));

    let otherName = doc.select(info + ":nth-child(1) span").text();
    let author = doc.select(info + ":nth-child(2) span").text() || 'Unknown';
    let status = doc.select(info + ":nth-child(3) span").text();

    return Response.success({
        name: doc.select(".v-card-title").first().text(),
        cover: absUrl(doc.select(".v-image img").first().attr('src')),
        author: author,
        description: doc.select(".v-card-text").text(),
        detail: 'Tên khác: ' + otherName +
            '<br>Tác giả: ' + author +
            '<br>Trạng thái: ' + status,
        ongoing: status.indexOf("Đang") != -1,
        host: BASE_URL,
        genres: genres
    });
}
