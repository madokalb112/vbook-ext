load('config.js');

function execute(url) {
    let chapterId = extractChapterId(url);
    if (!chapterId) {
        return Response.error("Khong tim thay ID chapter.");
    }

    let response = requestJson(API_URL + "/chapter/" + chapterId);
    if (response.ok) {
        let json = response.json();
        let pages = json.data || [];
        let node = json.node || IMAGE_URL;
        let data = [];

        for (let i = 0; i < pages.length; i++) {
            if (pages[i] && pages[i].name) {
                data.push(node + "/data/" + chapterId + "/" + pages[i].name);
            }
        }

        if (data.length === 0) {
            return Response.error("Khong tim thay anh chapter.");
        }

        return Response.success(data);
    }

    return null;
}
