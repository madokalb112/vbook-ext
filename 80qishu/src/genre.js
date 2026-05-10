load('config.js');

function execute() {
    return Response.success([
        {title: "Male", input: "/nansheng/", script: "gen.js"},
        {title: "Female Romance", input: "/yanqing/", script: "gen.js"},
        {title: "Danmei / Fanfic", input: "/tongren/", script: "gen.js"},
        {title: "Urban", input: "/dushi/", script: "gen.js"},
        {title: "Fantasy", input: "/xuanhuan/", script: "gen.js"},
        {title: "Wuxia / Xianxia", input: "/xiuzhen/", script: "gen.js"},
        {title: "Game", input: "/wangyou/", script: "gen.js"},
        {title: "History", input: "/lishi/", script: "gen.js"},
        {title: "Sci-Fi / Supernatural", input: "/kehuan/", script: "gen.js"},
        {title: "Other", input: "/qita/", script: "gen.js"}
    ]);
}
