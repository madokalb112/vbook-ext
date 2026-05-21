load('config.js');

function decoratePage(url, page) {
    url = normalizeUrl(url || BASE_URL + "/");
    var p = parseInt(page || "1", 10);
    if (!p || p < 1) p = 1;

    var hash = "";
    var hashIndex = url.indexOf("#");
    if (hashIndex >= 0) {
        hash = url.substring(hashIndex);
        url = url.substring(0, hashIndex);
    }
    var qIndex = url.indexOf("?");
    var pathPart = qIndex >= 0 ? url.substring(0, qIndex) : url;
    var queryPart = qIndex >= 0 ? url.substring(qIndex) : "";

    if (/\/genre\/[^/]+\/\d+\/?$/i.test(pathPart)) {
        pathPart = pathPart.replace(/\/\d+\/?$/, "/" + p + "/");
    } else if (/\/genre\/[^/]+\/?$/i.test(pathPart)) {
        pathPart = pathPart.replace(/\/?$/, "/") + p + "/";
    } else if (/\/list\/[^/]+\/[^/]+\/\d+\/?$/i.test(pathPart)) {
        pathPart = pathPart.replace(/\/\d+\/?$/, "/" + p + "/");
    } else if (/\/list\/[^/]+\/[^/]+\/?$/i.test(pathPart)) {
        pathPart = pathPart.replace(/\/?$/, "/") + p + "/";
    } else if (/\/topmanga\/?$/i.test(pathPart)) {
        if (p > 1) pathPart = pathPart.replace(/\/?$/, "/") + p + "/";
    } else if (/\/r\/l_search\//i.test(pathPart)) {
        if (p > 1) {
            queryPart = queryPart || "?";
            if (/[?&]page=\d+/.test(queryPart)) {
                queryPart = queryPart.replace(/([?&]page=)\d+/, "$1" + p);
            } else {
                queryPart += (queryPart.length > 1 ? "&" : "") + "page=" + p;
            }
        }
    }

    return pathPart + queryPart + hash;
}

function collectFlexCards(html) {
    var data = [];
    var seen = {};
    var re = /<div\s+class="flex1\s+listitem[^"]*">[\s\S]*?<a[^>]+href="([^"]+\/work\/(\d+)\/?)"[^>]*>([\s\S]*?)<\/a>/ig;
    var m;
    while ((m = re.exec(html || "")) !== null) {
        var link = normalizeUrl(m[1]);
        var workId = m[2];
        if (!link || seen[link]) continue;
        var inner = m[3];
        var coverMatch = /<img[^>]+(?:data-src|src)\s*=\s*"([^"]+)"/i.exec(inner);
        var cover = coverMatch ? normalizeImage(decodeHtml(coverMatch[1])) : "";
        seen[link] = true;
        data.push({
            name: "Manga #" + workId,
            link: link,
            cover: cover,
            description: "",
            host: BASE_URL
        });
    }
    return data;
}

function collectListCards(html) {
    var data = [];
    var seen = {};
    var re = /<li>\s*<div\s+class="box[^"]*">([\s\S]*?)<\/li>/ig;
    var m;
    while ((m = re.exec(html || "")) !== null) {
        var block = m[1];
        var titleMatch = /<a[^>]+href="([^"]+\/work\/\d+\/?)"[^>]*>([^<]+)<\/a>/i.exec(block);
        if (!titleMatch) continue;
        var link = normalizeUrl(titleMatch[1]);
        if (!link || seen[link]) continue;
        var name = cleanText(titleMatch[2]);
        var coverMatch = /<a[^>]+class="thm-effect"[^>]*>\s*<img[^>]+src="([^"]+)"/i.exec(block);
        var cover = coverMatch ? normalizeImage(decodeHtml(coverMatch[1])) : "";
        var genresMatch = /Genres\s*:[\s\S]*?<span\s+class="gray">([\s\S]*?)<\/span>/i.exec(block);
        var description = "";
        if (genresMatch) {
            description = cleanText(genresMatch[1]).replace(/\s+,/g, ",").replace(/,\s*$/, "");
        }
        if (!description) {
            var summaryMatch = /Summary\s*:\s*<\/span>([\s\S]*?)<\/div>/i.exec(block);
            if (summaryMatch) description = cleanText(summaryMatch[1]);
        }
        seen[link] = true;
        data.push({name: name, link: link, cover: cover, description: description, host: BASE_URL});
    }
    return data;
}

function collectCards(html) {
    var data = collectListCards(html);
    if (data.length > 0) return data;
    return collectFlexCards(html);
}

function detectNextPage(html, currentUrl, currentPage, count) {
    if (count === 0) return "";
    var current = parseInt(currentPage || "1", 10) || 1;
    var pathPart = currentUrl;
    var qIndex = pathPart.indexOf("?");
    if (qIndex >= 0) pathPart = pathPart.substring(0, qIndex);
    var nextPage = current + 1;

    if (/\/genre\/[^/]+/i.test(pathPart) || /\/list\//i.test(pathPart)) {
        var pageRe = new RegExp("\\/" + nextPage + "\\/", "i");
        if (pageRe.test(html.replace(/&amp;/g, "&"))) return "" + nextPage;
        if (count >= 40) return "" + nextPage;
        return "";
    }

    if (count >= 40) return "" + nextPage;
    return "";
}

function execute(url, page) {
    var requestUrl = decoratePage(url, page);
    var html = requestText(requestUrl, BASE_URL + "/");
    if (!html) return Response.error("Khong tai duoc danh sach Mangago.");
    var data = collectCards(html);
    if (data.length === 0) return Response.error("Khong tim thay truyen nao.");
    return Response.success(data, detectNextPage(html, requestUrl, page, data.length));
}
