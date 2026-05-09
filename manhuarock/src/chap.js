load('config.js');

function chapterIdFromDoc(doc) {
    let html = doc.html ? doc.html() : "";
    let match = /chapter_id\s*=\s*(\d+)/i.exec(html);
    if (match) return match[1];
    let node = doc.select("a.chapter-name[data-chapter-id], [data-chapter-id]").first();
    return node ? cleanText(node.attr("data-chapter-id")) : "";
}

function chapterDataIdFromDoc(doc) {
    let node = doc.select(".loadchapter[data-id], [data-id].loadchapter").first();
    if (node) return cleanText(node.attr("data-id"));
    let html = doc.html ? doc.html() : "";
    let match = /class=["'][^"']*loadchapter[^"']*["'][^>]*data-id=["'](\d+)["']/i.exec(html);
    return match ? match[1] : "";
}

function addImage(data, seen, link, referer, strict) {
    link = normalizeImage(link);
    if (!validImage(link) || seen[link]) return;
    if (strict && link.toLowerCase().indexOf("/manga/") < 0) return;
    seen[link] = true;
    data.push({link: link, headers: imageHeaders(referer)});
}

function collectImagesFromHtml(html, data, seen, referer, strict) {
    if (!html) return;
    let doc = Html.parse(html);
    let nodes = doc.select("img[src], img[data-src], img[data-original], img[data-lazy-src]");
    for (let i = 0; i < nodes.size(); i++) addImage(data, seen, imageAttr(nodes.get(i)), referer, strict);
}

function collectImagesFromText(text, data, seen, referer, strict) {
    if (!text) return;
    let regex = /https?:\\?\/\\?\/[^"'\s<>]+?\.(?:jpg|jpeg|png|webp)(?:\?[^"'\s<>]*)?/ig;
    let match;
    while ((match = regex.exec(text)) !== null) {
        addImage(data, seen, match[0].replace(/\\\//g, "/"), referer, strict);
    }
}

function imagesFromAjax(apiUrl, referer) {
    let data = [];
    let seen = {};
    let text = getText(apiUrl, {headers: ajaxHeaders(referer)});
    if (!text) return data;
    try {
        let json = JSON.parse(text);
        if (json && json.html) collectImagesFromHtml(json.html, data, seen, referer, false);
    } catch (error) {
    }
    if (data.length === 0) collectImagesFromText(text, data, seen, referer, true);
    return data;
}

function execute(url) {
    url = normalizeUrl(url);
    let doc = getDoc(url);
    if (!doc) return Response.error("Khong tai duoc chapter.");

    let chapterId = chapterIdFromDoc(doc);
    if (chapterId) {
        let data = imagesFromAjax(BASE_URL + "/ajax/image/list/chap/" + chapterId + "?mode=vertical&quality=high", url);
        if (data.length > 0) return Response.success(data);
    }

    let chapterDataId = chapterDataIdFromDoc(doc);
    if (chapterDataId) {
        let dataByServer = imagesFromAjax(BASE_URL + "/ajax/image/list/chap_data/" + chapterDataId + "?mode=vertical&quality=high", url);
        if (dataByServer.length > 0) return Response.success(dataByServer);
    }

    let data = [];
    let seen = {};
    let content = doc.select(".read-content, #chapter-content, .reading-content, .chapter-content").html();
    collectImagesFromHtml(content, data, seen, url, true);
    if (data.length === 0) collectImagesFromText(content || doc.html(), data, seen, url, true);
    if (data.length === 0) return Response.error("Khong tim thay anh chapter.");
    return Response.success(data);
}
