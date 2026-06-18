package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class tq2 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fn8 b;

    public /* synthetic */ tq2(fn8 fn8Var, int i) {
        this.a = i;
        this.b = fn8Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        lu6 lu6Var = lu6.a;
        fn8 fn8Var = this.b;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Number) obj3).intValue();
                ((ke1) obj).getClass();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dd4Var.Y();
                } else {
                    fw.v(fn8Var, tg9.f(lu6Var, 1.0f), dd4Var, 48);
                }
                break;
            default:
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                ((ke1) obj).getClass();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    dd4Var2.Y();
                } else {
                    fw.v(fn8Var, tg9.f(lu6Var, 1.0f), dd4Var2, 48);
                }
                break;
        }
        return hebVar;
    }
}
