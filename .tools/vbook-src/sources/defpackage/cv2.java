package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cv2 extends qtb {
    public final ly8 c;
    public final fr9 d = gr9.a(new av2(lc3.a));
    public yd5 e;

    public cv2(ly8 ly8Var) {
        this.c = ly8Var;
    }

    public final void j(String str) {
        str.getClass();
        yd5 yd5Var = this.e;
        if (yd5Var != null) {
            yd5Var.cancel(null);
        }
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        this.e = g(za1VarA, nh2.c, new qi(this, str, (jt1) null));
    }

    public final void k(String str) {
        str.getClass();
        vx1 vx1VarA = utb.a(this);
        aj2 aj2Var = rw2.a;
        g(vx1VarA, nh2.c, new bv2(this, str, null, 1));
    }
}
