package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class mr6 implements yb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ ou6 c;
    public final /* synthetic */ ib4 d;
    public final /* synthetic */ int e;

    public /* synthetic */ mr6(String str, ib4 ib4Var, ou6 ou6Var, int i, int i2) {
        this.b = str;
        this.e = i;
        this.c = ou6Var;
        this.d = ib4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(55);
                rw1.a(this.b, this.e, this.c, this.d, (dd4) obj, iX0);
                break;
            default:
                ((Integer) obj2).getClass();
                hn9.e(qu1.x0(this.e | 1), this.d, (dd4) obj, this.c, this.b);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ mr6(String str, ou6 ou6Var, ib4 ib4Var, int i) {
        this.b = str;
        this.c = ou6Var;
        this.d = ib4Var;
        this.e = i;
    }
}
