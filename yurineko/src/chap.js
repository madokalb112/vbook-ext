load('config.js');

function validImage(url) {
    if (!url) return false;
    if (url.indexOf("data:image") === 0) return false;
    if (url.indexOf("/assets/images/") >= 0) return false;
    if (url.indexOf("/storage/thumbnails/") >= 0) return false;
    if (url.indexOf("/uploads/") >= 0) return false;
    if (url.indexOf("/levels/") >= 0) return false;
    return true;
}

function execute(url) {
    url = normalizeUrl(url);
    let response = request(url);
    if (response.ok) {
        let doc = response.html();
        let data = [];
        let seen = {};

        doc.select("#view-chapter img, .view-chapter img, .reading-detail .page-chapter img").forEach(function(e) {
            let link = e.attr("data-src") || e.attr("data-original") || e.attr("src");
            link = normalizeImage(link);
            if (validImage(link) && !seen[link]) {
                seen[link] = true;
                data.push(link);
            }
        });

        if (data.length === 0) {
            return Response.error("Không tìm thấy ảnh chapter.");
        }

        return Response.success(data);
    }

    return null;
}
