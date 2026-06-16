load('config.js');

function rowLabel(row) {
    var n = row.select(".summary-heading h5, .summary-heading, h5").first();
    return n ? clean(n.text()).replace(/:\s*$/, "") : "";
}

function rowValue(row) {
    var n = row.select(".summary-content").first();
    return n ? clean(n.text()) : "";
}


function valueByLabel(rows, keys) {
    for (var i = 0; i < rows.size(); i++) {
        var label = rowLabel(rows.get(i)).toLowerCase();
        for (var j = 0; j < keys.length; j++) {
            if (label.indexOf(keys[j]) >= 0) return rowValue(rows.get(i));
        }
    }
    return "";
}

function getGenres(doc) {
    var data = [];
    var seen = {};
    doc.select(".genres-content a[href*='/theloai/'], a[href*='/theloai/']").forEach(function(a) {
        var href = absUrl(a.attr("href"));
        if (!/\/theloai\/[^/?#]+\/?$/i.test(href.replace(/[?#].*$/, "")) || seen[href]) return;
        var title = clean(a.text());
        if (!title) return;
        seen[href] = true;
        data.push({title: title, input: href, script: "gen.js"});
    });
    return data;
}

function execute(url) {
    var target = storyUrl(url);
    if (!isStoryUrl(target)) return Response.error("URL truyện không hợp lệ.");

    var doc = getDoc(target);
    if (!doc) return Response.error("Không tải được trang truyện.");

    var name = cleanTitle(doc.select(".post-title h1, .post-title h3, h1").first() ? doc.select(".post-title h1, .post-title h3, h1").first().text() : "");
    if (!name) return Response.error("Không tìm thấy thông tin truyện.");

    var cover = "";
    var img = doc.select(".summary_image img, .tab-summary img").first();
    if (img) cover = fullImage(imgSrc(img));

    var rows = doc.select(".post-content_item");
    var author = valueByLabel(rows, ["tác giả", "author", "artist"]);
    var altName = valueByLabel(rows, ["tên khác", "alternative"]);
    var status = valueByLabel(rows, ["tình trạng", "status"]);
    var statusLow = status.toLowerCase();

    var desc = "";
    var d = doc.select(".description-summary .summary__content, .summary__content, .manga-excerpt").first();
    if (d) desc = clean(d.text());
    if (altName) desc = (desc ? desc + "<br><br>" : "") + "<b>Tên khác:</b> " + altName;

    return Response.success({
        name: name,
        cover: cover,
        host: BASE_URL,
        author: author,
        description: desc,
        ongoing: statusLow.indexOf("hoàn thành") < 0 && statusLow.indexOf("completed") < 0 && statusLow.indexOf("full") < 0,
        genres: getGenres(doc)
    });
}
