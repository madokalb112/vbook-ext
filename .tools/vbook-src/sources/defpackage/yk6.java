package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class yk6 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ kb4 e;
    public final /* synthetic */ kb4 f;
    public final /* synthetic */ int s;

    public /* synthetic */ yk6(boolean z, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, kb4 kb4Var4, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = kb4Var;
        this.d = kb4Var2;
        this.e = kb4Var3;
        this.f = kb4Var4;
        this.s = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.s;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(i2 | 1);
                t96.q(this.b, this.c, this.d, this.e, this.f, (dd4) obj, iX0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(i2 | 1);
                t96.p(this.b, this.c, this.d, this.e, this.f, (dd4) obj, iX02);
                break;
        }
        return hebVar;
    }
}
