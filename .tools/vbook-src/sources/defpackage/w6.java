package defpackage;

import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class w6 implements ac4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w6(ro4 ro4Var, a07 a07Var, t27 t27Var, a07 a07Var2) {
        this.a = 2;
        this.d = ro4Var;
        this.e = a07Var;
        this.b = t27Var;
        this.c = a07Var2;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        dd4 dd4Var;
        f9 f9Var;
        zn0 zn0Var;
        f9 f9Var2;
        jm jmVar;
        yb4 yb4Var;
        j7 j7Var;
        fu6 fu6Var;
        ib4 ib4Var;
        kd kdVar;
        yb4 yb4Var2;
        pj7 pj7Var;
        yb4 yb4Var3;
        pj7 pj7Var2;
        br9 br9Var;
        yb4 yb4Var4;
        yb4 yb4Var5;
        boolean z;
        int i = this.a;
        lu6 lu6Var = lu6.a;
        int i2 = 14;
        heb hebVar = heb.a;
        fu6 fu6Var2 = vl1.a;
        Object obj5 = this.e;
        Object obj6 = this.c;
        Object obj7 = this.b;
        Object obj8 = this.d;
        boolean z2 = true;
        switch (i) {
            case 0:
                j7 j7Var2 = (j7) obj8;
                t27 t27Var = (t27) obj7;
                br9 br9Var2 = (br9) obj6;
                a07 a07Var = (a07) obj5;
                pj7 pj7Var3 = (pj7) obj2;
                dd4 dd4Var2 = (dd4) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                f9 f9Var3 = bv4.f;
                ((yn0) obj).getClass();
                pj7Var3.getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= dd4Var2.f(pj7Var3) ? 32 : 16;
                }
                if (!dd4Var2.V(iIntValue & 1, (iIntValue & Token.TARGET) != 144)) {
                    dd4Var2.Y();
                    return hebVar;
                }
                px3 px3Var = tg9.c;
                f9 f9Var4 = bv4.b;
                ha6 ha6VarD = pn0.d(f9Var4, false);
                int iHashCode = Long.hashCode(dd4Var2.T);
                lr7 lr7VarL = dd4Var2.l();
                ou6 ou6VarL0 = s32.L0(dd4Var2, px3Var);
                ml1.k.getClass();
                ib4 ib4Var2 = ll1.b;
                dd4Var2.j0();
                if (dd4Var2.S) {
                    dd4Var2.k(ib4Var2);
                } else {
                    dd4Var2.s0();
                }
                yb4 yb4Var6 = ll1.f;
                un9.s(yb4Var6, dd4Var2, ha6VarD);
                yb4 yb4Var7 = ll1.e;
                un9.s(yb4Var7, dd4Var2, lr7VarL);
                Integer numValueOf = Integer.valueOf(iHashCode);
                jm jmVar2 = ll1.g;
                un9.s(jmVar2, dd4Var2, numValueOf);
                kd kdVar2 = ll1.h;
                un9.r(dd4Var2, kdVar2);
                yb4 yb4Var8 = ll1.d;
                un9.s(yb4Var8, dd4Var2, ou6VarL0);
                boolean z3 = ((i7) br9Var2.getValue()).a;
                zn0 zn0Var2 = zn0.a;
                if (z3) {
                    dd4Var2.f0(-81187524);
                    ha6 ha6VarD2 = pn0.d(f9Var4, false);
                    int iHashCode2 = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL2 = dd4Var2.l();
                    ou6 ou6VarL02 = s32.L0(dd4Var2, px3Var);
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(ib4Var2);
                    } else {
                        dd4Var2.s0();
                    }
                    un9.s(yb4Var6, dd4Var2, ha6VarD2);
                    un9.s(yb4Var7, dd4Var2, lr7VarL2);
                    ky0.v(iHashCode2, dd4Var2, jmVar2, dd4Var2, kdVar2);
                    un9.s(yb4Var8, dd4Var2, ou6VarL02);
                    h48.a(zn0Var2.a(lu6Var, f9Var3), 0L, 0.0f, 0L, 0, 0.0f, dd4Var2, 0, 62);
                    dd4Var = dd4Var2;
                    dd4Var.q(true);
                    dd4Var.q(false);
                    f9Var = f9Var4;
                    zn0Var = zn0Var2;
                    f9Var2 = f9Var3;
                    yb4Var3 = yb4Var7;
                    yb4Var2 = yb4Var6;
                    jmVar = jmVar2;
                    yb4Var = yb4Var8;
                    j7Var = j7Var2;
                    br9Var = br9Var2;
                    pj7Var2 = pj7Var3;
                    fu6Var = fu6Var2;
                    ib4Var = ib4Var2;
                    kdVar = kdVar2;
                } else {
                    dd4Var = dd4Var2;
                    if (((i7) br9Var2.getValue()).b && ((i7) br9Var2.getValue()).e.isEmpty()) {
                        dd4Var.f0(-80902138);
                        p35 p35VarC = i25.c((m53) f53.a.getValue(), dd4Var, 0);
                        String strK = wn9.K((pv9) eu9.E.getValue(), dd4Var);
                        String strK2 = wn9.K((pv9) eu9.F.getValue(), dd4Var);
                        String strK3 = wn9.K((pv9) mu9.Q.getValue(), dd4Var);
                        ou6 ou6VarL03 = gjb.l0(px3Var, 12.0f);
                        j7Var = j7Var2;
                        boolean zF = dd4Var.f(j7Var);
                        Object objQ = dd4Var.Q();
                        fu6Var = fu6Var2;
                        if (zF || objQ == fu6Var) {
                            f9Var = f9Var4;
                            zn0Var = zn0Var2;
                            kdVar = kdVar2;
                            jmVar = jmVar2;
                            yb4Var = yb4Var8;
                            ib4Var = ib4Var2;
                            yb4Var4 = yb4Var7;
                            yb4Var5 = yb4Var6;
                            f9Var2 = f9Var3;
                            d7 d7Var = new d7(0, j7Var, j7.class, "reload", "reload()V", 0, 0);
                            dd4Var.p0(d7Var);
                            objQ = d7Var;
                        } else {
                            f9Var = f9Var4;
                            zn0Var = zn0Var2;
                            f9Var2 = f9Var3;
                            kdVar = kdVar2;
                            jmVar = jmVar2;
                            yb4Var = yb4Var8;
                            ib4Var = ib4Var2;
                            yb4Var4 = yb4Var7;
                            yb4Var5 = yb4Var6;
                        }
                        bx1.d(p35VarC, strK, strK2, ou6VarL03, strK3, (ib4) ((ei5) objQ), dd4Var, 3072, 0);
                        dd4Var.q(false);
                        yb4Var2 = yb4Var5;
                        yb4Var3 = yb4Var4;
                        br9Var = br9Var2;
                        pj7Var2 = pj7Var3;
                    } else {
                        f9Var = f9Var4;
                        zn0Var = zn0Var2;
                        f9Var2 = f9Var3;
                        jmVar = jmVar2;
                        yb4Var = yb4Var8;
                        j7Var = j7Var2;
                        fu6Var = fu6Var2;
                        ib4Var = ib4Var2;
                        kdVar = kdVar2;
                        dd4Var.f0(-80317602);
                        st5 st5VarA = ut5.a(0, dd4Var, 0, 3);
                        pj7 pj7VarW = yib.w(yib.w(pj7Var3, yib.e(dd4Var, 14)), gjb.q(0.0f, 68.0f, 0.0f, 0.0f, 13));
                        boolean zF2 = dd4Var.f(j7Var);
                        Object objQ2 = dd4Var.Q();
                        if (zF2 || objQ2 == fu6Var) {
                            yb4Var2 = yb4Var6;
                            pj7Var = pj7VarW;
                            yb4Var3 = yb4Var7;
                            pj7Var2 = pj7Var3;
                            d7 d7Var2 = new d7(0, j7Var, j7.class, "loadMore", "loadMore()V", 0, 1);
                            dd4Var.p0(d7Var2);
                            objQ2 = d7Var2;
                        } else {
                            yb4Var2 = yb4Var6;
                            yb4Var3 = yb4Var7;
                            pj7Var = pj7VarW;
                            pj7Var2 = pj7Var3;
                        }
                        mt5.c(st5VarA, 0, (ib4) ((ei5) objQ2), dd4Var, 0, 2);
                        szb szbVarW = yib.w(pj7Var, new rj7(12.0f, 8.0f, 12.0f, 8.0f));
                        ou6 ou6VarE = yn2.E(px3Var, dd4Var, 6);
                        mv mvVar = new mv(4.0f, true, new gp(5));
                        br9Var = br9Var2;
                        boolean zF3 = dd4Var.f(t27Var) | dd4Var.f(br9Var) | dd4Var.f(j7Var);
                        Object objQ3 = dd4Var.Q();
                        Object obj9 = objQ3;
                        if (zF3 || objQ3 == fu6Var) {
                            v6 v6Var = new v6(0, t27Var, br9Var, j7Var);
                            dd4Var.p0(v6Var);
                            obj9 = v6Var;
                        }
                        rw1.j(ou6VarE, st5VarA, szbVarW, false, mvVar, null, null, false, null, (kb4) obj9, dd4Var, 24576, 488);
                        dd4Var.q(false);
                    }
                }
                wga wgaVar = (wga) a07Var.getValue();
                String strK4 = wn9.K((pv9) mu9.g0.getValue(), dd4Var);
                ur9 ur9Var = s96.a;
                long j = ((q96) dd4Var.j(ur9Var)).a.G;
                ou6 ou6VarB = yib.B(gjb.m0(gjb.k0(tg9.f(lu6Var, 1.0f), pj7Var2), 16.0f, 12.0f), 6);
                boolean zF4 = dd4Var.f(a07Var);
                Object objQ4 = dd4Var.Q();
                Object obj10 = objQ4;
                if (zF4 || objQ4 == fu6Var) {
                    x6 x6Var = new x6(a07Var, 0);
                    dd4Var.p0(x6Var);
                    obj10 = x6Var;
                }
                kb4 kb4Var = (kb4) obj10;
                boolean zF5 = dd4Var.f(j7Var) | dd4Var.f(a07Var);
                Object objQ5 = dd4Var.Q();
                Object obj11 = objQ5;
                if (zF5 || objQ5 == fu6Var) {
                    y6 y6Var = new y6(0, j7Var, a07Var);
                    dd4Var.p0(y6Var);
                    obj11 = y6Var;
                }
                e11.A(wgaVar, strK4, 0L, j, null, null, ou6VarB, kb4Var, (ib4) obj11, dd4Var, 0, 52);
                if (((i7) br9Var.getValue()).c) {
                    dd4Var.f0(-77008724);
                    ou6 ou6VarL = fe.L(px3Var, lc1.c(0.18f, ((q96) dd4Var.j(ur9Var)).a.C), jf0.G);
                    ha6 ha6VarD3 = pn0.d(f9Var, false);
                    int iHashCode3 = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL3 = dd4Var.l();
                    ou6 ou6VarL04 = s32.L0(dd4Var, ou6VarL);
                    dd4Var.j0();
                    if (dd4Var.S) {
                        dd4Var.k(ib4Var);
                    } else {
                        dd4Var.s0();
                    }
                    un9.s(yb4Var2, dd4Var, ha6VarD3);
                    un9.s(yb4Var3, dd4Var, lr7VarL3);
                    ky0.v(iHashCode3, dd4Var, jmVar, dd4Var, kdVar);
                    un9.s(yb4Var, dd4Var, ou6VarL04);
                    h48.a(zn0Var.a(lu6Var, f9Var2), 0L, 0.0f, 0L, 0, 0.0f, dd4Var, 0, 62);
                    z = true;
                    dd4Var.q(true);
                    dd4Var.q(false);
                } else {
                    z = true;
                    dd4Var.f0(-76711775);
                    dd4Var.q(false);
                }
                dd4Var.q(z);
                return hebVar;
            case 1:
                String str = (String) obj8;
                t27 t27Var2 = (t27) obj7;
                br9 br9Var3 = (br9) obj6;
                jv2 jv2Var = (jv2) obj5;
                pj7 pj7Var4 = (pj7) obj2;
                dd4 dd4Var3 = (dd4) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((yn0) obj).getClass();
                pj7Var4.getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= dd4Var3.f(pj7Var4) ? 32 : 16;
                }
                if (dd4Var3.V(iIntValue2 & 1, (iIntValue2 & Token.TARGET) != 144)) {
                    Object[] objArr = {str};
                    rt8 rt8Var = wq5.w;
                    Object objQ6 = dd4Var3.Q();
                    Object obj12 = objQ6;
                    if (objQ6 == fu6Var2) {
                        bs2 bs2Var = new bs2(5);
                        dd4Var3.p0(bs2Var);
                        obj12 = bs2Var;
                    }
                    wq5 wq5Var = (wq5) ww1.d0(objArr, rt8Var, (ib4) obj12, dd4Var3, 384);
                    szb szbVarW2 = yib.w(pj7Var4, yib.d(14, dd4Var3, false));
                    lz5 lz5Var = (lz5) br9Var3.getValue();
                    px3 px3Var2 = tg9.c;
                    pj7 pj7VarM = yib.m(szbVarW2, 12.0f, 0.0f, 0.0f, 0.0f, dd4Var3, 48, 14);
                    pj7 pj7VarM2 = yib.m(szbVarW2, 12.0f, 12.0f, 6.0f, 12.0f, dd4Var3, 28080, 0);
                    boolean zF6 = dd4Var3.f(t27Var2) | dd4Var3.f(str);
                    Object objQ7 = dd4Var3.Q();
                    Object obj13 = objQ7;
                    if (zF6 || objQ7 == fu6Var2) {
                        fu2 fu2Var = new fu2(t27Var2, str, 1);
                        dd4Var3.p0(fu2Var);
                        obj13 = fu2Var;
                    }
                    kb4 kb4Var2 = (kb4) obj13;
                    boolean zF7 = dd4Var3.f(t27Var2) | dd4Var3.f(br9Var3);
                    Object objQ8 = dd4Var3.Q();
                    Object obj14 = objQ8;
                    if (zF7 || objQ8 == fu6Var2) {
                        yu2 yu2Var = new yu2(t27Var2, br9Var3, 0);
                        dd4Var3.p0(yu2Var);
                        obj14 = yu2Var;
                    }
                    ib4 ib4Var3 = (ib4) obj14;
                    boolean zF8 = dd4Var3.f(jv2Var);
                    Object objQ9 = dd4Var3.Q();
                    Object obj15 = objQ9;
                    if (zF8 || objQ9 == fu6Var2) {
                        zu2 zu2Var = new zu2(jv2Var, 0);
                        dd4Var3.p0(zu2Var);
                        obj15 = zu2Var;
                    }
                    ib4 ib4Var4 = (ib4) obj15;
                    boolean zF9 = dd4Var3.f(jv2Var);
                    Object objQ10 = dd4Var3.Q();
                    Object obj16 = objQ10;
                    if (zF9 || objQ10 == fu6Var2) {
                        zu2 zu2Var2 = new zu2(jv2Var, 1);
                        dd4Var3.p0(zu2Var2);
                        obj16 = zu2Var2;
                    }
                    e11.l(lz5Var, wq5Var, px3Var2, pj7VarM, pj7VarM2, kb4Var2, ib4Var3, ib4Var4, (ib4) obj16, dd4Var3, 384);
                } else {
                    dd4Var3.Y();
                }
                return hebVar;
            case 2:
                final ro4 ro4Var = (ro4) obj8;
                a07 a07Var2 = (a07) obj5;
                t27 t27Var3 = (t27) obj7;
                br9 br9Var4 = (br9) obj6;
                pj7 pj7Var5 = (pj7) obj2;
                dd4 dd4Var4 = (dd4) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((yn0) obj).getClass();
                pj7Var5.getClass();
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= dd4Var4.f(pj7Var5) ? 32 : 16;
                }
                int i3 = iIntValue3;
                if (dd4Var4.V(i3 & 1, (i3 & Token.TARGET) != 144)) {
                    List list = ((jo4) br9Var4.getValue()).d;
                    szb szbVarW3 = yib.w(yib.w(pj7Var5, yib.d(14, dd4Var4, false)), gjb.q(0.0f, 64.0f, 0.0f, 0.0f, 13));
                    px3 px3Var3 = tg9.c;
                    boolean zF10 = dd4Var4.f(ro4Var) | dd4Var4.f(a07Var2);
                    Object objQ11 = dd4Var4.Q();
                    Object obj17 = objQ11;
                    if (zF10 || objQ11 == fu6Var2) {
                        ej4 ej4Var = new ej4(3, ro4Var, a07Var2);
                        dd4Var4.p0(ej4Var);
                        obj17 = ej4Var;
                    }
                    kb4 kb4Var3 = (kb4) obj17;
                    boolean zF11 = dd4Var4.f(t27Var3);
                    Object objQ12 = dd4Var4.Q();
                    Object obj18 = objQ12;
                    if (zF11 || objQ12 == fu6Var2) {
                        n74 n74Var = new n74(t27Var3, 5);
                        dd4Var4.p0(n74Var);
                        obj18 = n74Var;
                    }
                    yb4 yb4Var9 = (yb4) obj18;
                    boolean zF12 = dd4Var4.f(t27Var3) | dd4Var4.f(a07Var2);
                    Object objQ13 = dd4Var4.Q();
                    Object obj19 = objQ13;
                    if (zF12 || objQ13 == fu6Var2) {
                        wt2 wt2Var = new wt2(t27Var3, a07Var2, 11);
                        dd4Var4.p0(wt2Var);
                        obj19 = wt2Var;
                    }
                    wx1.h(list, szbVarW3, px3Var3, kb4Var3, yb4Var9, (kb4) obj19, dd4Var4, 384);
                    if (((jo4) br9Var4.getValue()).a || !((jo4) br9Var4.getValue()).d.isEmpty()) {
                        dd4Var4.f0(1442398383);
                        dd4Var4.q(false);
                    } else {
                        dd4Var4.f0(1442001490);
                        bx1.d(lx1.n0(dd4Var4), wn9.K((pv9) eu9.A.getValue(), dd4Var4), wn9.K((pv9) eu9.B.getValue(), dd4Var4), gjb.k0(px3Var3, yib.w(yib.w(pj7Var5, yib.d(14, dd4Var4, false)), gjb.q(0.0f, 64.0f, 0.0f, 0.0f, 13))), (String) null, (ib4) null, dd4Var4, 0, 48);
                        dd4Var4.q(false);
                    }
                    boolean z4 = ((jo4) br9Var4.getValue()).b;
                    boolean z5 = ((jo4) br9Var4.getValue()).c;
                    ou6 ou6VarB2 = yib.B(gjb.p0(fe.L(gjb.k0(lu6Var, pj7Var5), lc1.c(0.7f, ((q96) dd4Var4.j(s96.a)).a.p), jf0.G), 16.0f, 0.0f, 8.0f, 0.0f, 10), 6);
                    boolean zF13 = dd4Var4.f(ro4Var);
                    Object objQ14 = dd4Var4.Q();
                    Object obj20 = objQ14;
                    if (zF13 || objQ14 == fu6Var2) {
                        final int i4 = 0;
                        kb4 kb4Var4 = new kb4() { // from class: io4
                            @Override // defpackage.kb4
                            public final Object invoke(Object obj21) {
                                Object value;
                                Object value2;
                                int i5 = i4;
                                heb hebVar2 = heb.a;
                                ro4 ro4Var2 = ro4Var;
                                Boolean bool = (Boolean) obj21;
                                switch (i5) {
                                    case 0:
                                        boolean zBooleanValue = bool.booleanValue();
                                        if (ro4Var2.t != zBooleanValue) {
                                            ro4Var2.t = zBooleanValue;
                                            ((my8) ro4Var2.e).b.J.e(qt.T[34], Boolean.valueOf(!zBooleanValue));
                                            fr9 fr9Var = ro4Var2.f;
                                            if (fr9Var != null) {
                                                do {
                                                    value = fr9Var.getValue();
                                                } while (!fr9Var.j(value, jo4.a((jo4) value, false, zBooleanValue, false, null, 13)));
                                            }
                                            if (ro4Var2.s.length() != 0) {
                                                yd5 yd5Var = ro4Var2.w;
                                                if (yd5Var != null) {
                                                    yd5Var.cancel(null);
                                                }
                                                za1 za1VarA = vtb.a(ro4Var2);
                                                aj2 aj2Var = rw2.a;
                                                ro4Var2.w = ro4Var2.g(za1VarA, nh2.c, new lk0(ro4Var2, zBooleanValue, null, 5));
                                            }
                                        }
                                        break;
                                    default:
                                        boolean zBooleanValue2 = bool.booleanValue();
                                        if (ro4Var2.u != zBooleanValue2) {
                                            fr9 fr9Var2 = ro4Var2.f;
                                            if (fr9Var2 != null) {
                                                do {
                                                    value2 = fr9Var2.getValue();
                                                } while (!fr9Var2.j(value2, jo4.a((jo4) value2, false, false, zBooleanValue2, null, 11)));
                                            }
                                            ro4Var2.u = zBooleanValue2;
                                            ((my8) ro4Var2.e).b.K.e(qt.T[35], bool);
                                            if (ro4Var2.s.length() != 0) {
                                                za1 za1VarA2 = vtb.a(ro4Var2);
                                                aj2 aj2Var2 = rw2.a;
                                                ro4Var2.g(za1VarA2, nh2.c, new no4(ro4Var2, null, 1));
                                            }
                                        }
                                        break;
                                }
                                return hebVar2;
                            }
                        };
                        dd4Var4.p0(kb4Var4);
                        obj20 = kb4Var4;
                    }
                    kb4 kb4Var5 = (kb4) obj20;
                    boolean zF14 = dd4Var4.f(ro4Var);
                    Object objQ15 = dd4Var4.Q();
                    Object obj21 = objQ15;
                    if (zF14 || objQ15 == fu6Var2) {
                        final boolean z6 = z2 ? 1 : 0;
                        kb4 kb4Var6 = new kb4() { // from class: io4
                            @Override // defpackage.kb4
                            public final Object invoke(Object obj212) {
                                Object value;
                                Object value2;
                                int i5 = z6;
                                heb hebVar2 = heb.a;
                                ro4 ro4Var2 = ro4Var;
                                Boolean bool = (Boolean) obj212;
                                switch (i5) {
                                    case 0:
                                        boolean zBooleanValue = bool.booleanValue();
                                        if (ro4Var2.t != zBooleanValue) {
                                            ro4Var2.t = zBooleanValue;
                                            ((my8) ro4Var2.e).b.J.e(qt.T[34], Boolean.valueOf(!zBooleanValue));
                                            fr9 fr9Var = ro4Var2.f;
                                            if (fr9Var != null) {
                                                do {
                                                    value = fr9Var.getValue();
                                                } while (!fr9Var.j(value, jo4.a((jo4) value, false, zBooleanValue, false, null, 13)));
                                            }
                                            if (ro4Var2.s.length() != 0) {
                                                yd5 yd5Var = ro4Var2.w;
                                                if (yd5Var != null) {
                                                    yd5Var.cancel(null);
                                                }
                                                za1 za1VarA = vtb.a(ro4Var2);
                                                aj2 aj2Var = rw2.a;
                                                ro4Var2.w = ro4Var2.g(za1VarA, nh2.c, new lk0(ro4Var2, zBooleanValue, null, 5));
                                            }
                                        }
                                        break;
                                    default:
                                        boolean zBooleanValue2 = bool.booleanValue();
                                        if (ro4Var2.u != zBooleanValue2) {
                                            fr9 fr9Var2 = ro4Var2.f;
                                            if (fr9Var2 != null) {
                                                do {
                                                    value2 = fr9Var2.getValue();
                                                } while (!fr9Var2.j(value2, jo4.a((jo4) value2, false, false, zBooleanValue2, null, 11)));
                                            }
                                            ro4Var2.u = zBooleanValue2;
                                            ((my8) ro4Var2.e).b.K.e(qt.T[35], bool);
                                            if (ro4Var2.s.length() != 0) {
                                                za1 za1VarA2 = vtb.a(ro4Var2);
                                                aj2 aj2Var2 = rw2.a;
                                                ro4Var2.g(za1VarA2, nh2.c, new no4(ro4Var2, null, 1));
                                            }
                                        }
                                        break;
                                }
                                return hebVar2;
                            }
                        };
                        dd4Var4.p0(kb4Var6);
                        obj21 = kb4Var6;
                    }
                    wx1.f(z4, z5, ou6VarB2, kb4Var5, (kb4) obj21, dd4Var4, 0);
                } else {
                    dd4Var4.Y();
                }
                return hebVar;
            case 3:
                t4b t4bVar = (t4b) obj8;
                t27 t27Var4 = (t27) obj7;
                br9 br9Var5 = (br9) obj6;
                br9 br9Var6 = (br9) obj5;
                pj7 pj7Var6 = (pj7) obj2;
                dd4 dd4Var5 = (dd4) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ((yn0) obj).getClass();
                pj7Var6.getClass();
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= dd4Var5.f(pj7Var6) ? 32 : 16;
                }
                if (dd4Var5.V(iIntValue4 & 1, (iIntValue4 & Token.TARGET) != 144)) {
                    l4b l4bVar = (l4b) br9Var5.getValue();
                    boolean z7 = ((iib) br9Var6.getValue()).i;
                    ou6 ou6VarB3 = yib.B(tg9.c, 14);
                    boolean zF15 = dd4Var5.f(t4bVar);
                    Object objQ16 = dd4Var5.Q();
                    if (zF15 || objQ16 == fu6Var2) {
                        vra vraVar = new vra(1, t4bVar, t4b.class, "changeAutoTranslate", "changeAutoTranslate(Z)V", 0, 5);
                        dd4Var5.p0(vraVar);
                        objQ16 = vraVar;
                    }
                    kb4 kb4Var7 = (kb4) ((ei5) objQ16);
                    boolean zF16 = dd4Var5.f(t4bVar);
                    Object objQ17 = dd4Var5.Q();
                    if (zF16 || objQ17 == fu6Var2) {
                        vra vraVar2 = new vra(1, t4bVar, t4b.class, "changeAutoDetectLanguageMode", "changeAutoDetectLanguageMode(I)V", 0, 6);
                        dd4Var5.p0(vraVar2);
                        objQ17 = vraVar2;
                    }
                    kb4 kb4Var8 = (kb4) ((ei5) objQ17);
                    boolean zF17 = dd4Var5.f(t27Var4);
                    Object objQ18 = dd4Var5.Q();
                    Object obj22 = objQ18;
                    if (zF17 || objQ18 == fu6Var2) {
                        ne9 ne9Var = new ne9(t27Var4, 20);
                        dd4Var5.p0(ne9Var);
                        obj22 = ne9Var;
                    }
                    ib4 ib4Var5 = (ib4) obj22;
                    boolean zF18 = dd4Var5.f(t27Var4);
                    Object objQ19 = dd4Var5.Q();
                    Object obj23 = objQ19;
                    if (zF18 || objQ19 == fu6Var2) {
                        cl0 cl0Var = new cl0(t27Var4, 22);
                        dd4Var5.p0(cl0Var);
                        obj23 = cl0Var;
                    }
                    kb4 kb4Var9 = (kb4) obj23;
                    boolean zF19 = dd4Var5.f(t27Var4);
                    Object objQ20 = dd4Var5.Q();
                    Object obj24 = objQ20;
                    if (zF19 || objQ20 == fu6Var2) {
                        ne9 ne9Var2 = new ne9(t27Var4, 21);
                        dd4Var5.p0(ne9Var2);
                        obj24 = ne9Var2;
                    }
                    sdc.b0(l4bVar, z7, pj7Var6, ou6VarB3, kb4Var7, kb4Var8, ib4Var5, kb4Var9, (ib4) obj24, dd4Var5, (iIntValue4 << 3) & 896);
                } else {
                    dd4Var5.Y();
                }
                return hebVar;
            case 4:
                uhb uhbVar = (uhb) obj8;
                a07 a07Var3 = (a07) obj5;
                br9 br9Var7 = (br9) obj6;
                a07 a07Var4 = (a07) obj7;
                pj7 pj7Var7 = (pj7) obj2;
                dd4 dd4Var6 = (dd4) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                ((yn0) obj).getClass();
                pj7Var7.getClass();
                if ((iIntValue5 & 48) == 0) {
                    iIntValue5 |= dd4Var6.f(pj7Var7) ? 32 : 16;
                }
                if (!dd4Var6.V(iIntValue5 & 1, (iIntValue5 & Token.TARGET) != 144)) {
                    dd4Var6.Y();
                } else if (((thb) br9Var7.getValue()).a) {
                    dd4Var6.f0(-1129504888);
                    kf0.t(((iIntValue5 >> 3) & 14) | 48, dd4Var6, tg9.c, pj7Var7);
                    dd4Var6.q(false);
                } else {
                    dd4Var6.f0(-1129303915);
                    List list2 = ((thb) br9Var7.getValue()).c;
                    boolean z8 = ((thb) br9Var7.getValue()).b;
                    px3 px3Var4 = tg9.c;
                    boolean zF20 = dd4Var6.f(uhbVar);
                    Object objQ21 = dd4Var6.Q();
                    Object obj25 = objQ21;
                    if (zF20 || objQ21 == fu6Var2) {
                        o39 o39Var = new o39(uhbVar, 27);
                        dd4Var6.p0(o39Var);
                        obj25 = o39Var;
                    }
                    ib4 ib4Var6 = (ib4) obj25;
                    boolean zF21 = dd4Var6.f(uhbVar);
                    Object objQ22 = dd4Var6.Q();
                    Object obj26 = objQ22;
                    if (zF21 || objQ22 == fu6Var2) {
                        nx9 nx9Var = new nx9(uhbVar, i2);
                        dd4Var6.p0(nx9Var);
                        obj26 = nx9Var;
                    }
                    kb4 kb4Var10 = (kb4) obj26;
                    boolean zF22 = dd4Var6.f(a07Var3);
                    Object objQ23 = dd4Var6.Q();
                    Object obj27 = objQ23;
                    if (zF22 || objQ23 == fu6Var2) {
                        uab uabVar = new uab(a07Var4, a07Var3, 1);
                        dd4Var6.p0(uabVar);
                        obj27 = uabVar;
                    }
                    kf0.s(list2, z8, pj7Var7, px3Var4, ib4Var6, kb4Var10, (kb4) obj27, dd4Var6, ((iIntValue5 << 3) & 896) | 3072);
                    dd4Var6.q(false);
                }
                return hebVar;
            default:
                p3b p3bVar = (p3b) obj8;
                hk9 hk9Var = (hk9) obj7;
                rg8 rg8Var = (rg8) obj6;
                Map map = (Map) obj5;
                Object obj28 = (in) obj;
                mu8 mu8Var = (mu8) obj2;
                dd4 dd4Var7 = (dd4) obj3;
                ((Integer) obj4).getClass();
                yk1 yk1VarM = vw1.M((lc5.Q(p3bVar.a.t(), p3bVar.d.getValue()) && hk9Var.isEmpty()) ? cx5.e : cx5.d, dd4Var7);
                Object objQ24 = dd4Var7.Q();
                if (objQ24 == fu6Var2) {
                    dd4Var7.p0(obj28);
                } else {
                    obj28 = objQ24;
                }
                rg8Var.a = (in) obj28;
                p58 p58VarA = r26.a.a(yk1VarM);
                fn1 fn1Var = s26.a;
                Object obj29 = rg8Var.a;
                if (obj29 != null) {
                    jv3.f(new p58[]{p58VarA, fn1Var.a((in) obj29), ba9.a.a(mu8Var), ru8.a.a(y86.G(new xn(mu8Var), map))}, jf0.G(-1734941436, new w27(mu8Var, 0), dd4Var7), dd4Var7, 56);
                    return hebVar;
                }
                lc5.i0("animatedContentScope");
                throw null;
        }
    }

    public /* synthetic */ w6(uhb uhbVar, a07 a07Var, a07 a07Var2, a07 a07Var3) {
        this.a = 4;
        this.d = uhbVar;
        this.e = a07Var;
        this.c = a07Var2;
        this.b = a07Var3;
    }

    public /* synthetic */ w6(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
        this.e = obj4;
    }
}
