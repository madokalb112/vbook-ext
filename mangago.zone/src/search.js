load('config.js');

function execute(key, page) {
    key = cleanText(key || "");
    if (!key) return Response.success([], "");
    var p = parseInt(page || "1", 10);
    if (!p || p < 1) p = 1;
    var url = BASE_URL + "/r/l_search/?name=" + encodeURIComponent(key);
    if (p > 1) url += "&page=" + p;
    var html = requestText(url, BASE_URL + "/");
    if (!html) return Response.error("Khong tim kiem duoc Mangago.");

    var data = [];
    var seen = {};
    var re = /<li>\s*<div\s+class="box[^"]*">([\s\S]*?)<\/li>/ig;
    var m;
    while ((m = re.exec(html)) !== null) {
        var block = m[1];
        var titleMatch = /<a[^>]+href="([^"]+\/work\/\d+\/?)"[^>]*>([^<]+)<\/a>/i.exec(block);
        if (!titleMatch) continue;
        var link = normalizeUrl(titleMatch[1]);
        if (!link || seen[link]) continue;
        var name = cleanText(titleMatch[2]);
        var coverMatch = /<a[^>]+class="thm-effect"[^>]*>\s*<img[^>]+src="([^"]+)"/i.exec(block);
        var cover = coverMatch ? normalizeImage(decodeHtml(coverMatch[1])) : "";
        var genresMatch = /Genres\s*:[\s\S]*?<span\s+class="gray">([\s\S]*?)<\/span>/i.exec(block);
        var description = "";
        if (genresMatch) description = cleanText(genresMatch[1]).replace(/\s+,/g, ",").replace(/,\s*$/, "");
        seen[link] = true;
        data.push({name: name, link: link, cover: cover, description: description, host: BASE_URL});
    }

    var nextHint = "";
    var nextRe = new RegExp("page=" + (p + 1) + "(?:[^0-9]|$)");
    if (nextRe.test(html.replace(/&amp;/g, "&"))) nextHint = "" + (p + 1);

    return Response.success(data, nextHint);
}
