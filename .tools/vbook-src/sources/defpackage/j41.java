package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class j41 implements yb4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ ub4 s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ j41(String str, String str2, fv3 fv3Var, boolean z, boolean z2, t13 t13Var, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, int i) {
        this.b = str;
        this.c = str2;
        this.t = fv3Var;
        this.d = z;
        this.e = z2;
        this.u = t13Var;
        this.v = ou6Var;
        this.f = ib4Var;
        this.s = ib4Var2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        a07 a07Var;
        int i = this.a;
        heb hebVar = heb.a;
        ub4 ub4Var = this.s;
        Object obj3 = this.v;
        Object obj4 = this.f;
        Object obj5 = this.t;
        Object obj6 = this.c;
        Object obj7 = this.b;
        Object obj8 = this.u;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                fe.q(this.d, (String) obj7, (String) obj6, (bi5) obj5, this.e, (kb4) obj8, (kb4) obj3, (ib4) obj4, (ib4) ub4Var, (dd4) obj, qu1.x0(1769473));
                break;
            case 1:
                ((Integer) obj2).getClass();
                t96.g((String) obj7, (String) obj6, (fv3) obj5, this.d, this.e, (t13) obj8, (ou6) obj3, (ib4) obj4, (ib4) ub4Var, (dd4) obj, qu1.x0(513));
                break;
            default:
                kb4 kb4Var = (kb4) obj8;
                a07 a07Var2 = (a07) obj7;
                a07 a07Var3 = (a07) obj6;
                a07 a07Var4 = (a07) obj5;
                a07 a07Var5 = (a07) obj4;
                kb4 kb4Var2 = (kb4) obj3;
                kb4 kb4Var3 = (kb4) ub4Var;
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    eq8 eq8VarA = dq8.a(pv.a, bv4.w, dd4Var, 0);
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
                    un9.s(ll1.f, dd4Var, eq8VarA);
                    un9.s(ll1.e, dd4Var, lr7VarL);
                    un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
                    un9.r(dd4Var, ll1.h);
                    un9.s(ll1.d, dd4Var, ou6VarL0);
                    boolean z2 = this.d;
                    boolean z3 = this.e;
                    boolean z4 = z2 && !z3;
                    boolean zF = dd4Var.f(kb4Var) | dd4Var.f(a07Var2) | dd4Var.f(a07Var3) | dd4Var.f(a07Var4) | dd4Var.f(a07Var5);
                    Object objQ = dd4Var.Q();
                    fu6 fu6Var = vl1.a;
                    if (zF || objQ == fu6Var) {
                        z = true;
                        mm3 mm3Var = new mm3(kb4Var, a07Var2, a07Var3, a07Var4, a07Var5);
                        a07Var = a07Var5;
                        a07Var2 = a07Var2;
                        dd4Var.p0(mm3Var);
                        objQ = mm3Var;
                    } else {
                        a07Var = a07Var5;
                        z = true;
                    }
                    lc5.J((ib4) objQ, null, z4, null, null, null, jf0.G(-219707031, new a41(6, z3), dd4Var), dd4Var, 805306368, 506);
                    boolean z5 = (!z2 || z3) ? false : z;
                    boolean zF2 = dd4Var.f(kb4Var2) | dd4Var.f(a07Var2) | dd4Var.f(a07Var3) | dd4Var.f(a07Var4) | dd4Var.f(a07Var) | dd4Var.f(kb4Var3);
                    Object objQ2 = dd4Var.Q();
                    if (zF2 || objQ2 == fu6Var) {
                        c51 c51Var = new c51((ub4) kb4Var2, (Object) kb4Var3, a07Var2, a07Var3, a07Var4, a07Var, 7);
                        dd4Var.p0(c51Var);
                        objQ2 = c51Var;
                    }
                    lc5.J((ib4) objQ2, null, z5, null, null, null, lc5.D, dd4Var, 805306368, 506);
                    dd4Var.q(z);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ j41(boolean z, String str, String str2, bi5 bi5Var, boolean z2, kb4 kb4Var, kb4 kb4Var2, ib4 ib4Var, ib4 ib4Var2, int i) {
        this.d = z;
        this.b = str;
        this.c = str2;
        this.t = bi5Var;
        this.e = z2;
        this.u = kb4Var;
        this.v = kb4Var2;
        this.f = ib4Var;
        this.s = ib4Var2;
    }

    public /* synthetic */ j41(boolean z, boolean z2, kb4 kb4Var, a07 a07Var, a07 a07Var2, a07 a07Var3, a07 a07Var4, kb4 kb4Var2, kb4 kb4Var3) {
        this.d = z;
        this.e = z2;
        this.u = kb4Var;
        this.b = a07Var;
        this.c = a07Var2;
        this.t = a07Var3;
        this.f = a07Var4;
        this.v = kb4Var2;
        this.s = kb4Var3;
    }
}
