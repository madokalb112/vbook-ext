package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class kc0 implements yb4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ zb4 e;
    public final /* synthetic */ ou6 f;
    public final /* synthetic */ int s;

    public /* synthetic */ kc0(int i, long j, long j2, zb4 zb4Var, ou6 ou6Var, int i2) {
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = zb4Var;
        this.f = ou6Var;
        this.s = i2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                yb0.a(qu1.x0(this.b | 1), this.s, this.c, this.d, this.e, (dd4) obj, this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(this.s | 1);
                fw.t(this.b, iX0, this.c, this.d, this.e, (dd4) obj, this.f);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ kc0(ou6 ou6Var, long j, long j2, zb4 zb4Var, int i, int i2) {
        this.f = ou6Var;
        this.c = j;
        this.d = j2;
        this.e = zb4Var;
        this.b = i;
        this.s = i2;
    }
}
