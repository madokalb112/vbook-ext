load('config.js');

function execute(key, page) {
    let requestUrl = BASE_URL + "/tim-truyen?keyword=" + encodeURIComponent(key || "");
    if (page && page !== "1") {
        requestUrl = (("" + page).indexOf("http") === 0 || ("" + page).indexOf("/") === 0) ?
            normalizeUrl(page) :
            requestUrl + "&page=" + page;
    }

    let doc = getDoc(requestUrl);
    if (!doc) return null;

    return Response.success(collectComics(doc), nextPage(doc, page));
}
