package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class jc0 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zb4 b;

    public /* synthetic */ jc0(zb4 zb4Var, int i) {
        this.a = i;
        this.b = zb4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        zb4 zb4Var = this.b;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    zb4Var.c(hq8.a, dd4Var, 0);
                }
                break;
            default:
                Integer num = (Integer) obj;
                num.intValue();
                Integer num2 = (Integer) obj2;
                num2.intValue();
                zb4Var.c(num, num2, "");
                break;
        }
        return hebVar;
    }
}
