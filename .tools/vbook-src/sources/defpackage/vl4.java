package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class vl4 implements yb4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ib4 c;
    public final /* synthetic */ kb4 d;

    public /* synthetic */ vl4(boolean z, ib4 ib4Var, kb4 kb4Var) {
        this.b = z;
        this.c = ib4Var;
        this.d = kb4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        kb4 kb4Var = this.d;
        ib4 ib4Var = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                p7c.p(z, kb4Var, ib4Var, (dd4) obj, qu1.x0(1));
                break;
            default:
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    boolean z2 = !z;
                    boolean zF = dd4Var.f(ib4Var) | dd4Var.f(kb4Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == vl1.a) {
                        objQ = new wl4(1, ib4Var, kb4Var);
                        dd4Var.p0(objQ);
                    }
                    lc5.J((ib4) objQ, null, z2, null, null, null, t1c.m, dd4Var, 805306368, 506);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ vl4(boolean z, kb4 kb4Var, ib4 ib4Var, int i) {
        this.b = z;
        this.d = kb4Var;
        this.c = ib4Var;
    }
}
