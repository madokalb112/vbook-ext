load("config.js");

function tabIdFromUrl(url) {
    let match = /\/tab\/(\d+)/i.exec(pathOf(url));
    return match ? match[1] : "";
}

function rankIdFromUrl(url) {
    let match = /\/rank\/(\d+)(?:_(\d+))?/i.exec(pathOf(url));
    if (!match) return null;
    return {
        columnId: match[1],
        page: match[2] || "1"
    };
}

function channelIdFromUrl(url) {
    let match = /\/channel\/([a-z0-9_]+)/i.exec(pathOf(url));
    return match ? match[1] : "";
}

function collectTab(url, page) {
    let current = pageNum(page, 1);
    let cid = tabIdFromUrl(url);
    if (!cid) return {items: [], next: ""};
    let data = apiData("/book/categoryTab", {
        cid: cid,
        pageIndex: current,
        pageSize: 20
    }, url);
    if (!data) return {items: [], next: ""};

    let items = flattenCategoryTab(data);
    let total = data.category ? parseInt(data.category.total || 0, 10) : 0;
    let next = "";
    if (items.length > 0 && (!total || current * items.length < total)) {
        next = "" + (current + 1);
    }
    return {items: items, next: next};
}

function collectRank(url, page) {
    let info = rankIdFromUrl(url);
    if (!info) return {items: [], next: ""};

    let current = pageNum(page, info.page);
    let data = apiData("/book/rank", {
        columnId: info.columnId,
        pageIndex: current,
        pageSize: 20
    }, url);
    if (!data) return {items: [], next: ""};

    let items = [];
    let seen = {};
    let books = data.column && data.column.books ? data.column.books : [];
    for (let i = 0; i < books.length; i++) {
        pushBook(items, seen, books[i]);
    }

    let pages = parseInt(data.pages || 0, 10);
    let next = pages && current < pages ? "" + (current + 1) : "";
    return {items: items, next: next};
}

function collectChannel(url) {
    let id = channelIdFromUrl(url);
    if (!id) return {items: [], next: ""};
    let data = apiData("/page", {id: id}, url);
    if (!data) return {items: [], next: ""};
    return {
        items: flattenCards(data.cards || []),
        next: ""
    };
}

function execute(url, page) {
    url = url || BASE_URL;
    let result = {items: [], next: ""};

    if (tabIdFromUrl(url)) {
        result = collectTab(url, page);
    } else if (rankIdFromUrl(url)) {
        result = collectRank(url, page);
    } else if (channelIdFromUrl(url)) {
        result = collectChannel(url);
    }

    return Response.success(result.items, result.next);
}
