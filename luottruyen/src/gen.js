load("config.js");

function execute(url, page) {
    let requestUrl = page && ("" + page).indexOf("http") === 0 ? page : normalizeUrl(url || BASE_URL + "/tim-truyen");
    if (page && /^\d+$/.test("" + page)) requestUrl = addQuery(requestUrl, "page", page);
    let doc = getDoc(requestUrl);
    if (!doc) return null;
    return Response.success(parseList(doc), nextPage(doc, requestUrl));
}
