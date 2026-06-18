package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class lo implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ib4 b;

    public /* synthetic */ lo(int i, ib4 ib4Var) {
        this.a = i;
        this.b = ib4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        ib4 ib4Var = this.b;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                vo1.k(ib4Var, (dd4) obj, qu1.x0(7));
                break;
            case 1:
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    sw1.a(0, ib4Var, dd4Var, (ou6) null);
                }
                break;
            case 2:
                dd4 dd4Var2 = (dd4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dd4Var2.Y();
                } else {
                    kc5.n(i25.c((m53) a53.L.getValue(), dd4Var2, 0), wn9.K((pv9) ev9.T.getValue(), dd4Var2), false, null, null, null, null, null, this.b, dd4Var2, 0, 252);
                }
                break;
            case 3:
                dd4 dd4Var3 = (dd4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!dd4Var3.V(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dd4Var3.Y();
                } else {
                    lc5.J(this.b, null, false, null, null, null, p7c.k, dd4Var3, 805306368, 510);
                }
                break;
            case 4:
                dd4 dd4Var4 = (dd4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!dd4Var4.V(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    dd4Var4.Y();
                } else {
                    lc5.J(this.b, null, false, null, null, null, p7c.l, dd4Var4, 805306368, 510);
                }
                break;
            case 5:
                dd4 dd4Var5 = (dd4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!dd4Var5.V(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    dd4Var5.Y();
                } else {
                    sw1.a(0, ib4Var, dd4Var5, (ou6) null);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                gjb.n(ib4Var, (dd4) obj, qu1.x0(1));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ lo(ib4 ib4Var, int i, int i2) {
        this.a = i2;
        this.b = ib4Var;
    }
}
