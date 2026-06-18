package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class op5 implements yb4 {
    public final /* synthetic */ ib4 A;
    public final /* synthetic */ ib4 B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ kb4 D;
    public final /* synthetic */ kb4 E;
    public final /* synthetic */ kb4 F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int a;
    public final /* synthetic */ pj7 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ t89 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ long s;
    public final /* synthetic */ long t;
    public final /* synthetic */ tx8 u;
    public final /* synthetic */ ux8 v;
    public final /* synthetic */ ib4 w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ float y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ op5(pj7 pj7Var, boolean z, int i, t89 t89Var, float f, long j, long j2, tx8 tx8Var, ux8 ux8Var, ib4 ib4Var, boolean z2, float f2, boolean z3, ib4 ib4Var2, ib4 ib4Var3, boolean z4, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, int i2, int i3, int i4) {
        boolean z5;
        this.a = i4;
        switch (i4) {
            case 1:
                z5 = z3;
                this.b = pj7Var;
                this.c = z;
                this.d = i;
                this.e = t89Var;
                this.f = f;
                this.s = j;
                this.t = j2;
                this.u = tx8Var;
                this.v = ux8Var;
                this.w = ib4Var;
                this.x = z2;
                this.y = f2;
                break;
            default:
                this.b = pj7Var;
                this.c = z;
                this.d = i;
                this.e = t89Var;
                this.f = f;
                this.s = j;
                this.t = j2;
                this.u = tx8Var;
                this.v = ux8Var;
                this.w = ib4Var;
                this.x = z2;
                this.y = f2;
                z5 = z3;
                break;
        }
        this.z = z5;
        this.A = ib4Var2;
        this.B = ib4Var3;
        this.C = z4;
        this.D = kb4Var;
        this.E = kb4Var2;
        this.F = kb4Var3;
        this.G = i2;
        this.H = i3;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.H;
        int i3 = this.G;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(i3 | 1);
                int iX02 = qu1.x0(i2);
                lw1.i(this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, (dd4) obj, iX0, iX02);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX03 = qu1.x0(i3 | 1);
                int iX04 = qu1.x0(i2);
                cx1.g(this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, (dd4) obj, iX03, iX04);
                break;
        }
        return hebVar;
    }
}
