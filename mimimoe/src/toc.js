load('config.js');

function execute(url) {
    let mangaId = extractMangaId(url);
    if (!mangaId) {
        return Response.error("Khong tim thay ID truyen.");
    }

    let response = requestJson(BASE_URL + "/api/manga/" + mangaId + "/chapters?limit=1000");
    if (response.ok) {
        let chapters = response.json();
        chapters.sort(function(a, b) {
            let ao = a.order || 0;
            let bo = b.order || 0;
            if (ao !== bo) return ao - bo;
            return (a.id || 0) - (b.id || 0);
        });

        let data = [];
        for (let i = 0; i < chapters.length; i++) {
            let chapter = chapters[i];
            if (chapter && chapter.id) {
                data.push({
                    name: cleanText(chapter.title) || ("Chapter " + (i + 1)),
                    url: BASE_URL + "/manga/" + mangaId + "/chapter/" + chapter.id,
                    host: BASE_URL
                });
            }
        }

        return Response.success(data);
    }

    return null;
}
