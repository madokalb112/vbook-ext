load('config.js');

function infoValue(doc, label) {
    let html = doc.select(".comic-intro-text").html();
    if (!html) return "";
    let reg = new RegExp("<strong>\\s*" + label + "\\s*:?\\s*<\\/strong>\\s*<span[^>]*>([\\s\\S]*?)<\\/span>", "i");
    let match = reg.exec(html);
    if (!match) return "";
    return Html.parse("<div>" + match[1] + "</div>").text().replace(/\s+/g, " ").trim();
}

function execute(url) {
    url = normalizeUrl(url);
    let response = request(url);
    if (response.ok) {
        let doc = response.html();
        let nameNode = doc.select(".comic-info .info-title").first();
        if (!nameNode) {
            return Response.error("Không tìm thấy thông tin truyện.");
        }

        let coverNode = doc.select(".comic-intro img.img-thumbnail").first();
        let cover = coverNode ? coverNode.attr("data-src") || coverNode.attr("src") : "";
        let author = infoValue(doc, "Tác giả");
        let status = infoValue(doc, "Tình trạng");
        let views = infoValue(doc, "Tổng lượt đọc");
        let otherName = infoValue(doc, "Tên khác");

        let detail = "";
        if (otherName) detail += "<b>Tên khác:</b> " + otherName;
        if (status) detail += (detail ? "<br>" : "") + "<b>Tình trạng:</b> " + status;
        if (views) detail += (detail ? "<br>" : "") + "<b>Tổng lượt đọc:</b> " + views;

        let genres = [];
        doc.select(".comic-info .tags a[href*=/the-loai/]").forEach(function(e) {
            genres.push({
                title: e.text().replace(/\s+/g, " ").trim(),
                input: e.attr("href"),
                script: "gen.js"
            });
        });

        let descNode = doc.select(".intro-container .hide-long-text").first();
        let description = descNode ? descNode.html() : "";
        let descText = descNode ? descNode.text().replace("— Xem Thêm —", "").replace(/\s+/g, " ").trim() : "";
        if (!description || !descText) {
            description = doc.select("meta[name=description]").attr("content");
        }

        return Response.success({
            name: nameNode.text().replace(/\s+/g, " ").trim(),
            cover: normalizeImage(cover),
            author: author,
            description: description,
            detail: detail,
            ongoing: status.indexOf("Hoàn thành") < 0 && status.indexOf("Hoàn Thành") < 0,
            genres: genres,
            host: BASE_URL
        });
    }

    return null;
}
