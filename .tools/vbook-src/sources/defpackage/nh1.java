package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class nh1 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ou6 c;
    public final /* synthetic */ ib4 d;
    public final /* synthetic */ ib4 e;
    public final /* synthetic */ int f;

    public /* synthetic */ nh1(boolean z, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = ou6Var;
        this.d = ib4Var;
        this.e = ib4Var2;
        this.f = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(i2 | 1);
                yb0.j(this.b, this.c, this.d, this.e, (dd4) obj, iX0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(i2 | 1);
                e11.j(this.b, this.c, this.d, this.e, (dd4) obj, iX02);
                break;
        }
        return hebVar;
    }
}
