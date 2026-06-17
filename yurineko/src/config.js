let BASE_URL = 'https://yurinekoz.com';
let CDN_URL = 'https://cdn.yurinekoz.com';

try {
    if (CONFIG_URL) BASE_URL = stripTrailingSlash(sourceBaseUrl(CONFIG_URL));
} catch (error) {
}

let USER_AGENT = 'Mozilla/5.0 (Linux; Android 13; SM-G981B) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/146.0.0.0 Mobile Safari/537.36 Edg/146.0.0.0';
let DESKTOP_UA = USER_AGENT;
let ANDROID_UA = USER_AGENT;
let SOURCE_HOST_RE = new RegExp('^https?://(?:www\\.)?yurineko(?:z)?\\.(?:com|org)', 'i');

function stripTrailingSlash(url) {
    return ('' + (url || '')).replace(/\/+$/, '');
}

function sourceBaseUrl(url) {
    let match = /^(https?:\/\/[^/?#]+)/i.exec(url || '');
    return match ? match[1] : BASE_URL;
}

function cleanText(text) {
    if (!text) return '';
    return ('' + text).replace(/\s+/g, ' ').trim();
}

function decodeHtml(text) {
    if (!text) return '';
    let amp = String.fromCharCode(38);
    return ('' + text)
        .replace(new RegExp(amp + 'amp;', 'g'), amp)
        .replace(new RegExp(amp + 'quot;', 'g'), String.fromCharCode(34))
        .replace(new RegExp(amp + '#039;', 'g'), String.fromCharCode(39))
        .replace(new RegExp(amp + 'apos;', 'g'), String.fromCharCode(39))
        .replace(new RegExp(amp + 'nbsp;', 'g'), ' ');
}

function absoluteUrl(url) {
    if (!url) return '';
    url = decodeHtml(url).trim();
    if (/^(data|javascript|mailto|tel):/i.test(url)) return url;
    if (url.indexOf('//') === 0) return 'https:' + url;
    if (url.indexOf('/') === 0) return stripTrailingSlash(BASE_URL) + url;
    if (!/^https?:\/\//i.test(url)) return stripTrailingSlash(BASE_URL) + '/' + url.replace(/^\/+/, '');
    return url;
}

function normalizeUrl(url) {
    url = absoluteUrl(url);
    return url.replace(SOURCE_HOST_RE, stripTrailingSlash(BASE_URL));
}

function normalizeImage(url) {
    if (!url) return '';
    url = decodeHtml(url).trim();
    if (url.indexOf('data:image') === 0 || url.indexOf('blob:') === 0) return url;
    if (url.indexOf('/api/') === 0) return stripTrailingSlash(BASE_URL) + url;
    if (url.indexOf('//') === 0) return 'https:' + url;
    if (/^https?:\/\//i.test(url)) return url.replace(SOURCE_HOST_RE, stripTrailingSlash(BASE_URL));
    if (url.indexOf('/') === 0) return stripTrailingSlash(BASE_URL) + url;
    return stripTrailingSlash(CDN_URL) + '/' + url.replace(/^\/+/, '');
}

function requestOptions(options, referer) {
    options = options || {};
    let headers = options.headers || {};
    headers['Accept'] = headers['Accept'] || 'text/html,application/json,*/*';
    headers['Accept-Language'] = headers['Accept-Language'] || 'vi-VN,vi;q=0.9,en;q=0.8';
    headers['Referer'] = headers['Referer'] || normalizeUrl(referer || BASE_URL + '/');
    if (!headers['user-agent'] && !headers['User-Agent']) headers['user-agent'] = USER_AGENT;
    options.headers = headers;
    return options;
}

function request(url, options, referer) {
    return fetch(normalizeUrl(url), requestOptions(options, referer));
}

function readJson(response) {
    try {
        return response.json();
    } catch (error) {
        try { return JSON.parse(response.text() || ''); } catch (jsonError) { return null; }
    }
}

function requestJson(url, referer) {
    try {
        let response = request(url, {headers: {'Accept': 'application/json, text/plain, */*'}}, referer);
        if (response.ok) return readJson(response);
    } catch (error) {
    }
    return null;
}

function isChallenge(doc) {
    if (!doc) return true;
    let html = doc.html ? doc.html() : '';
    let title = cleanText(doc.select('title').text());
    return title.indexOf('Just a moment') >= 0 ||
        html.indexOf('cf-chl') >= 0 ||
        html.indexOf('__cf_chl_') >= 0 ||
        html.indexOf('Enable JavaScript and cookies') >= 0;
}

function getDoc(url, referer) {
    try {
        let response = request(url, null, referer);
        if (response.ok) {
            let doc = response.html();
            if (!isChallenge(doc)) return doc;
        }
    } catch (error) {
    }
    return browserDoc(url);
}

function browserDoc(url) {
    let browser = null;
    try {
        browser = Engine.newBrowser();
        try { browser.setUserAgent(DESKTOP_UA); } catch (uaError) {
            try { browser.setUserAgent(ANDROID_UA); } catch (error) {}
        }
        let doc = browser.launch(normalizeUrl(url), 60000);
        sleep(6000);
        try { doc = browser.html(); } catch (htmlError) {}
        return isChallenge(doc) ? null : doc;
    } catch (error) {
        return null;
    } finally {
        try { if (browser) browser.close(); } catch (closeError) {}
    }
}

function addQuery(url, key, value) {
    url = normalizeUrl(url);
    let parts = url.split('?');
    let base = parts[0];
    let query = parts.length > 1 && parts[1] ? parts[1].split('&') : [];
    let found = false;
    for (let i = 0; i < query.length; i++) {
        if (query[i].split('=')[0] === key) {
            query[i] = key + '=' + encodeURIComponent(value);
            found = true;
        }
    }
    if (!found) query.push(key + '=' + encodeURIComponent(value));
    return base + '?' + query.join('&');
}

function jsonRows(json) {
    if (!json) return [];
    if (json.data && json.data.length !== undefined) return json.data;
    if (json.items && json.items.length !== undefined) return json.items;
    if (json.results && json.results.length !== undefined) return json.results;
    if (json.length !== undefined) return json;
    return [];
}

function mangaSlugFromUrl(url) {
    let match = /\/manga\/([^/?#]+)/i.exec(normalizeUrl(url) || '');
    return match ? match[1] : '';
}

function chapterSlugFromUrl(url) {
    let match = /\/manga\/[^/?#]+\/([^/?#]+)/i.exec(normalizeUrl(url) || '');
    return match ? match[1] : '';
}

function mangaUrl(manga) {
    return BASE_URL + '/manga/' + encodeURIComponent(manga.slug || manga.id || '');
}

function chapterUrl(mangaSlug, chapter) {
    let slug = typeof chapter === 'string' ? chapter : (chapter.slug || chapter.id || '');
    return BASE_URL + '/manga/' + mangaSlug + '/' + slug;
}

function chapterName(chapter) {
    let number = cleanText(chapter.chapterNumber || chapter.number || chapter.name || '');
    let title = cleanText(chapter.title || '');
    let name = number ? 'Chuong ' + number : 'Chuong';
    if (title) name += ': ' + title;
    return name;
}

function apiMangaListUrl() {
    return BASE_URL + '/api/v1/mangas?limit=24&sort=latest';
}

function execute() {
    return Response.success({baseUrl: BASE_URL, ok: true});
}
