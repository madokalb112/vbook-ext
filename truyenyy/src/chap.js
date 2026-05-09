load('config.js');

function validParagraph(text) {
    if (!text) return false;
    let folded = foldText(text);
    if (text.length < 2) return false;
    if (folded === "truoc" || folded === "tiep") return false;
    if (folded.indexOf("phien ban dich") === 0) return false;
    if (folded.indexOf("thong tin chuong truyen") >= 0) return false;
    if (folded.indexOf("giao dien doc truyen") >= 0) return false;
    if (folded.indexOf("danh sach chuong") >= 0) return false;
    return true;
}

function execute(url) {
    let doc = getDoc(url);
    if (!doc) return null;

    let title = firstText(doc, ["h1"]);
    let parts = [];
    let article = doc.select("article").first();
    let nodes = article ? article.select("p") : doc.select("main p");
    nodes.forEach(function(p) {
        let text = cleanText(p.text());
        if (!validParagraph(text)) return;
        parts.push("<p>" + p.html() + "</p>");
    });

    if (parts.length === 0) return Response.error("Khong tim thay noi dung chuong.");
    let content = title ? "<h2>" + title + "</h2>\n" + parts.join("\n") : parts.join("\n");
    return Response.success(content);
}
