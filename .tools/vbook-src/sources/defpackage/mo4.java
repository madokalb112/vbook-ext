package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mo4 extends qtb {
    public final aw5 c;
    public final f4b d;
    public final ly8 e;
    public final fr9 f;
    public yd5 s;

    public mo4(aw5 aw5Var, f4b f4bVar, ly8 ly8Var) {
        this.c = aw5Var;
        this.d = f4bVar;
        this.e = ly8Var;
        lc3 lc3Var = lc3.a;
        this.f = gr9.a(new ko4(lc3Var, lc3Var));
    }

    public final void j(String str) {
        str.getClass();
        yd5 yd5Var = this.s;
        if (yd5Var != null) {
            yd5Var.cancel(null);
        }
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        this.s = g(za1VarA, nh2.c, new lq0(this, str, (jt1) null));
    }

    public final void k(String str) {
        str.getClass();
        vx1 vx1VarA = utb.a(this);
        aj2 aj2Var = rw2.a;
        g(vx1VarA, nh2.c, new lo4(this, str, null, 1));
    }
}
