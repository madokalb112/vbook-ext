package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class c41 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c41(kb4 kb4Var, kb4 kb4Var2, a07 a07Var) {
        this.a = 12;
        this.d = a07Var;
        this.b = kb4Var;
        this.c = kb4Var2;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        a07 a07Var = (a07) this.d;
        a07 a07Var2 = (a07) this.c;
        String str = (String) this.b;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ke1) obj).getClass();
        if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
            int length = ((String) a07Var2.getValue()).length();
            lu6 lu6Var = lu6.a;
            Object obj4 = vl1.a;
            jv jvVar = pv.c;
            if (length > 0) {
                dd4Var.f0(-1474906301);
                ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                ur9 ur9Var = s96.a;
                ou6 ou6VarL = fe.L(t96.w(ou6VarF, ((q96) dd4Var.j(ur9Var)).c.c), dd1.g(((q96) dd4Var.j(ur9Var)).a, 6.0f), jf0.G);
                boolean zF = dd4Var.f(a07Var);
                Object objQ = dd4Var.Q();
                if (zF || objQ == obj4) {
                    objQ = new zl3(a07Var, 4);
                    dd4Var.p0(objQ);
                }
                ou6 ou6VarL0 = gjb.l0(fw.J(null, (ib4) objQ, ou6VarL, false, 15), 14.0f);
                ie1 ie1VarA = ge1.a(jvVar, bv4.z, dd4Var, 0);
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
                nha.c((String) a07Var2.getValue(), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 4, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.j, dd4Var, 0, 24960, 110590);
                un9.a(dd4Var, tg9.h(lu6Var, 8.0f));
                nha.c(str, (ou6) null, lc1.c(0.5f, ((q96) dd4Var.j(ur9Var)).a.q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 1, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.l, dd4Var, 0, 24960, 110586);
                dd4Var.q(true);
                dd4Var.q(false);
            } else {
                dd4Var.f0(-1473947688);
                ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
                ie1 ie1VarA2 = ge1.a(jvVar, bv4.A, dd4Var, 48);
                int iHashCode2 = Long.hashCode(dd4Var.T);
                lr7 lr7VarL2 = dd4Var.l();
                ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarF2);
                ml1.k.getClass();
                um1 um1Var2 = ll1.b;
                dd4Var.j0();
                if (dd4Var.S) {
                    dd4Var.k(um1Var2);
                } else {
                    dd4Var.s0();
                }
                un9.s(ll1.f, dd4Var, ie1VarA2);
                un9.s(ll1.e, dd4Var, lr7VarL2);
                un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode2));
                un9.r(dd4Var, ll1.h);
                un9.s(ll1.d, dd4Var, ou6VarL03);
                String strK = wn9.K((pv9) eu9.y0.getValue(), dd4Var);
                ur9 ur9Var2 = s96.a;
                nha.c(strK, (ou6) null, lc1.c(0.8f, ((q96) dd4Var.j(ur9Var2)).a.q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var2)).b.j, dd4Var, 0, 0, 130042);
                un9.a(dd4Var, tg9.h(lu6Var, 8.0f));
                p35 p35VarC = i25.c((m53) a53.a.getValue(), dd4Var, 0);
                String strK2 = wn9.K((pv9) vt9.f.getValue(), dd4Var);
                boolean zF2 = dd4Var.f(a07Var);
                Object objQ2 = dd4Var.Q();
                if (zF2 || objQ2 == obj4) {
                    objQ2 = new zl3(a07Var, 5);
                    dd4Var.p0(objQ2);
                }
                kc5.n(p35VarC, strK2, false, null, null, null, null, null, (ib4) objQ2, dd4Var, 0, 252);
                dd4Var.q(true);
                dd4Var.q(false);
            }
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        fn3 fn3Var = (fn3) this.c;
        yn3 yn3Var = (yn3) this.b;
        br9 br9Var = (br9) this.d;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((dr5) obj).getClass();
        if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
            gn3 gn3Var = ((tn3) br9Var.getValue()).c;
            ou6 ou6VarF = tg9.f(lu6.a, 1.0f);
            boolean zF = dd4Var.f(yn3Var);
            Object objQ = dd4Var.Q();
            fu6 fu6Var = vl1.a;
            if (zF || objQ == fu6Var) {
                qd2 qd2Var = new qd2(1, yn3Var, yn3.class, "changeConnectionThread", "changeConnectionThread(I)V", 0, 12);
                dd4Var.p0(qd2Var);
                objQ = qd2Var;
            }
            kb4 kb4Var = (kb4) ((ei5) objQ);
            boolean zF2 = dd4Var.f(yn3Var);
            Object objQ2 = dd4Var.Q();
            if (zF2 || objQ2 == fu6Var) {
                objQ2 = new qd2(1, yn3Var, yn3.class, "changeConnectionDelay", "changeConnectionDelay(I)V", 0, 13);
                dd4Var.p0(objQ2);
            }
            kb4 kb4Var2 = (kb4) ((ei5) objQ2);
            boolean zF3 = dd4Var.f(yn3Var);
            Object objQ3 = dd4Var.Q();
            if (zF3 || objQ3 == fu6Var) {
                qd2 qd2Var2 = new qd2(1, yn3Var, yn3.class, "onChangeIgnore", "onChangeIgnore(Z)V", 0, 14);
                dd4Var.p0(qd2Var2);
                objQ3 = qd2Var2;
            }
            t1c.o(gn3Var, fn3Var, ou6VarF, kb4Var, kb4Var2, (kb4) ((ei5) objQ3), dd4Var, 384);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        cr3 cr3Var = (cr3) this.c;
        yn3 yn3Var = (yn3) this.b;
        br9 br9Var = (br9) this.d;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((dr5) obj).getClass();
        if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
            dr3 dr3Var = ((tn3) br9Var.getValue()).e;
            ou6 ou6VarF = tg9.f(lu6.a, 1.0f);
            boolean zF = dd4Var.f(yn3Var);
            Object objQ = dd4Var.Q();
            if (zF || objQ == vl1.a) {
                r51 r51Var = new r51(2, yn3Var, yn3.class, "changeSetting", "changeSetting(Ljava/lang/String;Ljava/lang/String;)V", 0, 3);
                dd4Var.p0(r51Var);
                objQ = r51Var;
            }
            t1c.n(dr3Var, cr3Var, ou6VarF, (yb4) ((ei5) objQ), dd4Var, 448);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        g78 g78Var = (g78) this.c;
        v54 v54Var = (v54) this.b;
        pj7 pj7Var = (pj7) this.d;
        yn0 yn0Var = (yn0) obj;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        yn0Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= dd4Var.f(yn0Var) ? 4 : 2;
        }
        if (dd4Var.V(iIntValue & 1, (iIntValue & 19) != 18)) {
            w68.a.b(g78Var, v54Var.c, gjb.p0(yn0Var.a(lu6.a, bv4.c), 0.0f, pj7Var.d() + 44.0f, 0.0f, 0.0f, 13), 0L, 0L, 0.0f, dd4Var, 0);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        fxb fxbVar = (fxb) this.c;
        kb4 kb4Var = (kb4) this.b;
        kb4 kb4Var2 = (kb4) this.d;
        dd4 dd4Var = (dd4) obj2;
        ((Integer) obj3).getClass();
        ((co) obj).getClass();
        pj4 pj4VarA = e36.a(dd4Var);
        jt1 jt1Var = null;
        if (pj4VarA == null) {
            gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            return null;
        }
        mq0 mq0Var = (mq0) ((qtb) qx1.N(ug8.a(mq0.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
        a07 a07VarB = bx1.B(mq0Var.e, dd4Var);
        uk9 uk9Var = (uk9) dd4Var.j(xm1.q);
        Object objQ = dd4Var.Q();
        Object obj4 = vl1.a;
        if (objQ == obj4) {
            objQ = ky0.f(dd4Var);
        }
        z44 z44Var = (z44) objQ;
        Object objQ2 = dd4Var.Q();
        int i = 0;
        if (objQ2 == obj4) {
            String strD = fxbVar.d();
            if (strD == null) {
                strD = "";
            }
            objQ2 = dk9.x(new wga(new bp(strD), zk9.h(0, strD.length()), (pja) null));
            dd4Var.p0(objQ2);
        }
        a07 a07Var = (a07) objQ2;
        String str = ((wga) a07Var.getValue()).a.b;
        boolean zF = dd4Var.f(mq0Var);
        Object objQ3 = dd4Var.Q();
        if (zF || objQ3 == obj4) {
            objQ3 = new pg(mq0Var, a07Var, jt1Var, 19);
            dd4Var.p0(objQ3);
        }
        lc5.u((yb4) objQ3, dd4Var, str);
        boolean zF2 = dd4Var.f(uk9Var);
        Object objQ4 = dd4Var.Q();
        if (zF2 || objQ4 == obj4) {
            objQ4 = new n85(z44Var, uk9Var, jt1Var, i);
            dd4Var.p0(objQ4);
        }
        lc5.u((yb4) objQ4, dd4Var, z44Var);
        tw1.m(0L, null, jf0.G(1064190439, new m85(kb4Var, a07VarB, kb4Var2, z44Var, uk9Var, a07Var), dd4Var), dd4Var, 384, 3);
        return heb.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        g78 g78Var = (g78) this.c;
        lz5 lz5Var = (lz5) this.b;
        pj7 pj7Var = (pj7) this.d;
        yn0 yn0Var = (yn0) obj;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        yn0Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= dd4Var.f(yn0Var) ? 4 : 2;
        }
        if (dd4Var.V(iIntValue & 1, (iIntValue & 19) != 18)) {
            w68.a.b(g78Var, lz5Var.b, gjb.p0(yn0Var.a(lu6.a, bv4.c), 0.0f, pj7Var.d(), 0.0f, 0.0f, 13), 0L, 0L, 0.0f, dd4Var, 0);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        a07 a07Var = (a07) this.d;
        a07 a07Var2 = (a07) this.c;
        a07 a07Var3 = (a07) this.b;
        Boolean bool = (Boolean) obj;
        bool.getClass();
        Boolean bool2 = (Boolean) obj2;
        bool2.getClass();
        Boolean bool3 = (Boolean) obj3;
        bool3.getClass();
        a07Var.setValue(bool);
        a07Var2.setValue(bool2);
        a07Var3.setValue(bool3);
        return heb.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        Object obj4;
        List list = (List) this.c;
        ib4 ib4Var = (ib4) this.d;
        kb4 kb4Var = (kb4) this.b;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c44) obj).getClass();
        if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
            dd4Var.f0(1780528284);
            int size = list.size();
            int i = 0;
            while (true) {
                obj4 = vl1.a;
                if (i >= size) {
                    break;
                }
                oz0 oz0Var = (oz0) list.get(i);
                String str = oz0Var.b;
                boolean zF = dd4Var.f(kb4Var) | dd4Var.h(oz0Var);
                Object objQ = dd4Var.Q();
                if (zF || objQ == obj4) {
                    objQ = new vf6(20, kb4Var, oz0Var);
                    dd4Var.p0(objQ);
                }
                fz1.C(48, (ib4) objQ, dd4Var, null, null, null, str, false);
                i++;
            }
            dd4Var.q(false);
            rj1 rj1Var = yb0.o;
            boolean zF2 = dd4Var.f(ib4Var);
            Object objQ2 = dd4Var.Q();
            if (zF2 || objQ2 == obj4) {
                objQ2 = new pm6(21, ib4Var);
                dd4Var.p0(objQ2);
            }
            fz1.D(rj1Var, false, null, null, (ib4) objQ2, dd4Var, 54, 12);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        bc9 bc9Var = (bc9) this.c;
        a07 a07Var = (a07) this.d;
        kb4 kb4Var = (kb4) this.b;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ke1) obj).getClass();
        if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
            boolean zD = dd4Var.d(bc9Var.a);
            Object objQ = dd4Var.Q();
            fu6 fu6Var = vl1.a;
            if (zD || objQ == fu6Var) {
                int i = bc9Var.a;
                bb1 bb1Var = (i == 0 || i == 1) ? new bb1(80.0f, 200.0f) : i != 2 ? i != 3 ? new bb1(80.0f, 200.0f) : new bb1(150.0f, 400.0f) : new bb1(180.0f, 400.0f);
                objQ = bb1Var;
                dd4Var.p0(objQ);
            }
            bb1 bb1Var2 = (bb1) objQ;
            float fFloatValue = ((Number) a07Var.getValue()).floatValue();
            ou6 ou6VarF = tg9.f(lu6.a, 1.0f);
            boolean zF = dd4Var.f(a07Var);
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == fu6Var) {
                objQ2 = new wo6(a07Var, 4);
                dd4Var.p0(objQ2);
            }
            kb4 kb4Var2 = (kb4) objQ2;
            boolean zF2 = dd4Var.f(kb4Var) | dd4Var.f(a07Var);
            Object objQ3 = dd4Var.Q();
            if (zF2 || objQ3 == fu6Var) {
                objQ3 = new l50(10, kb4Var, a07Var);
                dd4Var.p0(objQ3);
            }
            yb0.u(fFloatValue, kb4Var2, ou6VarF, false, (ib4) objQ3, null, null, 0, null, null, bb1Var2, dd4Var, 384, 0, 1000);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        yba ybaVar = (yba) this.c;
        kb4 kb4Var = (kb4) this.b;
        ib4 ib4Var = (ib4) this.d;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((dr5) obj).getClass();
        if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
            gjb.g(ybaVar.i, ybaVar.h, gjb.m0(tg9.f(lu6.a, 1.0f), 12.0f, 8.0f), kb4Var, ib4Var, dd4Var, 0);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object q(Object obj, Object obj2, Object obj3) {
        yba ybaVar = (yba) this.c;
        kb4 kb4Var = (kb4) this.b;
        kb4 kb4Var2 = (kb4) this.d;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((dr5) obj).getClass();
        if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
            gjb.F(ybaVar.j, ybaVar.n, tg9.f(lu6.a, 1.0f), kb4Var, kb4Var2, dd4Var, 384);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object r(Object obj, Object obj2, Object obj3) {
        o8a o8aVar = (o8a) this.c;
        String str = (String) this.b;
        String str2 = (String) this.d;
        dd4 dd4Var = (dd4) obj2;
        ((Integer) obj3).getClass();
        ((je1) obj).getClass();
        yn9.b(str, (mf4) null, new tka(o8aVar.c, new spa(wn9.x(14)), new z74(), 120), 1, dd4Var, 3072);
        tn9.a(xg9.i(kf4.a, 2.0f), dd4Var, 0);
        yn9.b(str2, (mf4) null, new tka(o8aVar.d, new spa(wn9.x(12)), (z74) null, Token.IMPORT), 1, dd4Var, 3072);
        return heb.a;
    }

    private final Object s(Object obj, Object obj2, Object obj3) {
        z87 z87Var = (z87) this.c;
        kb4 kb4Var = (kb4) this.b;
        kb4 kb4Var2 = (kb4) this.d;
        dd4 dd4Var = (dd4) obj2;
        ((Integer) obj3).getClass();
        ((co) obj).getClass();
        lu6 lu6Var = lu6.a;
        ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
        ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
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
        un9.s(ll1.f, dd4Var, ie1VarA);
        un9.s(ll1.e, dd4Var, lr7VarL);
        un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
        un9.r(dd4Var, ll1.h);
        un9.s(ll1.d, dd4Var, ou6VarL0);
        un9.a(dd4Var, tg9.h(lu6Var, 4.0f));
        ur9 ur9Var = s96.a;
        ou6 ou6VarW = t96.w(lu6Var, ((q96) dd4Var.j(ur9Var)).c.a);
        long jG = dd1.g(((q96) dd4Var.j(ur9Var)).a, 1.0f);
        lp4 lp4Var = jf0.G;
        e11.t(wn9.K((pv9) ru9.d0.getValue(), dd4Var), wm9.r((hv9) rv.l.getValue(), dd4Var), z87Var.e, gjb.l0(fe.L(ou6VarW, jG, lp4Var), 16.0f), kb4Var, dd4Var, 0);
        un9.a(dd4Var, tg9.h(lu6Var, 4.0f));
        e11.t(wn9.K((pv9) ru9.e0.getValue(), dd4Var), wm9.r((hv9) rv.m.getValue(), dd4Var), z87Var.f, gjb.l0(fe.L(t96.w(lu6Var, ((q96) dd4Var.j(ur9Var)).c.a), dd1.g(((q96) dd4Var.j(ur9Var)).a, 1.0f), lp4Var), 16.0f), kb4Var2, dd4Var, 0);
        dd4Var.q(true);
        return heb.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02b6  */
    @Override // defpackage.zb4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r49, java.lang.Object r50, java.lang.Object r51) {
        /*
            Method dump skipped, instruction units count: 3288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c41.c(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ c41(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    public /* synthetic */ c41(int i, a07 a07Var, Object obj, Object obj2) {
        this.a = i;
        this.d = a07Var;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ c41(Object obj, Object obj2, kb4 kb4Var, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = kb4Var;
    }
}
