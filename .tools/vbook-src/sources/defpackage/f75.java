package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class f75 {
    public final g07 a = new g07(new d75[16]);
    public final cn7 b = dk9.x(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final cn7 d = dk9.x(Boolean.TRUE);

    public final void a(dd4 dd4Var, int i) {
        dd4Var.h0(-318043801);
        int i2 = (dd4Var.h(this) ? 4 : 2) | i;
        if (dd4Var.V(i2 & 1, (i2 & 3) != 2)) {
            Object objQ = dd4Var.Q();
            jt1 jt1Var = null;
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = dk9.x((Object) null);
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) objQ;
            if (((Boolean) this.d.getValue()).booleanValue() || ((Boolean) this.b.getValue()).booleanValue()) {
                dd4Var.f0(-144841960);
                boolean zH = dd4Var.h(this);
                Object objQ2 = dd4Var.Q();
                if (zH || objQ2 == obj) {
                    objQ2 = new vg(a07Var, this, jt1Var, 25);
                    dd4Var.p0(objQ2);
                }
                lc5.u((yb4) objQ2, dd4Var, this);
                dd4Var.q(false);
            } else {
                dd4Var.f0(-143455237);
                dd4Var.q(false);
            }
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ah(this, i, 20);
        }
    }
}
