load('gen.js');

function searchUrl(key) {
    return BASE_URL + "/?s=" + encodeURIComponent(key || "") + "&post_type=wp-manga";
}

function execute(key, page) {
    var target;
    if (page && ("" + page).indexOf("http") === 0) target = absUrl(page);
    else if (page && /^\d+$/.test("" + page) && page != 1) target = pageUrl(searchUrl(key), page);
    else target = searchUrl(key);

    var doc = getDoc(target);
    if (!doc) return Response.error("Không tải được kết quả tìm kiếm.");
    return Response.success(parseList(doc), nextPage(doc));
}
