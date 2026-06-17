load('config.js');

var B64 = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/';

function cleanEscapedUrl(url) {
    return (url || '')
        .replace(/\\u0026/g, '&')
        .replace(/\u0026/g, '&')
        .replace(/&amp;/g, '&')
        .replace(/\\\//g, '/')
        .replace(/\\+$/, '');
}

function extractImageKey(html) {
    html = (html || '').replace(/&quot;/g, '"');
    var direct = /imgKey\\?":\\?"([^"\\]+)/.exec(html) || /['"]imgKey['"]\s*:\s*['"]([^'"]+)/.exec(html);
    return direct ? direct[1] : '';
}

function extractImageUrls(html) {
    var q = String.fromCharCode(34);
    var apos = String.fromCharCode(39);
    var re = new RegExp('/api/img\\?d=[^' + q + apos + '<>\\s]+', 'g');
    var data = [];
    var seen = {};
    var match;
    while ((match = re.exec(html || '')) !== null) {
        var url = cleanEscapedUrl(match[0]);
        if (!url || seen[url]) continue;
        seen[url] = true;
        data.push(url);
    }
    return data;
}

var B64_REV = (function () {
    var rev = [];
    for (var i = 0; i < 128; i++) rev[i] = -1;
    for (var j = 0; j < B64.length; j++) rev[B64.charCodeAt(j)] = j;
    return rev;
})();

function keyBytes(key) {
    var kb = [];
    for (var i = 0; i < key.length; i += 2) kb.push(parseInt(key.substring(i, i + 2), 16));
    return kb;
}

function xorStringToBase64(s, kb) {
    var n = s.length;
    var klen = kb.length;
    var out = new Array(((n + 2) / 3 | 0) * 4);
    var o = 0;
    var ki = 0;
    for (var j = 0; j < n; j += 3) {
        var b1 = (s.charCodeAt(j) & 255) ^ kb[ki];
        ki = ki + 1 < klen ? ki + 1 : 0;
        var b2 = 0, b3 = 0;
        var has2 = j + 1 < n;
        var has3 = j + 2 < n;
        if (has2) { b2 = (s.charCodeAt(j + 1) & 255) ^ kb[ki]; ki = ki + 1 < klen ? ki + 1 : 0; }
        if (has3) { b3 = (s.charCodeAt(j + 2) & 255) ^ kb[ki]; ki = ki + 1 < klen ? ki + 1 : 0; }
        out[o++] = B64.charAt(b1 >> 2);
        out[o++] = B64.charAt(((b1 & 3) << 4) | (b2 >> 4));
        out[o++] = has2 ? B64.charAt(((b2 & 15) << 2) | (b3 >> 6)) : '=';
        out[o++] = has3 ? B64.charAt(b3 & 63) : '=';
    }
    return out.join('');
}

function xorArrayToBase64(a, kb) {
    var n = a.length;
    var klen = kb.length;
    var out = new Array(((n + 2) / 3 | 0) * 4);
    var o = 0;
    var ki = 0;
    for (var j = 0; j < n; j += 3) {
        var b1 = (a[j] & 255) ^ kb[ki];
        ki = ki + 1 < klen ? ki + 1 : 0;
        var b2 = 0, b3 = 0;
        var has2 = j + 1 < n;
        var has3 = j + 2 < n;
        if (has2) { b2 = (a[j + 1] & 255) ^ kb[ki]; ki = ki + 1 < klen ? ki + 1 : 0; }
        if (has3) { b3 = (a[j + 2] & 255) ^ kb[ki]; ki = ki + 1 < klen ? ki + 1 : 0; }
        out[o++] = B64.charAt(b1 >> 2);
        out[o++] = B64.charAt(((b1 & 3) << 4) | (b2 >> 4));
        out[o++] = has2 ? B64.charAt(((b2 & 15) << 2) | (b3 >> 6)) : '=';
        out[o++] = has3 ? B64.charAt(b3 & 63) : '=';
    }
    return out.join('');
}

function b64DecodeFast(input) {
    var n = input.length;
    var bytes = [];
    var buffer = 0, bits = 0;
    for (var i = 0; i < n; i++) {
        var c = input.charCodeAt(i);
        var v = c < 128 ? B64_REV[c] : -1;
        if (v < 0) continue;
        buffer = (buffer << 6) | v;
        bits += 6;
        if (bits >= 8) {
            bits -= 8;
            bytes.push((buffer >> bits) & 255);
        }
    }
    return bytes;
}

function imageBase64(apiUrl, key, referer) {
    try {
        var headers = {
            'Accept': 'image/avif,image/webp,image/apng,image/*,*/*;q=0.8',
            'Referer': referer
        };
        if (key) headers['X-Ik'] = key;
        var response = request(apiUrl, {headers: headers}, referer);
        if (!response || !response.ok) return '';

        var kb = keyBytes(key);

        var binStr = '';
        try {
            binStr = response.text('ISO-8859-1');
        } catch (latinError) {
            try { binStr = response.text('latin1'); } catch (altError) { binStr = ''; }
        }
        if (binStr) return xorStringToBase64(binStr, kb);

        if (typeof response.base64 === 'function') {
            var raw = response.base64();
            if (raw) {
                var bytes = b64DecodeFast(raw);
                if (bytes.length) return xorArrayToBase64(bytes, kb);
            }
        }
        return '';
    } catch (error) {
        return '';
    }
}

function fetchPageHtml(url) {
    var page = '';
    try {
        var response = request(url, {headers: {'Accept': 'text/html,*/*'}}, url);
        if (response && response.ok) page = response.text();
    } catch (error) {
    }
    if (page && page.indexOf('imgKey') >= 0) return page;

    try {
        var doc = browserDoc(url);
        if (doc && doc.html) {
            var html = doc.html();
            if (html && html.indexOf('imgKey') >= 0) return html;
            if (!page) page = html || '';
        }
    } catch (browserError) {
    }
    return page;
}

function execute(url) {
    url = normalizeUrl(url);
    var page = fetchPageHtml(url);

    var key = extractImageKey(page);
    var urls = extractImageUrls(page);
    if (!key || urls.length === 0) return Response.error('Khong tim thay du lieu anh chapter. Hay thu bam Trang nguon de vuot Cloudflare roi tai lai.');

    var data = [];
    for (var i = 0; i < urls.length; i++) {
        var img = imageBase64(urls[i], key, url);
        if (img) data.push({link: 'data:image/webp;base64,' + img});
    }

    if (data.length === 0) return Response.error('Khong tai duoc anh chapter.');
    return Response.success(data);
}
