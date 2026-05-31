load("gen.js");

function execute(key, page) {
    if (!page) page = "1";
    let requestUrl = page && ("" + page).indexOf("http") === 0 ? page : BASE_URL + "/tim-truyen";
    let options = {method: "GET", queries: {keyword: key || ""}};
    if (/^\d+$/.test("" + page)) options.queries.page = page;
    let doc = getDoc(requestUrl, options);
    if (!doc) return null;
    return Response.success(parseList(doc), nextPage(doc, page));
}
