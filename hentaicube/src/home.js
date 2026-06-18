load('config.js');

function execute() {
    return Response.success([
        {title: "Truyện mới", input: "/read/?m_orderby=new-manga", script: "gen.js"},
        {title: "Đọc nhiều", input: "/read/?m_orderby=views", script: "gen.js"},
        {title: "HOT", input: "/hot/", script: "gen.js"},
        {title: "Hoàn thành", input: "/?s=&post_type=wp-manga&genre%5B%5D=series&op=1&author=&status%5B%5D=end", script: "gen.js"},
        {title: "Danh sách truyện", input: "/read/", script: "gen.js"},
        {title: "Truyện màu", input: "/theloai/full-color/", script: "gen.js"},
        {title: "Không che", input: "/theloai/khong-che/", script: "gen.js"},
        {title: "Webtoon", input: "/theloai/webtoon/", script: "gen.js"},
        {title: "Manhwa", input: "/theloai/manhwa/", script: "gen.js"}
    ]);
}
