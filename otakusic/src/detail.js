load("config.js");

function infoValue(doc, labels) {
    let rows = doc.select(".grid p, p.text-white");
    for (let i = 0; i < rows.size(); i++) {
        let row = rows.get(i);
        let labelNode = row.select("span.text-gray-300").first();
        let label = foldText(labelNode ? labelNode.text() : "");
        for (let j = 0; j < labels.length; j++) {
            if (label.indexOf(labels[j]) >= 0) {
                let text = cleanText(row.text());
                let rawLabel = cleanText(labelNode ? labelNode.text() : "");
                if (rawLabel && text.indexOf(rawLabel) === 0) {
                    text = cleanText(text.substring(rawLabel.length));
                }
                return text.replace(/^:\s*/, "");
            }
        }
    }
    return "";
}

function buildDetail(doc, status) {
    let lines = [];
    let rows = doc.select(".grid p, p.text-white");
    let seen = {};
    for (let i = 0; i < rows.size(); i++) {
        let row = rows.get(i);
        let labelNode = row.select("span.text-gray-300").first();
        if (!labelNode) continue;
        let label = cleanText(labelNode.text()).replace(/:$/, "");
        let value = cleanText(row.text());
        let rawLabel = cleanText(labelNode.text());
        if (rawLabel && value.indexOf(rawLabel) === 0) {
            value = cleanText(value.substring(rawLabel.length));
        }
        value = value.replace(/^:\s*/, "");
        if (label && value && !seen[label]) {
            seen[label] = true;
            lines.push("<b>" + label + ":</b> " + value);
        }
    }
    if (status) lines.push("<b>Trang thai:</b> " + status);
    return lines.join("<br>");
}

function heroHtml(doc) {
    let html = doc.html();
    let start = html.indexOf('id="id-manga"');
    if (start < 0) start = html.indexOf("id='id-manga'");
    if (start < 0) return "";
    let end = html.indexOf('id="manga_view"', start);
    if (end < 0) end = html.indexOf("id='manga_view'", start);
    if (end >= 0) end = end + 1200;
    let nextBlock = html.indexOf("<div x-data", start + 1);
    if (nextBlock > start && nextBlock < end) end = nextBlock;
    if (end < 0) end = html.indexOf('<h2 class="text-xl', start);
    if (end < 0) end = start + 6000;
    return html.substring(start, end);
}

function collectGenres(doc) {
    let data = [];
    let seen = {};
    let html = heroHtml(doc);
    let regex = /<a\b[^>]*href=["']([^"']*\/the-loai\/[^"']+)["'][^>]*>([\s\S]*?)<\/a>/ig;
    let match;
    while ((match = regex.exec(html)) !== null) {
        let href = normalizeUrl(match[1]);
        let title = cleanText(match[2].replace(/<[^>]+>/g, " "));
        if (!title || !href || seen[href]) continue;
        seen[href] = true;
        data.push({title: title, input: href, script: "gen.js"});
    }
    return data;
}

function statusText(doc) {
    let html = heroHtml(doc);
    let match = /<a\b[^>]*href=["'][^"']*status=[^"']+["'][^>]*>([\s\S]*?)<\/a>/i.exec(html);
    return match ? cleanText(match[1].replace(/<[^>]+>/g, " ")) : "";
}

function execute(url) {
    url = storyUrlFromAny(url);
    let doc = getDoc(url);
    if (!doc) return null;

    let name = firstText(doc, ["h1", "meta[property=og:title]"]);
    if (!name) {
        let metaTitle = doc.select("meta[property=og:title]").attr("content");
        name = cleanText(metaTitle).replace(/\s*\|\s*Otakusic\s*$/i, "");
    }
    if (!name) return Response.error("Khong tim thay thong tin truyen.");

    let coverNode = doc.select("img[src*='/manga/uploads/manga/']").first();
    let cover = coverNode ? (coverNode.attr("data-src") || coverNode.attr("src")) : "";
    if (!cover) {
        let style = doc.select("[style*=background-image]").attr("style");
        let match = /url\(['"]?([^'")]+)['"]?\)/i.exec(style || "");
        cover = match ? match[1] : "";
    }

    let status = statusText(doc);
    let author = infoValue(doc, ["tac gia"]);
    let description = firstHtml(doc, ["#description"]);
    if (!cleanText(description)) description = doc.select("meta[name=description]").attr("content");

    return Response.success({
        name: name,
        cover: normalizeImage(cover),
        author: author,
        description: description,
        detail: buildDetail(doc, status),
        ongoing: foldText(status).indexOf("hoan thanh") < 0,
        genres: collectGenres(doc),
        host: BASE_URL
    });
}
