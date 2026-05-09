load('config.js');

function capturedReadImageUrl(urls) {
    for (let i = urls.length - 1; i >= 0; i--) {
        let u = decodeHtml(urls[i]);
        if (/\/ajax\/read\/(chapter|volume)\/\d+(?:\?[^#]*\bvrf=|&amp;vrf=)/i.test(u)) return normalizeUrl(u);
    }
    return "";
}

function collectRenderedImages(doc, referer) {
    let data = [];
    let seen = {};
    if (!doc) return data;
    let nodes = doc.select("#page-wrapper img, .pages img, #page-wrapper [data-src], #page-wrapper [data-original], #page-wrapper [data-lazy-src]");
    for (let i = 0; i < nodes.size(); i++) {
        let link = imageFromNode(nodes.get(i));
        if (link && !seen[link]) {
            seen[link] = true;
            data.push({link: link, headers: imageHeaders(referer)});
        }
    }
    return data;
}

function runBrowserJs(browser, script, timeout) {
    try {
        browser.callJs(script, timeout || 3000);
        return true;
    } catch (error) {
        return false;
    }
}

function sleepMs(ms) {
    try { sleep(ms); } catch (error) {}
}

function forceCurrentChapter(browser) {
    let script = "(function(){var want=location.pathname.replace(/\\/+$/,'');var links=document.querySelectorAll('#number-panel a[href],#ctrl-menu a[href],a[href*=\"/read/\"]');for(var i=0;i<links.length;i++){var a=document.createElement('a');a.href=links[i].getAttribute('href')||'';if(a.pathname.replace(/\\/+$/,'')===want){links[i].dispatchEvent(new MouseEvent('click',{bubbles:true,cancelable:true,view:window}));return true;}}return false;})()";
    return runBrowserJs(browser, script, 3000);
}

function scrollReader(browser) {
    for (let i = 1; i <= 12; i++) {
        let script = "(function(){var h=Math.max(document.body.scrollHeight,document.documentElement.scrollHeight);window.scrollTo(0,Math.floor(h*" + i + "/12));var p=document.querySelector('#page-wrapper');if(p)p.scrollTop=p.scrollHeight;return h;})()";
        runBrowserJs(browser, script, 1500);
        sleepMs(600);
    }
    runBrowserJs(browser, "window.scrollTo(0,0)", 1000);
}

function browserCapture(url) {
    let result = {ajax: "", doc: null};
    let browser = null;
    try {
        browser = Engine.newBrowser();
        try { browser.setUserAgent(DESKTOP_UA); } catch (error) {}
        let initialDoc = browser.launch(normalizeUrl(url), 30000);
        try { browser.waitUrl(["/ajax/read/"], 8000); } catch (error) {}
        for (let i = 0; i < 2; i++) {
            forceCurrentChapter(browser);
            try { browser.waitUrl(["/ajax/read/chapter/", "/ajax/read/volume/"], 8000); } catch (error) {}
            try { result.ajax = capturedReadImageUrl(normalizeUrlList(browser.urls())); } catch (error) {}
            if (result.ajax) break;
            sleepMs(500);
        }
        if (!result.ajax) {
            scrollReader(browser);
            try { result.ajax = capturedReadImageUrl(normalizeUrlList(browser.urls())); } catch (error) {}
            try { result.doc = browser.html(); } catch (error) {}
            if (!result.doc) result.doc = initialDoc;
        }
    } catch (error) {
    }
    try { if (browser) browser.close(); } catch (error) {}
    return result;
}

function browserCaptureRendered(url) {
    let result = {ajax: "", doc: null};
    let browser = null;
    try {
        browser = Engine.newBrowser();
        try { browser.setUserAgent(DESKTOP_UA); } catch (error) {}
        let initialDoc = browser.launch(normalizeUrl(url), 30000);
        try { browser.waitUrl(["/ajax/read/"], 8000); } catch (error) {}
        forceCurrentChapter(browser);
        try { browser.waitUrl(["/ajax/read/chapter/", "/ajax/read/volume/"], 8000); } catch (error) {}
        scrollReader(browser);
        try { result.ajax = capturedReadImageUrl(normalizeUrlList(browser.urls())); } catch (error) {}
        try { result.doc = browser.html(); } catch (error) {}
        if (!result.doc) result.doc = initialDoc;
    } catch (error) {
    }
    try { if (browser) browser.close(); } catch (error) {}
    return result;
}

function imagesFromJson(json, referer) {
    let images = json && json.result && json.result.images ? json.result.images : [];
    let data = [];
    let seen = {};
    for (let i = 0; i < images.length; i++) {
        let row = images[i];
        let link = "";
        try { link = row[0]; } catch (error) {}
        link = normalizeImage(link);
        if (link && !seen[link]) {
            seen[link] = true;
            data.push({link: link, headers: imageHeaders(referer)});
        }
    }
    return data;
}

function execute(url) {
    url = normalizeUrl(url);
    let captured = browserCapture(url);
    if (captured.ajax) {
        let response = requestJson(captured.ajax, url);
        if (response.ok) {
            let data = imagesFromJson(response.json(), url);
            if (data.length > 0) return Response.success(data);
        }
    }
    if (!captured.doc) captured = browserCaptureRendered(url);
    let fallback = collectRenderedImages(captured.doc, url);
    if (fallback.length > 0) return Response.success(fallback);
    return Response.error("Khong lay duoc anh chapter MangaFire. Endpoint anh can vrf tu JS cua site.");
}
