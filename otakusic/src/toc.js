load('config.js');

function chapterNumber(text) {
    let match = /(?:chapter|chap|chuong|ch\.?)[:\s#-]*(\d+(?:[-.]\d+)?)/i.exec(text || "");
    if (match) return parseFloat(match[1].replace("-", "."));
    match = /(\d+(?:\.\d+)?)\s*$/i.exec(text || "");
    return match ? parseFloat(match[1]) : 0;
}

function chapterName(row) {
    let name = cleanText(row.chapter_name || row.name || row.title);
    if (name && foldText(name).indexOf("chuong") < 0 && foldText(name).indexOf("chapter") < 0) {
        name = "Chuong " + name;
    }
    let title = cleanText(row.chapter_title || row.title);
    return title && title !== name ? name + ": " + title : name;
}

function rowSlug(row) {
    return cleanText(row.chapter_slug || row.slug || row.chapter || row.chapter_original_slug);
}

function tocFromApi(slug) {
    let response = requestJson(API_URL + "/manga/chapters/" + encodeURIComponent(slug), storyUrl(slug));
    if (!response.ok) return [];
    let rows = jsonRows(readJson(response));
    let data = [];
    let seen = {};
    for (let i = rows.length - 1; i >= 0; i--) {
        let row = rows[i];
        if (!row) continue;
        if (row.status && row.status !== "active") continue;
        let cslug = rowSlug(row);
        let mslug = cleanText(row.manga_slug || slug);
        if (!cslug || seen[cslug]) continue;
        seen[cslug] = true;
        let link = chapterUrl(mslug, cslug);
        data.push({name: chapterName(row) || cslug, url: link, link: link, input: link, host: BASE_URL});
    }
    return data;
}

function execute(url) {
    let slug = extractSlug(url);
    if (!slug) return Response.error("Khong tim thay slug truyen.");

    let apiData = tocFromApi(slug);
    if (apiData.length > 0) return Response.success(apiData);

    let detailUrl = BASE_URL + "/chi-tiet/" + slug;
    let doc = getDoc(detailUrl);
    if (!doc) return null;

    let temp = [];
    let seen = {};

    doc.select("a[href*='/doc-truyen/" + slug + "/']").forEach(function(e) {
        let href = e.attr("href");
        if (!href) return;
        let link = normalizeUrl(href);
        if (seen[link]) return;
        seen[link] = true;
        let name = cleanText(e.text()) || cleanText(e.attr("title"));
        if (!name) {
            let match = /\/(\d+)\/?$/.exec(href);
            if (match) name = "Chapter " + match[1];
        }
        temp.push({
            name: name,
            url: link,
            host: BASE_URL
        });
    });

    if (temp.length === 0) {
        doc.select("a[href*='/doc-truyen/']").forEach(function(e) {
            let href = e.attr("href");
            if (!href || href.indexOf(slug) < 0) return;
            let link = normalizeUrl(href);
            if (seen[link]) return;
            seen[link] = true;
            let name = cleanText(e.text()) || cleanText(e.attr("title"));
            temp.push({
                name: name,
                url: link,
                host: BASE_URL
            });
        });
    }

    if (temp.length > 1 && chapterNumber(temp[0].name + " " + temp[0].url) > chapterNumber(temp[temp.length - 1].name + " " + temp[temp.length - 1].url)) {
        temp.reverse();
    }

    return Response.success(temp);
}
