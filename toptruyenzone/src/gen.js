load('config.js');

function execute(url, page) {
    let doc = getDoc(listPageUrl(url, page));
    if (!doc) return null;

    return Response.success(collectComics(doc), nextPage(doc, page));
}
