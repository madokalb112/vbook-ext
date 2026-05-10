var BASE_URL = "https://comicland.org";
var API_URL = "https://api.comicland.org/api";
var DESKTOP_UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36";
try {
    if (CONFIG_URL) BASE_URL = ("" + CONFIG_URL).replace(/\/+$/, "");
} catch (error) {
}

function cleanText(text) {
    if (!text) return "";
    return ("" + text).replace(/<[^>]+>/g, " ").replace(/\s+/g, " ").trim();
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

function fetchJson(url) {
    try {
        var response = fetch(url, {headers: {"Accept": "application/json, text/plain, */*", "Origin": BASE_URL, "Referer": BASE_URL + "/", "User-Agent": DESKTOP_UA, "X-Requested-With": "XMLHttpRequest"}});
        if (response.ok) return response.json();
    } catch (error) {
    }
    return webViewFetchJson(url);
}

function slugFromUrl(url) {
    var match = /\/comic\/([^/?#]+)/i.exec(url || "");
    return match ? match[1] : "";
}

function detailJson(slug) {
    var urls = [
        API_URL + "/comic/detail?slug=" + encodeURIComponent(slug),
        API_URL + "/comic/" + encodeURIComponent(slug),
        API_URL + "/comics/" + encodeURIComponent(slug)
    ];
    for (var i = 0; i < urls.length; i++) {
        var json = fetchJson(urls[i]);
        if (json && (json.data || json.title || json.name || json.chapters)) return json.data || json;
    }
    return null;
}

function joinNames(items) {
    if (!items) return "";
    if (typeof items === "string") return items;
    if (items.length === undefined) return cleanText(items.name || items.title || "");
    var data = [];
    for (var i = 0; i < items.length; i++) {
        var item = items[i];
        var name = typeof item === "string" ? item : cleanText(item.name || item.title || "");
        if (name) data.push(name);
    }
    return data.join(", ");
}

function genreList(items) {
    var data = [];
    if (!items || items.length === undefined) return data;
    for (var i = 0; i < items.length; i++) {
        var item = items[i];
        var title = typeof item === "string" ? item : cleanText(item.name || item.title || "");
        var slug = typeof item === "string" ? "" : cleanText(item.slug || "");
        if (title) data.push({title: title, input: slug ? BASE_URL + "/category/" + slug : title, script: "gen.js"});
    }
    return data;
}

function execute(url) {
    var slug = slugFromUrl(url);
    if (!slug) return Response.error("Invalid Comicland URL.");
    var data = detailJson(slug);
    if (!data) return Response.error("Cannot fetch comic detail.");

    var status = cleanText(data.status || data.state || "");
    return Response.success({
        name: cleanText(data.title || data.name || data.comic_name || ""),
        cover: normalizeImage(data.cover_url || data.cover || data.thumbnail || data.thumb || data.image || data.avatar || data.poster || ""),
        author: joinNames(data.author || data.authors),
        description: cleanText(data.description || data.summary || data.content || ""),
        detail: status ? "Tinh trang: " + status : "",
        host: BASE_URL,
        ongoing: status.toLowerCase().indexOf("completed") < 0 && status.toLowerCase().indexOf("hoan thanh") < 0,
        genres: genreList(data.categories || data.genres || data.tags)
    });
}
