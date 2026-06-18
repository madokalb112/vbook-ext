package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class tc8 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vc8 b;

    public /* synthetic */ tc8(vc8 vc8Var, int i) {
        this.a = i;
        this.b = vc8Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vc8 vc8Var = this.b;
        int i2 = 1;
        dd4 dd4Var = (dd4) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    jv3.e(dj5.a.a(vc8Var.I), jf0.G(1240883135, new tc8(vc8Var, i2), dd4Var), dd4Var, 56);
                }
                break;
            default:
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    fw.a(dd4Var, 0);
                    boolean zH = dd4Var.h(vc8Var);
                    Object objQ = dd4Var.Q();
                    if (zH || objQ == vl1.a) {
                        objQ = new ne0(vc8Var, null, 20);
                        dd4Var.p0(objQ);
                    }
                    lc5.u((yb4) objQ, dd4Var, hebVar);
                }
                break;
        }
        return hebVar;
    }
}
