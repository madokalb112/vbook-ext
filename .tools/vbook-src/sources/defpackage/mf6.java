package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class mf6 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uw1 b;
    public final /* synthetic */ ef6 c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ kb4 e;
    public final /* synthetic */ dg6 f;

    public /* synthetic */ mf6(uw1 uw1Var, ef6 ef6Var, kb4 kb4Var, kb4 kb4Var2, dg6 dg6Var, int i) {
        this.a = i;
        this.b = uw1Var;
        this.c = ef6Var;
        this.d = kb4Var;
        this.e = kb4Var2;
        this.f = dg6Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        lu6 lu6Var = lu6.a;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dd4Var.Y();
                } else {
                    sdc.e(gjb.p0(tg9.f(lu6Var, 1.0f), 6.0f, 0.0f, 0.0f, 3.0f, 6), null, jf0.G(569941706, new mf6(this.b, this.c, this.d, this.e, this.f, 1), dd4Var), dd4Var, 3078, 6);
                }
                break;
            default:
                co0 co0Var = (co0) obj;
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                co0Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= dd4Var2.f(co0Var) ? 4 : 2;
                }
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    dd4Var2.Y();
                } else {
                    ou6 ou6VarT = tg9.t(lu6Var, 0.0f, co0Var.d() * 0.8f, 1);
                    uw1 uw1Var = this.b;
                    ou6 ou6VarW = t96.w(ou6VarT, uw1Var);
                    ef6 ef6Var = this.c;
                    ou6 ou6VarW2 = s32.W(ou6VarW, ef6Var.c, uw1Var, dd4Var2);
                    long jG = dd1.g(s00.o(dd4Var2), 0.5f);
                    lp4 lp4Var = jf0.G;
                    ou6 ou6VarM0 = gjb.m0(fe.L(ou6VarW2, jG, lp4Var), 8.0f, 4.0f);
                    ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
                    int iHashCode = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL = dd4Var2.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarM0);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(um1Var);
                    } else {
                        dd4Var2.s0();
                    }
                    un9.s(ll1.f, dd4Var2, ie1VarA);
                    un9.s(ll1.e, dd4Var2, lr7VarL);
                    un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
                    un9.r(dd4Var2, ll1.h);
                    un9.s(ll1.d, dd4Var2, ou6VarL0);
                    gf6 gf6Var = ef6Var.d;
                    kb4 kb4Var = this.e;
                    if (gf6Var != null) {
                        ky0.z(dd4Var2, -904515257, lu6Var, 4.0f, dd4Var2);
                        s32.M(gf6Var, ky0.h(dd4Var2, 2.0f, t96.w(lu6Var, s00.p(dd4Var2).b), lp4Var), this.d, kb4Var, dd4Var2, 0);
                        xv5.A(lu6Var, 12.0f, dd4Var2, false);
                    } else {
                        dd4Var2.f0(-903905022);
                        dd4Var2.q(false);
                    }
                    s32.P(ef6Var.b, s00.q(dd4Var2).j, gjb.n0(lu6Var, 0.0f, 4.0f, 1), kb4Var, dd4Var2, 384);
                    dg6 dg6Var = dg6.d;
                    dg6 dg6Var2 = this.f;
                    if (dg6Var2 == dg6Var || dg6Var2 == dg6.c) {
                        dd4Var2.f0(-903451275);
                        ri9.f(ef6Var.f, (ou6) null, false, lc1.c(0.6f, s00.o(dd4Var2).q), 0L, 0L, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).l, dd4Var2, 0, 0, 131062);
                        dd4Var2 = dd4Var2;
                        dd4Var2.q(false);
                    } else {
                        dd4Var2.f0(-903166974);
                        dd4Var2.q(false);
                    }
                    dd4Var2.q(true);
                }
                break;
        }
        return hebVar;
    }
}
