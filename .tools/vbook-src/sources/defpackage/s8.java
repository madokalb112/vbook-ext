package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class s8 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yb4 b;
    public final /* synthetic */ yb4 c;

    public /* synthetic */ s8(yb4 yb4Var, yb4 yb4Var2, int i) {
        this.a = i;
        this.b = yb4Var;
        this.c = yb4Var2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        yb4 yb4Var = this.c;
        yb4 yb4Var2 = this.b;
        int i2 = 1;
        dd4 dd4Var = (dd4) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    z8.c(z8.c, z8.d, jf0.G(794666856, new s8(yb4Var2, yb4Var, i2), dd4Var), dd4Var, 438);
                }
                break;
            default:
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    if (yb4Var2 == null) {
                        dd4Var.f0(60612465);
                    } else {
                        dd4Var.f0(-829328752);
                        yb4Var2.invoke(dd4Var, 0);
                    }
                    dd4Var.q(false);
                    if (yb4Var == null) {
                        dd4Var.f0(60660081);
                    } else {
                        dd4Var.f0(-829327216);
                        yb4Var.invoke(dd4Var, 0);
                    }
                    dd4Var.q(false);
                }
                break;
        }
        return hebVar;
    }
}
