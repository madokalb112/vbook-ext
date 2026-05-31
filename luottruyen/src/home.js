load("config.js");

function execute() {
    return Response.success([
        {title: "Moi cap nhat", input: BASE_URL + "/tim-truyen", script: "gen.js"},
        {title: "Truyen moi", input: BASE_URL + "/tim-truyen?status=-1&sort=15", script: "gen.js"},
        {title: "Top all", input: BASE_URL + "/tim-truyen?status=-1&sort=10", script: "gen.js"},
        {title: "Top thang", input: BASE_URL + "/tim-truyen?status=-1&sort=11", script: "gen.js"},
        {title: "Top tuan", input: BASE_URL + "/tim-truyen?status=-1&sort=12", script: "gen.js"},
        {title: "Top ngay", input: BASE_URL + "/tim-truyen?status=-1&sort=13", script: "gen.js"},
        {title: "Theo doi", input: BASE_URL + "/tim-truyen?status=-1&sort=20", script: "gen.js"},
        {title: "Binh luan", input: BASE_URL + "/tim-truyen?status=-1&sort=25", script: "gen.js"},
        {title: "So chapter", input: BASE_URL + "/tim-truyen?status=-1&sort=30", script: "gen.js"},
        {title: "Hoan thanh", input: BASE_URL + "/tim-truyen?status=2&sort=0", script: "gen.js"},
        {title: "Dang tien hanh", input: BASE_URL + "/tim-truyen?status=1&sort=0", script: "gen.js"}
    ]);
}
