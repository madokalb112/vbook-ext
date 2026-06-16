load('config.js');

// Calls /api/chapter/loadAll within the current fetch cookie jar.
// Locked chapters (codeState "01") need a logged-in Authorization token
// AND the X-TOKEN session cookie together; free chapters need neither.
function loadChapter(comicId, chapNumber, refererUrl, cookie, token) {
    let headers = {
        Referer: refererUrl,
        'Content-Type': 'application/x-www-form-urlencoded; charset=UTF-8',
        'X-Requested-With': 'XMLHttpRequest'
    };
    if (cookie) headers.Cookie = cookie;
    if (token) headers.Authorization = token;

    return fetch(BASE_URL + '/api/chapter/loadAll', {
        method: "POST",
        headers: gttHeaders(headers),
        body: 'comicId=' + comicId + '&chapterNumber=' + chapNumber
    }).json();
}

// Last-resort token source: read localStorage["Authorization"] from the
// WebView via a headless browser. Only useful if the user logged in inside
// the app's WebView (e.g. Facebook). Slow, so only used for locked chapters.
function browserToken(url) {
    if (typeof Engine === 'undefined' || !Engine.newBrowser) return "";
    let browser = null;
    try {
        browser = Engine.newBrowser();
        browser.launch(url, 10000);
        browser.callJs(
            "var p=document.createElement('pre');p.id='__tok';" +
            "p.textContent=localStorage.getItem('Authorization')||'';" +
            "document.body.prepend(p);", 1500);
        let doc = browser.html();
        let tok = doc ? doc.select('#__tok').text() : "";
        return tok || "";
    } catch (e) {
        return "";
    } finally {
        try { if (browser) browser.close(); } catch (e) {}
    }
}

function imagesFrom(result) {
    return result && result.data && result.data.length > 0 ? result.data : null;
}

function execute(url) {
    url = toBaseUrl(url);
    let cm = url.match(/chuong-(\d+)/);
    if (!cm) return Response.error("Link chương không hợp lệ");
    let chapNumber = cm[1];

    // Warm GET: mints the X-TOKEN session cookie into vbook's fetch jar
    // and carries the comicId in the page source. No auth token needed here.
    let cookie = sourceCookie();
    let warmHeaders = { Referer: BASE_URL };
    if (cookie) warmHeaders.Cookie = cookie;
    let page = fetch(url, { method: "GET", headers: gttHeaders(warmHeaders) }).text();

    let m = page.match(/id: `(\d+)`/) || page.match(/id: "(\d+)"/) || page.match(/comicId["'\s:=]+(\d{6,})/);
    if (!m) return Response.error("Không tìm thấy mã truyện");
    let comicId = m[1];

    // First attempt: session cookie only. Free chapters return codeState "00".
    let result = loadChapter(comicId, chapNumber, url, cookie, "").result;
    let imgs = imagesFrom(result);

    // Locked chapter (codeState "01") => needs a logged-in token.
    // Priority: app/WebView login session FIRST, then CONFIG_TOKEN fallback.
    // So once you can log in inside the app, you can leave the Token field empty
    // and there is never a conflict with a stale token pasted in the config.
    if (!imgs && result && result.codeState && result.codeState !== "00") {
        let token = browserToken(url) || TOKEN || "";
        if (token) {
            result = loadChapter(comicId, chapNumber, url, sourceCookie(), token).result;
            imgs = imagesFrom(result);
        }
    }

    if (!imgs && result && result.codeState && result.codeState !== "00") {
        return Response.error("Chương bị khóa, cần tài khoản đã đăng nhập. Hãy đăng nhập tại Trang nguồn, hoặc dán token vào ô Token trong cấu hình nguồn.");
    }

    // Server-rendered fallback (free chapters whose data came inline).
    if (!imgs) {
        let raw = page.match(/chapterJson: `(.*?)`/);
        if (raw) {
            try {
                let parsed = JSON.parse(raw[1]);
                let fb = parsed && parsed.body && parsed.body.result && parsed.body.result.data;
                if (fb && fb.length > 0) imgs = fb;
            } catch (e) {}
        }
    }

    if (imgs) {
        return Response.success(imgs.map(img => ({
            link: absUrl(img),
            referer: BASE_URL
        })));
    }
    return Response.error("Không tải được ảnh chương");
}
