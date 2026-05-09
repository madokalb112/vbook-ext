load('config.js');

function execute() {
    return Response.success([
        {title: "Moi cap nhat", input: "/official", script: "gen.js"},
        {title: "Tim kiem nang cao", input: "/tim-kiem-nang-cao", script: "gen.js"},
        {title: "Manhwa", input: "/the-loai/manhwa", script: "gen.js"},
        {title: "Manga", input: "/the-loai/manga", script: "gen.js"},
        {title: "Manhua", input: "/the-loai/manhua", script: "gen.js"},
        {title: "Hentai", input: "/the-loai/hentai", script: "gen.js"},
        {title: "Smut", input: "/the-loai/smut", script: "gen.js"},
        {title: "Truyen tranh 18+", input: "/the-loai/truyen-tranh-18", script: "gen.js"},
        {title: "Thien Thai", input: "/the-loai/thien-thai", script: "gen.js"}
    ]);
}
