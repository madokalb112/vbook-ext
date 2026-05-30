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
        chapterSlug = (chapterName || "").toLowerCase().replace(/\s+/g, "-");
    }

    return BASE_URL + "/truyen-tranh/" + storySlug(detailUrl) + "/" + chapterSlug + "/" + chapterId;
}

function execute(url) {
    url = normalizeUrl(url);
    let UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/142.0.0.0 Safari/537.36";

    let detailResponse = request(url, {
        headers: {
            "Referer": BASE_URL + "/",
            "User-Agent": UA
        }
    });

    if (!detailResponse.ok) {
        return Response.error("Khong tai duoc trang chi tiet truyen.");
    }

    let detailDoc = detailResponse.html();
    let storyID = detailDoc.select("#storyID").attr("value");
    if (!storyID) {
        return Response.error("Khong tim thay storyID tren trang truyen.");
    }

    let response = request(BASE_URL + "/Story/ListChapterByStoryID", {
        method: "POST",
        headers: {
            "User-Agent": UA,
            "Accept": "*/*",
            "Content-Type": "application/x-www-form-urlencoded; charset=UTF-8",
            "X-Requested-With": "XMLHttpRequest",
            "Origin": BASE_URL,
            "Referer": url,
            "Cache-Control": "no-cache"
        },
        body: "StoryID=" + encodeURIComponent(storyID)
    });

    if (!response.ok) {
        return Response.error("Khong tai duoc danh sach chuong (HTTP " + response.status + ").");
    }

    let doc = response.html();
    let nodes = doc.select("nav ul li .chapter a");
    if (nodes.size() === 0) {
        nodes = doc.select("li .chapter a");
    }
    if (nodes.size() === 0) {
        nodes = doc.select(".chapter a");
    }

    if (nodes.size() === 0) {
        return Response.error("Khong tim thay chuong nao trong danh sach.");
    }

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
