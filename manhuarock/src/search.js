load('gen.js');

function execute(key, page) {
    let requestUrl = BASE_URL + "/search?keyword=" + encodeURIComponent(key || "");
    if (page && page !== "1") requestUrl = addPageParam(requestUrl, page);
    let doc = getDoc(requestUrl);
    if (!doc) return Response.success([], "");
    return Response.success(parseListPage(doc), nextPage(doc, requestUrl));
}
