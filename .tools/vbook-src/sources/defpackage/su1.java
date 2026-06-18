package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class su1 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p35 b;
    public final /* synthetic */ ou6 c;
    public final /* synthetic */ ib4 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ su1(p35 p35Var, ou6 ou6Var, ib4 ib4Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = p35Var;
        this.c = ou6Var;
        this.d = ib4Var;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(i2 | 1);
                tu1.a(this.b, this.c, this.d, (dd4) obj, iX0, this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(i2 | 1);
                qn9.b(this.b, this.c, this.d, (dd4) obj, iX02, this.f);
                break;
        }
        return hebVar;
    }
}
