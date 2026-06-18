package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class w7a implements yb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ s83 b;
    public final /* synthetic */ zb4 c;

    public /* synthetic */ w7a(s83 s83Var, zb4 zb4Var) {
        this.b = s83Var;
        this.c = zb4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        zb4 zb4Var = this.c;
        s83 s83Var = this.b;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    boolean z = !bw9.a0((String) s83Var.b.getValue());
                    boolean zF = dd4Var.f(zb4Var) | dd4Var.f(s83Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == vl1.a) {
                        objQ = new e67(23, zb4Var, s83Var);
                        dd4Var.p0(objQ);
                    }
                    lc5.J((ib4) objQ, null, z, null, null, null, h67.q, dd4Var, 805306368, 506);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                sdc.C(s83Var, zb4Var, (dd4) obj, qu1.x0(1));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ w7a(s83 s83Var, zb4 zb4Var, int i) {
        this.b = s83Var;
        this.c = zb4Var;
    }
}
