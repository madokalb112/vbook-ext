load('gen.js');

function execute(key, page) {
    let requestUrl = page && page.indexOf("http") === 0
        ? page
        : BASE_URL + "/search?s=" + encodeURIComponent(key || "");
    if (page && page.indexOf("http") !== 0) {
        requestUrl += "&page=" + page;
    }

    return executeSearch(requestUrl);
}

function executeSearch(url) {
    let response = request(url);
    if (response.ok) {
        let doc = response.html();
        let data = [];
        let seen = {};
        let nodes = doc.select(".manga-content .page-item-detail, .page-search .page-item-detail, .listing .page-item-detail, .page-item-detail");

        nodes.forEach(function(e) {
            let item = comicItem(e);
            if (item.name && item.link && !seen[item.link]) {
                seen[item.link] = true;
                data.push(item);
            }
        });

        return Response.success(data, nextPage(doc));
    }

    return null;
}
