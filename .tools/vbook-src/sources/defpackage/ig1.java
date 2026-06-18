package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ig1 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kga b;
    public final /* synthetic */ rj1 c;
    public final /* synthetic */ int d;

    public /* synthetic */ ig1(kga kgaVar, rj1 rj1Var, int i, int i2) {
        this.a = i2;
        this.b = kgaVar;
        this.c = rj1Var;
        this.d = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.d;
        rj1 rj1Var = this.c;
        kga kgaVar = this.b;
        dd4 dd4Var = (dd4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                vm7.f(kgaVar, rj1Var, dd4Var, qu1.x0(i2 | 1));
                break;
            default:
                p7c.f(kgaVar, rj1Var, dd4Var, qu1.x0(i2 | 1));
                break;
        }
        return hebVar;
    }
}
