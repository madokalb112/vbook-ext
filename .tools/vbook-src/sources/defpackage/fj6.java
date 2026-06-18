package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class fj6 implements yb4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ fn2 b;
    public final /* synthetic */ kb4 c;

    public /* synthetic */ fj6(fn2 fn2Var, kb4 kb4Var, int i) {
        this.b = fn2Var;
        this.c = kb4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        kb4 kb4Var = this.c;
        fn2 fn2Var = this.b;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    boolean zF = dd4Var.f(kb4Var) | dd4Var.f(fn2Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == vl1.a) {
                        objQ = new vf6(4, kb4Var, fn2Var);
                        dd4Var.p0(objQ);
                    }
                    lc5.J((ib4) objQ, null, false, null, null, null, sdc.h, dd4Var, 805306368, 510);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                lx1.i(fn2Var, kb4Var, (dd4) obj, qu1.x0(1));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ fj6(kb4 kb4Var, fn2 fn2Var) {
        this.c = kb4Var;
        this.b = fn2Var;
    }
}
