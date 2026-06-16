load("config.js");

// Only domains that actually resolve. img2/img.dichvucdn.com are NXDOMAIN
// and caused "nxdomain" errors in the app when used as fallbacks.
let CDN_DOMAINS = [
    "img3.dichvucdn.com",
    "img.luottruyen.com",
    "img2.luottruyen.com"
];

function cdnFallbacks(link) {
    let data = [];
    let src = "";
    for (let j = 0; j < CDN_DOMAINS.length; j++) {
        if (link.indexOf(CDN_DOMAINS[j]) >= 0) { src = CDN_DOMAINS[j]; break; }
    }
    if (!src) return data;
    for (let i = 0; i < CDN_DOMAINS.length; i++) {
        if (CDN_DOMAINS[i] === src) continue;
        let alt = normalizeImage(link.replace(src, CDN_DOMAINS[i]));
        if (validImage(alt) && data.indexOf(alt) < 0) data.push(alt);
    }
    return data;
}

function isChapterImage(link) {
    link = normalizeImage(link || "").toLowerCase();
    if (!validImage(link)) return false;
    return link.indexOf("/imagecontent/") >= 0 || link.indexOf("/upload") >= 0 || link.indexOf("/chapter") >= 0;
}

function isLoginDoc(doc) {
    if (!doc) return false;
    let title = cleanText(doc.select("title").text());
    return title.indexOf("Login") >= 0 || title.indexOf("login") >= 0 ||
        title.indexOf("Object moved") >= 0 || doc.select(".login-page-wrapper").size() > 0;
}

function collectImages(doc, referer) {
    let data = [];
    let seen = {};
    let nodes = doc.select(".reading-detail .page-chapter img, .page-chapter img, .reading-detail img");
    if (nodes.size() === 0) nodes = doc.select("img[src], img[data-src], img[data-original], img[data-cdn]");

    let hasChapterImage = false;
    nodes.forEach(function(img) {
        if (isChapterImage(imageAttr(img)) || isChapterImage(img.attr("data-cdn"))) hasChapterImage = true;
    });

    nodes.forEach(function(img) {
        let link = imageAttr(img);
        let cdn = normalizeImage(img.attr("data-cdn"));
        if (hasChapterImage && !isChapterImage(link) && isChapterImage(cdn)) link = cdn;
        if (hasChapterImage && !isChapterImage(link)) return;
        link = normalizeImage(link);
        if (!validImage(link) || seen[link]) return;
        seen[link] = true;

        let fallback = cdnFallbacks(link);
        if (validImage(cdn) && cdn !== link && fallback.indexOf(cdn) < 0) fallback.push(cdn);
        let headers = imageHeaders(BASE_URL + "/");
        let item = {link: link, headers: headers, header: headers};
        if (fallback.length > 0) item.fallback = fallback;
        data.push(item);
    });
    return data;
}

function browserImages(url) {
    let doc = browserDoc(url);
    if (!doc || isLoginDoc(doc)) return [];
    return collectImages(doc, url);
}

function execute(url) {
    url = normalizeUrl(url);
    let cookie = sourceCookie();
    let headers = baseHeaders({"Referer": BASE_URL + "/"});
    if (cookie) headers["Cookie"] = cookie;

    let res = request(url, {headers: headers});
    if (!res || !res.ok) {
        let data = browserImages(url);
        return data.length > 0 ? Response.success(data) : null;
    }

    let doc = res.html();
    if (isLoginDoc(doc)) {
        let data = browserImages(url);
        if (data.length > 0) return Response.success(data);
        return Response.error("Chapter yêu cầu đăng nhập. Mở Trang nguồn, đăng nhập LuotTruyen rồi tải lại.");
    }
    if (doc.select(".btn-unlockChapter").size() > 0) {
        return Response.error("Chapter đang bị khóa trên LuotTruyen.");
    }

    let data = collectImages(doc, url);
    if (data.length === 0) data = browserImages(url);
    if (data.length === 0) return Response.error("Không tìm thấy ảnh chapter.");
    return Response.success(data);
}
