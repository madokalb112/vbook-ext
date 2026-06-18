package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class us6 implements yb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ ub4 f;

    public /* synthetic */ us6(long j, boolean z, ou6 ou6Var, yb4 yb4Var, int i, int i2) {
        this.c = j;
        this.b = z;
        this.e = ou6Var;
        this.f = yb4Var;
        this.d = i2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        ub4 ub4Var = this.f;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(1);
                cx1.t(this.c, this.b, (ou6) obj3, (yb4) ub4Var, (dd4) obj, iX0, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(this.d | 1);
                gjb.h(this.b, this.c, (ib4) obj3, (ib4) ub4Var, (dd4) obj, iX02);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ us6(boolean z, long j, ib4 ib4Var, ib4 ib4Var2, int i) {
        this.b = z;
        this.c = j;
        this.e = ib4Var;
        this.f = ib4Var2;
        this.d = i;
    }
}
