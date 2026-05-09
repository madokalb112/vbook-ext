load('gen.js');

function execute(key, page) {
    let requestUrl = page && page.indexOf("http") === 0
        ? page
        : BASE_URL + "/api/manga/search?q=" + encodeURIComponent(key || "") + "&limit=24&cursor_res=true";

    return searchRequest(requestUrl);
}

function searchRequest(url) {
    let response = requestJson(url);
    if (response.ok) {
        let json = response.json();
        let items = itemsFromJson(json);
        let data = [];
        let seen = {};

        for (let i = 0; i < items.length; i++) {
            let item = comicItem(items[i]);
            if (item && item.name && item.link && !seen[item.link]) {
                seen[item.link] = true;
                data.push(item);
            }
        }

        return Response.success(data, nextCursorUrl(url, json));
    }

    return null;
}
