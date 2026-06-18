package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class xk3 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gl3 b;
    public final /* synthetic */ kb4 c;

    public /* synthetic */ xk3(gl3 gl3Var, kb4 kb4Var, int i) {
        this.a = i;
        this.b = gl3Var;
        this.c = kb4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        kb4 kb4Var = this.c;
        gl3 gl3Var = this.b;
        dd4 dd4Var = (dd4) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    kl8.l(gl3Var, kb4Var, dd4Var, 8);
                }
                break;
            case 1:
                num.getClass();
                kl8.c(gl3Var, kb4Var, dd4Var, qu1.x0(9));
                break;
            case 2:
                num.getClass();
                kl8.c(gl3Var, kb4Var, dd4Var, qu1.x0(9));
                break;
            case 3:
                num.getClass();
                kl8.l(gl3Var, kb4Var, dd4Var, qu1.x0(9));
                break;
            case 4:
                num.getClass();
                kl8.w(gl3Var, kb4Var, dd4Var, qu1.x0(9));
                break;
            case 5:
                num.getClass();
                kl8.B(gl3Var, kb4Var, dd4Var, qu1.x0(9));
                break;
            case 6:
                num.getClass();
                kl8.D(gl3Var, kb4Var, dd4Var, qu1.x0(9));
                break;
            case 7:
                num.getClass();
                kl8.D(gl3Var, kb4Var, dd4Var, qu1.x0(9));
                break;
            case 8:
                int iIntValue2 = num.intValue();
                if (!dd4Var.V(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    kl8.c(gl3Var, kb4Var, dd4Var, 8);
                }
                break;
            case 9:
                int iIntValue3 = num.intValue();
                if (!dd4Var.V(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    kl8.w(gl3Var, kb4Var, dd4Var, 8);
                }
                break;
            default:
                int iIntValue4 = num.intValue();
                if (!dd4Var.V(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    kl8.B(gl3Var, kb4Var, dd4Var, 8);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ xk3(gl3 gl3Var, kb4 kb4Var, int i, int i2) {
        this.a = i2;
        this.b = gl3Var;
        this.c = kb4Var;
    }
}
