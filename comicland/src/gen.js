var BASE_URL = "https://comicland.org";
var API_URL = "https://api.comicland.org/api";
var DESKTOP_UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36";
try {
    if (CONFIG_URL) BASE_URL = ("" + CONFIG_URL).replace(/\/+$/, "");
} catch (error) {
}

function cleanText(text) {
    if (!text) return "";
    return ("" + text).replace(/\s+/g, " ").trim();
}

function normalizeUrl(url) {
    if (!url) return "";
    url = ("" + url).replace(/&amp;/g, "&").trim();
    if (url.indexOf("//") === 0) return "https:" + url;
    if (url.indexOf("/") === 0) return BASE_URL + url;
    if (!/^https?:\/\//i.test(url)) return BASE_URL + "/" + url.replace(/^\/+/, "");
    return url;
}

function normalizeImage(url) {
    if (!url) return "";
    url = ("" + url).replace(/&amp;/g, "&").trim();
    if (url.indexOf("data:image") === 0) return "";
    if (url.indexOf("//") === 0) return "https:" + url;
    if (url.indexOf("/") === 0) return BASE_URL + url;
    return url;
}

function jsString(value) {
    try {
        return JSON.stringify(value || "");
    } catch (error) {
        return "\"\"";
    }
}

function fetchJson(url) {
    try {
        var response = fetch(url, {
            headers: {
                "Accept": "application/json, text/plain, */*",
                "Origin": BASE_URL,
                "Referer": BASE_URL + "/",
                "User-Agent": DESKTOP_UA,
                "X-Requested-With": "XMLHttpRequest"
            }
        });
        if (response.ok) return response.json();
    } catch (error) {
    }
    return webViewFetchJson(url);
}

function webViewFetchJson(url) {
    var browser = null;
    try {
        browser = Engine.newBrowser();
        try {
            browser.setUserAgent(DESKTOP_UA);
        } catch (uaError) {
        }
        browser.launch(BASE_URL + "/", 30000);
        sleep(5000);
        var key = "__comicland" + (new Date().getTime()) + Math.floor(Math.random() * 1000);
        var script = "(function(){var k=" + jsString(key) + ";window[k]='';fetch(" + jsString(url) + ",{credentials:'include',headers:{'Accept':'application/json, text/plain, */*','X-Requested-With':'XMLHttpRequest'}}).then(function(r){return r.text().then(function(t){window[k]=JSON.stringify({status:r.status,text:t});});}).catch(function(e){window[k]=JSON.stringify({error:String(e)});});return 'ok';})()";
        try {
            browser.callJs(script, 3000);
        } catch (error) {
        }
        sleep(2500);
        var text = "";
        try {
            text = browser.callJs("(function(){return window[" + jsString(key) + "]||'';})()", 3000);
        } catch (error) {
        }
        var result = null;
        try {
            result = JSON.parse(text || "");
        } catch (error) {
        }
        if (result && result.status === 200 && result.text) {
            try {
                return JSON.parse(result.text);
            } catch (error) {
            }
        }
    } catch (error) {
    } finally {
        try {
            if (browser) browser.close();
        } catch (closeError) {
        }
    }
    return null;
}

function rowsFromJson(json) {
    if (!json) return [];
    if (json.data) {
        if (json.data.list && json.data.list.length !== undefined) return json.data.list;
        if (json.data.data && json.data.data.length !== undefined) return json.data.data;
        if (json.data.items && json.data.items.length !== undefined) return json.data.items;
        if (json.data.results && json.data.results.length !== undefined) return json.data.results;
        if (json.data.comics && json.data.comics.length !== undefined) return json.data.comics;
        if (json.data.length !== undefined) return json.data;
    }
    if (json.items && json.items.length !== undefined) return json.items;
    if (json.results && json.results.length !== undefined) return json.results;
    if (json.comics && json.comics.length !== undefined) return json.comics;
    if (json.length !== undefined) return json;
    return [];
}

function comicItem(item) {
    if (!item) return null;
    var name = cleanText(item.title || item.name || item.comic_name || "");
    var slug = cleanText(item.slug || item.comic_slug || item.alias || "");
    var link = normalizeUrl(item.url || item.link || item.permalink || (slug ? BASE_URL + "/comic/" + slug : ""));
    var cover = normalizeImage(item.cover_url || item.cover || item.thumbnail || item.thumb || item.image || item.avatar || item.poster || "");
    var latest = item.latest_chapter || item.last_chapter || item.chapter || null;
    var desc = latest ? (typeof latest === "string" ? latest : cleanText(latest.name || latest.title || latest.chapter_name || latest.number || "")) : "";
    if (!name || !link) return null;
    return {name: name, link: link, cover: cover, description: desc, host: BASE_URL};
}

function listUrl(page) {
    var p = parseInt(page || "1");
    if (!p || p < 1) p = 1;
    var offset = (p - 1) * 20;
    return API_URL + "/comics?offset=" + offset + "&limit=20&status=ongoing";
}

function execute(url, page) {
    if (!page) page = "1";
    var json = fetchJson(listUrl(page));
    if (!json) return Response.error("Cannot fetch Comicland list.");
    var rows = rowsFromJson(json);
    var data = [];
    for (var i = 0; i < rows.length; i++) {
        var item = comicItem(rows[i]);
        if (item) data.push(item);
    }
    return Response.success(data, data.length > 0 ? "" + (parseInt(page) + 1) : "");
}
