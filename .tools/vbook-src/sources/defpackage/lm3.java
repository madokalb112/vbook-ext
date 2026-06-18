package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class lm3 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ou6 d;
    public final /* synthetic */ kb4 e;

    public /* synthetic */ lm3(String str, String str2, ou6 ou6Var, kb4 kb4Var, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = ou6Var;
        this.e = kb4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(1);
                tw1.a(this.b, this.c, this.d, this.e, (dd4) obj, iX0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(1);
                kc5.g(this.b, this.c, this.d, this.e, (dd4) obj, iX02);
                break;
        }
        return hebVar;
    }
}
