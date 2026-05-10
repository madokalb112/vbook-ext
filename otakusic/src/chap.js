load("config.js");

function addImage(data, seen, link, referer) {
    link = normalizeImage(link);
    if (!link || seen[link]) return;
    if (link.indexOf("/manga/uploads/chapter/") < 0) return;
    seen[link] = true;
    data.push({
        link: link,
        headers: imageHeaders(referer)
    });
}

function errorFromResponse(response) {
    try {
        let json = response.json();
        if (json && json.message) return cleanText(json.message);
    } catch (error) {
    }
    return "";
}

function sleepMs(ms) {
    try {
        sleep(ms);
    } catch (error) {
    }
}

function scrollReader(browser) {
    for (let i = 1; i <= 8; i++) {
        try {
            browser.callJs("(function(){var h=Math.max(document.body.scrollHeight,document.documentElement.scrollHeight);window.scrollTo(0,Math.floor(h*" + i + "/8));return h;})()", 1500);
        } catch (error) {
        }
        sleepMs(700);
    }
}

function collectRenderedImages(doc, url) {
    let data = [];
    let seen = {};
    if (!doc) return data;
    let nodes = doc.select("img[src*='/manga/uploads/chapter/'], img[data-src*='/manga/uploads/chapter/']");
    for (let i = 0; i < nodes.size(); i++) {
        let img = nodes.get(i);
        let link = img.attr("data-src") || img.attr("src");
        addImage(data, seen, link, url);
    }
    return data;
}

function directImagesFromChapterList(mangaSlug, chapterSlug, referer) {
    let response = requestJson(API_URL + "/manga/chapters/" + encodeURIComponent(mangaSlug), storyUrl(mangaSlug));
    if (!response.ok) return [];

    let json = response.json();
    let rows = json && json.data ? json.data : [];
    let row = null;
    for (let i = 0; i < rows.length; i++) {
        if (cleanText(rows[i].chapter_slug) === chapterSlug) {
            row = rows[i];
            break;
        }
    }
    if (!row || !row.api_url) return [];

    let files = [];
    try {
        files = JSON.parse(row.api_url);
    } catch (error) {
        return [];
    }

    let chapterPath = cleanText(row.chapter_original_slug || row.chapter_name || chapterSlug.replace(/^chuong-?/i, ""));
    if (!chapterPath) return [];

    let data = [];
    let seen = {};
    for (let i = 0; i < files.length; i++) {
        let file = cleanText(files[i]);
        if (!file) continue;
        addImage(data, seen, "https://img.otakusic.com/manga/uploads/chapter/" + mangaSlug + "/" + chapterPath + "/" + file, referer);
    }
    return data;
}

function browserImages(url) {
    let browser = null;
    try {
        browser = Engine.newBrowser();
        try {
            browser.setUserAgent(UserAgent.android());
        } catch (uaError) {
            try {
                browser.setUserAgent(DESKTOP_UA);
            } catch (error) {
            }
        }
        let doc = browser.launch(url, 45000);
        sleepMs(2500);
        scrollReader(browser);
        try {
            doc = browser.html();
        } catch (error) {
        }
        return collectRenderedImages(doc, url);
    } catch (error) {
        return [];
    } finally {
        try {
            if (browser) browser.close();
        } catch (error) {
        }
    }
}

function execute(url) {
    url = normalizeUrl(url);
    let mangaSlug = slugFromUrl(url);
    let chapterSlug = chapterSlugFromUrl(url);
    if (!mangaSlug || !chapterSlug) return Response.error("URL chapter khong hop le.");

    let direct = directImagesFromChapterList(mangaSlug, chapterSlug, url);
    if (direct.length > 0) return Response.success(direct);

    let api = API_URL + "/manga/" + encodeURIComponent(mangaSlug) + "/" + encodeURIComponent(chapterSlug) + "/images";
    let page = 1;
    let hasMore = true;
    let data = [];
    let seen = {};

    while (hasMore && page <= 100) {
        let response = requestJson(api + "?page=" + page, url);
        if (!response.ok) {
            let message = errorFromResponse(response);
            if (foldText(message).indexOf("dang nhap") >= 0) {
                let fallback = browserImages(url);
                if (fallback.length > 0) return Response.success(fallback);
                return Response.error("Chapter can dang nhap tren Otakusic. Mo trang nguon, dang nhap, roi thu lai.");
            }
            if (message) return Response.error(message);
            return Response.error("Khong lay duoc anh chapter Otakusic.");
        }

        let json = response.json();
        let rows = json && json.data ? json.data : [];
        for (let i = 0; i < rows.length; i++) addImage(data, seen, rows[i], url);

        hasMore = !!(json && json.has_more);
        if (rows.length === 0) break;
        page++;
    }

    if (data.length === 0) return Response.error("Khong tim thay anh chapter.");
    return Response.success(data);
}
