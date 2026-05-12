load("config.js");

function validImage(url) {
    url = normalizeImage(url);
    if (!url || isBadImage(url)) return false;
    if (url.indexOf("/favicon") >= 0) return false;
    if (url.indexOf("/ads") >= 0 || url.indexOf("/banner") >= 0) return false;
    return /\.(?:jpg|jpeg|png|webp|gif)(?:[?#].*)?$/i.test(url);
}

function imageHeaders(url) {
    return {
        "Accept": "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
        "Accept-Language": "vi-VN,vi;q=0.9,en-US;q=0.8,en;q=0.7",
        "Origin": BASE_URL,
        "Referer": normalizeUrl(url),
        "User-Agent": MOBILE_UA
    };
}

function addImage(data, seen, link, referer) {
    link = normalizeImage(link);
    if (!validImage(link) || seen[link]) return;
    seen[link] = true;
    let headers = imageHeaders(referer);
    data.push({
        link: link,
        headers: headers,
        header: headers
    });
}

function execute(url) {
    let doc = getDoc(url);
    if (!doc) return null;

    let data = [];
    let seen = {};
    doc.select(".content_view_chap img, .content_view_chap source, img.lazyload").forEach(function(e) {
        addImage(data, seen, imageAttr(e), url);
    });

    if (data.length === 0) {
        let node = doc.select(".content_view_chap").first();
        let html = node ? node.html() : doc.html();
        let regex = /(https?:\/\/[^"'<>\\s]+?\.(?:jpg|jpeg|png|webp|gif)(?:\?[^"'<>\\s]*)?)/ig;
        let match;
        while ((match = regex.exec(html)) !== null) {
            addImage(data, seen, match[1], url);
        }
    }

    if (data.length === 0) return Response.error("Khong tim thay anh chapter.");
    return Response.success(data);
}
