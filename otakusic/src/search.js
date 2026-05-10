load("config.js");

function execute(key, page) {
    if (page && page !== "1") return Response.success([]);

    let response = requestJson(API_URL + "/manga/search?q=" + encodeURIComponent(key || ""), BASE_URL + "/tim-kiem");
    if (!response.ok) return null;

    let json = response.json();
    let rows = json && json.data ? json.data : [];
    let data = [];
    for (let i = 0; i < rows.length; i++) {
        let row = rows[i];
        let categories = [];
        try {
            let cats = row.categories || [];
            for (let j = 0; j < cats.length; j++) {
                if (cats[j].name) categories.push(cats[j].name);
            }
        } catch (error) {
        }
        data.push({
            name: cleanText(row.name),
            link: storyUrl(row.slug),
            cover: normalizeImage(row.image_url),
            description: categories.join(", "),
            host: BASE_URL
        });
    }

    return Response.success(data);
}
