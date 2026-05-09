load('config.js');

function validImage(url) {
    if (!url) return false;
    if (url.indexOf("data:image") === 0) return false;
    if (url.indexOf("/assets/images/") >= 0) return false;
    if (url.indexOf("/storage/images/cover/") >= 0) return false;
    if (url.indexOf("/storage/images/category/") >= 0) return false;
    if (url.indexOf("/storage/images/library/") >= 0) return false;
    if (url.indexOf("/img/") >= 0) return false;
    return true;
}

function execute(url) {
    url = normalizeUrl(url);
    let response = request(url);
    if (response.ok) {
        let doc = response.html();
        let data = [];
        let seen = {};

        doc.select("#chapter_content img, .reading-content .page-break img, .reading-content img, .entry-content .chapter-img").forEach(function(e) {
            let link = e.attr("data-src") || e.attr("data-original") || e.attr("data-lazy-src") || e.attr("src");
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
