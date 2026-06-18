package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class qtb extends rtb {
    public final ptb b = new ptb(this);

    public static void h(qtb qtbVar, vx1 vx1Var, yb4 yb4Var) {
        qtbVar.getClass();
        vx1Var.getClass();
        ptb ptbVar = qtbVar.b;
        ptbVar.getClass();
        ah1.J(vx1Var, ptbVar, null, yb4Var, 2);
    }

    public void e(Throwable th) {
        th.getClass();
        String strD0 = i12.d0(th);
        if (pu.a()) {
            e46 e46Var = e46.b;
            k89 k89Var = k89.c;
            if (e46Var.a.a.compareTo(k89Var) <= 0) {
                e46Var.a(k89Var, "Log", strD0, (Throwable) null);
            }
        }
    }

    public final yd5 g(vx1 vx1Var, jx1 jx1Var, yb4 yb4Var) {
        vx1Var.getClass();
        jx1Var.getClass();
        return ah1.J(vx1Var, jx1Var.plus(this.b), null, yb4Var, 2);
    }

    public final void i(pp1 pp1Var, Object obj) {
        pp1Var.getClass();
        ah1.J(vtb.a(this), null, null, new qoa(pp1Var, obj, (jt1) null), 3);
    }
}
