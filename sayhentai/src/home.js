load('config.js');

function execute() {
    return Response.success([
        { title: "Moi cap nhat", input: BASE_URL + "/", script: "gen.js" },
        { title: "Truyen full", input: BASE_URL + "/completed", script: "gen.js" },
        { title: "Manhwa", input: BASE_URL + "/genre/manhwa", script: "gen.js" },
        { title: "Manga", input: BASE_URL + "/genre/manga", script: "gen.js" },
        { title: "One shot", input: BASE_URL + "/genre/one-shot", script: "gen.js" }
    ]);
}
