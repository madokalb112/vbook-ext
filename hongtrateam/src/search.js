load('config.js');

function ajaxSearch(key) {
    try {
        let response = fetch(BASE_URL + "/wp-admin/admin-ajax.php", {
            method: "POST",
            headers: {
                "Accept": "application/json, text/javascript, */*; q=0.01",
                "Accept-Language": "vi-VN,vi;q=0.9,en-US;q=0.8,en;q=0.7",
                "Content-Type": "application/x-www-form-urlencoded; charset=UTF-8",
                "Origin": BASE_URL,
                "Referer": BASE_URL + "/",
                "X-Requested-With": "XMLHttpRequest",
                "User-Agent": "Mozilla/5.0 (Linux; Android 12; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0 Mobile Safari/537.36"
            },
            body: {
                action: "wp-manga-search-manga",
                title: key || ""
            }
        });
        if (response.ok) return JSON.parse(response.text());
    } catch (error) {
    }
    return null;
}

function fallbackSearch(key) {
    let doc = getDoc(BASE_URL + "/?s=" + encodeURIComponent(key || "") + "&post_type=wp-manga");
    let data = [];
    let seen = {};
    if (!doc) return data;
    doc.select("a[href*='/truyen/']").forEach(function(a) {
        let href = a.attr("href");
        if (!isStoryUrl(href)) return;
        let link = normalizeUrl(href);
        if (seen[link]) return;
        seen[link] = true;
        data.push({
            name: stripProtected(a.attr("title") || a.text()),
            link: link,
            cover: detailCover(link),
            description: "",
            host: BASE_URL
        });
    });
    return data;
}

function execute(key, page) {
    if (page && page !== "1") return Response.success([], "");

    let data = [];
    let seen = {};
    let result = ajaxSearch(key);
    if (result && result.success && result.data) {
        for (let i = 0; i < result.data.length; i++) {
            let item = result.data[i];
            let link = normalizeUrl(item.url || "");
            if (!link || !isStoryUrl(link) || seen[link]) continue;
            seen[link] = true;
            data.push({
                name: stripProtected(item.title || ""),
                link: link,
                cover: detailCover(link),
                description: item.type || "",
                host: BASE_URL
            });
        }
    }

    if (data.length === 0) data = fallbackSearch(key);
    return Response.success(data, "");
}
