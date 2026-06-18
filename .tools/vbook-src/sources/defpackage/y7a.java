package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class y7a implements ac4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ List c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ kb4 e;

    public /* synthetic */ y7a(List list, List list2, kb4 kb4Var, kb4 kb4Var2, int i) {
        this.a = i;
        this.b = list;
        this.c = list2;
        this.d = kb4Var;
        this.e = kb4Var2;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        uw1 uw1VarD;
        boolean z;
        boolean z2;
        uw1 uw1VarD2;
        boolean z3;
        uw1 uw1VarD3;
        boolean z4;
        boolean z5;
        uw1 uw1VarD4;
        boolean z6;
        int i = this.a;
        heb hebVar = heb.a;
        iv ivVar = pv.a;
        lu6 lu6Var = lu6.a;
        List list = this.c;
        List list2 = this.b;
        kb4 kb4Var = this.d;
        Object obj5 = vl1.a;
        kb4 kb4Var2 = this.e;
        switch (i) {
            case 0:
                dq5 dq5Var = (dq5) obj;
                int iIntValue = ((Number) obj2).intValue();
                dd4 dd4Var = (dd4) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i2 = (iIntValue2 & 6) == 0 ? (dd4Var.f(dq5Var) ? 4 : 2) | iIntValue2 : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= dd4Var.d(iIntValue) ? 32 : 16;
                }
                if (!dd4Var.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                    dd4Var.Y();
                } else {
                    ih9 ih9Var = (ih9) list2.get(iIntValue);
                    dd4Var.f0(-1806655370);
                    boolean z7 = iIntValue == 0;
                    boolean z8 = iIntValue == gc1.S(list);
                    if (!z7 && !z8) {
                        dd4Var.f0(-1582293603);
                        uw1VarD = ((q96) dd4Var.j(s96.a)).c.a;
                        dd4Var.q(false);
                    } else if (z7 && z8) {
                        dd4Var.f0(-1582290984);
                        uw1VarD = ((q96) dd4Var.j(s96.a)).c.d;
                        dd4Var.q(false);
                    } else if (z7) {
                        dd4Var.f0(-1806303366);
                        ur9 ur9Var = s96.a;
                        uw1VarD = uw1.d(((q96) dd4Var.j(ur9Var)).c.d, (ax1) null, (ax1) null, ((q96) dd4Var.j(ur9Var)).c.a.c, ((q96) dd4Var.j(ur9Var)).c.a.d, 3);
                        dd4Var.q(false);
                    } else {
                        dd4Var.f0(-1582279620);
                        ur9 ur9Var2 = s96.a;
                        uw1VarD = uw1.d(((q96) dd4Var.j(ur9Var2)).c.d, ((q96) dd4Var.j(ur9Var2)).c.a.a, ((q96) dd4Var.j(ur9Var2)).c.a.b, (ax1) null, (ax1) null, 12);
                        dd4Var.q(false);
                    }
                    ou6 ou6VarW = t96.w(lu6Var, uw1VarD);
                    ur9 ur9Var3 = s96.a;
                    ou6 ou6VarL = fe.L(ou6VarW, dd1.g(((q96) dd4Var.j(ur9Var3)).a, 1.0f), jf0.G);
                    boolean zF = dd4Var.f(kb4Var) | dd4Var.h(ih9Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj5) {
                        z = false;
                        objQ = new x7a(kb4Var, ih9Var, 0);
                        dd4Var.p0(objQ);
                    } else {
                        z = false;
                    }
                    ou6 ou6VarA = dq5.a(dq5Var, gjb.n0(fw.J(null, (ib4) objQ, ou6VarL, z, 15), 0.0f, 4.0f, 1));
                    eq8 eq8VarA = dq8.a(ivVar, bv4.x, dd4Var, 48);
                    int iHashCode = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL = dd4Var.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarA);
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
                    ou6 ou6VarP0 = gjb.p0(ky0.g(dd4Var, ou6VarL0, jmVar4, 1.0f, true), 16.0f, 0.0f, 0.0f, 0.0f, 14);
                    ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
                    int iHashCode2 = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL2 = dd4Var.l();
                    ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarP0);
                    dd4Var.j0();
                    if (dd4Var.S) {
                        dd4Var.k(um1Var);
                    } else {
                        dd4Var.s0();
                    }
                    un9.s(jmVar, dd4Var, ie1VarA);
                    un9.s(jmVar2, dd4Var, lr7VarL2);
                    ky0.v(iHashCode2, dd4Var, jmVar3, dd4Var, kdVar);
                    un9.s(jmVar4, dd4Var, ou6VarL02);
                    String str = ih9Var.b;
                    String str2 = ih9Var.c;
                    nha.c(str, tg9.f(lu6Var, 1.0f), ((q96) dd4Var.j(ur9Var3)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var3)).b.k, dd4Var, 48, 0, 131064);
                    dd4Var.f0(-1942997487);
                    String strK = str2.length() == 0 ? wn9.K((pv9) eu9.n.getValue(), dd4Var) : str2;
                    dd4Var.q(false);
                    nha.c(strK, tg9.f(lu6Var, 1.0f), lc1.c(str2.length() == 0 ? 0.2f : 1.0f, ((q96) dd4Var.j(ur9Var3)).a.q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var3)).b.k, dd4Var, 48, 0, 131064);
                    dd4Var.q(true);
                    p35 p35VarC = i25.c((m53) a53.H.getValue(), dd4Var, 0);
                    long j = lc1.f;
                    ou6 ou6VarW2 = t96.w(tg9.n(lu6Var, 40.0f), tp8.a);
                    boolean zF2 = dd4Var.f(kb4Var2) | dd4Var.h(ih9Var);
                    Object objQ2 = dd4Var.Q();
                    if (zF2 || objQ2 == obj5) {
                        z2 = true;
                        objQ2 = new x7a(kb4Var2, ih9Var, 1);
                        dd4Var.p0(objQ2);
                    } else {
                        z2 = true;
                    }
                    mx4.a(p35VarC, (String) null, gjb.l0(fw.J(null, (ib4) objQ2, ou6VarW2, false, 15), 8.0f), j, dd4Var, 3120, 0);
                    dd4Var.q(z2);
                    dd4Var.q(false);
                }
                break;
            case 1:
                dq5 dq5Var2 = (dq5) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                dd4 dd4Var2 = (dd4) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i3 = (iIntValue4 & 6) == 0 ? (dd4Var2.f(dq5Var2) ? 4 : 2) | iIntValue4 : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i3 |= dd4Var2.d(iIntValue3) ? 32 : 16;
                }
                if (!dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
                    dd4Var2.Y();
                } else {
                    da8 da8Var = (da8) list2.get(iIntValue3);
                    dd4Var2.f0(-1552808986);
                    boolean z9 = iIntValue3 == 0;
                    boolean z10 = iIntValue3 == gc1.S(list);
                    ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                    if (!z9 && !z10) {
                        dd4Var2.f0(1612484969);
                        uw1VarD2 = ((q96) dd4Var2.j(s96.a)).c.a;
                        dd4Var2.q(false);
                    } else if (z9 && z10) {
                        dd4Var2.f0(1612487716);
                        uw1VarD2 = ((q96) dd4Var2.j(s96.a)).c.d;
                        dd4Var2.q(false);
                    } else if (z9) {
                        dd4Var2.f0(-1552407134);
                        ur9 ur9Var4 = s96.a;
                        uw1VarD2 = uw1.d(((q96) dd4Var2.j(ur9Var4)).c.d, (ax1) null, (ax1) null, ((q96) dd4Var2.j(ur9Var4)).c.a.c, ((q96) dd4Var2.j(ur9Var4)).c.a.d, 3);
                        dd4Var2.q(false);
                    } else {
                        dd4Var2.f0(1612499732);
                        ur9 ur9Var5 = s96.a;
                        uw1VarD2 = uw1.d(((q96) dd4Var2.j(ur9Var5)).c.d, ((q96) dd4Var2.j(ur9Var5)).c.a.a, ((q96) dd4Var2.j(ur9Var5)).c.a.b, (ax1) null, (ax1) null, 12);
                        dd4Var2.q(false);
                    }
                    ou6 ou6VarW3 = t96.w(ou6VarF, uw1VarD2);
                    long jG = dd1.g(s00.o(dd4Var2), 1.0f);
                    lp4 lp4Var = jf0.G;
                    ou6 ou6VarL2 = fe.L(ou6VarW3, jG, lp4Var);
                    int i4 = da8Var.f;
                    String str3 = da8Var.d;
                    boolean z11 = i4 == 0;
                    boolean zF3 = dd4Var2.f(kb4Var) | dd4Var2.h(da8Var);
                    Object objQ3 = dd4Var2.Q();
                    if (zF3 || objQ3 == obj5) {
                        objQ3 = new rda(kb4Var, da8Var, 0);
                        dd4Var2.p0(objQ3);
                    }
                    ou6 ou6VarA2 = dq5.a(dq5Var2, gjb.m0(fw.J(null, (ib4) objQ3, ou6VarL2, z11, 14), 16.0f, 6.0f));
                    eq8 eq8VarA2 = dq8.a(ivVar, bv4.x, dd4Var2, 48);
                    int iHashCode3 = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL3 = dd4Var2.l();
                    ou6 ou6VarL03 = s32.L0(dd4Var2, ou6VarA2);
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
                    un9.s(jmVar6, dd4Var2, lr7VarL3);
                    Integer numValueOf2 = Integer.valueOf(iHashCode3);
                    jm jmVar7 = ll1.g;
                    un9.s(jmVar7, dd4Var2, numValueOf2);
                    kd kdVar2 = ll1.h;
                    un9.r(dd4Var2, kdVar2);
                    jm jmVar8 = ll1.d;
                    bp5 bp5VarG = ky0.g(dd4Var2, ou6VarL03, jmVar8, 1.0f, true);
                    ie1 ie1VarA2 = ge1.a(pv.c, bv4.z, dd4Var2, 0);
                    int iHashCode4 = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL4 = dd4Var2.l();
                    ou6 ou6VarL04 = s32.L0(dd4Var2, bp5VarG);
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(um1Var2);
                    } else {
                        dd4Var2.s0();
                    }
                    un9.s(jmVar5, dd4Var2, ie1VarA2);
                    un9.s(jmVar6, dd4Var2, lr7VarL4);
                    ky0.v(iHashCode4, dd4Var2, jmVar7, dd4Var2, kdVar2);
                    un9.s(jmVar8, dd4Var2, ou6VarL04);
                    String str4 = da8Var.c;
                    jda jdaVar = jda.b;
                    jda jdaVar2 = jda.d;
                    nha.c(str4, tg9.f(lu6Var, 1.0f), s00.o(dd4Var2).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, i4 == 1 ? jdaVar2 : jdaVar, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).j, dd4Var2, 48, 0, 130552);
                    dd4Var2.f0(1485405361);
                    String strK2 = str3.length() == 0 ? wn9.K((pv9) eu9.n.getValue(), dd4Var2) : str3;
                    dd4Var2.q(false);
                    nha.c(strK2, tg9.f(lu6Var, 1.0f), lc1.c(str3.length() == 0 ? 0.5f : 1.0f, s00.o(dd4Var2).q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, i4 == 1 ? jdaVar2 : jdaVar, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).j, dd4Var2, 48, 0, 130552);
                    dd4Var2.q(true);
                    p35 p35VarC2 = i25.c((m53) a53.H.getValue(), dd4Var2, 0);
                    long j2 = lc1.f;
                    ou6 ou6VarH = ky0.h(dd4Var2, 2.0f, t96.w(tg9.n(lu6Var, 32.0f), tp8.a), lp4Var);
                    boolean zF4 = dd4Var2.f(kb4Var2) | dd4Var2.h(da8Var);
                    Object objQ4 = dd4Var2.Q();
                    if (zF4 || objQ4 == obj5) {
                        z3 = true;
                        objQ4 = new rda(kb4Var2, da8Var, 1);
                        dd4Var2.p0(objQ4);
                    } else {
                        z3 = true;
                    }
                    mx4.a(p35VarC2, (String) null, gjb.l0(fw.J(null, (ib4) objQ4, ou6VarH, false, 15), 6.0f), j2, dd4Var2, 3120, 0);
                    dd4Var2.q(z3);
                    dd4Var2.q(false);
                }
                break;
            case 2:
                dq5 dq5Var3 = (dq5) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                dd4 dd4Var3 = (dd4) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                int i5 = (iIntValue6 & 6) == 0 ? iIntValue6 | (dd4Var3.f(dq5Var3) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i5 |= dd4Var3.d(iIntValue5) ? 32 : 16;
                }
                if (!dd4Var3.V(i5 & 1, (i5 & Token.EXPR_VOID) != 146)) {
                    dd4Var3.Y();
                } else {
                    p17 p17Var = (p17) list2.get(iIntValue5);
                    dd4Var3.f0(1971800726);
                    boolean z12 = iIntValue5 == 0;
                    boolean z13 = iIntValue5 == list.size() - 1;
                    ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
                    if (!z12 && !z13) {
                        dd4Var3.f0(-2014594652);
                        uw1VarD3 = ((q96) dd4Var3.j(s96.a)).c.a;
                        dd4Var3.q(false);
                    } else if (z12 && z13) {
                        dd4Var3.f0(-2014591777);
                        uw1VarD3 = ((q96) dd4Var3.j(s96.a)).c.d;
                        dd4Var3.q(false);
                    } else if (z12) {
                        dd4Var3.f0(1972249915);
                        ur9 ur9Var6 = s96.a;
                        uw1VarD3 = uw1.d(((q96) dd4Var3.j(ur9Var6)).c.d, (ax1) null, (ax1) null, ((q96) dd4Var3.j(ur9Var6)).c.a.c, ((q96) dd4Var3.j(ur9Var6)).c.a.d, 3);
                        dd4Var3.q(false);
                    } else {
                        dd4Var3.f0(-2014579109);
                        ur9 ur9Var7 = s96.a;
                        uw1VarD3 = uw1.d(((q96) dd4Var3.j(ur9Var7)).c.d, ((q96) dd4Var3.j(ur9Var7)).c.a.a, ((q96) dd4Var3.j(ur9Var7)).c.a.b, (ax1) null, (ax1) null, 12);
                        dd4Var3.q(false);
                    }
                    ou6 ou6VarW4 = t96.w(ou6VarF2, uw1VarD3);
                    long jG2 = dd1.g(s00.o(dd4Var3), 1.0f);
                    lp4 lp4Var2 = jf0.G;
                    ou6 ou6VarL3 = fe.L(ou6VarW4, jG2, lp4Var2);
                    boolean zF5 = dd4Var3.f(kb4Var) | dd4Var3.h(p17Var);
                    Object objQ5 = dd4Var3.Q();
                    if (zF5 || objQ5 == obj5) {
                        z4 = false;
                        objQ5 = new bea(kb4Var, p17Var, 0);
                        dd4Var3.p0(objQ5);
                    } else {
                        z4 = false;
                    }
                    ou6 ou6VarA3 = dq5.a(dq5Var3, gjb.m0(fw.J(null, (ib4) objQ5, ou6VarL3, z4, 15), 16.0f, 8.0f));
                    eq8 eq8VarA3 = dq8.a(ivVar, bv4.x, dd4Var3, 48);
                    int iHashCode5 = Long.hashCode(dd4Var3.T);
                    lr7 lr7VarL5 = dd4Var3.l();
                    ou6 ou6VarL05 = s32.L0(dd4Var3, ou6VarA3);
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
                    un9.s(jmVar10, dd4Var3, lr7VarL5);
                    Integer numValueOf3 = Integer.valueOf(iHashCode5);
                    jm jmVar11 = ll1.g;
                    un9.s(jmVar11, dd4Var3, numValueOf3);
                    kd kdVar3 = ll1.h;
                    un9.r(dd4Var3, kdVar3);
                    jm jmVar12 = ll1.d;
                    bp5 bp5VarG2 = ky0.g(dd4Var3, ou6VarL05, jmVar12, 1.0f, true);
                    ie1 ie1VarA3 = ge1.a(pv.c, bv4.z, dd4Var3, 0);
                    int iHashCode6 = Long.hashCode(dd4Var3.T);
                    lr7 lr7VarL6 = dd4Var3.l();
                    ou6 ou6VarL06 = s32.L0(dd4Var3, bp5VarG2);
                    dd4Var3.j0();
                    if (dd4Var3.S) {
                        dd4Var3.k(um1Var3);
                    } else {
                        dd4Var3.s0();
                    }
                    un9.s(jmVar9, dd4Var3, ie1VarA3);
                    un9.s(jmVar10, dd4Var3, lr7VarL6);
                    ky0.v(iHashCode6, dd4Var3, jmVar11, dd4Var3, kdVar3);
                    un9.s(jmVar12, dd4Var3, ou6VarL06);
                    String str5 = p17Var.c;
                    String str6 = p17Var.d;
                    nha.c(str5, tg9.f(lu6Var, 1.0f), s00.o(dd4Var3).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var3).j, dd4Var3, 48, 0, 131064);
                    dd4Var3.f0(-1547947464);
                    String strK3 = str6.length() == 0 ? wn9.K((pv9) eu9.n.getValue(), dd4Var3) : str6;
                    dd4Var3.q(false);
                    nha.c(strK3, tg9.f(lu6Var, 1.0f), lc1.c(str6.length() == 0 ? 0.5f : 1.0f, s00.o(dd4Var3).q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var3).j, dd4Var3, 48, 0, 131064);
                    dd4Var3.q(true);
                    p35 p35VarC3 = i25.c((m53) a53.H.getValue(), dd4Var3, 0);
                    long j3 = lc1.f;
                    ou6 ou6VarH2 = ky0.h(dd4Var3, 2.0f, t96.w(tg9.n(lu6Var, 32.0f), tp8.a), lp4Var2);
                    boolean zF6 = dd4Var3.f(kb4Var2) | dd4Var3.h(p17Var);
                    Object objQ6 = dd4Var3.Q();
                    if (zF6 || objQ6 == obj5) {
                        z5 = true;
                        objQ6 = new bea(kb4Var2, p17Var, 1);
                        dd4Var3.p0(objQ6);
                    } else {
                        z5 = true;
                    }
                    mx4.a(p35VarC3, (String) null, gjb.l0(fw.J(null, (ib4) objQ6, ou6VarH2, false, 15), 6.0f), j3, dd4Var3, 3120, 0);
                    dd4Var3.q(z5);
                    dd4Var3.q(false);
                }
                break;
            default:
                dq5 dq5Var4 = (dq5) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                dd4 dd4Var4 = (dd4) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                int i6 = (iIntValue8 & 6) == 0 ? iIntValue8 | (dd4Var4.f(dq5Var4) ? 4 : 2) : iIntValue8;
                if ((iIntValue8 & 48) == 0) {
                    i6 |= dd4Var4.d(iIntValue7) ? 32 : 16;
                }
                int i7 = i6;
                if (!dd4Var4.V(i7 & 1, (i7 & Token.EXPR_VOID) != 146)) {
                    dd4Var4.Y();
                } else {
                    i6b i6bVar = (i6b) list2.get(iIntValue7);
                    dd4Var4.f0(-1297545780);
                    boolean z14 = iIntValue7 == 0;
                    boolean z15 = iIntValue7 == gc1.S(list);
                    ou6 ou6VarF3 = tg9.f(lu6Var, 1.0f);
                    if (!z14 && !z15) {
                        dd4Var4.f0(-1565868264);
                        uw1VarD4 = ((q96) dd4Var4.j(s96.a)).c.a;
                        dd4Var4.q(false);
                    } else if (z14 && z15) {
                        dd4Var4.f0(-1565865517);
                        uw1VarD4 = ((q96) dd4Var4.j(s96.a)).c.d;
                        dd4Var4.q(false);
                    } else if (z14) {
                        dd4Var4.f0(-1297109549);
                        ur9 ur9Var8 = s96.a;
                        uw1VarD4 = uw1.d(((q96) dd4Var4.j(ur9Var8)).c.d, (ax1) null, (ax1) null, ((q96) dd4Var4.j(ur9Var8)).c.a.c, ((q96) dd4Var4.j(ur9Var8)).c.a.d, 3);
                        dd4Var4.q(false);
                    } else {
                        dd4Var4.f0(-1565853501);
                        ur9 ur9Var9 = s96.a;
                        uw1VarD4 = uw1.d(((q96) dd4Var4.j(ur9Var9)).c.d, ((q96) dd4Var4.j(ur9Var9)).c.a.a, ((q96) dd4Var4.j(ur9Var9)).c.a.b, (ax1) null, (ax1) null, 12);
                        dd4Var4.q(false);
                    }
                    ou6 ou6VarW5 = t96.w(ou6VarF3, uw1VarD4);
                    ur9 ur9Var10 = s96.a;
                    long jG3 = dd1.g(((q96) dd4Var4.j(ur9Var10)).a, 1.0f);
                    lp4 lp4Var3 = jf0.G;
                    ou6 ou6VarL4 = fe.L(ou6VarW5, jG3, lp4Var3);
                    boolean zF7 = dd4Var4.f(kb4Var) | dd4Var4.h(i6bVar);
                    Object objQ7 = dd4Var4.Q();
                    if (zF7 || objQ7 == obj5) {
                        objQ7 = new jpa(kb4Var, i6bVar, 0);
                        dd4Var4.p0(objQ7);
                    }
                    ou6 ou6VarA4 = dq5.a(dq5Var4, gjb.m0(fw.J(null, (ib4) objQ7, ou6VarL4, false, 15), 16.0f, 4.0f));
                    eq8 eq8VarA4 = dq8.a(ivVar, bv4.x, dd4Var4, 48);
                    int iHashCode7 = Long.hashCode(dd4Var4.T);
                    lr7 lr7VarL7 = dd4Var4.l();
                    ou6 ou6VarL07 = s32.L0(dd4Var4, ou6VarA4);
                    ml1.k.getClass();
                    um1 um1Var4 = ll1.b;
                    dd4Var4.j0();
                    if (dd4Var4.S) {
                        dd4Var4.k(um1Var4);
                    } else {
                        dd4Var4.s0();
                    }
                    un9.s(ll1.f, dd4Var4, eq8VarA4);
                    un9.s(ll1.e, dd4Var4, lr7VarL7);
                    un9.s(ll1.g, dd4Var4, Integer.valueOf(iHashCode7));
                    un9.r(dd4Var4, ll1.h);
                    un9.s(ll1.d, dd4Var4, ou6VarL07);
                    nha.c(i6bVar.c, gjb.n0(new bp5(1.0f, true), 0.0f, 8.0f, 1), ((q96) dd4Var4.j(ur9Var10)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var4.j(ur9Var10)).b.j, dd4Var4, 0, 0, 131064);
                    p35 p35VarC4 = i25.c((m53) a53.H.getValue(), dd4Var4, 0);
                    long j4 = lc1.f;
                    ou6 ou6VarL5 = fe.L(t96.w(tg9.n(lu6Var, 32.0f), tp8.a), dd1.g(((q96) dd4Var4.j(ur9Var10)).a, 2.0f), lp4Var3);
                    boolean zF8 = dd4Var4.f(kb4Var2) | dd4Var4.h(i6bVar);
                    Object objQ8 = dd4Var4.Q();
                    if (zF8 || objQ8 == obj5) {
                        z6 = true;
                        objQ8 = new jpa(kb4Var2, i6bVar, 1);
                        dd4Var4.p0(objQ8);
                    } else {
                        z6 = true;
                    }
                    mx4.a(p35VarC4, (String) null, gjb.l0(fw.J(null, (ib4) objQ8, ou6VarL5, false, 15), 6.0f), j4, dd4Var4, 3120, 0);
                    dd4Var4.q(z6);
                    dd4Var4.q(false);
                }
                break;
        }
        return hebVar;
    }
}
