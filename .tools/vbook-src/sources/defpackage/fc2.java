package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fc2 extends ra8 {
    public final String b;
    public final int c;
    public final String d;
    public final /* synthetic */ b92 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc2(b92 b92Var, String str, int i, String str2, ec2 ec2Var) {
        super(ec2Var);
        str.getClass();
        str2.getClass();
        this.e = b92Var;
        this.b = str;
        this.c = i;
        this.d = str2;
    }

    @Override // defpackage.ra8
    public final void a(v34 v34Var) {
        ((qj) ((yf1) this.e).a).p(new String[]{"DbQtWord"}, v34Var);
    }

    @Override // defpackage.ra8
    public final va8 b(kb4 kb4Var) {
        b92 b92Var = this.e;
        return ((qj) ((yf1) b92Var).a).E(-1434769069, "SELECT DbQtWord.id, DbQtWord.bookId, DbQtWord.word, DbQtWord.trans, DbQtWord.type, DbQtWord.mode, DbQtWord.createAt, DbQtWord.updateAt\nFROM DbQtWord\nWHERE word = ? AND type = ? AND bookId = ?\nLIMIT 1", kb4Var, 3, new n82(13, this, b92Var));
    }

    @Override // defpackage.ra8
    public final void f(v34 v34Var) {
        v34Var.getClass();
        ((qj) ((yf1) this.e).a).R(new String[]{"DbQtWord"}, v34Var);
    }

    public final String toString() {
        return "DbQtWord.sq:getByNameAndType";
    }
}
