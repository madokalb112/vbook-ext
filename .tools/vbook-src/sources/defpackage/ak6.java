package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ak6 implements yb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ q83 b;
    public final /* synthetic */ yb4 c;

    public /* synthetic */ ak6(q83 q83Var, yb4 yb4Var) {
        this.b = q83Var;
        this.c = yb4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        yb4 yb4Var = this.c;
        q83 q83Var = this.b;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    boolean z = !bw9.a0((String) q83Var.b.getValue());
                    boolean zF = dd4Var.f(yb4Var) | dd4Var.f(q83Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == vl1.a) {
                        objQ = new vf6(9, yb4Var, q83Var);
                        dd4Var.p0(objQ);
                    }
                    lc5.J((ib4) objQ, null, z, null, null, null, jf0.G(1646556775, new nl9(q83Var, 24), dd4Var), dd4Var, 805306368, 506);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                pu1.s(q83Var, yb4Var, (dd4) obj, qu1.x0(1));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ ak6(q83 q83Var, yb4 yb4Var, int i) {
        this.b = q83Var;
        this.c = yb4Var;
    }
}
