load('config.js');

function execute() {
    let api = BASE_URL + '/api/v1/mangas?limit=24';
    return Response.success([
        {title: 'Moi cap nhat', input: api + '&sort=latest', script: 'gen.js'},
        {title: 'Xem nhieu', input: api + '&sort=popular', script: 'gen.js'},
        {title: 'Hoan thanh', input: api + '&sort=latest&status=COMPLETED', script: 'gen.js'},
        {title: 'Dang tien hanh', input: api + '&sort=latest&status=ONGOING', script: 'gen.js'},
        {title: 'Tat ca', input: api + '&sort=latest', script: 'gen.js'}
    ]);
}
