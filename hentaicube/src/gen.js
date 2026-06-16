load('config.js');

function parseCard(e) {
    var a = e.select("a[href*='/read/']").first();
    var link = a ? absUrl(a.attr("href")) : "";
    if (!isStoryUrl(link)) {
        var all = e.select("a[href]");
        for (var i = 0; i < all.size(); i++) {
            if (isStoryUrl(all.get(i).attr("href"))) { a = all.get(i); link = absUrl(a.attr("href")); break; }
        }
    }
    if (!isStoryUrl(link)) return null;

    var img = e.select("img").first();
    var name = clean(e.select(".post-title a, h3 a, h3, h4 a").first() ? e.select(".post-title a, h3 a, h3, h4 a").first().text() : "");
    if (!name && a) name = clean(a.attr("title") || a.text());
    if (!name && img) name = clean(img.attr("alt"));
    name = cleanTitle(name);
    if (!name) return null;

    var latest = [];
    e.select(".list-chapter a[href], .chapter-item a[href]").forEach(function(c) {
        var t = clean(c.text());
        if (t && isChapterUrl(c.attr("href")) && latest.length < 2) latest.push(t);
    });

    return {
        name: name,
        link: link,
        cover: img ? fullImage(imgSrc(img)) : "",
        description: latest.join(" - "),
        host: BASE_URL
    };
}

function parseList(doc) {
    var data = [];
    var seen = {};
    var sels = [".page-item-detail", ".c-tabs-item__content", ".row.c-tabs-item__content"];
    for (var s = 0; s < sels.length; s++) {
        var nodes = doc.select(sels[s]);
        if (nodes.size() === 0) continue;
        for (var i = 0; i < nodes.size(); i++) {
            var item = parseCard(nodes.get(i));
            if (item && !seen[item.link]) { seen[item.link] = true; data.push(item); }
        }
        if (data.length > 0) break;
    }
    return data;
}

function nextPage(doc) {
    var sels = ["a.nextpostslink[href]", ".wp-pagenavi a.nextpostslink[href]", ".nav-links a.next[href]", "a.page-numbers.next[href]", "a[rel=next][href]"];
    for (var i = 0; i < sels.length; i++) {
        var e = doc.select(sels[i]).first();
        if (e) return absUrl(e.attr("href"));
    }
    return "";
}

function pageUrl(url, page) {
    url = absUrl(url || BASE_URL + "/read/?m_orderby=new-manga");
    if (!page || page === "1" || page === 1) return url;
    if (("" + page).indexOf("http") === 0) return absUrl(page);
    var parts = url.split("?");
    var base = parts[0].replace(/\/page\/\d+\/?$/i, "").replace(/\/+$/, "");
    var query = parts.length > 1 ? "?" + parts.slice(1).join("?") : "";
    return base + "/page/" + page + "/" + query;
}

function execute(url, page) {
    var target = pageUrl(url, page);
    var doc = getDoc(target);
    if (!doc) return Response.error("Không tải được trang.");
    return Response.success(parseList(doc), nextPage(doc));
}
