load("config.js");

function execute(key, page) {
    let url = addQuery(BASE_URL + "/tim-truyen", "keyword", key || "");
    if (page && ("" + page).indexOf("http") === 0) url = page;
    else if (page && /^\d+$/.test("" + page)) url = addQuery(url, "page", page);
    let doc = getDoc(url);
    if (!doc) return null;
    return Response.success(parseList(doc), nextPage(doc, url));
}
