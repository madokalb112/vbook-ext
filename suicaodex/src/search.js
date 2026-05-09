load('gen.js');

function execute(key, page) {
    let requestUrl = page && page.indexOf("http") === 0
        ? page
        : API_URL + "/manga?limit=24&page=1&title=" + encodeURIComponent(key || "");

    let response = requestJson(requestUrl);
    if (response.ok) {
        let json = response.json();
        let items = json.data || [];
        let data = [];
        let seen = {};

        for (let i = 0; i < items.length; i++) {
            let item = comicItem(items[i]);
            if (item && item.name && item.link && !seen[item.link]) {
                seen[item.link] = true;
                data.push(item);
            }
        }

        return Response.success(data, nextApiPage(requestUrl, json));
    }

    return null;
}
