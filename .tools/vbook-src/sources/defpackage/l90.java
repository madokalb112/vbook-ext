package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class l90 implements ac4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public l90(List list, a07 a07Var, a07 a07Var2, a07 a07Var3) {
        this.a = 6;
        this.b = list;
        this.c = a07Var;
        this.d = a07Var2;
        this.e = a07Var3;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        Object obj5;
        heb hebVar;
        boolean z2;
        Object obj6;
        boolean z3;
        Object obj7;
        long jG;
        int i;
        Object obj8;
        boolean z4;
        boolean z5;
        Object obj9;
        int i2 = this.a;
        lu6 lu6Var = lu6.a;
        fu6 fu6Var = vl1.a;
        heb hebVar2 = heb.a;
        Object obj10 = this.c;
        Object obj11 = this.e;
        Object obj12 = this.d;
        Object obj13 = this.b;
        int i3 = 2;
        switch (i2) {
            case 0:
                dr5 dr5Var = (dr5) obj;
                int iIntValue = ((Number) obj2).intValue();
                dd4 dd4Var = (dd4) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                hb1 hb1Var = (hb1) obj11;
                m90 m90Var = (m90) obj12;
                int i4 = (iIntValue2 & 6) == 0 ? iIntValue2 | (dd4Var.f(dr5Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i4 |= dd4Var.d(iIntValue) ? 32 : 16;
                }
                if (!dd4Var.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
                    dd4Var.Y();
                } else {
                    gi1 gi1Var = (gi1) ((List) obj13).get(iIntValue);
                    dd4Var.f0(-502555362);
                    boolean z6 = iIntValue == m90Var.b.h();
                    x83 x83Var = (x83) ((a07) obj10).getValue();
                    boolean zF = dd4Var.f(hb1Var) | dd4Var.f(gi1Var) | dd4Var.h(m90Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == fu6Var) {
                        z = false;
                        k90 k90Var = new k90(false ? 1 : 0, hb1Var, gi1Var, m90Var);
                        dd4Var.p0(k90Var);
                        obj5 = k90Var;
                    } else {
                        z = false;
                        obj5 = objQ;
                    }
                    h67.c(gi1Var, z6, x83Var, (ib4) obj5, dd4Var, 0);
                    dd4Var.q(z);
                }
                break;
            case 1:
                dr5 dr5Var2 = (dr5) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                dd4 dd4Var2 = (dd4) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                t61 t61Var = (t61) obj12;
                int i5 = (iIntValue4 & 6) == 0 ? iIntValue4 | (dd4Var2.f(dr5Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i5 |= dd4Var2.d(iIntValue3) ? 32 : 16;
                }
                if (!dd4Var2.V(i5 & 1, (i5 & Token.EXPR_VOID) != 146)) {
                    dd4Var2.Y();
                } else {
                    kv1 kv1Var = (kv1) ((List) obj13).get(iIntValue3);
                    dd4Var2.f0(-1208353851);
                    String str = t61Var.g;
                    boolean z7 = t61Var.p;
                    String str2 = t61Var.q;
                    boolean zEquals = t61Var.A.equals(kv1Var.a.a);
                    boolean z8 = t61Var.t;
                    boolean zH = dd4Var2.h(kv1Var);
                    Object objQ2 = dd4Var2.Q();
                    Object obj14 = objQ2;
                    if (zH || objQ2 == fu6Var) {
                        e7 e7Var = new e7(i3, kv1Var, (a07) obj10);
                        dd4Var2.p0(e7Var);
                        obj14 = e7Var;
                    }
                    fe.g(kv1Var, str, z7, str2, z8, zEquals, (ib4) obj14, (kb4) obj11, dd4Var2, 8);
                    dd4Var2.q(false);
                }
                break;
            case 2:
                dr5 dr5Var3 = (dr5) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                dd4 dd4Var3 = (dd4) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                a07 a07Var = (a07) obj10;
                int i6 = (iIntValue6 & 6) == 0 ? iIntValue6 | (dd4Var3.f(dr5Var3) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i6 |= dd4Var3.d(iIntValue5) ? 32 : 16;
                }
                if (!dd4Var3.V(i6 & 1, (i6 & Token.EXPR_VOID) != 146)) {
                    dd4Var3.Y();
                } else {
                    js1 js1Var = (js1) ((List) obj13).get(iIntValue5);
                    dd4Var3.f0(241903622);
                    lx1.p(dr5Var3, (pj8) obj12, js1Var.a, null, false, null, jf0.G(-1013362810, new ws1(js1Var, iIntValue5 == gc1.S((List) a07Var.getValue()), (kb4) obj11, a07Var), dd4Var3), dd4Var3, (i6 & 14) | 1572864, 28);
                    dd4Var3.q(false);
                }
                break;
            case 3:
                xi8 xi8Var = (xi8) obj;
                ((Boolean) obj2).getClass();
                dd4 dd4Var4 = (dd4) obj3;
                int iIntValue7 = ((Number) obj4).intValue();
                yb4 yb4Var = (yb4) obj13;
                az2 az2Var = (az2) obj12;
                xi8Var.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= dd4Var4.f(xi8Var) ? 4 : 2;
                }
                if (!dd4Var4.V(iIntValue7 & 1, (iIntValue7 & Token.DO) != 130)) {
                    dd4Var4.Y();
                } else {
                    ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                    boolean zF2 = dd4Var4.f(yb4Var) | dd4Var4.h(az2Var);
                    Object objQ3 = dd4Var4.Q();
                    Object obj15 = objQ3;
                    if (zF2 || objQ3 == fu6Var) {
                        e7 e7Var2 = new e7(7, yb4Var, az2Var);
                        dd4Var4.p0(e7Var2);
                        obj15 = e7Var2;
                    }
                    ou6 ou6VarM0 = gjb.m0(fw.J(null, (ib4) obj15, ou6VarF, false, 15), 12.0f, 8.0f);
                    kb4 kb4Var = (kb4) obj11;
                    a07 a07Var2 = (a07) obj10;
                    eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var4, 48);
                    int iHashCode = Long.hashCode(dd4Var4.T);
                    lr7 lr7VarL = dd4Var4.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var4, ou6VarM0);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var4.j0();
                    if (dd4Var4.S) {
                        dd4Var4.k(um1Var);
                    } else {
                        dd4Var4.s0();
                    }
                    jm jmVar = ll1.f;
                    un9.s(jmVar, dd4Var4, eq8VarA);
                    jm jmVar2 = ll1.e;
                    un9.s(jmVar2, dd4Var4, lr7VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    jm jmVar3 = ll1.g;
                    un9.s(jmVar3, dd4Var4, numValueOf);
                    kd kdVar = ll1.h;
                    un9.r(dd4Var4, kdVar);
                    jm jmVar4 = ll1.d;
                    un9.s(jmVar4, dd4Var4, ou6VarL0);
                    p35 p35VarC = i25.c((m53) a53.N.getValue(), dd4Var4, 0);
                    ou6 ou6VarN = tg9.n(lu6Var, 40.0f);
                    boolean zF3 = dd4Var4.f(kb4Var) | dd4Var4.f(a07Var2);
                    Object objQ4 = dd4Var4.Q();
                    if (zF3 || objQ4 == fu6Var) {
                        hebVar = hebVar2;
                        z2 = true;
                        us1 us1Var = new us1(true ? 1 : 0, kb4Var, a07Var2);
                        dd4Var4.p0(us1Var);
                        obj6 = us1Var;
                    } else {
                        hebVar = hebVar2;
                        z2 = true;
                        obj6 = objQ4;
                    }
                    mx4.a(p35VarC, (String) null, gjb.l0(ex1.L(xi8Var, ou6VarN, (ib4) obj6), 8.0f), 0L, dd4Var4, 48, 8);
                    bp5 bp5VarF = j39.f(lu6Var, 8.0f, dd4Var4, 1.0f, z2);
                    ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var4, 0);
                    int iHashCode2 = Long.hashCode(dd4Var4.T);
                    lr7 lr7VarL2 = dd4Var4.l();
                    ou6 ou6VarL02 = s32.L0(dd4Var4, bp5VarF);
                    dd4Var4.j0();
                    if (dd4Var4.S) {
                        dd4Var4.k(um1Var);
                    } else {
                        dd4Var4.s0();
                    }
                    un9.s(jmVar, dd4Var4, ie1VarA);
                    un9.s(jmVar2, dd4Var4, lr7VarL2);
                    ky0.v(iHashCode2, dd4Var4, jmVar3, dd4Var4, kdVar);
                    un9.s(jmVar4, dd4Var4, ou6VarL02);
                    String str3 = az2Var.b;
                    ur9 ur9Var = s96.a;
                    nha.c(str3, tg9.f(lu6Var, 1.0f), ((q96) dd4Var4.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var4.j(ur9Var)).b.i, dd4Var4, 48, 0, 131064);
                    un9.a(dd4Var4, tg9.h(lu6Var, 4.0f));
                    nha.c(az2Var.c, tg9.f(lu6Var, 1.0f), ((q96) dd4Var4.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 0, 0, (kb4) null, ((q96) dd4Var4.j(ur9Var)).b.j, dd4Var4, 48, 384, 126968);
                    ky0.A(dd4Var4, true, lu6Var, 8.0f, dd4Var4);
                    p35 p35VarC2 = i25.c((m53) a53.H.getValue(), dd4Var4, 0);
                    long j = lc1.f;
                    ou6 ou6VarL = fe.L(t96.w(tg9.n(lu6Var, 32.0f), tp8.a), dd1.g(((q96) dd4Var4.j(ur9Var)).a, 2.0f), jf0.G);
                    boolean zF4 = dd4Var4.f(a07Var2) | dd4Var4.h(az2Var) | dd4Var4.f(kb4Var);
                    Object objQ5 = dd4Var4.Q();
                    Object obj16 = objQ5;
                    if (zF4 || objQ5 == fu6Var) {
                        k90 k90Var2 = new k90(1, kb4Var, a07Var2, az2Var);
                        dd4Var4.p0(k90Var2);
                        obj16 = k90Var2;
                    }
                    mx4.a(p35VarC2, (String) null, gjb.l0(fw.J(null, (ib4) obj16, ou6VarL, false, 15), 6.0f), j, dd4Var4, 3120, 0);
                    un9.a(dd4Var4, tg9.r(lu6Var, 8.0f));
                    boolean z9 = az2Var.d;
                    boolean zF5 = dd4Var4.f(a07Var2) | dd4Var4.h(az2Var) | dd4Var4.f(kb4Var);
                    Object objQ6 = dd4Var4.Q();
                    if (zF5 || objQ6 == fu6Var) {
                        z3 = true;
                        vs1 vs1Var = new vs1(kb4Var, a07Var2, az2Var, true ? 1 : 0);
                        dd4Var4.p0(vs1Var);
                        obj7 = vs1Var;
                    } else {
                        z3 = true;
                        obj7 = objQ6;
                    }
                    zk9.g(z9, false, null, (kb4) obj7, dd4Var4, 0);
                    dd4Var4.q(z3);
                }
                break;
            case 4:
                dq5 dq5Var = (dq5) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                dd4 dd4Var5 = (dd4) obj3;
                int iIntValue9 = ((Number) obj4).intValue();
                int i7 = (iIntValue9 & 6) == 0 ? iIntValue9 | (dd4Var5.f(dq5Var) ? 4 : 2) : iIntValue9;
                if ((iIntValue9 & 48) == 0) {
                    i7 |= dd4Var5.d(iIntValue8) ? 32 : 16;
                }
                if (!dd4Var5.V(i7 & 1, (i7 & Token.EXPR_VOID) != 146)) {
                    dd4Var5.Y();
                } else {
                    ob9 ob9Var = (ob9) ((List) obj13).get(iIntValue8);
                    dd4Var5.f0(726234526);
                    zl4 zl4Var = (zl4) obj12;
                    sdc.c(ob9Var, zl4Var.d, zl4Var.e, zl4Var.f, dq5.a(dq5Var, tg9.f(lu6Var, 1.0f)), (kb4) obj11, (kb4) obj10, dd4Var5, 0);
                    dd4Var5.q(false);
                }
                break;
            case 5:
                dr5 dr5Var4 = (dr5) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                dd4 dd4Var6 = (dd4) obj3;
                int iIntValue11 = ((Number) obj4).intValue();
                kb4 kb4Var2 = (kb4) obj11;
                int i8 = (iIntValue11 & 6) == 0 ? iIntValue11 | (dd4Var6.f(dr5Var4) ? 4 : 2) : iIntValue11;
                if ((iIntValue11 & 48) == 0) {
                    i8 |= dd4Var6.d(iIntValue10) ? 32 : 16;
                }
                if (!dd4Var6.V(i8 & 1, (i8 & Token.EXPR_VOID) != 146)) {
                    dd4Var6.Y();
                } else {
                    xr xrVar = (xr) ((List) obj13).get(iIntValue10);
                    dd4Var6.f0(1904876196);
                    boolean z10 = xrVar == ((xr) obj12);
                    ou6 ou6VarW = t96.w(gjb.n0(lu6Var, 24.0f, 0.0f, 2), s00.p(dd4Var6).c);
                    if (z10) {
                        dd4Var6.f0(1905118026);
                        jG = s00.o(dd4Var6).c;
                        dd4Var6.q(false);
                    } else {
                        dd4Var6.f0(1905229533);
                        jG = dd1.g(s00.o(dd4Var6), 2.0f);
                        dd4Var6.q(false);
                    }
                    ou6 ou6VarL2 = fe.L(ou6VarW, jG, jf0.G);
                    boolean zF6 = dd4Var6.f(kb4Var2) | dd4Var6.d(xrVar.ordinal());
                    Object objQ7 = dd4Var6.Q();
                    if (zF6 || objQ7 == fu6Var) {
                        i = 15;
                        e7 e7Var3 = new e7(i, kb4Var2, xrVar);
                        dd4Var6.p0(e7Var3);
                        obj8 = e7Var3;
                    } else {
                        i = 15;
                        obj8 = objQ7;
                    }
                    ou6 ou6VarL03 = gjb.l0(fw.J(null, (ib4) obj8, ou6VarL2, false, i), 10.0f);
                    eq8 eq8VarA2 = dq8.a(pv.a, bv4.x, dd4Var6, 48);
                    int iHashCode3 = Long.hashCode(dd4Var6.T);
                    lr7 lr7VarL3 = dd4Var6.l();
                    ou6 ou6VarL04 = s32.L0(dd4Var6, ou6VarL03);
                    ml1.k.getClass();
                    um1 um1Var2 = ll1.b;
                    dd4Var6.j0();
                    if (dd4Var6.S) {
                        dd4Var6.k(um1Var2);
                    } else {
                        dd4Var6.s0();
                    }
                    un9.s(ll1.f, dd4Var6, eq8VarA2);
                    un9.s(ll1.e, dd4Var6, lr7VarL3);
                    un9.s(ll1.g, dd4Var6, Integer.valueOf(iHashCode3));
                    un9.r(dd4Var6, ll1.h);
                    un9.s(ll1.d, dd4Var6, ou6VarL04);
                    lc5.c(xrVar, (String) obj10, t96.w(tg9.o(lu6Var, 84.0f, 56.0f), s00.p(dd4Var6).b), dd4Var6, 0);
                    un9.a(dd4Var6, tg9.r(lu6Var, 12.0f));
                    nha.c(lc5.R(xrVar, dd4Var6), new bp5(1.0f, true), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var6).j, dd4Var6, 0, 0, 131068);
                    if (z10) {
                        dd4Var6.f0(953710859);
                        z4 = false;
                        mx4.a(i25.c((m53) a53.v.getValue(), dd4Var6, 0), (String) null, (ou6) null, s00.o(dd4Var6).d, dd4Var6, 48, 4);
                        dd4Var6.q(false);
                    } else {
                        z4 = false;
                        dd4Var6.f0(953992432);
                        dd4Var6.q(false);
                    }
                    dd4Var6.q(true);
                    dd4Var6.q(z4);
                }
                break;
            case 6:
                dr5 dr5Var5 = (dr5) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                dd4 dd4Var7 = (dd4) obj3;
                int iIntValue13 = ((Number) obj4).intValue();
                a07 a07Var3 = (a07) obj11;
                a07 a07Var4 = (a07) obj12;
                a07 a07Var5 = (a07) obj10;
                int i9 = (iIntValue13 & 6) == 0 ? iIntValue13 | (dd4Var7.f(dr5Var5) ? 4 : 2) : iIntValue13;
                if ((iIntValue13 & 48) == 0) {
                    i9 |= dd4Var7.d(iIntValue12) ? 32 : 16;
                }
                if (!dd4Var7.V(i9 & 1, (i9 & Token.EXPR_VOID) != 146)) {
                    dd4Var7.Y();
                } else {
                    String str4 = (String) ((List) obj13).get(iIntValue12);
                    dd4Var7.f0(368646903);
                    ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
                    boolean zF7 = dd4Var7.f(a07Var5) | dd4Var7.f(str4);
                    Object objQ8 = dd4Var7.Q();
                    if (zF7 || objQ8 == fu6Var) {
                        z5 = false;
                        qj6 qj6Var = new qj6(str4, a07Var5, 0);
                        dd4Var7.p0(qj6Var);
                        obj9 = qj6Var;
                    } else {
                        z5 = false;
                        obj9 = objQ8;
                    }
                    ou6 ou6VarM02 = gjb.m0(fw.J(null, (ib4) obj9, ou6VarF2, z5, 15), 24.0f, 8.0f);
                    boolean zF8 = dd4Var7.f(a07Var4) | dd4Var7.f(str4);
                    Object objQ9 = dd4Var7.Q();
                    Object obj17 = objQ9;
                    if (zF8 || objQ9 == fu6Var) {
                        qj6 qj6Var2 = new qj6(str4, a07Var4, 1);
                        dd4Var7.p0(qj6Var2);
                        obj17 = qj6Var2;
                    }
                    ib4 ib4Var = (ib4) obj17;
                    boolean zF9 = dd4Var7.f(a07Var3) | dd4Var7.f(str4);
                    Object objQ10 = dd4Var7.Q();
                    Object obj18 = objQ10;
                    if (zF9 || objQ10 == fu6Var) {
                        qj6 qj6Var3 = new qj6(str4, a07Var3, 2);
                        dd4Var7.p0(qj6Var3);
                        obj18 = qj6Var3;
                    }
                    wx1.y(0, ib4Var, (ib4) obj18, dd4Var7, ou6VarM02, str4);
                    dd4Var7.q(false);
                }
                break;
            case 7:
                dq5 dq5Var2 = (dq5) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                dd4 dd4Var8 = (dd4) obj3;
                int iIntValue15 = ((Number) obj4).intValue();
                int i10 = (iIntValue15 & 6) == 0 ? iIntValue15 | (dd4Var8.f(dq5Var2) ? 4 : 2) : iIntValue15;
                if ((iIntValue15 & 48) == 0) {
                    i10 |= dd4Var8.d(iIntValue14) ? 32 : 16;
                }
                if (!dd4Var8.V(i10 & 1, (i10 & Token.EXPR_VOID) != 146)) {
                    dd4Var8.Y();
                } else {
                    ob9 ob9Var2 = (ob9) ((List) obj13).get(iIntValue14);
                    dd4Var8.f0(1571415543);
                    mb9 mb9Var = (mb9) obj12;
                    sdc.c(ob9Var2, mb9Var.d, mb9Var.e, mb9Var.f, dq5.a(dq5Var2, gjb.p0(gjb.l0(tg9.f(lu6Var, 1.0f), 4.0f), 0.0f, 0.0f, 0.0f, 4.0f, 7)), (kb4) obj11, (kb4) obj10, dd4Var8, 0);
                    dd4Var8.q(false);
                }
                break;
            case 8:
                dq5 dq5Var3 = (dq5) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                dd4 dd4Var9 = (dd4) obj3;
                int iIntValue17 = ((Number) obj4).intValue();
                yb4 yb4Var2 = (yb4) obj10;
                int i11 = (iIntValue17 & 6) == 0 ? iIntValue17 | (dd4Var9.f(dq5Var3) ? 4 : 2) : iIntValue17;
                if ((iIntValue17 & 48) == 0) {
                    i11 |= dd4Var9.d(iIntValue16) ? 32 : 16;
                }
                if (!dd4Var9.V(i11 & 1, (i11 & Token.EXPR_VOID) != 146)) {
                    dd4Var9.Y();
                } else {
                    gg1 gg1Var = (gg1) ((List) obj13).get(iIntValue16);
                    dd4Var9.f0(1198110484);
                    String str5 = (String) obj12;
                    String str6 = gg1Var.b;
                    String str7 = gg1Var.c;
                    ou6 ou6VarN0 = gjb.n0(gjb.p0(tg9.f(lu6Var, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13), 16.0f, 0.0f, 2);
                    ur9 ur9Var2 = s96.a;
                    ou6 ou6VarL05 = gjb.l0(fe.L(t96.w(ou6VarN0, ((q96) dd4Var9.j(ur9Var2)).c.d), dd1.g(((q96) dd4Var9.j(ur9Var2)).a, 2.0f), jf0.G), 16.0f);
                    ib4 ib4Var2 = (ib4) obj11;
                    boolean zF10 = dd4Var9.f(yb4Var2) | dd4Var9.h(gg1Var);
                    Object objQ11 = dd4Var9.Q();
                    Object obj19 = objQ11;
                    if (zF10 || objQ11 == fu6Var) {
                        e7 e7Var4 = new e7(25, yb4Var2, gg1Var);
                        dd4Var9.p0(e7Var4);
                        obj19 = e7Var4;
                    }
                    ql9.f(str5, str6, str7, ou6VarL05, ib4Var2, (ib4) obj19, dd4Var9, 0);
                    dd4Var9.q(false);
                }
                break;
            case 9:
                dq5 dq5Var4 = (dq5) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                dd4 dd4Var10 = (dd4) obj3;
                int iIntValue19 = ((Number) obj4).intValue();
                yb4 yb4Var3 = (yb4) obj10;
                int i12 = (iIntValue19 & 6) == 0 ? iIntValue19 | (dd4Var10.f(dq5Var4) ? 4 : 2) : iIntValue19;
                if ((iIntValue19 & 48) == 0) {
                    i12 |= dd4Var10.d(iIntValue18) ? 32 : 16;
                }
                if (!dd4Var10.V(i12 & 1, (i12 & Token.EXPR_VOID) != 146)) {
                    dd4Var10.Y();
                } else {
                    k0a k0aVar = (k0a) ((List) obj13).get(iIntValue18);
                    dd4Var10.f0(502816960);
                    String str8 = (String) obj12;
                    String str9 = k0aVar.b;
                    String str10 = k0aVar.c;
                    ou6 ou6VarN02 = gjb.n0(gjb.p0(tg9.f(lu6Var, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13), 16.0f, 0.0f, 2);
                    ur9 ur9Var3 = s96.a;
                    ou6 ou6VarN03 = gjb.n0(gjb.p0(fe.L(t96.w(ou6VarN02, ((q96) dd4Var10.j(ur9Var3)).c.d), dd1.g(((q96) dd4Var10.j(ur9Var3)).a, 2.0f), jf0.G), 0.0f, 16.0f, 0.0f, 0.0f, 13), 16.0f, 0.0f, 2);
                    kb4 kb4Var3 = (kb4) obj11;
                    boolean zF11 = dd4Var10.f(yb4Var3) | dd4Var10.h(k0aVar);
                    Object objQ12 = dd4Var10.Q();
                    Object obj20 = objQ12;
                    if (zF11 || objQ12 == fu6Var) {
                        e7 e7Var5 = new e7(27, yb4Var3, k0aVar);
                        dd4Var10.p0(e7Var5);
                        obj20 = e7Var5;
                    }
                    hn9.c(str8, str9, str10, ou6VarN03, kb4Var3, (ib4) obj20, dd4Var10, 0);
                    dd4Var10.q(false);
                }
                break;
            default:
                xi8 xi8Var2 = (xi8) obj;
                ((Boolean) obj2).getClass();
                dd4 dd4Var11 = (dd4) obj3;
                int iIntValue20 = ((Number) obj4).intValue();
                xi8Var2.getClass();
                if ((iIntValue20 & 6) == 0) {
                    iIntValue20 |= dd4Var11.f(xi8Var2) ? 4 : 2;
                }
                int i13 = iIntValue20;
                if (!dd4Var11.V(i13 & 1, (i13 & Token.DO) != 130)) {
                    dd4Var11.Y();
                } else {
                    ou6 ou6VarN04 = gjb.n0(tg9.f(lu6Var, 1.0f), 12.0f, 0.0f, 2);
                    String str11 = (String) obj13;
                    kb4 kb4Var4 = (kb4) obj12;
                    kb4 kb4Var5 = (kb4) obj11;
                    a07 a07Var6 = (a07) obj10;
                    eq8 eq8VarA3 = dq8.a(pv.a, bv4.x, dd4Var11, 48);
                    int iHashCode4 = Long.hashCode(dd4Var11.T);
                    lr7 lr7VarL4 = dd4Var11.l();
                    ou6 ou6VarL06 = s32.L0(dd4Var11, ou6VarN04);
                    ml1.k.getClass();
                    um1 um1Var3 = ll1.b;
                    dd4Var11.j0();
                    if (dd4Var11.S) {
                        dd4Var11.k(um1Var3);
                    } else {
                        dd4Var11.s0();
                    }
                    un9.s(ll1.f, dd4Var11, eq8VarA3);
                    un9.s(ll1.e, dd4Var11, lr7VarL4);
                    un9.s(ll1.g, dd4Var11, Integer.valueOf(iHashCode4));
                    un9.r(dd4Var11, ll1.h);
                    nha.c(str11, ky0.g(dd4Var11, ou6VarL06, ll1.d, 1.0f, true), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var11, 0, 0, 262140);
                    p35 p35VarC3 = i25.c((m53) a53.H.getValue(), dd4Var11, 0);
                    long j2 = lc1.f;
                    ou6 ou6VarL3 = fe.L(t96.w(tg9.n(lu6Var, 40.0f), tp8.a), dd1.g(((q96) dd4Var11.j(s96.a)).a, 2.0f), jf0.G);
                    boolean zF12 = dd4Var11.f(kb4Var4) | dd4Var11.f(str11);
                    Object objQ13 = dd4Var11.Q();
                    Object obj21 = objQ13;
                    if (zF12 || objQ13 == fu6Var) {
                        o85 o85Var = new o85(6, kb4Var4, str11);
                        dd4Var11.p0(o85Var);
                        obj21 = o85Var;
                    }
                    mx4.a(p35VarC3, (String) null, gjb.l0(fw.J(null, (ib4) obj21, ou6VarL3, false, 15), 8.0f), j2, dd4Var11, 3120, 0);
                    p35 p35VarC4 = i25.c((m53) a53.N.getValue(), dd4Var11, 0);
                    ou6 ou6VarN2 = tg9.n(lu6Var, 40.0f);
                    boolean zF13 = dd4Var11.f(kb4Var5) | dd4Var11.f(a07Var6);
                    Object objQ14 = dd4Var11.Q();
                    Object obj22 = objQ14;
                    if (zF13 || objQ14 == fu6Var) {
                        us1 us1Var2 = new us1(5, kb4Var5, a07Var6);
                        dd4Var11.p0(us1Var2);
                        obj22 = us1Var2;
                    }
                    mx4.a(p35VarC4, (String) null, gjb.l0(ex1.L(xi8Var2, ou6VarN2, (ib4) obj22), 8.0f), 0L, dd4Var11, 48, 8);
                    dd4Var11.q(true);
                }
                break;
        }
        return hebVar2;
    }

    public /* synthetic */ l90(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = obj4;
    }

    public l90(List list, pj8 pj8Var, a07 a07Var, kb4 kb4Var) {
        this.a = 2;
        this.b = list;
        this.d = pj8Var;
        this.c = a07Var;
        this.e = kb4Var;
    }
}
