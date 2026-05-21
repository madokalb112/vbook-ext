load('config.js');

function metaContent(html, property) {
    var re = new RegExp("<meta[^>]+(?:property|name)=['\"]" + property + "['\"][^>]+content=['\"]([^'\"]*)['\"]", "i");
    var m = re.exec(html || "");
    return m ? cleanText(m[1]) : "";
}

function extractTitle(html) {
    var m = /title=["']Peole who read ([^"']+)["']/i.exec(html || "");
    if (m) return cleanText(m[1]);
    m = /var\s+mid\s*=\s*"([^"]+)"/.exec(html || "");
    if (m) {
        var slug = m[1].replace(/_/g, " ").trim();
        slug = slug.replace(/\bs\b/g, "'s");
        return slug.replace(/\b\w/g, function (c) { return c.toUpperCase(); });
    }
    var desc = metaContent(html, "og:description") || metaContent(html, "description");
    if (desc) {
        var idx = desc.indexOf(" is a Manga");
        if (idx > 0) return cleanText(desc.substring(0, idx));
    }
    return "";
}

function extractStatus(html) {
    var m = /<label>\s*Status:\s*<\/label>[\s\S]*?>([^<]+)<\/span>/i.exec(html || "");
    return m ? cleanText(m[1]) : "";
}

function extractGenres(html) {
    var data = [];
    var seen = {};
    var block = /Genre\(s\):[\s\S]*?<\/label>([\s\S]*?)<\/td>/i.exec(html || "");
    if (!block) return data;
    var re = /<a[^>]+href="([^"]*\/genre\/[^"]+)"[^>]*>([^<]+)<\/a>/ig;
    var m;
    while ((m = re.exec(block[1])) !== null) {
        var title = cleanText(m[2]);
        if (!title || seen[title]) continue;
        seen[title] = true;
        var href = decodeHtml(m[1]);
        if (href.indexOf("mangago.me") >= 0) {
            href = href.replace("mangago.me", "mangago.zone");
        }
        data.push({title: title, input: normalizeUrl(href), script: "gen.js"});
    }
    return data;
}

function extractCover(html) {
    var cover = metaContent(html, "og:image");
    if (cover) return normalizeImage(cover);
    var m = /<div\s+class="left\s+cover"[^>]*>\s*<img[^>]+src="([^"]+)"/i.exec(html || "");
    return m ? normalizeImage(decodeHtml(m[1])) : "";
}

function extractDescription(html) {
    var desc = metaContent(html, "og:description") || metaContent(html, "description");
    return desc;
}

function detailLine(label, value) {
    value = cleanText(value || "");
    return value ? "<b>" + label + ":</b> " + value : "";
}

function extractChapterCount(html) {
    var m = /Chapters\((\d+)\)/i.exec(html || "");
    return m ? m[1] : "";
}

function execute(url) {
    if (!isWorkUrl(url || "")) {
        var ids = chapterIdsFromUrl(url || "");
        if (ids) url = BASE_URL + "/work/" + ids.workId + "/";
    }
    url = normalizeUrl(url || "");
    var html = requestText(url, BASE_URL + "/");
    if (!html) return Response.error("Khong tai duoc thong tin Mangago.");

    var name = extractTitle(html);
    if (!name) return Response.error("Khong tim thay ten truyen.");

    var status = extractStatus(html);
    var chapterCount = extractChapterCount(html);
    var lines = [];
    var statusLine = detailLine("Status", status);
    var chaptersLine = detailLine("Chapters", chapterCount);
    if (statusLine) lines.push(statusLine);
    if (chaptersLine) lines.push(chaptersLine);

    return Response.success({
        name: name,
        cover: extractCover(html),
        author: "Updating",
        description: extractDescription(html),
        detail: lines.join("<br>"),
        host: BASE_URL,
        ongoing: cleanText(status).toLowerCase().indexOf("complete") < 0 && cleanText(status).toLowerCase().indexOf("end") < 0,
        genres: extractGenres(html)
    });
}
