load('config.js');

function isContentImage(url) {
    if (!url) return false;
    url = normalizeImage(url);
    if (url.indexOf("/image_comics/") >= 0) return true;
    if (url.indexOf("/images/default/") >= 0) return false;
    if (url.indexOf("/comics/top/") >= 0) return false;
    return url.indexOf("anhvip.xyz") >= 0 && url.indexOf("/comics/") < 0;
}

function execute(url) {
    let doc = getDoc(url);
    if (!doc) return null;

    let data = [];
    let seen = {};
    doc.select(".list-image-detail .page-chapter img, .page-chapter img").forEach(function(e) {
        let img = imageFromNode(e);
        let link = normalizeImage(img);
        if (!isContentImage(link) || seen[link]) return;
        seen[link] = true;
        data.push(link);
    });

    return Response.success(data);
}
