package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class lk6 implements yb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ u83 b;
    public final /* synthetic */ ac4 c;

    public /* synthetic */ lk6(u83 u83Var, ac4 ac4Var) {
        this.b = u83Var;
        this.c = ac4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        ac4 ac4Var = this.c;
        u83 u83Var = this.b;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    boolean z = ((String) u83Var.b.getValue()).length() > 0;
                    boolean zF = dd4Var.f(ac4Var) | dd4Var.f(u83Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == vl1.a) {
                        objQ = new vf6(12, ac4Var, u83Var);
                        dd4Var.p0(objQ);
                    }
                    lc5.J((ib4) objQ, null, z, null, null, null, jf0.G(1666714053, new nl9(u83Var, 27), dd4Var), dd4Var, 805306368, 506);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                y86.i(u83Var, ac4Var, (dd4) obj, qu1.x0(1));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ lk6(u83 u83Var, ac4 ac4Var, int i) {
        this.b = u83Var;
        this.c = ac4Var;
    }
}
