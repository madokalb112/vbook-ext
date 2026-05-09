load('config.js');

function execute() {
    return Response.success([
        { title: "Moi cap nhat", input: API_URL + "/chapter/updates?limit=24&page=1", script: "gen.js" },
        { title: "Tat ca", input: API_URL + "/manga?limit=24&page=1", script: "gen.js" },
        { title: "Top", input: API_URL + "/manga/top?limit=24&page=1", script: "gen.js" },
        { title: "Hoan thanh", input: API_URL + "/manga?limit=24&page=1&status=completed", script: "gen.js" },
        { title: "Dang tien hanh", input: API_URL + "/manga?limit=24&page=1&status=ongoing", script: "gen.js" }
    ]);
}
