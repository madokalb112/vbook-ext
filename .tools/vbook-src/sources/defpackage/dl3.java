package defpackage;

import java.util.ArrayList;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dl3 implements ac4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ kb4 c;

    public /* synthetic */ dl3(ArrayList arrayList, kb4 kb4Var, int i) {
        this.a = i;
        this.b = arrayList;
        this.c = kb4Var;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        boolean z2;
        long jC;
        ib4 ib4Var;
        boolean z3;
        int i = this.a;
        lu6 lu6Var = lu6.a;
        heb hebVar = heb.a;
        Object obj5 = vl1.a;
        ArrayList arrayList = this.b;
        kb4 kb4Var = this.c;
        switch (i) {
            case 0:
                dr5 dr5Var = (dr5) obj;
                int iIntValue = ((Number) obj2).intValue();
                dd4 dd4Var = (dd4) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | (dd4Var.f(dr5Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= dd4Var.d(iIntValue) ? 32 : 16;
                }
                if (!dd4Var.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                    dd4Var.Y();
                } else {
                    el3 el3Var = (el3) arrayList.get(iIntValue);
                    dd4Var.f0(-696958859);
                    ou6 ou6VarW = t96.w(sdc.e0(1.7777778f, new fn7(dr5Var.a), false), tp8.a(12.0f));
                    boolean zH = dd4Var.h(el3Var) | dd4Var.f(kb4Var);
                    Object objQ = dd4Var.Q();
                    if (zH || objQ == obj5) {
                        z = false;
                        objQ = new bl3(el3Var, kb4Var, 0);
                        dd4Var.p0(objQ);
                    } else {
                        z = false;
                    }
                    ou6 ou6VarS = yn2.s(ou6VarW, z, 0.0f, (ib4) objQ, 3);
                    ha6 ha6VarD = pn0.d(bv4.b, z);
                    int iHashCode = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL = dd4Var.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarS);
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
                    String str = el3Var.b;
                    String str2 = el3Var.a;
                    w05.a(str, ra1.d, false, null, null, tg9.c, null, dd4Var, 1572912, 444);
                    if (str2.length() > 0) {
                        dd4Var.f0(-2147052634);
                        nha.c(str2, gjb.m0(fe.L(tg9.f(zn0.a.a(lu6Var, bv4.t), 1.0f), lc1.c(0.4f, lc1.b), jf0.G), 12.0f, 8.0f), lc1.e, (g60) null, 0L, (t74) null, a84.v, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 2, 0, (kb4) null, ((q96) dd4Var.j(s96.a)).b.h, dd4Var, 1573248, 24960, 110520);
                        z2 = false;
                        dd4Var.q(false);
                    } else {
                        z2 = false;
                        dd4Var.f0(-2146428387);
                        dd4Var.q(false);
                    }
                    dd4Var.q(true);
                    dd4Var.q(z2);
                }
                break;
            case 1:
                dr5 dr5Var2 = (dr5) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                dd4 dd4Var2 = (dd4) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i3 = (iIntValue4 & 6) == 0 ? iIntValue4 | (dd4Var2.f(dr5Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i3 |= dd4Var2.d(iIntValue3) ? 32 : 16;
                }
                if (!dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
                    dd4Var2.Y();
                } else {
                    el3 el3Var2 = (el3) arrayList.get(iIntValue3);
                    dd4Var2.f0(1606874682);
                    ou6 ou6VarR = tg9.r(lu6Var, 260.0f);
                    boolean zH2 = dd4Var2.h(el3Var2) | dd4Var2.f(kb4Var);
                    Object objQ2 = dd4Var2.Q();
                    if (zH2 || objQ2 == obj5) {
                        objQ2 = new bl3(el3Var2, kb4Var, 3);
                        dd4Var2.p0(objQ2);
                    }
                    ou6 ou6VarS2 = yn2.s(ou6VarR, false, 0.0f, (ib4) objQ2, 3);
                    eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
                    int iHashCode2 = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL2 = dd4Var2.l();
                    ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarS2);
                    ml1.k.getClass();
                    ib4 ib4Var2 = ll1.b;
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(ib4Var2);
                    } else {
                        dd4Var2.s0();
                    }
                    jm jmVar = ll1.f;
                    un9.s(jmVar, dd4Var2, eq8VarA);
                    jm jmVar2 = ll1.e;
                    un9.s(jmVar2, dd4Var2, lr7VarL2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    jm jmVar3 = ll1.g;
                    un9.s(jmVar3, dd4Var2, numValueOf);
                    kd kdVar = ll1.h;
                    un9.r(dd4Var2, kdVar);
                    jm jmVar4 = ll1.d;
                    un9.s(jmVar4, dd4Var2, ou6VarL02);
                    String strValueOf = String.valueOf(iIntValue3 + 1);
                    uka ukaVar = s00.q(dd4Var2).e;
                    a84 a84Var = a84.w;
                    long jX = wn9.x(28);
                    if (iIntValue3 < 3) {
                        dd4Var2.f0(-1707710254);
                        jC = s00.o(dd4Var2).a;
                        dd4Var2.q(false);
                    } else {
                        dd4Var2.f0(-1707615363);
                        jC = lc1.c(0.4f, s00.o(dd4Var2).q);
                        dd4Var2.q(false);
                    }
                    nha.c(strValueOf, tg9.r(lu6Var, 40.0f), jC, (g60) null, jX, (t74) null, a84Var, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var2, 1597488, 0, 130984);
                    ou6 ou6VarW2 = t96.w(sdc.e0(0.6666667f, tg9.r(lu6Var, 64.0f), false), s00.p(dd4Var2).b);
                    ha6 ha6VarD2 = pn0.d(bv4.b, false);
                    int iHashCode3 = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL3 = dd4Var2.l();
                    ou6 ou6VarL03 = s32.L0(dd4Var2, ou6VarW2);
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        ib4Var = ib4Var2;
                        dd4Var2.k(ib4Var);
                    } else {
                        ib4Var = ib4Var2;
                        dd4Var2.s0();
                    }
                    un9.s(jmVar, dd4Var2, ha6VarD2);
                    un9.s(jmVar2, dd4Var2, lr7VarL3);
                    ky0.v(iHashCode3, dd4Var2, jmVar3, dd4Var2, kdVar);
                    un9.s(jmVar4, dd4Var2, ou6VarL03);
                    String str3 = el3Var2.a;
                    String str4 = el3Var2.c;
                    w05.d(str3, el3Var2.b, el3Var2.e, ra1.d, tg9.c, dd4Var2, 27648);
                    dd4Var2.q(true);
                    un9.a(dd4Var2, tg9.r(lu6Var, 8.0f));
                    bp5 bp5Var = new bp5(1.0f, true);
                    ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
                    int iHashCode4 = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL4 = dd4Var2.l();
                    ou6 ou6VarL04 = s32.L0(dd4Var2, bp5Var);
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(ib4Var);
                    } else {
                        dd4Var2.s0();
                    }
                    un9.s(jmVar, dd4Var2, ie1VarA);
                    un9.s(jmVar2, dd4Var2, lr7VarL4);
                    ky0.v(iHashCode4, dd4Var2, jmVar3, dd4Var2, kdVar);
                    un9.s(jmVar4, dd4Var2, ou6VarL04);
                    nha.c(el3Var2.a, (ou6) null, 0L, (g60) null, 0L, (t74) null, a84.u, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 2, 0, (kb4) null, s00.q(dd4Var2).k, dd4Var2, 1572864, 24960, 110526);
                    if (str4.length() > 0) {
                        dd4Var2.f0(-1510103639);
                        nha.c(str4, (ou6) null, lc1.c(0.6f, s00.o(dd4Var2).q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 2, 0, (kb4) null, s00.q(dd4Var2).l, dd4Var2, 0, 24960, 110586);
                        z3 = false;
                        dd4Var2.q(false);
                    } else {
                        z3 = false;
                        dd4Var2.f0(-1509716511);
                        dd4Var2.q(false);
                    }
                    tw2.x(dd4Var2, true, true, z3);
                }
                break;
            case 2:
                dr5 dr5Var3 = (dr5) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                dd4 dd4Var3 = (dd4) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                int i4 = (iIntValue6 & 6) == 0 ? iIntValue6 | (dd4Var3.f(dr5Var3) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i4 |= dd4Var3.d(iIntValue5) ? 32 : 16;
                }
                if (!dd4Var3.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
                    dd4Var3.Y();
                } else {
                    el3 el3Var3 = (el3) arrayList.get(iIntValue5);
                    dd4Var3.f0(-433239857);
                    String str5 = el3Var3.a;
                    ur9 ur9Var = s96.a;
                    uka ukaVar2 = ((q96) dd4Var3.j(ur9Var)).b.m;
                    long j = ((q96) dd4Var3.j(ur9Var)).a.s;
                    ou6 ou6VarL = fe.L(t96.w(lu6Var, tp8.a), ((q96) dd4Var3.j(ur9Var)).a.r, jf0.G);
                    boolean zH3 = dd4Var3.h(el3Var3) | dd4Var3.f(kb4Var);
                    Object objQ3 = dd4Var3.Q();
                    if (zH3 || objQ3 == obj5) {
                        objQ3 = new bl3(el3Var3, kb4Var, 1);
                        dd4Var3.p0(objQ3);
                    }
                    nha.c(str5, gjb.m0(yn2.s(ou6VarL, false, 0.0f, (ib4) objQ3, 3), 16.0f, 10.0f), j, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ukaVar2, dd4Var3, 0, 0, 131064);
                    dd4Var3.q(false);
                }
                break;
            case 3:
                dr5 dr5Var4 = (dr5) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                dd4 dd4Var4 = (dd4) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                int i5 = (iIntValue8 & 6) == 0 ? iIntValue8 | (dd4Var4.f(dr5Var4) ? 4 : 2) : iIntValue8;
                if ((iIntValue8 & 48) == 0) {
                    i5 |= dd4Var4.d(iIntValue7) ? 32 : 16;
                }
                if (!dd4Var4.V(i5 & 1, (i5 & Token.EXPR_VOID) != 146)) {
                    dd4Var4.Y();
                } else {
                    el3 el3Var4 = (el3) arrayList.get(iIntValue7);
                    dd4Var4.f0(-102160717);
                    x13 x13Var = new x13(120.0f);
                    boolean zH4 = dd4Var4.h(el3Var4) | dd4Var4.f(kb4Var);
                    Object objQ4 = dd4Var4.Q();
                    if (zH4 || objQ4 == obj5) {
                        objQ4 = new bl3(el3Var4, kb4Var, 2);
                        dd4Var4.p0(objQ4);
                    }
                    kl8.m(el3Var4, null, x13Var, (ib4) objQ4, dd4Var4, 384, 2);
                    dd4Var4.q(false);
                }
                break;
            case 4:
                dq5 dq5Var = (dq5) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                dd4 dd4Var5 = (dd4) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                int i6 = (iIntValue10 & 6) == 0 ? iIntValue10 | (dd4Var5.f(dq5Var) ? 4 : 2) : iIntValue10;
                if ((iIntValue10 & 48) == 0) {
                    i6 |= dd4Var5.d(iIntValue9) ? 32 : 16;
                }
                if (!dd4Var5.V(i6 & 1, (i6 & Token.EXPR_VOID) != 146)) {
                    dd4Var5.Y();
                } else {
                    el3 el3Var5 = (el3) arrayList.get(iIntValue9);
                    dd4Var5.f0(1828010804);
                    ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                    boolean zH5 = dd4Var5.h(el3Var5) | dd4Var5.f(kb4Var);
                    Object objQ5 = dd4Var5.Q();
                    if (zH5 || objQ5 == obj5) {
                        objQ5 = new bl3(el3Var5, kb4Var, 4);
                        dd4Var5.p0(objQ5);
                    }
                    kl8.m(el3Var5, ou6VarF, null, (ib4) objQ5, dd4Var5, 48, 4);
                    dd4Var5.q(false);
                }
                break;
            default:
                dr5 dr5Var5 = (dr5) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                dd4 dd4Var6 = (dd4) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                int i7 = (iIntValue12 & 6) == 0 ? iIntValue12 | (dd4Var6.f(dr5Var5) ? 4 : 2) : iIntValue12;
                if ((iIntValue12 & 48) == 0) {
                    i7 |= dd4Var6.d(iIntValue11) ? 32 : 16;
                }
                if (!dd4Var6.V(i7 & 1, (i7 & Token.EXPR_VOID) != 146)) {
                    dd4Var6.Y();
                } else {
                    yja yjaVar = (yja) arrayList.get(iIntValue11);
                    dd4Var6.f0(-1164875774);
                    ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
                    boolean zF = dd4Var6.f(kb4Var) | dd4Var6.f(yjaVar);
                    Object objQ6 = dd4Var6.Q();
                    if (zF || objQ6 == obj5) {
                        objQ6 = new e7(20, kb4Var, yjaVar);
                        dd4Var6.p0(objQ6);
                    }
                    tw1.s(yjaVar, gjb.p0(gjb.l0(fw.J(null, (ib4) objQ6, ou6VarF2, false, 15), 8.0f), 24.0f, 0.0f, 0.0f, 0.0f, 14), dd4Var6, 0);
                    dd4Var6.q(false);
                }
                break;
        }
        return hebVar;
    }
}
