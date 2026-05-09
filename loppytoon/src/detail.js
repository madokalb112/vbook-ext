load('config.js');

function metaAt(doc, index) {
    let nodes = doc.select(".manga-meta .meta-value");
    if (nodes.size() > index) {
        return cleanText(nodes.get(index).text());
    }
    return "";
}

function infoLine(label, value) {
    if (!value) return "";
    return "<b>" + label + ":</b> " + value;
}

function execute(url) {
    url = normalizeUrl(url);
    let response = request(url);
    if (response.ok) {
        let doc = response.html();
        let nameNode = doc.select(".manga-details .manga-title, .manga-title, h1").first();
        if (!nameNode) {
            return Response.error("Khong tim thay thong tin truyen.");
        }

        let coverNode = doc.select(".manga-cover img.cover-image, img.cover-image").first();
        let cover = coverNode ? coverNode.attr("data-src") || coverNode.attr("src") : "";
        let author = cleanText(doc.select("a[href*='tac-gia']").first() ? doc.select("a[href*='tac-gia']").first().text() : metaAt(doc, 1));
        let group = cleanText(doc.select("a[href*='/nhom-dich/']").first() ? doc.select("a[href*='/nhom-dich/']").first().text() : metaAt(doc, 2));
        let otherName = metaAt(doc, 0);
        let status = metaAt(doc, 3);
        let views = metaAt(doc, 4);

        let details = [];
        let otherHtml = infoLine("Ten khac", otherName);
        let groupHtml = infoLine("Nhom dich", group);
        let statusHtml = infoLine("Tinh trang", status);
        let viewsHtml = infoLine("Luot xem", views);
        if (otherHtml) details.push(otherHtml);
        if (groupHtml) details.push(groupHtml);
        if (statusHtml) details.push(statusHtml);
        if (viewsHtml) details.push(viewsHtml);

        let genres = [];
        let seenGenres = {};
        doc.select(".manga-tags a[href*='/the-loai/']").forEach(function(e) {
            let title = cleanText(e.text());
            let href = normalizeUrl(e.attr("href"));
            if (title && href && !seenGenres[href]) {
                seenGenres[href] = true;
                genres.push({
                    title: title,
                    input: href,
                    script: "gen.js"
                });
            }
        });

        let descNode = doc.select(".manga-description").first();
        let description = descNode ? descNode.html() : "";
        if (!description || !cleanText(descNode ? descNode.text() : "")) {
            description = doc.select("meta[name=description]").attr("content");
        }

        let lowerStatus = status.toLowerCase();
        let ongoing = lowerStatus.indexOf("hoan") < 0 && lowerStatus.indexOf("hoàn") < 0 && lowerStatus.indexOf("full") < 0 && lowerStatus.indexOf("complete") < 0;

        return Response.success({
            name: cleanText(nameNode.text()),
            cover: normalizeImage(cover),
            author: author,
            description: description,
            detail: details.join("<br>"),
            ongoing: ongoing,
            genres: genres,
            host: BASE_URL
        });
    }

    return null;
}
