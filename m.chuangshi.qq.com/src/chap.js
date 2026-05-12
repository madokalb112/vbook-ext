load("config.js");

function lineToParagraph(line) {
    line = ("" + line).replace(/\u0000/g, "").replace(/\s+$/, "");
    if (!line.replace(/[\s\u3000]+/g, "")) return "";
    return "<p>" + escapeHtml(line) + "</p>";
}

function contentToHtml(text) {
    text = ("" + (text || "")).replace(/\r/g, "");
    let rows = text.split("\n");
    let parts = [];
    for (let i = 0; i < rows.length; i++) {
        let paragraph = lineToParagraph(rows[i]);
        if (paragraph) parts.push(paragraph);
    }
    return parts.join("\n");
}

function execute(url) {
    let bid = bookIdFromUrl(url);
    let cid = chapterIdFromUrl(url);
    if (!bid || !cid) return Response.error("Url chuong khong hop le.");

    let data = apiData("/book/read", {
        bid: bid,
        cid: cid
    }, url);
    if (!data || !data.content) return Response.error("Khong tim thay noi dung chuong.");

    let html = contentToHtml(data.content);
    if (!html) return Response.error("Chuong bi khoa hoac khong co noi dung.");
    return Response.success(html);
}
