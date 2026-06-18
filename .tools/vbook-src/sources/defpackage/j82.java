package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class j82 extends ra8 {
    public final /* synthetic */ int b = 0;
    public final String c;
    public final /* synthetic */ b92 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j82(b92 b92Var, String str, b82 b82Var) {
        super(b82Var);
        str.getClass();
        this.d = b92Var;
        this.c = str;
    }

    @Override // defpackage.ra8
    public final void a(v34 v34Var) {
        int i = this.b;
        b92 b92Var = this.d;
        switch (i) {
            case 0:
                ((qj) ((yf1) b92Var).a).p(new String[]{"DbBook"}, v34Var);
                break;
            case 1:
                ((qj) ((yf1) b92Var).a).p(new String[]{"DbBook"}, v34Var);
                break;
            case 2:
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
                return ((qj) ((yf1) b92Var).a).E(274842645, "SELECT DbBook.id, DbBook.name, DbBook.author, DbBook.cover, DbBook.type, DbBook.format, DbBook.category, DbBook.language, DbBook.pathId, DbBook.path, DbBook.source, DbBook.extensionId, DbBook.status, DbBook.location, DbBook.description, DbBook.isNsfw, DbBook.lastReadChapterName, DbBook.lastReadChapterId, DbBook.lastReadChapterIndex, DbBook.lastReadChapterPercent, DbBook.totalChapter, DbBook.totalReadTime, DbBook.totalListenedTime, DbBook.follow, DbBook.favorite, DbBook.hidden, DbBook.pined, DbBook.newUpdateCount, DbBook.translate, DbBook.extras, DbBook.readScore, DbBook.lastUpdate, DbBook.lastRead, DbBook.createAt, DbBook.updateAt\nFROM DbBook\nWHERE category LIKE ('%' || ? || '%')", kb4Var, 1, new f0(this, 21));
            case 1:
                return ((qj) ((yf1) b92Var).a).E(931125495, "SELECT DbBook.id, DbBook.name, DbBook.author, DbBook.cover, DbBook.type, DbBook.format, DbBook.category, DbBook.language, DbBook.pathId, DbBook.path, DbBook.source, DbBook.extensionId, DbBook.status, DbBook.location, DbBook.description, DbBook.isNsfw, DbBook.lastReadChapterName, DbBook.lastReadChapterId, DbBook.lastReadChapterIndex, DbBook.lastReadChapterPercent, DbBook.totalChapter, DbBook.totalReadTime, DbBook.totalListenedTime, DbBook.follow, DbBook.favorite, DbBook.hidden, DbBook.pined, DbBook.newUpdateCount, DbBook.translate, DbBook.extras, DbBook.readScore, DbBook.lastUpdate, DbBook.lastRead, DbBook.createAt, DbBook.updateAt\nFROM DbBook\nWHERE pathId = ?\nLIMIT 1", kb4Var, 1, new f0(this, 24));
            case 2:
                return ((qj) ((yf1) b92Var).a).E(-523705984, "SELECT DbBook.id, DbBook.name, DbBook.author, DbBook.cover, DbBook.type, DbBook.format, DbBook.category, DbBook.language, DbBook.pathId, DbBook.path, DbBook.source, DbBook.extensionId, DbBook.status, DbBook.location, DbBook.description, DbBook.isNsfw, DbBook.lastReadChapterName, DbBook.lastReadChapterId, DbBook.lastReadChapterIndex, DbBook.lastReadChapterPercent, DbBook.totalChapter, DbBook.totalReadTime, DbBook.totalListenedTime, DbBook.follow, DbBook.favorite, DbBook.hidden, DbBook.pined, DbBook.newUpdateCount, DbBook.translate, DbBook.extras, DbBook.readScore, DbBook.lastUpdate, DbBook.lastRead, DbBook.createAt, DbBook.updateAt\nFROM DbBook\nWHERE id = ?\nLIMIT 1", kb4Var, 1, new f0(this, 26));
            default:
                return ((qj) ((yf1) b92Var).a).E(-410001490, "SELECT translate\nFROM DbBook\nWHERE id = ?\nLIMIT 1", kb4Var, 1, new f0(this, 27));
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
            case 1:
                ((qj) ((yf1) b92Var).a).R(new String[]{"DbBook"}, v34Var);
                break;
            case 2:
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
                return "DbBook.sq:getByCategory";
            case 1:
                return "DbBook.sq:getByPathId";
            case 2:
                return "DbBook.sq:get";
            default:
                return "DbBook.sq:getTranslate";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j82(b92 b92Var, String str, b82 b82Var, char c) {
        super(b82Var);
        str.getClass();
        this.d = b92Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j82(b92 b92Var, String str, b82 b82Var, byte b) {
        super(b82Var);
        str.getClass();
        this.d = b92Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j82(b92 b92Var, String str, b82 b82Var, int i) {
        super(b82Var);
        str.getClass();
        this.d = b92Var;
        this.c = str;
    }
}
