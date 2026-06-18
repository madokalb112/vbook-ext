package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class vo6 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ yb4 e;
    public final /* synthetic */ kb4 f;
    public final /* synthetic */ kb4 s;
    public final /* synthetic */ kb4 t;
    public final /* synthetic */ kb4 u;
    public final /* synthetic */ int v;

    public /* synthetic */ vo6(boolean z, String str, kb4 kb4Var, yb4 yb4Var, kb4 kb4Var2, kb4 kb4Var3, kb4 kb4Var4, kb4 kb4Var5, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = str;
        this.d = kb4Var;
        this.e = yb4Var;
        this.f = kb4Var2;
        this.s = kb4Var3;
        this.t = kb4Var4;
        this.u = kb4Var5;
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
                qu1.g(this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, (dd4) obj, iX0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(i2 | 1);
                qu1.i(this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, (dd4) obj, iX02);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX03 = qu1.x0(i2 | 1);
                qu1.h(this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, (dd4) obj, iX03);
                break;
        }
        return hebVar;
    }
}
