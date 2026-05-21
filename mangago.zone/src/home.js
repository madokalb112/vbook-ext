load('config.js');

function execute() {
    var data = [
        {title: "Latest", input: BASE_URL + "/list/latest/all/1/", script: "gen.js"},
        {title: "New", input: BASE_URL + "/list/new/all/1/", script: "gen.js"},
        {title: "Top Manga", input: BASE_URL + "/topmanga/", script: "gen.js"},
        {title: "Most Viewed", input: BASE_URL + "/genre/All/?f=1&o=1&sortby=view&e=", script: "gen.js"},
        {title: "Most Commented", input: BASE_URL + "/genre/All/?f=1&o=1&sortby=comment_count&e=", script: "gen.js"},
        {title: "Newest", input: BASE_URL + "/genre/All/?f=1&o=1&sortby=create_date&e=", script: "gen.js"},
        {title: "Recently Updated", input: BASE_URL + "/genre/All/?f=1&o=1&sortby=update_date&e=", script: "gen.js"}
    ];
    return Response.success(data);
}
