load('config.js');

function validImage(url) {
    if (!url) return false;
    if (url.indexOf("data:image") === 0) return false;
    if (url.indexOf("/favicon") >= 0) return false;
    if (url.indexOf("/logo") >= 0) return false;
    if (url.indexOf("/images/loading") >= 0 || url.indexOf("/images/placeholder") >= 0) return false;
    if (url.indexOf("/media/images/") >= 0) return false;
    if (url.indexOf("/ads") >= 0 || url.indexOf("/banner") >= 0) return false;
    return true;
}

function addFallback(list, link) {
    link = normalizeImage(link);
    if (validImage(link) && list.indexOf(link) < 0) list.push(link);
}

function cdnFallbacks(link) {
    let fallback = [];
    addFallback(fallback, link.replace("mangaqq.net", "i200.truyenvua.com").replace("cdnqq.xyz", "i200.truyenvua.com"));
    addFallback(fallback, link.replace("mangaqq.com", "i216.truyenvua.com"));
    addFallback(fallback, link.replace("photruyen.com", "i109.truyenvua.com").replace("tintruyen.com", "i109.truyenvua.com").replace("trangshop.net", "i109.truyenvua.com"));
    addFallback(fallback, link.replace("//tintruyen.net", "//i138.truyenvua.com").replace("//i125.tintruyen.net", "//i125.truyenvua.com"));
    addFallback(fallback, link.replace("qqtaku.com", "i125.truyenvua.com"));
    return fallback;
}

function imageHeaders(url) {
    return {
        "Referer": normalizeUrl(url),
        "User-Agent": "Mozilla/5.0 (Linux; Android 12; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0 Mobile Safari/537.36"
    };
}

function imageAttr(e) {
    let srcset = e.attr("data-srcset") || e.attr("srcset");
    if (srcset) {
        return cleanText(srcset.split(",")[0].split(" ")[0]);
    }
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
    url = migrateLegacyUrl(url);
    let doc = getDoc(url);
    if (!doc) return null;

    let data = [];
    let seen = {};
    doc.select(".reading-content img, .reading-content source, .chapter_content img, .chapter-content img, #chapter_content img, #chapter-content img, .reading-detail img, .page-chapter img, .chapter-c img, article img").forEach(function(e) {
        let real = imageAttr(e);
        let src = e.attr("src");
        let link = normalizeImage(real);
        if (!validImage(link) || seen[link]) return;

        let fallback = [];
        addFallback(fallback, src);
        let cdn = cdnFallbacks(link);
        for (let i = 0; i < cdn.length; i++) addFallback(fallback, cdn[i]);

        seen[link] = true;
        data.push({
            link: link,
            headers: imageHeaders(url),
            fallback: fallback
        });
    });

    if (data.length === 0) {
        let html = doc.html();
        let regex = /(https?:\/\/[^"'\s<>]+?\.(?:jpg|jpeg|png|webp))/ig;
        let match;
        while ((match = regex.exec(html)) !== null) {
            if (match[1].indexOf("static3t.com") >= 0 || match[1].indexOf("/chapters/") >= 0) {
                addImage(data, seen, match[1], url);
            }
        }
    }

    if (data.length === 0) {
        return Response.error("Khong tim thay anh chapter.");
    }
    return Response.success(data);
}
