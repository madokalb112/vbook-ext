let BASE_URL = 'https://otakusic.com';
try {
    if (CONFIG_URL) {
        BASE_URL = ("" + CONFIG_URL).replace(/\/+$/, "");
    }
} catch (error) {
}

let API_URL = BASE_URL + "/api/v1";
let IMG_BASE = "https://img.otakusic.com";
let DESKTOP_UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36";

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
    return url.replace(/^https?:\/\/(?:www\.)?otakusic\.com/i, stripTrailingSlash(BASE_URL));
}

function normalizeImage(url) {
    if (!url) return "";
    url = ("" + url).replace(/&amp;/g, "&").trim();
    if (url.indexOf("data:image") === 0) return "";
    if (url.startsWith("//")) return "https:" + url;
    url = url.replace(/^https?:\/\/(?:www\.)?otakusic\.com\/manga\//i, IMG_BASE + "/manga/");
    url = url.replace(/^https?:\/\/(?:www\.)?otakusic\.com\/uploads\//i, IMG_BASE + "/manga/uploads/");
    if (url.startsWith("/manga/")) return IMG_BASE + url;
    if (url.indexOf("manga/uploads/") === 0) return IMG_BASE + "/" + url;
    if (url.indexOf("uploads/chapter/") === 0 || url.indexOf("uploads/chapters/") === 0) return IMG_BASE + "/manga/" + url;
    if (url.startsWith("/")) return stripTrailingSlash(BASE_URL) + url;
    if (!/^https?:\/\//i.test(url)) return stripTrailingSlash(BASE_URL) + "/" + url.replace(/^\/+/, "");
    return url;
}

function isBadImage(url) {
    url = normalizeImage(url);
    if (!url) return true;
    return url.indexOf("no_image") >= 0 ||
        url.indexOf("loading") >= 0 ||
        url.indexOf("/logo") >= 0 ||
        url.indexOf("placeholder") >= 0;
}

function imageFromNode(node) {
    if (!node) return "";
    let candidates = [
        node.attr("src"),
        node.attr("data-src"),
        node.attr("data-original"),
        node.attr("data-lazy-src"),
        node.attr("data-url")
    ];
    for (let i = 0; i < candidates.length; i++) {
        let url = normalizeImage(candidates[i]);
        if (url && !isBadImage(url)) return url;
    }
    return normalizeImage(candidates[0]);
}

function isDetailUrl(url) {
    return /\/chi-tiet\/[^\/?#]+/i.test(url || "");
}

function addQuery(url, key, value) {
    if (value === null || value === undefined || value === "") return url;
    let parts = url.split("?");
    let base = parts[0];
    let query = parts.length > 1 ? parts[1].split("&") : [];
    let found = false;
    for (let i = 0; i < query.length; i++) {
        if (query[i].split("=")[0] === key) {
            query[i] = key + "=" + encodeURIComponent(value);
            found = true;
        }
    }
    if (!found) {
        query.push(key + "=" + encodeURIComponent(value));
    }
    return base + "?" + query.join("&");
}

function nextPage(doc, currentUrl) {
    let nextNode = doc.select("a[rel=next], .pagination a.next, .pagination li.active + li a, nav a[aria-label=Next]").first();
    if (nextNode) {
        let href = nextNode.attr("href");
        if (href && href !== "#" && href !== "javascript:void(0)") return normalizeUrl(href);
    }
    let links = doc.select(".pagination a, nav.pagination a, ul.pagination a");
    let currentPage = 1;
    let match = /[?&]page=(\d+)/i.exec(currentUrl || "");
    if (match) currentPage = parseInt(match[1]);
    for (let i = 0; i < links.size(); i++) {
        let link = links.get(i);
        let text = cleanText(link.text());
        if (/^\d+$/.test(text) && parseInt(text) > currentPage) {
            let href = link.attr("href");
            if (href && href !== "#") return normalizeUrl(href);
            return addQuery(currentUrl, "page", text);
        }
    }
    return "";
}

function readJson(response) {
    try {
        return response.json();
    } catch (error) {
        return null;
    }
}

function jsonRows(json) {
    if (!json) return [];
    if (json.data) {
        if (json.data.length !== undefined) return json.data;
        if (json.data.data && json.data.data.length !== undefined) return json.data.data;
    }
    if (json.images && json.images.length !== undefined) return json.images;
    if (json.items && json.items.length !== undefined) return json.items;
    if (json.length !== undefined) return json;
    return [];
}

function isBadName(name) {
    if (!name || name.length < 2) return true;
    if (/^M[oá»›]i\s+[\d,.]+/i.test(name)) return true;
    if (/^(chapter|chap|ch\.)\s/i.test(name)) return true;
    if (/^[\d,.]+\s*(chapter|chap|ch\.)/i.test(name)) return true;
    let f = foldText(name);
    if (f === "doc lien" || f === "chi tiet" || f === "xem them") return true;
    return false;
}

function comicItem(e) {
    let linkNode = null;
    let links = e.select("a[href*='/chi-tiet/']");
    for (let i = 0; i < links.size(); i++) {
        let href = links.get(i).attr("href");
        if (isDetailUrl(href)) {
            linkNode = links.get(i);
            break;
        }
    }

    if (!linkNode) {
        links = e.select("a[href]");
        for (let i = 0; i < links.size(); i++) {
            let href = links.get(i).attr("href");
            if (isDetailUrl(href)) {
                linkNode = links.get(i);
                break;
            }
        }
    }

    let imgNode = e.select("img").first();
    let cover = imageFromNode(imgNode);

    let name = "";
    let nameNode = e.select("h3 a, h4 a, h3, h4, .manga-name a, .comic-name a, .title a").first();
    if (nameNode) name = cleanText(nameNode.text());
    if (isBadName(name)) name = "";
    if (!name) {
        links = e.select("a[href*='/chi-tiet/']");
        for (let i = 0; i < links.size(); i++) {
            let candidate = cleanText(links.get(i).attr("title") || links.get(i).text());
            if (!isBadName(candidate)) {
                name = candidate;
                break;
            }
        }
    }
    if (!name && linkNode) name = cleanText(linkNode.attr("title") || linkNode.text());
    if (!name && imgNode) name = cleanText(imgNode.attr("alt") || imgNode.attr("title"));

    let description = "";
    let chapNode = e.select("[class*=chapter], [class*=Chapter]").first();
    if (chapNode) description = cleanText(chapNode.text());
    if (!description) {
        let text = cleanText(e.text());
        var chapMatch = /Chapter[:\s#]*(\d+)/i.exec(text);
        if (chapMatch) description = "Chapter " + chapMatch[1];
    }

    return {
        name: name,
        link: linkNode ? normalizeUrl(linkNode.attr("href")) : "",
        cover: cover,
        description: description,
        host: BASE_URL
    };
}

function collectCards(doc) {
    let data = [];
    let seen = {};
    let selectors = [
        ".comic-item",
        ".manga-item",
        ".story-item",
        ".book-item",
        ".item-comic",
        ".card",
        "[class*=comic-card]",
        "[class*=manga-card]"
    ];

    for (let s = 0; s < selectors.length; s++) {
        let nodes = doc.select(selectors[s]);
        if (nodes.size() > 0) {
            for (let i = 0; i < nodes.size(); i++) {
                let item = comicItem(nodes.get(i));
                if (item.name && item.link && !seen[item.link]) {
                    seen[item.link] = true;
                    data.push(item);
                }
            }
            if (data.length > 0) return data;
        }
    }

    return data;
}

function collectByLinks(doc) {
    let data = [];
    let seen = {};
    let covers = {};
    let links = doc.select("a[href*='/chi-tiet/']");

    for (let i = 0; i < links.size(); i++) {
        let e = links.get(i);
        let href = e.attr("href");
        if (!isDetailUrl(href)) continue;
        let link = normalizeUrl(href);
        if (covers[link]) continue;
        let imgNode = e.select("img").first();
        if (imgNode) covers[link] = imageFromNode(imgNode);
    }

    for (let i = 0; i < links.size(); i++) {
        let e = links.get(i);
        let href = e.attr("href");
        if (!isDetailUrl(href)) continue;
        let link = normalizeUrl(href);
        if (seen[link]) continue;

        let name = "";
        let imgNode = e.select("img").first();
        if (imgNode) {
            name = cleanText(imgNode.attr("alt") || imgNode.attr("title"));
        }
        if (!name || isBadName(name)) {
            name = cleanText(e.attr("title") || e.text());
        }
        if (isBadName(name)) continue;

        seen[link] = true;
        data.push({
            name: name,
            link: link,
            cover: covers[link] || "",
            description: "",
            host: BASE_URL
        });
    }
    return data;
}

function execute(key, page) {
    let data = [];

    if (key) {
        let apiUrl = API_URL + "/manga/search";
        let response = fetch(apiUrl, {
            headers: {
                "Accept": "application/json, text/plain, */*",
                "Referer": BASE_URL + "/",
                "User-Agent": DESKTOP_UA
            },
            queries: {
                q: key
            }
        });
        if (response.ok) {
            let rows = jsonRows(readJson(response));
            for (let i = 0; i < rows.length; i++) {
                let row = rows[i];
                if (!row || !row.slug) continue;
                let name = cleanText(row.name || row.title || "");
                if (!name) continue;
                data.push({
                    name: name,
                    link: BASE_URL + "/chi-tiet/" + row.slug,
                    cover: normalizeImage(row.image_url || row.thumb || row.cover || ""),
                    description: "",
                    host: BASE_URL
                });
            }
            if (data.length > 0) return Response.success(data);
        }
    }

    let requestUrl = page && ("" + page).indexOf("http") === 0 ? page : BASE_URL + "/tim-kiem";
    let options = {
        headers: {
            "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
            "Accept-Language": "vi-VN,vi;q=0.9,en-US;q=0.8,en;q=0.7",
            "Referer": BASE_URL + "/",
            "User-Agent": DESKTOP_UA
        }
    };

    if (!page || ("" + page).indexOf("http") !== 0) {
        options.queries = {
            q: key || "",
            sort: "updated",
            page: page ? "" + page : "1"
        };
    }

    let response = fetch(requestUrl, options);
    if (response.ok) {
        let doc = response.html();
        data = collectCards(doc);
        if (data.length === 0) data = collectByLinks(doc);
        if (data.length > 0) return Response.success(data, nextPage(doc, requestUrl));
    }

    return null;
}
