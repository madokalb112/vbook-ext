load('config.js');

function execute(url) {
    url = normalizeUrl(url);
    let response = request(url);
    if (response.ok) {
        let doc = response.html();
        let nodes = doc.select(".chapter-table table tbody tr td a.text-capitalize");
        let data = [];

        for (let i = nodes.size() - 1; i >= 0; i--) {
            let e = nodes.get(i);
            let name = e.text().replace(/\s+/g, " ").trim();
            if (!name) {
                name = e.select("span").first().text();
            }

            data.push({
                name: name,
                url: e.attr("href"),
                host: BASE_URL
            });
        }

        return Response.success(data);
    }

    return null;
}
