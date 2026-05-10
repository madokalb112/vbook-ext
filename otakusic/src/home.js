load("config.js");

function execute() {
    return Response.success([
        {title: "Moi cap nhat", input: BASE_URL + "/tim-kiem", script: "gen.js"},
        {title: "Dang tien hanh", input: BASE_URL + "/tim-kiem?status=ongoing", script: "gen.js"},
        {title: "Da hoan thanh", input: BASE_URL + "/tim-kiem?status=completed", script: "gen.js"},
        {title: "Top ngay", input: API_URL + "/manga/ranking?type=day", script: "gen.js"},
        {title: "Top tuan", input: API_URL + "/manga/ranking?type=week", script: "gen.js"},
        {title: "Top thang", input: API_URL + "/manga/ranking?type=month", script: "gen.js"}
    ]);
}
