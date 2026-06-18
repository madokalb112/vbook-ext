package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class tj6 implements yb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ o83 b;
    public final /* synthetic */ yb4 c;

    public /* synthetic */ tj6(o83 o83Var, yb4 yb4Var) {
        this.b = o83Var;
        this.c = yb4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        yb4 yb4Var = this.c;
        o83 o83Var = this.b;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                boolean z = false;
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    if (!bw9.a0((String) o83Var.b.getValue()) && !bw9.a0((String) o83Var.c.getValue())) {
                        z = true;
                    }
                    boolean zF = dd4Var.f(yb4Var) | dd4Var.f(o83Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == vl1.a) {
                        objQ = new vf6(7, yb4Var, o83Var);
                        dd4Var.p0(objQ);
                    }
                    lc5.J((ib4) objQ, null, z, null, null, null, jf0.G(-36197915, new nl9(o83Var, 23), dd4Var), dd4Var, 805306368, 506);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                e11.p(o83Var, yb4Var, (dd4) obj, qu1.x0(1));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ tj6(o83 o83Var, yb4 yb4Var, int i) {
        this.b = o83Var;
        this.c = yb4Var;
    }
}
