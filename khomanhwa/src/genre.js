load('config.js');

function fallbackGenres() {
    let items = [
        ["Drama", "/genre?g=Drama"],
        ["Mature", "/genre?g=Mature"],
        ["Romance", "/genre?g=Romance"],
        ["Ecchi", "/genre?g=Ecchi"],
        ["Action", "/genre?g=Action"],
        ["Martial Arts", "/genre?g=Martial+Arts"],
        ["Fantasy", "/genre?g=Fantasy"],
        ["Harem", "/genre?g=Harem"],
        ["Historical", "/genre?g=Historical"],
        ["Mystery", "/genre?g=Mystery"],
        ["Psychological", "/genre?g=Psychological"],
        ["School Life", "/genre?g=School+Life"],
        ["Manhwa", "/genre?g=Manhwa"],
        ["Adult", "/genre?g=Adult"],
        ["Uncensored Manhwa", "/genre?g=Uncensored+Manhwa"],
        ["Smut", "/genre?g=Smut"],
        ["Seinen", "/genre?g=Seinen"]
    ];
    let result = [];
    for (let i = 0; i < items.length; i++) result.push({title: items[i][0], input: items[i][1], script: "gen.js"});
    return result;
}

function cleanGenreTitle(text) {
    return cleanText(text || "").replace(/\s+\d+$/g, "");
}

function queryValue(url, key) {
    let match = new RegExp("[?&]" + key + "=([^&#]+)", "i").exec(url || "");
    if (!match) return "";
    try {
        return decodeURIComponent(match[1].replace(/\+/g, " "));
    } catch (error) {
        return match[1].replace(/\+/g, " ");
    }
}

function execute() {
    let doc = getDoc("/genre");
    if (!doc) return Response.success(fallbackGenres());

    let data = [];
    let seen = {};
    let links = doc.select("a[href*='genre?g='], a[href*='/genre?g=']");
    for (let i = 0; i < links.size(); i++) {
        let a = links.get(i);
        let href = normalizeUrl(a.attr("href"));
        let title = cleanGenreTitle(a.text()) || queryValue(href, "g");
        let key = foldText(title);
        if (!title || seen[key]) continue;
        seen[key] = true;
        data.push({title: title, input: href, script: "gen.js"});
    }
    if (data.length === 0) data = fallbackGenres();
    return Response.success(data);
}
