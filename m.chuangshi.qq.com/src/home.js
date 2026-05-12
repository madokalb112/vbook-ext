load("config.js");

function execute() {
    return Response.success([
        {title: "\u7384\u5e7b", input: BASE_URL + "/tab/20001", script: "gen.js"},
        {title: "\u6b66\u4fa0", input: BASE_URL + "/tab/20010", script: "gen.js"},
        {title: "\u5386\u53f2", input: BASE_URL + "/tab/20028", script: "gen.js"},
        {title: "\u6e38\u620f", input: BASE_URL + "/tab/20050", script: "gen.js"},
        {title: "\u79d1\u5e7b", input: BASE_URL + "/tab/20042", script: "gen.js"},
        {title: "\u8f7b\u5c0f\u8bf4", input: BASE_URL + "/tab/20059", script: "gen.js"},
        {title: "\u514d\u8d39\u7206\u6b3e", input: BASE_URL + "/channel/free", script: "gen.js"},
        {title: "\u5b8c\u672c\u7cbe\u9009", input: BASE_URL + "/channel/finished", script: "gen.js"},
        {title: "\u6700\u8fd1\u66f4\u65b0", input: BASE_URL + "/channel/recent_index", script: "gen.js"},
        {title: "\u6700\u65b0\u53d1\u5e03", input: BASE_URL + "/channel/recent_publish", script: "gen.js"},
        {title: "\u65b0\u4e66\u6708\u7968\u699c", input: BASE_URL + "/rank/549720_1", script: "gen.js"},
        {title: "\u70ed\u95e8\u699c", input: BASE_URL + "/rank/548507_1", script: "gen.js"}
    ]);
}
