package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class ed9 extends qtb {
    public final ww5 c;
    public final f4b d;
    public final fr9 e = gr9.a(new gd9(true, lc3.a, 0, 0, false, false, false));

    public ed9(ww5 ww5Var, f4b f4bVar) {
        this.c = ww5Var;
        this.d = f4bVar;
    }

    @Override // defpackage.qtb
    public final void e(Throwable th) {
        th.getClass();
        jf0.A(th);
    }

    public abstract b24 j();

    public final void k() {
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new dd9(this, (jt1) null, 0));
    }
}
