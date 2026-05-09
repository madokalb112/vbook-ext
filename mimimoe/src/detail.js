load('config.js');

function joinNames(items) {
    let names = [];
    if (!items) return "";
    for (let i = 0; i < items.length; i++) {
        if (items[i] && items[i].name) {
            names.push(cleanText(items[i].name));
        } else if (items[i]) {
            names.push(cleanText(items[i]));
        }
    }
    return names.join(", ");
}

function execute(url) {
    let mangaId = extractMangaId(url);
    if (!mangaId) {
        return Response.error("Khong tim thay ID truyen.");
    }

    let response = requestJson(BASE_URL + "/api/manga/" + mangaId);
    if (response.ok) {
        let manga = response.json();
        let genres = [];
        if (manga.genres) {
            for (let i = 0; i < manga.genres.length; i++) {
                let genre = manga.genres[i];
                if (genre && genre.id && genre.name) {
                    genres.push({
                        title: cleanText(genre.name),
                        input: BASE_URL + "/api/manga/by-genre/" + genre.id + "?sort=updated_at&limit=24&cursor_res=true",
                        script: "gen.js"
                    });
                }
            }
        }

        let details = [];
        if (manga.alt_names && manga.alt_names.length > 0) {
            details.push("<b>Ten khac:</b> " + joinNames(manga.alt_names));
        }
        if (manga.chapter_count) {
            details.push("<b>So chap:</b> " + manga.chapter_count);
        }
        if (manga.view) {
            details.push("<b>Luot xem:</b> " + manga.view);
        }
        if (manga.follows) {
            details.push("<b>Theo doi:</b> " + manga.follows);
        }
        if (manga.total_likes) {
            details.push("<b>Luot thich:</b> " + manga.total_likes);
        }
        if (manga.uploader && manga.uploader.display_name) {
            details.push("<b>Uploader:</b> " + cleanText(manga.uploader.display_name));
        }

        return Response.success({
            name: cleanText(manga.title),
            cover: normalizeImage(manga.cover_url),
            author: joinNames(manga.authors),
            description: manga.description || "",
            detail: details.join("<br>"),
            ongoing: true,
            genres: genres,
            host: BASE_URL
        });
    }

    return null;
}
