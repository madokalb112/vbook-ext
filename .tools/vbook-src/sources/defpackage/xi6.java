package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class xi6 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ a07 d;

    public /* synthetic */ xi6(boolean z, kb4 kb4Var, a07 a07Var, int i) {
        this.a = i;
        this.b = z;
        this.c = kb4Var;
        this.d = a07Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj3 = vl1.a;
        a07 a07Var = this.d;
        kb4 kb4Var = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    boolean zG = dd4Var.g(z) | dd4Var.f(kb4Var);
                    Object objQ = dd4Var.Q();
                    if (zG || objQ == obj3) {
                        objQ = new zi6(z, kb4Var, a07Var, 1);
                        dd4Var.p0(objQ);
                    }
                    lc5.J((ib4) objQ, null, false, null, null, null, fw.f, dd4Var, 805306368, 510);
                }
                break;
            default:
                dd4 dd4Var2 = (dd4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dd4Var2.V(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    dd4Var2.Y();
                } else {
                    boolean zG2 = dd4Var2.g(z) | dd4Var2.f(kb4Var);
                    Object objQ2 = dd4Var2.Q();
                    if (zG2 || objQ2 == obj3) {
                        objQ2 = new zi6(z, kb4Var, a07Var, 0);
                        dd4Var2.p0(objQ2);
                    }
                    lc5.J((ib4) objQ2, null, false, null, null, null, gjb.m, dd4Var2, 805306368, 510);
                }
                break;
        }
        return hebVar;
    }
}
