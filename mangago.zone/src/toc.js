load('config.js');

function chapterNumber(name) {
    var s = ("" + (name || "")).toLowerCase();
    var m = /ch\.?\s*(\d+(?:\.\d+)?)/i.exec(s);
    if (m) return parseFloat(m[1]);
    m = /(\d+(?:\.\d+)?)/.exec(s);
    return m ? parseFloat(m[1]) : 0;
}

function execute(url) {
    if (!isWorkUrl(url || "")) {
        var ids = chapterIdsFromUrl(url || "");
        if (ids) url = BASE_URL + "/work/" + ids.workId + "/";
    }
    url = normalizeUrl(url || "");
    var html = requestText(url, BASE_URL + "/");
    if (!html) return Response.error("Khong tai duoc danh sach chapter.");

    var tableMatch = /<table\s+class="listing"\s+id="chapter_table">([\s\S]*?)<\/table>/i.exec(html);
    if (!tableMatch) return Response.error("Khong tim thay danh sach chapter.");

    var data = [];
    var seen = {};
    var re = /<a\s+class="chico"\s+href="([^"]+)"[^>]*>\s*(?:<b>([^<]+)<\/b>)?([^<]*)<\/a>/ig;
    var m;
    while ((m = re.exec(tableMatch[1])) !== null) {
        var link = normalizeUrl(decodeHtml(m[1]));
        if (!link || seen[link]) continue;
        var head = cleanText(m[2] || "");
        var tail = cleanText(m[3] || "");
        var name = head;
        if (tail) {
            tail = tail.replace(/^[:\s]+/, "");
            if (tail) name = name ? name + ": " + tail : tail;
        }
        if (!name) name = link;
        seen[link] = true;
        data.push({name: name, url: link, link: link, host: BASE_URL});
    }

    if (data.length === 0) return Response.error("Khong tim thay chapter nao.");

    data.sort(function (a, b) {
        return chapterNumber(a.name) - chapterNumber(b.name);
    });

    return Response.success(data);
}
