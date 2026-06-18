package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class tq6 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ xga c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ kb4 e;
    public final /* synthetic */ kb4 f;
    public final /* synthetic */ kb4 s;
    public final /* synthetic */ ib4 t;
    public final /* synthetic */ int u;

    public /* synthetic */ tq6(boolean z, xga xgaVar, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, kb4 kb4Var4, ib4 ib4Var, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = xgaVar;
        this.d = kb4Var;
        this.e = kb4Var2;
        this.f = kb4Var3;
        this.s = kb4Var4;
        this.t = ib4Var;
        this.u = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.u;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int iX0 = qu1.x0(i2 | 1);
                t1c.y(this.b, this.c, this.d, this.e, this.f, this.s, this.t, (dd4) obj, iX0);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int iX02 = qu1.x0(i2 | 1);
                t1c.z(this.b, this.c, this.d, this.e, this.f, this.s, this.t, (dd4) obj, iX02);
                break;
            default:
                ((Integer) obj2).intValue();
                int iX03 = qu1.x0(i2 | 1);
                t1c.A(this.b, this.c, this.d, this.e, this.f, this.s, this.t, (dd4) obj, iX03);
                break;
        }
        return hebVar;
    }
}
