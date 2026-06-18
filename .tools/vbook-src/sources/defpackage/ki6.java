package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ki6 implements yb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object s;
    public final /* synthetic */ ub4 t;

    public /* synthetic */ ki6(String str, boolean z, int i, boolean z2, kb4 kb4Var, yb4 yb4Var, int i2, int i3) {
        this.s = str;
        this.b = z;
        this.c = i;
        this.d = z2;
        this.e = kb4Var;
        this.t = yb4Var;
        this.f = i3;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.f;
        heb hebVar = heb.a;
        ub4 ub4Var = this.t;
        Object obj3 = this.e;
        Object obj4 = this.s;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(1);
                tw1.h((String) obj4, this.b, this.c, this.d, (kb4) obj3, (yb4) ub4Var, (dd4) obj, iX0, this.f);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int iX02 = qu1.x0(i2 | 1);
                gx1.l(this.b, this.c, this.d, (kb4) obj3, (ib4) obj4, (ib4) ub4Var, (dd4) obj, iX02);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX03 = qu1.x0(i2 | 1);
                dk9.a(this.b, this.c, (ib4) obj4, (ou6) obj3, this.d, (ib4) ub4Var, (dd4) obj, iX03);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ ki6(boolean z, int i, ib4 ib4Var, ou6 ou6Var, boolean z2, ib4 ib4Var2, int i2) {
        this.b = z;
        this.c = i;
        this.s = ib4Var;
        this.e = ou6Var;
        this.d = z2;
        this.t = ib4Var2;
        this.f = i2;
    }

    public /* synthetic */ ki6(boolean z, int i, boolean z2, kb4 kb4Var, ib4 ib4Var, ib4 ib4Var2, int i2) {
        this.b = z;
        this.c = i;
        this.d = z2;
        this.e = kb4Var;
        this.s = ib4Var;
        this.t = ib4Var2;
        this.f = i2;
    }
}
