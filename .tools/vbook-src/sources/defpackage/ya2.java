package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ya2 extends ra8 {
    public final /* synthetic */ int b = 1;
    public final String c;
    public final String d;
    public final /* synthetic */ yf1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya2(b92 b92Var, String str, String str2, ec2 ec2Var) {
        super(ec2Var);
        str.getClass();
        str2.getClass();
        this.e = b92Var;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.ra8
    public final void a(v34 v34Var) {
        int i = this.b;
        yf1 yf1Var = this.e;
        switch (i) {
            case 0:
                ((qj) ((yf1) ((n92) yf1Var)).a).p(new String[]{"DbExtensionLocalStorage"}, v34Var);
                break;
            case 1:
                ((qj) ((yf1) ((b92) yf1Var)).a).p(new String[]{"DbQtWord"}, v34Var);
                break;
            default:
                ((qj) ((yf1) ((b92) yf1Var)).a).p(new String[]{"DbTocLink"}, v34Var);
                break;
        }
    }

    @Override // defpackage.ra8
    public final va8 b(kb4 kb4Var) {
        int i = this.b;
        yf1 yf1Var = this.e;
        switch (i) {
            case 0:
                return ((qj) ((yf1) ((n92) yf1Var)).a).E(489063635, "SELECT content FROM DbExtensionLocalStorage\nWHERE extensionId = ? AND key = ?\nLIMIT 1", kb4Var, 2, new i92(this, 21));
            case 1:
                return ((qj) ((yf1) ((b92) yf1Var)).a).E(1409449598, "SELECT DbQtWord.id, DbQtWord.bookId, DbQtWord.word, DbQtWord.trans, DbQtWord.type, DbQtWord.mode, DbQtWord.createAt, DbQtWord.updateAt\nFROM DbQtWord\nWHERE word = ? AND bookId = ?\nLIMIT 1", kb4Var, 2, new rb2(this, 8));
            default:
                return ((qj) ((yf1) ((b92) yf1Var)).a).E((Integer) null, cw9.u("\n    |SELECT DbTocLink.id, DbTocLink.bookId, DbTocLink.title, DbTocLink.path, DbTocLink.parentId, DbTocLink.position, DbTocLink.createAt, DbTocLink.updateAt\n    |FROM DbTocLink\n    |WHERE bookId = ? AND path " + (this.d == null ? "IS" : "=") + " ?\n    |LIMIT 1\n    "), kb4Var, 2, new rb2(this, 14));
        }
    }

    @Override // defpackage.ra8
    public final void f(v34 v34Var) {
        int i = this.b;
        yf1 yf1Var = this.e;
        v34Var.getClass();
        switch (i) {
            case 0:
                ((qj) ((yf1) ((n92) yf1Var)).a).R(new String[]{"DbExtensionLocalStorage"}, v34Var);
                break;
            case 1:
                ((qj) ((yf1) ((b92) yf1Var)).a).R(new String[]{"DbQtWord"}, v34Var);
                break;
            default:
                ((qj) ((yf1) ((b92) yf1Var)).a).R(new String[]{"DbTocLink"}, v34Var);
                break;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "DbExtensionLocalStorage.sq:getByKeyAndExtensionId";
            case 1:
                return "DbQtWord.sq:getByName";
            default:
                return "DbTocLink.sq:getByPath";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya2(b92 b92Var, String str, String str2, vc2 vc2Var) {
        super(vc2Var);
        str.getClass();
        this.e = b92Var;
        this.c = str;
        this.d = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya2(n92 n92Var, String str, String str2, sa2 sa2Var) {
        super(sa2Var);
        str.getClass();
        this.e = n92Var;
        this.c = str;
        this.d = str2;
    }
}
