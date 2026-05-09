load('config.js');

function execute() {
    return Response.success([
        {title: "Home", input: HOME_URL, script: "gen.js"},
        {title: "Updated", input: BASE_URL + "/updated", script: "gen.js"},
        {title: "Newest", input: BASE_URL + "/newest", script: "gen.js"},
        {title: "Added", input: BASE_URL + "/added", script: "gen.js"},
        {title: "Manga", input: BASE_URL + "/type/manga", script: "gen.js"},
        {title: "Manhwa", input: BASE_URL + "/type/manhwa", script: "gen.js"},
        {title: "Manhua", input: BASE_URL + "/type/manhua", script: "gen.js"}
    ]);
}
