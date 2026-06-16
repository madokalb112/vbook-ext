load('config.js');

function execute(key, page) {
    return comicList(`&searchValue=${key}&orders%5B%5D=updatedAt`, page);
}
