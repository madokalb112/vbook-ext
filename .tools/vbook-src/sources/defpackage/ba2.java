package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ba2 extends ra8 {
    public final /* synthetic */ int b = 2;
    public final String c;
    public final /* synthetic */ b92 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba2(b92 b92Var, String str, aa2 aa2Var) {
        super(aa2Var);
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
                ((qj) ((yf1) b92Var).a).p(new String[]{"DbContent"}, v34Var);
                break;
            case 1:
                ((qj) ((yf1) b92Var).a).p(new String[]{"DbContent"}, v34Var);
                break;
            case 2:
                ((qj) ((yf1) b92Var).a).p(new String[]{"DbContent"}, v34Var);
                break;
            default:
                ((qj) ((yf1) b92Var).a).p(new String[]{"DbContent"}, v34Var);
                break;
        }
    }

    @Override // defpackage.ra8
    public final va8 b(kb4 kb4Var) {
        int i = this.b;
        b92 b92Var = this.d;
        switch (i) {
            case 0:
                return ((qj) ((yf1) b92Var).a).E(-233788159, "SELECT COUNT(*)\nFROM DbContent\nWHERE bookId = ?", kb4Var, 1, new i92(this, 7));
            case 1:
                return ((qj) ((yf1) b92Var).a).E(802733743, "SELECT 1\nFROM DbContent\nWHERE id = ?\nLIMIT 1", kb4Var, 1, new i92(this, 8));
            case 2:
                return ((qj) ((yf1) b92Var).a).E(-1643429304, "SELECT DbContent.id, DbContent.bookId, DbContent.position, DbContent.content, DbContent.createAt, DbContent.updateAt\nFROM DbContent\nWHERE bookId = ?\nORDER BY position ASC", kb4Var, 1, new i92(this, 9));
            default:
                return ((qj) ((yf1) b92Var).a).E(-280727282, "SELECT DbContent.id, DbContent.bookId, DbContent.position, DbContent.content, DbContent.createAt, DbContent.updateAt\nFROM DbContent\nWHERE id = ?\nLIMIT 1", kb4Var, 1, new i92(this, 10));
        }
    }

    @Override // defpackage.ra8
    public final void f(v34 v34Var) {
        int i = this.b;
        b92 b92Var = this.d;
        v34Var.getClass();
        switch (i) {
            case 0:
                ((qj) ((yf1) b92Var).a).R(new String[]{"DbContent"}, v34Var);
                break;
            case 1:
                ((qj) ((yf1) b92Var).a).R(new String[]{"DbContent"}, v34Var);
                break;
            case 2:
                ((qj) ((yf1) b92Var).a).R(new String[]{"DbContent"}, v34Var);
                break;
            default:
                ((qj) ((yf1) b92Var).a).R(new String[]{"DbContent"}, v34Var);
                break;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "DbContent.sq:countContents";
            case 1:
                return "DbContent.sq:exist";
            case 2:
                return "DbContent.sq:getContents";
            default:
                return "DbContent.sq:get";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba2(b92 b92Var, String str, aa2 aa2Var, byte b) {
        super(aa2Var);
        this.d = b92Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba2(b92 b92Var, String str, q92 q92Var) {
        super(q92Var);
        str.getClass();
        this.d = b92Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba2(b92 b92Var, String str, q92 q92Var, byte b) {
        super(q92Var);
        str.getClass();
        this.d = b92Var;
        this.c = str;
    }
}
