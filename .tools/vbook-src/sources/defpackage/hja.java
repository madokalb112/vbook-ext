package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hja extends ma8 {
    public final y78 e;

    public hja(y78 y78Var) {
        this.e = y78Var;
    }

    @Override // defpackage.ma8
    public final void j(String str, String str2) {
        str.getClass();
        str2.getClass();
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new lq8(this, str, str2, null, 20));
    }

    @Override // defpackage.ma8
    public final void k() {
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new dd9(this, (jt1) null, 11));
    }

    @Override // defpackage.ma8
    public final void l(String str) {
        str.getClass();
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new b69(this, str, null, 26));
    }

    @Override // defpackage.ma8
    public final Object n(byte[] bArr, jt1 jt1Var) {
        String strConcat = "VietPhrase_".concat(zk4.i(zk4.j(), "yyyyMMdd_HHmmss"));
        jt1 jt1Var2 = null;
        fja fjaVar = new fja(bArr, jt1Var2, 1);
        aj2 aj2Var = rw2.a;
        return ah1.b0(r76.a, new xw3(strConcat, "txt", fjaVar, jt1Var2, 0), jt1Var);
    }

    @Override // defpackage.ma8
    public final b24 o() {
        pp1 pp1VarR = qx1.R(((c98) this.e).a.F.a0(0));
        aj2 aj2Var = rw2.a;
        return new kb3(qx1.E(pp1VarR, nh2.c), 20);
    }

    @Override // defpackage.ma8
    public final void p(bi5 bi5Var, lm8 lm8Var) {
        lm8Var.getClass();
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new lq8(this, bi5Var, lm8Var, null, 21));
    }
}
