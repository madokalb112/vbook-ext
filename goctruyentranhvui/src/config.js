let BASE_URL = "https://goctruyentranhvui30.com";
let TOKEN = "";
try {
    if (CONFIG_URL) BASE_URL = CONFIG_URL;
    if (CONFIG_TOKEN) TOKEN = CONFIG_TOKEN;
} catch (error) {}

const USER_AGENT = "Mozilla/5.0 (Linux; Android 13; SM-G981B) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/146.0.0.0 Mobile Safari/537.36 Edg/146.0.0.0";

function gttHeaders(extra) {
    return Object.assign({
        Referer: BASE_URL + '/danh-sach',
        'user-agent': USER_AGENT
    }, extra || {});
}

function absUrl(path) {
    if (!path) return path;
    return path.indexOf('http') === 0 ? path : BASE_URL + path;
}

function toBaseUrl(url) {
    return url.replace(/^(?:https?:\/\/)?(?:[^@\n]+@)?(?:www\.)?([^:\/\n?]+)/img, BASE_URL);
}

// Login session cookie from the WebView (set after user logs in via "Trang nguồn").
// Unlocks members-only chapters. Empty in test mode / when not logged in.
function sourceCookie() {
    let cookie = "";
    try { if (CONFIG_URL) cookie = localCookie.getCookie(CONFIG_URL); } catch (e) {}
    if (!cookie) try { cookie = localCookie.getCookie(BASE_URL); } catch (e) {}
    if (!cookie) try { cookie = localCookie.getCookie(BASE_URL + "/"); } catch (e) {}
    if (!cookie) try { cookie = localCookie.getCookie(); } catch (e) {}
    return cookie || "";
}

function comicList(query, page) {
    if (!page) page = '0';
    let response = fetch(BASE_URL + `/api/v2/search?p=${page}` + query, {
        method: "GET",
        headers: gttHeaders()
    });
    if (!response.ok) return null;

    let result = response.json().result;
    let items = result && result.data;
    if (!items) return null;

    let next = result.next === true ? (parseInt(page) + 1).toString() : null;
    let data = items.map(item => ({
        name: item.name,
        link: BASE_URL + '/truyen/' + item.nameEn,
        cover: absUrl(item.photo),
        description: 'Chap ' + item.chapterLatest[0] +
            (item.chapterLatestDate && item.chapterLatestDate[0] ? ' - ' + item.chapterLatestDate[0] : ''),
        host: BASE_URL
    }));
    return Response.success(data, next);
}
