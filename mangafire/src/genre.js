load('config.js');

function execute() {
    let names = ["Action", "Adventure", "Avant Garde", "Boys Love", "Comedy", "Demons", "Drama", "Ecchi", "Fantasy", "Girls Love", "Gourmet", "Harem", "Horror", "Isekai", "Iyashikei", "Josei", "Kids", "Magic", "Mahou Shoujo", "Martial Arts", "Mecha", "Military", "Music", "Mystery", "Parody", "Psychological", "Reverse Harem", "Romance", "School", "Sci-Fi", "Seinen", "Shoujo", "Shounen", "Slice of Life", "Space", "Sports", "Super Power", "Supernatural", "Suspense", "Thriller", "Vampire"];
    let data = [];
    for (let i = 0; i < names.length; i++) {
        let slug = names[i].toLowerCase().replace(/[^a-z0-9]+/g, "-").replace(/^-+|-+$/g, "");
        data.push({title: names[i], input: BASE_URL + "/genre/" + slug, script: "gen.js"});
    }
    return Response.success(data);
}
