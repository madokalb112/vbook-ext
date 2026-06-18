package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class g5a implements yb4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ib4 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;

    public /* synthetic */ g5a(vvb vvbVar, boolean z, long j, ib4 ib4Var, ib4 ib4Var2, int i) {
        this.f = vvbVar;
        this.b = z;
        this.c = j;
        this.d = ib4Var;
        this.s = ib4Var2;
        this.e = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.e;
        Object obj3 = this.s;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int iX0 = qu1.x0(i2 | 1);
                gjb.R((vvb) obj4, this.b, this.c, this.d, (ib4) obj3, (dd4) obj, iX0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(i2 | 1);
                dk9.e((String) obj4, (ou6) obj3, this.b, this.c, this.d, (dd4) obj, iX02);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ g5a(String str, ou6 ou6Var, boolean z, long j, ib4 ib4Var, int i) {
        this.f = str;
        this.s = ou6Var;
        this.b = z;
        this.c = j;
        this.d = ib4Var;
        this.e = i;
    }
}
