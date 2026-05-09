load('config.js');
try {
    load('cookie.js');
} catch (error) {
}

function isValidImage(url) {
    if (!url) return false;
    if (url.indexOf("data:image") === 0) return false;
    if (url.indexOf("/Content/images/logo/") >= 0) return false;
    if (url.indexOf("/favicon") >= 0) return false;
    return true;
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
        "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36"
    };
    try {
        if (COOKIE_HEADER) {
            headers["Cookie"] = COOKIE_HEADER;
        }
    } catch (error) {
    }

    let response = fetch(url, {
        headers: headers
    });

    if (!response.ok) {
        return null;
    }

    let doc = response.html();
    let title = doc.select("title").text();
    if (title.indexOf("Login") >= 0 || doc.select(".login-page-wrapper").size() > 0) {
        return Response.error("Chapter yêu cầu đăng nhập trên LuotTruyen.");
    }
    if (doc.select(".btn-unlockChapter").size() > 0) {
        return Response.error("Chapter đang bị khóa trên LuotTruyen.");
    }

    let domain1 = doc.select("#DomainImage").attr("value");
    let domain2 = doc.select("#DomainImage1").attr("value");
    let data = [];
    let seen = {};

    doc.select(".reading-detail .page-chapter img, .page-chapter img, .chapter-c img, #chapter-c img, .reading-detail img").forEach(e => {
        let link = e.attr("data-original") || e.attr("data-src") || e.attr("data-lazy-src") || e.attr("src");
        let fallback = [];

        let dataCdn = normalizeImage(e.attr("data-cdn"));
        if (isValidImage(dataCdn)) {
            fallback.push(dataCdn);
        }

        if (domain1 && domain2 && link) {
            if (link.indexOf(domain1) >= 0) {
                fallback.push(normalizeImage(link.replace(domain1, domain2)));
            } else if (link.indexOf(domain2) >= 0) {
                fallback.push(normalizeImage(link.replace(domain2, domain1)));
            }
        }

        addImage(data, seen, link, fallback);
    });

    if (data.length === 0) {
        return Response.error("Không tìm thấy ảnh chapter.");
    }

    return Response.success(data);
}
