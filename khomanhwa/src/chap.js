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

function chapterSlugFromUrl(url) {
    let match = /\/(chapter-[^/?#]+)\/?(?:[?#].*)?$/i.exec(normalizeUrl(url));
    return match ? match[1] : "";
}

function readJson(response) {
    try {
        return response.json();
    } catch (error) {
        try {
            return JSON.parse(response.text() || "");
        } catch (jsonError) {
            return null;
        }
    }
}

function imagesFromApi(doc, url) {
    let box = doc.select("#chapter_boxImages, .chapter_boxImages").first();
    if (!box) return null;

    let manga = cleanText(box.attr("data-manga")) || storySlug(url);
    let chapter = cleanText(box.attr("data-chapter")) || chapterSlugFromUrl(url);
    let token = cleanText(box.attr("data-token"));
    let endpoint = cleanText(box.attr("data-endpoint")) || "/reader_images.php";
    if (!manga || !chapter || !token) return null;

    let apiUrl = normalizeUrl(endpoint) +
        "?manga=" + encodeURIComponent(manga) +
        "&chapter=" + encodeURIComponent(chapter) +
        "&token=" + encodeURIComponent(token);

    let json = null;
    try {
        let response = request(apiUrl, {
            headers: {
                "Accept": "application/json, text/plain, */*",
                "X-Requested-With": "XMLHttpRequest",
                "Referer": url
            }
        });
        if (!response.ok) return null;
        json = readJson(response);
    } catch (error) {
        return null;
    }

    if (!json || !json.images || !json.images.length) return null;

    let data = [];
    let seen = {};
    for (let i = 0; i < json.images.length; i++) {
        let item = json.images[i] || {};
        addImage(data, seen, item.url || item.link || item.src, url, false);
    }
    return data.length ? data : null;
}

function imagesFromHtml(doc, url) {
    let data = [];
    let seen = {};
    let nodes = doc.select("img.chapter-page, img.lazy, img[data-src*='img.manhwa.vip'], img[src*='img.manhwa.vip']");
    for (let i = 0; i < nodes.size(); i++) {
        addImage(data, seen, imageAttr(nodes.get(i)), url, false);
    }

    if (data.length === 0) {
        let html = doc.html();
        let regex = /https?:\/\/[^"'\s<>]+?\.(?:jpg|jpeg|png|webp|gif|avif)(?:\?[^"'\s<>]*)?/ig;
        let match;
        while ((match = regex.exec(html)) !== null) addImage(data, seen, match[0], url, true);
    }
    return data;
}

function execute(url) {
    url = normalizeUrl(url);
    let doc = getDoc(url);
    if (!doc) return Response.error("Khong tai duoc chapter.");

    let data = imagesFromApi(doc, url);
    if (!data || data.length === 0) data = imagesFromHtml(doc, url);

    if (!data || data.length === 0) return Response.error("Khong tim thay anh chapter.");
    return Response.success(data);
}
