load('config.js');

function chapterNumber(chapter) {
    let n = parseFloat(chapter.chapter);
    return isNaN(n) ? 0 : n;
}

function execute(url) {
    let mangaId = extractMangaId(url);
    if (!mangaId) {
        return Response.error("Khong tim thay ID truyen.");
    }

    let response = requestJson(API_URL + "/manga/" + mangaId + "/aggregate");
    if (response.ok) {
        let json = response.json();
        let chapters = json.chapters || [];
        chapters.sort(function(a, b) {
            let av = cleanText(a.volume);
            let bv = cleanText(b.volume);
            if (av !== bv) {
                let an = parseFloat(av);
                let bn = parseFloat(bv);
                if (!isNaN(an) && !isNaN(bn)) return an - bn;
            }
            return chapterNumber(a) - chapterNumber(b);
        });

        let data = [];
        for (let i = 0; i < chapters.length; i++) {
            let c = chapters[i];
            let entries = c.entries || {};
            let ids = Object.keys(entries);
            if (ids.length === 0) continue;
            let chapterId = ids[0];
            let name = "";
            if (c.volume) name += "Vol. " + c.volume + " ";
            name += "Ch. " + c.chapter;
            let entry = entries[chapterId];
            if (entry && entry.language) {
                name += " [" + entry.language + "]";
            }
            data.push({
                name: name,
                url: BASE_URL + "/chapter/" + chapterId,
                host: BASE_URL
            });
        }

        return Response.success(data);
    }

    return null;
}
