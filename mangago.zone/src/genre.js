load('config.js');

function execute() {
    var genres = [
        "All", "Action", "Adventure", "Comedy", "Drama", "Fantasy", "Gender Bender",
        "Harem", "Historical", "Horror", "Josei", "Martial Arts", "Mecha", "Mystery",
        "One Shot", "Psychological", "Romance", "School Life", "Sci-fi", "Seinen",
        "Shoujo", "Shoujo Ai", "Shounen", "Shounen Ai", "Slice Of Life", "Sports",
        "Supernatural", "Tragedy", "Webtoons"
    ];
    var data = [];
    for (var i = 0; i < genres.length; i++) {
        data.push({
            title: genres[i],
            input: BASE_URL + "/genre/" + encodeURIComponent(genres[i]).replace(/%20/g, "%20") + "/",
            script: "gen.js"
        });
    }
    return Response.success(data);
}
