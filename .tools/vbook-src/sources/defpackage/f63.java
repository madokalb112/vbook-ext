package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class f63 implements yb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ou6 d;
    public final /* synthetic */ ib4 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    public /* synthetic */ f63(p35 p35Var, String str, String str2, ou6 ou6Var, String str3, ib4 ib4Var, int i, int i2) {
        this.t = p35Var;
        this.b = str;
        this.c = str2;
        this.d = ou6Var;
        this.u = str3;
        this.e = ib4Var;
        this.f = i;
        this.s = i2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.f;
        Object obj3 = this.u;
        Object obj4 = this.t;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(i2 | 1);
                gx1.c(this.b, this.c, (yb4) obj4, (Boolean) obj3, this.d, this.e, (dd4) obj, iX0, this.s);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(i2 | 1);
                bx1.d((p35) obj4, this.b, this.c, this.d, (String) obj3, this.e, (dd4) obj, iX02, this.s);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ f63(String str, String str2, yb4 yb4Var, Boolean bool, ou6 ou6Var, ib4 ib4Var, int i, int i2) {
        this.b = str;
        this.c = str2;
        this.t = yb4Var;
        this.u = bool;
        this.d = ou6Var;
        this.e = ib4Var;
        this.f = i;
        this.s = i2;
    }
}
