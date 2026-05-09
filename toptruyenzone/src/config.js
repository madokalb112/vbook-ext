let BASE_URL = 'https://www.toptruyenzone2.com';
try {
    if (CONFIG_URL) {
        BASE_URL = CONFIG_URL;
    }
} catch (error) {
}

function cleanText(text) {
    if (!text) return "";
    return ("" + text).replace(/\s+/g, " ").trim();
}

function foldText(text) {
    text = cleanText(text).toLowerCase();
    try {
        text = text.normalize("NFD").replace(/[\u0300-\u036f]/g, "");
    } catch (error) {
    }
    return text.replace(/\u0111/g, "d").replace(/\u0110/g, "d");
}

function stripTrailingSlash(url) {
    if (!url) return url;
    return url.replace(/\/+$/, "");
}

function normalizeUrl(url) {
    if (!url) return url;
    url = ("" + url).replace(/&amp;/g, "&").trim();
    if (url.startsWith("//")) return "https:" + url;
    if (url.startsWith("/")) return stripTrailingSlash(BASE_URL) + url;
    if (!/^https?:\/\//i.test(url)) return stripTrailingSlash(BASE_URL) + "/" + url.replace(/^\/+/, "");
    if (/^https?:\/\/(?:www\.)?toptruyenzone\d+\.com/i.test(url)) {
        return url.replace(/^https?:\/\/(?:www\.)?toptruyenzone\d+\.com/i, stripTrailingSlash(BASE_URL));
    }
    return url;
}

function normalizeImage(url) {
    if (!url) return "";
    url = ("" + url).replace(/&amp;/g, "&").trim();
    if (url.startsWith("//")) return "https:" + url;
    if (url.startsWith("/")) return stripTrailingSlash(BASE_URL) + url;
    if (!/^https?:\/\//i.test(url)) return stripTrailingSlash(BASE_URL) + "/" + url.replace(/^\/+/, "");
    return url;
}

function imageFromNode(node) {
    if (!node) return "";
    return node.attr("src") ||
        node.attr("data-src") ||
        node.attr("data-original") ||
        node.attr("data-lazy-src");
}

function request(url) {
    return fetch(normalizeUrl(url), {
        headers: {
            "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
            "Accept-Language": "vi-VN,vi;q=0.9,en-US;q=0.8,en;q=0.7",
            "Referer": BASE_URL + "/",
            "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36"
        }
    });
}

function isChallenge(doc) {
    if (!doc) return true;
    let html = doc.html ? doc.html() : "";
    let title = cleanText(doc.select("title").text());
    return title.indexOf("Just a moment") >= 0 ||
        html.indexOf("cf-chl") >= 0 ||
        html.indexOf("__cf_chl_") >= 0 ||
        html.indexOf("window._cf_chl_opt") >= 0 ||
        html.indexOf("Enable JavaScript and cookies") >= 0;
}

function browserDoc(url) {
    try {
        let browser = Engine.newBrowser();
        browser.setUserAgent(UserAgent.android());
        let doc = browser.launch(normalizeUrl(url), 30000);
        for (let i = 0; i < 4 && isChallenge(doc); i++) {
            sleep(4000);
            doc = browser.html();
        }
        browser.close();
        return isChallenge(doc) ? null : doc;
    } catch (error) {
        return null;
    }
}

function getDoc(url) {
    try {
        let response = request(url);
        if (response.ok) {
            let doc = response.html();
            if (!isChallenge(doc)) return doc;
        }
    } catch (error) {
    }
    return browserDoc(url);
}

function pathOf(url) {
    url = normalizeUrl(url);
    let match = /^https?:\/\/[^/]+(\/[^?#]*)?/i.exec(url);
    return match && match[1] ? match[1] : "/";
}

function isChapterUrl(url) {
    let path = pathOf(url).replace(/\/+$/, "");
    return /^\/truyen-tranh\/[0-9a-z-]+\/chapter-[0-9a-z.-]+\/\d+$/i.test(path);
}

function isStoryUrl(url) {
    if (!url) return false;
    let path = pathOf(url).replace(/\/+$/, "");
    if (isChapterUrl(url)) return false;
    return /^\/truyen-tranh\/[0-9a-z-]+\/\d+$/i.test(path);
}

function listPageUrl(url, page) {
    if (!url) url = "/";
    if (!page || page === "1") return normalizeUrl(url);
    if (("" + page).indexOf("http") === 0 || ("" + page).indexOf("/") === 0) {
        return normalizeUrl(page);
    }

    let requestUrl = normalizeUrl(url);
    if (requestUrl.indexOf("?") >= 0) return requestUrl + "&page=" + page;
    return requestUrl + "?page=" + page;
}

function nextPage(doc, page) {
    let nextNode = doc.select("link[rel=next], .pagination .active + li a, .pagination .page-item.active + .page-item a, .page-item.active + .page-item a, a[rel=next], a.next").first();
    if (nextNode) {
        let href = nextNode.attr("href");
        if (href && href !== "#") return normalizeUrl(href);
        let text = cleanText(nextNode.text());
        if (/^\d+$/.test(text)) return text;
    }

    let current = parseFloat(page || "1");
    let links = doc.select(".pagination a, .page-item a, nav a");
    for (let i = 0; i < links.size(); i++) {
        let text = cleanText(links.get(i).text());
        if (/^\d+$/.test(text) && parseFloat(text) > current) return text;
    }
    return "";
}

function firstText(doc, selectors) {
    for (let i = 0; i < selectors.length; i++) {
        let node = doc.select(selectors[i]).first();
        let text = node ? cleanText(node.text()) : "";
        if (text) return text;
    }
    return "";
}

function firstHtml(doc, selectors) {
    for (let i = 0; i < selectors.length; i++) {
        let node = doc.select(selectors[i]).first();
        let html = node ? cleanText(node.html()) : "";
        if (html) return node.html();
    }
    return "";
}

function storyLinkNode(e) {
    let links = e.select("a[href]");
    for (let i = 0; i < links.size(); i++) {
        let link = links.get(i);
        if (isStoryUrl(link.attr("href"))) return link;
    }
    return null;
}

function comicItem(e) {
    let linkNode = storyLinkNode(e);
    let imgNode = e.select(".image-item img, .image-mini img, .slide-img, img").first();
    let cover = normalizeImage(imageFromNode(imgNode));

    let name = firstText(e, [
        ".title-manga",
        ".caption h3 a",
        ".slide-info h3 a",
        "h3 a",
        "h2 a"
    ]);
    if (!name && linkNode) name = cleanText(linkNode.attr("title") || linkNode.text());
    if (!name && imgNode) name = cleanText(imgNode.attr("alt") || imgNode.attr("title"));

    let description = firstText(e, [
        ".chapter-detail .chapter",
        ".slide-chap",
        ".chapter"
    ]);

    return {
        name: name,
        link: linkNode ? normalizeUrl(linkNode.attr("href")) : "",
        cover: cover,
        description: description,
        host: BASE_URL
    };
}

function collectComics(doc) {
    let data = [];
    let seen = {};
    let nodes = doc.select(".item-manga");
    if (nodes.size() === 0) nodes = doc.select(".slide-item");

    nodes.forEach(function(e) {
        let item = comicItem(e);
        if (item.name && item.link && !seen[item.link]) {
            seen[item.link] = true;
            data.push(item);
        }
    });

    if (data.length > 0) return data;

    doc.select("a[href]").forEach(function(e) {
        let href = e.attr("href");
        if (!isStoryUrl(href)) return;
        let link = normalizeUrl(href);
        if (seen[link]) return;

        let name = cleanText(e.attr("title") || e.text());
        if (!name || /chapter|chap/i.test(name)) return;

        seen[link] = true;
        data.push({
            name: name,
            link: link,
            cover: "",
            description: "",
            host: BASE_URL
        });
    });

    return data;
}

function detailValue(doc, labels) {
    let rows = doc.select(".info-detail-comic li");
    for (let i = 0; i < rows.size(); i++) {
        let row = rows.get(i);
        let label = foldText(row.select(".info-name").text());
        for (let j = 0; j < labels.length; j++) {
            if (label.indexOf(labels[j]) >= 0) {
                return cleanText(row.select(".detail-info").text());
            }
        }
    }
    return "";
}

function execute() {
    return Response.success({
        baseUrl: BASE_URL,
        ok: true
    });
}
