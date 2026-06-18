package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class zs3 implements yb4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ou6 b;
    public final /* synthetic */ z85 c;
    public final /* synthetic */ ys3 d;
    public final /* synthetic */ t27 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ pj7 s;
    public final /* synthetic */ a07 t;
    public final /* synthetic */ br9 u;
    public final /* synthetic */ br9 v;
    public final /* synthetic */ a07 w;
    public final /* synthetic */ br9 x;

    public /* synthetic */ zs3(ys3 ys3Var, ou6 ou6Var, z85 z85Var, t27 t27Var, String str, pj7 pj7Var, a07 a07Var, a07 a07Var2, a07 a07Var3, a07 a07Var4, a07 a07Var5) {
        this.d = ys3Var;
        this.b = ou6Var;
        this.c = z85Var;
        this.e = t27Var;
        this.f = str;
        this.s = pj7Var;
        this.t = a07Var;
        this.u = a07Var2;
        this.v = a07Var3;
        this.w = a07Var4;
        this.x = a07Var5;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    ys3 ys3Var = this.d;
                    w05.f(ys3Var.O0, jf0.G(2113688097, new zs3(this.b, this.c, ys3Var, this.e, this.f, this.s, this.t, this.u, this.v, this.w, this.x), dd4Var), dd4Var, 48);
                }
                break;
            default:
                dd4 dd4Var2 = (dd4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dd4Var2.Y();
                } else {
                    sdc.e(this.b, null, jf0.G(-1913718281, new st1(this.c, this.d, this.e, this.f, this.s, this.t, this.u, this.v, this.w, this.x, 3), dd4Var2), dd4Var2, 3072, 6);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ zs3(ou6 ou6Var, z85 z85Var, ys3 ys3Var, t27 t27Var, String str, pj7 pj7Var, a07 a07Var, br9 br9Var, br9 br9Var2, a07 a07Var2, br9 br9Var3) {
        this.b = ou6Var;
        this.c = z85Var;
        this.d = ys3Var;
        this.e = t27Var;
        this.f = str;
        this.s = pj7Var;
        this.t = a07Var;
        this.u = br9Var;
        this.v = br9Var2;
        this.w = a07Var2;
        this.x = br9Var3;
    }
}
