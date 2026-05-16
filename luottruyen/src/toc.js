load('config.js');

function execute(url) {
    url = normalizeUrl(url);
    let response = fetch(url, {
        headers: {
            "Referer": BASE_URL + "/",
            "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36"
        }
    });

    if (!response.ok) {
        return null;
    }

    let doc = response.html();
    let nodes = doc.select("nav ul li .chapter a");
    if (nodes.size() === 0) {
        nodes = doc.select(".list-chapter li .chapter a");
    }
    if (nodes.size() === 0) {
        nodes = doc.select("li .chapter a");
    }

    let data = [];
    for (let i = nodes.size() - 1; i >= 0; i--) {
        let e = nodes.get(i);
        data.push({
            name: e.text(),
            url: normalizeUrl(e.attr("href")),
            host: BASE_URL
        });
    }

    if (data.length === 0) {
        let storyID = doc.select("#storyID").attr("value");
        if (storyID) {
            let tocResponse = fetch(BASE_URL + "/Story/ListChapterByStoryID", {
                method: "POST",
                headers: {
                    "Cache-Control": "no-cache, must-revalidate, max-age=0",
                    "Referer": url
                },
                body: {
                    StoryID: storyID
                }
            });

            if (tocResponse.ok) {
                let tocDoc = tocResponse.html();
                let tocNodes = tocDoc.select("li .chapter a");
                for (let i = tocNodes.size() - 1; i >= 0; i--) {
                    let e = tocNodes.get(i);
                    data.push({
                        name: e.text(),
                        url: normalizeUrl(e.attr("href")),
                        host: BASE_URL
                    });
                }
            }
        }
    }

    return Response.success(data);
}
