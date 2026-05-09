load('config.js');

function execute() {
    return Response.success([
        { title: "Moi cap nhat", input: BASE_URL + "/api/manga?limit=24&cursor_res=true", script: "gen.js" },
        { title: "Top ngay", input: BASE_URL + "/api/manga/top?period=day&limit=24", script: "gen.js" },
        { title: "Top tuan", input: BASE_URL + "/api/manga/top?period=week&limit=24", script: "gen.js" },
        { title: "Top thang", input: BASE_URL + "/api/manga/top?period=month&limit=24", script: "gen.js" },
        { title: "Top tat ca", input: BASE_URL + "/api/manga/top/all-time?limit=24", script: "gen.js" }
    ]);
}
