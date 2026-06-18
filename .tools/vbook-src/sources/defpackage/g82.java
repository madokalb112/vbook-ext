package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class g82 extends ra8 {
    public final /* synthetic */ int b = 1;
    public final Object c;
    public final /* synthetic */ yf1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g82(n92 n92Var, String str, oc2 oc2Var) {
        super(oc2Var);
        str.getClass();
        this.d = n92Var;
        this.c = str;
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
                ((qj) ((yf1) ((b92) yf1Var)).a).p(new String[]{"DbBookmark"}, v34Var);
                break;
            case 2:
                ((qj) ((yf1) ((b92) yf1Var)).a).p(new String[]{"DbChapter"}, v34Var);
                break;
            case 3:
                ((qj) ((yf1) ((n92) yf1Var)).a).p(new String[]{"DbEmoji"}, v34Var);
                break;
            case 4:
                ((qj) ((yf1) ((n92) yf1Var)).a).p(new String[]{"DbExtensionLocalStorage"}, v34Var);
                break;
            case 5:
                ((qj) ((yf1) ((b92) yf1Var)).a).p(new String[]{"DbPage"}, v34Var);
                break;
            case 6:
                ((qj) ((yf1) ((b92) yf1Var)).a).p(new String[]{"DbQtWord"}, v34Var);
                break;
            default:
                ((qj) ((yf1) ((n92) yf1Var)).a).p(new String[]{"DbTTSWord"}, v34Var);
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
                List list = (List) this.c;
                String strI = b92.I(b92Var, list.size());
                return ((qj) ((yf1) b92Var).a).E((Integer) null, cw9.u("\n          |SELECT COUNT(*)\n          |FROM DbBook\n          |WHERE format IN " + strI + " AND location = 1\n          "), kb4Var, list.size(), new v(27, this, b92Var));
            case 1:
                return ((qj) ((yf1) ((b92) yf1Var)).a).E(-826947286, "SELECT DbBookmark.id, DbBookmark.bookId, DbBookmark.chapterIndex, DbBookmark.chapterName, DbBookmark.type, DbBookmark.content, DbBookmark.description, DbBookmark.color, DbBookmark.startPosition, DbBookmark.endPosition, DbBookmark.createAt\nFROM DbBookmark\nWHERE bookId = ?\nORDER BY createAt DESC", kb4Var, 1, new f0(this, 28));
            case 2:
                return ((qj) ((yf1) ((b92) yf1Var)).a).E(-1363244384, "SELECT DbChapter.id, DbChapter.bookId, DbChapter.pathId, DbChapter.position, DbChapter.path, DbChapter.count, DbChapter.downloaded, DbChapter.pay, DbChapter.lock, DbChapter.lastRead, DbChapter.createAt, DbChapter.updateAt\nFROM DbChapter\nWHERE bookId = ?\nORDER BY position ASC", kb4Var, 1, new i92(this, 6));
            case 3:
                return ((qj) ((yf1) ((n92) yf1Var)).a).E(1453774010, "SELECT DbEmoji.id, DbEmoji.category, DbEmoji.url, DbEmoji.lastUse\nFROM DbEmoji\nWHERE category = ?", kb4Var, 1, new i92(this, 17));
            case 4:
                return ((qj) ((yf1) ((n92) yf1Var)).a).E(-1925663829, "SELECT DbExtensionLocalStorage.id, DbExtensionLocalStorage.extensionId, DbExtensionLocalStorage.key, DbExtensionLocalStorage.content FROM DbExtensionLocalStorage\nWHERE extensionId = ?", kb4Var, 1, new i92(this, 20));
            case 5:
                return ((qj) ((yf1) ((b92) yf1Var)).a).E(-208212790, "SELECT DbPage.id, DbPage.bookId, DbPage.position, DbPage.path, DbPage.createAt, DbPage.updateAt\nFROM DbPage\nWHERE bookId = ?\nORDER BY position ASC", kb4Var, 1, new rb2(this, 4));
            case 6:
                return ((qj) ((yf1) ((b92) yf1Var)).a).E(1435498232, "SELECT DbQtWord.id, DbQtWord.bookId, DbQtWord.word, DbQtWord.trans, DbQtWord.type, DbQtWord.mode, DbQtWord.createAt, DbQtWord.updateAt\nFROM DbQtWord\nWHERE bookId = ?\nORDER BY createAt ASC", kb4Var, 1, new rb2(this, 7));
            default:
                return ((qj) ((yf1) ((n92) yf1Var)).a).E(1406826892, "SELECT DbTTSWord.id, DbTTSWord.word, DbTTSWord.replace, DbTTSWord.ignoreCase, DbTTSWord.createAt, DbTTSWord.updateAt\nFROM DbTTSWord\nWHERE word = ?\nLIMIT 1", kb4Var, 1, new rb2(this, 13));
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
                ((qj) ((yf1) ((b92) yf1Var)).a).R(new String[]{"DbBookmark"}, v34Var);
                break;
            case 2:
                ((qj) ((yf1) ((b92) yf1Var)).a).R(new String[]{"DbChapter"}, v34Var);
                break;
            case 3:
                ((qj) ((yf1) ((n92) yf1Var)).a).R(new String[]{"DbEmoji"}, v34Var);
                break;
            case 4:
                ((qj) ((yf1) ((n92) yf1Var)).a).R(new String[]{"DbExtensionLocalStorage"}, v34Var);
                break;
            case 5:
                ((qj) ((yf1) ((b92) yf1Var)).a).R(new String[]{"DbPage"}, v34Var);
                break;
            case 6:
                ((qj) ((yf1) ((b92) yf1Var)).a).R(new String[]{"DbQtWord"}, v34Var);
                break;
            default:
                ((qj) ((yf1) ((n92) yf1Var)).a).R(new String[]{"DbTTSWord"}, v34Var);
                break;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "DbBook.sq:countByShelfFormats";
            case 1:
                return "DbBookmark.sq:getBookmarks";
            case 2:
                return "DbChapter.sq:getChapters";
            case 3:
                return "DbEmoji.sq:getEmojiByCategory";
            case 4:
                return "DbExtensionLocalStorage.sq:getByExtensionId";
            case 5:
                return "DbPage.sq:getPages";
            case 6:
                return "DbQtWord.sq:getBookOnlyWords";
            default:
                return "DbTTSWord.sq:getByName";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g82(n92 n92Var, String str, sa2 sa2Var) {
        super(sa2Var);
        str.getClass();
        this.d = n92Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g82(n92 n92Var, String str, sa2 sa2Var, byte b) {
        super(sa2Var);
        str.getClass();
        this.d = n92Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g82(b92 b92Var, String str, rb2 rb2Var) {
        super(rb2Var);
        str.getClass();
        this.d = b92Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g82(b92 b92Var, String str, d92 d92Var) {
        super(d92Var);
        str.getClass();
        this.d = b92Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g82(b92 b92Var, String str, ec2 ec2Var) {
        super(ec2Var);
        str.getClass();
        this.d = b92Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g82(b92 b92Var, String str, i92 i92Var) {
        super(i92Var);
        str.getClass();
        this.d = b92Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g82(b92 b92Var, List list, hu1 hu1Var) {
        super(hu1Var);
        this.d = b92Var;
        this.c = list;
    }
}
