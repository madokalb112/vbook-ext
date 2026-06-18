package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ul4 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ib4 b;
    public final /* synthetic */ kb4 c;

    public /* synthetic */ ul4(int i, ib4 ib4Var, kb4 kb4Var) {
        this.a = i;
        this.b = ib4Var;
        this.c = kb4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj3 = vl1.a;
        kb4 kb4Var = this.c;
        ib4 ib4Var = this.b;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(1 & iIntValue, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    boolean zF = dd4Var.f(ib4Var) | dd4Var.f(kb4Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj3) {
                        objQ = new wl4(0, ib4Var, kb4Var);
                        dd4Var.p0(objQ);
                    }
                    lc5.J((ib4) objQ, null, false, null, null, null, p7c.g, dd4Var, 805306368, 510);
                }
                break;
            case 1:
                dd4 dd4Var2 = (dd4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dd4Var2.Y();
                } else {
                    boolean zF2 = dd4Var2.f(ib4Var) | dd4Var2.f(kb4Var);
                    Object objQ2 = dd4Var2.Q();
                    if (zF2 || objQ2 == obj3) {
                        objQ2 = new wl4(7, ib4Var, kb4Var);
                        dd4Var2.p0(objQ2);
                    }
                    lc5.J((ib4) objQ2, null, false, null, null, null, yb0.p, dd4Var2, 805306368, 510);
                }
                break;
            default:
                dd4 dd4Var3 = (dd4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!dd4Var3.V(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dd4Var3.Y();
                } else {
                    boolean zF3 = dd4Var3.f(ib4Var) | dd4Var3.f(kb4Var);
                    Object objQ3 = dd4Var3.Q();
                    if (zF3 || objQ3 == obj3) {
                        objQ3 = new wl4(8, ib4Var, kb4Var);
                        dd4Var3.p0(objQ3);
                    }
                    lc5.J((ib4) objQ3, null, false, null, null, null, vo1.n, dd4Var3, 805306368, 510);
                }
                break;
        }
        return hebVar;
    }
}
