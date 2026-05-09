load('config.js');

function execute(url) {
    url = normalizeUrl(url);
    let response = request(url);
    if (response.ok) {
        let doc = response.html();
        let nodes = doc.select("#chapter-list-render a.chapter-item[href], .chapter-list a.chapter-item[href]");
        let data = [];
        let seen = {};

        for (let i = nodes.size() - 1; i >= 0; i--) {
            let e = nodes.get(i);
            let href = normalizeUrl(e.attr("href"));
            let nameNode = e.select(".chapter-info h3, h3").first();
            let name = nameNode ? cleanText(nameNode.text()) : cleanText(e.text());
            if (name && href && !seen[href]) {
                seen[href] = true;
                data.push({
                    name: name,
                    url: href,
                    host: BASE_URL
                });
            }
        }

        return Response.success(data);
    }

    return null;
}
