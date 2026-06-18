package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cd2 extends ra8 {
    public final /* synthetic */ int b = 0;
    public final String c;
    public final /* synthetic */ b92 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd2(b92 b92Var, String str, bd2 bd2Var) {
        super(bd2Var);
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
                ((qj) ((yf1) b92Var).a).p(new String[]{"DbTrash"}, v34Var);
                break;
            default:
                ((qj) ((yf1) b92Var).a).p(new String[]{"DbTrash"}, v34Var);
                break;
        }
    }

    @Override // defpackage.ra8
    public final va8 b(kb4 kb4Var) {
        int i = this.b;
        b92 b92Var = this.d;
        switch (i) {
            case 0:
                return ((qj) ((yf1) b92Var).a).E(-1321977948, "SELECT DbTrash.id, DbTrash.bookId, DbTrash.word, DbTrash.type, DbTrash.regex, DbTrash.createAt, DbTrash.updateAt\nFROM DbTrash\nWHERE bookId = ? AND type = 0\nORDER BY createAt ASC", kb4Var, 1, new rb2(this, 17));
            default:
                return ((qj) ((yf1) b92Var).a).E(-989669999, "SELECT DbTrash.id, DbTrash.bookId, DbTrash.word, DbTrash.type, DbTrash.regex, DbTrash.createAt, DbTrash.updateAt\nFROM DbTrash\nWHERE word = ?", kb4Var, 1, new rb2(this, 18));
        }
    }

    @Override // defpackage.ra8
    public final void f(v34 v34Var) {
        int i = this.b;
        b92 b92Var = this.d;
        v34Var.getClass();
        switch (i) {
            case 0:
                ((qj) ((yf1) b92Var).a).R(new String[]{"DbTrash"}, v34Var);
                break;
            default:
                ((qj) ((yf1) b92Var).a).R(new String[]{"DbTrash"}, v34Var);
                break;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "DbTrash.sq:getBookTextWords";
            default:
                return "DbTrash.sq:getByName";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd2(b92 b92Var, String str, bd2 bd2Var, byte b) {
        super(bd2Var);
        str.getClass();
        this.d = b92Var;
        this.c = str;
    }
}
