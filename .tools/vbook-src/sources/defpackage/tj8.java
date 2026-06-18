package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class tj8 implements jx5 {
    public final /* synthetic */ bx5 a;
    public final /* synthetic */ rg8 b;
    public final /* synthetic */ vx1 c;
    public final /* synthetic */ bx5 d;
    public final /* synthetic */ ay0 e;
    public final /* synthetic */ t07 f;
    public final /* synthetic */ yb4 s;

    public tj8(bx5 bx5Var, rg8 rg8Var, vx1 vx1Var, bx5 bx5Var2, ay0 ay0Var, t07 t07Var, yb4 yb4Var) {
        this.a = bx5Var;
        this.b = rg8Var;
        this.c = vx1Var;
        this.d = bx5Var2;
        this.e = ay0Var;
        this.f = t07Var;
        this.s = yb4Var;
    }

    public final void A(mx5 mx5Var, bx5 bx5Var) {
        bx5 bx5Var2 = this.a;
        rg8 rg8Var = this.b;
        jt1 jt1Var = null;
        if (bx5Var == bx5Var2) {
            rg8Var.a = ah1.J(this.c, null, null, new ck7(this.f, this.s, jt1Var, 4), 3);
            return;
        }
        if (bx5Var == this.d) {
            yd5 yd5Var = (yd5) rg8Var.a;
            if (yd5Var != null) {
                yd5Var.cancel(null);
            }
            rg8Var.a = null;
        }
        if (bx5Var == bx5.ON_DESTROY) {
            this.e.resumeWith(heb.a);
        }
    }
}
