load('config.js');

function execute() {
    return Response.success([
        {title: "Moi cap nhat", input: "/", script: "gen.js"},
        {title: "Truyen moi", input: "/truyen-moi", script: "gen.js"},
        {title: "Truyen hot", input: "/truyen-hot", script: "gen.js"},
        {title: "Ngon tinh", input: "/the-loai/ngon-tinh", script: "gen.js"},
        {title: "Manhwa", input: "/the-loai/manhwa", script: "gen.js"},
        {title: "Manhua", input: "/the-loai/manhua", script: "gen.js"},
        {title: "Action", input: "/the-loai/action", script: "gen.js"},
        {title: "Truyen mau", input: "/the-loai/truyen-mau", script: "gen.js"}
    ]);
}
