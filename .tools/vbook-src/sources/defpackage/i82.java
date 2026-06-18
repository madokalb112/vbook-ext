package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class i82 extends ra8 {
    public final /* synthetic */ int b = 0;
    public final String c;
    public final long d;
    public final /* synthetic */ yf1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i82(n92 n92Var, String str, long j, pb2 pb2Var) {
        super(pb2Var);
        str.getClass();
        this.e = n92Var;
        this.c = str;
        this.d = j;
    }

    @Override // defpackage.ra8
    public final void a(v34 v34Var) {
        int i = this.b;
        yf1 yf1Var = this.e;
        switch (i) {
            case 0:
                ((qj) ((yf1) ((b92) yf1Var)).a).p(new String[]{"DbBook"}, v34Var);
                break;
            case 1:
                ((qj) ((yf1) ((n92) yf1Var)).a).p(new String[]{"DbBrowserHistory"}, v34Var);
                break;
            default:
                ((qj) ((yf1) ((n92) yf1Var)).a).p(new String[]{"DbSearch"}, v34Var);
                break;
        }
    }

    @Override // defpackage.ra8
    public final va8 b(kb4 kb4Var) {
        int i = this.b;
        yf1 yf1Var = this.e;
        switch (i) {
            case 0:
                return ((qj) ((yf1) ((b92) yf1Var)).a).E(944957647, "SELECT DbBook.id, DbBook.name, DbBook.author, DbBook.cover, DbBook.type, DbBook.format, DbBook.category, DbBook.language, DbBook.pathId, DbBook.path, DbBook.source, DbBook.extensionId, DbBook.status, DbBook.location, DbBook.description, DbBook.isNsfw, DbBook.lastReadChapterName, DbBook.lastReadChapterId, DbBook.lastReadChapterIndex, DbBook.lastReadChapterPercent, DbBook.totalChapter, DbBook.totalReadTime, DbBook.totalListenedTime, DbBook.follow, DbBook.favorite, DbBook.hidden, DbBook.pined, DbBook.newUpdateCount, DbBook.translate, DbBook.extras, DbBook.readScore, DbBook.lastUpdate, DbBook.lastRead, DbBook.createAt, DbBook.updateAt\nFROM DbBook\nWHERE hidden = 0\n    AND (name LIKE ('%' || ? || '%')\n        OR author LIKE ('%' || ? || '%'))\nORDER BY lastRead DESC\nLIMIT ?", kb4Var, 3, new f0(this, 20));
            case 1:
                return ((qj) ((yf1) ((n92) yf1Var)).a).E(-820839486, "SELECT DbBrowserHistory.url, DbBrowserHistory.title, DbBrowserHistory.createAt FROM DbBrowserHistory\nWHERE title LIKE ('%' || ? || '%') OR url LIKE ('%' || ? || '%')\nORDER BY createAt DESC\nLIMIT ?", kb4Var, 3, new i92(this, 0));
            default:
                return ((qj) ((yf1) ((n92) yf1Var)).a).E(-1608154930, "SELECT DbSearch.key, DbSearch.createAt\nFROM DbSearch\nWHERE key LIKE ('%' || ? || '%')\nORDER BY createAt DESC\nLIMIT ?", kb4Var, 2, new rb2(this, 11));
        }
    }

    @Override // defpackage.ra8
    public final void f(v34 v34Var) {
        int i = this.b;
        yf1 yf1Var = this.e;
        v34Var.getClass();
        switch (i) {
            case 0:
                ((qj) ((yf1) ((b92) yf1Var)).a).R(new String[]{"DbBook"}, v34Var);
                break;
            case 1:
                ((qj) ((yf1) ((n92) yf1Var)).a).R(new String[]{"DbBrowserHistory"}, v34Var);
                break;
            default:
                ((qj) ((yf1) ((n92) yf1Var)).a).R(new String[]{"DbSearch"}, v34Var);
                break;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "DbBook.sq:find";
            case 1:
                return "DbBrowserHistory.sq:findHistory";
            default:
                return "DbSearch.sq:find";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i82(n92 n92Var, String str, hu1 hu1Var) {
        super(hu1Var);
        this.e = n92Var;
        this.c = str;
        this.d = 10L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i82(b92 b92Var, String str, long j, b82 b82Var) {
        super(b82Var);
        this.e = b92Var;
        this.c = str;
        this.d = j;
    }
}
