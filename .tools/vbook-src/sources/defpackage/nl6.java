package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class nl6 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ib4 b;
    public final /* synthetic */ ib4 c;
    public final /* synthetic */ ib4 d;

    public /* synthetic */ nl6(ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, int i) {
        this.a = i;
        this.b = ib4Var;
        this.c = ib4Var2;
        this.d = ib4Var3;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        lu6 lu6Var = lu6.a;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    vw1.d(tg9.f(lu6Var, 1.0f), this.b, this.c, this.d, dd4Var, 54);
                }
                break;
            default:
                dd4 dd4Var2 = (dd4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dd4Var2.Y();
                } else {
                    pu1.x(tg9.f(lu6Var, 1.0f), this.b, this.c, this.d, dd4Var2, 6);
                }
                break;
        }
        return hebVar;
    }
}
