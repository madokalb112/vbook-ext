load('config.js');

function execute() {
    return Response.success([
        {title: "Truyện mới", input: "/read/?m_orderby=new-manga", script: "gen.js"},
        {title: "Đọc nhiều nhất", input: "/read/?m_orderby=views", script: "gen.js"},
        {title: "Thịnh hành", input: "/read/?m_orderby=trending", script: "gen.js"},
        {title: "Mới cập nhật", input: "/read/?m_orderby=latest", script: "gen.js"},
        {title: "Tất cả", input: "/read/", script: "gen.js"}
    ]);
}
