package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class pf6 implements zb4 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;

    public /* synthetic */ pf6(fo8 fo8Var, boolean z, yy6 yy6Var, t89 t89Var, zn8 zn8Var, rj7 rj7Var) {
        this.c = fo8Var;
        this.b = z;
        this.s = yy6Var;
        this.e = t89Var;
        this.f = zn8Var;
        this.d = rj7Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        dd4 dd4Var;
        kb4 kb4Var;
        int i = this.a;
        jv jvVar = pv.c;
        iv ivVar = pv.a;
        zn0 zn0Var = zn0.a;
        boolean z = this.b;
        heb hebVar = heb.a;
        Object obj4 = this.d;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.s;
        Object obj8 = this.c;
        switch (i) {
            case 0:
                uw1 uw1Var = (uw1) obj8;
                ef6 ef6Var = (ef6) obj7;
                kb4 kb4Var2 = (kb4) obj6;
                kb4 kb4Var3 = (kb4) obj5;
                dg6 dg6Var = (dg6) obj4;
                co0 co0Var = (co0) obj;
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                co0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= dd4Var2.f(co0Var) ? 4 : 2;
                }
                if (!dd4Var2.V(iIntValue & 1, (iIntValue & 19) != 18)) {
                    dd4Var2.Y();
                } else {
                    float fD = co0Var.d() * 0.8f;
                    xf0 xf0Var = bv4.d;
                    lu6 lu6Var = lu6.a;
                    ou6 ou6VarA = zn0Var.a(lu6Var, xf0Var);
                    eq8 eq8VarA = dq8.a(ivVar, bv4.w, dd4Var2, 0);
                    int iHashCode = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL = dd4Var2.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarA);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(um1Var);
                    } else {
                        dd4Var2.s0();
                    }
                    jm jmVar = ll1.f;
                    un9.s(jmVar, dd4Var2, eq8VarA);
                    jm jmVar2 = ll1.e;
                    un9.s(jmVar2, dd4Var2, lr7VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    jm jmVar3 = ll1.g;
                    un9.s(jmVar3, dd4Var2, numValueOf);
                    kd kdVar = ll1.h;
                    un9.r(dd4Var2, kdVar);
                    jm jmVar4 = ll1.d;
                    un9.s(jmVar4, dd4Var2, ou6VarL0);
                    if (z) {
                        dd4Var2.f0(1229900932);
                        l16.a(1.5f, 48, 1, 0L, dd4Var2, tg9.n(lu6Var, 10.0f).e(new hmb(bv4.y)));
                        dd4Var2.q(false);
                    } else {
                        dd4Var2.f0(1230674103);
                        dd4Var2.q(false);
                    }
                    ou6 ou6VarW = s32.W(t96.w(tg9.t(lu6Var, 0.0f, fD, 1), uw1Var), ef6Var.c, uw1Var, dd4Var2);
                    long jG = dd1.g(s00.o(dd4Var2), 0.2f);
                    lp4 lp4Var = jf0.G;
                    ou6 ou6VarM0 = gjb.m0(fe.L(ou6VarW, jG, lp4Var), 8.0f, 4.0f);
                    ie1 ie1VarA = ge1.a(jvVar, bv4.z, dd4Var2, 0);
                    int iHashCode2 = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL2 = dd4Var2.l();
                    ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarM0);
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(um1Var);
                    } else {
                        dd4Var2.s0();
                    }
                    un9.s(jmVar, dd4Var2, ie1VarA);
                    un9.s(jmVar2, dd4Var2, lr7VarL2);
                    ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
                    un9.s(jmVar4, dd4Var2, ou6VarL02);
                    gf6 gf6Var = ef6Var.d;
                    if (gf6Var != null) {
                        ky0.z(dd4Var2, -1238518158, lu6Var, 4.0f, dd4Var2);
                        s32.M(gf6Var, ky0.h(dd4Var2, 2.0f, t96.w(lu6Var, s00.p(dd4Var2).b), lp4Var), kb4Var2, kb4Var3, dd4Var2, 0);
                        xv5.A(lu6Var, 12.0f, dd4Var2, false);
                    } else {
                        dd4Var2.f0(-1237950207);
                        dd4Var2.q(false);
                    }
                    s32.P(ef6Var.b, s00.q(dd4Var2).j, gjb.n0(lu6Var, 0.0f, 4.0f, 1), kb4Var3, dd4Var2, 384);
                    if (dg6Var == dg6.d || dg6Var == dg6.c) {
                        dd4Var2.f0(-1237528700);
                        ri9.f(ef6Var.f, (ou6) null, false, lc1.c(0.6f, s00.o(dd4Var2).q), 0L, 0L, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).l, dd4Var2, 0, 0, 131062);
                        dd4Var2.q(false);
                    } else {
                        dd4Var2.f0(-1237263743);
                        dd4Var2.q(false);
                    }
                    dd4Var2.q(true);
                    dd4Var2.q(true);
                }
                break;
            case 1:
                lp4 lp4Var2 = jf0.G;
                uw1 uw1Var2 = (uw1) obj8;
                dg6 dg6Var2 = (dg6) obj4;
                cf6 cf6Var = (cf6) obj7;
                kb4 kb4Var4 = (kb4) obj6;
                kb4 kb4Var5 = (kb4) obj5;
                co0 co0Var2 = (co0) obj;
                dd4 dd4Var3 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                co0Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= dd4Var3.f(co0Var2) ? 4 : 2;
                }
                if (!dd4Var3.V(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    dd4Var3.Y();
                } else {
                    float fD2 = co0Var2.d() * 0.8f;
                    xf0 xf0Var2 = bv4.d;
                    lu6 lu6Var2 = lu6.a;
                    ou6 ou6VarA2 = zn0Var.a(lu6Var2, xf0Var2);
                    eq8 eq8VarA2 = dq8.a(ivVar, bv4.w, dd4Var3, 0);
                    int iHashCode3 = Long.hashCode(dd4Var3.T);
                    lr7 lr7VarL3 = dd4Var3.l();
                    ou6 ou6VarL03 = s32.L0(dd4Var3, ou6VarA2);
                    ml1.k.getClass();
                    um1 um1Var2 = ll1.b;
                    dd4Var3.j0();
                    if (dd4Var3.S) {
                        dd4Var3.k(um1Var2);
                    } else {
                        dd4Var3.s0();
                    }
                    jm jmVar5 = ll1.f;
                    un9.s(jmVar5, dd4Var3, eq8VarA2);
                    jm jmVar6 = ll1.e;
                    un9.s(jmVar6, dd4Var3, lr7VarL3);
                    Integer numValueOf2 = Integer.valueOf(iHashCode3);
                    jm jmVar7 = ll1.g;
                    un9.s(jmVar7, dd4Var3, numValueOf2);
                    kd kdVar2 = ll1.h;
                    un9.r(dd4Var3, kdVar2);
                    jm jmVar8 = ll1.d;
                    un9.s(jmVar8, dd4Var3, ou6VarL03);
                    if (z) {
                        dd4Var3.f0(-440737576);
                        l16.a(1.5f, 48, 1, 0L, dd4Var3, tg9.n(lu6Var2, 18.0f).e(new hmb(bv4.y)));
                        dd4Var = dd4Var3;
                        dd4Var.q(false);
                    } else {
                        dd4Var = dd4Var3;
                        dd4Var.f0(-439964405);
                        dd4Var.q(false);
                    }
                    ou6 ou6VarT = tg9.t(lu6Var2, 0.0f, fD2 * 0.8f, 1);
                    ha6 ha6VarD = pn0.d(bv4.b, false);
                    int iHashCode4 = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL4 = dd4Var.l();
                    ou6 ou6VarL04 = s32.L0(dd4Var, ou6VarT);
                    dd4Var.j0();
                    if (dd4Var.S) {
                        dd4Var.k(um1Var2);
                    } else {
                        dd4Var.s0();
                    }
                    un9.s(jmVar5, dd4Var, ha6VarD);
                    un9.s(jmVar6, dd4Var, lr7VarL4);
                    ky0.v(iHashCode4, dd4Var, jmVar7, dd4Var, kdVar2);
                    un9.s(jmVar8, dd4Var, ou6VarL04);
                    ou6 ou6VarW2 = t96.w(lu6Var2, uw1Var2);
                    ie1 ie1VarA2 = ge1.a(jvVar, bv4.z, dd4Var, 0);
                    int iHashCode5 = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL5 = dd4Var.l();
                    ou6 ou6VarL05 = s32.L0(dd4Var, ou6VarW2);
                    dd4Var.j0();
                    if (dd4Var.S) {
                        dd4Var.k(um1Var2);
                    } else {
                        dd4Var.s0();
                    }
                    un9.s(jmVar5, dd4Var, ie1VarA2);
                    un9.s(jmVar6, dd4Var, lr7VarL5);
                    ky0.v(iHashCode5, dd4Var, jmVar7, dd4Var, kdVar2);
                    un9.s(jmVar8, dd4Var, ou6VarL05);
                    gf6 gf6Var2 = cf6Var.f;
                    gf6 gf6Var3 = (gf6Var2 == null || (gf6Var2 instanceof df6)) ? null : gf6Var2;
                    if (gf6Var3 != null) {
                        ky0.z(dd4Var, -1361603660, lu6Var2, 4.0f, dd4Var);
                        ur9 ur9Var = s96.a;
                        s32.M(gf6Var3, fe.L(t96.w(lu6Var2, ((q96) dd4Var.j(ur9Var)).c.b), dd1.g(((q96) dd4Var.j(ur9Var)).a, 2.0f), lp4Var2), kb4Var4, kb4Var5, dd4Var, 0);
                        kb4Var = kb4Var4;
                        xv5.A(lu6Var2, 12.0f, dd4Var, false);
                    } else {
                        kb4Var = kb4Var4;
                        dd4Var.f0(-1360993425);
                        dd4Var.q(false);
                    }
                    String str = cf6Var.b;
                    int i2 = cf6Var.c;
                    int i3 = cf6Var.d;
                    ou6 ou6VarW3 = t96.w(gjb.p0(lu6Var2, 12.0f, 0.0f, 0.0f, 3.0f, 6), uw1Var2);
                    boolean zF = dd4Var.f(kb4Var) | dd4Var.f(cf6Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == vl1.a) {
                        objQ = new nf6(kb4Var, cf6Var, 3);
                        dd4Var.p0(objQ);
                    }
                    s32.G(i2, i3, 0, dd4Var, fw.J(null, (ib4) objQ, ou6VarW3, false, 15), str);
                    dd4Var.q(true);
                    if (dg6Var2 == dg6.d || dg6Var2 == dg6.c) {
                        dd4Var.f0(1046946484);
                        ri9.f(cf6Var.h, gjb.m0(fe.L(t96.w(gjb.p0(zn0Var.a(lu6Var2, bv4.v), 10.0f, 0.0f, 0.0f, 6.0f, 6), tp8.a), lc1.c(0.5f, lc1.b), lp4Var2), 6.0f, 2.0f), false, lc1.e, 0L, 0L, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(s96.a)).b.l, dd4Var, 3072, 0, 131060);
                        dd4Var.q(false);
                    } else {
                        dd4Var.f0(1047507429);
                        dd4Var.q(false);
                    }
                    dd4Var.q(true);
                    dd4Var.q(true);
                }
                break;
            default:
                fo8 fo8Var = (fo8) obj8;
                yy6 yy6Var = (yy6) obj7;
                t89 t89Var = (t89) obj6;
                zn8 zn8Var = (zn8) obj5;
                pj7 pj7Var = (rj7) obj4;
                yb4 yb4Var = (yb4) obj;
                dd4 dd4Var4 = (dd4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                yb4Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= dd4Var4.h(yb4Var) ? 4 : 2;
                }
                if (!dd4Var4.V(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    dd4Var4.Y();
                } else {
                    mc8.y.m(fo8Var.s(), yb4Var, this.b, yy6Var, t89Var, zn8Var, pj7Var, fe.n, dd4Var4, ((iIntValue3 << 3) & Token.ASSIGN_MOD) | 24576);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ pf6(boolean z, uw1 uw1Var, ef6 ef6Var, kb4 kb4Var, kb4 kb4Var2, dg6 dg6Var) {
        this.b = z;
        this.c = uw1Var;
        this.s = ef6Var;
        this.e = kb4Var;
        this.f = kb4Var2;
        this.d = dg6Var;
    }

    public /* synthetic */ pf6(boolean z, uw1 uw1Var, dg6 dg6Var, cf6 cf6Var, kb4 kb4Var, kb4 kb4Var2) {
        this.b = z;
        this.c = uw1Var;
        this.d = dg6Var;
        this.s = cf6Var;
        this.e = kb4Var;
        this.f = kb4Var2;
    }
}
