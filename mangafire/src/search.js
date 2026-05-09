load('gen.js');

function searchFromBrowser(key) {
    let browser = null;
    try {
        browser = Engine.newBrowser();
        try { browser.setUserAgent(DESKTOP_UA); } catch (error) {}
        browser.launch(HOME_URL, 30000);
        let safeKey = (key || "").replace(/\\/g, "\\\\").replace(/'/g, "\\'");
        let script = "var i=document.querySelector('input[name=keyword]');if(i){i.value='" + safeKey + "';i.dispatchEvent(new Event('input',{bubbles:true}));i.dispatchEvent(new KeyboardEvent('keyup',{bubbles:true,key:'a'}));}";
        try { browser.callJs(script, 3000); } catch (error) {}
        try { browser.waitUrl(["/ajax/manga/search"], 8000); } catch (error) {}
        let urls = normalizeUrlList(browser.urls());
        for (let i = urls.length - 1; i >= 0; i--) {
            let u = decodeHtml(urls[i]);
            if (u.indexOf("/ajax/manga/search") >= 0 && u.indexOf("vrf=") >= 0) return normalizeUrl(u);
        }
    } catch (error) {
    }
    try { if (browser) browser.close(); } catch (error) {}
    return "";
}

function itemsFromSearchHtml(html) {
    let doc = htmlFragment(html);
    let data = collectCards(doc);
    if (data.length > 0) return data;
    let seen = {};
    return collectLinks(doc, seen);
}

function execute(key, page) {
    if (page && page !== "1") return Response.success([], "");
    let ajax = searchFromBrowser(key || "");
    if (ajax) {
        let response = requestJson(ajax, HOME_URL);
        if (response.ok) {
            let json = response.json();
            if (json && json.result) return Response.success(itemsFromSearchHtml(json.result), "");
        }
    }
    let requestUrl = BASE_URL + "/filter?keyword=" + encodeURIComponent(key || "") + "&language[]=en&page=1";
    let doc = getDoc(requestUrl);
    if (doc) return Response.success(collectCards(doc), nextPage(doc, requestUrl));
    return Response.success([], "");
}
