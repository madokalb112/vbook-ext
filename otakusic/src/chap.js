load("config.js");

function validImage(url) {
    url = normalizeImage(url);
    if (!url) return false;
    if (url.indexOf("data:image") === 0) return false;
    if (url.indexOf("/favicon") >= 0 || url.indexOf("/logo") >= 0) return false;
    if (url.indexOf("/ads") >= 0 || url.indexOf("/banner") >= 0) return false;
    return /\.(?:webp|jpg|jpeg|png|gif)(?:[?#].*)?$/i.test(url) ||
        /(?:^|\/)(?:manga\/)?uploads\/(?:chapter|chapters)\//i.test(url);
}

function addImage(data, seen, link, referer) {
    link = normalizeImage(link);
    if (!validImage(link) || seen[link]) return;
    if (link.indexOf("otakusic.com/") < 0 && link.indexOf("otruyencdn.com/") < 0) return;
    seen[link] = true;
    let headers = imageHeaders(referer);
    data.push({link: link, headers: headers, header: headers});
}

function imageFromRow(row) {
    if (!row) return "";
    if (typeof row === "string") return row;
    return row.url || row.link || row.href || row.image || row.image_url || row.imageUrl ||
        row.image_path || row.imagePath || row.src || row.path || row.file ||
        row.file_name || row.fileName || row.filename || row.name || "";
}

function collectImageLinks(value, out) {
    if (!value) return;
    if (typeof value === "string") {
        if (validImage(value)) out.push(value);
        return;
    }
    if (value.length !== undefined) {
        for (let i = 0; i < value.length; i++) collectImageLinks(value[i], out);
        return;
    }
    let keys = [
        "url", "link", "href", "uri",
        "image", "image_url", "imageUrl", "image_path", "imagePath",
        "src", "path", "full_url", "fullUrl", "cdn_url", "cdnUrl",
        "file", "file_name", "fileName", "filename", "name"
    ];
    for (let k = 0; k < keys.length; k++) {
        try {
            if (value[keys[k]]) collectImageLinks(value[keys[k]], out);
        } catch (error) {
        }
    }
    let containers = ["data", "images", "items", "pages", "results", "chapter", "chapters"];
    for (let c = 0; c < containers.length; c++) {
        try {
            if (value[containers[c]]) collectImageLinks(value[containers[c]], out);
        } catch (error) {
        }
    }
}

function addRows(data, seen, rows, referer) {
    for (let i = 0; i < rows.length; i++) {
        let links = [];
        collectImageLinks(rows[i], links);
        if (links.length === 0) links.push(imageFromRow(rows[i]));
        for (let j = 0; j < links.length; j++) addImage(data, seen, links[j], referer);
    }
}

function chapterSlugVariants(chapterSlug) {
    chapterSlug = cleanText(chapterSlug);
    let data = [];
    let seen = {};
    function push(value) {
        value = cleanText(value);
        if (!value || seen[value]) return;
        seen[value] = true;
        data.push(value);
    }
    push(chapterSlug);
    let raw = chapterSlug.replace(/^(?:chuong|chapter)-?/i, "");
    if (raw && raw !== chapterSlug) push(raw);
    if (/^\d+(?:\.\d+)?$/i.test(raw || chapterSlug)) push("chuong-" + (raw || chapterSlug));
    return data;
}

function slugMatch(value, variants) {
    value = cleanText(value);
    for (let i = 0; i < variants.length; i++) {
        if (value === variants[i]) return true;
    }
    return false;
}

function addDirectFile(data, seen, file, mangaSlug, chapterPath, referer) {
    file = cleanText(file);
    if (!file) return;
    if (/^https?:\/\//i.test(file) || file.indexOf("manga/uploads/") === 0 || file.indexOf("uploads/chapter/") === 0 || file.indexOf("uploads/chapters/") === 0) {
        addImage(data, seen, file, referer);
        return;
    }
    addImage(data, seen, IMG_BASE + "/manga/uploads/chapter/" + mangaSlug + "/" + chapterPath + "/" + file, referer);
}

function cdnImages(apiUrl, referer) {
    let data = [];
    let seen = {};
    try {
        let response = fetch(apiUrl, {
            headers: {
                "Accept": "application/json, text/plain, */*",
                "Referer": referer || BASE_URL + "/",
                "User-Agent": DESKTOP_UA
            }
        });
        if (!response.ok) return data;
        let json = readJson(response);
        if (!json || json.status !== "success") return data;
        let item = json.data && json.data.item ? json.data.item : null;
        if (!item) return data;
        let domainCdn = cleanText(json.data.domain_cdn || "");
        if (!domainCdn) return data;
        let chapterPath = cleanText(item.chapter_path || "");
        let images = item.chapter_image || [];
        for (let i = 0; i < images.length; i++) {
            let file = cleanText(images[i].image_file || "");
            if (!file) continue;
            let link = domainCdn + "/" + chapterPath + "/" + file;
            if (seen[link]) continue;
            seen[link] = true;
            let headers = imageHeaders(referer);
            data.push({link: link, headers: headers, header: headers});
        }
    } catch (error) {
    }
    return data;
}

function imagesFromChapterRows(rows, mangaSlug, chapterSlug, referer) {
    let variants = chapterSlugVariants(chapterSlug);
    let cdnRow = null;
    let fallbackRow = null;
    for (let i = 0; i < rows.length; i++) {
        if (slugMatch(rows[i].chapter_slug, variants) || slugMatch(rows[i].slug, variants) || slugMatch(rows[i].chapter_original_slug, variants)) {
            if (/^https?:\/\//i.test(cleanText(rows[i].api_url))) {
                cdnRow = rows[i];
                break;
            }
            if (!fallbackRow) fallbackRow = rows[i];
        }
    }
    let row = cdnRow || fallbackRow;
    if (!row || !row.api_url) return [];

    let apiUrl = cleanText(row.api_url);
    if (/^https?:\/\//i.test(apiUrl)) {
        return cdnImages(apiUrl, referer);
    }

    let files = [];
    try {
        files = JSON.parse(apiUrl);
    } catch (error) {
        return [];
    }

    let chapterPath = cleanText(row.chapter_original_slug || row.chapter || row.chapter_number || row.chapter_slug || row.slug || chapterSlug);
    chapterPath = chapterPath.replace(/^chuong-?/i, "").replace(/^chuong\s*/i, "").replace(/^chapter-?/i, "").replace(/^chapter\s*/i, "");
    chapterPath = chapterPath.replace(/^#/, "").replace(/[:\s].*$/, "");
    if (!chapterPath) return [];

    let data = [];
    let seen = {};
    if (files.length !== undefined) {
        for (let i = 0; i < files.length; i++) {
            let links = [];
            collectImageLinks(files[i], links);
            if (links.length === 0) links.push(imageFromRow(files[i]));
            for (let j = 0; j < links.length; j++) addDirectFile(data, seen, links[j], mangaSlug, chapterPath, referer);
        }
    } else {
        let links = [];
        collectImageLinks(files, links);
        for (let j = 0; j < links.length; j++) addDirectFile(data, seen, links[j], mangaSlug, chapterPath, referer);
    }
    return data;
}

function chapterListImages(mangaSlug, chapterSlug, referer) {
    let response = requestJson(API_URL + "/manga/chapters/" + encodeURIComponent(mangaSlug), storyUrl(mangaSlug));
    if (!response.ok) return [];
    return imagesFromChapterRows(jsonRows(readJson(response)), mangaSlug, chapterSlug, referer);
}

function apiImages(mangaSlug, chapterSlug, referer) {
    let variants = chapterSlugVariants(chapterSlug);
    for (let s = 0; s < variants.length; s++) {
        let data = [];
        let seen = {};
        for (let page = 1; page <= 100; page++) {
            let api = API_URL + "/manga/" + encodeURIComponent(mangaSlug) + "/" + encodeURIComponent(variants[s]) + "/images?page=" + page;
            let response = requestJson(api, referer);
            if (!response.ok) break;
            let json = readJson(response);
            let rows = jsonRows(json);
            let before = data.length;
            if (rows.length > 0) {
                addRows(data, seen, rows, referer);
            } else {
                let links = [];
                collectImageLinks(json, links);
                addRows(data, seen, links, referer);
            }
            if (!jsonHasMore(json, page, rows) || (rows.length === 0 && data.length === before)) break;
        }
        if (data.length > 0) return data;
    }
    return [];
}

function jsString(value) {
    try {
        return JSON.stringify(value || "");
    } catch (error) {
        return "\"\"";
    }
}

function webViewFetchJson(browser, api) {
    let key = "__vbookOtakusic" + (new Date().getTime()) + Math.floor(Math.random() * 1000);
    let script = "(function(){var k=" + jsString(key) + ";window[k]='';fetch(" + jsString(api) + ",{credentials:'include',headers:{'Accept':'application/json, text/plain, */*','X-Requested-With':'XMLHttpRequest'}}).then(function(r){return r.text().then(function(t){window[k]=JSON.stringify({status:r.status,text:t});});}).catch(function(e){window[k]=JSON.stringify({error:String(e)});});return 'ok';})()";
    try {
        browser.callJs(script, 3000);
    } catch (error) {
    }
    sleep(2500);
    let text = "";
    try {
        text = browser.callJs("(function(){return window[" + jsString(key) + "]||'';})()", 3000);
    } catch (error) {
    }
    let result = null;
    try {
        result = JSON.parse(text || "");
    } catch (error) {
    }
    if (!result || result.status !== 200 || !result.text) return null;
    try {
        return JSON.parse(result.text);
    } catch (error) {
        return null;
    }
}

function collectFromDoc(doc, url) {
    let data = [];
    let seen = {};
    if (!doc) return data;
    let nodes = doc.select("img.page-image, .chapter-content img, .reading-content img, img[src], img[data-src]");
    for (let i = 0; i < nodes.size(); i++) {
        let e = nodes.get(i);
        let link = imageAttr(e);
        addImage(data, seen, link, url);
    }
    return data;
}

function browserImages(url, mangaSlug, chapterSlug) {
    let browser = null;
    try {
        browser = Engine.newBrowser();
        try {
            browser.setUserAgent(ANDROID_UA);
        } catch (uaError) {
            try {
                browser.setUserAgent(UserAgent.android());
            } catch (error) {
            }
        }
        let doc = browser.launch(url, 60000);
        sleep(6000);

        let chapterJson = webViewFetchJson(browser, "/api/v1/manga/chapters/" + encodeURIComponent(mangaSlug));
        let rows = jsonRows(chapterJson);
        if (rows.length > 0) {
            let direct = imagesFromChapterRows(rows, mangaSlug, chapterSlug, url);
            if (direct.length > 0) return direct;
        }

        let data = [];
        let seen = {};
        for (let page = 1; page <= 100; page++) {
            let json = webViewFetchJson(browser, "/api/v1/manga/" + encodeURIComponent(mangaSlug) + "/" + encodeURIComponent(chapterSlug) + "/images?page=" + page);
            if (!json) break;
            let rows = jsonRows(json);
            let before = data.length;
            if (rows.length > 0) {
                addRows(data, seen, rows, url);
            } else {
                let links = [];
                collectImageLinks(json, links);
                addRows(data, seen, links, url);
            }
            if (!jsonHasMore(json, page, rows) || (rows.length === 0 && data.length === before)) break;
        }
        if (data.length > 0) return data;

        for (let i = 1; i <= 8; i++) {
            try {
                browser.callJs("(function(){var h=Math.max(document.body.scrollHeight,document.documentElement.scrollHeight);window.scrollTo(0,Math.floor(h*" + i + "/8));return h;})()", 1500);
            } catch (error) {
            }
            sleep(700);
        }
        try {
            doc = browser.html();
        } catch (htmlError) {
        }
        return collectFromDoc(doc, url);
    } catch (error) {
        return [];
    } finally {
        try {
            if (browser) browser.close();
        } catch (closeError) {
        }
    }
}

function execute(url) {
    url = normalizeUrl(url);
    let mangaSlug = slugFromUrl(url);
    let chapterSlug = chapterSlugFromUrl(url);
    if (!mangaSlug || !chapterSlug) return Response.error("URL chapter khong hop le.");

    let referer = chapterUrl(mangaSlug, chapterSlug);
    let data = chapterListImages(mangaSlug, chapterSlug, referer);
    if (data.length === 0) data = apiImages(mangaSlug, chapterSlug, referer);
    if (data.length === 0) data = browserImages(referer, mangaSlug, chapterSlug);
    if (data.length === 0) {
        let doc = getDoc(referer);
        data = collectFromDoc(doc, referer);
    }

    if (data.length === 0) return Response.error("Khong tim thay anh chapter.");
    return Response.success(data);
}
