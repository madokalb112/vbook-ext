load('config.js');

function execute() {
    return Response.success([
        {title: "Trang chu", input: "/", script: "gen.js"},
        {title: "Tat ca truyen", input: "/tat-ca-truyen", script: "gen.js"},
        {title: "Xem nhieu", input: "/xem-nhieu", script: "gen.js"},
        {title: "Hoan thanh", input: "/hoan-thanh", script: "gen.js"},
        {title: "Manhwa", input: "/the-loai/manhwa", script: "gen.js"},
        {title: "Manhua", input: "/the-loai/manhua", script: "gen.js"},
        {title: "Truyen mau", input: "/the-loai/truyen-mau", script: "gen.js"},
        {title: "Ngon tinh", input: "/the-loai/ngon-tinh", script: "gen.js"}
    ]);
}
