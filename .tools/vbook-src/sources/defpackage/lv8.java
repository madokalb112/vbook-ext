package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class lv8 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj1 b;

    public /* synthetic */ lv8(rj1 rj1Var, int i) {
        this.a = i;
        this.b = rj1Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        rj1 rj1Var = this.b;
        switch (i) {
            case 0:
                pj7 pj7Var = (pj7) obj;
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                pj7Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= dd4Var.f(pj7Var) ? 4 : 2;
                }
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 19) != 18)) {
                    dd4Var.Y();
                } else {
                    gx1.q(tg9.c, jf0.G(1594433645, new kv8(pj7Var, rj1Var), dd4Var), dd4Var, 54, 0);
                }
                break;
            case 1:
                pj7 pj7Var2 = (pj7) obj;
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                pj7Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= dd4Var2.f(pj7Var2) ? 4 : 2;
                }
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    dd4Var2.Y();
                } else {
                    gx1.q(tg9.c, jf0.G(-835454202, new kv8(rj1Var, pj7Var2), dd4Var2), dd4Var2, 54, 0);
                }
                break;
            case 2:
                dd4 dd4Var3 = (dd4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((dq5) obj).getClass();
                if (!dd4Var3.V(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    dd4Var3.Y();
                } else {
                    rj1Var.invoke(dd4Var3, 0);
                }
                break;
            case 3:
                co0 co0Var = (co0) obj;
                dd4 dd4Var4 = (dd4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                co0Var.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= dd4Var4.f(co0Var) ? 4 : 2;
                }
                if (!dd4Var4.V(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    dd4Var4.Y();
                } else {
                    rj1Var.c(co0Var, dd4Var4, Integer.valueOf(iIntValue4 & 14));
                }
                break;
            case 4:
                dd4 dd4Var5 = (dd4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (!dd4Var5.V(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    dd4Var5.Y();
                } else {
                    rj1Var.invoke(dd4Var5, 0);
                }
                break;
            case 5:
                dd4 dd4Var6 = (dd4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (!dd4Var6.V(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    dd4Var6.Y();
                } else {
                    rj1Var.invoke(dd4Var6, 0);
                }
                break;
            default:
                dd4 dd4Var7 = (dd4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (!dd4Var7.V(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    dd4Var7.Y();
                } else {
                    rj1Var.invoke(dd4Var7, 0);
                }
                break;
        }
        return hebVar;
    }
}
