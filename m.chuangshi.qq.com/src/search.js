load("config.js");

function execute(key, page) {
    let current = pageNum(page, 1);
    let data = apiData("/search", {
        keywords: key || "",
        pageIndex: current,
        pageSize: 20
    }, BASE_URL + "/search");
    if (!data) return null;

    let items = [];
    let seen = {};
    let books = data.books || [];
    for (let i = 0; i < books.length; i++) {
        pushBook(items, seen, books[i]);
    }

    let pages = parseInt(data.pages || 0, 10);
    let next = pages && current < pages ? "" + (current + 1) : "";
    return Response.success(items, next);
}
