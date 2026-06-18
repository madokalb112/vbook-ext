package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class sq3 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ br9 b;

    public /* synthetic */ sq3(br9 br9Var, int i) {
        this.a = i;
        this.b = br9Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        br9 br9Var = this.b;
        int i2 = 1;
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
                } else if (((Number) br9Var.getValue()).intValue() <= 0) {
                    dd4Var.f0(-1308738982);
                    dd4Var.q(false);
                } else {
                    dd4Var.f0(-1309042658);
                    yb0.a(3072, 6, 0L, 0L, jf0.G(1077884096, new sq3(br9Var, i2), dd4Var), dd4Var, gjb.p0(yn0Var.a(lu6.a, bv4.d), 0.0f, 4.0f, 4.0f, 0.0f, 9));
                    dd4Var.q(false);
                }
                break;
            default:
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    dd4Var2.Y();
                } else {
                    nha.c(String.valueOf(((Number) br9Var.getValue()).intValue()), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var2, 0, 0, 262142);
                }
                break;
        }
        return hebVar;
    }
}
