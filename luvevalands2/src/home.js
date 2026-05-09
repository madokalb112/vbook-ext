load('config.js');

function execute() {
    return Response.success([
        {title: "Moi cap nhat", input: BASE_URL + "/danh-sach-chuong-moi-cap-nhat/comic", script: "gen.js"},
        {title: "Moi dang", input: BASE_URL + "/danh-sach/moi-dang", script: "gen.js"},
        {title: "Truyen hot", input: BASE_URL + "/danh-sach/truyen-hot-tuan", script: "gen.js"},
        {title: "Nhieu nguoi xem", input: BASE_URL + "/danh-sach/truyen-nhieu-nguoi-xem", script: "gen.js"},
        {title: "Trang chu", input: BASE_URL + "/", script: "gen.js"}
    ]);
}