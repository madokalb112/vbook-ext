load('config.js');

function execute(key, page) {
    let response = requestJson(BASE_URL + "/api/search-story?keyword=" + encodeURIComponent(key || ""));
    if (response.ok) {
        let json = response.json();
        let data = [];
        let seen = {};

        for (let i = 0; i < json.length; i++) {
            let story = json[i];
            if (story && story.slug && story.title && !seen[story.slug]) {
                seen[story.slug] = true;
                data.push({
                    name: cleanText(story.title),
                    link: BASE_URL + "/truyen/" + story.slug,
                    cover: normalizeImage(story.cover),
                    description: "",
                    host: BASE_URL
                });
            }
        }

        return Response.success(data, "");
    }

    return null;
}
