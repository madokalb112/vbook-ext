let BASE_URL = "https://m.chuangshi.qq.com";
let API_BASE = BASE_URL + "/api";
let MOBILE_UA = "Mozilla/5.0 (Linux; Android 12; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0 Mobile Safari/537.36";

try {
    if (CONFIG_URL) {
        BASE_URL = ("" + CONFIG_URL).replace(/\/+$/, "");
        API_BASE = BASE_URL + "/api";
    }
} catch (error) {
}

function cleanText(text) {
    if (text === null || text === undefined) return "";
    return ("" + text).replace(/\s+/g, " ").trim();
}

function stripTrailingSlash(url) {
    if (!url) return "";
    return ("" + url).replace(/\/+$/, "");
}

function normalizeUrl(url) {
    if (!url) return "";
    url = ("" + url).replace(/&amp;/g, "&").trim();
    if (url.indexOf("//") === 0) return "https:" + url;
    if (url.indexOf("/") === 0) return stripTrailingSlash(BASE_URL) + url;
    if (!/^https?:\/\//i.test(url)) return stripTrailingSlash(BASE_URL) + "/" + url.replace(/^\/+/, "");
    return url.replace(/^https?:\/\/m\.chuangshi\.qq\.com/i, stripTrailingSlash(BASE_URL));
}

function normalizeImage(url) {
    if (!url) return "";
    url = ("" + url).replace(/\\\//g, "/").replace(/&amp;/g, "&").trim();
    if (url.indexOf("//") === 0) url = "https:" + url;
    if (url.indexOf("/") === 0) url = stripTrailingSlash(BASE_URL) + url;
    if (!/^https?:\/\//i.test(url)) url = stripTrailingSlash(BASE_URL) + "/" + url.replace(/^\/+/, "");
    return url.replace(/^http:\/\//i, "https://");
}

function escapeHtml(text) {
    if (text === null || text === undefined) return "";
    return ("" + text)
        .replace(/&/g, "&amp;")
        .replace(/</g, "&lt;")
        .replace(/>/g, "&gt;")
        .replace(/"/g, "&quot;");
}

function formatNumber(value) {
    let num = parseInt(value, 10);
    if (!num) return "";
    return ("" + num).replace(/\B(?=(\d{3})+(?!\d))/g, ",");
}

function formatWords(value) {
    let num = parseInt(value, 10);
    if (!num) return "";
    if (num >= 100000000) return (Math.round(num / 10000000) / 10) + "\u4ebf\u5b57";
    if (num >= 10000) return (Math.round(num / 1000) / 10) + "\u4e07\u5b57";
    return num + "\u5b57";
}

function pageNum(page, fallback) {
    let num = parseInt(page || fallback || "1", 10);
    return num > 0 ? num : 1;
}

function pathOf(url) {
    url = normalizeUrl(url);
    let match = /^https?:\/\/[^/]+(\/[^?#]*)?/i.exec(url);
    return match && match[1] ? match[1] : "/";
}

function queryParam(url, name) {
    let re = new RegExp("[?&]" + name + "=([^&#]+)", "i");
    let match = re.exec(url || "");
    if (!match) return "";
    try {
        return decodeURIComponent(match[1].replace(/\+/g, " "));
    } catch (error) {
        return match[1];
    }
}

function addQuery(url, params) {
    let parts = [];
    for (let key in params) {
        if (!params.hasOwnProperty(key)) continue;
        let value = params[key];
        if (value === undefined || value === null || value === "") continue;
        parts.push(encodeURIComponent(key) + "=" + encodeURIComponent(value));
    }
    if (parts.length === 0) return url;
    return url + (url.indexOf("?") >= 0 ? "&" : "?") + parts.join("&");
}

function requestJson(url, referer) {
    try {
        let response = fetch(url, {
            headers: {
                "Accept": "application/json, text/plain, */*",
                "Accept-Language": "zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7",
                "Referer": normalizeUrl(referer || BASE_URL + "/"),
                "User-Agent": MOBILE_UA,
                "X-Requested-With": "XMLHttpRequest"
            }
        });
        if (!response.ok) return null;
        return response.json();
    } catch (error) {
        return null;
    }
}

function apiJson(path, params, referer) {
    let url = path;
    if (!/^https?:\/\//i.test(url)) {
        url = stripTrailingSlash(API_BASE) + (path.indexOf("/") === 0 ? path : "/" + path);
    }
    return requestJson(addQuery(url, params || {}), referer);
}

function apiData(path, params, referer) {
    let json = apiJson(path, params, referer);
    return json && json.code === 0 ? json.data : null;
}

function requestDoc(url) {
    try {
        let response = fetch(normalizeUrl(url), {
            headers: {
                "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
                "Accept-Language": "zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7",
                "Referer": BASE_URL + "/",
                "User-Agent": MOBILE_UA
            }
        });
        if (response.ok) return response.html();
    } catch (error) {
    }
    return null;
}

function publicBookId(value) {
    let num = parseInt(value, 10);
    if (!num) return cleanText(value);
    if (num >= 1000000000) return "" + (num - 1000000000);
    return "" + num;
}

function bookIdFromUrl(url) {
    let path = pathOf(url);
    let match = /\/(?:detail|chapter)\/(\d+)/i.exec(path);
    if (match) return match[1];
    match = /\/read\/(\d+)\/\d+/i.exec(path);
    if (match) return match[1];
    let bid = queryParam(url, "bid");
    return bid ? bid : "";
}

function chapterIdFromUrl(url) {
    let path = pathOf(url);
    let match = /\/read\/\d+\/(\d+)/i.exec(path);
    if (match) return match[1];
    let cid = queryParam(url, "cid");
    return cid ? cid : "";
}

function detailUrl(bookId) {
    return BASE_URL + "/detail/" + publicBookId(bookId);
}

function chapterListUrl(bookId) {
    return BASE_URL + "/chapter/" + publicBookId(bookId);
}

function chapterUrl(bookId, chapterId) {
    return BASE_URL + "/read/" + publicBookId(bookId) + "/" + chapterId;
}

function nonRootCategories(book) {
    let result = [];
    let categories = book && book.categories ? book.categories : [];
    for (let i = 0; i < categories.length; i++) {
        let category = categories[i];
        if (!category) continue;
        let title = cleanText(category.shortName || category.name);
        if (!title || title === "\u5c0f\u8bf4") continue;
        result.push({
            id: category.id,
            title: title
        });
    }
    return result;
}

function categoryText(book) {
    let categories = nonRootCategories(book);
    let titles = [];
    for (let i = 0; i < categories.length; i++) {
        titles.push(categories[i].title);
        if (titles.length >= 2) break;
    }
    return titles.join(" / ");
}

function bookStatusText(book) {
    return book && book.finished ? "\u5b8c\u7ed3" : "\u8fde\u8f7d";
}

function tagNames(value) {
    let tags = [];
    cleanText(value).split(",").forEach(function(part) {
        part = cleanText(part);
        if (!part) return;
        let name = cleanText(part.split(":").pop());
        if (name) tags.push(name);
    });
    return tags;
}

function bookToItem(book) {
    if (!book) return null;
    let id = publicBookId(book.id || book.bid || book.bookId);
    let name = cleanText(book.title || book.bookName);
    if (!id || !name) return null;

    let parts = [];
    let author = cleanText(book.author);
    let category = categoryText(book);
    let words = formatWords(book.totalWords || (book.extra && (book.extra.allwords || book.extra.allWords)));

    if (author) parts.push(author);
    if (category) parts.push(category);
    parts.push(bookStatusText(book));
    if (words) parts.push(words);

    return {
        name: name,
        link: detailUrl(id),
        cover: normalizeImage(book.cover),
        description: parts.join(" - "),
        host: BASE_URL
    };
}

function pushBook(items, seen, book) {
    let item = bookToItem(book);
    if (!item || !item.link || seen[item.link]) return;
    seen[item.link] = true;
    items.push(item);
}

function flattenCategoryTab(data) {
    let items = [];
    let seen = {};
    let keys = ["goodNovels", "finishedNovels", "freeNovels", "updatedNovels", "publishNovels"];
    for (let i = 0; i < keys.length; i++) {
        let books = data && data[keys[i]] && data[keys[i]].books ? data[keys[i]].books : [];
        for (let j = 0; j < books.length; j++) {
            pushBook(items, seen, books[j]);
        }
    }
    return items;
}

function flattenCards(cards) {
    let items = [];
    let seen = {};
    cards = cards || [];
    for (let i = 0; i < cards.length; i++) {
        let books = cards[i] && cards[i].books ? cards[i].books : [];
        for (let j = 0; j < books.length; j++) {
            pushBook(items, seen, books[j]);
        }
    }
    return items;
}

function execute() {
    return Response.success({
        baseUrl: BASE_URL,
        apiBase: API_BASE,
        ok: true
    });
}
