package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class kl6 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ ou6 e;
    public final /* synthetic */ int f;

    public /* synthetic */ kl6(String str, boolean z, kb4 kb4Var, ou6 ou6Var, int i) {
        this.a = 1;
        this.b = str;
        this.c = z;
        this.d = kb4Var;
        this.e = ou6Var;
        this.f = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.f;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                h67.W(qu1.x0(i2 | 1), this.d, (dd4) obj, this.e, this.b, this.c);
                break;
            case 1:
                ((Integer) obj2).getClass();
                qx1.a(qu1.x0(i2 | 1), this.d, (dd4) obj, this.e, this.b, this.c);
                break;
            case 2:
                ((Integer) obj2).getClass();
                au6.k(qu1.x0(i2 | 1), this.d, (dd4) obj, this.e, this.b, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(3073);
                zma.f(this.c, this.b, this.f, this.e, this.d, (dd4) obj, iX0);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ kl6(boolean z, String str, int i, ou6 ou6Var, kb4 kb4Var, int i2) {
        this.a = 3;
        this.c = z;
        this.b = str;
        this.f = i;
        this.e = ou6Var;
        this.d = kb4Var;
    }

    public /* synthetic */ kl6(boolean z, String str, ou6 ou6Var, kb4 kb4Var, int i, int i2) {
        this.a = i2;
        this.c = z;
        this.b = str;
        this.e = ou6Var;
        this.d = kb4Var;
        this.f = i;
    }
}
