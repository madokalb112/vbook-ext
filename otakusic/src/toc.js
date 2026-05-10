load("config.js");

function chapterName(row) {
    let name = cleanText(row.chapter_name);
    if (name && name.toLowerCase().indexOf("chuong") < 0 && name.toLowerCase().indexOf("chapter") < 0) {
        name = "Chuong " + name;
    }
    let title = cleanText(row.chapter_title);
    return title ? name + ": " + title : name;
}

function execute(url) {
    let slug = slugFromUrl(url);
    if (!slug) return Response.error("Khong tim thay slug truyen.");

    let response = requestJson(API_URL + "/manga/chapters/" + encodeURIComponent(slug), storyUrl(slug));
    if (!response.ok) return null;

    let json = response.json();
    let rows = json && json.data ? json.data : [];
    let data = [];
    let seen = {};
    for (let i = rows.length - 1; i >= 0; i--) {
        let row = rows[i];
        if (!row || row.status !== "active") continue;
        let cslug = cleanText(row.chapter_slug);
        let mslug = cleanText(row.manga_slug || slug);
        if (!cslug || seen[cslug]) continue;
        seen[cslug] = true;
        let link = chapterUrl(mslug, cslug);
        data.push({
            name: chapterName(row),
            url: link,
            link: link,
            input: link,
            host: link
        });
    }

    return Response.success(data);
}
