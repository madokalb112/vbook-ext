load('config.js');

function rowValue(row) {
    if (!row) return "";
    let value = row.select("p.col-xs-10").first();
    if (!value) value = row.select("p").last();
    if (!value) return "";
    return value.html().replace(/\s+/g, " ").trim();
}

function rowText(row) {
    if (!row) return "";
    let value = row.select("p.col-xs-10").first();
    if (!value) value = row.select("p").last();
    if (!value) return "";
    return value.text().replace(/\s+/g, " ").trim();
}

function buildDetail(doc) {
    let lines = [];
    let view = doc.select(".avatar .view").text().replace(/\s+/g, " ").trim();
    if (view) {
        lines.push("<b>Lượt xem:</b> " + view);
    }

    let author = rowText(doc.select(".list-info .author").first());
    if (author) {
        lines.push("<b>Tác giả:</b> " + author);
    }

    let status = rowText(doc.select(".list-info .status").first());
    if (status) {
        lines.push("<b>Tình trạng:</b> " + status);
    }

    return lines.join("<br>");
}

function getGenres(doc) {
    let genres = [];
    doc.select(".kind a").forEach(function(e) {
        genres.push({
            title: e.text(),
            input: e.attr("href"),
            script: "gen.js"
        });
    });
    return genres;
}

function execute(url) {
    url = normalizeUrl(url);
    let response = fetch(url, {
        headers: {
            "Referer": BASE_URL + "/",
            "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36"
        }
    });

    if (response.ok) {
        let doc = response.html();
        let name = doc.select("h1.title-detail").first();
        if (!name) {
            name = doc.select("h1").first();
        }
        if (!name) {
            return Response.error("Không tìm thấy thông tin truyện.");
        }

        let cover = doc.select("#AvatarComic").attr("value");
        if (!cover) {
            let coverNode = doc.select(".detail-info img").first();
            if (coverNode) {
                cover = coverNode.attr("src");
            }
        }

        let author = rowText(doc.select(".list-info .author").first());
        let status = rowText(doc.select(".list-info .status").first());
        let description = doc.select("#summary").html();
        if (!description) {
            description = doc.select(".detail-content p").html();
        }

        return Response.success({
            name: name.text(),
            cover: normalizeImage(cover),
            author: author,
            description: description,
            detail: buildDetail(doc),
            ongoing: status.indexOf("Hoàn thành") < 0 && status.indexOf("Hoàn Thành") < 0,
            genres: getGenres(doc),
            host: BASE_URL
        });
    }

    return null;
}
