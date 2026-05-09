load('gen.js');

function execute(key, page) {
    let requestUrl = BASE_URL + "/tim-kiem-nang-cao?name=" + encodeURIComponent(key || "");
    if (page && page !== "1") {
        if (("" + page).indexOf("http") === 0 || ("" + page).indexOf("/") === 0) requestUrl = normalizeUrl(page);
        else requestUrl += "&page=" + encodeURIComponent(page);
    }
    let doc = getDoc(requestUrl);
    if (!doc) return Response.success([], "");
    return Response.success(parseListPage(doc), nextPage(doc, requestUrl));
}
