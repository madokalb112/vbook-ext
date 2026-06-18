package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class qd1 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wd1 b;

    public /* synthetic */ qd1(wd1 wd1Var, int i) {
        this.a = i;
        this.b = wd1Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        double dA;
        double d;
        double d2;
        zj4 zj4VarE;
        int i = this.a;
        f73 f73Var = f73.c;
        wd1 wd1Var = this.b;
        g73 g73Var = (g73) obj;
        switch (i) {
            case 0:
                g73Var.getClass();
                return Double.valueOf(wd1Var.A().a(g73Var));
            case 1:
                g73Var.getClass();
                return new vza(wd1Var.B(), wd1Var.A(), 5.0d, wza.a, false, uza.a, 16);
            case 2:
                g73Var.getClass();
                return g73Var.j == f73Var ? g73Var.c ? wd1Var.w() : wd1Var.x() : wd1Var.H();
            case 3:
                g73Var.getClass();
                if (g73Var.j == f73Var) {
                    return new vza(wd1Var.z(), wd1Var.y(), 5.0d, wza.d, false, uza.b, 16);
                }
                return null;
            case 4:
                g73Var.getClass();
                return Double.valueOf(wd1Var.u().a(g73Var));
            case 5:
                g73Var.getClass();
                return new vza(wd1Var.v(), wd1Var.u(), 5.0d, wza.a, false, uza.a, 16);
            case 6:
                g73Var.getClass();
                return Double.valueOf(wd1Var.q().a(g73Var));
            case 7:
                g73Var.getClass();
                return new vza(wd1Var.r(), wd1Var.q(), 5.0d, wza.a, false, uza.a, 16);
            case 8:
                g73Var.getClass();
                return Double.valueOf(wd1Var.t().a(new g73(g73Var.a, g73Var.b, false, 0.0d, g73Var.e, g73Var.f, g73Var.g, g73Var.h, g73Var.i, g73Var.j, g73Var.l, g73Var.k)));
            case 9:
                g73Var.getClass();
                if (g73Var.j == f73Var) {
                    return g73Var.c ? wd1Var.w() : wd1Var.x();
                }
                return null;
            case 10:
                g73Var.getClass();
                return wd1Var.H();
            case 11:
                g73Var.getClass();
                return new vza(wd1Var.F(), wd1Var.s(), 5.0d, wza.a, false, uza.b, 16);
            case 12:
                g73Var.getClass();
                return wd1Var.H();
            case 13:
                g73Var.getClass();
                return new vza(wd1Var.J(), wd1Var.y(), 5.0d, wza.a, false, uza.b, 16);
            case 14:
                g73Var.getClass();
                return wd1Var.H();
            case 15:
                g73Var.getClass();
                return new vza(wd1Var.E(), wd1Var.o(), 5.0d, wza.a, false, uza.b, 16);
            case 16:
                g73Var.getClass();
                return wd1Var.H();
            case 17:
                g73Var.getClass();
                return new vza(wd1Var.C(), wd1Var.b(), 5.0d, wza.a, false, uza.b, 16);
            case 18:
                g73Var.getClass();
                return g73Var.j == f73Var ? g73Var.c ? wd1Var.w() : wd1Var.x() : wd1Var.H();
            case 19:
                g73Var.getClass();
                if (g73Var.j == f73Var) {
                    return new vza(wd1Var.p(), wd1Var.o(), 5.0d, wza.d, false, uza.b, 16);
                }
                return null;
            case 20:
                g73Var.getClass();
                return g73Var.j == f73Var ? g73Var.c ? wd1Var.w() : wd1Var.x() : wd1Var.H();
            case 21:
                g73Var.getClass();
                if (g73Var.j == f73Var) {
                    return new vza(wd1Var.c(), wd1Var.b(), 5.0d, wza.d, false, uza.b, 16);
                }
                return null;
            case 22:
                g73Var.getClass();
                if (g73Var.j == f73Var) {
                    return g73Var.c ? wd1Var.w() : wd1Var.x();
                }
                return null;
            case 23:
                g73Var.getClass();
                return Double.valueOf(wd1Var.p().a(new g73(g73Var.a, g73Var.b, false, 0.0d, g73Var.e, g73Var.f, g73Var.g, g73Var.h, g73Var.i, g73Var.j, g73Var.l, g73Var.k)));
            case 24:
                g73Var.getClass();
                if (g73Var.j == f73Var) {
                    return g73Var.c ? wd1Var.w() : wd1Var.x();
                }
                return null;
            case 25:
                g73Var.getClass();
                if (g73Var.b == ykb.d) {
                    sza szaVar = g73Var.h;
                    double d3 = szaVar.a;
                    double d4 = 1.1d * szaVar.b;
                    double d5 = 100.0d;
                    zj4 zj4VarE2 = bx1.E(d3, d4, 100.0d);
                    while (true) {
                        d = d5;
                        do {
                            d2 = zj4VarE2.c;
                            if (d2 < d4 && 0.0d <= d5 && d5 <= 100.0d) {
                                d5 -= 1.0d;
                                zj4VarE = bx1.E(d3, d4, d5);
                            }
                        } while (d2 >= zj4VarE.c);
                        zj4VarE2 = zj4VarE;
                    }
                    dA = wx1.O(d, 0.0d, 100.0d);
                } else {
                    dA = (g73Var.j == f73Var ? g73Var.c ? wd1Var.w() : wd1Var.x() : wd1Var.H()).a(g73Var);
                }
                return Double.valueOf(dA);
            case 26:
                g73Var.getClass();
                return g73Var.j == f73Var ? g73Var.c ? wd1Var.w() : wd1Var.x() : wd1Var.H();
            case 27:
                g73Var.getClass();
                if (g73Var.j == f73.d) {
                    return new vza(wd1Var.c(), wd1Var.C(), 10.0d, wza.a, false, uza.b, 16);
                }
                return null;
            case 28:
                g73Var.getClass();
                return Double.valueOf(wd1Var.z().a(new g73(g73Var.a, g73Var.b, false, 0.0d, g73Var.e, g73Var.f, g73Var.g, g73Var.h, g73Var.i, g73Var.j, g73Var.l, g73Var.k)));
            default:
                g73Var.getClass();
                if (g73Var.j == f73Var) {
                    return g73Var.c ? wd1Var.w() : wd1Var.x();
                }
                return null;
        }
    }
}
