load('config.js');

function execute() {
    return Response.success([
        {title: "Trang chu", input: "/", script: "gen.js"},
        {title: "Danh sach truyen", input: "/danh-sach-truyen/", script: "gen.js"},
        {title: "Truyen hot nhat", input: "/truyen-hot-nhat/", script: "gen.js"},
        {title: "Xem nhieu nhat", input: "/nhieu-xem-nhat/", script: "gen.js"},
        {title: "Tron bo", input: "/tron-bo/", script: "gen.js"},
        {title: "Manhwa", input: "/the-loai/manhwa/", script: "gen.js"},
        {title: "Webtoon", input: "/the-loai/webtoon/", script: "gen.js"},
        {title: "Fantasy", input: "/the-loai/fantasy/", script: "gen.js"}
    ]);
}
