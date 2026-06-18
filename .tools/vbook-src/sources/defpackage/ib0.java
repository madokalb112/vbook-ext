package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ib0 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ub4 e;

    public /* synthetic */ ib0(boolean z, ub4 ub4Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = z;
        this.e = ub4Var;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.d;
        int i3 = this.c;
        ub4 ub4Var = this.e;
        boolean z = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                mb0.a(z, (ib4) ub4Var, (dd4) obj, qu1.x0(i3 | 1), i2);
                break;
            default:
                ((Integer) obj2).getClass();
                tw1.f(z, (kb4) ub4Var, (dd4) obj, qu1.x0(i3 | 1), i2);
                break;
        }
        return hebVar;
    }
}
