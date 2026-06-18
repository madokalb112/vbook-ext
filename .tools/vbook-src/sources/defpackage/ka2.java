package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ka2 extends ra8 {
    public final /* synthetic */ int b = 0;
    public final String c;
    public final /* synthetic */ b92 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka2(b92 b92Var, String str, ia2 ia2Var, byte b) {
        super(ia2Var);
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
                ((qj) ((yf1) b92Var).a).p(new String[]{"DbDownload"}, v34Var);
                break;
            case 1:
                ((qj) ((yf1) b92Var).a).p(new String[]{"DbDownload"}, v34Var);
                break;
            default:
                ((qj) ((yf1) b92Var).a).p(new String[]{"DbDownload"}, v34Var);
                break;
        }
    }

    @Override // defpackage.ra8
    public final va8 b(kb4 kb4Var) {
        int i = this.b;
        b92 b92Var = this.d;
        switch (i) {
            case 0:
                return ((qj) ((yf1) b92Var).a).E(-970197316, "SELECT DbDownload.id, DbDownload.bookId, DbDownload.title, DbDownload.image, DbDownload.path, DbDownload.start, DbDownload.end, DbDownload.downloaded, DbDownload.total, DbDownload.type, DbDownload.status, DbDownload.createAt\nFROM DbDownload\nWHERE bookId = ?", kb4Var, 1, new i92(this, 12));
            case 1:
                return ((qj) ((yf1) b92Var).a).E(987388545, "SELECT DbDownload.id, DbDownload.bookId, DbDownload.title, DbDownload.image, DbDownload.path, DbDownload.start, DbDownload.end, DbDownload.downloaded, DbDownload.total, DbDownload.type, DbDownload.status, DbDownload.createAt\nFROM DbDownload\nWHERE id = ?\nLIMIT 1", kb4Var, 1, new i92(this, 13));
            default:
                return ((qj) ((yf1) b92Var).a).E(1550152147, "SELECT status\nFROM DbDownload\nWHERE bookId = ?", kb4Var, 1, new i92(this, 14));
        }
    }

    @Override // defpackage.ra8
    public final void f(v34 v34Var) {
        int i = this.b;
        b92 b92Var = this.d;
        v34Var.getClass();
        switch (i) {
            case 0:
                ((qj) ((yf1) b92Var).a).R(new String[]{"DbDownload"}, v34Var);
                break;
            case 1:
                ((qj) ((yf1) b92Var).a).R(new String[]{"DbDownload"}, v34Var);
                break;
            default:
                ((qj) ((yf1) b92Var).a).R(new String[]{"DbDownload"}, v34Var);
                break;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "DbDownload.sq:getByBookId";
            case 1:
                return "DbDownload.sq:get";
            default:
                return "DbDownload.sq:getStatus";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka2(b92 b92Var, String str, ia2 ia2Var) {
        super(ia2Var);
        str.getClass();
        this.d = b92Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka2(b92 b92Var, String str, ia2 ia2Var, char c) {
        super(ia2Var);
        str.getClass();
        this.d = b92Var;
        this.c = str;
    }
}
