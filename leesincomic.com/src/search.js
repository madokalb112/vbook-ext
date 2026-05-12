load("gen.js");

function searchPageUrl(key) {
    return BASE_URL + "/tim-kiem.html?key=" + encodeURIComponent(key || "").replace(/%20/g, "+");
}

function parseSuggestDoc(html) {
    let data = [];
    let seen = {};
    let doc = Html.parse("<div>" + (html || "") + "</div>");
    doc.select(".li_search a[href], a[href]").forEach(function(a) {
        let href = a.attr("href");
        if (!isStoryUrl(href)) return;
        let link = normalizeUrl(href);
        if (seen[link]) return;

        let imgNode = a.select("img").first();
        let name = firstText(a, [".info", ".name", "div", "span"]);
        if (!name) name = cleanText(a.attr("title") || a.text());
        if (!name) name = cleanText(imgNode ? (imgNode.attr("alt") || imgNode.attr("title")) : "");
        if (!name) return;

        seen[link] = true;
        data.push({
            name: name,
            link: link,
            cover: imageFromNode(imgNode),
            description: "",
            host: BASE_URL
        });
    });
    return data;
}

function execute(key, page) {
    if (page && page !== "1") return Response.success([], "");

    let requestUrl = searchPageUrl(key);
    let doc = getDoc(requestUrl);
    let data = [];
    if (doc) data = collectItems(doc);
    if (data.length === 0 && doc) data = collectByLinks(doc);

    if (data.length === 0 && key && cleanText(key).length >= 2) {
        try {
            let response = postForm(BASE_URL + "/process.php", {
                action: "goi_y",
                key: key
            }, requestUrl);
            if (response.ok) {
                let json = JSON.parse(response.text());
                if (json && json.ok == 1 && json.list) {
                    data = parseSuggestDoc(json.list);
                }
            }
        } catch (error) {
        }
    }

    return Response.success(data, "");
}
