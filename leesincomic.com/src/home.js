load("config.js");

function execute() {
    return Response.success([
        {title: "Moi nhat", input: BASE_URL + "/the-loai/moi-nhat.html", script: "gen.js"},
        {title: "Hot nhat", input: BASE_URL + "/the-loai/hot-nhat.html", script: "gen.js"},
        {title: "Manhwa", input: BASE_URL + "/the-loai/manhwa.html", script: "gen.js"},
        {title: "Manhua", input: BASE_URL + "/the-loai/manhua.html", script: "gen.js"},
        {title: "Manga", input: BASE_URL + "/the-loai/manga.html", script: "gen.js"},
        {title: "Boy Love", input: BASE_URL + "/the-loai/boy-love.html", script: "gen.js"}
    ]);
}
