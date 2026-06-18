package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class an6 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ kb4 c;

    public /* synthetic */ an6(int i, int i2, kb4 kb4Var, boolean z) {
        this.a = i2;
        this.b = z;
        this.c = kb4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = vl1.a;
        heb hebVar = heb.a;
        kb4 kb4Var = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    boolean z2 = !z;
                    boolean zF = dd4Var.f(kb4Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj3) {
                        objQ = new tk6(5, kb4Var);
                        dd4Var.p0(objQ);
                    }
                    lc5.J((ib4) objQ, null, z2, null, null, null, m79.o, dd4Var, 805306368, 506);
                }
                break;
            case 1:
                dd4 dd4Var2 = (dd4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dd4Var2.Y();
                } else {
                    boolean z3 = !z;
                    boolean zF2 = dd4Var2.f(kb4Var);
                    Object objQ2 = dd4Var2.Q();
                    if (zF2 || objQ2 == obj3) {
                        objQ2 = new tk6(6, kb4Var);
                        dd4Var2.p0(objQ2);
                    }
                    lc5.J((ib4) objQ2, null, z3, null, null, null, fw.j, dd4Var2, 805306368, 506);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                tu1.h(z, kb4Var, (dd4) obj, qu1.x0(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                tu1.j(z, kb4Var, (dd4) obj, qu1.x0(1));
                break;
            default:
                ((Integer) obj2).getClass();
                tu1.i(z, kb4Var, (dd4) obj, qu1.x0(1));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ an6(int i, kb4 kb4Var, boolean z) {
        this.a = i;
        this.b = z;
        this.c = kb4Var;
    }
}
