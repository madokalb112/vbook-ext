package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class u09 implements yb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ r19 b;
    public final /* synthetic */ rj1 c;
    public final /* synthetic */ o19 d;

    public /* synthetic */ u09(o19 o19Var, r19 r19Var, rj1 rj1Var) {
        this.d = o19Var;
        this.b = r19Var;
        this.c = rj1Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        o19 o19Var = this.d;
        rj1 rj1Var = this.c;
        r19 r19Var = this.b;
        dd4 dd4Var = (dd4) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    p7c.e(o19Var, jf0.G(-284825865, new u09(r19Var, rj1Var, o19Var), dd4Var), dd4Var, 48);
                }
                break;
            default:
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    jv3.e(s19.a.a(r19Var), jf0.G(610483127, new jg1(rj1Var, o19Var), dd4Var), dd4Var, 56);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ u09(r19 r19Var, rj1 rj1Var, o19 o19Var) {
        this.b = r19Var;
        this.c = rj1Var;
        this.d = o19Var;
    }
}
