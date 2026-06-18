package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class d18 implements yb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ou6 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ ub4 v;

    public /* synthetic */ d18(p35 p35Var, String str, String str2, ou6 ou6Var, boolean z, boolean z2, kb4 kb4Var, int i, int i2) {
        this.s = p35Var;
        this.t = str;
        this.u = str2;
        this.d = ou6Var;
        this.b = z;
        this.e = z2;
        this.v = kb4Var;
        this.c = i;
        this.f = i2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        ub4 ub4Var = this.v;
        Object obj3 = this.u;
        Object obj4 = this.t;
        Object obj5 = this.s;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(this.c | 1);
                e11.x((p35) obj5, (String) obj4, (String) obj3, this.d, this.b, this.e, (kb4) ub4Var, (dd4) obj, iX0, this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(this.f | 1);
                dk9.b(this.b, this.c, (ib4) obj5, this.d, (Long) obj4, this.e, (ib4) obj3, (ib4) ub4Var, (dd4) obj, iX02);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ d18(boolean z, int i, ib4 ib4Var, ou6 ou6Var, Long l, boolean z2, ib4 ib4Var2, ib4 ib4Var3, int i2) {
        this.b = z;
        this.c = i;
        this.s = ib4Var;
        this.d = ou6Var;
        this.t = l;
        this.e = z2;
        this.u = ib4Var2;
        this.v = ib4Var3;
        this.f = i2;
    }
}
