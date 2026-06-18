package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ws6 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ou6 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ ub4 s;
    public final /* synthetic */ int t;

    public /* synthetic */ ws6(boolean z, boolean z2, long j, ko koVar, ou6 ou6Var, ib4 ib4Var, int i) {
        this.a = 2;
        this.b = z;
        this.d = z2;
        this.c = j;
        this.f = koVar;
        this.e = ou6Var;
        this.s = ib4Var;
        this.t = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.t;
        ub4 ub4Var = this.s;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(i2 | 1);
                cx1.m(this.b, this.c, this.d, this.e, (kb4) obj3, (yb4) ub4Var, (dd4) obj, iX0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(i2 | 1);
                cx1.n(this.b, this.c, this.d, this.e, (kb4) obj3, (yb4) ub4Var, (dd4) obj, iX02);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX03 = qu1.x0(i2 | 1);
                dk9.f(this.b, this.d, this.c, (ko) obj3, this.e, (ib4) ub4Var, (dd4) obj, iX03);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ ws6(boolean z, long j, boolean z2, ou6 ou6Var, kb4 kb4Var, yb4 yb4Var, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = j;
        this.d = z2;
        this.e = ou6Var;
        this.f = kb4Var;
        this.s = yb4Var;
        this.t = i;
    }
}
