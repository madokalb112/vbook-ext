load('config.js');

function storySlug(url) {
    let part = url.replace(/\/$/, "").split("/").pop();
    return part.replace(/-\d+$/, "");
}

function fixedChapterUrl(detailUrl, chapterHref, chapterName) {
    chapterHref = normalizeUrl(chapterHref);
    let parts = chapterHref.replace(/\/$/, "").split("/");
    let chapterId = parts[parts.length - 1];
    let chapterSlug = parts[parts.length - 2];

    if (!chapterSlug || chapterSlug.indexOf("chapter") < 0) {
        chapterSlug = chapterName.toLowerCase().replace(/\s+/g, "-");
    }

    return BASE_URL + "/truyen-tranh/" + storySlug(detailUrl) + "/" + chapterSlug + "/" + chapterId;
}

function execute(url) {
    url = normalizeUrl(url);
    let detailResponse = fetch(url);

    if (!detailResponse.ok) {
        return null;
    }

    let detailDoc = detailResponse.html();
    let storyID = detailDoc.select("#storyID").attr("value");
    if (!storyID) {
        return null;
    }

    let response = fetch(BASE_URL + "/Story/ListChapterByStoryID", {
        method: "POST",
        headers: {
            "Cache-Control": "no-cache, must-revalidate, max-age=0",
            "Referer": url
        },
        body: {
            StoryID: storyID
        }
    });

    if (response.ok) {
        let doc = response.html();
        let nodes = doc.select("li .chapter a");
        let data = [];

        for (let i = nodes.size() - 1; i >= 0; i--) {
            let e = nodes.get(i);
            data.push({
                name: e.text(),
                url: fixedChapterUrl(url, e.attr("href"), e.text()),
                host: BASE_URL
            });
        }

        return Response.success(data);
    }

    return null;
}
