load('config.js');

function execute() {
    return Response.success([
        {title: "Mới cập nhật", input: BASE_URL + "/danh-sach/truyen-moi-cap-nhat", script: "gen.js"},
        {title: "Truyện mới đăng", input: BASE_URL + "/danh-sach/truyen-tranh-moi", script: "gen.js"},
        {title: "Hot nhất", input: BASE_URL + "/danh-sach/truyen-hot", script: "gen.js"},
        {title: "Xem nhiều", input: BASE_URL + "/danh-sach/xem-nhieu", script: "gen.js"},
        {title: "Trọn bộ", input: BASE_URL + "/danh-sach/tron-bo", script: "gen.js"},
        {title: "Danh sách truyện", input: BASE_URL + "/tim-kiem-nang-cao", script: "gen.js"}
    ]);
}
