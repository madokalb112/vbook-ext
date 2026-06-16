load('config.js');

function execute(url, page) {
    return comicList(`&categories%5B%5D=${url}&orders%5B%5D=updatedAt`, page);
}
