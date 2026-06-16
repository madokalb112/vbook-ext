load('config.js');

function execute() {
    var doc = getDoc(BASE_URL + "/the-loai-genres/");
    if (!doc) doc = getDoc(BASE_URL + "/");
    var data = [];
    var seen = {};
    if (doc) {
        doc.select("a[href*='/theloai/']").forEach(function(a) {
            var href = absUrl(a.attr("href"));
            if (!/\/theloai\/[^/?#]+\/?$/i.test(href.replace(/[?#].*$/, "")) || seen[href]) return;
            var title = clean(a.text()).replace(/\s*\(\d+\)\s*$/, "");
            if (!title) return;
            seen[href] = true;
            data.push({title: title, input: href, script: "gen.js"});
        });
    }
    return Response.success(data);
}
