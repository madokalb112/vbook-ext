load("config.js");

function chapterSlugFromName(name) {
    name = foldText(name || "").replace(/[^a-z0-9.]+/g, "-").replace(/^-+|-+$/g, "");
    if (name.indexOf("chapter") < 0 && name.indexOf("chap") < 0) name = "chapter-" + name.replace(/^chuong-/, "");
    return name || "chapter";
}

function fixedChapterUrl(detailUrl, chapterHref, chapterName) {
    chapterHref = normalizeUrl(chapterHref);
    let path = pathOf(chapterHref).replace(/\/+$/, "");
    let parts = path.split("/");
    let chapterId = parts[parts.length - 1] || "";
    let chapterSlug = parts[parts.length - 2] || "";
    if (!chapterSlug || chapterSlug.indexOf("chapter") < 0) chapterSlug = chapterSlugFromName(chapterName);
    return BASE_URL + "/truyen-tranh/" + storySlug(detailUrl) + "/" + chapterSlug + "/" + chapterId;
}

function addChapter(data, seen, detailUrl, href, name) {
    if (!href) return;
    name = cleanText(name) || "Chapter " + (data.length + 1);
    let url = fixedChapterUrl(detailUrl, href, name);
    if (seen[url]) return;
    seen[url] = true;
    data.push({name: name, url: url, host: BASE_URL});
}

function chaptersFromNodes(nodes, detailUrl) {
    let data = [];
    let seen = {};
    for (let i = nodes.size() - 1; i >= 0; i--) {
        let a = nodes.get(i);
        addChapter(data, seen, detailUrl, a.attr("href"), a.text() || a.attr("title"));
    }
    return data;
}

function execute(url) {
    url = normalizeUrl(url);
    let doc = getDoc(url);
    if (!doc) return null;

    let storyID = doc.select("#storyID").attr("value");
    if (storyID) {
        let response = request(BASE_URL + "/Story/ListChapterByStoryID", {
            method: "POST",
            headers: ajaxHeaders(url),
            body: "StoryID=" + encodeURIComponent(storyID)
        });
        if (response.ok) {
            let chapterDoc = response.html();
            let nodes = chapterDoc.select("nav ul li .chapter a[href], li .chapter a[href], .chapter a[href], a[href*='chapter']");
            let data = chaptersFromNodes(nodes, url);
            if (data.length > 0) return Response.success(data);
        }
    }

    let nodes = doc.select("a[href*='chapter']");
    let fallback = chaptersFromNodes(nodes, url);
    if (fallback.length > 0) return Response.success(fallback);
    return Response.error("Khong tim thay danh sach chuong.");
}
