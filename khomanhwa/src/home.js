load('config.js');

function execute() {
    return Response.success([
        {title: "Trang chu", input: "/", script: "gen.js"},
        {title: "Moi cap nhat", input: "/latest", script: "gen.js"},
        {title: "Pho bien", input: "/popular", script: "gen.js"},
        {title: "Uncensored", input: "/uncensored", script: "gen.js"},
        {title: "Hoan thanh", input: "/completed", script: "gen.js"},
        {title: "Tat ca truyen", input: "/search", script: "gen.js"},
        {title: "The loai", input: "/genre", script: "gen.js"}
    ]);
}
