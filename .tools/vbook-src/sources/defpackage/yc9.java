package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class yc9 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ ou6 f;
    public final /* synthetic */ ub4 s;
    public final /* synthetic */ Object t;

    public /* synthetic */ yc9(boolean z, ib4 ib4Var, rj1 rj1Var, ou6 ou6Var, boolean z2, boolean z3, c47 c47Var, int i) {
        this.a = 3;
        this.c = z;
        this.b = ib4Var;
        this.s = rj1Var;
        this.f = ou6Var;
        this.d = z2;
        this.e = z3;
        this.t = c47Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj3 = this.t;
        ub4 ub4Var = this.s;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(1);
                sdc.c((ob9) obj4, this.c, this.d, this.e, this.f, (kb4) ub4Var, (kb4) obj3, (dd4) obj, iX0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(1);
                sdc.a((ob9) obj4, this.c, this.d, this.e, this.f, (kb4) ub4Var, (kb4) obj3, (dd4) obj, iX02);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iX03 = qu1.x0(1);
                sdc.b((ob9) obj4, this.c, this.d, this.e, this.f, (kb4) ub4Var, (kb4) obj3, (dd4) obj, iX03);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX04 = qu1.x0(385);
                d47.b(this.c, (ib4) obj4, (rj1) ub4Var, this.f, this.d, this.e, (c47) obj3, (dd4) obj, iX04);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ yc9(ob9 ob9Var, boolean z, boolean z2, boolean z3, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, int i, int i2) {
        this.a = i2;
        this.b = ob9Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = ou6Var;
        this.s = kb4Var;
        this.t = kb4Var2;
    }
}
