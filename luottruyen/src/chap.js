load('config.js');

var CDN_DOMAINS = [
    "img3.dichvucdn.com",
    "img.luottruyen.com",
    "img2.luottruyen.com"
];

function isValidImage(url) {
    if (!url) return false;
    if (url.indexOf("data:image") === 0) return false;
    if (url.indexOf("/Content/images/logo/") >= 0) return false;
    if (url.indexOf("/favicon") >= 0) return false;
    if (url.indexOf("/Scripts/") >= 0) return false;
    if (url.indexOf("/logo") >= 0) return false;
    return true;
}

function buildFallbacks(link) {
    let fallback = [];
    for (let i = 0; i < CDN_DOMAINS.length; i++) {
        let domain = CDN_DOMAINS[i];
        if (link.indexOf(domain) < 0) {
            for (let j = 0; j < CDN_DOMAINS.length; j++) {
                if (link.indexOf(CDN_DOMAINS[j]) >= 0) {
                    let alt = normalizeImage(link.replace(CDN_DOMAINS[j], domain));
                    if (fallback.indexOf(alt) < 0) {
                        fallback.push(alt);
                    }
                    break;
                }
            }
        }
    }
    return fallback;
}

function addImage(data, seen, link, fallback) {
    link = normalizeImage(link);
    if (!isValidImage(link) || seen[link]) {
        return;
    }

    let item = {link: link};
    if (fallback && fallback.length > 0) {
        item.fallback = fallback;
    }

    seen[link] = true;
    data.push(item);
}

function execute(url) {
    url = normalizeUrl(url);
    let headers = {
        "Referer": BASE_URL + "/",
        "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/142.0.0.0 Safari/537.36"
    };
    let cookie = sourceCookie();
    if (cookie) {
        headers["Cookie"] = cookie;
    }

    let response = request(url, {
        headers: headers
    });

    if (!response.ok) {
        return null;
    }

    let doc = response.html();
    let title = doc.select("title").text();
    if (title.indexOf("Login") >= 0 || title.indexOf("login") >= 0 || title.indexOf("Object moved") >= 0 || doc.select(".login-page-wrapper").size() > 0) {
        return Response.error("Chapter yeu cau dang nhap tren LuotTruyen. Hay dang nhap qua WebView (Trang nguon) roi tai lai.");
    }
    if (doc.select(".btn-unlockChapter").size() > 0) {
        return Response.error("Chapter dang bi khoa tren LuotTruyen.");
    }

    let data = [];
    let seen = {};

    doc.select(".reading-detail .page-chapter img, .page-chapter img, .reading-detail img").forEach(e => {
        let link = e.attr("src") || e.attr("data-original") || e.attr("data-src") || e.attr("data-lazy-src");
        if (!link) return;

        let fallback = buildFallbacks(link);

        let dataCdn = normalizeImage(e.attr("data-cdn"));
        if (isValidImage(dataCdn) && fallback.indexOf(dataCdn) < 0) {
            fallback.push(dataCdn);
        }

        addImage(data, seen, link, fallback);
    });

    if (data.length === 0) {
        return Response.error("Khong tim thay anh chapter.");
    }

    return Response.success(data);
}
