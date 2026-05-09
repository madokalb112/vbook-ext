load('config.js');

function execute(url) {
    let chapterId = extractChapterId(url);
    if (!chapterId) {
        return Response.error("Khong tim thay ID chapter.");
    }

    let response = requestJson(BASE_URL + "/api/chapters/" + chapterId);
    if (response.ok) {
        let json = response.json();
        let pages = json.pages || [];
        let data = [];
        let seen = {};

        for (let i = 0; i < pages.length; i++) {
            let link = normalizeImage(pages[i].image_url);
            if (link && !seen[link]) {
                seen[link] = true;
                data.push(link);
            }
        }

        if (data.length === 0) {
            return Response.error("Khong tim thay anh chapter.");
        }

        return Response.success(data);
    }

    return null;
}
