load('config.js');

function execute() {
    return Response.success([
        {title: "Moi cap nhat", input: "/", script: "gen.js"},
        {title: "Manhwa", input: "/the/manhwa/", script: "gen.js"},
        {title: "Manhua", input: "/the/manhua/", script: "gen.js"},
        {title: "Manga", input: "/the/manga/", script: "gen.js"},
        {title: "Novel", input: "/the/novel/", script: "gen.js"},
        {title: "Hoan thanh", input: "/the/end/", script: "gen.js"},
        {title: "18+", input: "/the/18/", script: "gen.js"}
    ]);
}
