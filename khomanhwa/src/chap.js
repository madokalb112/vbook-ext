load('config.js');

function looksLikeChapterImage(url) {
    url = normalizeImage(url);
    if (!validImage(url)) return false;
    let low = url.toLowerCase();
    return low.indexOf("img.manhwa.vip") >= 0 ||
        low.indexOf("img.vipmanhwa.com") >= 0 ||
        low.indexOf("wtcdn.xyz") >= 0 ||
        low.indexOf("_vn_") >= 0 ||
        low.indexOf("chapter") >= 0;
}

function addImage(data, seen, link, referer, strict) {
    link = normalizeImage(link);
    if (!validImage(link)) return;
    if (strict && !looksLikeChapterImage(link)) return;
    if (seen[link]) return;
    seen[link] = true;
    data.push({link: link, headers: imageHeaders(referer)});
}

function execute(url) {
    url = normalizeUrl(url);
    let doc = getDoc(url);
    if (!doc) return Response.error("Khong tai duoc chapter.");

    let data = [];
    let seen = {};
    let nodes = doc.select("img.chapter-page, img[data-src*='img.manhwa.vip'], img[src*='img.manhwa.vip']");
    for (let i = 0; i < nodes.size(); i++) {
        addImage(data, seen, imageAttr(nodes.get(i)), url, false);
    }

    if (data.length === 0) {
        let html = doc.html();
        let regex = /https?:\/\/[^"'\s<>]+?\.(?:jpg|jpeg|png|webp)(?:\?[^"'\s<>]*)?/ig;
        let match;
        while ((match = regex.exec(html)) !== null) addImage(data, seen, match[0], url, true);
    }

    if (data.length === 0) return Response.error("Khong tim thay anh chapter.");
    return Response.success(data);
}
