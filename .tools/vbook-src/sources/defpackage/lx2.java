package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class lx2 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ou6 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ lx2(long j, float f, int i, ou6 ou6Var, int i2, int i3) {
        this.a = 3;
        this.d = j;
        this.c = f;
        this.e = i;
        this.b = ou6Var;
        this.f = i3;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(i2 | 1);
                y86.n(this.c, iX0, this.f, this.d, (dd4) obj, this.b);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(i2 | 1);
                y86.c(this.c, iX02, this.f, this.d, (dd4) obj, this.b);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iX03 = qu1.x0(i2 | 1);
                l16.a(this.c, iX03, this.f, this.d, (dd4) obj, this.b);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX04 = qu1.x0(3121);
                ym9.b(this.d, this.c, this.e, this.b, (dd4) obj, iX04, this.f);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ lx2(long j, float f, ou6 ou6Var, int i, int i2) {
        this.a = 2;
        this.d = j;
        this.c = f;
        this.b = ou6Var;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ lx2(ou6 ou6Var, float f, long j, int i, int i2, int i3) {
        this.a = i3;
        this.b = ou6Var;
        this.c = f;
        this.d = j;
        this.e = i;
        this.f = i2;
    }
}
