package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class l82 extends ra8 {
    public final boolean b;
    public final /* synthetic */ b92 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l82(b92 b92Var, boolean z, b82 b82Var) {
        super(b82Var);
        this.c = b92Var;
        this.b = z;
    }

    @Override // defpackage.ra8
    public final void a(v34 v34Var) {
        ((qj) ((yf1) this.c).a).p(new String[]{"DbBook"}, v34Var);
    }

    @Override // defpackage.ra8
    public final va8 b(kb4 kb4Var) {
        return ((qj) ((yf1) this.c).a).E(1975249233, "SELECT DbBook.id, DbBook.name, DbBook.author, DbBook.cover, DbBook.type, DbBook.format, DbBook.category, DbBook.language, DbBook.pathId, DbBook.path, DbBook.source, DbBook.extensionId, DbBook.status, DbBook.location, DbBook.description, DbBook.isNsfw, DbBook.lastReadChapterName, DbBook.lastReadChapterId, DbBook.lastReadChapterIndex, DbBook.lastReadChapterPercent, DbBook.totalChapter, DbBook.totalReadTime, DbBook.totalListenedTime, DbBook.follow, DbBook.favorite, DbBook.hidden, DbBook.pined, DbBook.newUpdateCount, DbBook.translate, DbBook.extras, DbBook.readScore, DbBook.lastUpdate, DbBook.lastRead, DbBook.createAt, DbBook.updateAt\nFROM DbBook\nWHERE follow = ? AND status = 0 AND location = 1\nORDER BY lastUpdate DESC", kb4Var, 1, new f0(this, 25));
    }

    @Override // defpackage.ra8
    public final void f(v34 v34Var) {
        v34Var.getClass();
        ((qj) ((yf1) this.c).a).R(new String[]{"DbBook"}, v34Var);
    }

    public final String toString() {
        return "DbBook.sq:getFollow";
    }
}
