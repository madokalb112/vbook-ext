package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class p02 implements ac4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ br9 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ p02(t02 t02Var, a07 a07Var, aw3 aw3Var, a07 a07Var2, a07 a07Var3) {
        this.c = t02Var;
        this.b = a07Var;
        this.d = aw3Var;
        this.e = a07Var2;
        this.f = a07Var3;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        yb4 yb4Var;
        br9 br9Var;
        ou6 ou6Var;
        boolean z;
        int i = this.a;
        br9 br9Var2 = this.b;
        heb hebVar = heb.a;
        Object obj5 = vl1.a;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.c;
        int i2 = 0;
        switch (i) {
            case 0:
                t02 t02Var = (t02) obj9;
                aw3 aw3Var = (aw3) obj8;
                a07 a07Var = (a07) obj7;
                a07 a07Var2 = (a07) obj6;
                pj7 pj7Var = (pj7) obj2;
                dd4 dd4Var = (dd4) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((yn0) obj).getClass();
                pj7Var.getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= dd4Var.f(pj7Var) ? 32 : 16;
                }
                if (!dd4Var.V(iIntValue & 1, (iIntValue & Token.TARGET) != 144)) {
                    dd4Var.Y();
                } else {
                    ou6 ou6Var2 = tg9.c;
                    xf0 xf0Var = bv4.b;
                    ha6 ha6VarD = pn0.d(xf0Var, false);
                    int iHashCode = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL = dd4Var.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var2);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var.j0();
                    if (dd4Var.S) {
                        dd4Var.k(um1Var);
                    } else {
                        dd4Var.s0();
                    }
                    yb4 yb4Var2 = ll1.f;
                    un9.s(yb4Var2, dd4Var, ha6VarD);
                    jm jmVar = ll1.e;
                    un9.s(jmVar, dd4Var, lr7VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    jm jmVar2 = ll1.g;
                    un9.s(jmVar2, dd4Var, numValueOf);
                    kd kdVar = ll1.h;
                    un9.r(dd4Var, kdVar);
                    jm jmVar3 = ll1.d;
                    un9.s(jmVar3, dd4Var, ou6VarL0);
                    br9 br9Var3 = this.b;
                    if (((s02) br9Var3.getValue()).b && ((s02) br9Var3.getValue()).i.isEmpty() && !((s02) br9Var3.getValue()).a) {
                        dd4Var.f0(-1940801590);
                        p35 p35VarC = i25.c((m53) f53.a.getValue(), dd4Var, 0);
                        String strK = wn9.K((pv9) eu9.E.getValue(), dd4Var);
                        String strK2 = wn9.K((pv9) eu9.F.getValue(), dd4Var);
                        String strK3 = wn9.K((pv9) mu9.Q.getValue(), dd4Var);
                        ou6 ou6VarL02 = gjb.l0(ou6Var2, 12.0f);
                        boolean zF = dd4Var.f(t02Var);
                        Object objQ = dd4Var.Q();
                        if (zF || objQ == obj5) {
                            yb4Var = yb4Var2;
                            d7 d7Var = new d7(0, t02Var, t02.class, "reload", "reload()V", 0, 16);
                            dd4Var.p0(d7Var);
                            objQ = d7Var;
                        } else {
                            yb4Var = yb4Var2;
                        }
                        bx1.d(p35VarC, strK, strK2, ou6VarL02, strK3, (ib4) ((ei5) objQ), dd4Var, 3072, 0);
                        dd4Var.q(false);
                        br9Var = br9Var3;
                        ou6Var = ou6Var2;
                    } else {
                        dd4Var.f0(-1940118195);
                        st5 st5VarA = ut5.a(0, dd4Var, 0, 3);
                        szb szbVarW = yib.w(yib.w(pj7Var, yib.e(dd4Var, 14)), gjb.q(0.0f, 0.0f, 0.0f, 8.0f, 7));
                        boolean zF2 = dd4Var.f(t02Var);
                        Object objQ2 = dd4Var.Q();
                        if (zF2 || objQ2 == obj5) {
                            objQ2 = new d7(0, t02Var, t02.class, "loadMore", "loadMore()V", 0, 17);
                            dd4Var.p0(objQ2);
                        }
                        mt5.c(st5VarA, 0, (ib4) ((ei5) objQ2), dd4Var, 0, 2);
                        szb szbVarW2 = yib.w(szbVarW, gjb.o(2, 16.0f));
                        mv mvVar = new mv(4.0f, true, new gp(5));
                        boolean zF3 = dd4Var.f(br9Var3) | dd4Var.f(t02Var) | dd4Var.f(aw3Var) | dd4Var.f(a07Var);
                        Object objQ3 = dd4Var.Q();
                        if (zF3 || objQ3 == obj5) {
                            yb4Var = yb4Var2;
                            br9Var = br9Var3;
                            objQ3 = new x5((Object) t02Var, (Object) aw3Var, (Object) br9Var, a07Var2, a07Var, 2);
                            dd4Var.p0(objQ3);
                        } else {
                            yb4Var = yb4Var2;
                            br9Var = br9Var3;
                        }
                        rw1.j(ou6Var2, st5VarA, szbVarW2, false, mvVar, null, null, false, null, (kb4) objQ3, dd4Var, 24582, 488);
                        ou6Var = ou6Var2;
                        dd4Var.q(false);
                    }
                    if (((s02) br9Var.getValue()).c) {
                        dd4Var.f0(-1934377584);
                        ou6 ou6VarL = fe.L(ou6Var, lc1.c(0.18f, ((q96) dd4Var.j(s96.a)).a.C), jf0.G);
                        ha6 ha6VarD2 = pn0.d(xf0Var, false);
                        int iHashCode2 = Long.hashCode(dd4Var.T);
                        lr7 lr7VarL2 = dd4Var.l();
                        ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarL);
                        dd4Var.j0();
                        if (dd4Var.S) {
                            dd4Var.k(um1Var);
                        } else {
                            dd4Var.s0();
                        }
                        un9.s(yb4Var, dd4Var, ha6VarD2);
                        un9.s(jmVar, dd4Var, lr7VarL2);
                        ky0.v(iHashCode2, dd4Var, jmVar2, dd4Var, kdVar);
                        un9.s(jmVar3, dd4Var, ou6VarL03);
                        h48.a(zn0.a.a(lu6.a, bv4.f), 0L, 0.0f, 0L, 0, 0.0f, dd4Var, 0, 62);
                        z = true;
                        dd4Var.q(true);
                        dd4Var.q(false);
                    } else {
                        z = true;
                        dd4Var.f0(-1934080635);
                        dd4Var.q(false);
                    }
                    dd4Var.q(z);
                }
                break;
            case 1:
                t27 t27Var = (t27) obj9;
                fn2 fn2Var = (fn2) obj8;
                yn3 yn3Var = (yn3) obj7;
                r83 r83Var = (r83) obj6;
                pj7 pj7Var2 = (pj7) obj2;
                dd4 dd4Var2 = (dd4) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((yn0) obj).getClass();
                pj7Var2.getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= dd4Var2.f(pj7Var2) ? 32 : 16;
                }
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & Token.TARGET) != 144)) {
                    dd4Var2.Y();
                } else {
                    ou6 ou6VarK0 = gjb.k0(tg9.c, pj7Var2);
                    szb szbVarW3 = yib.w(new rj7(16.0f, 16.0f, 16.0f, 16.0f), yib.d(14, dd4Var2, false));
                    mv mvVar2 = new mv(12.0f, true, new gp(5));
                    br9 br9Var4 = this.b;
                    boolean zF4 = dd4Var2.f(br9Var4) | dd4Var2.f(t27Var) | dd4Var2.f(fn2Var) | dd4Var2.f(yn3Var) | dd4Var2.f(r83Var);
                    Object objQ4 = dd4Var2.Q();
                    if (zF4 || objQ4 == obj5) {
                        x5 x5Var = new x5(br9Var4, t27Var, fn2Var, yn3Var, r83Var, 5);
                        dd4Var2.p0(x5Var);
                        objQ4 = x5Var;
                    }
                    pu1.l(ou6VarK0, null, szbVarW3, mvVar2, null, null, false, (kb4) objQ4, dd4Var2, 24576, 234);
                }
                break;
            case 2:
                t27 t27Var2 = (t27) obj9;
                String str = (String) obj8;
                sr3 sr3Var = (sr3) obj6;
                a07 a07Var3 = (a07) obj7;
                pj7 pj7Var3 = (pj7) obj2;
                dd4 dd4Var3 = (dd4) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((yn0) obj).getClass();
                pj7Var3.getClass();
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= dd4Var3.f(pj7Var3) ? 32 : 16;
                }
                if (!dd4Var3.V(iIntValue3 & 1, (iIntValue3 & Token.TARGET) != 144)) {
                    dd4Var3.Y();
                } else if (((kr3) br9Var2.getValue()).a && ((kr3) br9Var2.getValue()).h.isEmpty()) {
                    dd4Var3.f0(1760315710);
                    dd4Var3.q(false);
                } else if (!((kr3) br9Var2.getValue()).a && ((kr3) br9Var2.getValue()).h.isEmpty()) {
                    dd4Var3.f0(1760451800);
                    p35 p35VarN0 = lx1.n0(dd4Var3);
                    String strK4 = wn9.K((pv9) eu9.i.getValue(), dd4Var3);
                    String strK5 = wn9.K((pv9) eu9.l.getValue(), dd4Var3);
                    String strK6 = wn9.K((pv9) vt9.o.getValue(), dd4Var3);
                    ou6 ou6VarN0 = gjb.n0(tg9.c, 12.0f, 0.0f, 2);
                    boolean zF5 = dd4Var3.f(t27Var2);
                    Object objQ5 = dd4Var3.Q();
                    if (zF5 || objQ5 == obj5) {
                        objQ5 = new zf3(t27Var2, 7);
                        dd4Var3.p0(objQ5);
                    }
                    bx1.d(p35VarN0, strK4, strK5, ou6VarN0, strK6, (ib4) objQ5, dd4Var3, 3072, 0);
                    dd4Var3.q(false);
                } else {
                    dd4Var3.f0(1761080821);
                    fn2 fn2VarT0 = lx1.t0(dd4Var3);
                    kr3 kr3Var = (kr3) br9Var2.getValue();
                    ou6 ou6VarE = yn2.E(tg9.c, dd4Var3, 6);
                    boolean zF6 = dd4Var3.f(sr3Var);
                    Object objQ6 = dd4Var3.Q();
                    if (zF6 || objQ6 == obj5) {
                        objQ6 = new tq3(sr3Var, 1);
                        dd4Var3.p0(objQ6);
                    }
                    kb4 kb4Var = (kb4) objQ6;
                    boolean zF7 = dd4Var3.f(sr3Var);
                    Object objQ7 = dd4Var3.Q();
                    if (zF7 || objQ7 == obj5) {
                        objQ7 = new uk2(sr3Var, 7);
                        dd4Var3.p0(objQ7);
                    }
                    ib4 ib4Var = (ib4) objQ7;
                    boolean zF8 = dd4Var3.f(sr3Var);
                    Object objQ8 = dd4Var3.Q();
                    if (zF8 || objQ8 == obj5) {
                        objQ8 = new tq3(sr3Var, 2);
                        dd4Var3.p0(objQ8);
                    }
                    kb4 kb4Var2 = (kb4) objQ8;
                    boolean zF9 = dd4Var3.f(fn2VarT0);
                    Object objQ9 = dd4Var3.Q();
                    if (zF9 || objQ9 == obj5) {
                        objQ9 = new uq3(fn2VarT0, 0);
                        dd4Var3.p0(objQ9);
                    }
                    kb4 kb4Var3 = (kb4) objQ9;
                    boolean zF10 = dd4Var3.f(t27Var2);
                    Object objQ10 = dd4Var3.Q();
                    if (zF10 || objQ10 == obj5) {
                        objQ10 = new cl0(t27Var2, 6);
                        dd4Var3.p0(objQ10);
                    }
                    gc1.m(str, kr3Var, pj7Var3, ou6VarE, kb4Var, ib4Var, kb4Var2, kb4Var3, (kb4) objQ10, dd4Var3, (iIntValue3 << 3) & 896);
                    boolean zBooleanValue = ((Boolean) a07Var3.getValue()).booleanValue();
                    kr3 kr3Var2 = (kr3) br9Var2.getValue();
                    boolean zF11 = dd4Var3.f(a07Var3);
                    Object objQ11 = dd4Var3.Q();
                    if (zF11 || objQ11 == obj5) {
                        objQ11 = new wf3(a07Var3, 16);
                        dd4Var3.p0(objQ11);
                    }
                    kb4 kb4Var4 = (kb4) objQ11;
                    boolean zF12 = dd4Var3.f(sr3Var);
                    Object objQ12 = dd4Var3.Q();
                    if (zF12 || objQ12 == obj5) {
                        objQ12 = new tq3(sr3Var, 3);
                        dd4Var3.p0(objQ12);
                    }
                    kb4 kb4Var5 = (kb4) objQ12;
                    boolean zF13 = dd4Var3.f(sr3Var);
                    Object objQ13 = dd4Var3.Q();
                    if (zF13 || objQ13 == obj5) {
                        objQ13 = new tq3(sr3Var, 4);
                        dd4Var3.p0(objQ13);
                    }
                    kb4 kb4Var6 = (kb4) objQ13;
                    boolean zF14 = dd4Var3.f(sr3Var);
                    Object objQ14 = dd4Var3.Q();
                    if (zF14 || objQ14 == obj5) {
                        objQ14 = new tq3(sr3Var, 5);
                        dd4Var3.p0(objQ14);
                    }
                    kb4 kb4Var7 = (kb4) objQ14;
                    boolean zF15 = dd4Var3.f(sr3Var);
                    Object objQ15 = dd4Var3.Q();
                    if (zF15 || objQ15 == obj5) {
                        objQ15 = new tq3(sr3Var, 7);
                        dd4Var3.p0(objQ15);
                    }
                    rw1.m(zBooleanValue, kr3Var2, kb4Var4, kb4Var5, kb4Var6, kb4Var7, (kb4) objQ15, dd4Var3, 0);
                    boolean zF16 = dd4Var3.f(sr3Var);
                    Object objQ16 = dd4Var3.Q();
                    if (zF16 || objQ16 == obj5) {
                        objQ16 = new tq3(sr3Var, i2);
                        dd4Var3.p0(objQ16);
                    }
                    lx1.i(fn2VarT0, (kb4) objQ16, dd4Var3, 0);
                    dd4Var3.q(false);
                }
                break;
            default:
                String str2 = (String) obj9;
                String str3 = (String) obj8;
                t27 t27Var3 = (t27) obj7;
                pz5 pz5Var = (pz5) obj6;
                pj7 pj7Var4 = (pj7) obj2;
                dd4 dd4Var4 = (dd4) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ((yn0) obj).getClass();
                pj7Var4.getClass();
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= dd4Var4.f(pj7Var4) ? 32 : 16;
                }
                int i3 = iIntValue4;
                if (!dd4Var4.V(i3 & 1, (i3 & Token.TARGET) != 144)) {
                    dd4Var4.Y();
                } else {
                    Object[] objArr = {str2 + "-" + str3 + "-" + ((lz5) br9Var2.getValue()).a};
                    rt8 rt8Var = wq5.w;
                    Object objQ17 = dd4Var4.Q();
                    if (objQ17 == obj5) {
                        objQ17 = new ua5(25);
                        dd4Var4.p0(objQ17);
                    }
                    wq5 wq5Var = (wq5) ww1.d0(objArr, rt8Var, (ib4) objQ17, dd4Var4, 384);
                    szb szbVarW4 = yib.w(pj7Var4, yib.d(14, dd4Var4, false));
                    lz5 lz5Var = (lz5) br9Var2.getValue();
                    px3 px3Var = tg9.c;
                    szb szbVarW5 = yib.w(szbVarW4, new rj7(12.0f, 12.0f, 12.0f, 12.0f));
                    pj7 pj7VarM = yib.m(szbVarW4, 12.0f, 12.0f, 4.0f, 12.0f, dd4Var4, 28080, 0);
                    boolean zF17 = dd4Var4.f(t27Var3) | dd4Var4.f(str2);
                    Object objQ18 = dd4Var4.Q();
                    if (zF17 || objQ18 == obj5) {
                        objQ18 = new fu2(t27Var3, str2, 4);
                        dd4Var4.p0(objQ18);
                    }
                    kb4 kb4Var8 = (kb4) objQ18;
                    boolean zF18 = dd4Var4.f(t27Var3) | dd4Var4.f(br9Var2);
                    Object objQ19 = dd4Var4.Q();
                    if (zF18 || objQ19 == obj5) {
                        objQ19 = new yu2(t27Var3, br9Var2, 1);
                        dd4Var4.p0(objQ19);
                    }
                    ib4 ib4Var2 = (ib4) objQ19;
                    boolean zF19 = dd4Var4.f(pz5Var);
                    Object objQ20 = dd4Var4.Q();
                    if (zF19 || objQ20 == obj5) {
                        objQ20 = new lv2(pz5Var, 2);
                        dd4Var4.p0(objQ20);
                    }
                    ib4 ib4Var3 = (ib4) objQ20;
                    boolean zF20 = dd4Var4.f(pz5Var);
                    Object objQ21 = dd4Var4.Q();
                    if (zF20 || objQ21 == obj5) {
                        objQ21 = new lv2(pz5Var, 3);
                        dd4Var4.p0(objQ21);
                    }
                    e11.l(lz5Var, wq5Var, px3Var, szbVarW5, pj7VarM, kb4Var8, ib4Var2, ib4Var3, (ib4) objQ21, dd4Var4, 384);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ p02(a07 a07Var, t27 t27Var, fn2 fn2Var, yn3 yn3Var, r83 r83Var) {
        this.b = a07Var;
        this.c = t27Var;
        this.d = fn2Var;
        this.e = yn3Var;
        this.f = r83Var;
    }

    public /* synthetic */ p02(t27 t27Var, String str, sr3 sr3Var, a07 a07Var, a07 a07Var2) {
        this.c = t27Var;
        this.d = str;
        this.f = sr3Var;
        this.e = a07Var;
        this.b = a07Var2;
    }

    public /* synthetic */ p02(String str, String str2, t27 t27Var, a07 a07Var, pz5 pz5Var) {
        this.c = str;
        this.d = str2;
        this.e = t27Var;
        this.b = a07Var;
        this.f = pz5Var;
    }
}
