load('config.js');

function execute() {
    return Response.success([
        { title: "Moi cap nhat", input: "/", script: "gen.js" },
        { title: "Hot", input: "/hot", script: "gen.js" },
        { title: "Top ngay", input: "/tim-truyen?sort=6", script: "gen.js" },
        { title: "Top tuan", input: "/tim-truyen?sort=5", script: "gen.js" },
        { title: "Top thang", input: "/tim-truyen?sort=3", script: "gen.js" },
        { title: "Top all", input: "/tim-truyen?sort=2", script: "gen.js" },
        { title: "Hoan thanh", input: "/tim-truyen?status=1&sort=2", script: "gen.js" },
        { title: "Yeu thich", input: "/tim-truyen?sort=9", script: "gen.js" },
        { title: "Con trai", input: "/truyen-con-trai", script: "gen.js" },
        { title: "Con gai", input: "/truyen-con-gai", script: "gen.js" }
    ]);
}
