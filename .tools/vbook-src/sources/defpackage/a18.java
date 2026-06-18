package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class a18 implements yb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ ou6 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    public /* synthetic */ a18(String str, String str2, ou6 ou6Var, boolean z, boolean z2, kb4 kb4Var, int i, int i2) {
        this.t = str;
        this.u = str2;
        this.d = ou6Var;
        this.b = z;
        this.e = z2;
        this.c = kb4Var;
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
                e11.w((String) obj4, (String) obj3, this.d, this.b, this.e, this.c, (dd4) obj, iX0, this.s);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(i2 | 1);
                z1a.a(this.b, this.c, this.d, (yb4) obj4, this.e, (y1a) obj3, (dd4) obj, iX02, this.s);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ a18(boolean z, kb4 kb4Var, ou6 ou6Var, yb4 yb4Var, boolean z2, y1a y1aVar, int i, int i2) {
        this.b = z;
        this.c = kb4Var;
        this.d = ou6Var;
        this.t = yb4Var;
        this.e = z2;
        this.u = y1aVar;
        this.f = i;
        this.s = i2;
    }
}
