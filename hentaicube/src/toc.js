load('config.js');

function chapNum(text) {
    var t = (text || "").toLowerCase().replace(/_/g, "-");
    if (t.indexOf("oneshot") >= 0 || t.indexOf("one shot") >= 0) return 1;
    var m = /(?:chap|chapter|chương|ch)\s*[-:#.]?\s*(\d+(?:[-.]\d+)?)/i.exec(t);
    if (!m) m = /(\d+(?:[-.]\d+)?)/.exec(t);
    return m ? parseFloat(m[1].replace("-", ".")) : 0;
}

function parseChapters(doc) {
    var data = [];
    var seen = {};
    doc.select("li.wp-manga-chapter a[href], .wp-manga-chapter a[href], .listing-chapters_wrap a[href]").forEach(function(a) {
        var href = a.attr("href");
        if (!isChapterUrl(href)) return;
        var link = absUrl(href);
        if (seen[link]) return;
        seen[link] = true;
        var name = clean(a.text());
        if (!name) name = clean(a.attr("title"));
        data.push({name: name, url: link, link: link, input: link, host: BASE_URL});
    });
    return data;
}

// site lists newest first -> sort ascending for reading order
function sortAsc(data) {
    if (data.length < 2) return data;
    var mapped = [];
    for (var i = 0; i < data.length; i++) mapped.push({item: data[i], idx: i, val: chapNum(data[i].name + " " + data[i].url)});
    mapped.sort(function(a, b) {
        if (a.val && b.val && a.val !== b.val) return a.val - b.val;
        return b.idx - a.idx;
    });
    var out = [];
    for (var j = 0; j < mapped.length; j++) out.push(mapped[j].item);
    return out;
}

function execute(url) {
    var target = storyUrl(url);
    if (!isStoryUrl(target)) return Response.error("URL truyện không hợp lệ.");

    var doc = getDoc(target);
    if (!doc) return Response.error("Không tải được danh sách chương.");

    var data = parseChapters(doc);
    if (data.length === 0) return Response.error("Không tìm thấy danh sách chương.");
    return Response.success(sortAsc(data));
}
