load('config.js');

function execute() {
    return Response.success([
        {title: "Moi cap nhat", input: "/", script: "gen.js"},
        {title: "Top ngay", input: "/top-ngay", script: "gen.js"},
        {title: "Top tuan", input: "/top-tuan", script: "gen.js"},
        {title: "Top thang", input: "/top-thang", script: "gen.js"},
        {title: "Truyen moi", input: "/truyen-tranh-moi", script: "gen.js"},
        {title: "Hoan thanh", input: "/truyen-hoan-thanh", script: "gen.js"},
        {title: "Yeu thich", input: "/truyen-yeu-thich", script: "gen.js"},
        {title: "Ngau nhien", input: "/truyen-ngau-nhien", script: "gen.js"}
    ]);
}
