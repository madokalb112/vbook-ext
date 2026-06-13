load("config.js");

let CDN_DOMAINS = [
    "img3.dichvucdn.com",
    "img2.dichvucdn.com",
    "img.dichvucdn.com",
    "img.luottruyen.com",
    "img2.luottruyen.com"
];

function cdnFallbacks(link) {
    let data = [];
    for (let i = 0; i < CDN_DOMAINS.length; i++) {
        let current = CDN_DOMAINS[i];
        if (link.indexOf(current) >= 0) continue;
        for (let j = 0; j < CDN_DOMAINS.length; j++) {
            let source = CDN_DOMAINS[j];
            if (link.indexOf(source) < 0) continue;
            let alt = normalizeImage(link.replace(source, current));
            if (validImage(alt) && data.indexOf(alt) < 0) data.push(alt);
            break;
        }
    }
    return data;
}

function addImage(data, seen, link, referer, fallback) {
    link = normalizeImage(link);
    if (!validImage(link) || seen[link]) return;
    seen[link] = true;
    let headers = imageHeaders(imageReferer(link, referer));
    let item = {link: link, headers: headers, header: headers};
    fallback = fallback || [];
    if (fallback.length > 0) item.fallback = fallback;
    data.push(item);
}

function imageReferer(link, referer) {
    let low = (link || '').toLowerCase();
    if (low.indexOf('dichvucdn.com') >= 0 || low.indexOf('luottruyen.com') >= 0) return BASE_URL + '/';
    return referer || BASE_URL + '/';
}

function isChapterImage(link) {
    link = normalizeImage(link || '').toLowerCase();
    if (!validImage(link)) return false;
    return link.indexOf('/imagecontent/') >= 0 ||
        link.indexOf('/upload') >= 0 ||
        link.indexOf('/chapter') >= 0;
}

function isLoginDoc(doc) {
    if (!doc) return false;
    let title = cleanText(doc.select("title").text());
    let text = foldText(doc.text ? doc.text() : "");
    return title.indexOf("Login") >= 0 ||
        title.indexOf("login") >= 0 ||
        text.indexOf("dang nhap") >= 0 ||
        doc.select(".login-page-wrapper").size() > 0;
}

function collectImages(doc, referer) {
    let data = [];
    let seen = {};
    let nodes = doc.select(".reading-detail .page-chapter img, .page-chapter img, .reading-detail img");
    if (nodes.size() === 0) nodes = doc.select("img[src], img[data-src], img[data-original], img[data-lazy-src], img[data-cdn]");
    let hasChapterImage = false;
    nodes.forEach(function(img) {
        if (isChapterImage(imageAttr(img)) || isChapterImage(img.attr('data-cdn'))) hasChapterImage = true;
    });
    nodes.forEach(function(img) {
        let link = imageAttr(img);
        let cdn = normalizeImage(img.attr('data-cdn'));
        if (hasChapterImage && !isChapterImage(link) && isChapterImage(cdn)) link = cdn;
        if (hasChapterImage && !isChapterImage(link)) return;
        let fallback = cdnFallbacks(normalizeImage(link));
        if (validImage(cdn) && fallback.indexOf(cdn) < 0) fallback.push(cdn);
        addImage(data, seen, link, referer, fallback);
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
    let headers = requestOptions({headers: {"Referer": BASE_URL + "/"}}, BASE_URL).headers;
    let cookie = sourceCookie();
    if (cookie) headers["Cookie"] = cookie;

    let response = request(url, {headers: headers});
    if (!response.ok) {
        let data = browserImages(url);
        if (data.length > 0) return Response.success(data);
        return null;
    }

    let doc = response.html();
    if (isLoginDoc(doc)) {
        let data = browserImages(url);
        if (data.length > 0) return Response.success(data);
        return Response.error("Chapter yeu cau dang nhap. Mo Trang nguon va dang nhap LuotTruyen roi tai lai.");
    }
    if (doc.select(".btn-unlockChapter").size() > 0) {
        return Response.error("Chapter dang bi khoa tren LuotTruyen.");
    }

    let data = collectImages(doc, url);
    if (data.length === 0) data = browserImages(url);
    if (data.length === 0) return Response.error("Khong tim thay anh chapter.");
    return Response.success(data);
}
