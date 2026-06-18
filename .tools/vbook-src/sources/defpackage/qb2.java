package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qb2 extends ra8 {
    public final /* synthetic */ int b = 0;
    public final String c;
    public final /* synthetic */ n92 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb2(n92 n92Var, String str, pb2 pb2Var) {
        super(pb2Var);
        str.getClass();
        this.d = n92Var;
        this.c = str;
    }

    @Override // defpackage.ra8
    public final void a(v34 v34Var) {
        int i = this.b;
        n92 n92Var = this.d;
        switch (i) {
            case 0:
                ((qj) ((yf1) n92Var).a).p(new String[]{"DbName"}, v34Var);
                break;
            case 1:
                ((qj) ((yf1) n92Var).a).p(new String[]{"DbName"}, v34Var);
                break;
            default:
                ((qj) ((yf1) n92Var).a).p(new String[]{"DbName"}, v34Var);
                break;
        }
    }

    @Override // defpackage.ra8
    public final va8 b(kb4 kb4Var) {
        int i = this.b;
        n92 n92Var = this.d;
        switch (i) {
            case 0:
                return ((qj) ((yf1) n92Var).a).E(-265295242, "SELECT DbName.id, DbName.bookId, DbName.word, DbName.replace, DbName.ignoreCase, DbName.createAt\nFROM DbName\nWHERE bookId = ?\nORDER BY createAt ASC", kb4Var, 1, new i92(this, 29));
            case 1:
                return ((qj) ((yf1) n92Var).a).E(1345454914, "SELECT DbName.id, DbName.bookId, DbName.word, DbName.replace, DbName.ignoreCase, DbName.createAt\nFROM DbName\nWHERE bookId = ? OR bookId = 'general'\nORDER BY createAt ASC", kb4Var, 1, new rb2(this, 0));
            default:
                return ((qj) ((yf1) n92Var).a).E(-495297344, "SELECT DbName.id, DbName.bookId, DbName.word, DbName.replace, DbName.ignoreCase, DbName.createAt\nFROM DbName\nWHERE word = ?", kb4Var, 1, new rb2(this, 1));
        }
    }

    @Override // defpackage.ra8
    public final void f(v34 v34Var) {
        int i = this.b;
        n92 n92Var = this.d;
        v34Var.getClass();
        switch (i) {
            case 0:
                ((qj) ((yf1) n92Var).a).R(new String[]{"DbName"}, v34Var);
                break;
            case 1:
                ((qj) ((yf1) n92Var).a).R(new String[]{"DbName"}, v34Var);
                break;
            default:
                ((qj) ((yf1) n92Var).a).R(new String[]{"DbName"}, v34Var);
                break;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "DbName.sq:getBookOnlyWords";
            case 1:
                return "DbName.sq:getBookWords";
            default:
                return "DbName.sq:getByName";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb2(n92 n92Var, String str, pb2 pb2Var, byte b) {
        super(pb2Var);
        str.getClass();
        this.d = n92Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb2(n92 n92Var, String str, sa2 sa2Var) {
        super(sa2Var);
        str.getClass();
        this.d = n92Var;
        this.c = str;
    }
}
