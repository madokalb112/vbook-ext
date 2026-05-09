load('config.js');

function joinNames(list) {
    let names = [];
    let seen = {};
    list = list || [];
    for (let i = 0; i < list.length; i++) {
        let name = cleanText(list[i].name);
        if (name && !seen[name]) {
            seen[name] = true;
            names.push(name);
        }
    }
    return names.join(", ");
}

function altNames(alt) {
    let names = [];
    if (!alt) return "";
    for (let key in alt) {
        let arr = alt[key] || [];
        for (let i = 0; i < arr.length; i++) {
            let name = cleanText(arr[i]);
            if (name) names.push(name);
        }
    }
    return names.join(", ");
}

function detailLine(label, value) {
    if (!value) return "";
    return "<b>" + label + ":</b> " + value;
}

function creatorNames(rel) {
    rel = rel || {};
    let names = [];
    let seen = {};
    let lists = [rel.authors || [], rel.artists || []];
    for (let i = 0; i < lists.length; i++) {
        for (let j = 0; j < lists[i].length; j++) {
            let name = cleanText(lists[i][j].name);
            if (name && !seen[name]) {
                seen[name] = true;
                names.push(name);
            }
        }
    }
    return names.join(", ");
}

function execute(url) {
    let mangaId = extractMangaId(url);
    if (!mangaId) {
        return Response.error("Khong tim thay ID truyen.");
    }

    let response = requestJson(API_URL + "/manga/" + mangaId);
    if (response.ok) {
        let manga = response.json();
        let rel = manga.relationships || {};
        let genres = [];
        let tags = rel.tags || [];

        for (let i = 0; i < tags.length; i++) {
            if (tags[i] && tags[i].name) {
                genres.push({
                    title: cleanText(tags[i].name),
                    input: API_URL + "/manga?limit=24&page=1",
                    script: "gen.js"
                });
            }
        }

        let details = [];
        let other = detailLine("Ten khac", altNames(manga.alt_titles));
        let status = detailLine("Trang thai", manga.status);
        let rating = detailLine("Rating", manga.content_rating);
        let demographic = detailLine("Demographic", manga.demographic);
        let chapter = detailLine("Chapter cuoi", manga.last_chapter);
        let volume = detailLine("Volume cuoi", manga.last_volume);
        let views = rel.stats ? detailLine("Luot xem", rel.stats.views) : "";
        let follows = rel.stats ? detailLine("Theo doi", rel.stats.follows) : "";
        if (other) details.push(other);
        if (status) details.push(status);
        if (rating) details.push(rating);
        if (demographic) details.push(demographic);
        if (volume) details.push(volume);
        if (chapter) details.push(chapter);
        if (views) details.push(views);
        if (follows) details.push(follows);

        return Response.success({
            name: cleanText(manga.title),
            cover: coverUrl(manga),
            author: creatorNames(rel),
            description: manga.description || "",
            detail: details.join("<br>"),
            ongoing: manga.status !== "completed",
            genres: genres,
            host: BASE_URL
        });
    }

    return null;
}
