load('config.js');

function validImage(url) {
    if (!url) return false;
    if (url.indexOf("data:image") === 0) return false;
    if (url.indexOf("/anime/assets/") >= 0) return false;
    if (url.indexOf("/images/credit") >= 0) return false;
    if (url.indexOf("/storage/site/") >= 0) return false;
    if (url.indexOf("/storage/story_avatars/") >= 0) return false;
    return url.indexOf("/uploads/") >= 0 || url.indexOf("sv2.loppytoon.com") >= 0 || url.indexOf("storage.loppytoon.com") >= 0;
}

function execute(url) {
    url = normalizeUrl(url);
    let response = request(url);
    if (response.ok) {
        let doc = response.html();
        let data = [];
        let seen = {};

        doc.select(".manga-images-container img.manga-image, img.manga-image, .chapter-content img").forEach(function(e) {
            let link = e.attr("data-src") || e.attr("data-original") || e.attr("src");
            link = normalizeImage(link);
            if (validImage(link) && !seen[link]) {
                seen[link] = true;
                data.push(link);
            }
        });

        if (data.length === 0) {
            return Response.error("Khong tim thay anh chapter.");
        }

        return Response.success(data);
    }

    return null;
}
