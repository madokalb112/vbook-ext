package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class kc9 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ co0 b;
    public final /* synthetic */ mb9 c;
    public final /* synthetic */ wq5 d;
    public final /* synthetic */ pj7 e;
    public final /* synthetic */ szb f;
    public final /* synthetic */ ou6 s;
    public final /* synthetic */ kb4 t;
    public final /* synthetic */ kb4 u;
    public final /* synthetic */ int v;

    public /* synthetic */ kc9(co0 co0Var, mb9 mb9Var, wq5 wq5Var, pj7 pj7Var, szb szbVar, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, int i, int i2) {
        this.a = i2;
        this.b = co0Var;
        this.c = mb9Var;
        this.d = wq5Var;
        this.e = pj7Var;
        this.f = szbVar;
        this.s = ou6Var;
        this.t = kb4Var;
        this.u = kb4Var2;
        this.v = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.v;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(i2 | 1);
                p7c.E(this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, (dd4) obj, iX0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(i2 | 1);
                p7c.D(this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, (dd4) obj, iX02);
                break;
        }
        return hebVar;
    }
}
