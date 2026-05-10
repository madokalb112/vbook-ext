var BASE_URL = "https://comicland.org";
var API_URL = "https://api.comicland.org/api";

try {
    if (CONFIG_URL) {
        BASE_URL = ("" + CONFIG_URL).replace(/\/+$/, "");
    }
} catch (error) {
}

// user_agent.txt is a Googlebot UA; Comicland Cloudflare blocks fake Googlebot from non-Google IPs.
var DESKTOP_UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36";
var MOBILE_UA = DESKTOP_UA;

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

function isChallengeText(text) {
    if (!text) return true;
    return text.indexOf("Just a moment") >= 0 ||
        text.indexOf("cf-chl") >= 0 ||
        text.indexOf("__cf_chl_") >= 0 ||
        text.indexOf("Enable JavaScript and cookies") >= 0 ||
        text.indexOf("Access denied") >= 0 ||
        text.indexOf("Attention Required") >= 0;
}

function webViewFetchJson(url) {
    var browser = null;
    try {
        browser = Engine.newBrowser();
        try {
            browser.setUserAgent(MOBILE_UA);
        } catch (uaError) {
        }

        var doc = browser.launch(BASE_URL + "/", 30000);
        for (var i = 0; i < 4 && isChallengeText(doc ? doc.html() : ""); i++) {
            sleep(4000);
            doc = browser.html();
        }

        var key = "__vbookComicland" + (new Date().getTime()) + Math.floor(Math.random() * 1000);
        var script = "(function(){var k=" + jsString(key) + ";window[k]='';fetch(" + jsString(url) + ",{credentials:'include',headers:{'Accept':'application/json, text/plain, */*','X-Requested-With':'XMLHttpRequest'}}).then(function(r){return r.text().then(function(t){window[k]=JSON.stringify({status:r.status,text:t});});}).catch(function(e){window[k]=JSON.stringify({error:String(e)});});return 'ok';})()";

        try {
            browser.callJs(script, 3000);
        } catch (callError) {
        }
        sleep(2500);

        var text = "";
        for (var j = 0; j < 3; j++) {
            try {
                text = browser.callJs("(function(){return window[" + jsString(key) + "]||'';})()", 2000);
            } catch (readError) {
            }
            if (text) break;
            sleep(1000);
        }

        var result = null;
        try {
            result = JSON.parse(text || "");
        } catch (parseError) {
        }

        if (result && result.status === 200 && result.text) {
            try {
                return JSON.parse(result.text);
            } catch (jsonError) {
            }
        }

        try {
            doc = browser.launch(url, 30000);
            sleep(1500);
            var body = cleanText(doc.select("body").text());
            if (body && !isChallengeText(body)) return JSON.parse(body);
        } catch (launchApiError) {
        }
    } catch (error) {
        return null;
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

function comicSlug(item) {
    if (!item) return "";
    var url = item.url || item.link || item.permalink || "";
    var match = /\/comic\/([^/?#]+)/i.exec(url);
    return cleanText(item.slug || item.comic_slug || item.alias || (match ? match[1] : ""));
}

function comicItem(item) {
    if (!item) return null;
    var name = cleanText(item.title || item.name || item.comic_name || "");
    var slug = comicSlug(item);
    var link = normalizeUrl(item.url || item.link || item.permalink || (slug ? BASE_URL + "/comic/" + slug : ""));
    var cover = normalizeImage(item.cover_url || item.cover || item.thumbnail || item.thumb || item.image || item.avatar || item.poster || "");
    var latest = item.latest_chapter || item.last_chapter || item.chapter || null;
    var desc = "";
    if (latest) desc = typeof latest === "string" ? latest : cleanText(latest.name || latest.title || latest.chapter_name || latest.number || "");
    if (!name || !link) return null;
    return {name: name, link: link, cover: cover, description: desc, host: BASE_URL};
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

function imageHeaders(referer) {
    return {
        "Referer": referer || BASE_URL + "/",
        "User-Agent": DESKTOP_UA,
        "Accept": "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8"
    };
}

function execute() {
    return Response.success({baseUrl: BASE_URL, apiUrl: API_URL, ok: true});
}
