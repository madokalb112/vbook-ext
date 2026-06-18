package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class nn3 implements yb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ ou6 c;
    public final /* synthetic */ rj1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ nn3(String str, ou6 ou6Var, rj1 rj1Var, int i) {
        this.b = str;
        this.c = ou6Var;
        this.d = rj1Var;
        this.e = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(this.e | 1);
                t1c.u(this.b, this.c, this.d, (dd4) obj, iX0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(385);
                rw1.d(this.b, this.c, this.d, (dd4) obj, iX02, this.e);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ nn3(String str, ou6 ou6Var, rj1 rj1Var, int i, int i2) {
        this.b = str;
        this.c = ou6Var;
        this.d = rj1Var;
        this.e = i2;
    }
}
