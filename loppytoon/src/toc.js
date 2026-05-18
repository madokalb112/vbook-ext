load('config.js');

function parseChapters(html, seen, data) {
    if (!html) return 0;
    let added = 0;
    let re = /<a[^>]*class="[^"]*chapter-item[^"]*"[^>]*href="([^"]+)"[^>]*>([\s\S]*?)<\/a>/gi;
    let match;
    while ((match = re.exec(html)) !== null) {
        let href = normalizeUrl(match[1].replace(/&amp;/g, "&"));
        let inner = match[2];
        let nameMatch = /<h3[^>]*>([\s\S]*?)<\/h3>/i.exec(inner);
        let raw = nameMatch ? nameMatch[1] : inner;
        let name = cleanText(raw.replace(/<[^>]+>/g, ""));
        if (name && href && !seen[href]) {
            seen[href] = true;
            data.push({ name: name, url: href, host: BASE_URL });
            added++;
        }
    }
    return added;
}

function execute(url) {
    url = normalizeUrl(url);
    let response = request(url);
    if (!response.ok) return null;

    let doc = response.html();
    let render = doc.select("#chapter-list-render").first();
    let slug = render ? render.attr("data-slug") : "";
    if (!slug) {
        let m = /\/truyen\/([^/?#]+)/i.exec(url);
        slug = m ? m[1] : "";
    }

    let data = [];
    let seen = {};
    let initialHtml = render ? render.html() : doc.select(".chapter-list").html();
    parseChapters(initialHtml, seen, data);

    let offset = data.length > 0 ? data.length : 0;
    while (slug) {
        let endpoint = BASE_URL + "/load-more-chapters?slug=" + encodeURIComponent(slug) +
            "&offset=" + offset + "&sortByPosition=desc";
        let resp = fetch(endpoint, {
            headers: {
                "Accept": "application/json, text/javascript, */*; q=0.01",
                "X-Requested-With": "XMLHttpRequest",
                "Referer": url,
                "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36"
            }
        });
        if (!resp.ok) break;

        let payload = null;
        try { payload = resp.json(); } catch (e) { payload = null; }
        if (!payload) {
            try { payload = JSON.parse(resp.text() || ""); } catch (e) { payload = null; }
        }
        if (!payload) break;

        let added = parseChapters(payload.html || "", seen, data);
        offset += 20;

        if (!payload.has_more) break;
        if (added === 0) break;
        if (offset > 50000) break;
    }

    data.reverse();
    return Response.success(data);
}
