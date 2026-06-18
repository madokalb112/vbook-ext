package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class zp0 implements yb4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ib4 e;
    public final /* synthetic */ kb4 f;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    public /* synthetic */ zp0(kv1 kv1Var, String str, boolean z, String str2, boolean z2, boolean z3, ib4 ib4Var, kb4 kb4Var, int i) {
        this.s = kv1Var;
        this.t = str;
        this.b = z;
        this.u = str2;
        this.c = z2;
        this.d = z3;
        this.e = ib4Var;
        this.f = kb4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj3 = this.u;
        Object obj4 = this.t;
        Object obj5 = this.s;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(24577);
                fz1.x(this.b, this.e, this.c, this.d, (ou6) obj4, this.f, (kb4) obj3, (ib4) obj5, (dd4) obj, iX0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(9);
                fe.g((kv1) obj5, (String) obj4, this.b, (String) obj3, this.c, this.d, this.e, this.f, (dd4) obj, iX02);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ zp0(boolean z, ib4 ib4Var, boolean z2, boolean z3, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, ib4 ib4Var2, int i) {
        this.b = z;
        this.e = ib4Var;
        this.c = z2;
        this.d = z3;
        this.t = ou6Var;
        this.f = kb4Var;
        this.u = kb4Var2;
        this.s = ib4Var2;
    }
}
