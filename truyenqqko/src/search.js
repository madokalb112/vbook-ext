load('config.js');

function searchRequest(key) {
    return fetch(BASE_URL + "/frontend/search/search", {
        method: "POST",
        headers: {
            "Accept": "text/html, */*; q=0.01",
            "Accept-Language": "vi-VN,vi;q=0.9,en-US;q=0.8,en;q=0.7",
            "Content-Type": "application/x-www-form-urlencoded; charset=UTF-8",
            "Origin": BASE_URL,
            "Referer": BASE_URL + "/",
            "X-Requested-With": "XMLHttpRequest",
            "User-Agent": "Mozilla/5.0 (Linux; Android 12; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0 Mobile Safari/537.36"
        },
        body: {
            search: key || "",
            type: "0"
        }
    });
}

function parseDescription(e) {
    let nodes = e.select(".search_info p");
    for (let i = nodes.size() - 1; i >= 0; i--) {
        let node = nodes.get(i);
        let cls = node.attr("class");
        let text = cleanText(node.text());
        if (text && cls.indexOf("name") < 0) return text;
    }
    return "";
}

function parseSearchDoc(doc) {
    let data = [];
    let seen = {};
    doc.select("li a[href*='/truyen-tranh/'], a[href*='/truyen-tranh/']").forEach(function(a) {
        let href = a.attr("href");
        if (!isStoryUrl(href)) return;

        let link = normalizeUrl(href);
        if (seen[link]) return;

        let imgNode = a.select(".search_avatar img, img").first();
        let cover = imageFromNode(imgNode);

        let name = firstText(a, [".search_info .name", ".name", "h3", "p"]);
        if (!name) name = cleanText(a.attr("title") || a.text());
        if (!name) return;
        
        cover = normalizeImage(cover);
        if (!isProxyCover(cover)) {
            let proxyCover = detailCover(link);
            if (proxyCover) cover = proxyCover;
        }

        seen[link] = true;
        data.push({
            name: name,
            link: link,
            cover: cover,
            description: parseDescription(a),
            host: BASE_URL
        });
    });
    return data;
}

function execute(key, page) {
    if (page && page !== "1") return Response.success([], "");

    try {
        let response = searchRequest(key);
        if (response.ok) {
            let html = response.text();
            let doc = Html.parse("<ul>" + html + "</ul>");
            return Response.success(parseSearchDoc(doc), "");
        }
    } catch (error) {
    }

    return Response.success([], "");
}
