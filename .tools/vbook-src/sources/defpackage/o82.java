package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class o82 extends ra8 {
    public final int b;
    public final int c;
    public final /* synthetic */ b92 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o82(b92 b92Var, int i, b82 b82Var) {
        super(b82Var);
        this.d = b92Var;
        this.b = 1;
        this.c = i;
    }

    @Override // defpackage.ra8
    public final void a(v34 v34Var) {
        ((qj) ((yf1) this.d).a).p(new String[]{"DbBook"}, v34Var);
    }

    @Override // defpackage.ra8
    public final va8 b(kb4 kb4Var) {
        b92 b92Var = this.d;
        return ((qj) ((yf1) b92Var).a).E(2081543787, "SELECT DbBook.id, DbBook.name, DbBook.author, DbBook.cover, DbBook.type, DbBook.format, DbBook.category, DbBook.language, DbBook.pathId, DbBook.path, DbBook.source, DbBook.extensionId, DbBook.status, DbBook.location, DbBook.description, DbBook.isNsfw, DbBook.lastReadChapterName, DbBook.lastReadChapterId, DbBook.lastReadChapterIndex, DbBook.lastReadChapterPercent, DbBook.totalChapter, DbBook.totalReadTime, DbBook.totalListenedTime, DbBook.follow, DbBook.favorite, DbBook.hidden, DbBook.pined, DbBook.newUpdateCount, DbBook.translate, DbBook.extras, DbBook.readScore, DbBook.lastUpdate, DbBook.lastRead, DbBook.createAt, DbBook.updateAt\nFROM DbBook\nWHERE location = ? AND type = ?", kb4Var, 2, new n82(0, b92Var, this));
    }

    @Override // defpackage.ra8
    public final void f(v34 v34Var) {
        v34Var.getClass();
        ((qj) ((yf1) this.d).a).R(new String[]{"DbBook"}, v34Var);
    }

    public final String toString() {
        return "DbBook.sq:getInLocationByType";
    }
}
