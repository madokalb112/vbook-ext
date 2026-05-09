load('config.js');

function execute() {
    let response = requestJson(BASE_URL + "/api/genres");
    if (response.ok) {
        let json = response.json();
        let data = [];

        for (let i = 0; i < json.length; i++) {
            let genre = json[i];
            if (genre && genre.id && genre.name) {
                data.push({
                    title: cleanText(genre.name),
                    input: BASE_URL + "/api/manga/by-genre/" + genre.id + "?sort=updated_at&limit=24&cursor_res=true",
                    script: "gen.js"
                });
            }
        }

        return Response.success(data);
    }

    return null;
}
