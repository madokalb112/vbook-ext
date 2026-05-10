var BASE_URL = "https://www.chickenmanga.com";

function execute() {
    var rows = [
        ["TV/Animation series", 42],
        ["Truyen mau", 41],
        ["Trong sinh", 40],
        ["Du hanh thoi gian", 39],
        ["Tong tai", 38],
        ["Phieu luu", 9],
        ["Hanh dong", 30],
        ["Trinh tham", 6],
        ["Co dai", 28],
        ["Khieu vu", 37],
        ["Nhe nhang", 3],
        ["Romance", 1],
        ["Am nhac", 2],
        ["De thuong", 4],
        ["Huyen huyen", 5]
    ];
    var data = [];
    for (var i = 0; i < rows.length; i++) {
        data.push({
            title: rows[i][0],
            input: BASE_URL + "/classification/index?comicStatus=" + rows[i][1] + "&ba_lang=vi",
            script: "gen.js"
        });
    }
    return Response.success(data);
}
