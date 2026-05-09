load('config.js');

function validImage(url) {
    if (!url) return false;
    if (url.indexOf("data:image") === 0) return false;
    if (url.indexOf("/favicon") >= 0) return false;
    if (url.indexOf("/logo") >= 0) return false;
    if (url.indexOf("/images/loading") >= 0 || url.indexOf("/images/placeholder") >= 0 || url.indexOf("/no_image") >= 0) return false;
    if (url.indexOf("/ads") >= 0 || url.indexOf("/banner") >= 0) return false;
    return /\.(jpg|jpeg|png|webp)(?:[?#].*)?$/i.test(url);
}

function addFallback(list, link) {
    link = normalizeImage(link);
    if (validImage(link) && list.indexOf(link) < 0) list.push(link);
}

function imageHeaders(url) {
    return {
        "Referer": normalizeUrl(url),
        "User-Agent": "Mozilla/5.0 (Linux; Android 12; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0 Mobile Safari/537.36"
    };
}

function imageAttr(e) {
    let srcset = e.attr("data-srcset") || e.attr("srcset");
    if (srcset) return cleanText(srcset.split(",")[0].split(" ")[0]);
    return e.attr("data-original") || e.attr("data-src") || e.attr("data-lazy-src") || e.attr("data-url") || e.attr("src");
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

function execute(url) {
    let doc = getDoc(url);
    if (!doc) return null;

    let data = [];
    let seen = {};
    doc.select("#chapter_content img, .chapter_content img, .page-chapter img, .reading-content img, .chapter-content img").forEach(function(e) {
        let link = normalizeImage(imageAttr(e));
        if (!validImage(link) || seen[link]) return;

        let fallback = [];
        addFallback(fallback, e.attr("data-cdn"));
        addFallback(fallback, e.attr("src"));
        addFallback(fallback, e.attr("data-original"));

        seen[link] = true;
        data.push({
            link: link,
            headers: imageHeaders(url),
            fallback: fallback
        });
    });

    if (data.length === 0) {
        let html = doc.html();
        let regex = /(https?:\/\/[^"'\s<>]+?\.(?:jpg|jpeg|png|webp)(?:\?[^"'\s<>]*)?)/ig;
        let match;
        while ((match = regex.exec(html)) !== null) {
            if (match[1].indexOf("truyenvua.com") >= 0 || match[1].indexOf("hinhhinh.com") >= 0) {
                addImage(data, seen, match[1], url);
            }
        }
    }

    if (data.length === 0) return Response.error("Khong tim thay anh chapter.");
    return Response.success(data);
}
