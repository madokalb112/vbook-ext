package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ni6 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ kb4 e;
    public final /* synthetic */ kb4 f;
    public final /* synthetic */ int s;

    public /* synthetic */ ni6(boolean z, String str, String str2, kb4 kb4Var, kb4 kb4Var2, int i, int i2) {
        this.a = 0;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = kb4Var;
        this.f = kb4Var2;
        this.s = i2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.s;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(1);
                vw1.i(this.b, this.c, this.d, this.e, this.f, (dd4) obj, iX0, this.s);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(i2 | 1);
                wx1.p(this.b, this.c, this.d, this.e, this.f, (dd4) obj, iX02);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iX03 = qu1.x0(i2 | 1);
                wx1.r(this.b, this.c, this.d, this.e, this.f, (dd4) obj, iX03);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX04 = qu1.x0(i2 | 1);
                wx1.q(this.b, this.c, this.d, this.e, this.f, (dd4) obj, iX04);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ ni6(boolean z, String str, String str2, kb4 kb4Var, kb4 kb4Var2, int i, int i2, byte b) {
        this.a = i2;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = kb4Var;
        this.f = kb4Var2;
        this.s = i;
    }
}
