load('config.js');

function isCurrentChapterImage(url, pageUrl) {
    url = normalizeImage(url);
    if (!validImage(url)) return false;
    if (url.indexOf("wasawow.com") < 0) return false;
    let slug = storySlug(pageUrl);
    let chapter = /\/(chuong-[^/?#]+)/i.exec(pathOf(pageUrl));
    if (slug && url.indexOf("/" + slug + "/") < 0) return false;
    if (chapter && url.indexOf("/" + chapter[1] + "/") < 0) return false;
    return true;
}

function addImage(data, seen, link, referer) {
    link = normalizeImage(link);
    if (!isCurrentChapterImage(link, referer) || seen[link]) return;
    seen[link] = true;
    data.push({link: link, headers: imageHeaders(referer)});
}

function execute(url) {
    url = normalizeUrl(url);
    let doc = getDoc(url);
    if (!doc) return Response.error("Khong tai duoc chapter.");

    let data = [];
    let seen = {};
    let nodes = doc.select("img.object-cover.mx-auto, img[src*='/chuong-'], img[data-src*='/chuong-']");
    for (let i = 0; i < nodes.size(); i++) {
        addImage(data, seen, imageAttr(nodes.get(i)), url);
    }

    if (data.length === 0) {
        let html = doc.html();
        let regex = /https?:\/\/[^"'\s<>]+\/[^"'\s<>]+\/chuong-[^"'\s<>]+\/\d+\.(?:jpg|jpeg|png|webp)(?:\?[^"'\s<>]*)?/ig;
        let match;
        while ((match = regex.exec(html)) !== null) addImage(data, seen, match[0], url);
    }

    if (data.length === 0) return Response.error("Khong tim thay anh chapter.");
    return Response.success(data);
}
