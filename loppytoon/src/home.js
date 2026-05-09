load('config.js');

function execute() {
    return Response.success([
        { title: "Truyen tranh", input: BASE_URL + "/danh-sach-truyen/truyen-tranh", script: "gen.js" },
        { title: "Manhwa", input: BASE_URL + "/the-loai/manhwa", script: "gen.js" },
        { title: "Manga", input: BASE_URL + "/the-loai/manga", script: "gen.js" },
        { title: "19+", input: BASE_URL + "/the-loai/19", script: "gen.js" },
        { title: "18+", input: BASE_URL + "/the-loai/18", script: "gen.js" }
    ]);
}
