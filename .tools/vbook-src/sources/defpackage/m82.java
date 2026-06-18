package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class m82 extends ra8 {
    public final /* synthetic */ int b = 2;
    public final int c;
    public final Object d;
    public final /* synthetic */ yf1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m82(b92 b92Var, String str, int i, aa2 aa2Var) {
        super(aa2Var);
        str.getClass();
        this.e = b92Var;
        this.d = str;
        this.c = i;
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
                ((qj) ((yf1) ((b92) yf1Var)).a).p(new String[]{"DbBookmark"}, v34Var);
                break;
            case 2:
                ((qj) ((yf1) ((b92) yf1Var)).a).p(new String[]{"DbContent"}, v34Var);
                break;
            default:
                ((qj) ((yf1) ((b92) yf1Var)).a).p(new String[]{"DbQtWord"}, v34Var);
                break;
        }
    }

    @Override // defpackage.ra8
    public final va8 b(kb4 kb4Var) {
        int i = this.b;
        yf1 yf1Var = this.e;
        switch (i) {
            case 0:
                b92 b92Var = (b92) yf1Var;
                List list = (List) this.d;
                String strI = b92.I(b92Var, list.size());
                return ((qj) ((yf1) b92Var).a).E((Integer) null, cw9.u("\n          |SELECT DbBook.id, DbBook.name, DbBook.author, DbBook.cover, DbBook.type, DbBook.format, DbBook.category, DbBook.language, DbBook.pathId, DbBook.path, DbBook.source, DbBook.extensionId, DbBook.status, DbBook.location, DbBook.description, DbBook.isNsfw, DbBook.lastReadChapterName, DbBook.lastReadChapterId, DbBook.lastReadChapterIndex, DbBook.lastReadChapterPercent, DbBook.totalChapter, DbBook.totalReadTime, DbBook.totalListenedTime, DbBook.follow, DbBook.favorite, DbBook.hidden, DbBook.pined, DbBook.newUpdateCount, DbBook.translate, DbBook.extras, DbBook.readScore, DbBook.lastUpdate, DbBook.lastRead, DbBook.createAt, DbBook.updateAt\n          |FROM DbBook\n          |WHERE location = ? AND format IN " + strI + "\n          "), kb4Var, list.size() + 1, new v(29, b92Var, this));
            case 1:
                b92 b92Var2 = (b92) yf1Var;
                return ((qj) ((yf1) b92Var2).a).E(324995578, "SELECT DbBookmark.id, DbBookmark.bookId, DbBookmark.chapterIndex, DbBookmark.chapterName, DbBookmark.type, DbBookmark.content, DbBookmark.description, DbBookmark.color, DbBookmark.startPosition, DbBookmark.endPosition, DbBookmark.createAt\nFROM DbBookmark\nWHERE bookId = ? AND type = ?\nORDER BY createAt DESC", kb4Var, 2, new n82(3, this, b92Var2));
            case 2:
                b92 b92Var3 = (b92) yf1Var;
                return ((qj) ((yf1) b92Var3).a).E(-884297845, "SELECT DbContent.id, DbContent.bookId, DbContent.position, DbContent.content, DbContent.createAt, DbContent.updateAt\nFROM DbContent\nWHERE bookId = ? AND position = ?\nLIMIT 1", kb4Var, 2, new n82(6, this, b92Var3));
            default:
                b92 b92Var4 = (b92) yf1Var;
                return ((qj) ((yf1) b92Var4).a).E(553689284, "SELECT DbQtWord.id, DbQtWord.bookId, DbQtWord.word, DbQtWord.trans, DbQtWord.type, DbQtWord.mode, DbQtWord.createAt, DbQtWord.updateAt\nFROM DbQtWord\nWHERE bookId = ? AND type = ?\nORDER BY createAt DESC", kb4Var, 2, new n82(12, this, b92Var4));
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
                ((qj) ((yf1) ((b92) yf1Var)).a).R(new String[]{"DbBookmark"}, v34Var);
                break;
            case 2:
                ((qj) ((yf1) ((b92) yf1Var)).a).R(new String[]{"DbContent"}, v34Var);
                break;
            default:
                ((qj) ((yf1) ((b92) yf1Var)).a).R(new String[]{"DbQtWord"}, v34Var);
                break;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "DbBook.sq:getInLocationByFormats";
            case 1:
                return "DbBookmark.sq:getBookmarkByType";
            case 2:
                return "DbContent.sq:getContent";
            default:
                return "DbQtWord.sq:getBookWords";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m82(b92 b92Var, String str, int i, d92 d92Var) {
        super(d92Var);
        str.getClass();
        this.e = b92Var;
        this.d = str;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m82(b92 b92Var, String str, int i, ec2 ec2Var) {
        super(ec2Var);
        str.getClass();
        this.e = b92Var;
        this.d = str;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m82(b92 b92Var, List list, b82 b82Var) {
        super(b82Var);
        this.e = b92Var;
        this.c = 1;
        this.d = list;
    }
}
