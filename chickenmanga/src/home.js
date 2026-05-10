var BASE_URL = "https://www.chickenmanga.com";

function execute() {
    return Response.success([
        {title: "Trang chu", input: BASE_URL + "/?ba_lang=vi", script: "gen.js"},
        {title: "Truyen moi ra", input: BASE_URL + "/classification/index?ba_lang=vi&redu_id=Truy%E1%BB%87n+m%E1%BB%9Bi+ra", script: "gen.js"},
        {title: "Truyen hot", input: BASE_URL + "/classification/index?ba_lang=vi&redu_id=Truy%E1%BB%87n+hot", script: "gen.js"},
        {title: "Dang cap nhat", input: BASE_URL + "/classification/index?ba_lang=vi&jindu_id=Truy%E1%BB%87n+%C4%91ang+c%E1%BA%ADp+nh%E1%BA%ADt", script: "gen.js"},
        {title: "Hoan thanh", input: BASE_URL + "/classification/index?ba_lang=vi&jindu_id=%C4%90%C3%A3+ho%C3%A0n+th%C3%A0nh", script: "gen.js"}
    ]);
}
