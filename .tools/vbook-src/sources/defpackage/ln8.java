package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ln8 implements yb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ fo8 b;
    public final /* synthetic */ ou6 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ uka e;
    public final /* synthetic */ qj5 f;
    public final /* synthetic */ nj5 s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public final /* synthetic */ yy6 w;
    public final /* synthetic */ t89 x;
    public final /* synthetic */ zn8 y;
    public final /* synthetic */ rj7 z;

    public /* synthetic */ ln8(fo8 fo8Var, ou6 ou6Var, boolean z, uka ukaVar, qj5 qj5Var, nj5 nj5Var, int i, int i2, int i3, yy6 yy6Var, rj7 rj7Var, t89 t89Var, zn8 zn8Var) {
        this.b = fo8Var;
        this.c = ou6Var;
        this.d = z;
        this.e = ukaVar;
        this.f = qj5Var;
        this.s = nj5Var;
        this.t = i;
        this.u = i2;
        this.v = i3;
        this.w = yy6Var;
        this.z = rj7Var;
        this.x = t89Var;
        this.y = zn8Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    xk9 xk9Var = new xk9(((q96) dd4Var.j(s96.a)).a.a);
                    fo8 fo8Var = this.b;
                    boolean z = this.d;
                    yy6 yy6Var = this.w;
                    t89 t89Var = this.x;
                    zn8 zn8Var = this.y;
                    rj7 rj7Var = this.z;
                    rj1 rj1VarG = jf0.G(1824191207, new pf6(fo8Var, z, yy6Var, t89Var, zn8Var, rj7Var), dd4Var);
                    rt8 rt8Var = fo8.x;
                    gc1.e(fo8Var, this.c, z, this.e, this.f, this.s, this.t, this.u, this.v, null, yy6Var, xk9Var, rj1VarG, rj7Var, dd4Var, 8);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                qu1.l(this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, (dd4) obj, qu1.x0(9));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ ln8(fo8 fo8Var, ou6 ou6Var, boolean z, uka ukaVar, qj5 qj5Var, nj5 nj5Var, int i, int i2, int i3, yy6 yy6Var, t89 t89Var, zn8 zn8Var, rj7 rj7Var, int i4) {
        this.b = fo8Var;
        this.c = ou6Var;
        this.d = z;
        this.e = ukaVar;
        this.f = qj5Var;
        this.s = nj5Var;
        this.t = i;
        this.u = i2;
        this.v = i3;
        this.w = yy6Var;
        this.x = t89Var;
        this.y = zn8Var;
        this.z = rj7Var;
    }
}
