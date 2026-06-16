load("config.js");

// TOC AJAX returns broken hrefs like /truyen-tranh/chapter-5/chapter-5/1602989
// (slug = "chapter-5" instead of the story slug). Rebuild with the real slug.
function chapterSlugFromName(name) {
    name = foldText(name || "").replace(/[^a-z0-9.]+/g, "-").replace(/^-+|-+$/g, "");
    if (name.indexOf("chapter") < 0 && name.indexOf("chap") < 0) name = "chapter-" + name.replace(/^chuong-/, "");
    return name || "chapter";
}

function fixedChapterUrl(detailUrl, chapterHref, chapterName) {
    let parts = pathOf(normalizeUrl(chapterHref)).replace(/\/+$/, "").split("/");
    let chapterId = parts[parts.length - 1] || "";
    let chapterSlug = parts[parts.length - 2] || "";
    if (!chapterSlug || chapterSlug.indexOf("chapter") < 0) chapterSlug = chapterSlugFromName(chapterName);
    return BASE_URL + "/truyen-tranh/" + storySlug(detailUrl) + "/" + chapterSlug + "/" + chapterId;
}

function chaptersFromNodes(nodes, detailUrl) {
    let data = [];
    let seen = {};
    for (let i = nodes.size() - 1; i >= 0; i--) {
        let a = nodes.get(i);
        let href = a.attr("href");
        if (!href) continue;
        let name = cleanText(a.text() || a.attr("title")) || "Chapter " + (data.length + 1);
        let url = fixedChapterUrl(detailUrl, href, name);
        if (seen[url]) continue;
        seen[url] = true;
        data.push({name: name, url: url, host: BASE_URL});
    }
    return data;
}

function execute(url) {
    url = normalizeUrl(url);
    let doc = getDoc(url);
    if (!doc) return null;

    let storyID = doc.select("#storyID").attr("value");
    if (storyID) {
        let res = request(BASE_URL + "/Story/ListChapterByStoryID", {
            method: "POST",
            headers: ajaxHeaders(url),
            body: "StoryID=" + encodeURIComponent(storyID)
        });
        if (res && res.ok) {
            let nodes = res.html().select("nav ul li .chapter a[href], li .chapter a[href], .chapter a[href], a[href*='chapter']");
            let data = chaptersFromNodes(nodes, url);
            if (data.length > 0) return Response.success(data);
        }
    }

    let fallback = chaptersFromNodes(doc.select("a[href*='chapter']"), url);
    if (fallback.length > 0) return Response.success(fallback);
    return Response.error("Không tìm thấy danh sách chương.");
}
