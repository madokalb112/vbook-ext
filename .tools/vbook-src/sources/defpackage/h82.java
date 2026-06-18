package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class h82 extends ra8 {
    public final /* synthetic */ int b;
    public final int c;
    public final /* synthetic */ yf1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h82(yf1 yf1Var, int i, kb4 kb4Var, int i2) {
        super(kb4Var);
        this.b = i2;
        this.d = yf1Var;
        this.c = i;
    }

    @Override // defpackage.ra8
    public final void a(v34 v34Var) {
        int i = this.b;
        yf1 yf1Var = this.d;
        switch (i) {
            case 0:
                ((qj) ((yf1) ((b92) yf1Var)).a).p(new String[]{"DbBook"}, v34Var);
                break;
            case 1:
                ((qj) ((yf1) ((b92) yf1Var)).a).p(new String[]{"DbBook"}, v34Var);
                break;
            default:
                ((qj) ((yf1) ((b92) yf1Var)).a).p(new String[]{"DbQtWord"}, v34Var);
                break;
        }
    }

    @Override // defpackage.ra8
    public final va8 b(kb4 kb4Var) {
        int i = this.b;
        yf1 yf1Var = this.d;
        switch (i) {
            case 0:
                b92 b92Var = (b92) yf1Var;
                return ((qj) ((yf1) b92Var).a).E(344107892, "SELECT COUNT(*)\nFROM DbBook\nWHERE type = ? AND location = 1", kb4Var, 1, new v(28, b92Var, this));
            case 1:
                b92 b92Var2 = (b92) yf1Var;
                return ((qj) ((yf1) b92Var2).a).E(-843056742, "SELECT DbBook.id, DbBook.name, DbBook.author, DbBook.cover, DbBook.type, DbBook.format, DbBook.category, DbBook.language, DbBook.pathId, DbBook.path, DbBook.source, DbBook.extensionId, DbBook.status, DbBook.location, DbBook.description, DbBook.isNsfw, DbBook.lastReadChapterName, DbBook.lastReadChapterId, DbBook.lastReadChapterIndex, DbBook.lastReadChapterPercent, DbBook.totalChapter, DbBook.totalReadTime, DbBook.totalListenedTime, DbBook.follow, DbBook.favorite, DbBook.hidden, DbBook.pined, DbBook.newUpdateCount, DbBook.translate, DbBook.extras, DbBook.readScore, DbBook.lastUpdate, DbBook.lastRead, DbBook.createAt, DbBook.updateAt\nFROM DbBook\nWHERE location = ? AND hidden = 0\nORDER BY lastRead DESC", kb4Var, 1, new n82(1, b92Var2, this));
            default:
                b92 b92Var3 = (b92) yf1Var;
                return ((qj) ((yf1) b92Var3).a).E(1961741469, "SELECT DbQtWord.id, DbQtWord.bookId, DbQtWord.word, DbQtWord.trans, DbQtWord.type, DbQtWord.mode, DbQtWord.createAt, DbQtWord.updateAt\nFROM DbQtWord\nWHERE bookId = 'general' AND type = ?\nORDER BY createAt DESC", kb4Var, 1, new n82(14, b92Var3, this));
        }
    }

    @Override // defpackage.ra8
    public final void f(v34 v34Var) {
        int i = this.b;
        yf1 yf1Var = this.d;
        v34Var.getClass();
        switch (i) {
            case 0:
                ((qj) ((yf1) ((b92) yf1Var)).a).R(new String[]{"DbBook"}, v34Var);
                break;
            case 1:
                ((qj) ((yf1) ((b92) yf1Var)).a).R(new String[]{"DbBook"}, v34Var);
                break;
            default:
                ((qj) ((yf1) ((b92) yf1Var)).a).R(new String[]{"DbQtWord"}, v34Var);
                break;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "DbBook.sq:countByShelfType";
            case 1:
                return "DbBook.sq:getInLocation";
            default:
                return "DbQtWord.sq:getGeneralWords";
        }
    }
}
