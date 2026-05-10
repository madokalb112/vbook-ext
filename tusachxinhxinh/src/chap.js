load('config.js');

let IMAGE_DOT = "qX3xRL";
let IMAGE_COLON = "guhD2Z";
let IMAGE_SLASH = "9f7sWJ";

function decodeChapterImage(url) {
    if (!url) return "";
    url = decodeHtml(url);
    url = url.replace(new RegExp(IMAGE_DOT, "g"), ".");
    url = url.replace(new RegExp(IMAGE_COLON, "g"), ":");
    url = url.replace(new RegExp(IMAGE_SLASH, "g"), "/");
    return normalizeImage(url);
}

function addImage(data, seen, link, referer) {
    link = normalizeImage(link);
    if (!validImage(link) || seen[link]) return;
    seen[link] = true;
    data.push({link: link, headers: imageHeaders(referer)});
}

function collectImagesFromHtml(html, data, seen, referer) {
    if (!html) return;
    let doc = Html.parse(html);
    let nodes = doc.select("img[data-qx3xrl], img[src], img[data-src], img[data-original], img[data-lazy-src]");
    for (let i = 0; i < nodes.size(); i++) {
        let img = nodes.get(i);
        let encoded = img.attr("data-qx3xrl");
        if (encoded && encoded !== "loaded" && encoded !== "stored") {
            addImage(data, seen, decodeChapterImage(encoded), referer);
        } else {
            addImage(data, seen, imageAttr(img), referer);
        }
    }
}

function collectEncodedImagesFromText(text, data, seen, referer) {
    if (!text) return;
    let regex = /data-qx3xrl=["']([^"']+)["']/ig;
    let match;
    while ((match = regex.exec(text)) !== null) {
        addImage(data, seen, decodeChapterImage(match[1]), referer);
    }
}

function collectImagesFromText(text, data, seen, referer) {
    if (!text) return;
    let regex = /https?:\\?\/\\?\/[^"'\s<>]+?\.(?:jpg|jpeg|png|webp|gif)(?:\?[^"'\s<>]*)?/ig;
    let match;
    while ((match = regex.exec(text)) !== null) {
        addImage(data, seen, match[0].replace(/\\\//g, "/"), referer);
    }
}

function chapterSlugFromUrl(url) {
    let path = pathOf(url).replace(/^\/+|\/+$/g, "");
    if (!path || path.indexOf("/") >= 0) return "";
    return path;
}

function collectImagesFromRest(url, data, seen) {
    let slug = chapterSlugFromUrl(url);
    if (!slug) return;
    let api = BASE_URL + "/wp-json/wp/v2/posts?slug=" + encodeURIComponent(slug);
    let text = getText(api, {headers: ajaxHeaders(url)});
    if (!text) return;
    try {
        let json = JSON.parse(text);
        if (!json || !json.length || !json[0].content) return;
        let content = json[0].content.rendered || "";
        collectImagesFromText(content, data, seen, url);
    } catch (error) {
    }
}

function execute(url) {
    url = normalizeUrl(url);
    let data = [];
    let seen = {};

    collectImagesFromRest(url, data, seen);
    if (data.length > 0) return Response.success(data);

    let html = getText(url);
    if (!html) return Response.error("Khong tai duoc chapter.");

    collectImagesFromText(html, data, seen, url);
    if (data.length === 0) {
        let doc = Html.parse(html);
        let content = doc.select("#view-chapter, .view-chapter, .reading-content, .chapter-content").html();
        collectImagesFromHtml(content, data, seen, url);
    }
    if (data.length === 0) return Response.error("Khong tim thay anh chapter.");
    return Response.success(data);
}
