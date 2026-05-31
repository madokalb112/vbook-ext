load("gen.js");

function execute(key, page) {
    let requestUrl = BASE_URL + "/tim-truyen";
    requestUrl = addQuery(requestUrl, "keyword", key || "");
    if (page && ("" + page).indexOf("http") === 0) requestUrl = page;
    else if (page && /^\d+$/.test("" + page)) requestUrl = addQuery(requestUrl, "page", page);
    let doc = getDoc(requestUrl);
    if (!doc) return null;
    return Response.success(parseList(doc), nextPage(doc, requestUrl));
}
