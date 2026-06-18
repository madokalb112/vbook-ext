package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class lp6 implements yb4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ String c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lp6(float f, String str, ou6 ou6Var, kb4 kb4Var, ib4 ib4Var, int i) {
        this.b = f;
        this.c = str;
        this.e = ou6Var;
        this.d = kb4Var;
        this.f = ib4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(1);
                sp6.b(this.c, this.b, (bb1) obj3, (String) obj4, this.d, (dd4) obj, iX0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(1);
                gjb.g(this.b, this.c, (ou6) obj4, this.d, (ib4) obj3, (dd4) obj, iX02);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ lp6(String str, float f, bb1 bb1Var, String str2, kb4 kb4Var, int i) {
        this.c = str;
        this.b = f;
        this.f = bb1Var;
        this.e = str2;
        this.d = kb4Var;
    }
}
