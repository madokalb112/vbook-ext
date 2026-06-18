package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class cn6 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ ib4 e;
    public final /* synthetic */ ib4 f;

    public /* synthetic */ cn6(boolean z, String str, kb4 kb4Var, ib4 ib4Var, ib4 ib4Var2, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = str;
        this.d = kb4Var;
        this.e = ib4Var;
        this.f = ib4Var2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(385);
                gx1.m(this.b, this.c, this.d, this.e, this.f, (dd4) obj, iX0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(385);
                lx1.j(this.b, this.c, this.d, this.e, this.f, (dd4) obj, iX02);
                break;
        }
        return hebVar;
    }
}
