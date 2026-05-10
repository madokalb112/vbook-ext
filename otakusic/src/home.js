load('config.js');

function execute() {
    return Response.success([
        {title: "Moi cap nhat", input: "/tim-kiem?sort=updated", script: "gen.js"},
        {title: "Top thinh hanh", input: "/tim-kiem?sort=views", script: "gen.js"},
        {title: "Danh gia cao", input: "/tim-kiem?sort=rating", script: "gen.js"},
        {title: "Dang tien hanh", input: "/tim-kiem?status=ongoing&sort=updated", script: "gen.js"},
        {title: "Hoan thanh", input: "/tim-kiem?status=completed&sort=updated", script: "gen.js"}
    ]);
}
