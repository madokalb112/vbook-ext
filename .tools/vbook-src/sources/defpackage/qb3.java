package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qb3 implements ac4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ a07 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;

    public qb3(boolean z, boolean z2, w93 w93Var, kb4 kb4Var, kb4 kb4Var2, a07 a07Var) {
        this.a = 0;
        this.b = z;
        this.c = z2;
        this.f = w93Var;
        this.d = kb4Var;
        this.s = kb4Var2;
        this.e = a07Var;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        uw1 uw1VarD;
        uw1 uw1VarD2;
        Object obj5;
        uw1 uw1VarD3;
        Object obj6;
        uw1 uw1VarD4;
        int i;
        int i2 = this.a;
        iv ivVar = pv.a;
        a07 a07Var = this.e;
        kb4 kb4Var = this.d;
        boolean z = this.b;
        lu6 lu6Var = lu6.a;
        Object obj7 = vl1.a;
        Object obj8 = this.s;
        boolean z2 = this.c;
        Object obj9 = this.f;
        switch (i2) {
            case 0:
                xi8 xi8Var = (xi8) obj;
                ((Boolean) obj2).getClass();
                dd4 dd4Var = (dd4) obj3;
                int iIntValue = ((Number) obj4).intValue();
                xi8Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= dd4Var.f(xi8Var) ? 4 : 2;
                }
                if (dd4Var.V(iIntValue & 1, (iIntValue & Token.DO) != 130)) {
                    ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                    if (!z && !z2) {
                        dd4Var.f0(-1187005412);
                        uw1VarD = ((q96) dd4Var.j(s96.a)).c.a;
                        dd4Var.q(false);
                    } else if (z && z2) {
                        dd4Var.f0(-1187002665);
                        uw1VarD = ((q96) dd4Var.j(s96.a)).c.d;
                        dd4Var.q(false);
                    } else if (z) {
                        dd4Var.f0(1857704271);
                        ur9 ur9Var = s96.a;
                        uw1VarD = uw1.d(((q96) dd4Var.j(ur9Var)).c.d, (ax1) null, (ax1) null, ((q96) dd4Var.j(ur9Var)).c.a.c, ((q96) dd4Var.j(ur9Var)).c.a.d, 3);
                        dd4Var.q(false);
                    } else {
                        dd4Var.f0(-1186990649);
                        ur9 ur9Var2 = s96.a;
                        uw1VarD = uw1.d(((q96) dd4Var.j(ur9Var2)).c.d, ((q96) dd4Var.j(ur9Var2)).c.a.a, ((q96) dd4Var.j(ur9Var2)).c.a.b, (ax1) null, (ax1) null, 12);
                        dd4Var.q(false);
                    }
                    ou6 ou6VarW = t96.w(ou6VarF, uw1VarD);
                    long jG = dd1.g(s00.o(dd4Var), 1.0f);
                    lp4 lp4Var = jf0.G;
                    ou6 ou6VarL0 = gjb.l0(fe.L(ou6VarW, jG, lp4Var), 12.0f);
                    w93 w93Var = (w93) obj9;
                    kb4 kb4Var2 = (kb4) obj8;
                    eq8 eq8VarA = dq8.a(ivVar, bv4.x, dd4Var, 48);
                    int iHashCode = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL = dd4Var.l();
                    ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarL0);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var.j0();
                    if (dd4Var.S) {
                        dd4Var.k(um1Var);
                    } else {
                        dd4Var.s0();
                    }
                    jm jmVar = ll1.f;
                    un9.s(jmVar, dd4Var, eq8VarA);
                    jm jmVar2 = ll1.e;
                    un9.s(jmVar2, dd4Var, lr7VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    jm jmVar3 = ll1.g;
                    un9.s(jmVar3, dd4Var, numValueOf);
                    kd kdVar = ll1.h;
                    un9.r(dd4Var, kdVar);
                    jm jmVar4 = ll1.d;
                    un9.s(jmVar4, dd4Var, ou6VarL02);
                    w05.a(w93Var.b, ra1.d, false, null, null, t96.w(tg9.n(lu6Var, 56.0f), s00.p(dd4Var).c), null, dd4Var, 48, 444);
                    bp5 bp5VarF = j39.f(lu6Var, 12.0f, dd4Var, 1.0f, true);
                    ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
                    int iHashCode2 = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL2 = dd4Var.l();
                    ou6 ou6VarL03 = s32.L0(dd4Var, bp5VarF);
                    dd4Var.j0();
                    if (dd4Var.S) {
                        dd4Var.k(um1Var);
                    } else {
                        dd4Var.s0();
                    }
                    un9.s(jmVar, dd4Var, ie1VarA);
                    un9.s(jmVar2, dd4Var, lr7VarL2);
                    ky0.v(iHashCode2, dd4Var, jmVar3, dd4Var, kdVar);
                    un9.s(jmVar4, dd4Var, ou6VarL03);
                    nha.c(w93Var.a, (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 1, 0, (kb4) null, s00.q(dd4Var).j, dd4Var, 0, 24960, 110590);
                    nha.c(wn9.L((pv9) zt9.H0.getValue(), new Object[]{Integer.valueOf(w93Var.c)}, dd4Var), (ou6) null, lc1.c(0.62f, s00.o(dd4Var).q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).k, dd4Var, 0, 0, 131066);
                    dd4Var.q(true);
                    ou6 ou6VarN = tg9.n(lu6Var, 40.0f);
                    rp8 rp8Var = tp8.a;
                    ou6 ou6VarW2 = t96.w(ou6VarN, rp8Var);
                    long j = lc1.f;
                    ou6 ou6VarL = fe.L(ou6VarW2, lc1.c(0.12f, j), lp4Var);
                    boolean zF = dd4Var.f(kb4Var) | dd4Var.h(w93Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj7) {
                        objQ = new e7(8, kb4Var, w93Var);
                        dd4Var.p0(objQ);
                    }
                    ou6 ou6VarJ = fw.J(null, (ib4) objQ, ou6VarL, false, 15);
                    xf0 xf0Var = bv4.f;
                    ha6 ha6VarD = pn0.d(xf0Var, false);
                    int iHashCode3 = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL3 = dd4Var.l();
                    ou6 ou6VarL04 = s32.L0(dd4Var, ou6VarJ);
                    dd4Var.j0();
                    if (dd4Var.S) {
                        dd4Var.k(um1Var);
                    } else {
                        dd4Var.s0();
                    }
                    un9.s(jmVar, dd4Var, ha6VarD);
                    un9.s(jmVar2, dd4Var, lr7VarL3);
                    ky0.v(iHashCode3, dd4Var, jmVar3, dd4Var, kdVar);
                    un9.s(jmVar4, dd4Var, ou6VarL04);
                    mx4.a(i25.c((m53) a53.H.getValue(), dd4Var, 0), (String) null, tg9.n(lu6Var, 20.0f), j, dd4Var, 3504, 0);
                    ky0.A(dd4Var, true, lu6Var, 8.0f, dd4Var);
                    ou6 ou6VarH = ky0.h(dd4Var, 8.0f, t96.w(tg9.n(lu6Var, 40.0f), rp8Var), lp4Var);
                    boolean zF2 = dd4Var.f(kb4Var2) | dd4Var.f(a07Var);
                    Object objQ2 = dd4Var.Q();
                    if (zF2 || objQ2 == obj7) {
                        objQ2 = new us1(2, kb4Var2, a07Var);
                        dd4Var.p0(objQ2);
                    }
                    ou6 ou6VarL2 = ex1.L(xi8Var, ou6VarH, (ib4) objQ2);
                    ha6 ha6VarD2 = pn0.d(xf0Var, false);
                    int iHashCode4 = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL4 = dd4Var.l();
                    ou6 ou6VarL05 = s32.L0(dd4Var, ou6VarL2);
                    dd4Var.j0();
                    if (dd4Var.S) {
                        dd4Var.k(um1Var);
                    } else {
                        dd4Var.s0();
                    }
                    un9.s(jmVar, dd4Var, ha6VarD2);
                    un9.s(jmVar2, dd4Var, lr7VarL4);
                    ky0.v(iHashCode4, dd4Var, jmVar3, dd4Var, kdVar);
                    un9.s(jmVar4, dd4Var, ou6VarL05);
                    mx4.a(i25.c((m53) a53.N.getValue(), dd4Var, 0), (String) null, tg9.n(lu6Var, 20.0f), 0L, dd4Var, 432, 8);
                    dd4Var.q(true);
                    dd4Var.q(true);
                } else {
                    dd4Var.Y();
                }
                break;
            case 1:
                xi8 xi8Var2 = (xi8) obj;
                ((Boolean) obj2).getClass();
                dd4 dd4Var2 = (dd4) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                zb4 zb4Var = (zb4) obj9;
                yha yhaVar = (yha) obj8;
                xi8Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= dd4Var2.f(xi8Var2) ? 4 : 2;
                }
                if (dd4Var2.V(iIntValue2 & 1, (iIntValue2 & Token.DO) != 130)) {
                    ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
                    if (!z && !z2) {
                        dd4Var2.f0(-811816292);
                        uw1VarD2 = ((q96) dd4Var2.j(s96.a)).c.a;
                        dd4Var2.q(false);
                    } else if (z && z2) {
                        dd4Var2.f0(-811813545);
                        uw1VarD2 = ((q96) dd4Var2.j(s96.a)).c.d;
                        dd4Var2.q(false);
                    } else if (z) {
                        dd4Var2.f0(603665103);
                        ur9 ur9Var3 = s96.a;
                        uw1VarD2 = uw1.d(((q96) dd4Var2.j(ur9Var3)).c.d, (ax1) null, (ax1) null, ((q96) dd4Var2.j(ur9Var3)).c.a.c, ((q96) dd4Var2.j(ur9Var3)).c.a.d, 3);
                        dd4Var2.q(false);
                    } else {
                        dd4Var2.f0(-811801529);
                        ur9 ur9Var4 = s96.a;
                        uw1VarD2 = uw1.d(((q96) dd4Var2.j(ur9Var4)).c.d, ((q96) dd4Var2.j(ur9Var4)).c.a.a, ((q96) dd4Var2.j(ur9Var4)).c.a.b, (ax1) null, (ax1) null, 12);
                        dd4Var2.q(false);
                    }
                    ou6 ou6VarW3 = t96.w(ou6VarF2, uw1VarD2);
                    boolean zF3 = dd4Var2.f(zb4Var) | dd4Var2.h(yhaVar);
                    Object objQ3 = dd4Var2.Q();
                    if (zF3 || objQ3 == obj7) {
                        objQ3 = new e7(13, zb4Var, yhaVar);
                        dd4Var2.p0(objQ3);
                    }
                    ou6 ou6VarJ2 = fw.J(null, (ib4) objQ3, ou6VarW3, false, 15);
                    long jG2 = dd1.g(s00.o(dd4Var2), 1.0f);
                    lp4 lp4Var2 = jf0.G;
                    ou6 ou6VarM0 = gjb.m0(fe.L(ou6VarJ2, jG2, lp4Var2), 16.0f, 8.0f);
                    eq8 eq8VarA2 = dq8.a(ivVar, bv4.x, dd4Var2, 48);
                    int iHashCode5 = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL5 = dd4Var2.l();
                    ou6 ou6VarL06 = s32.L0(dd4Var2, ou6VarM0);
                    ml1.k.getClass();
                    um1 um1Var2 = ll1.b;
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(um1Var2);
                    } else {
                        dd4Var2.s0();
                    }
                    jm jmVar5 = ll1.f;
                    un9.s(jmVar5, dd4Var2, eq8VarA2);
                    jm jmVar6 = ll1.e;
                    un9.s(jmVar6, dd4Var2, lr7VarL5);
                    Integer numValueOf2 = Integer.valueOf(iHashCode5);
                    jm jmVar7 = ll1.g;
                    un9.s(jmVar7, dd4Var2, numValueOf2);
                    kd kdVar2 = ll1.h;
                    un9.r(dd4Var2, kdVar2);
                    jm jmVar8 = ll1.d;
                    un9.s(jmVar8, dd4Var2, ou6VarL06);
                    p35 p35VarC = i25.c((m53) a53.N.getValue(), dd4Var2, 0);
                    ou6 ou6VarN2 = tg9.n(lu6Var, 40.0f);
                    boolean zF4 = dd4Var2.f(kb4Var) | dd4Var2.f(a07Var);
                    Object objQ4 = dd4Var2.Q();
                    if (zF4 || objQ4 == obj7) {
                        obj5 = obj7;
                        objQ4 = new us1(3, kb4Var, a07Var);
                        dd4Var2.p0(objQ4);
                    } else {
                        obj5 = obj7;
                    }
                    mx4.a(p35VarC, (String) null, gjb.l0(ex1.L(xi8Var2, ou6VarN2, (ib4) objQ4), 8.0f), 0L, dd4Var2, 48, 8);
                    bp5 bp5VarF2 = j39.f(lu6Var, 8.0f, dd4Var2, 1.0f, true);
                    ie1 ie1VarA2 = ge1.a(pv.c, bv4.z, dd4Var2, 0);
                    int iHashCode6 = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL6 = dd4Var2.l();
                    ou6 ou6VarL07 = s32.L0(dd4Var2, bp5VarF2);
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(um1Var2);
                    } else {
                        dd4Var2.s0();
                    }
                    un9.s(jmVar5, dd4Var2, ie1VarA2);
                    un9.s(jmVar6, dd4Var2, lr7VarL6);
                    ky0.v(iHashCode6, dd4Var2, jmVar7, dd4Var2, kdVar2);
                    un9.s(jmVar8, dd4Var2, ou6VarL07);
                    nha.c(yhaVar.b, tg9.f(lu6Var, 1.0f), s00.o(dd4Var2).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).j, dd4Var2, 48, 0, 131064);
                    nha.c(yhaVar.c, tg9.f(lu6Var, 1.0f), s00.o(dd4Var2).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).j, dd4Var2, 48, 0, 131064);
                    dd4Var2.q(true);
                    p35 p35VarC2 = i25.c((m53) a53.H.getValue(), dd4Var2, 0);
                    long j2 = lc1.f;
                    ou6 ou6VarH2 = ky0.h(dd4Var2, 2.0f, t96.w(tg9.n(lu6Var, 32.0f), tp8.a), lp4Var2);
                    boolean zF5 = dd4Var2.f(a07Var) | dd4Var2.h(yhaVar) | dd4Var2.f(kb4Var);
                    Object objQ5 = dd4Var2.Q();
                    if (zF5 || objQ5 == obj5) {
                        objQ5 = new k90(2, kb4Var, a07Var, yhaVar);
                        dd4Var2.p0(objQ5);
                    }
                    mx4.a(p35VarC2, (String) null, gjb.l0(fw.J(null, (ib4) objQ5, ou6VarH2, false, 15), 6.0f), j2, dd4Var2, 3120, 0);
                    dd4Var2.q(true);
                } else {
                    dd4Var2.Y();
                }
                break;
            case 2:
                xi8 xi8Var3 = (xi8) obj;
                ((Boolean) obj2).getClass();
                dd4 dd4Var3 = (dd4) obj3;
                int iIntValue3 = ((Number) obj4).intValue();
                zb4 zb4Var2 = (zb4) obj9;
                o78 o78Var = (o78) obj8;
                xi8Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= dd4Var3.f(xi8Var3) ? 4 : 2;
                }
                if (dd4Var3.V(iIntValue3 & 1, (iIntValue3 & Token.DO) != 130)) {
                    ou6 ou6VarF3 = tg9.f(lu6Var, 1.0f);
                    if (!z && !z2) {
                        dd4Var3.f0(1851893265);
                        uw1VarD3 = ((q96) dd4Var3.j(s96.a)).c.a;
                        dd4Var3.q(false);
                    } else if (z && z2) {
                        dd4Var3.f0(1851896012);
                        uw1VarD3 = ((q96) dd4Var3.j(s96.a)).c.d;
                        dd4Var3.q(false);
                    } else if (z) {
                        dd4Var3.f0(1574282746);
                        ur9 ur9Var5 = s96.a;
                        uw1VarD3 = uw1.d(((q96) dd4Var3.j(ur9Var5)).c.d, (ax1) null, (ax1) null, ((q96) dd4Var3.j(ur9Var5)).c.a.c, ((q96) dd4Var3.j(ur9Var5)).c.a.d, 3);
                        dd4Var3.q(false);
                    } else if (z2) {
                        dd4Var3.f0(1851908156);
                        ur9 ur9Var6 = s96.a;
                        uw1VarD3 = uw1.d(((q96) dd4Var3.j(ur9Var6)).c.d, ((q96) dd4Var3.j(ur9Var6)).c.a.a, ((q96) dd4Var3.j(ur9Var6)).c.a.b, (ax1) null, (ax1) null, 12);
                        dd4Var3.q(false);
                    } else {
                        dd4Var3.f0(1851916785);
                        uw1VarD3 = ((q96) dd4Var3.j(s96.a)).c.a;
                        dd4Var3.q(false);
                    }
                    ou6 ou6VarW4 = t96.w(ou6VarF3, uw1VarD3);
                    long jG3 = dd1.g(s00.o(dd4Var3), 1.0f);
                    lp4 lp4Var3 = jf0.G;
                    ou6 ou6VarL3 = fe.L(ou6VarW4, jG3, lp4Var3);
                    boolean zF6 = dd4Var3.f(zb4Var2) | dd4Var3.h(o78Var);
                    Object objQ6 = dd4Var3.Q();
                    if (zF6 || objQ6 == obj7) {
                        objQ6 = new e7(24, zb4Var2, o78Var);
                        dd4Var3.p0(objQ6);
                    }
                    ou6 ou6VarM02 = gjb.m0(fw.J(null, (ib4) objQ6, ou6VarL3, false, 15), 16.0f, 8.0f);
                    eq8 eq8VarA3 = dq8.a(ivVar, bv4.x, dd4Var3, 48);
                    int iHashCode7 = Long.hashCode(dd4Var3.T);
                    lr7 lr7VarL7 = dd4Var3.l();
                    ou6 ou6VarL08 = s32.L0(dd4Var3, ou6VarM02);
                    ml1.k.getClass();
                    um1 um1Var3 = ll1.b;
                    dd4Var3.j0();
                    if (dd4Var3.S) {
                        dd4Var3.k(um1Var3);
                    } else {
                        dd4Var3.s0();
                    }
                    jm jmVar9 = ll1.f;
                    un9.s(jmVar9, dd4Var3, eq8VarA3);
                    jm jmVar10 = ll1.e;
                    un9.s(jmVar10, dd4Var3, lr7VarL7);
                    Integer numValueOf3 = Integer.valueOf(iHashCode7);
                    jm jmVar11 = ll1.g;
                    un9.s(jmVar11, dd4Var3, numValueOf3);
                    kd kdVar3 = ll1.h;
                    un9.r(dd4Var3, kdVar3);
                    jm jmVar12 = ll1.d;
                    un9.s(jmVar12, dd4Var3, ou6VarL08);
                    p35 p35VarC3 = i25.c((m53) a53.N.getValue(), dd4Var3, 0);
                    ou6 ou6VarN3 = tg9.n(lu6Var, 40.0f);
                    boolean zF7 = dd4Var3.f(kb4Var) | dd4Var3.f(a07Var);
                    Object objQ7 = dd4Var3.Q();
                    if (zF7 || objQ7 == obj7) {
                        obj6 = obj7;
                        objQ7 = new us1(4, kb4Var, a07Var);
                        dd4Var3.p0(objQ7);
                    } else {
                        obj6 = obj7;
                    }
                    mx4.a(p35VarC3, (String) null, gjb.l0(ex1.L(xi8Var3, ou6VarN3, (ib4) objQ7), 8.0f), 0L, dd4Var3, 48, 8);
                    bp5 bp5VarF3 = j39.f(lu6Var, 8.0f, dd4Var3, 1.0f, true);
                    ie1 ie1VarA3 = ge1.a(pv.c, bv4.z, dd4Var3, 0);
                    int iHashCode8 = Long.hashCode(dd4Var3.T);
                    lr7 lr7VarL8 = dd4Var3.l();
                    ou6 ou6VarL09 = s32.L0(dd4Var3, bp5VarF3);
                    dd4Var3.j0();
                    if (dd4Var3.S) {
                        dd4Var3.k(um1Var3);
                    } else {
                        dd4Var3.s0();
                    }
                    un9.s(jmVar9, dd4Var3, ie1VarA3);
                    un9.s(jmVar10, dd4Var3, lr7VarL8);
                    ky0.v(iHashCode8, dd4Var3, jmVar11, dd4Var3, kdVar3);
                    un9.s(jmVar12, dd4Var3, ou6VarL09);
                    nha.c(o78Var.b, tg9.f(lu6Var, 1.0f), s00.o(dd4Var3).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var3).j, dd4Var3, 48, 0, 131064);
                    nha.c(o78Var.c, tg9.f(lu6Var, 1.0f), s00.o(dd4Var3).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var3).j, dd4Var3, 48, 0, 131064);
                    dd4Var3.q(true);
                    p35 p35VarC4 = i25.c((m53) a53.H.getValue(), dd4Var3, 0);
                    long j3 = lc1.f;
                    ou6 ou6VarH3 = ky0.h(dd4Var3, 2.0f, t96.w(tg9.n(lu6Var, 32.0f), tp8.a), lp4Var3);
                    boolean zF8 = dd4Var3.f(a07Var) | dd4Var3.h(o78Var) | dd4Var3.f(kb4Var);
                    Object objQ8 = dd4Var3.Q();
                    if (zF8 || objQ8 == obj6) {
                        objQ8 = new k90(5, kb4Var, a07Var, o78Var);
                        dd4Var3.p0(objQ8);
                    }
                    mx4.a(p35VarC4, (String) null, gjb.l0(fw.J(null, (ib4) objQ8, ou6VarH3, false, 15), 6.0f), j3, dd4Var3, 3120, 0);
                    dd4Var3.q(true);
                } else {
                    dd4Var3.Y();
                }
                break;
            default:
                xi8 xi8Var4 = (xi8) obj;
                ((Boolean) obj2).getClass();
                dd4 dd4Var4 = (dd4) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                ac4 ac4Var = (ac4) obj9;
                dab dabVar = (dab) obj8;
                xi8Var4.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= dd4Var4.f(xi8Var4) ? 4 : 2;
                }
                int i3 = iIntValue4;
                if (dd4Var4.V(i3 & 1, (i3 & Token.DO) != 130)) {
                    ou6 ou6VarF4 = tg9.f(lu6Var, 1.0f);
                    if (!z && !z2) {
                        dd4Var4.f0(-1849423158);
                        uw1VarD4 = ((q96) dd4Var4.j(s96.a)).c.a;
                        dd4Var4.q(false);
                    } else if (z && z2) {
                        dd4Var4.f0(-1849420411);
                        uw1VarD4 = ((q96) dd4Var4.j(s96.a)).c.d;
                        dd4Var4.q(false);
                    } else if (z) {
                        dd4Var4.f0(-1497376671);
                        ur9 ur9Var7 = s96.a;
                        uw1VarD4 = uw1.d(((q96) dd4Var4.j(ur9Var7)).c.d, (ax1) null, (ax1) null, ((q96) dd4Var4.j(ur9Var7)).c.a.c, ((q96) dd4Var4.j(ur9Var7)).c.a.d, 3);
                        dd4Var4.q(false);
                    } else {
                        dd4Var4.f0(-1849408395);
                        ur9 ur9Var8 = s96.a;
                        uw1VarD4 = uw1.d(((q96) dd4Var4.j(ur9Var8)).c.d, ((q96) dd4Var4.j(ur9Var8)).c.a.a, ((q96) dd4Var4.j(ur9Var8)).c.a.b, (ax1) null, (ax1) null, 12);
                        dd4Var4.q(false);
                    }
                    ou6 ou6VarW5 = t96.w(ou6VarF4, uw1VarD4);
                    boolean zF9 = dd4Var4.f(ac4Var) | dd4Var4.h(dabVar);
                    Object objQ9 = dd4Var4.Q();
                    if (zF9 || objQ9 == obj7) {
                        objQ9 = new e7(29, ac4Var, dabVar);
                        dd4Var4.p0(objQ9);
                    }
                    ou6 ou6VarJ3 = fw.J(null, (ib4) objQ9, ou6VarW5, false, 15);
                    long jG4 = dd1.g(s00.o(dd4Var4), 1.0f);
                    lp4 lp4Var4 = jf0.G;
                    ou6 ou6VarM03 = gjb.m0(fe.L(ou6VarJ3, jG4, lp4Var4), 16.0f, 8.0f);
                    eq8 eq8VarA4 = dq8.a(ivVar, bv4.x, dd4Var4, 48);
                    int iHashCode9 = Long.hashCode(dd4Var4.T);
                    lr7 lr7VarL9 = dd4Var4.l();
                    ou6 ou6VarL010 = s32.L0(dd4Var4, ou6VarM03);
                    ml1.k.getClass();
                    um1 um1Var4 = ll1.b;
                    dd4Var4.j0();
                    if (dd4Var4.S) {
                        dd4Var4.k(um1Var4);
                    } else {
                        dd4Var4.s0();
                    }
                    jm jmVar13 = ll1.f;
                    un9.s(jmVar13, dd4Var4, eq8VarA4);
                    jm jmVar14 = ll1.e;
                    un9.s(jmVar14, dd4Var4, lr7VarL9);
                    Integer numValueOf4 = Integer.valueOf(iHashCode9);
                    jm jmVar15 = ll1.g;
                    un9.s(jmVar15, dd4Var4, numValueOf4);
                    kd kdVar4 = ll1.h;
                    un9.r(dd4Var4, kdVar4);
                    jm jmVar16 = ll1.d;
                    un9.s(jmVar16, dd4Var4, ou6VarL010);
                    p35 p35VarC5 = i25.c((m53) a53.N.getValue(), dd4Var4, 0);
                    ou6 ou6VarN4 = tg9.n(lu6Var, 40.0f);
                    boolean zF10 = dd4Var4.f(kb4Var) | dd4Var4.f(a07Var);
                    Object objQ10 = dd4Var4.Q();
                    int i4 = 6;
                    if (zF10 || objQ10 == obj7) {
                        objQ10 = new us1(i4, kb4Var, a07Var);
                        dd4Var4.p0(objQ10);
                    }
                    mx4.a(p35VarC5, (String) null, gjb.l0(ex1.L(xi8Var4, ou6VarN4, (ib4) objQ10), 8.0f), 0L, dd4Var4, 48, 8);
                    bp5 bp5VarF4 = j39.f(lu6Var, 8.0f, dd4Var4, 1.0f, true);
                    ie1 ie1VarA4 = ge1.a(pv.c, bv4.z, dd4Var4, 0);
                    int iHashCode10 = Long.hashCode(dd4Var4.T);
                    lr7 lr7VarL10 = dd4Var4.l();
                    ou6 ou6VarL011 = s32.L0(dd4Var4, bp5VarF4);
                    dd4Var4.j0();
                    if (dd4Var4.S) {
                        dd4Var4.k(um1Var4);
                    } else {
                        dd4Var4.s0();
                    }
                    un9.s(jmVar13, dd4Var4, ie1VarA4);
                    un9.s(jmVar14, dd4Var4, lr7VarL10);
                    ky0.v(iHashCode10, dd4Var4, jmVar15, dd4Var4, kdVar4);
                    un9.s(jmVar16, dd4Var4, ou6VarL011);
                    nha.c(dabVar.c, tg9.f(lu6Var, 1.0f), s00.o(dd4Var4).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var4).i, dd4Var4, 48, 0, 131064);
                    nha.c(dabVar.d, tg9.f(lu6Var, 1.0f), s00.o(dd4Var4).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 2, 0, (kb4) null, s00.q(dd4Var4).l, dd4Var4, 48, 24960, 110584);
                    if (bw9.a0(dabVar.e)) {
                        i = 0;
                        dd4Var4.f0(-766552324);
                        dd4Var4.q(false);
                    } else {
                        dd4Var4.f0(-766893324);
                        nha.c(dabVar.e, tg9.f(lu6Var, 1.0f), lc1.c(0.5f, s00.o(dd4Var4).q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var4).l, dd4Var4, 48, 0, 131064);
                        i = 0;
                        dd4Var4.q(false);
                    }
                    ky0.A(dd4Var4, true, lu6Var, 8.0f, dd4Var4);
                    p35 p35VarC6 = i25.c((m53) a53.H.getValue(), dd4Var4, i);
                    long j4 = lc1.f;
                    ou6 ou6VarH4 = ky0.h(dd4Var4, 2.0f, t96.w(tg9.n(lu6Var, 32.0f), tp8.a), lp4Var4);
                    boolean zF11 = dd4Var4.f(a07Var) | dd4Var4.h(dabVar) | dd4Var4.f(kb4Var);
                    Object objQ11 = dd4Var4.Q();
                    if (zF11 || objQ11 == obj7) {
                        objQ11 = new k90(6, kb4Var, a07Var, dabVar);
                        dd4Var4.p0(objQ11);
                    }
                    mx4.a(p35VarC6, (String) null, gjb.l0(fw.J(null, (ib4) objQ11, ou6VarH4, false, 15), 6.0f), j4, dd4Var4, 3120, 0);
                    un9.a(dd4Var4, tg9.r(lu6Var, 8.0f));
                    boolean z3 = dabVar.b;
                    boolean zF12 = dd4Var4.f(a07Var) | dd4Var4.h(dabVar) | dd4Var4.f(kb4Var);
                    Object objQ12 = dd4Var4.Q();
                    if (zF12 || objQ12 == obj7) {
                        objQ12 = new vs1(kb4Var, a07Var, dabVar, 2);
                        dd4Var4.p0(objQ12);
                    }
                    zk9.g(z3, false, null, (kb4) objQ12, dd4Var4, 0);
                    dd4Var4.q(true);
                } else {
                    dd4Var4.Y();
                }
                break;
        }
        return heb.a;
    }

    public /* synthetic */ qb3(boolean z, boolean z2, ub4 ub4Var, Object obj, kb4 kb4Var, a07 a07Var, int i) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.f = ub4Var;
        this.s = obj;
        this.d = kb4Var;
        this.e = a07Var;
    }
}
