load('config.js');

function execute() {
    return Response.success([
        {title: "Moi cap nhat", input: "/truyen-moi-cap-nhat", script: "gen.js"},
        {title: "Truyen dich", input: "/truyen-dich-yy", script: "gen.js"},
        {title: "Truyen moi dang", input: "/truyen-moi-dang", script: "gen.js"},
        {title: "Chat luong cao", input: "/tieu-thuyet-chon-loc", script: "gen.js"},
        {title: "Kim Thanh Bang", input: "/kim-thanh-bang", script: "gen.js"},
        {title: "Truyen full", input: "/truyen-full", script: "gen.js"}
    ]);
}
