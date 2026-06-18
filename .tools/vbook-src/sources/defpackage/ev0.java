package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ev0 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ev0(bp bpVar, uka ukaVar, ou6 ou6Var, kb4 kb4Var) {
        this.a = 22;
        this.c = bpVar;
        this.e = ukaVar;
        this.b = ou6Var;
        this.d = kb4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r30v2 */
    private final Object a(Object obj, Object obj2) {
        long jC;
        long jC2;
        long jC3;
        boolean z;
        long jG;
        String[] strArr = (String[]) this.b;
        zk7 zk7Var = (zk7) this.c;
        kb4 kb4Var = (kb4) this.e;
        Integer[] numArr = (Integer[]) this.d;
        dd4 dd4Var = (dd4) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i = 1;
        boolean z2 = false;
        int i2 = 2;
        if (dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
            int i3 = 0;
            while (i3 < i2) {
                ?? r30 = zk7Var.k() == i3 ? i : z2;
                rp8 rp8Var = tp8.a;
                lu6 lu6Var = lu6.a;
                ou6 ou6VarW = t96.w(lu6Var, rp8Var);
                if (r30 != 0) {
                    dd4Var.f0(1981622306);
                    jC = dd1.g(((q96) dd4Var.j(s96.a)).a, 6.0f);
                    dd4Var.q(z2);
                } else {
                    dd4Var.f0(1981746151);
                    jC = lc1.c(0.0f, ((q96) dd4Var.j(s96.a)).a.p);
                    dd4Var.q(z2);
                }
                lp4 lp4Var = jf0.G;
                ou6 ou6VarM0 = gjb.m0(fe.L(ou6VarW, jC, lp4Var), 14.0f, 8.0f);
                boolean zF = dd4Var.f(kb4Var) | dd4Var.d(i3);
                Object objQ = dd4Var.Q();
                if (zF || objQ == vl1.a) {
                    objQ = new bk0(kb4Var, i3, i2);
                    dd4Var.p0(objQ);
                }
                ou6 ou6VarV = yn2.V(i, (ib4) objQ, dd4Var, ou6VarM0, z2);
                eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var, 48);
                int iHashCode = Long.hashCode(dd4Var.T);
                lr7 lr7VarL = dd4Var.l();
                ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarV);
                ml1.k.getClass();
                um1 um1Var = ll1.b;
                dd4Var.j0();
                if (dd4Var.S) {
                    dd4Var.k(um1Var);
                } else {
                    dd4Var.s0();
                }
                un9.s(ll1.f, dd4Var, eq8VarA);
                un9.s(ll1.e, dd4Var, lr7VarL);
                un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
                un9.r(dd4Var, ll1.h);
                un9.s(ll1.d, dd4Var, ou6VarL0);
                String str = strArr[i3];
                uka ukaVar = s00.q(dd4Var).j;
                a84 a84Var = a84.u;
                if (r30 != 0) {
                    dd4Var.f0(1453729468);
                    jC2 = s00.o(dd4Var).a;
                    dd4Var.q(z2);
                } else {
                    dd4Var.f0(1453824390);
                    jC2 = lc1.c(0.78f, s00.o(dd4Var).q);
                    dd4Var.q(z2);
                }
                int i4 = i3;
                dd4 dd4Var2 = dd4Var;
                Integer[] numArr2 = numArr;
                zk7 zk7Var2 = zk7Var;
                kb4 kb4Var2 = kb4Var;
                String[] strArr2 = strArr;
                nha.c(str, (ou6) null, jC2, (g60) null, 0L, (t74) null, a84Var, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var2, 1572864, 0, 131002);
                un9.a(dd4Var2, tg9.r(lu6Var, 6.0f));
                String strValueOf = String.valueOf(numArr2[i4].intValue());
                if (r30 != 0) {
                    dd4Var2.f0(1454147100);
                    jC3 = s00.o(dd4Var2).a;
                    dd4Var2.q(false);
                } else {
                    dd4Var2.f0(1454242022);
                    jC3 = lc1.c(0.78f, s00.o(dd4Var2).q);
                    dd4Var2.q(false);
                }
                long j = jC3;
                uka ukaVar2 = s00.q(dd4Var2).o;
                ou6 ou6VarW2 = t96.w(lu6Var, rp8Var);
                if (r30 != 0) {
                    dd4Var2.f0(1454601560);
                    jG = lc1.c(0.14f, s00.o(dd4Var2).a);
                    z = false;
                    dd4Var2.q(false);
                } else {
                    z = false;
                    dd4Var2.f0(1454731574);
                    jG = dd1.g(s00.o(dd4Var2), 8.0f);
                    dd4Var2.q(false);
                }
                nha.c(strValueOf, gjb.m0(fe.L(ou6VarW2, jG, lp4Var), 8.0f, 3.0f), j, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ukaVar2, dd4Var2, 0, 0, 131064);
                dd4Var = dd4Var2;
                dd4Var.q(true);
                i3 = i4 + 1;
                i = 1;
                z2 = z;
                strArr = strArr2;
                zk7Var = zk7Var2;
                kb4Var = kb4Var2;
                i2 = 2;
                numArr = numArr2;
            }
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object b(Object obj, Object obj2) {
        bp bpVar = (bp) this.c;
        uka ukaVar = (uka) this.e;
        ou6 ou6Var = (ou6) this.b;
        kb4 kb4Var = (kb4) this.d;
        dd4 dd4Var = (dd4) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
            i12.d(bpVar, false, uka.a(ukaVar, 0L, 0L, (a84) null, (c64) null, 0L, spa.c, (iy5) null, 16646143), 5, 0, 0, 0, ou6Var, (kb4) null, kb4Var, (yb4) null, dd4Var, 0, 1394);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object d(Object obj, Object obj2) {
        yb4 yb4Var = (yb4) this.b;
        kb4 kb4Var = (kb4) this.c;
        a07 a07Var = (a07) this.e;
        a07 a07Var2 = (a07) this.d;
        dd4 dd4Var = (dd4) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean zF = dd4Var.f(yb4Var) | dd4Var.f(kb4Var);
            Object objQ = dd4Var.Q();
            if (zF || objQ == vl1.a) {
                wp0 wp0Var = new wp0((Object) yb4Var, (Object) kb4Var, a07Var, a07Var2, 8);
                dd4Var.p0(wp0Var);
                objQ = wp0Var;
            }
            lc5.J((ib4) objQ, null, false, null, null, null, t96.j, dd4Var, 805306368, 510);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object f(Object obj, Object obj2) {
        xr xrVar = (xr) this.b;
        String str = (String) this.c;
        kb4 kb4Var = (kb4) this.e;
        kb4 kb4Var2 = (kb4) this.d;
        dd4 dd4Var = (dd4) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean zF = dd4Var.f(kb4Var) | dd4Var.f(kb4Var2);
            Object objQ = dd4Var.Q();
            if (zF || objQ == vl1.a) {
                objQ = new sl1(kb4Var, kb4Var2, 2);
                dd4Var.p0(objQ);
            }
            lc5.b(xrVar, str, (kb4) objQ, gjb.k0(tg9.f(lu6.a, 1.0f), yib.d(13, dd4Var, false)), dd4Var, 0);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object i(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        t96.t((i0a) this.c, (ou6) this.b, (kb4) this.e, (kb4) this.d, (dd4) obj, qu1.x0(49));
        return heb.a;
    }

    private final Object l(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        vm7.b((oy4) this.c, (ou6) this.b, (ib4) this.e, (ib4) this.d, (dd4) obj, qu1.x0(1));
        return heb.a;
    }

    private final Object m(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        cx1.c((List) this.c, (ou6) this.b, (kb4) this.e, (ib4) this.d, (dd4) obj, qu1.x0(1));
        return heb.a;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i;
        br9 br9Var;
        t27 t27Var;
        Object obj3;
        ou6 ou6Var;
        rj1 rj1Var;
        int i2 = this.a;
        jv jvVar = pv.c;
        zn0 zn0Var = zn0.a;
        ou6 ou6Var2 = lu6.a;
        int i3 = 6;
        Object obj4 = vl1.a;
        int i4 = 2;
        heb hebVar = heb.a;
        Object obj5 = this.d;
        Object obj6 = this.e;
        Object obj7 = this.b;
        Object obj8 = this.c;
        switch (i2) {
            case 0:
                ou6 ou6Var3 = (ou6) obj7;
                t27 t27Var2 = (t27) obj8;
                q01 q01Var = (q01) obj6;
                br9 br9Var2 = (br9) obj5;
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ha6 ha6VarD = pn0.d(bv4.b, false);
                    int iHashCode = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL = dd4Var.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var3);
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
                    if (((n01) br9Var2.getValue()).a) {
                        dd4Var.f0(-286938081);
                        String str = ((n01) br9Var2.getValue()).c;
                        ou6 ou6VarL02 = gjb.l0(tg9.c, 24.0f);
                        boolean zF = dd4Var.f(t27Var2);
                        Object objQ = dd4Var.Q();
                        if (zF || objQ == obj4) {
                            objQ = new z6(t27Var2, 5);
                            dd4Var.p0(objQ);
                        }
                        jv3.c(48, (ib4) objQ, dd4Var, ou6VarL02, str);
                        dd4Var.q(false);
                    } else if (((n01) br9Var2.getValue()).d) {
                        dd4Var.f0(-286537003);
                        String str2 = ((n01) br9Var2.getValue()).e;
                        ou6 ou6VarL03 = gjb.l0(tg9.c, 24.0f);
                        Object objQ2 = dd4Var.Q();
                        if (objQ2 == obj4) {
                            objQ2 = new dh1(1);
                            dd4Var.p0(objQ2);
                        }
                        jv3.b(432, (ib4) objQ2, dd4Var, ou6VarL03, str2);
                        dd4Var.q(false);
                    } else {
                        dd4Var.f0(-286235280);
                        vo1.x(q01Var, t27Var2, tg9.c, 0.0f, dd4Var, 384, 8);
                        dd4Var.q(false);
                    }
                    dd4Var.q(true);
                } else {
                    dd4Var.Y();
                }
                return hebVar;
            case 1:
                ou6 ou6Var4 = (ou6) obj7;
                t27 t27Var3 = (t27) obj8;
                wf1 wf1Var = (wf1) obj6;
                br9 br9Var3 = (br9) obj5;
                dd4 dd4Var2 = (dd4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ha6 ha6VarD2 = pn0.d(bv4.b, false);
                    int iHashCode2 = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL2 = dd4Var2.l();
                    ou6 ou6VarL04 = s32.L0(dd4Var2, ou6Var4);
                    ml1.k.getClass();
                    um1 um1Var2 = ll1.b;
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(um1Var2);
                    } else {
                        dd4Var2.s0();
                    }
                    un9.s(ll1.f, dd4Var2, ha6VarD2);
                    un9.s(ll1.e, dd4Var2, lr7VarL2);
                    un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode2));
                    un9.r(dd4Var2, ll1.h);
                    un9.s(ll1.d, dd4Var2, ou6VarL04);
                    if (((uf1) br9Var3.getValue()).a) {
                        dd4Var2.f0(-173252933);
                        String str3 = ((uf1) br9Var3.getValue()).c;
                        ou6 ou6VarL05 = gjb.l0(tg9.c, 24.0f);
                        boolean zF2 = dd4Var2.f(t27Var3);
                        Object objQ3 = dd4Var2.Q();
                        if (zF2 || objQ3 == obj4) {
                            objQ3 = new z6(t27Var3, 11);
                            dd4Var2.p0(objQ3);
                        }
                        gc1.h(48, (ib4) objQ3, dd4Var2, ou6VarL05, str3);
                        dd4Var2.q(false);
                    } else if (((uf1) br9Var3.getValue()).d) {
                        dd4Var2.f0(-172843671);
                        String str4 = ((uf1) br9Var3.getValue()).e;
                        ou6 ou6VarL06 = gjb.l0(tg9.c, 24.0f);
                        Object objQ4 = dd4Var2.Q();
                        if (objQ4 == obj4) {
                            i = 1;
                            objQ4 = new dh1(1);
                            dd4Var2.p0(objQ4);
                        } else {
                            i = 1;
                        }
                        ib4 ib4Var = (ib4) objQ4;
                        Object objQ5 = dd4Var2.Q();
                        if (objQ5 == obj4) {
                            objQ5 = new dh1(i);
                            dd4Var2.p0(objQ5);
                        }
                        gc1.g(3504, ib4Var, (ib4) objQ5, dd4Var2, ou6VarL06, str4);
                        dd4Var2 = dd4Var2;
                        dd4Var2.q(false);
                    } else {
                        dd4Var2.f0(-172468912);
                        vo1.x(wf1Var, t27Var3, tg9.c, 0.0f, dd4Var2, 384, 8);
                        dd4Var2.q(false);
                    }
                    dd4Var2.q(true);
                } else {
                    dd4Var2.Y();
                }
                return hebVar;
            case 2:
                t27 t27Var4 = (t27) obj8;
                nv2 nv2Var = (nv2) obj7;
                br9 br9Var4 = (br9) obj5;
                br9 br9Var5 = (br9) obj6;
                dd4 dd4Var3 = (dd4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (dd4Var3.V(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean z = ((iib) br9Var4.getValue()).i;
                    to3 to3Var = ((kv2) br9Var5.getValue()).b;
                    to3Var.getClass();
                    px3 px3Var = tg9.c;
                    boolean zF3 = dd4Var3.f(nv2Var);
                    Object objQ6 = dd4Var3.Q();
                    if (zF3 || objQ6 == obj4) {
                        objQ6 = new rb2(nv2Var, 25);
                        dd4Var3.p0(objQ6);
                    }
                    t1c.f(z, to3Var, t27Var4, px3Var, (kb4) objQ6, dd4Var3, 3072);
                } else {
                    dd4Var3.Y();
                }
                return hebVar;
            case 3:
                a07 a07Var = (a07) obj7;
                a07 a07Var2 = (a07) obj8;
                a07 a07Var3 = (a07) obj6;
                rj1 rj1Var2 = (rj1) obj5;
                dd4 dd4Var4 = (dd4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (dd4Var4.V(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    px3 px3Var2 = tg9.c;
                    boolean z2 = ((Boolean) a07Var2.getValue()).booleanValue() && ((Boolean) a07Var3.getValue()).booleanValue();
                    Object objQ7 = dd4Var4.Q();
                    if (objQ7 == obj4) {
                        objQ7 = ky0.i(dd4Var4);
                    }
                    yy6 yy6Var = (yy6) objQ7;
                    boolean zF4 = dd4Var4.f(a07Var);
                    Object objQ8 = dd4Var4.Q();
                    if (zF4 || objQ8 == obj4) {
                        objQ8 = new zl3(a07Var, 12);
                        dd4Var4.p0(objQ8);
                    }
                    sdc.e(fw.I(px3Var2, yy6Var, null, z2, null, (ib4) objQ8, 24), null, jf0.G(-1360994763, new lv8(rj1Var2, 3), dd4Var4), dd4Var4, 3072, 6);
                    boolean zF5 = dd4Var4.f(a07Var2) | dd4Var4.f(a07Var);
                    Object objQ9 = dd4Var4.Q();
                    if (zF5 || objQ9 == obj4) {
                        objQ9 = new x41(a07Var2, a07Var, 4);
                        dd4Var4.p0(objQ9);
                    }
                    int i5 = 0;
                    mb0.a(false, (ib4) objQ9, dd4Var4, 0, 1);
                    boolean zF6 = dd4Var4.f(a07Var2) | dd4Var4.f(a07Var);
                    Object objQ10 = dd4Var4.Q();
                    if (zF6 || objQ10 == obj4) {
                        objQ10 = new x14(a07Var2, a07Var, i5);
                        dd4Var4.p0(objQ10);
                    }
                    tw1.f(false, (kb4) objQ10, dd4Var4, 0, 1);
                } else {
                    dd4Var4.Y();
                }
                return hebVar;
            case 4:
                ou6 ou6Var5 = (ou6) obj7;
                t27 t27Var5 = (t27) obj8;
                rq7 rq7Var = (rq7) obj6;
                br9 br9Var6 = (br9) obj5;
                dd4 dd4Var5 = (dd4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (dd4Var5.V(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ha6 ha6VarD3 = pn0.d(bv4.b, false);
                    int iHashCode3 = Long.hashCode(dd4Var5.T);
                    lr7 lr7VarL3 = dd4Var5.l();
                    ou6 ou6VarL07 = s32.L0(dd4Var5, ou6Var5);
                    ml1.k.getClass();
                    um1 um1Var3 = ll1.b;
                    dd4Var5.j0();
                    if (dd4Var5.S) {
                        dd4Var5.k(um1Var3);
                    } else {
                        dd4Var5.s0();
                    }
                    un9.s(ll1.f, dd4Var5, ha6VarD3);
                    un9.s(ll1.e, dd4Var5, lr7VarL3);
                    un9.s(ll1.g, dd4Var5, Integer.valueOf(iHashCode3));
                    un9.r(dd4Var5, ll1.h);
                    un9.s(ll1.d, dd4Var5, ou6VarL07);
                    if (((nq7) br9Var6.getValue()).a) {
                        dd4Var5.f0(723105960);
                        String str5 = ((nq7) br9Var6.getValue()).c;
                        ou6 ou6VarL08 = gjb.l0(tg9.c, 24.0f);
                        boolean zF7 = dd4Var5.f(t27Var5);
                        Object objQ11 = dd4Var5.Q();
                        if (zF7 || objQ11 == obj4) {
                            objQ11 = new y07(t27Var5, 6);
                            dd4Var5.p0(objQ11);
                        }
                        kf0.h(48, (ib4) objQ11, dd4Var5, ou6VarL08, str5);
                        dd4Var5.q(false);
                    } else if (((nq7) br9Var6.getValue()).d) {
                        dd4Var5.f0(723507038);
                        String str6 = ((nq7) br9Var6.getValue()).e;
                        ou6 ou6VarL09 = gjb.l0(tg9.c, 24.0f);
                        Object objQ12 = dd4Var5.Q();
                        if (objQ12 == obj4) {
                            objQ12 = new dh1(1);
                            dd4Var5.p0(objQ12);
                        }
                        kf0.g(432, (ib4) objQ12, dd4Var5, ou6VarL09, str6);
                        dd4Var5.q(false);
                    } else {
                        dd4Var5.f0(723810125);
                        vo1.x(rq7Var, t27Var5, tg9.c, 4.0f, dd4Var5, 3456, 0);
                        dd4Var5.q(false);
                    }
                    dd4Var5.q(true);
                } else {
                    dd4Var5.Y();
                }
                return hebVar;
            case 5:
                t27 t27Var6 = (t27) obj8;
                e68 e68Var = (e68) obj7;
                a07 a07Var4 = (a07) obj6;
                br9 br9Var7 = (a07) obj5;
                dd4 dd4Var6 = (dd4) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (dd4Var6.V(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    px3 px3Var3 = tg9.c;
                    ur9 ur9Var = s96.a;
                    ou6 ou6VarL = fe.L(px3Var3, ((q96) dd4Var6.j(ur9Var)).a.p, jf0.G);
                    ie1 ie1VarA = ge1.a(jvVar, bv4.z, dd4Var6, 0);
                    int iHashCode4 = Long.hashCode(dd4Var6.T);
                    lr7 lr7VarL4 = dd4Var6.l();
                    ou6 ou6VarL010 = s32.L0(dd4Var6, ou6VarL);
                    ml1.k.getClass();
                    um1 um1Var4 = ll1.b;
                    dd4Var6.j0();
                    if (dd4Var6.S) {
                        dd4Var6.k(um1Var4);
                    } else {
                        dd4Var6.s0();
                    }
                    jm jmVar = ll1.f;
                    un9.s(jmVar, dd4Var6, ie1VarA);
                    jm jmVar2 = ll1.e;
                    un9.s(jmVar2, dd4Var6, lr7VarL4);
                    Integer numValueOf = Integer.valueOf(iHashCode4);
                    jm jmVar3 = ll1.g;
                    un9.s(jmVar3, dd4Var6, numValueOf);
                    kd kdVar = ll1.h;
                    un9.r(dd4Var6, kdVar);
                    jm jmVar4 = ll1.d;
                    un9.s(jmVar4, dd4Var6, ou6VarL010);
                    String strK = wn9.K((pv9) zt9.q.getValue(), dd4Var6);
                    boolean zF8 = dd4Var6.f(t27Var6);
                    Object objQ13 = dd4Var6.Q();
                    if (zF8 || objQ13 == obj4) {
                        br9Var = br9Var7;
                        objQ13 = new d7(0, t27Var6, t27.class, "navigateUp", "navigateUp()V", 0, 27);
                        t27Var = t27Var6;
                        dd4Var6.p0(objQ13);
                    } else {
                        br9Var = br9Var7;
                        t27Var = t27Var6;
                    }
                    bx1.q(strK, (ib4) ((ei5) objQ13), dd4Var6, 0);
                    ha6 ha6VarD4 = pn0.d(bv4.b, false);
                    int iHashCode5 = Long.hashCode(dd4Var6.T);
                    lr7 lr7VarL5 = dd4Var6.l();
                    ou6 ou6VarL011 = s32.L0(dd4Var6, px3Var3);
                    dd4Var6.j0();
                    if (dd4Var6.S) {
                        dd4Var6.k(um1Var4);
                    } else {
                        dd4Var6.s0();
                    }
                    un9.s(jmVar, dd4Var6, ha6VarD4);
                    un9.s(jmVar2, dd4Var6, lr7VarL5);
                    ky0.v(iHashCode5, dd4Var6, jmVar3, dd4Var6, kdVar);
                    un9.s(jmVar4, dd4Var6, ou6VarL011);
                    if (((d68) a07Var4.getValue()).a) {
                        dd4Var6.f0(589301605);
                        bx1.o(6, dd4Var6, px3Var3, ((d68) a07Var4.getValue()).e);
                        dd4Var6.q(false);
                        obj3 = obj4;
                    } else if (((d68) a07Var4.getValue()).b && ((d68) a07Var4.getValue()).f.isEmpty()) {
                        dd4Var6.f0(589631848);
                        p35 p35VarK0 = lx1.k0(dd4Var6);
                        String strK2 = wn9.K((pv9) eu9.E.getValue(), dd4Var6);
                        String strK3 = wn9.K((pv9) eu9.F.getValue(), dd4Var6);
                        String strK4 = wn9.K((pv9) mu9.Q.getValue(), dd4Var6);
                        ou6 ou6VarL012 = gjb.l0(px3Var3, 12.0f);
                        boolean zF9 = dd4Var6.f(e68Var);
                        Object objQ14 = dd4Var6.Q();
                        if (zF9) {
                            obj3 = obj4;
                        } else {
                            obj3 = obj4;
                            if (objQ14 == obj3) {
                            }
                            bx1.d(p35VarK0, strK2, strK3, ou6VarL012, strK4, (ib4) ((ei5) objQ14), dd4Var6, 3072, 0);
                            dd4Var6.q(false);
                        }
                        objQ14 = new d7(0, e68Var, e68.class, "reload", "reload()V", 0, 28);
                        dd4Var6.p0(objQ14);
                        bx1.d(p35VarK0, strK2, strK3, ou6VarL012, strK4, (ib4) ((ei5) objQ14), dd4Var6, 3072, 0);
                        dd4Var6.q(false);
                    } else {
                        obj3 = obj4;
                        if (((d68) a07Var4.getValue()).f.isEmpty()) {
                            dd4Var6.f0(590182935);
                            bx1.d(lx1.j0(dd4Var6), wn9.K((pv9) zt9.r.getValue(), dd4Var6), wn9.K((pv9) zt9.s.getValue(), dd4Var6), gjb.l0(px3Var3, 12.0f), (String) null, (ib4) null, dd4Var6, 3072, 48);
                            dd4Var6.q(false);
                        } else {
                            dd4Var6.f0(590696605);
                            st5 st5VarA = ut5.a(0, dd4Var6, 0, 3);
                            szb szbVarW = yib.w(yib.e(dd4Var6, 14), gjb.q(0.0f, 68.0f, 0.0f, ((d68) a07Var4.getValue()).e ? 92.0f : 12.0f, 5));
                            ou6 ou6VarE = yn2.E(px3Var3, dd4Var6, 6);
                            szb szbVarW2 = yib.w(szbVarW, gjb.o(2, 16.0f));
                            mv mvVar = new mv(4.0f, true, new gp(5));
                            boolean zF10 = dd4Var6.f(a07Var4) | dd4Var6.f(t27Var);
                            Object objQ15 = dd4Var6.Q();
                            if (zF10 || objQ15 == obj3) {
                                objQ15 = new wt2(a07Var4, t27Var);
                                dd4Var6.p0(objQ15);
                            }
                            rw1.j(ou6VarE, st5VarA, szbVarW2, false, mvVar, null, null, false, null, (kb4) objQ15, dd4Var6, 24576, 488);
                            dd4Var6.q(false);
                        }
                    }
                    if (((d68) a07Var4.getValue()).e) {
                        dd4Var6.f0(592899062);
                        ou6Var = ou6Var2;
                        ou6 ou6VarL013 = gjb.l0(yib.B(zn0Var.a(ou6Var, bv4.v), 12), 16.0f);
                        long j = ((q96) dd4Var6.j(ur9Var)).a.h;
                        k14 k14Var = new k14(2.0f, jf0.E, jf0.C, jf0.D);
                        boolean zF11 = dd4Var6.f(t27Var);
                        Object objQ16 = dd4Var6.Q();
                        if (zF11 || objQ16 == obj3) {
                            objQ16 = new d7(0, t27Var, ah1.class, "navigateToCreateGroupConversation", "navigateToCreateGroupConversation(Lcom/core/navigation/NavBackStack;)V", 1, 29);
                            dd4Var6.p0(objQ16);
                        }
                        ww1.g((ib4) ((ei5) objQ16), ou6VarL013, null, j, 0L, k14Var, t1c.r, dd4Var6, 12582912, 84);
                        dd4Var6.q(false);
                    } else {
                        ou6Var = ou6Var2;
                        dd4Var6.f0(593672264);
                        dd4Var6.q(false);
                    }
                    wga wgaVar = (wga) br9Var.getValue();
                    ou6 ou6VarB = yib.B(gjb.m0(tg9.f(ou6Var, 1.0f), 16.0f, 12.0f), 6);
                    String strK5 = wn9.K((pv9) zt9.t.getValue(), dd4Var6);
                    br9 br9Var8 = br9Var;
                    boolean zF12 = dd4Var6.f(br9Var8);
                    Object objQ17 = dd4Var6.Q();
                    if (zF12 || objQ17 == obj3) {
                        objQ17 = new wo6(br9Var8, 26);
                        dd4Var6.p0(objQ17);
                    }
                    kb4 kb4Var = (kb4) objQ17;
                    boolean zF13 = dd4Var6.f(e68Var) | dd4Var6.f(br9Var8);
                    Object objQ18 = dd4Var6.Q();
                    if (zF13 || objQ18 == obj3) {
                        objQ18 = new e67(6, e68Var, br9Var8);
                        dd4Var6.p0(objQ18);
                    }
                    vm7.l(wgaVar, ou6VarB, strK5, kb4Var, (ib4) objQ18, dd4Var6, 0, 0);
                    dd4Var6.q(true);
                    dd4Var6.q(true);
                } else {
                    dd4Var6.Y();
                }
                return hebVar;
            case 6:
                ou6 ou6Var6 = (ou6) obj7;
                t27 t27Var7 = (t27) obj8;
                x5c x5cVar = (x5c) obj6;
                br9 br9Var9 = (br9) obj5;
                dd4 dd4Var7 = (dd4) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (dd4Var7.V(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ha6 ha6VarD5 = pn0.d(bv4.b, false);
                    int iHashCode6 = Long.hashCode(dd4Var7.T);
                    lr7 lr7VarL6 = dd4Var7.l();
                    ou6 ou6VarL014 = s32.L0(dd4Var7, ou6Var6);
                    ml1.k.getClass();
                    um1 um1Var5 = ll1.b;
                    dd4Var7.j0();
                    if (dd4Var7.S) {
                        dd4Var7.k(um1Var5);
                    } else {
                        dd4Var7.s0();
                    }
                    un9.s(ll1.f, dd4Var7, ha6VarD5);
                    un9.s(ll1.e, dd4Var7, lr7VarL6);
                    un9.s(ll1.g, dd4Var7, Integer.valueOf(iHashCode6));
                    un9.r(dd4Var7, ll1.h);
                    un9.s(ll1.d, dd4Var7, ou6VarL014);
                    if (((f5c) br9Var9.getValue()).a) {
                        dd4Var7.f0(-1839245319);
                        String str7 = ((f5c) br9Var9.getValue()).c;
                        ou6 ou6VarL015 = gjb.l0(tg9.c, 24.0f);
                        boolean zF14 = dd4Var7.f(t27Var7);
                        Object objQ19 = dd4Var7.Q();
                        if (zF14 || objQ19 == obj4) {
                            objQ19 = new k5c(t27Var7, 2);
                            dd4Var7.p0(objQ19);
                        }
                        vm7.H(48, (ib4) objQ19, dd4Var7, ou6VarL015, str7);
                        dd4Var7.q(false);
                    } else if (((f5c) br9Var9.getValue()).d) {
                        dd4Var7.f0(-1838844241);
                        String str8 = ((f5c) br9Var9.getValue()).e;
                        ou6 ou6VarL016 = gjb.l0(tg9.c, 24.0f);
                        Object objQ20 = dd4Var7.Q();
                        if (objQ20 == obj4) {
                            objQ20 = new dh1(1);
                            dd4Var7.p0(objQ20);
                        }
                        vm7.G(432, (ib4) objQ20, dd4Var7, ou6VarL016, str8);
                        dd4Var7.q(false);
                    } else {
                        dd4Var7.f0(-1838542518);
                        vo1.x(x5cVar, t27Var7, tg9.c, 0.0f, dd4Var7, 384, 8);
                        dd4Var7.q(false);
                    }
                    dd4Var7.q(true);
                } else {
                    dd4Var7.Y();
                }
                return hebVar;
            case 7:
                ((Integer) obj2).getClass();
                y50.a((z50) obj8, (sw8) obj6, (ou6) obj7, (kb4) obj5, (dd4) obj, qu1.x0(385));
                return hebVar;
            case 8:
                st5 st5Var = (st5) obj7;
                m90 m90Var = (m90) obj8;
                hb1 hb1Var = (hb1) obj6;
                a07 a07Var5 = (a07) obj5;
                dd4 dd4Var8 = (dd4) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (dd4Var8.V(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ou6 ou6VarL017 = gjb.l0(ou6Var2, 2.0f);
                    boolean zH = dd4Var8.h(m90Var) | dd4Var8.f(hb1Var);
                    Object objQ21 = dd4Var8.Q();
                    if (zH || objQ21 == obj4) {
                        objQ21 = new v6(i4, m90Var, hb1Var, a07Var5);
                        dd4Var8.p0(objQ21);
                    }
                    rw1.j(ou6VarL017, st5Var, null, false, null, null, null, false, null, (kb4) objQ21, dd4Var8, 6, 508);
                } else {
                    dd4Var8.Y();
                }
                return hebVar;
            case 9:
                ou6 ou6Var7 = (ou6) obj7;
                a07 a07Var6 = (a07) obj8;
                rj1 rj1Var3 = (rj1) obj6;
                re0 re0Var = (re0) obj5;
                dd4 dd4Var9 = (dd4) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (dd4Var9.V(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    Object objQ22 = dd4Var9.Q();
                    if (objQ22 == obj4) {
                        objQ22 = new x6(a07Var6, 4);
                        dd4Var9.p0(objQ22);
                    }
                    ou6 ou6VarA0 = kl8.a0(ou6Var7, (kb4) objQ22);
                    ha6 ha6VarD6 = pn0.d(bv4.b, true);
                    int iHashCode7 = Long.hashCode(dd4Var9.T);
                    lr7 lr7VarL7 = dd4Var9.l();
                    ou6 ou6VarL018 = s32.L0(dd4Var9, ou6VarA0);
                    ml1.k.getClass();
                    um1 um1Var6 = ll1.b;
                    dd4Var9.j0();
                    if (dd4Var9.S) {
                        dd4Var9.k(um1Var6);
                    } else {
                        dd4Var9.s0();
                    }
                    un9.s(ll1.f, dd4Var9, ha6VarD6);
                    un9.s(ll1.e, dd4Var9, lr7VarL7);
                    un9.s(ll1.g, dd4Var9, Integer.valueOf(iHashCode7));
                    un9.r(dd4Var9, ll1.h);
                    un9.s(ll1.d, dd4Var9, ou6VarL018);
                    rj1Var3.invoke(dd4Var9, 0);
                    Object objQ23 = dd4Var9.Q();
                    if (objQ23 == obj4) {
                        objQ23 = new ik(a07Var6, i3);
                        dd4Var9.p0(objQ23);
                    }
                    re0Var.b((ib4) objQ23, dd4Var9, 6);
                    dd4Var9.q(true);
                } else {
                    dd4Var9.Y();
                }
                return hebVar;
            case 10:
                ((Integer) obj2).getClass();
                kl8.t((xm3) obj8, (ou6) obj7, (ib4) obj6, (kb4) obj5, (dd4) obj, qu1.x0(1));
                return hebVar;
            case 11:
                ((Integer) obj2).getClass();
                ah1.d((wk0) obj8, (ou6) obj7, (ib4) obj6, (ib4) obj5, (dd4) obj, qu1.x0(9));
                return hebVar;
            case 12:
                ((Integer) obj2).getClass();
                fz1.c((List) obj8, (List) obj6, (ou6) obj7, (kb4) obj5, (dd4) obj, qu1.x0(385));
                return hebVar;
            case 13:
                ((Integer) obj2).getClass();
                h67.i((t27) obj8, (pj7) obj6, (szb) obj5, (ou6) obj7, (dd4) obj, qu1.x0(3073));
                return hebVar;
            case 14:
                ((Integer) obj2).getClass();
                ev1.e((ib4) obj7, (List) obj8, (e12) obj6, (kb4) obj5, (dd4) obj, qu1.x0(7));
                return hebVar;
            case 15:
                ((Integer) obj2).getClass();
                fe.l((pv2) obj8, (ou6) obj7, (ib4) obj6, (yb4) obj5, (dd4) obj, qu1.x0(9));
                return hebVar;
            case 16:
                yb4 yb4Var = (yb4) obj7;
                Boolean bool = (Boolean) obj8;
                rj1 rj1Var4 = (rj1) obj6;
                yb4 yb4Var2 = (yb4) obj5;
                dd4 dd4Var10 = (dd4) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                xf0 xf0Var = bv4.e;
                if (dd4Var10.V(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    if (yb4Var != null) {
                        dd4Var10.f0(-391603129);
                        ou6 ou6VarA = zn0Var.a(ou6Var2, xf0Var);
                        ha6 ha6VarD7 = pn0.d(bv4.b, false);
                        rj1Var = rj1Var4;
                        int iHashCode8 = Long.hashCode(dd4Var10.T);
                        lr7 lr7VarL8 = dd4Var10.l();
                        ou6 ou6VarL019 = s32.L0(dd4Var10, ou6VarA);
                        ml1.k.getClass();
                        um1 um1Var7 = ll1.b;
                        dd4Var10.j0();
                        if (dd4Var10.S) {
                            dd4Var10.k(um1Var7);
                        } else {
                            dd4Var10.s0();
                        }
                        un9.s(ll1.f, dd4Var10, ha6VarD7);
                        un9.s(ll1.e, dd4Var10, lr7VarL8);
                        un9.s(ll1.g, dd4Var10, Integer.valueOf(iHashCode8));
                        un9.r(dd4Var10, ll1.h);
                        un9.s(ll1.d, dd4Var10, ou6VarL019);
                        yb4Var.invoke(dd4Var10, 0);
                        dd4Var10.q(true);
                        dd4Var10.q(false);
                    } else {
                        rj1Var = rj1Var4;
                        dd4Var10.f0(-391476277);
                        dd4Var10.q(false);
                    }
                    ou6 ou6VarA2 = zn0Var.a(gjb.p0(tg9.f(ou6Var2, 1.0f), yb4Var == null ? 0.0f : 34.0f, 0.0f, bool == null ? 0.0f : 24.0f, 0.0f, 10), xf0Var);
                    ie1 ie1VarA2 = ge1.a(jvVar, bv4.z, dd4Var10, 0);
                    int iHashCode9 = Long.hashCode(dd4Var10.T);
                    lr7 lr7VarL9 = dd4Var10.l();
                    ou6 ou6VarL020 = s32.L0(dd4Var10, ou6VarA2);
                    ml1.k.getClass();
                    um1 um1Var8 = ll1.b;
                    dd4Var10.j0();
                    if (dd4Var10.S) {
                        dd4Var10.k(um1Var8);
                    } else {
                        dd4Var10.s0();
                    }
                    un9.s(ll1.f, dd4Var10, ie1VarA2);
                    un9.s(ll1.e, dd4Var10, lr7VarL9);
                    un9.s(ll1.g, dd4Var10, Integer.valueOf(iHashCode9));
                    un9.r(dd4Var10, ll1.h);
                    un9.s(ll1.d, dd4Var10, ou6VarL020);
                    rj1Var.invoke(dd4Var10, 0);
                    if (yb4Var2 != null) {
                        ky0.z(dd4Var10, -638513119, ou6Var2, 2.0f, dd4Var10);
                        yb4Var2.invoke(dd4Var10, 0);
                        dd4Var10.q(false);
                    } else {
                        dd4Var10.f0(-638401643);
                        dd4Var10.q(false);
                    }
                    dd4Var10.q(true);
                    if (lc5.Q(bool, Boolean.TRUE)) {
                        dd4Var10.f0(-390898065);
                        mx4.a(i25.c((m53) a53.v.getValue(), dd4Var10, 0), (String) null, tg9.n(zn0Var.a(ou6Var2, bv4.s), 18.0f), 0L, dd4Var10, 48, 8);
                        dd4Var10.q(false);
                    } else {
                        dd4Var10.f0(-390672757);
                        dd4Var10.q(false);
                    }
                } else {
                    dd4Var10.Y();
                }
                return hebVar;
            case 17:
                ((Integer) obj2).getClass();
                t1c.n((dr3) obj8, (cr3) obj6, (ou6) obj7, (yb4) obj5, (dd4) obj, qu1.x0(449));
                return hebVar;
            case 18:
                return a(obj, obj2);
            case 19:
                ((Integer) obj2).getClass();
                lc5.n((o54) obj8, (ou6) obj7, (ib4) obj6, (kb4) obj5, (dd4) obj, qu1.x0(1));
                return hebVar;
            case 20:
                ((Integer) obj2).getClass();
                wx1.a((bp0) obj8, (ou6) obj7, (ib4) obj6, (ib4) obj5, (dd4) obj, qu1.x0(1));
                return hebVar;
            case 21:
                ((Integer) obj2).getClass();
                s32.M((gf6) obj8, (ou6) obj7, (kb4) obj6, (kb4) obj5, (dd4) obj, qu1.x0(1));
                return hebVar;
            case 22:
                return b(obj, obj2);
            case 23:
                return d(obj, obj2);
            case 24:
                return f(obj, obj2);
            case 25:
                ((Integer) obj2).getClass();
                lc5.b((xr) obj8, (String) obj6, (kb4) obj5, (ou6) obj7, (dd4) obj, qu1.x0(1));
                return hebVar;
            case 26:
                return i(obj, obj2);
            case 27:
                return l(obj, obj2);
            case 28:
                return m(obj, obj2);
            default:
                ((Integer) obj2).getClass();
                wx1.D((v78) obj8, (ou6) obj7, (ib4) obj6, (ib4) obj5, (dd4) obj, qu1.x0(9));
                return hebVar;
        }
    }

    public /* synthetic */ ev0(ib4 ib4Var, List list, e12 e12Var, kb4 kb4Var, int i) {
        this.a = 14;
        this.b = ib4Var;
        this.c = list;
        this.e = e12Var;
        this.d = kb4Var;
    }

    public /* synthetic */ ev0(t27 t27Var, nv2 nv2Var, br9 br9Var, br9 br9Var2) {
        this.a = 2;
        this.c = t27Var;
        this.b = nv2Var;
        this.d = br9Var;
        this.e = br9Var2;
    }

    public /* synthetic */ ev0(t27 t27Var, e68 e68Var, a07 a07Var, a07 a07Var2) {
        this.a = 5;
        this.c = t27Var;
        this.b = e68Var;
        this.e = a07Var;
        this.d = a07Var2;
    }

    public /* synthetic */ ev0(Object obj, ou6 ou6Var, ub4 ub4Var, ub4 ub4Var2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = ou6Var;
        this.e = ub4Var;
        this.d = ub4Var2;
    }

    public /* synthetic */ ev0(Object obj, Object obj2, ou6 ou6Var, ub4 ub4Var, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.e = obj2;
        this.b = ou6Var;
        this.d = ub4Var;
    }

    public /* synthetic */ ev0(Object obj, Object obj2, Object obj3, ou6 ou6Var, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.e = obj2;
        this.d = obj3;
        this.b = ou6Var;
    }

    public /* synthetic */ ev0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.d = obj4;
    }
}
