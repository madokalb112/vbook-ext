package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class k82 extends ra8 {
    public final /* synthetic */ int b;
    public final long c;
    public final /* synthetic */ b92 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k82(b92 b92Var, long j, kb4 kb4Var, int i) {
        super(kb4Var);
        this.b = i;
        this.d = b92Var;
        this.c = j;
    }

    @Override // defpackage.ra8
    public final void a(v34 v34Var) {
        int i = this.b;
        b92 b92Var = this.d;
        switch (i) {
            case 0:
                ((qj) ((yf1) b92Var).a).p(new String[]{"DbBook"}, v34Var);
                break;
            default:
                ((qj) ((yf1) b92Var).a).p(new String[]{"DbBook"}, v34Var);
                break;
        }
    }

    @Override // defpackage.ra8
    public final va8 b(kb4 kb4Var) {
        int i = this.b;
        b92 b92Var = this.d;
        switch (i) {
            case 0:
                return ((qj) ((yf1) b92Var).a).E(-1235145629, "SELECT DbBook.id, DbBook.name, DbBook.author, DbBook.cover, DbBook.type, DbBook.format, DbBook.category, DbBook.language, DbBook.pathId, DbBook.path, DbBook.source, DbBook.extensionId, DbBook.status, DbBook.location, DbBook.description, DbBook.isNsfw, DbBook.lastReadChapterName, DbBook.lastReadChapterId, DbBook.lastReadChapterIndex, DbBook.lastReadChapterPercent, DbBook.totalChapter, DbBook.totalReadTime, DbBook.totalListenedTime, DbBook.follow, DbBook.favorite, DbBook.hidden, DbBook.pined, DbBook.newUpdateCount, DbBook.translate, DbBook.extras, DbBook.readScore, DbBook.lastUpdate, DbBook.lastRead, DbBook.createAt, DbBook.updateAt\nFROM DbBook\nWHERE lastRead > 0 AND location = 1\nORDER BY lastRead DESC\nLIMIT ?", kb4Var, 1, new f0(this, 22));
            default:
                return ((qj) ((yf1) b92Var).a).E(-1467839402, "SELECT DbBook.id, DbBook.name, DbBook.author, DbBook.cover, DbBook.type, DbBook.format, DbBook.category, DbBook.language, DbBook.pathId, DbBook.path, DbBook.source, DbBook.extensionId, DbBook.status, DbBook.location, DbBook.description, DbBook.isNsfw, DbBook.lastReadChapterName, DbBook.lastReadChapterId, DbBook.lastReadChapterIndex, DbBook.lastReadChapterPercent, DbBook.totalChapter, DbBook.totalReadTime, DbBook.totalListenedTime, DbBook.follow, DbBook.favorite, DbBook.hidden, DbBook.pined, DbBook.newUpdateCount, DbBook.translate, DbBook.extras, DbBook.readScore, DbBook.lastUpdate, DbBook.lastRead, DbBook.createAt, DbBook.updateAt\nFROM DbBook\nWHERE lastUpdate > 0 AND location = 1\nORDER BY lastUpdate DESC\nLIMIT ?", kb4Var, 1, new f0(this, 23));
        }
    }

    @Override // defpackage.ra8
    public final void f(v34 v34Var) {
        int i = this.b;
        b92 b92Var = this.d;
        v34Var.getClass();
        switch (i) {
            case 0:
                ((qj) ((yf1) b92Var).a).R(new String[]{"DbBook"}, v34Var);
                break;
            default:
                ((qj) ((yf1) b92Var).a).R(new String[]{"DbBook"}, v34Var);
                break;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "DbBook.sq:getByLastRead";
            default:
                return "DbBook.sq:getByLastUpdate";
        }
    }
}
