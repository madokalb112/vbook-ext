load('config.js');

function attrFromTag(tag, name) {
    let re = new RegExp(name + "\\s*=\\s*([\"'])([\\s\\S]*?)\\1", "i");
    let match = re.exec(tag);
    if (match) return decodeHtml(match[2]);
    re = new RegExp(name + "\\s*=\\s*([^\\s>]+)", "i");
    match = re.exec(tag);
    return match ? decodeHtml(match[1]) : "";
}

function jsonObjectAfter(html, marker) {
    let start = html.indexOf(marker);
    if (start < 0) return "";
    start = html.indexOf("{", start);
    if (start < 0) return "";
    let depth = 0;
    let quote = "";
    let escape = false;
    for (let i = start; i < html.length; i++) {
        let ch = html.charAt(i);
        if (quote) {
            if (escape) {
                escape = false;
            } else if (ch === "\\") {
                escape = true;
            } else if (ch === quote) {
                quote = "";
            }
        } else {
            if (ch === "\"" || ch === "'") {
                quote = ch;
            } else if (ch === "{") {
                depth++;
            } else if (ch === "}") {
                depth--;
                if (depth === 0) return html.substring(start, i + 1);
            }
        }
    }
    return "";
}

function chapterContentFromScript(html) {
    let objectText = jsonObjectAfter(html, "CHAPTER_DATA");
    if (!objectText) return "";
    try {
        let data = JSON.parse(objectText);
        return data && data.content ? data.content : "";
    } catch (error) {
        return "";
    }
}

function validImage(url) {
    if (!url) return false;
    url = normalizeImage(url);
    if (url.indexOf("data:image") === 0) return false;
    if (url.indexOf("/themes/") >= 0 || url.indexOf("/images/icons/") >= 0) return false;
    if (url.indexOf("dmca.com") >= 0 || url.indexOf("facebook.com") >= 0) return false;
    return /\.(jpg|jpeg|png|webp|gif)(?:[?#].*)?$/i.test(url);
}

function addImage(data, seen, link, referer) {
    link = normalizeImage(link);
    if (!validImage(link) || seen[link]) return;
    seen[link] = true;
    data.push({
        link: link,
        headers: imageHeaders(referer)
    });
}

function collectImagesFromHtml(html, data, seen, referer) {
    let match;
    let re = /<img\b[^>]*>/ig;
    while ((match = re.exec(html || "")) !== null) {
        let tag = match[0];
        let link = attrFromTag(tag, "data-src") ||
            attrFromTag(tag, "data-original") ||
            attrFromTag(tag, "data-lazy-src") ||
            attrFromTag(tag, "src");
        addImage(data, seen, link, referer);
    }
}

function collectImagesFromDoc(doc, data, seen, referer) {
    doc.select("#chapter-content img, .chapter-content img, .detail__des img").forEach(function(e) {
        addImage(data, seen, imageAttr(e), referer);
    });
}

function execute(url) {
    url = normalizeUrl(url);
    let doc = getDoc(url);
    if (!doc) return Response.error("Khong lay duoc chapter. Co the bi Cloudflare chan.");

    let data = [];
    let seen = {};
    let html = doc.html ? doc.html() : "";
    collectImagesFromHtml(chapterContentFromScript(html), data, seen, url);
    collectImagesFromDoc(doc, data, seen, url);

    if (data.length === 0) return Response.error("Khong tim thay anh chapter.");
    return Response.success(data);
}