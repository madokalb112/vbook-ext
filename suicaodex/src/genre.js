load('config.js');

function execute() {
    return Response.success([
        { title: "Dang tien hanh", input: API_URL + "/manga?limit=24&page=1&status=ongoing", script: "gen.js" },
        { title: "Hoan thanh", input: API_URL + "/manga?limit=24&page=1&status=completed", script: "gen.js" },
        { title: "Tam dung", input: API_URL + "/manga?limit=24&page=1&status=hiatus", script: "gen.js" },
        { title: "Safe", input: API_URL + "/manga?limit=24&page=1&contentRating=safe", script: "gen.js" },
        { title: "Suggestive", input: API_URL + "/manga?limit=24&page=1&contentRating=suggestive", script: "gen.js" },
        { title: "Erotica", input: API_URL + "/manga?limit=24&page=1&contentRating=erotica", script: "gen.js" },
        { title: "Pornographic", input: API_URL + "/manga?limit=24&page=1&contentRating=pornographic", script: "gen.js" }
    ]);
}
