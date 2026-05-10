load('gen.js');

function apiSearchItem(row) {
    if (!row || !row.slug) return null;
    let name = cleanText(row.name || row.title || "");
    if (!name) return null;
    let link = BASE_URL + "/chi-tiet/" + row.slug;
    let cover = normalizeImage(row.image_url || row.thumb || row.cover || "");
    return {
        name: name,
        link: link,
        cover: cover,
        description: "",
        host: BASE_URL
    };
}

function browserSearch(url) {
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
        let doc = browser.launch(normalizeUrl(url), 30000);
        for (let i = 0; i < 4 && isChallenge(doc); i++) {
            sleep(4000);
            doc = browser.html();
        }
        if (isChallenge(doc)) return null;
        sleep(5000);
        try {
            browser.callJs("window.scrollTo(0, 300)", 1000);
        } catch (error) {
        }
        sleep(2000);
        doc = browser.html();
        return doc;
    } catch (error) {
        return null;
    } finally {
        try {
            if (browser) browser.close();
        } catch (closeError) {
        }
    }
}

function execute(key, page) {
    let requestUrl;
    if (page && ("" + page).indexOf("http") === 0) {
        requestUrl = page;
    } else if (page && /^\d+$/.test("" + page)) {
        requestUrl = addQuery(BASE_URL + "/tim-kiem?q=" + encodeURIComponent(key || "") + "&sort=updated", "page", page);
    } else {
        requestUrl = BASE_URL + "/tim-kiem?q=" + encodeURIComponent(key || "") + "&sort=updated";
    }

    let doc = getDoc(requestUrl);
    let data = [];
    if (doc) {
        data = collectCards(doc);
        if (data.length === 0) data = collectByLinks(doc);
    }

    if (data.length === 0) {
        let bDoc = browserSearch(requestUrl);
        if (bDoc) {
            doc = bDoc;
            data = collectCards(doc);
            if (data.length === 0) data = collectByLinks(doc);
        }
    }

    if (data.length === 0 && key) {
        let response = requestJson(API_URL + "/manga/search?q=" + encodeURIComponent(key || ""));
        if (response.ok) {
            let rows = jsonRows(readJson(response));
            let keyLower = foldText(key || "");
            for (let i = 0; i < rows.length; i++) {
                let item = apiSearchItem(rows[i]);
                if (!item) continue;
                if (keyLower && foldText(item.name).indexOf(keyLower) < 0 && foldText(rows[i].slug || "").indexOf(keyLower) < 0) continue;
                data.push(item);
            }
        }
    }

    return Response.success(data, nextPage(doc, requestUrl));
}
