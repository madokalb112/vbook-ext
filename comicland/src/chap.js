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

function chapterIndexFromUrl(url) {
    var match = /\/comic\/[^/?#]+\/chapter\/([^/?#]+)/i.exec(url || "");
    if (match) return match[1];
    match = /\/comic\/[^/?#]+\/([^/?#]+)/i.exec(url || "");
    return match ? match[1] : "";
}

function chapterJson(slug, index) {
    var urls = [
        API_URL + "/chapter/pages_by_index?slug=" + encodeURIComponent(slug) + "&index=" + encodeURIComponent(index),
        API_URL + "/comic/chapter?slug=" + encodeURIComponent(slug) + "&index=" + encodeURIComponent(index),
        API_URL + "/comic/chapter?id=" + encodeURIComponent(index)
    ];
    for (var i = 0; i < urls.length; i++) {
        var json = fetchJson(urls[i]);
        if (json && (json.data || json.images || json.pages || json.chapter_image)) return json.data || json;
    }
    return null;
}

function validImage(url) {
    url = normalizeImage(url);
    if (!url) return false;
    return /\.(?:jpg|jpeg|png|webp|gif)(?:[?#].*)?$/i.test(url) ||
        url.indexOf("/uploads/") >= 0 ||
        url.indexOf("/storage/") >= 0;
}

function imageHeaders(referer) {
    return {"Referer": referer || BASE_URL + "/", "User-Agent": DESKTOP_UA, "Accept": "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8"};
}

function addImage(data, seen, link, referer) {
    link = normalizeImage(link);
    if (!validImage(link) || seen[link]) return;
    seen[link] = true;
    var headers = imageHeaders(referer);
    data.push({link: link, headers: headers, header: headers});
}

function collectImageLinks(value, out, base) {
    if (!value) return;
    if (typeof value === "string") {
        if (validImage(value)) out.push(value);
        return;
    }
    if (value.length !== undefined) {
        for (var i = 0; i < value.length; i++) collectImageLinks(value[i], out, base);
        return;
    }
    var domain = cleanText(value.domain_cdn || value.cdn || value.cdn_url || base || "");
    var path = cleanText(value.chapter_path || value.path || "");
    var file = cleanText(value.image_file || value.file || value.filename || "");
    if (domain && path && file) out.push(domain.replace(/\/+$/, "") + "/" + path.replace(/^\/+|\/+$/g, "") + "/" + file.replace(/^\/+/, ""));

    var keys = ["url", "link", "href", "image", "image_url", "src", "file_url", "full_url", "cdn_url"];
    for (var k = 0; k < keys.length; k++) {
        if (value[keys[k]]) collectImageLinks(value[keys[k]], out, domain);
    }
    var containers = ["data", "images", "pages", "chapter_image", "items", "results", "chapter"];
    for (var c = 0; c < containers.length; c++) {
        if (value[containers[c]]) collectImageLinks(value[containers[c]], out, domain);
    }
}

function execute(url) {
    var slug = slugFromUrl(url);
    var index = chapterIndexFromUrl(url);
    if (!slug || !index) return Response.error("Invalid Comicland chapter URL.");

    var json = chapterJson(slug, index);
    if (!json) return Response.error("Cannot fetch chapter details.");

    var links = [];
    collectImageLinks(json, links, json.domain_cdn || "");

    var data = [];
    var seen = {};
    for (var i = 0; i < links.length; i++) addImage(data, seen, links[i], url);

    if (data.length === 0) return Response.error("No images found for this chapter.");
    return Response.success(data);
}
