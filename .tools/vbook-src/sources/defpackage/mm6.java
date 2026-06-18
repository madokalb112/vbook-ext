package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class mm6 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ub4 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ mm6(c47 c47Var, boolean z, boolean z2, by3 by3Var, boolean z3, rj1 rj1Var) {
        this.a = 2;
        this.f = c47Var;
        this.b = z;
        this.c = z2;
        this.d = by3Var;
        this.e = rj1Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        ub4 ub4Var = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                vm7.F((d35) obj4, this.b, this.c, (ou6) obj3, (ib4) ub4Var, (dd4) obj, qu1.x0(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                p7c.P((koa) obj4, this.b, this.c, (ou6) obj3, (ib4) ub4Var, (dd4) obj, qu1.x0(1));
                break;
            default:
                c47 c47Var = (c47) obj4;
                by3 by3Var = (by3) obj3;
                rj1 rj1Var = (rj1) ub4Var;
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    br9 br9VarA = yf9.a(!this.c ? c47Var.f : this.b ? c47Var.a : c47Var.d, by3Var, dd4Var, 0, 12);
                    dd4Var.f0(453016797);
                    dd4Var.q(false);
                    ha6 ha6VarD = pn0.d(bv4.b, false);
                    int iHashCode = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL = dd4Var.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var, lu6.a);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var.j0();
                    if (dd4Var.S) {
                        dd4Var.k(um1Var);
                    } else {
                        dd4Var.s0();
                    }
                    un9.s(ll1.f, dd4Var, ha6VarD);
                    un9.s(ll1.e, dd4Var, lr7VarL);
                    un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
                    un9.r(dd4Var, ll1.h);
                    un9.s(ll1.d, dd4Var, ou6VarL0);
                    jv3.e(oq1.a.a(new lc1(((lc1) br9VarA.getValue()).a)), rj1Var, dd4Var, 8);
                    dd4Var.q(true);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ mm6(Object obj, boolean z, boolean z2, ou6 ou6Var, ib4 ib4Var, int i, int i2) {
        this.a = i2;
        this.f = obj;
        this.b = z;
        this.c = z2;
        this.d = ou6Var;
        this.e = ib4Var;
    }
}
