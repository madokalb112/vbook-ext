package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class r92 extends ra8 {
    public final /* synthetic */ int b = 0;
    public final String c;
    public final /* synthetic */ n92 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r92(n92 n92Var, String str, q92 q92Var, byte b) {
        super(q92Var);
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
                ((qj) ((yf1) n92Var).a).p(new String[]{"DbCategory"}, v34Var);
                break;
            default:
                ((qj) ((yf1) n92Var).a).p(new String[]{"DbCategory"}, v34Var);
                break;
        }
    }

    @Override // defpackage.ra8
    public final va8 b(kb4 kb4Var) {
        int i = this.b;
        n92 n92Var = this.d;
        switch (i) {
            case 0:
                return ((qj) ((yf1) n92Var).a).E(562042029, "SELECT DbCategory.id, DbCategory.name, DbCategory.createAt\nFROM DbCategory\nWHERE name = ?\nLIMIT 1", kb4Var, 1, new i92(this, 3));
            default:
                return ((qj) ((yf1) n92Var).a).E(-341666485, "SELECT DbCategory.id, DbCategory.name, DbCategory.createAt\nFROM DbCategory\nWHERE id = ?\nLIMIT 1", kb4Var, 1, new i92(this, 4));
        }
    }

    @Override // defpackage.ra8
    public final void f(v34 v34Var) {
        int i = this.b;
        n92 n92Var = this.d;
        v34Var.getClass();
        switch (i) {
            case 0:
                ((qj) ((yf1) n92Var).a).R(new String[]{"DbCategory"}, v34Var);
                break;
            default:
                ((qj) ((yf1) n92Var).a).R(new String[]{"DbCategory"}, v34Var);
                break;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "DbCategory.sq:getByName";
            default:
                return "DbCategory.sq:get";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r92(n92 n92Var, String str, q92 q92Var) {
        super(q92Var);
        str.getClass();
        this.d = n92Var;
        this.c = str;
    }
}
