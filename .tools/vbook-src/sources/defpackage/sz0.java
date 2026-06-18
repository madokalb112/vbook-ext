package defpackage;

import android.content.pm.PackageInfo;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class sz0 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ sz0(vx1 vx1Var, wq5 wq5Var, a07 a07Var, a07 a07Var2, br9 br9Var) {
        this.a = 11;
        this.c = vx1Var;
        this.d = wq5Var;
        this.f = a07Var;
        this.e = a07Var2;
        this.b = br9Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        t61 t61Var = (t61) this.c;
        ib4 ib4Var = (ib4) this.b;
        ib4 ib4Var2 = (ib4) this.d;
        ib4 ib4Var3 = (ib4) this.e;
        ib4 ib4Var4 = (ib4) this.f;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ke1) obj).getClass();
        if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
            fe.f(wn9.K((pv9) zt9.C0.getValue(), dd4Var), (m53) a53.P.getValue(), t61Var.r, false, ib4Var, dd4Var, 0, 8);
            fe.f(wn9.K((pv9) zt9.a.getValue(), dd4Var), (m53) a53.a.getValue(), t61Var.s, false, ib4Var2, dd4Var, 0, 8);
            fe.f(wn9.K((pv9) zt9.j.getValue(), dd4Var), (m53) f53.F.getValue(), t61Var.u, false, ib4Var3, dd4Var, 0, 8);
            fe.f(wn9.K((pv9) zt9.a0.getValue(), dd4Var), (m53) a53.H.getValue(), t61Var.r, true, ib4Var4, dd4Var, 3072, 0);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        ou6 ou6Var;
        Object obj4;
        a07 a07Var = (a07) this.f;
        final br9 br9Var = (br9) this.c;
        br9 br9Var2 = (br9) this.d;
        final a07 a07Var2 = (a07) this.e;
        final t27 t27Var = (t27) this.b;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((fq8) obj).getClass();
        final int i = 1;
        final int i2 = 0;
        if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
            boolean z = ((wq2) br9Var.getValue()).a;
            ou6 ou6Var2 = lu6.a;
            Object obj5 = vl1.a;
            if (z) {
                ou6Var = ou6Var2;
                obj4 = obj5;
                dd4Var.f0(-1938262776);
                dd4Var.q(false);
            } else {
                dd4Var.f0(-1938586633);
                u4b u4bVar = (u4b) br9Var2.getValue();
                rj7 rj7Var = new rj7(3.0f, 3.0f, 3.0f, 3.0f);
                boolean zF = dd4Var.f(a07Var);
                Object objQ = dd4Var.Q();
                if (zF || objQ == obj5) {
                    objQ = new bv1(a07Var, 3);
                    dd4Var.p0(objQ);
                }
                obj4 = obj5;
                ou6Var = ou6Var2;
                wn9.h(u4bVar, false, null, rj7Var, (ib4) objQ, dd4Var, 3072, 6);
                un9.a(dd4Var, tg9.r(ou6Var, 6.0f));
                dd4Var.q(false);
            }
            if (((wq2) br9Var.getValue()).i != null) {
                dd4Var.f0(-1938184780);
                ha6 ha6VarD = pn0.d(bv4.b, false);
                int iHashCode = Long.hashCode(dd4Var.T);
                lr7 lr7VarL = dd4Var.l();
                ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
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
                p35 p35VarC = i25.c((m53) f53.J.getValue(), dd4Var, 0);
                boolean zF2 = dd4Var.f(a07Var2);
                Object objQ2 = dd4Var.Q();
                if (zF2 || objQ2 == obj4) {
                    objQ2 = new bv1(a07Var2, 4);
                    dd4Var.p0(objQ2);
                }
                sw1.r(p35VarC, (ou6) null, 0L, (ib4) objQ2, dd4Var, 0, 6);
                boolean zBooleanValue = ((Boolean) a07Var2.getValue()).booleanValue();
                boolean zF3 = dd4Var.f(a07Var2) | dd4Var.f(br9Var) | dd4Var.f(t27Var);
                Object objQ3 = dd4Var.Q();
                if (zF3 || objQ3 == obj4) {
                    objQ3 = new ib4() { // from class: rp2
                        @Override // defpackage.ib4
                        public final Object invoke() {
                            String str;
                            int i3 = i2;
                            heb hebVar = heb.a;
                            t27 t27Var2 = t27Var;
                            br9 br9Var3 = br9Var;
                            a07 a07Var3 = a07Var2;
                            switch (i3) {
                                case 0:
                                    a07Var3.setValue(Boolean.FALSE);
                                    ho2 ho2Var = ((wq2) br9Var3.getValue()).i;
                                    if (ho2Var != null && (str = ho2Var.c) != null) {
                                        yb0.T(t27Var2, str);
                                    }
                                    break;
                                default:
                                    a07Var3.setValue(Boolean.FALSE);
                                    ho2 ho2Var2 = ((wq2) br9Var3.getValue()).i;
                                    if (ho2Var2 != null) {
                                        String str2 = ho2Var2.a;
                                        t27Var2.getClass();
                                        t27Var2.a.d(new go4(str2));
                                    }
                                    break;
                            }
                            return hebVar;
                        }
                    };
                    dd4Var.p0(objQ3);
                }
                ib4 ib4Var = (ib4) objQ3;
                Object objQ4 = dd4Var.Q();
                if (objQ4 == obj4) {
                    objQ4 = new dh1(1);
                    dd4Var.p0(objQ4);
                }
                ib4 ib4Var2 = (ib4) objQ4;
                boolean zF4 = dd4Var.f(a07Var2) | dd4Var.f(br9Var) | dd4Var.f(t27Var);
                Object objQ5 = dd4Var.Q();
                if (zF4 || objQ5 == obj4) {
                    objQ5 = new ib4() { // from class: rp2
                        @Override // defpackage.ib4
                        public final Object invoke() {
                            String str;
                            int i3 = i;
                            heb hebVar = heb.a;
                            t27 t27Var2 = t27Var;
                            br9 br9Var3 = br9Var;
                            a07 a07Var3 = a07Var2;
                            switch (i3) {
                                case 0:
                                    a07Var3.setValue(Boolean.FALSE);
                                    ho2 ho2Var = ((wq2) br9Var3.getValue()).i;
                                    if (ho2Var != null && (str = ho2Var.c) != null) {
                                        yb0.T(t27Var2, str);
                                    }
                                    break;
                                default:
                                    a07Var3.setValue(Boolean.FALSE);
                                    ho2 ho2Var2 = ((wq2) br9Var3.getValue()).i;
                                    if (ho2Var2 != null) {
                                        String str2 = ho2Var2.a;
                                        t27Var2.getClass();
                                        t27Var2.a.d(new go4(str2));
                                    }
                                    break;
                            }
                            return hebVar;
                        }
                    };
                    dd4Var.p0(objQ5);
                }
                ib4 ib4Var3 = (ib4) objQ5;
                boolean zF5 = dd4Var.f(a07Var2);
                Object objQ6 = dd4Var.Q();
                if (zF5 || objQ6 == obj4) {
                    objQ6 = new bv1(a07Var2, 5);
                    dd4Var.p0(objQ6);
                }
                fw.l(zBooleanValue, ib4Var, ib4Var2, ib4Var3, (ib4) objQ6, dd4Var, 384);
                dd4Var.q(true);
                dd4Var.q(false);
            } else {
                dd4Var.f0(-1937150744);
                dd4Var.q(false);
            }
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        Object mm3Var;
        boolean z;
        a07 a07Var = (a07) this.f;
        a07 a07Var2 = (a07) this.c;
        a07 a07Var3 = (a07) this.d;
        zb4 zb4Var = (zb4) this.e;
        kb4 kb4Var = (kb4) this.b;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ke1) obj).getClass();
        if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
            lu6 lu6Var = lu6.a;
            int i = 2;
            ou6 ou6VarN0 = gjb.n0(gjb.k0(h67.f0(kc5.Q(tg9.f(lu6Var, 1.0f), kc5.J(dd4Var), 14), null, 3), yib.e(dd4Var, 14)), 16.0f, 0.0f, 2);
            ie1 ie1VarA = ge1.a(new mv(12.0f, true, new gp(5)), bv4.z, dd4Var, 6);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarN0);
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
            un9.s(ll1.d, dd4Var, ou6VarL0);
            un9.a(dd4Var, tg9.h(lu6Var, 4.0f));
            int i2 = 1;
            nha.c(wn9.K((pv9) eu9.k0.getValue(), dd4Var), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(s96.a)).b.h, dd4Var, 0, 0, 131070);
            String strK = wn9.K((pv9) eu9.l0.getValue(), dd4Var);
            boolean z2 = ((sl3) a07Var.getValue()) == sl3.a;
            boolean zF = dd4Var.f(a07Var);
            Object objQ = dd4Var.Q();
            Object obj4 = vl1.a;
            if (zF || objQ == obj4) {
                objQ = new zl3(a07Var, i2);
                dd4Var.p0(objQ);
            }
            tw1.d(strK, z2, (ib4) objQ, null, dd4Var, 0, 8);
            String strK2 = wn9.K((pv9) eu9.m0.getValue(), dd4Var);
            boolean z3 = ((sl3) a07Var.getValue()) == sl3.b;
            boolean zF2 = dd4Var.f(a07Var);
            Object objQ2 = dd4Var.Q();
            if (zF2 || objQ2 == obj4) {
                objQ2 = new zl3(a07Var, i);
                dd4Var.p0(objQ2);
            }
            tw1.d(strK2, z3, (ib4) objQ2, jf0.G(725525458, new i91(a07Var2, a07Var3, i2), dd4Var), dd4Var, 3072, 0);
            p35 p35VarC = i25.c((m53) a53.L.getValue(), dd4Var, 0);
            String strK3 = wn9.K((pv9) zt9.U.getValue(), dd4Var);
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            boolean zF3 = dd4Var.f(a07Var2) | dd4Var.f(a07Var3) | dd4Var.f(zb4Var) | dd4Var.f(a07Var) | dd4Var.f(kb4Var);
            Object objQ3 = dd4Var.Q();
            if (zF3 || objQ3 == obj4) {
                z = true;
                mm3Var = new mm3(zb4Var, kb4Var, a07Var2, a07Var3, a07Var, 0);
                dd4Var.p0(mm3Var);
            } else {
                z = true;
                mm3Var = objQ3;
            }
            kc5.n(p35VarC, strK3, false, null, ou6VarF, null, null, null, (ib4) mm3Var, dd4Var, 24576, 236);
            xv5.A(lu6Var, 12.0f, dd4Var, z);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        fn3 fn3Var = (fn3) this.c;
        final gn3 gn3Var = (gn3) this.d;
        final kb4 kb4Var = (kb4) this.e;
        final kb4 kb4Var2 = (kb4) this.f;
        final kb4 kb4Var3 = (kb4) this.b;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ke1) obj).getClass();
        final int i = 0;
        final int i2 = 1;
        if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
            t1c.t(null, jf0.G(-403560125, new zb4() { // from class: mn3
                @Override // defpackage.zb4
                public final Object c(Object obj4, Object obj5, Object obj6) {
                    int i3 = i;
                    heb hebVar = heb.a;
                    lu6 lu6Var = lu6.a;
                    gn3 gn3Var2 = gn3Var;
                    switch (i3) {
                        case 0:
                            dd4 dd4Var2 = (dd4) obj5;
                            int iIntValue2 = ((Integer) obj6).intValue();
                            ((ke1) obj4).getClass();
                            if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                dd4Var2.Y();
                            } else {
                                e11.t(wn9.K((pv9) ru9.k.getValue(), dd4Var2), wm9.r((hv9) rv.j.getValue(), dd4Var2), gn3Var2.a, gjb.m0(tg9.f(lu6Var, 1.0f), 14.0f, 12.0f), kb4Var, dd4Var2, 3072);
                            }
                            break;
                        case 1:
                            dd4 dd4Var3 = (dd4) obj5;
                            int iIntValue3 = ((Integer) obj6).intValue();
                            ((ke1) obj4).getClass();
                            if (!dd4Var3.V(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                dd4Var3.Y();
                            } else {
                                e11.t(wn9.K((pv9) ru9.d.getValue(), dd4Var3), wm9.r((hv9) rv.g.getValue(), dd4Var3), gn3Var2.b, gjb.m0(tg9.f(lu6Var, 1.0f), 14.0f, 12.0f), kb4Var, dd4Var3, 3072);
                            }
                            break;
                        default:
                            dd4 dd4Var4 = (dd4) obj5;
                            int iIntValue4 = ((Integer) obj6).intValue();
                            ((ke1) obj4).getClass();
                            if (!dd4Var4.V(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                dd4Var4.Y();
                            } else {
                                e11.x(null, wn9.K((pv9) ru9.f.getValue(), dd4Var4), wn9.K((pv9) ru9.g.getValue(), dd4Var4), gjb.m0(tg9.f(lu6Var, 1.0f), 14.0f, 12.0f), false, gn3Var2.c, kb4Var, dd4Var4, 3072, 17);
                            }
                            break;
                    }
                    return hebVar;
                }
            }, dd4Var), dd4Var, 48);
            lu6 lu6Var = lu6.a;
            un9.a(dd4Var, tg9.h(lu6Var, 10.0f));
            t1c.t(null, jf0.G(1072168108, new zb4() { // from class: mn3
                @Override // defpackage.zb4
                public final Object c(Object obj4, Object obj5, Object obj6) {
                    int i3 = i2;
                    heb hebVar = heb.a;
                    lu6 lu6Var2 = lu6.a;
                    gn3 gn3Var2 = gn3Var;
                    switch (i3) {
                        case 0:
                            dd4 dd4Var2 = (dd4) obj5;
                            int iIntValue2 = ((Integer) obj6).intValue();
                            ((ke1) obj4).getClass();
                            if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                dd4Var2.Y();
                            } else {
                                e11.t(wn9.K((pv9) ru9.k.getValue(), dd4Var2), wm9.r((hv9) rv.j.getValue(), dd4Var2), gn3Var2.a, gjb.m0(tg9.f(lu6Var2, 1.0f), 14.0f, 12.0f), kb4Var2, dd4Var2, 3072);
                            }
                            break;
                        case 1:
                            dd4 dd4Var3 = (dd4) obj5;
                            int iIntValue3 = ((Integer) obj6).intValue();
                            ((ke1) obj4).getClass();
                            if (!dd4Var3.V(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                dd4Var3.Y();
                            } else {
                                e11.t(wn9.K((pv9) ru9.d.getValue(), dd4Var3), wm9.r((hv9) rv.g.getValue(), dd4Var3), gn3Var2.b, gjb.m0(tg9.f(lu6Var2, 1.0f), 14.0f, 12.0f), kb4Var2, dd4Var3, 3072);
                            }
                            break;
                        default:
                            dd4 dd4Var4 = (dd4) obj5;
                            int iIntValue4 = ((Integer) obj6).intValue();
                            ((ke1) obj4).getClass();
                            if (!dd4Var4.V(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                dd4Var4.Y();
                            } else {
                                e11.x(null, wn9.K((pv9) ru9.f.getValue(), dd4Var4), wn9.K((pv9) ru9.g.getValue(), dd4Var4), gjb.m0(tg9.f(lu6Var2, 1.0f), 14.0f, 12.0f), false, gn3Var2.c, kb4Var2, dd4Var4, 3072, 17);
                            }
                            break;
                    }
                    return hebVar;
                }
            }, dd4Var), dd4Var, 48);
            un9.a(dd4Var, tg9.h(lu6Var, 10.0f));
            final int i3 = 2;
            t1c.t(null, jf0.G(1845210059, new zb4() { // from class: mn3
                @Override // defpackage.zb4
                public final Object c(Object obj4, Object obj5, Object obj6) {
                    int i32 = i3;
                    heb hebVar = heb.a;
                    lu6 lu6Var2 = lu6.a;
                    gn3 gn3Var2 = gn3Var;
                    switch (i32) {
                        case 0:
                            dd4 dd4Var2 = (dd4) obj5;
                            int iIntValue2 = ((Integer) obj6).intValue();
                            ((ke1) obj4).getClass();
                            if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                dd4Var2.Y();
                            } else {
                                e11.t(wn9.K((pv9) ru9.k.getValue(), dd4Var2), wm9.r((hv9) rv.j.getValue(), dd4Var2), gn3Var2.a, gjb.m0(tg9.f(lu6Var2, 1.0f), 14.0f, 12.0f), kb4Var3, dd4Var2, 3072);
                            }
                            break;
                        case 1:
                            dd4 dd4Var3 = (dd4) obj5;
                            int iIntValue3 = ((Integer) obj6).intValue();
                            ((ke1) obj4).getClass();
                            if (!dd4Var3.V(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                dd4Var3.Y();
                            } else {
                                e11.t(wn9.K((pv9) ru9.d.getValue(), dd4Var3), wm9.r((hv9) rv.g.getValue(), dd4Var3), gn3Var2.b, gjb.m0(tg9.f(lu6Var2, 1.0f), 14.0f, 12.0f), kb4Var3, dd4Var3, 3072);
                            }
                            break;
                        default:
                            dd4 dd4Var4 = (dd4) obj5;
                            int iIntValue4 = ((Integer) obj6).intValue();
                            ((ke1) obj4).getClass();
                            if (!dd4Var4.V(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                dd4Var4.Y();
                            } else {
                                e11.x(null, wn9.K((pv9) ru9.f.getValue(), dd4Var4), wn9.K((pv9) ru9.g.getValue(), dd4Var4), gjb.m0(tg9.f(lu6Var2, 1.0f), 14.0f, 12.0f), false, gn3Var2.c, kb4Var3, dd4Var4, 3072, 17);
                            }
                            break;
                    }
                    return hebVar;
                }
            }, dd4Var), dd4Var, 48);
            int i4 = fn3Var.a;
            int i5 = fn3Var.c;
            if (i4 <= 0 || i5 <= 0) {
                dd4Var.f0(-837306317);
                dd4Var.q(false);
            } else {
                ky0.z(dd4Var, -837608071, lu6Var, 12.0f, dd4Var);
                t1c.r(wn9.L((pv9) eu9.w0.getValue(), new Object[]{Integer.valueOf(fn3Var.a), Integer.valueOf(i5)}, dd4Var), null, dd4Var, 0);
                dd4Var.q(false);
            }
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        br9 br9Var = (br9) this.c;
        a07 a07Var = (a07) this.f;
        a07 a07Var2 = (a07) this.d;
        aw3 aw3Var = (aw3) this.e;
        t27 t27Var = (t27) this.b;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((fq8) obj).getClass();
        int i = 0;
        if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
            yb0.b(jf0.G(1401720584, new sq3(br9Var, i), dd4Var), null, jf0.G(1929114634, new nb0(a07Var, 3), dd4Var), dd4Var, 390);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, lu6.a);
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
            p35 p35VarC = i25.c((m53) f53.J.getValue(), dd4Var, 0);
            boolean zF = dd4Var.f(a07Var2);
            Object objQ = dd4Var.Q();
            Object obj4 = vl1.a;
            if (zF || objQ == obj4) {
                objQ = new zl3(a07Var2, 8);
                dd4Var.p0(objQ);
            }
            sw1.r(p35VarC, (ou6) null, 0L, (ib4) objQ, dd4Var, 0, 6);
            boolean zBooleanValue = ((Boolean) a07Var2.getValue()).booleanValue();
            boolean zF2 = dd4Var.f(a07Var2) | dd4Var.f(aw3Var);
            Object objQ2 = dd4Var.Q();
            if (zF2 || objQ2 == obj4) {
                objQ2 = new uz2(aw3Var, a07Var2, 1);
                dd4Var.p0(objQ2);
            }
            ib4 ib4Var = (ib4) objQ2;
            boolean zF3 = dd4Var.f(t27Var) | dd4Var.f(a07Var2);
            Object objQ3 = dd4Var.Q();
            if (zF3 || objQ3 == obj4) {
                objQ3 = new xj0(t27Var, a07Var2, 11);
                dd4Var.p0(objQ3);
            }
            ib4 ib4Var2 = (ib4) objQ3;
            boolean zF4 = dd4Var.f(a07Var2);
            Object objQ4 = dd4Var.Q();
            if (zF4 || objQ4 == obj4) {
                objQ4 = new zl3(a07Var2, 9);
                dd4Var.p0(objQ4);
            }
            ib4 ib4Var3 = (ib4) objQ4;
            boolean zF5 = dd4Var.f(a07Var2);
            Object objQ5 = dd4Var.Q();
            if (zF5 || objQ5 == obj4) {
                objQ5 = new zl3(a07Var2, 10);
                dd4Var.p0(objQ5);
            }
            gc1.p(zBooleanValue, null, ib4Var, ib4Var2, ib4Var3, (ib4) objQ5, dd4Var, 0);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        String str = (String) this.c;
        List list = (List) this.e;
        kb4 kb4Var = (kb4) this.d;
        ib4 ib4Var = (ib4) this.b;
        List<kra> list2 = (List) this.f;
        co0 co0Var = (co0) obj;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        co0Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= dd4Var.f(co0Var) ? 4 : 2;
        }
        if (dd4Var.V(iIntValue & 1, (iIntValue & 19) != 18)) {
            float fD = co0Var.d() / 5.0f;
            lu6 lu6Var = lu6.a;
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            vf0 vf0Var = bv4.z;
            jv jvVar = pv.c;
            ie1 ie1VarA = ge1.a(jvVar, vf0Var, dd4Var, 0);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarF);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var, ie1VarA);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var, ou6VarL0);
            wh4 wh4Var = new wh4();
            fu6 fu6Var = pv.e;
            yb4 yb4VarE0 = tu1.e0(wh4Var, fu6Var, dd4Var);
            boolean zF = dd4Var.f(wh4Var);
            Object objQ = dd4Var.Q();
            Object obj4 = vl1.a;
            if (zF || objQ == obj4) {
                objQ = Boolean.TRUE;
                dd4Var.p0(objQ);
            }
            ha6 ha6VarG0 = tu1.g0(yb4VarE0, ((Boolean) objQ).booleanValue(), fu6Var, jvVar, dd4Var, 384);
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, lu6Var);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ha6VarG0);
            un9.s(jmVar2, dd4Var, lr7VarL2);
            ky0.v(iHashCode2, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL02);
            dd4Var.f0(-1435137679);
            for (kra kraVar : list2) {
                boolean zQ = lc5.Q(kraVar.a, str);
                ou6 ou6VarE0 = sdc.e0(1.0f, lu6Var, false);
                g83 g83Var = o96.a;
                ou6 ou6VarW = t96.w(ou6VarE0, rw1.k0(g83.q(), dd4Var));
                boolean zF2 = dd4Var.f(kb4Var) | dd4Var.h(kraVar);
                Object objQ2 = dd4Var.Q();
                if (zF2 || objQ2 == obj4) {
                    objQ2 = new vf6(25, kb4Var, kraVar);
                    dd4Var.p0(objQ2);
                }
                ou6 ou6VarJ = fw.J(null, (ib4) objQ2, ou6VarW, false, 15);
                long jG = dd1.g(((q96) dd4Var.j(s96.a)).a, zQ ? 6.0f : 2.0f);
                lp4 lp4Var = jf0.G;
                ou6 ou6VarW2 = t96.w(gjb.l0(fe.L(ou6VarJ, jG, lp4Var), 6.0f), rw1.k0(g83.q(), dd4Var));
                boolean zF3 = dd4Var.f(kraVar);
                Object objQ3 = dd4Var.Q();
                if (zF3 || objQ3 == obj4) {
                    lc1 lc1Var = new lc1(kf0.H(kraVar.b));
                    dd4Var.p0(lc1Var);
                    objQ3 = lc1Var;
                }
                ou6 ou6VarL = fe.L(ou6VarW2, ((lc1) objQ3).a, lp4Var);
                ha6 ha6VarD = pn0.d(bv4.b, false);
                int iHashCode3 = Long.hashCode(dd4Var.T);
                lr7 lr7VarL3 = dd4Var.l();
                ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarL);
                ml1.k.getClass();
                um1 um1Var2 = ll1.b;
                dd4Var.j0();
                if (dd4Var.S) {
                    dd4Var.k(um1Var2);
                } else {
                    dd4Var.s0();
                }
                un9.s(ll1.f, dd4Var, ha6VarD);
                un9.s(ll1.e, dd4Var, lr7VarL3);
                un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode3));
                un9.r(dd4Var, ll1.h);
                un9.s(ll1.d, dd4Var, ou6VarL03);
                if (zQ) {
                    dd4Var.f0(-148466228);
                    dd4 dd4Var2 = dd4Var;
                    z2 = true;
                    mx4.a(i25.c((m53) a53.v.getValue(), dd4Var, 0), (String) null, zn0.a.a(tg9.n(lu6Var, 24.0f), bv4.f), lc1.e, dd4Var2, 3120, 0);
                    dd4Var = dd4Var2;
                    dd4Var.q(false);
                } else {
                    z2 = true;
                    dd4Var.f0(-148033809);
                    dd4Var.q(false);
                }
                dd4Var.q(z2);
            }
            dd4Var.q(false);
            dd4Var.q(true);
            dd4 dd4Var3 = dd4Var;
            nha.c(wn9.K((pv9) ru9.s.getValue(), dd4Var), lu6Var, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(s96.a)).b.h, dd4Var3, 48, 0, 131068);
            boolean zF4 = dd4Var3.f(str);
            Object objQ4 = dd4Var3.Q();
            if (zF4 || objQ4 == obj4) {
                Iterator it = list.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (lc5.Q(((kra) it.next()).a, str)) {
                        break;
                    }
                    i++;
                }
                objQ4 = Integer.valueOf(i);
                dd4Var3.p0(objQ4);
            }
            int iIntValue2 = ((Number) objQ4).intValue();
            ou6 ou6VarF2 = tg9.f(gjb.n0(lu6Var, 0.0f, 12.0f, 1), 1.0f);
            boolean zH = dd4Var3.h(list) | dd4Var3.f(str) | dd4Var3.c(fD) | dd4Var3.f(kb4Var) | dd4Var3.f(ib4Var);
            Object objQ5 = dd4Var3.Q();
            if (zH || objQ5 == obj4) {
                z = true;
                rm0 rm0Var = new rm0(list, str, fD, kb4Var, ib4Var);
                dd4Var3.p0(rm0Var);
                objQ5 = rm0Var;
            } else {
                z = true;
            }
            mt5.a(ou6VarF2, iIntValue2, null, null, null, null, null, false, (kb4) objQ5, dd4Var3, 6, 508);
            dd4Var3.q(z);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        vx1 vx1Var = (vx1) this.c;
        wq5 wq5Var = (wq5) this.d;
        a07 a07Var = (a07) this.f;
        a07 a07Var2 = (a07) this.e;
        br9 br9Var = (br9) this.b;
        dd4 dd4Var = (dd4) obj2;
        ((Integer) obj3).getClass();
        ((co) obj).getClass();
        rp8 rp8Var = tp8.a;
        ou6 ou6VarW = t96.w(lu6.a, rp8Var);
        boolean zH = dd4Var.h(vx1Var) | dd4Var.f(wq5Var);
        Object objQ = dd4Var.Q();
        if (zH || objQ == vl1.a) {
            objQ = new wp0(a07Var, vx1Var, a07Var2, wq5Var);
            dd4Var.p0(objQ);
        }
        j1a.a(fw.J(null, (ib4) objQ, ou6VarW, false, 15), rp8Var, dd1.g(((q96) dd4Var.j(s96.a)).a, 6.0f), 0L, 2.0f, 6.0f, (wm0) null, jf0.G(-442197564, new lm6(br9Var, 3), dd4Var), dd4Var, 12804096, 72);
        return heb.a;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        bi5 bi5Var;
        int i;
        b89 b89Var;
        boolean z;
        String strK;
        Object pm8Var;
        f36 f36Var;
        boolean z2;
        vf0 vf0Var;
        b89 b89Var2;
        int i2;
        dd4 dd4Var;
        int i3 = this.a;
        jv jvVar = pv.c;
        iv ivVar = pv.a;
        lu6 lu6Var = lu6.a;
        Object obj4 = vl1.a;
        heb hebVar = heb.a;
        Object obj5 = this.b;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.c;
        switch (i3) {
            case 0:
                pj7 pj7Var = (pj7) obj9;
                szb szbVar = (szb) obj8;
                List list = (List) obj7;
                a07 a07Var = (a07) obj6;
                ib4 ib4Var = (ib4) obj5;
                co0 co0Var = (co0) obj;
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                co0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= dd4Var2.f(co0Var) ? 4 : 2;
                }
                if (dd4Var2.V(iIntValue & 1, (iIntValue & 19) != 18)) {
                    yh4 yh4Var = new yh4(((x13) t1c.g0(new x13(160.0f), new x13(co0Var.d() / 2.0f))).a);
                    px3 px3Var = tg9.c;
                    boolean zH = dd4Var2.h(list) | dd4Var2.f(a07Var) | dd4Var2.f(ib4Var);
                    Object objQ = dd4Var2.Q();
                    if (zH || objQ == obj4) {
                        objQ = new v6(10, list, a07Var, ib4Var);
                        dd4Var2.p0(objQ);
                    }
                    gx1.i(yh4Var, px3Var, null, pj7Var, null, null, null, false, 0L, 0L, szbVar, 0.0f, (kb4) objQ, dd4Var2, 48, 0, 6132);
                } else {
                    dd4Var2.Y();
                }
                return hebVar;
            case 1:
                String str = (String) obj9;
                kb4 kb4Var = (kb4) obj8;
                ib4 ib4Var2 = (ib4) obj5;
                bi5 bi5Var2 = (bi5) obj7;
                String str2 = (String) obj6;
                dd4 dd4Var3 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                qr1 qr1Var = ra1.d;
                ((ke1) obj).getClass();
                if (dd4Var3.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                    eq8 eq8VarA = dq8.a(ivVar, bv4.x, dd4Var3, 48);
                    int iHashCode = Long.hashCode(dd4Var3.T);
                    lr7 lr7VarL = dd4Var3.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var3, ou6VarF);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var3.j0();
                    if (dd4Var3.S) {
                        dd4Var3.k(um1Var);
                    } else {
                        dd4Var3.s0();
                    }
                    jm jmVar = ll1.f;
                    un9.s(jmVar, dd4Var3, eq8VarA);
                    jm jmVar2 = ll1.e;
                    un9.s(jmVar2, dd4Var3, lr7VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    jm jmVar3 = ll1.g;
                    un9.s(jmVar3, dd4Var3, numValueOf);
                    kd kdVar = ll1.h;
                    un9.r(dd4Var3, kdVar);
                    jm jmVar4 = ll1.d;
                    un9.s(jmVar4, dd4Var3, ou6VarL0);
                    ou6 ou6VarN = tg9.n(lu6Var, 72.0f);
                    ur9 ur9Var = s96.a;
                    ou6 ou6VarJ = fw.J(null, ib4Var2, fe.L(t96.w(ou6VarN, ((q96) dd4Var3.j(ur9Var)).c.c), dd1.g(((q96) dd4Var3.j(ur9Var)).a, 4.0f), jf0.G), false, 15);
                    ha6 ha6VarD = pn0.d(bv4.f, false);
                    int iHashCode2 = Long.hashCode(dd4Var3.T);
                    lr7 lr7VarL2 = dd4Var3.l();
                    ou6 ou6VarL02 = s32.L0(dd4Var3, ou6VarJ);
                    dd4Var3.j0();
                    if (dd4Var3.S) {
                        dd4Var3.k(um1Var);
                    } else {
                        dd4Var3.s0();
                    }
                    un9.s(jmVar, dd4Var3, ha6VarD);
                    un9.s(jmVar2, dd4Var3, lr7VarL2);
                    ky0.v(iHashCode2, dd4Var3, jmVar3, dd4Var3, kdVar);
                    un9.s(jmVar4, dd4Var3, ou6VarL02);
                    if (bi5Var2 != null) {
                        dd4Var3.f0(-1468774233);
                        w05.a(bi5Var2, qr1Var, false, null, null, tg9.c, null, dd4Var3, 1572912, 444);
                        bi5Var = bi5Var2;
                        dd4Var3.q(false);
                        i = 0;
                    } else {
                        bi5Var = bi5Var2;
                        if (bw9.a0(str2)) {
                            i = 0;
                            dd4Var3.f0(-1468144282);
                            mx4.a(i25.c((m53) a53.a.getValue(), dd4Var3, 0), (String) null, tg9.n(lu6Var, 24.0f), ((q96) dd4Var3.j(ur9Var)).a.a, dd4Var3, 432, 0);
                            dd4Var3.q(false);
                        } else {
                            dd4Var3.f0(-1468460699);
                            w05.a(str2, qr1Var, false, null, null, tg9.c, null, dd4Var3, 1572912, 444);
                            i = 0;
                            dd4Var3.q(false);
                        }
                    }
                    dd4Var3.q(true);
                    un9.a(dd4Var3, tg9.r(lu6Var, 12.0f));
                    bp5 bp5Var = new bp5(1.0f, true);
                    ie1 ie1VarA = ge1.a(jvVar, bv4.z, dd4Var3, i);
                    int iHashCode3 = Long.hashCode(dd4Var3.T);
                    lr7 lr7VarL3 = dd4Var3.l();
                    ou6 ou6VarL03 = s32.L0(dd4Var3, bp5Var);
                    dd4Var3.j0();
                    if (dd4Var3.S) {
                        dd4Var3.k(um1Var);
                    } else {
                        dd4Var3.s0();
                    }
                    un9.s(jmVar, dd4Var3, ie1VarA);
                    un9.s(jmVar2, dd4Var3, lr7VarL3);
                    ky0.v(iHashCode3, dd4Var3, jmVar3, dd4Var3, kdVar);
                    un9.s(jmVar4, dd4Var3, ou6VarL03);
                    nha.c(wn9.K((pv9) zt9.b.getValue(), dd4Var3), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var3.j(ur9Var)).b.i, dd4Var3, 0, 0, 131070);
                    un9.a(dd4Var3, tg9.h(lu6Var, 2.0f));
                    lc5.J(ib4Var2, gjb.l0(lu6Var, 0.0f), false, null, null, null, jf0.G(-704967760, new nl9(bi5Var, 6), dd4Var3), dd4Var3, 805306416, 508);
                    un9.a(dd4Var3, xv5.g(dd4Var3, true, true, lu6Var, 4.0f));
                    lx1.m(str, kb4Var, tg9.f(lu6Var, 1.0f), false, false, null, null, kc5.b, null, null, false, null, null, null, true, 0, 0, ((q96) dd4Var3.j(ur9Var)).c.b, null, dd4Var3, 12583296, 12582912, 6160248);
                } else {
                    dd4Var3.Y();
                }
                return hebVar;
            case 2:
                lz5 lz5Var = (lz5) obj8;
                wq5 wq5Var = (wq5) obj7;
                pj7 pj7Var2 = (pj7) obj9;
                pj7 pj7Var3 = (pj7) obj6;
                kb4 kb4Var2 = (kb4) obj5;
                dd4 dd4Var4 = (dd4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((yn0) obj).getClass();
                if (dd4Var4.V(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    int i4 = lz5Var.f;
                    if (i4 == 0) {
                        dd4Var4.f0(2013840726);
                        e11.c(lz5Var.j, lz5Var.g, wq5Var, lz5Var.e, tg9.c, pj7Var2, pj7Var3, kb4Var2, dd4Var4, 24576);
                        dd4Var4.q(false);
                    } else if (i4 == 1) {
                        dd4Var4.f0(2014327798);
                        e11.d(lz5Var.j, lz5Var.g, wq5Var, lz5Var.e, tg9.c, pj7Var2, pj7Var3, kb4Var2, dd4Var4, 24576);
                        dd4Var4.q(false);
                    } else if (i4 == 2) {
                        dd4Var4.f0(2014814870);
                        e11.g(lz5Var.j, lz5Var.g, wq5Var, lz5Var.e, tg9.c, pj7Var2, pj7Var3, kb4Var2, dd4Var4, 24576);
                        dd4Var4.q(false);
                    } else if (i4 != 3) {
                        dd4Var4.f0(2015720721);
                        dd4Var4.q(false);
                    } else {
                        dd4Var4.f0(2015301942);
                        e11.h(lz5Var.j, lz5Var.g, wq5Var, lz5Var.e, tg9.c, pj7Var2, pj7Var3, kb4Var2, dd4Var4, 24576);
                        dd4Var4.q(false);
                    }
                } else {
                    dd4Var4.Y();
                }
                return hebVar;
            case 3:
                lp4 lp4Var = jf0.G;
                mib mibVar = (mib) obj9;
                br9 br9Var = (br9) obj8;
                t27 t27Var = (t27) obj7;
                br9 br9Var2 = (br9) obj6;
                b89 b89Var3 = (b89) obj5;
                dd4 dd4Var5 = (dd4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((yn0) obj).getClass();
                if (!dd4Var5.V(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    dd4Var5.Y();
                    return hebVar;
                }
                lu6 lu6Var2 = lu6.a;
                ou6 ou6VarH = tg9.h(gjb.p0(gjb.n0(yib.B(yn2.y(dd4Var5, tg9.f(lu6Var2, 1.0f)), 1), 12.0f, 0.0f, 2), 0.0f, 12.0f, 0.0f, 6.0f, 5), 40.0f);
                eq8 eq8VarA2 = dq8.a(ivVar, bv4.x, dd4Var5, 48);
                int iHashCode4 = Long.hashCode(dd4Var5.T);
                lr7 lr7VarL4 = dd4Var5.l();
                ou6 ou6VarL04 = s32.L0(dd4Var5, ou6VarH);
                ml1.k.getClass();
                um1 um1Var2 = ll1.b;
                dd4Var5.j0();
                if (dd4Var5.S) {
                    dd4Var5.k(um1Var2);
                } else {
                    dd4Var5.s0();
                }
                jm jmVar5 = ll1.f;
                un9.s(jmVar5, dd4Var5, eq8VarA2);
                jm jmVar6 = ll1.e;
                un9.s(jmVar6, dd4Var5, lr7VarL4);
                Integer numValueOf2 = Integer.valueOf(iHashCode4);
                jm jmVar7 = ll1.g;
                un9.s(jmVar7, dd4Var5, numValueOf2);
                kd kdVar2 = ll1.h;
                un9.r(dd4Var5, kdVar2);
                jm jmVar8 = ll1.d;
                un9.s(jmVar8, dd4Var5, ou6VarL04);
                nha.c(wn9.K((pv9) mu9.o0.getValue(), dd4Var5), xv5.f(1.0f, gjb.p0(lu6Var2, 12.0f, 0.0f, 0.0f, 0.0f, 14), true), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 1, 0, (kb4) null, s00.q(dd4Var5).g, dd4Var5, 0, 24576, 114684);
                if (((iib) br9Var.getValue()).a) {
                    dd4Var5.f0(302197261);
                    p35 p35VarC = i25.c((m53) f53.F.getValue(), dd4Var5, 0);
                    boolean zF = dd4Var5.f(mibVar);
                    Object objQ2 = dd4Var5.Q();
                    if (zF || objQ2 == obj4) {
                        b89Var = b89Var3;
                        objQ2 = new on6(mibVar, 1);
                        dd4Var5.p0(objQ2);
                    } else {
                        b89Var = b89Var3;
                    }
                    sw1.r(p35VarC, (ou6) null, 0L, (ib4) objQ2, dd4Var5, 0, 6);
                    dd4Var5.q(false);
                } else {
                    b89Var = b89Var3;
                    dd4Var5.f0(302383695);
                    dd4Var5.q(false);
                }
                dd4Var5.q(true);
                ou6 ou6VarQ = kc5.Q(qx1.z(gjb.p0(gjb.p0(yib.B(tg9.c, 9), 0.0f, 40.0f, 0.0f, 0.0f, 13), 0.0f, 12.0f, 0.0f, 0.0f, 13), xzb.a(dd4Var5), new tn8(2), dd4Var5, 0), kc5.J(dd4Var5), 14);
                vf0 vf0Var2 = bv4.z;
                ie1 ie1VarA2 = ge1.a(jvVar, vf0Var2, dd4Var5, 0);
                int iHashCode5 = Long.hashCode(dd4Var5.T);
                lr7 lr7VarL5 = dd4Var5.l();
                ou6 ou6VarL05 = s32.L0(dd4Var5, ou6VarQ);
                dd4Var5.j0();
                if (dd4Var5.S) {
                    dd4Var5.k(um1Var2);
                } else {
                    dd4Var5.s0();
                }
                un9.s(jmVar5, dd4Var5, ie1VarA2);
                un9.s(jmVar6, dd4Var5, lr7VarL5);
                ky0.v(iHashCode5, dd4Var5, jmVar7, dd4Var5, kdVar2);
                un9.s(jmVar8, dd4Var5, ou6VarL05);
                iib iibVar = (iib) br9Var.getValue();
                ou6 ou6VarL06 = gjb.l0(tg9.f(lu6Var2, 1.0f), 12.0f);
                boolean zF2 = dd4Var5.f(t27Var);
                Object objQ3 = dd4Var5.Q();
                if (zF2 || objQ3 == obj4) {
                    objQ3 = new y07(t27Var, 27);
                    dd4Var5.p0(objQ3);
                }
                ib4 ib4Var3 = (ib4) objQ3;
                boolean zF3 = dd4Var5.f(t27Var);
                Object objQ4 = dd4Var5.Q();
                if (zF3 || objQ4 == obj4) {
                    objQ4 = new y07(t27Var, 28);
                    dd4Var5.p0(objQ4);
                }
                ib4 ib4Var4 = (ib4) objQ4;
                boolean zF4 = dd4Var5.f(t27Var);
                Object objQ5 = dd4Var5.Q();
                if (zF4 || objQ5 == obj4) {
                    objQ5 = new y07(t27Var, 19);
                    dd4Var5.p0(objQ5);
                }
                m79.v(iibVar, ou6VarL06, ib4Var3, ib4Var4, (ib4) objQ5, dd4Var5, 48);
                ou6 ou6VarW = t96.w(gjb.n0(xv5.h(lu6Var2, 12.0f, dd4Var5, lu6Var2, 1.0f), 16.0f, 0.0f, 2), s00.p(dd4Var5).d);
                ie1 ie1VarA3 = ge1.a(jvVar, vf0Var2, dd4Var5, 0);
                int iHashCode6 = Long.hashCode(dd4Var5.T);
                lr7 lr7VarL6 = dd4Var5.l();
                ou6 ou6VarL07 = s32.L0(dd4Var5, ou6VarW);
                dd4Var5.j0();
                if (dd4Var5.S) {
                    dd4Var5.k(um1Var2);
                } else {
                    dd4Var5.s0();
                }
                un9.s(jmVar5, dd4Var5, ie1VarA3);
                un9.s(jmVar6, dd4Var5, lr7VarL6);
                ky0.v(iHashCode6, dd4Var5, jmVar7, dd4Var5, kdVar2);
                un9.s(jmVar8, dd4Var5, ou6VarL07);
                ou6 ou6VarG = tw2.g(dd4Var5, 1.0f, t96.w(lu6Var2, s00.p(dd4Var5).a), lp4Var, 16.0f);
                p35 p35VarC2 = i25.c((m53) f53.R.getValue(), dd4Var5, 0);
                String strK2 = wn9.K((pv9) ru9.n.getValue(), dd4Var5);
                String strK3 = wn9.K((pv9) ru9.y.getValue(), dd4Var5);
                boolean zF5 = dd4Var5.f(t27Var);
                Object objQ6 = dd4Var5.Q();
                if (zF5 || objQ6 == obj4) {
                    objQ6 = new y07(t27Var, 20);
                    dd4Var5.p0(objQ6);
                }
                e11.r(p35VarC2, strK2, strK3, ou6VarG, 0L, (ib4) objQ6, dd4Var5, 0);
                un9.a(dd4Var5, tg9.h(lu6Var2, 4.0f));
                ou6 ou6VarG2 = tw2.g(dd4Var5, 1.0f, t96.w(lu6Var2, s00.p(dd4Var5).a), lp4Var, 16.0f);
                p35 p35VarC3 = i25.c((m53) f53.y.getValue(), dd4Var5, 0);
                String strK4 = wn9.K((pv9) ru9.S.getValue(), dd4Var5);
                vl5 vl5Var = ((o79) br9Var2.getValue()).d;
                if (vl5Var == null || bw9.a0(vl5Var.b)) {
                    vl5Var = null;
                }
                if (vl5Var != null) {
                    dd4Var5.f0(-210007514);
                    Object objQ7 = dd4Var5.Q();
                    if (objQ7 == obj4) {
                        String strK5 = j39.k(vl5Var.b, '_', '-');
                        if (strK5.length() == 0 || strK5.equalsIgnoreCase("und")) {
                            strK5 = null;
                        }
                        if (strK5 == null) {
                            f36Var = null;
                        } else {
                            try {
                                pm8Var = new f36(tw1.n(strK5));
                            } catch (Throwable th) {
                                pm8Var = new pm8(th);
                            }
                            if (pm8Var instanceof pm8) {
                                pm8Var = null;
                            }
                            f36Var = (f36) pm8Var;
                        }
                        String strA = f36Var != null ? f36Var.a() : null;
                        dd4Var5.p0(strA);
                        objQ7 = strA;
                    }
                    z = false;
                    dd4Var5.q(false);
                    strK = (String) objQ7;
                    break;
                } else {
                    dd4Var5.f0(-210007515);
                    z = false;
                    dd4Var5.q(false);
                    strK = null;
                }
                if (strK == null) {
                    dd4Var5.f0(-6770765);
                    strK = wn9.K((pv9) iu9.e.getValue(), dd4Var5);
                } else {
                    dd4Var5.f0(-6776345);
                }
                dd4Var5.q(z);
                String str3 = strK;
                boolean zF6 = dd4Var5.f(t27Var);
                Object objQ8 = dd4Var5.Q();
                if (zF6 || objQ8 == obj4) {
                    objQ8 = new y07(t27Var, 21);
                    dd4Var5.p0(objQ8);
                }
                e11.r(p35VarC3, strK4, str3, ou6VarG2, 0L, (ib4) objQ8, dd4Var5, 0);
                xv5.z(dd4Var5, true, lu6Var2, 12.0f, dd4Var5);
                ou6 ou6VarW2 = t96.w(gjb.n0(tg9.f(lu6Var2, 1.0f), 16.0f, 0.0f, 2), s00.p(dd4Var5).d);
                ie1 ie1VarA4 = ge1.a(jvVar, vf0Var2, dd4Var5, 0);
                int iHashCode7 = Long.hashCode(dd4Var5.T);
                lr7 lr7VarL7 = dd4Var5.l();
                ou6 ou6VarL08 = s32.L0(dd4Var5, ou6VarW2);
                um1 um1Var3 = ll1.b;
                dd4Var5.j0();
                if (dd4Var5.S) {
                    dd4Var5.k(um1Var3);
                } else {
                    dd4Var5.s0();
                }
                jm jmVar9 = ll1.f;
                un9.s(jmVar9, dd4Var5, ie1VarA4);
                jm jmVar10 = ll1.e;
                un9.s(jmVar10, dd4Var5, lr7VarL7);
                Integer numValueOf3 = Integer.valueOf(iHashCode7);
                jm jmVar11 = ll1.g;
                un9.s(jmVar11, dd4Var5, numValueOf3);
                kd kdVar3 = ll1.h;
                un9.r(dd4Var5, kdVar3);
                jm jmVar12 = ll1.d;
                un9.s(jmVar12, dd4Var5, ou6VarL08);
                ou6 ou6VarG3 = tw2.g(dd4Var5, 1.0f, t96.w(lu6Var2, s00.p(dd4Var5).a), lp4Var, 16.0f);
                p35 p35VarC4 = i25.c((m53) h53.o.getValue(), dd4Var5, 0);
                String strK6 = wn9.K((pv9) ru9.f0.getValue(), dd4Var5);
                String strK7 = wn9.K((pv9) ru9.p0.getValue(), dd4Var5);
                boolean zF7 = dd4Var5.f(t27Var);
                Object objQ9 = dd4Var5.Q();
                if (zF7 || objQ9 == obj4) {
                    objQ9 = new y07(t27Var, 22);
                    dd4Var5.p0(objQ9);
                }
                e11.r(p35VarC4, strK6, strK7, ou6VarG3, 0L, (ib4) objQ9, dd4Var5, 0);
                un9.a(dd4Var5, tg9.h(lu6Var2, 4.0f));
                ou6 ou6VarG4 = tw2.g(dd4Var5, 1.0f, t96.w(lu6Var2, s00.p(dd4Var5).a), lp4Var, 16.0f);
                p35 p35VarC5 = i25.c((m53) f53.O.getValue(), dd4Var5, 0);
                String strK8 = wn9.K((pv9) ru9.T.getValue(), dd4Var5);
                String strK9 = wn9.K((pv9) ru9.W.getValue(), dd4Var5);
                boolean zF8 = dd4Var5.f(t27Var);
                Object objQ10 = dd4Var5.Q();
                if (zF8 || objQ10 == obj4) {
                    objQ10 = new y07(t27Var, 23);
                    dd4Var5.p0(objQ10);
                }
                e11.r(p35VarC5, strK8, strK9, ou6VarG4, 0L, (ib4) objQ10, dd4Var5, 0);
                un9.a(dd4Var5, tg9.h(lu6Var2, 4.0f));
                ou6 ou6VarG5 = tw2.g(dd4Var5, 1.0f, t96.w(lu6Var2, s00.p(dd4Var5).a), lp4Var, 16.0f);
                p35 p35VarC6 = i25.c((m53) a53.G.getValue(), dd4Var5, 0);
                String strK10 = wn9.K((pv9) vu9.l.getValue(), dd4Var5);
                String strK11 = wn9.K((pv9) vu9.m.getValue(), dd4Var5);
                boolean zF9 = dd4Var5.f(t27Var);
                Object objQ11 = dd4Var5.Q();
                if (zF9 || objQ11 == obj4) {
                    objQ11 = new y07(t27Var, 24);
                    dd4Var5.p0(objQ11);
                }
                e11.r(p35VarC6, strK10, strK11, ou6VarG5, 0L, (ib4) objQ11, dd4Var5, 0);
                un9.a(dd4Var5, tg9.h(lu6Var2, 4.0f));
                ou6 ou6VarG6 = tw2.g(dd4Var5, 1.0f, t96.w(lu6Var2, s00.p(dd4Var5).a), lp4Var, 16.0f);
                p35 p35VarC7 = i25.c((m53) a53.V.getValue(), dd4Var5, 0);
                String strK12 = wn9.K((pv9) ru9.O.getValue(), dd4Var5);
                String strK13 = wn9.K((pv9) ru9.P.getValue(), dd4Var5);
                boolean zF10 = dd4Var5.f(t27Var);
                Object objQ12 = dd4Var5.Q();
                if (zF10 || objQ12 == obj4) {
                    objQ12 = new y07(t27Var, 25);
                    dd4Var5.p0(objQ12);
                }
                e11.r(p35VarC7, strK12, strK13, ou6VarG6, 0L, (ib4) objQ12, dd4Var5, 0);
                un9.a(dd4Var5, tg9.h(lu6Var2, 4.0f));
                ou6 ou6VarG7 = tw2.g(dd4Var5, 1.0f, t96.w(lu6Var2, s00.p(dd4Var5).a), lp4Var, 16.0f);
                p35 p35VarC8 = i25.c((m53) a53.y.getValue(), dd4Var5, 0);
                String strK14 = wn9.K((pv9) vu9.p.getValue(), dd4Var5);
                String strK15 = wn9.K((pv9) vu9.u.getValue(), dd4Var5);
                boolean zF11 = dd4Var5.f(t27Var);
                Object objQ13 = dd4Var5.Q();
                if (zF11 || objQ13 == obj4) {
                    objQ13 = new y07(t27Var, 26);
                    dd4Var5.p0(objQ13);
                }
                e11.r(p35VarC8, strK14, strK15, ou6VarG7, 0L, (ib4) objQ13, dd4Var5, 0);
                xv5.z(dd4Var5, true, lu6Var2, 12.0f, dd4Var5);
                ou6 ou6VarW3 = t96.w(gjb.n0(tg9.f(lu6Var2, 1.0f), 16.0f, 0.0f, 2), s00.p(dd4Var5).d);
                ie1 ie1VarA5 = ge1.a(jvVar, vf0Var2, dd4Var5, 0);
                Object obj10 = obj4;
                int iHashCode8 = Long.hashCode(dd4Var5.T);
                lr7 lr7VarL8 = dd4Var5.l();
                ou6 ou6VarL09 = s32.L0(dd4Var5, ou6VarW3);
                dd4Var5.j0();
                if (dd4Var5.S) {
                    dd4Var5.k(um1Var3);
                } else {
                    dd4Var5.s0();
                }
                un9.s(jmVar9, dd4Var5, ie1VarA5);
                un9.s(jmVar10, dd4Var5, lr7VarL8);
                ky0.v(iHashCode8, dd4Var5, jmVar11, dd4Var5, kdVar3);
                un9.s(jmVar12, dd4Var5, ou6VarL09);
                ou6 ou6VarG8 = tw2.g(dd4Var5, 1.0f, t96.w(lu6Var2, s00.p(dd4Var5).a), lp4Var, 16.0f);
                p35 p35VarC9 = i25.c((m53) f53.h.getValue(), dd4Var5, 0);
                String strK16 = wn9.K((pv9) ru9.Q.getValue(), dd4Var5);
                String strK17 = wn9.K((pv9) ru9.R.getValue(), dd4Var5);
                Object objQ14 = dd4Var5.Q();
                if (objQ14 == obj10) {
                    objQ14 = new dh1(1);
                    dd4Var5.p0(objQ14);
                }
                e11.r(p35VarC9, strK16, strK17, ou6VarG8, 0L, (ib4) objQ14, dd4Var5, 196608);
                un9.a(dd4Var5, tg9.h(lu6Var2, 4.0f));
                ou6 ou6VarG9 = tw2.g(dd4Var5, 1.0f, t96.w(lu6Var2, s00.p(dd4Var5).a), lp4Var, 16.0f);
                p35 p35VarC10 = i25.c((m53) a53.r.getValue(), dd4Var5, 0);
                String strK18 = wn9.K((pv9) vu9.d.getValue(), dd4Var5);
                String strK19 = wn9.K((pv9) vu9.e.getValue(), dd4Var5);
                Object objQ15 = dd4Var5.Q();
                if (objQ15 == obj10) {
                    z2 = true;
                    objQ15 = new dh1(1);
                    dd4Var5.p0(objQ15);
                } else {
                    z2 = true;
                }
                e11.r(p35VarC10, strK18, strK19, ou6VarG9, 0L, (ib4) objQ15, dd4Var5, 196608);
                dd4Var5.q(z2);
                if (((o79) br9Var2.getValue()).a) {
                    ky0.z(dd4Var5, -1259830318, lu6Var2, 12.0f, dd4Var5);
                    ou6 ou6VarW4 = t96.w(gjb.n0(tg9.f(lu6Var2, 1.0f), 16.0f, 0.0f, 2), s00.p(dd4Var5).d);
                    vf0Var = vf0Var2;
                    ie1 ie1VarA6 = ge1.a(jvVar, vf0Var, dd4Var5, 0);
                    int iHashCode9 = Long.hashCode(dd4Var5.T);
                    lr7 lr7VarL9 = dd4Var5.l();
                    ou6 ou6VarL010 = s32.L0(dd4Var5, ou6VarW4);
                    dd4Var5.j0();
                    if (dd4Var5.S) {
                        dd4Var5.k(um1Var3);
                    } else {
                        dd4Var5.s0();
                    }
                    un9.s(jmVar9, dd4Var5, ie1VarA6);
                    un9.s(jmVar10, dd4Var5, lr7VarL9);
                    ky0.v(iHashCode9, dd4Var5, jmVar11, dd4Var5, kdVar3);
                    un9.s(jmVar12, dd4Var5, ou6VarL010);
                    ou6 ou6VarG10 = tw2.g(dd4Var5, 1.0f, t96.w(lu6Var2, s00.p(dd4Var5).a), lp4Var, 16.0f);
                    p35 p35VarC11 = i25.c((m53) a53.z.getValue(), dd4Var5, 0);
                    String strK20 = wn9.K((pv9) zt9.q0.getValue(), dd4Var5);
                    dd4Var5.f0(167534416);
                    String strK21 = ((o79) br9Var2.getValue()).c;
                    if (strK21.length() == 0) {
                        strK21 = wn9.K((pv9) zt9.t0.getValue(), dd4Var5);
                    }
                    String str4 = strK21;
                    dd4Var5.q(false);
                    boolean z3 = ((o79) br9Var2.getValue()).b;
                    b89Var2 = b89Var;
                    boolean zF12 = dd4Var5.f(b89Var2);
                    Object objQ16 = dd4Var5.Q();
                    if (zF12) {
                        obj10 = obj10;
                    } else {
                        obj10 = obj10;
                        if (objQ16 == obj10) {
                        }
                        e11.x(p35VarC11, strK20, str4, ou6VarG10, false, z3, (kb4) objQ16, dd4Var5, 0, 16);
                        dd4Var5.q(true);
                        i2 = 0;
                        dd4Var5.q(false);
                    }
                    objQ16 = new hy7(b89Var2, 20);
                    dd4Var5.p0(objQ16);
                    e11.x(p35VarC11, strK20, str4, ou6VarG10, false, z3, (kb4) objQ16, dd4Var5, 0, 16);
                    dd4Var5.q(true);
                    i2 = 0;
                    dd4Var5.q(false);
                } else {
                    vf0Var = vf0Var2;
                    b89Var2 = b89Var;
                    i2 = 0;
                    dd4Var5.f0(-1258801087);
                    dd4Var5.q(false);
                }
                un9.a(dd4Var5, tg9.h(lu6Var2, 12.0f));
                Object objQ17 = dd4Var5.Q();
                if (objQ17 == obj10) {
                    objQ17 = dk9.x(Integer.valueOf(i2));
                    dd4Var5.p0(objQ17);
                }
                a07 a07Var2 = (a07) objQ17;
                Object objQ18 = dd4Var5.Q();
                if (objQ18 == obj10) {
                    objQ18 = dk9.x(0L);
                    dd4Var5.p0(objQ18);
                }
                a07 a07Var3 = (a07) objQ18;
                lva lvaVar = (lva) dd4Var5.j(nva.a);
                m8 m8Var = (m8) dd4Var5.j(a9.a);
                Object objQ19 = dd4Var5.Q();
                if (objQ19 == obj10) {
                    objQ19 = lc5.Z(dd4Var5);
                    dd4Var5.p0(objQ19);
                }
                vx1 vx1Var = (vx1) objQ19;
                ou6 ou6VarW5 = t96.w(tg9.f(lu6Var2, 1.0f), s00.p(dd4Var5).d);
                ie1 ie1VarA7 = ge1.a(jvVar, vf0Var, dd4Var5, 0);
                int iHashCode10 = Long.hashCode(dd4Var5.T);
                lr7 lr7VarL10 = dd4Var5.l();
                ou6 ou6VarL011 = s32.L0(dd4Var5, ou6VarW5);
                dd4Var5.j0();
                if (dd4Var5.S) {
                    dd4Var5.k(um1Var3);
                } else {
                    dd4Var5.s0();
                }
                un9.s(jmVar9, dd4Var5, ie1VarA7);
                un9.s(jmVar10, dd4Var5, lr7VarL10);
                ky0.v(iHashCode10, dd4Var5, jmVar11, dd4Var5, kdVar3);
                un9.s(jmVar12, dd4Var5, ou6VarL011);
                pv9 pv9Var = (pv9) vu9.f0.getValue();
                Object value = ((wb) pu.a.getValue()).b.getValue();
                value.getClass();
                String str5 = ((PackageInfo) value).versionName;
                if (str5 == null) {
                    str5 = "";
                }
                String strL = wn9.L(pv9Var, new Object[]{str5}, dd4Var5);
                uka ukaVar = s00.q(dd4Var5).j;
                boolean z4 = !((o79) br9Var2.getValue()).a;
                boolean zF13 = dd4Var5.f(b89Var2) | dd4Var5.h(vx1Var) | dd4Var5.f(m8Var) | dd4Var5.f(lvaVar);
                Object objQ20 = dd4Var5.Q();
                if (zF13 || objQ20 == obj10) {
                    objQ20 = new c51(b89Var2, vx1Var, a07Var3, a07Var2, m8Var, lvaVar);
                    dd4Var5.p0(objQ20);
                }
                nha.c(strL, gjb.l0(yn2.V(0, (ib4) objQ20, dd4Var5, lu6Var2, z4), 16.0f).e(new xo4(bv4.A)), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var5, 0, 0, 131068);
                xv5.z(dd4Var5, true, lu6Var2, 12.0f, dd4Var5);
                dd4Var5.f0(-1256491711);
                dd4Var5.q(false);
                dd4Var5.q(true);
                return hebVar;
            case 4:
                return a(obj, obj2, obj3);
            case 5:
                return b(obj, obj2, obj3);
            case 6:
                return d(obj, obj2, obj3);
            case 7:
                return f(obj, obj2, obj3);
            case 8:
                return i(obj, obj2, obj3);
            case 9:
                xga xgaVar = (xga) obj9;
                kb4 kb4Var3 = (kb4) obj8;
                kb4 kb4Var4 = (kb4) obj7;
                kb4 kb4Var5 = (kb4) obj6;
                ib4 ib4Var5 = (ib4) obj5;
                dd4 dd4Var6 = (dd4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (dd4Var6.V(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    t1c.H(xgaVar, yib.w(yib.d(14, dd4Var6, false), gjb.q(0.0f, 0.0f, 0.0f, 72.0f, 7)), null, kb4Var3, kb4Var4, kb4Var5, ib4Var5, dd4Var6, 0);
                } else {
                    dd4Var6.Y();
                }
                return hebVar;
            case 10:
                return l(obj, obj2, obj3);
            case 11:
                return m(obj, obj2, obj3);
            default:
                vx1 vx1Var2 = (vx1) obj9;
                wq5 wq5Var2 = (wq5) obj8;
                br9 br9Var3 = (br9) obj7;
                a07 a07Var4 = (a07) obj6;
                br9 br9Var4 = (br9) obj5;
                dd4 dd4Var7 = (dd4) obj2;
                ((Integer) obj3).getClass();
                ((co) obj).getClass();
                ie1 ie1VarA8 = ge1.a(new mv(8.0f, true, new gp(5)), bv4.B, dd4Var7, 54);
                int iHashCode11 = Long.hashCode(dd4Var7.T);
                lr7 lr7VarL11 = dd4Var7.l();
                ou6 ou6VarL012 = s32.L0(dd4Var7, lu6Var);
                ml1.k.getClass();
                um1 um1Var4 = ll1.b;
                dd4Var7.j0();
                if (dd4Var7.S) {
                    dd4Var7.k(um1Var4);
                } else {
                    dd4Var7.s0();
                }
                un9.s(ll1.f, dd4Var7, ie1VarA8);
                un9.s(ll1.e, dd4Var7, lr7VarL11);
                un9.s(ll1.g, dd4Var7, Integer.valueOf(iHashCode11));
                un9.r(dd4Var7, ll1.h);
                un9.s(ll1.d, dd4Var7, ou6VarL012);
                if (((Boolean) br9Var3.getValue()).booleanValue()) {
                    dd4Var7.f0(869153751);
                    ou6 ou6VarN2 = tg9.n(lu6Var, 40.0f);
                    rp8 rp8Var = tp8.a;
                    boolean zH2 = dd4Var7.h(vx1Var2) | dd4Var7.f(wq5Var2);
                    Object objQ21 = dd4Var7.Q();
                    if (zH2 || objQ21 == obj4) {
                        objQ21 = new na3(vx1Var2, a07Var4, wq5Var2);
                        dd4Var7.p0(objQ21);
                    }
                    ww1.g((ib4) objQ21, ou6VarN2, rp8Var, 0L, 0L, null, ah1.A, dd4Var7, 12582960, 120);
                    dd4Var = dd4Var7;
                    dd4Var.q(false);
                } else {
                    dd4Var = dd4Var7;
                    dd4Var.f0(869722384);
                    dd4Var.q(false);
                }
                if (((Boolean) br9Var4.getValue()).booleanValue()) {
                    dd4Var.f0(869809153);
                    ou6 ou6VarN3 = tg9.n(lu6Var, 40.0f);
                    rp8 rp8Var2 = tp8.a;
                    boolean zH3 = dd4Var.h(vx1Var2) | dd4Var.f(wq5Var2);
                    Object objQ22 = dd4Var.Q();
                    if (zH3 || objQ22 == obj4) {
                        objQ22 = new na3(a07Var4, vx1Var2, wq5Var2);
                        dd4Var.p0(objQ22);
                    }
                    ww1.g((ib4) objQ22, ou6VarN3, rp8Var2, 0L, 0L, null, ah1.B, dd4Var, 12582960, 120);
                    dd4Var.q(false);
                } else {
                    dd4Var.f0(870398928);
                    dd4Var.q(false);
                }
                dd4Var.q(true);
                return hebVar;
        }
    }

    public /* synthetic */ sz0(t61 t61Var, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4) {
        this.a = 4;
        this.c = t61Var;
        this.b = ib4Var;
        this.d = ib4Var2;
        this.e = ib4Var3;
        this.f = ib4Var4;
    }

    public /* synthetic */ sz0(lz5 lz5Var, wq5 wq5Var, pj7 pj7Var, pj7 pj7Var2, kb4 kb4Var) {
        this.a = 2;
        this.d = lz5Var;
        this.e = wq5Var;
        this.c = pj7Var;
        this.f = pj7Var2;
        this.b = kb4Var;
    }

    public /* synthetic */ sz0(a07 a07Var, a07 a07Var2, a07 a07Var3, Object obj, Object obj2, int i) {
        this.a = i;
        this.f = a07Var;
        this.c = a07Var2;
        this.d = a07Var3;
        this.e = obj;
        this.b = obj2;
    }

    public /* synthetic */ sz0(br9 br9Var, a07 a07Var, a07 a07Var2, aw3 aw3Var, t27 t27Var) {
        this.a = 8;
        this.c = br9Var;
        this.f = a07Var;
        this.d = a07Var2;
        this.e = aw3Var;
        this.b = t27Var;
    }

    public /* synthetic */ sz0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = obj5;
    }

    public /* synthetic */ sz0(String str, kb4 kb4Var, ib4 ib4Var, bi5 bi5Var, String str2) {
        this.a = 1;
        this.c = str;
        this.d = kb4Var;
        this.b = ib4Var;
        this.e = bi5Var;
        this.f = str2;
    }

    public /* synthetic */ sz0(String str, List list, kb4 kb4Var, ib4 ib4Var, List list2) {
        this.a = 10;
        this.c = str;
        this.e = list;
        this.d = kb4Var;
        this.b = ib4Var;
        this.f = list2;
    }
}
