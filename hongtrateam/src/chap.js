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

function escapeHtml(text) {
    return ("" + text).replace(/&/g, "&amp;").replace(/</g, "&lt;").replace(/>/g, "&gt;");
}

function contentFromNode(node) {
    let parts = [];
    node.select("p, h1, h2, h3, h4, h5, h6").forEach(function(e) {
        let text = cleanText(e.text());
        if (!text || isPasswordText(text)) return;
        parts.push("<p>" + escapeHtml(text) + "</p>");
    });
    return parts.join("\n");
}

function textContent(doc) {
    let containers = [
        ".reading-content .text-left",
        ".reading-content",
        ".entry-content .read-container"
    ];
    for (let i = 0; i < containers.length; i++) {
        let node = doc.select(containers[i]).first();
        if (!node) continue;
        let content = contentFromNode(node);
        if (cleanText(content).length > 20) return content;
    }
    return "";
}

function isProtected(doc) {
    return doc && doc.select(".reading-content form.post-password-form, form.post-password-form[action*='postpass']").size() > 0;
}

function isTextChapter(doc) {
    if (!doc) return false;
    if (doc.select(".chapter-type-text, body.chapter-type-text, .reading-content .text-left").size() > 0) return true;
    let bodyClass = foldText(doc.select("body").attr("class"));
    return bodyClass.indexOf("chapter-type-text") >= 0;
}

function storySlugFromChapterUrl(url) {
    let path = pathOf(url).replace(/\/+$/, "");
    let match = /^\/truyen\/([^/]+)\//i.exec(path);
    return match ? match[1] : "";
}

function passwordFromChapterUrl(url) {
    let slug = storySlugFromChapterUrl(url);
    if (!slug) return "";
    let words = foldText(slug.replace(/[-_]+/g, " ")).replace(/[^a-z0-9\s]+/g, " ").split(/\s+/);
    let pass = "";
    for (let i = 0; i < words.length; i++) {
        if (words[i]) pass += words[i].charAt(0);
    }
    return pass;
}

function passwordFormAction(doc) {
    let form = doc.select(".reading-content form.post-password-form, form.post-password-form[action*='postpass']").first();
    let action = form ? form.attr("action") : "";
    return action ? normalizeUrl(action) : BASE_URL + "/wp-login.php?action=postpass";
}

function submitPassword(url, doc) {
    let password = passwordFromChapterUrl(url);
    if (!password) return false;
    let body = "post_password=" + encodeURIComponent(password) +
        "&Submit=" + encodeURIComponent("Nhap") +
        "&redirect_to=" + encodeURIComponent(normalizeUrl(url));
    try {
        request(passwordFormAction(doc), {
            method: "POST",
            headers: {
                "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
                "Content-Type": "application/x-www-form-urlencoded",
                "Origin": BASE_URL,
                "Referer": normalizeUrl(url)
            },
            body: body
        }).text();
        return true;
    } catch (error) {
    }
    return false;
}

function unlockedDoc(url, doc) {
    if (!isProtected(doc)) return doc;
    if (!submitPassword(url, doc)) return doc;
    let unlocked = getDoc(url);
    return unlocked || doc;
}

function collectImages(doc, url) {
    let data = [];
    let seen = {};
    doc.select(".reading-content .page-break img, .reading-content .chapter-content img, .reading-content .text-left img, .reading-content > img").forEach(function(e) {
        addImage(data, seen, imageAttr(e), url);
    });
    return data;
}

function escapeAttr(text) {
    return ("" + text).replace(/&/g, "&amp;").replace(/"/g, "&quot;").replace(/</g, "&lt;");
}

function imagesContent(data) {
    let parts = [];
    for (let i = 0; i < data.length; i++) {
        let link = data[i].link || data[i];
        if (link) parts.push('<p><img src="' + escapeAttr(link) + '" /></p>');
    }
    return parts.join("\n");
}

function execute(url) {
    let doc = getDoc(url);
    if (!doc) return null;
    doc = unlockedDoc(url, doc);

    let content = textContent(doc);
    if (isTextChapter(doc) && cleanText(content).length > 20) return Response.success(content);

    let data = collectImages(doc, url);
    if (data.length > 0) return Response.success(imagesContent(data));

    if (cleanText(content).length > 80) return Response.success(content);

    if (isProtected(doc)) {
        return Response.error("Chuong can mat khau, auto pass: " + passwordFromChapterUrl(url));
    }
    return Response.error("Khong tim thay noi dung chapter.");
}
