package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ob3 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ kb4 d;

    public /* synthetic */ ob3(boolean z, kb4 kb4Var, kb4 kb4Var2, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = kb4Var;
        this.d = kb4Var2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        kb4 kb4Var = this.d;
        kb4 kb4Var2 = this.c;
        boolean z = this.b;
        dd4 dd4Var = (dd4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                h67.F(z, kb4Var2, kb4Var, dd4Var, qu1.x0(49));
                break;
            case 1:
                sdc.B(z, kb4Var2, kb4Var, dd4Var, qu1.x0(1));
                break;
            case 2:
                bx1.f(z, kb4Var2, kb4Var, dd4Var, qu1.x0(1));
                break;
            case 3:
                vv1.e(z, kb4Var2, kb4Var, dd4Var, qu1.x0(1));
                break;
            default:
                kl8.y(z, kb4Var2, kb4Var, dd4Var, qu1.x0(1));
                break;
        }
        return hebVar;
    }
}
