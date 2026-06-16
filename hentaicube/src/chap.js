load('config.js');

function validImage(u) {
    u = absUrl(u);
    if (!u) return false;
    if (u.indexOf("data:") === 0) return false;
    if (!/\.(?:webp|jpe?g|png|gif)(?:[?#].*)?$/i.test(u)) return false;
    var low = u.toLowerCase();
    if (low.indexOf("/logo") >= 0 || low.indexOf("favicon") >= 0) return false;
    if (low.indexOf("loading") >= 0 || low.indexOf("placeholder") >= 0) return false;
    if (low.indexOf("/credit/") >= 0) return false;
    return true;
}

function pushImg(data, seen, link, referer) {
    link = absUrl(link);
    if (!validImage(link) || seen[link]) return;
    seen[link] = true;
    var h = imageHeaders(referer);
    data.push({link: link, headers: h, header: h});
}

function fromJson(data, seen, json, referer) {
    if (!json) return;
    var imgs = json.images || json.data || json;
    if (typeof imgs === "string") { pushImg(data, seen, imgs, referer); return; }
    if (imgs && imgs.length !== undefined) {
        for (var i = 0; i < imgs.length; i++) fromJson(data, seen, imgs[i], referer);
        return;
    }
    var keys = ["url", "link", "src", "image", "file"];
    for (var k = 0; k < keys.length; k++) {
        try { if (imgs && imgs[keys[k]]) fromJson(data, seen, imgs[keys[k]], referer); } catch (e) {}
    }
}

function fromDoc(doc, referer) {
    var data = [];
    var seen = {};
    if (!doc) return data;
    var sels = [".reading-content img", ".entry-content img", ".chapter-content img", ".page-break img"];
    for (var s = 0; s < sels.length; s++) {
        var nodes = doc.select(sels[s]);
        for (var i = 0; i < nodes.size(); i++) pushImg(data, seen, imgSrc(nodes.get(i)), referer);
        if (data.length > 0) break;
    }
    return data;
}

// API needs Cloudflare cookie -> run inside browser via same-origin fetch
function browserImages(url) {
    var b = null;
    try {
        b = Engine.newBrowser();
        try { b.setUserAgent(ANDROID_UA); } catch (e) {}
        var doc = b.launch(absUrl(url), 60000);
        var waited = 0;
        while (waited < 20000 && isChallenge(doc)) { sleep(2500); waited += 2500; doc = b.html(); }
        if (isChallenge(doc)) return [];

        var key = "__hc" + (new Date().getTime());
        var js = "(function(){var k='" + key + "';window[k]='';" +
            "fetch('/wp-json/manga-reader/v1/images',{credentials:'include',headers:{'Accept':'application/json'}})" +
            ".then(function(r){return r.text();}).then(function(t){window[k]=t;})" +
            ".catch(function(e){window[k]='ERR';});return 'ok';})()";
        try { b.callJs(js, 3000); } catch (e2) {}
        sleep(3500);
        var text = "";
        try { text = b.callJs("(function(){return window['" + key + "']||'';})()", 3000); } catch (e3) {}

        var data = [];
        var seen = {};
        if (text && text !== "ERR") {
            try { fromJson(data, seen, JSON.parse(text), url); } catch (e4) {}
            if (data.length > 0) return data;
        }

        // fallback: scroll + scrape DOM
        try {
            for (var i = 1; i <= 6; i++) { b.callJs("window.scrollTo(0, document.body.scrollHeight*" + i + "/6);", 1000); sleep(500); }
            doc = b.html();
        } catch (e5) {}
        return fromDoc(doc, url);
    } catch (e) {
        return [];
    } finally {
        try { if (b) b.close(); } catch (ec) {}
    }
}

function execute(url) {
    url = absUrl(url);
    if (!isChapterUrl(url)) return Response.error("URL chương không hợp lệ.");
    var data = browserImages(url);
    if (data.length === 0) return Response.error("Không tìm thấy ảnh chương.");
    return Response.success(data);
}
