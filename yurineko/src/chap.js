load('config.js');

function jsString(value) {
    try { return JSON.stringify(value || ''); } catch (error) { return String.fromCharCode(34) + String.fromCharCode(34); }
}

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
    let direct = /imgKey\\?":\\?"([^"\\]+)/.exec(html) || /['"]imgKey['"]\s*:\s*['"]([^'"]+)/.exec(html);
    return direct ? direct[1] : '';
}

function extractImageUrls(html) {
    let q = String.fromCharCode(34);
    let apos = String.fromCharCode(39);
    let re = new RegExp('/api/img\\?d=[^' + q + apos + '<>\\s]+', 'g');
    let data = [];
    let seen = {};
    let match;
    while ((match = re.exec(html || '')) !== null) {
        let url = cleanEscapedUrl(match[0]);
        if (!url || seen[url]) continue;
        seen[url] = true;
        data.push(url);
    }
    return data;
}

function decryptScript(resultKey, urls, imageKey) {
    let listJson = JSON.stringify(urls || []);
    let script = '(function(){var k=' + jsString(resultKey) + ';window[k]=' + jsString('') + ';';
    script += '(async function(){var out=[];try{var urls=JSON.parse(' + jsString(listJson) + ');';
    script += 'var key=' + jsString(imageKey) + ';';
    script += 'function x(u,k){if(!k)return u;var kb=[];for(var i=0;i<k.length;i+=2)kb.push(parseInt(k.substring(i,i+2),16));var o=new Uint8Array(u.length);for(var j=0;j<u.length;j++)o[j]=u[j]^kb[j%kb.length];return o;}';
    script += 'function b(u){var s=' + jsString('') + ';for(var i=0;i<u.length;i+=32768){var sub=u.subarray(i,i+32768);s+=String.fromCharCode.apply(null,sub);}return btoa(s);}';
    script += 'for(var n=0;n<urls.length;n++){var h=key?{' + jsString('X-Ik') + ':key}:{};';
    script += 'var r=await fetch(urls[n],{credentials:' + jsString('same-origin') + ',headers:h});';
    script += 'if(!r.ok)continue;var raw=new Uint8Array(await r.arrayBuffer());var dec=x(raw,key);';
    script += 'var ct=r.headers.get(' + jsString('X-Ct') + ')||' + jsString('image/webp') + ';';
    script += 'out.push(' + jsString('data:') + '+ct+' + jsString(';base64,') + '+b(dec));}';
    script += 'window[k]=JSON.stringify({images:out});}catch(e){window[k]=JSON.stringify({error:String(e),images:out});}})();return ' + jsString('ok') + ';})()';
    return script;
}

function browserImages(url) {
    let browser = null;
    try {
        browser = Engine.newBrowser();
        try { browser.setUserAgent(DESKTOP_UA); } catch (uaError) {}
        let doc = browser.launch(normalizeUrl(url), 60000);
        sleep(7000);
        try { doc = browser.html(); } catch (htmlError) {}
        if (!doc) return [];
        let html = doc.html ? doc.html() : '';
        let imageKey = extractImageKey(html);
        if (!imageKey) {
            try { imageKey = browser.callJs('(function(){return window.__YRK||' + jsString('') + ';})()', 3000); } catch (keyError) {}
        }
        let urls = extractImageUrls(html);
        if (!imageKey || urls.length === 0) return [];
        let resultKey = '__yrnk' + (new Date().getTime()) + Math.floor(Math.random() * 1000);
        browser.callJs(decryptScript(resultKey, urls, imageKey), 3000);
        for (let i = 0; i < 90; i++) {
            sleep(1000);
            let text = '';
            try { text = browser.callJs('(function(){return window[' + jsString(resultKey) + ']||' + jsString('') + ';})()', 3000); } catch (pollError) {}
            if (!text) continue;
            let result = null;
            try { result = JSON.parse(text); } catch (parseError) {}
            if (result && result.images && result.images.length) return result.images;
            if (result && result.error) break;
        }
    } catch (error) {
    } finally {
        try { if (browser) browser.close(); } catch (closeError) {}
    }
    return [];
}

function execute(url) {
    url = normalizeUrl(url);
    let data = browserImages(url);
    if (data.length === 0) return Response.error('Khong tim thay anh chapter. Yurineko ma hoa anh, can WebView de giai ma.');
    return Response.success(data);
}
