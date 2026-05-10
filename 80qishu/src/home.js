load('config.js');

function execute() {
    return Response.success([
        {title: "Latest", input: "/new/", script: "gen.js"},
        {title: "Library", input: "/all/", script: "gen.js"},
        {title: "Hot", input: "/hot/", script: "gen.js"},
        {title: "Recommended", input: "/recommendall/", script: "gen.js"},
        {title: "Male", input: "/nansheng/", script: "gen.js"},
        {title: "Female Romance", input: "/yanqing/", script: "gen.js"},
        {title: "Fantasy", input: "/xuanhuan/", script: "gen.js"},
        {title: "Urban", input: "/dushi/", script: "gen.js"},
        {title: "History", input: "/lishi/", script: "gen.js"},
        {title: "Sci-Fi", input: "/kehuan/", script: "gen.js"}
    ]);
}
