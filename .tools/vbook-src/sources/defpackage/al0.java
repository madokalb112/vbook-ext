package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class al0 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ m53 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ib4 e;
    public final /* synthetic */ int f;

    public /* synthetic */ al0(String str, m53 m53Var, boolean z, ib4 ib4Var, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = m53Var;
        this.d = z;
        this.e = ib4Var;
        this.f = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int iX0 = qu1.x0(i2 | 1);
                ah1.h(this.b, this.c, this.d, this.e, (dd4) obj, iX0);
                break;
            default:
                ((Integer) obj2).intValue();
                int iX02 = qu1.x0(i2 | 1);
                fe.p(this.b, this.c, this.d, this.e, (dd4) obj, iX02);
                break;
        }
        return hebVar;
    }
}
