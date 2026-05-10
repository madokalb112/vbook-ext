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

function chapterRows(data) {
    if (!data) return [];
    if (data.chapters && data.chapters.length !== undefined) return data.chapters;
    if (data.chapter && data.chapter.length !== undefined) return data.chapter;
    if (data.chapter_list && data.chapter_list.length !== undefined) return data.chapter_list;
    if (data.list_chapter && data.list_chapter.length !== undefined) return data.list_chapter;
    return [];
}

function chapterIndex(chap) {
    var value = cleanText(chap.chapter_index || chap.index || chap.number || chap.chapter_number || chap.id || chap.slug || "");
    var match = /(\d+(?:\.\d+)?)/.exec(value);
    return match ? parseFloat(match[1]) : 0;
}

function execute(url) {
    var slug = slugFromUrl(url);
    if (!slug) return Response.error("Invalid Comicland URL.");
    var data = detailJson(slug);
    if (!data) return Response.error("Cannot fetch chapter list.");

    var rows = chapterRows(data).slice();
    rows.sort(function(a, b) {
        return chapterIndex(b) - chapterIndex(a);
    });
    var list = [];
    for (var i = 0; i < rows.length; i++) {
        var chap = rows[i];
        var index = cleanText(chap.chapter_index || chap.index || chap.number || chap.chapter_number || chap.id || chap.slug || "");
        var name = cleanText(chap.name || chap.title || chap.chapter_name || ("Chapter " + index));
        var link = normalizeUrl(chap.url || chap.link || (index ? BASE_URL + "/comic/" + slug + "/chapter/" + index : ""));
        if (index || link) list.push({name: name || index, url: link, link: link, input: link, host: BASE_URL});
    }
    return Response.success(list);
}
