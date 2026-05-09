load('config.js');

function validImage(url) {
    if (!url) return false;
    if (url.indexOf("data:image") === 0) return false;
    if (url.indexOf("/favicon") >= 0 || url.indexOf("/cropped-") >= 0 || url.indexOf("/logo") >= 0) return false;
    if (url.indexOf("/wp-content/uploads/") < 0 && url.indexOf("i0.wp.com") < 0 && url.indexOf("i1.wp.com") < 0 && url.indexOf("i2.wp.com") < 0) return false;
    return /\.(jpg|jpeg|png|webp)(?:[?#].*)?$/i.test(url);
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

function isPasswordText(text) {
    let folded = foldText(text);
    return folded.indexOf("password-protected") >= 0 ||
        folded.indexOf("enter the password") >= 0 ||
        folded.indexOf("mat khau") >= 0 ||
        folded.indexOf("protected") >= 0;
}

function textContent(doc) {
    let parts = [];
    doc.select(".reading-content p, .reading-content h2, .reading-content h3, .entry-content p, .entry-content h2, .entry-content h3").forEach(function(e) {
        let text = cleanText(e.text());
        if (!text || isPasswordText(text)) return;
        parts.push("<p>" + e.html() + "</p>");
    });
    return parts.join("\n");
}

function execute(url) {
    let doc = getDoc(url);
    if (!doc) return null;

    let data = [];
    let seen = {};
    doc.select(".reading-content img, .page-break img, .chapter-content img, .entry-content img, .text-left img").forEach(function(e) {
        addImage(data, seen, imageAttr(e), url);
    });

    if (data.length > 0) return Response.success(data);

    let content = textContent(doc);
    if (cleanText(content).length > 80) return Response.success(content);

    if (doc.select(".post-password-form").size() > 0 || isPasswordText(doc.text())) {
        return Response.error("Chuong can mat khau tren web.");
    }
    return Response.error("Khong tim thay noi dung chapter.");
}
