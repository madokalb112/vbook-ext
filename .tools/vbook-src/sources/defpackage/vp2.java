package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class vp2 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g78 b;
    public final /* synthetic */ wq2 c;
    public final /* synthetic */ pj7 d;

    public /* synthetic */ vp2(g78 g78Var, wq2 wq2Var, pj7 pj7Var, int i) {
        this.a = i;
        this.b = g78Var;
        this.c = wq2Var;
        this.d = pj7Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        ou6 ou6Var = lu6.a;
        pj7 pj7Var = this.d;
        wq2 wq2Var = this.c;
        switch (i) {
            case 0:
                yn0 yn0Var = (yn0) obj;
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                yn0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= dd4Var.f(yn0Var) ? 4 : 2;
                }
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 19) != 18)) {
                    dd4Var.Y();
                } else {
                    w68.a.b(this.b, wq2Var.a, gjb.p0(yn0Var.a(ou6Var, bv4.c), 0.0f, pj7Var.d(), 0.0f, 0.0f, 13), 0L, 0L, 0.0f, dd4Var, 0);
                }
                break;
            default:
                yn0 yn0Var2 = (yn0) obj;
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                yn0Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= dd4Var2.f(yn0Var2) ? 4 : 2;
                }
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    dd4Var2.Y();
                } else {
                    w68.a.b(this.b, wq2Var.a, gjb.p0(yn0Var2.a(ou6Var, bv4.c), 0.0f, pj7Var.d(), 0.0f, 0.0f, 13), 0L, 0L, 0.0f, dd4Var2, 0);
                }
                break;
        }
        return hebVar;
    }
}
