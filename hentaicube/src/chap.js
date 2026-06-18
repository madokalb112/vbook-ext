load('config.js');

function validImage(url) {
    if (!url) return false;
    if (url.indexOf("data:image") === 0) return false;
    if (url.indexOf("/favicon") >= 0 || url.indexOf("/cropped-fav") >= 0 || url.indexOf("/logo") >= 0) return false;
    if (url.indexOf("cdn.hentaicube.xyz") >= 0) return /\.(jpg|jpeg|png|webp|gif)(?:[?#].*)?$/i.test(url);
    if (url.indexOf("/wp-content/uploads/") < 0 && url.indexOf("i0.wp.com") < 0 && url.indexOf("i1.wp.com") < 0 && url.indexOf("i2.wp.com") < 0) return false;
    return /\.(jpg|jpeg|png|webp|gif)(?:[?#].*)?$/i.test(url);
}

function addImage(data, seen, link) {
    link = normalizeImage(link);
    if (!validImage(link) || seen[link]) return;
    seen[link] = true;
    data.push({
        link: link,
        headers: link.indexOf("cdn.hentaicube.xyz") >= 0 ? cdnImageHeaders() : imageHeaders(BASE_URL + "/")
    });
}

function imagesFromApi(chapterUrl) {
    let links = readerImages(chapterUrl);
    if (!links || links.length === 0) return [];

    let data = [];
    let seen = {};
    for (let i = 0; i < links.length; i++) addImage(data, seen, links[i]);
    return data;
}

function collectImages(doc, url) {
    let data = [];
    let seen = {};
    doc.select("#chapter_content img, .reading-content .page-break img, .reading-content img, .entry-content .chapter-img, .reading-content .chapter-content img, #manga-secure-reader img").forEach(function(e) {
        addImage(data, seen, imageAttr(e));
    });
    return data;
}

function execute(url) {
    url = normalizeUrl(url);

    let data = imagesFromApi(url);
    if (data.length > 0) return Response.success(data);

    let doc = getDoc(url);
    if (!doc) return loadError();

    data = collectImages(doc, url);
    if (data.length > 0) return Response.success(data);

    return Response.error(LAST_ERROR || "Khong tim thay anh chapter.");
}
