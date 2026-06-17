load('config.js');

var B64 = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/';

function now() {
    try { return Date.now(); } catch (e) { return new Date().getTime(); }
}

function extractKey(html) {
    html = (html || '').replace(/&quot;/g, '"');
    var d = /imgKey\\?":\\?"([^"\\]+)/.exec(html) || /['"]imgKey['"]\s*:\s*['"]([^'"]+)/.exec(html);
    return d ? d[1] : '';
}

function firstUrl(html) {
    var q = String.fromCharCode(34), apos = String.fromCharCode(39);
    var re = new RegExp('/api/img\\?d=[^' + q + apos + '<>\\s]+', 'g');
    var m = re.exec(html || '');
    return m ? m[0].replace(/\\u0026/g, '&').replace(/&amp;/g, '&').replace(/\\\//g, '/').replace(/\\+$/, '') : '';
}

function keyBytes(key) {
    var kb = [];
    for (var i = 0; i < key.length; i += 2) kb.push(parseInt(key.substring(i, i + 2), 16));
    return kb;
}

function jsDecode(s, kb) {
    var n = s.length, klen = kb.length, out = new Array(((n + 2) / 3 | 0) * 4), o = 0, ki = 0;
    for (var j = 0; j < n; j += 3) {
        var b1 = (s.charCodeAt(j) & 255) ^ kb[ki];
        ki = ki + 1 < klen ? ki + 1 : 0;
        var b2 = 0, b3 = 0, has2 = j + 1 < n, has3 = j + 2 < n;
        if (has2) { b2 = (s.charCodeAt(j + 1) & 255) ^ kb[ki]; ki = ki + 1 < klen ? ki + 1 : 0; }
        if (has3) { b3 = (s.charCodeAt(j + 2) & 255) ^ kb[ki]; ki = ki + 1 < klen ? ki + 1 : 0; }
        out[o++] = B64.charAt(b1 >> 2);
        out[o++] = B64.charAt(((b1 & 3) << 4) | (b2 >> 4));
        out[o++] = has2 ? B64.charAt(((b2 & 15) << 2) | (b3 >> 6)) : '=';
        out[o++] = has3 ? B64.charAt(b3 & 63) : '=';
    }
    return out.join('');
}

function javaDecode(bin, kb) {
    var jstr = new java.lang.String(bin);
    var bytes = jstr.getBytes('ISO-8859-1');
    var klen = kb.length;
    for (var i = 0; i < bytes.length; i++) bytes[i] = bytes[i] ^ kb[i % klen];
    return String(java.util.Base64.getEncoder().encodeToString(bytes));
}

function execute(url) {
    var out = {};
    url = normalizeUrl(url);

    var page = '';
    try {
        var r1 = request(url, {headers: {'Accept': 'text/html,*/*'}}, url);
        if (r1 && r1.ok) page = r1.text();
    } catch (e1) {}
    var key = extractKey(page);
    var u = firstUrl(page);
    out.keyLen = key.length;
    if (!key || !u) { out.stop = 'no key/url'; return Response.success(out); }

    var kb = keyBytes(key);

    var a = now();
    var resp = request(u, {headers: {'X-Ik': key, 'Accept': 'image/*,*/*', 'Referer': url}}, url);
    var b = now();
    out.fetchMs = b - a;
    if (!resp || !resp.ok) { out.imgFail = resp ? resp.status : 'no'; return Response.success(out); }

    var bin = '';
    try { bin = resp.text('ISO-8859-1'); } catch (et) { out.textErr = '' + et; return Response.success(out); }
    out.bytes = bin.length;

    out.javaType = (function () { try { return typeof java; } catch (e) { return 'ERR'; } })();

    var c = now();
    var jsHead = '';
    try { jsHead = jsDecode(bin, kb).substring(0, 12); } catch (e) { jsHead = 'ERR:' + e; }
    out.jsDecodeMs = now() - c;
    out.jsHead = jsHead;

    var d = now();
    var jHead = '';
    try { jHead = javaDecode(bin, kb).substring(0, 12); } catch (e) { jHead = 'ERR:' + e; }
    out.javaDecodeMs = now() - d;
    out.javaHead = jHead;

    return Response.success(out);
}
