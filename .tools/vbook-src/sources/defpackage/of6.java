package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class of6 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cf6 b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ uw1 e;
    public final /* synthetic */ dg6 f;

    public /* synthetic */ of6(cf6 cf6Var, kb4 kb4Var, kb4 kb4Var2, uw1 uw1Var, dg6 dg6Var, int i) {
        this.a = i;
        this.b = cf6Var;
        this.c = kb4Var;
        this.d = kb4Var2;
        this.e = uw1Var;
        this.f = dg6Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dd4Var.Y();
                } else {
                    sdc.e(tg9.f(lu6.a, 1.0f), null, jf0.G(-2121539538, new of6(this.b, this.c, this.d, this.e, this.f, 1), dd4Var), dd4Var, 3078, 6);
                }
                break;
            default:
                lp4 lp4Var = jf0.G;
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
                    cf6 cf6Var = this.b;
                    gf6 gf6Var = cf6Var.f;
                    if (gf6Var == null || (gf6Var instanceof df6)) {
                        gf6Var = null;
                    }
                    lu6 lu6Var = lu6.a;
                    kb4 kb4Var = this.c;
                    if (gf6Var != null) {
                        ky0.z(dd4Var2, 1954485734, lu6Var, 4.0f, dd4Var2);
                        ou6 ou6VarT = tg9.t(lu6Var, 0.0f, co0Var.d() * 0.6f, 1);
                        ur9 ur9Var = s96.a;
                        s32.M(gf6Var, fe.L(t96.w(ou6VarT, ((q96) dd4Var2.j(ur9Var)).c.b), dd1.g(((q96) dd4Var2.j(ur9Var)).a, 2.0f), lp4Var), kb4Var, this.d, dd4Var2, 0);
                        dd4Var2 = dd4Var2;
                        xv5.A(lu6Var, 12.0f, dd4Var2, false);
                    } else {
                        dd4Var2.f0(1955083476);
                        dd4Var2.q(false);
                    }
                    String str = cf6Var.b;
                    int i2 = cf6Var.c;
                    int i3 = cf6Var.d;
                    ou6 ou6VarW = t96.w(gjb.p0(lu6Var, 6.0f, 0.0f, 0.0f, 3.0f, 6), this.e);
                    boolean zF = dd4Var2.f(kb4Var) | dd4Var2.f(cf6Var);
                    Object objQ = dd4Var2.Q();
                    if (zF || objQ == vl1.a) {
                        objQ = new nf6(kb4Var, cf6Var, 2);
                        dd4Var2.p0(objQ);
                    }
                    s32.G(i2, i3, 0, dd4Var2, yn2.V(1, (ib4) objQ, dd4Var2, ou6VarW, false), str);
                    dg6 dg6Var = dg6.d;
                    dg6 dg6Var2 = this.f;
                    if (dg6Var2 == dg6Var || dg6Var2 == dg6.c) {
                        dd4Var2.f0(1955638593);
                        dd4 dd4Var3 = dd4Var2;
                        ri9.f(cf6Var.h, gjb.m0(fe.L(t96.w(gjb.p0(zn0.a.a(lu6Var, bv4.t), 10.0f, 0.0f, 0.0f, 6.0f, 6), tp8.a), lc1.c(0.5f, lc1.b), lp4Var), 6.0f, 2.0f), false, lc1.e, 0L, 0L, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(s96.a)).b.l, dd4Var3, 3072, 0, 131060);
                        dd4Var3.q(false);
                    } else {
                        dd4Var2.f0(1956201460);
                        dd4Var2.q(false);
                    }
                }
                break;
        }
        return hebVar;
    }
}
