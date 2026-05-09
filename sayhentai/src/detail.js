load('config.js');

function infoValue(doc, label) {
    let value = "";
    doc.select(".post-content_item").forEach(function(e) {
        let heading = cleanText(e.select(".summary-heading h5").text()).toLowerCase();
        if (heading === label.toLowerCase()) {
            value = cleanText(e.select(".summary-content").text());
        }
    });
    if (value === "..." || value === "-") return "";
    return value;
}

function infoHtml(label, value) {
    if (!value) return "";
    return "<b>" + label + ":</b> " + value;
}

function execute(url) {
    url = normalizeUrl(url);
    let response = request(url);
    if (response.ok) {
        let doc = response.html();
        let nameNode = doc.select(".post-title h1, h1").first();
        if (!nameNode) {
            return Response.error("Khong tim thay thong tin truyen.");
        }

        let coverNode = doc.select(".summary_image img, .tab-summary img").first();
        let cover = coverNode ? coverNode.attr("data-src") || coverNode.attr("data-original") || coverNode.attr("src") : "";
        let author = infoValue(doc, "Tác giả");
        let group = infoValue(doc, "Nhóm dịch");
        let otherName = infoValue(doc, "Tên khác");
        let status = infoValue(doc, "Tình trạng") || infoValue(doc, "Trạng thái");
        let views = infoValue(doc, "View");

        if (!author) {
            author = group;
        }

        let details = [];
        let otherHtml = infoHtml("Ten khac", otherName);
        let groupHtml = infoHtml("Nhom dich", group);
        let statusHtml = infoHtml("Tinh trang", status);
        let viewsHtml = infoHtml("View", views);
        if (otherHtml) details.push(otherHtml);
        if (groupHtml) details.push(groupHtml);
        if (statusHtml) details.push(statusHtml);
        if (viewsHtml) details.push(viewsHtml);

        let genres = [];
        let seenGenres = {};
        doc.select(".genres-content a[href], a[rel=tag][href*='/genre/']").forEach(function(e) {
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

        let descNode = doc.select(".description-summary .original-content").first();
        let description = descNode ? descNode.html() : "";
        if (!description || !cleanText(descNode ? descNode.text() : "")) {
            descNode = doc.select(".description-summary .summary__content").first();
            description = descNode ? descNode.html() : "";
        }
        if (!description) {
            description = doc.select("meta[name=description]").attr("content");
        }

        let lowerStatus = status.toLowerCase();
        let ongoing = lowerStatus.indexOf("hoàn thành") < 0 && lowerStatus.indexOf("full") < 0 && lowerStatus.indexOf("completed") < 0;

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
