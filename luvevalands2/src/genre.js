load('config.js');

function execute() {
    return Response.success([
        {title: "Ngon tinh", input: BASE_URL + "/the-loai/ngon-tinh", script: "gen.js"},
        {title: "Dam my", input: BASE_URL + "/the-loai/dam-my", script: "gen.js"},
        {title: "Bach hop", input: BASE_URL + "/the-loai/bach-hop", script: "gen.js"},
        {title: "Manhwa", input: BASE_URL + "/the-loai/manhwa", script: "gen.js"},
        {title: "Manga", input: BASE_URL + "/the-loai/manga", script: "gen.js"},
        {title: "Hien dai", input: BASE_URL + "/the-loai/hien-dai", script: "gen.js"},
        {title: "Co dai", input: BASE_URL + "/the-loai/co-dai", script: "gen.js"},
        {title: "Huyen huyen", input: BASE_URL + "/the-loai/huyen-huyen", script: "gen.js"},
        {title: "Hai huoc", input: BASE_URL + "/the-loai/hai-huoc", script: "gen.js"},
        {title: "HE", input: BASE_URL + "/the-loai/he", script: "gen.js"},
        {title: "On Going", input: BASE_URL + "/the-loai/on-going", script: "gen.js"}
    ]);
}