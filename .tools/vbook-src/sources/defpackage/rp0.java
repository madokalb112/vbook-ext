package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class rp0 implements zb4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ kb4 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rp0(pj8 pj8Var, boolean z, kb4 kb4Var, boolean z2, kb4 kb4Var2) {
        this.f = pj8Var;
        this.b = z;
        this.c = kb4Var;
        this.d = z2;
        this.e = kb4Var2;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                ib4 ib4Var = (ib4) obj4;
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((yn0) obj).getClass();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dd4Var.Y();
                } else {
                    fc5 fc5Var = fc5.b;
                    lu6 lu6Var = lu6.a;
                    ou6 ou6VarO = jv3.O(lu6Var, fc5Var);
                    ur9 ur9Var = s96.a;
                    ou6 ou6VarL0 = gjb.l0(fe.L(ou6VarO, dd1.g(((q96) dd4Var.j(ur9Var)).a, 1.0f), jf0.G), 18.0f);
                    ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
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
                    un9.s(ll1.f, dd4Var, ie1VarA);
                    un9.s(ll1.e, dd4Var, lr7VarL);
                    un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
                    un9.r(dd4Var, ll1.h);
                    un9.s(ll1.d, dd4Var, ou6VarL02);
                    fz1.E(384, this.c, dd4Var, tg9.f(lu6Var, 1.0f), wn9.K((pv9) vt9.X.getValue(), dd4Var), this.b);
                    un9.a(dd4Var, tg9.h(lu6Var, 8.0f));
                    fz1.E(384, this.e, dd4Var, tg9.f(lu6Var, 1.0f), wn9.K((pv9) vt9.Y.getValue(), dd4Var), this.d);
                    un9.a(dd4Var, tg9.h(lu6Var, 8.0f));
                    String strK = wn9.K((pv9) vt9.Z.getValue(), dd4Var);
                    uka ukaVar = ((q96) dd4Var.j(ur9Var)).b.j;
                    ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                    boolean zF = dd4Var.f(ib4Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == vl1.a) {
                        objQ = new m50(12, ib4Var);
                        dd4Var.p0(objQ);
                    }
                    nha.c(strK, gjb.n0(fw.J(null, (ib4) objQ, ou6VarF, false, 15), 0.0f, 8.0f, 1), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var, 0, 0, 131068);
                    dd4Var.q(true);
                }
                break;
            default:
                pj8 pj8Var = (pj8) obj4;
                dr5 dr5Var = (dr5) obj;
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                dr5Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= dd4Var2.f(dr5Var) ? 4 : 2;
                }
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    dd4Var2.Y();
                } else {
                    final boolean z = this.b;
                    final kb4 kb4Var = this.c;
                    final boolean z2 = this.d;
                    final kb4 kb4Var2 = this.e;
                    lx1.p(dr5Var, pj8Var, "highlight", null, false, null, jf0.G(-957982048, new ac4() { // from class: ts1
                        @Override // defpackage.ac4
                        public final Object g(Object obj5, Object obj6, Object obj7, Object obj8) {
                            ((Boolean) obj6).getClass();
                            dd4 dd4Var3 = (dd4) obj7;
                            int iIntValue3 = ((Integer) obj8).intValue();
                            ((xi8) obj5).getClass();
                            if (dd4Var3.V(iIntValue3 & 1, (iIntValue3 & Token.DEFAULT) != 128)) {
                                lu6 lu6Var2 = lu6.a;
                                ou6 ou6VarF2 = tg9.f(lu6Var2, 1.0f);
                                ie1 ie1VarA2 = ge1.a(pv.c, bv4.z, dd4Var3, 0);
                                int iHashCode2 = Long.hashCode(dd4Var3.T);
                                lr7 lr7VarL2 = dd4Var3.l();
                                ou6 ou6VarL03 = s32.L0(dd4Var3, ou6VarF2);
                                ml1.k.getClass();
                                um1 um1Var2 = ll1.b;
                                dd4Var3.j0();
                                if (dd4Var3.S) {
                                    dd4Var3.k(um1Var2);
                                } else {
                                    dd4Var3.s0();
                                }
                                jm jmVar = ll1.f;
                                un9.s(jmVar, dd4Var3, ie1VarA2);
                                jm jmVar2 = ll1.e;
                                un9.s(jmVar2, dd4Var3, lr7VarL2);
                                Integer numValueOf = Integer.valueOf(iHashCode2);
                                jm jmVar3 = ll1.g;
                                un9.s(jmVar3, dd4Var3, numValueOf);
                                kd kdVar = ll1.h;
                                un9.r(dd4Var3, kdVar);
                                jm jmVar4 = ll1.d;
                                un9.s(jmVar4, dd4Var3, ou6VarL03);
                                ou6 ou6VarW = t96.w(tg9.f(lu6Var2, 1.0f), s00.p(dd4Var3).d);
                                long jG = dd1.g(s00.o(dd4Var3), 3.0f);
                                lp4 lp4Var = jf0.G;
                                ou6 ou6VarM0 = gjb.m0(fe.L(ou6VarW, jG, lp4Var), 12.0f, 8.0f);
                                eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var3, 48);
                                int iHashCode3 = Long.hashCode(dd4Var3.T);
                                lr7 lr7VarL3 = dd4Var3.l();
                                ou6 ou6VarL04 = s32.L0(dd4Var3, ou6VarM0);
                                dd4Var3.j0();
                                if (dd4Var3.S) {
                                    dd4Var3.k(um1Var2);
                                } else {
                                    dd4Var3.s0();
                                }
                                un9.s(jmVar, dd4Var3, eq8VarA);
                                un9.s(jmVar2, dd4Var3, lr7VarL3);
                                ky0.v(iHashCode3, dd4Var3, jmVar3, dd4Var3, kdVar);
                                un9.s(jmVar4, dd4Var3, ou6VarL04);
                                un9.a(dd4Var3, tg9.r(lu6Var2, 12.0f));
                                nha.c(wn9.K((pv9) ru9.o0.getValue(), dd4Var3), new bp5(1.0f, true), s00.o(dd4Var3).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var3).j, dd4Var3, 0, 0, 131064);
                                zk9.g(z2, false, null, kb4Var2, dd4Var3, 0);
                                xv5.z(dd4Var3, true, lu6Var2, 4.0f, dd4Var3);
                                kc5.i(z, gjb.n0(ky0.h(dd4Var3, 1.0f, t96.w(tg9.f(lu6Var2, 1.0f), uw1.d(s00.p(dd4Var3).d, (ax1) null, (ax1) null, s00.p(dd4Var3).a.c, s00.p(dd4Var3).a.d, 3)), lp4Var), 12.0f, 0.0f, 2), kb4Var, dd4Var3, 0);
                                dd4Var3.q(true);
                            } else {
                                dd4Var3.Y();
                            }
                            return heb.a;
                        }
                    }, dd4Var2), dd4Var2, (iIntValue2 & 14) | 1597824, 20);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ rp0(boolean z, kb4 kb4Var, boolean z2, kb4 kb4Var2, ib4 ib4Var) {
        this.b = z;
        this.c = kb4Var;
        this.d = z2;
        this.e = kb4Var2;
        this.f = ib4Var;
    }
}
