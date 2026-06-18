package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ad9 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gd9 b;
    public final /* synthetic */ wq5 c;
    public final /* synthetic */ pj7 d;
    public final /* synthetic */ szb e;
    public final /* synthetic */ ou6 f;
    public final /* synthetic */ kb4 s;
    public final /* synthetic */ kb4 t;
    public final /* synthetic */ int u;

    public /* synthetic */ ad9(gd9 gd9Var, wq5 wq5Var, pj7 pj7Var, szb szbVar, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, int i, int i2) {
        this.a = i2;
        this.b = gd9Var;
        this.c = wq5Var;
        this.d = pj7Var;
        this.e = szbVar;
        this.f = ou6Var;
        this.s = kb4Var;
        this.t = kb4Var2;
        this.u = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.u;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(i2 | 1);
                sdc.R(this.b, this.c, this.d, this.e, this.f, this.s, this.t, (dd4) obj, iX0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(i2 | 1);
                sdc.U(this.b, this.c, this.d, this.e, this.f, this.s, this.t, (dd4) obj, iX02);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iX03 = qu1.x0(i2 | 1);
                sdc.Q(this.b, this.c, this.d, this.e, this.f, this.s, this.t, (dd4) obj, iX03);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX04 = qu1.x0(i2 | 1);
                sdc.T(this.b, this.c, this.d, this.e, this.f, this.s, this.t, (dd4) obj, iX04);
                break;
        }
        return hebVar;
    }
}
