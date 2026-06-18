package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ak0 implements ac4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ak0(a07 a07Var, pp3 pp3Var, a07 a07Var2) {
        this.a = 5;
        this.c = a07Var;
        this.b = pp3Var;
        this.d = a07Var2;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        hz0 hz0Var = (hz0) this.b;
        ez0 ez0Var = (ez0) this.c;
        rj1 rj1Var = (rj1) this.d;
        Integer num = (Integer) obj2;
        int iIntValue = num.intValue();
        dd4 dd4Var = (dd4) obj3;
        int iIntValue2 = ((Integer) obj4).intValue();
        Object objQ = dd4Var.Q();
        Object obj5 = vl1.a;
        if (objQ == obj5) {
            objQ = new sy0();
            dd4Var.p0(objQ);
        }
        sy0 sy0Var = (sy0) objQ;
        Object objQ2 = dd4Var.Q();
        if (objQ2 == obj5) {
            objQ2 = new ty0(sy0Var);
            dd4Var.p0(objQ2);
        }
        ty0 ty0Var = (ty0) objQ2;
        Object objQ3 = dd4Var.Q();
        if (objQ3 == obj5) {
            objQ3 = new az0(sy0Var);
            dd4Var.p0(objQ3);
        }
        az0 az0Var = (az0) objQ3;
        boolean zF = dd4Var.f(ez0Var);
        Object objQ4 = dd4Var.Q();
        if (zF || objQ4 == obj5) {
            objQ4 = new ub(ez0Var, 18);
            dd4Var.p0(objQ4);
        }
        ou6 ou6VarZ = kl8.Z(lu6.a, new xy0((ib4) objQ4, hz0Var, iIntValue, sy0Var, az0Var));
        ha6 ha6VarD = pn0.d(bv4.b, false);
        int iHashCode = Long.hashCode(dd4Var.T);
        lr7 lr7VarL = dd4Var.l();
        ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarZ);
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
        rj1Var.g(ty0Var, num, dd4Var, Integer.valueOf(iIntValue2 & Token.ASSIGN_MOD));
        dd4Var.q(true);
        return heb.a;
    }

    private final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        final za3 za3Var = (za3) this.b;
        br9 br9Var = (br9) this.d;
        a07 a07Var = (a07) this.c;
        yn0 yn0Var = (yn0) obj;
        pj7 pj7Var = (pj7) obj2;
        dd4 dd4Var = (dd4) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        yn0Var.getClass();
        pj7Var.getClass();
        if ((iIntValue & 6) == 0) {
            i = (dd4Var.f(yn0Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= dd4Var.f(pj7Var) ? 32 : 16;
        }
        final int i2 = 0;
        final int i3 = 1;
        if (dd4Var.V(i & 1, (i & Token.EXPR_VOID) != 146)) {
            List list = ((ya3) br9Var.getValue()).a;
            szb szbVarW = yib.w(yib.w(yib.w(pj7Var, yib.d(14, dd4Var, false)), new rj7(12.0f, 12.0f, 12.0f, 12.0f)), gjb.q(0.0f, 0.0f, 0.0f, 64.0f, 7));
            boolean zF = dd4Var.f(za3Var);
            Object objQ = dd4Var.Q();
            Object obj5 = vl1.a;
            if (zF || objQ == obj5) {
                objQ = new kb4() { // from class: mb3
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj6) {
                        int i4 = i2;
                        heb hebVar = heb.a;
                        za3 za3Var2 = za3Var;
                        switch (i4) {
                            case 0:
                                String str = (String) obj6;
                                str.getClass();
                                za1 za1VarA = vtb.a(za3Var2);
                                aj2 aj2Var = rw2.a;
                                za3Var2.g(za1VarA, nh2.c, new et1(za3Var2, str, null, 17));
                                break;
                            default:
                                List list2 = (List) obj6;
                                list2.getClass();
                                za1 za1VarA2 = vtb.a(za3Var2);
                                aj2 aj2Var2 = rw2.a;
                                za3Var2.g(za1VarA2, nh2.c, new et1(za3Var2, list2, null, 18));
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var.p0(objQ);
            }
            kb4 kb4Var = (kb4) objQ;
            boolean zF2 = dd4Var.f(za3Var);
            Object objQ2 = dd4Var.Q();
            if (zF2 || objQ2 == obj5) {
                objQ2 = new kb4() { // from class: mb3
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj6) {
                        int i4 = i3;
                        heb hebVar = heb.a;
                        za3 za3Var2 = za3Var;
                        switch (i4) {
                            case 0:
                                String str = (String) obj6;
                                str.getClass();
                                za1 za1VarA = vtb.a(za3Var2);
                                aj2 aj2Var = rw2.a;
                                za3Var2.g(za1VarA, nh2.c, new et1(za3Var2, str, null, 17));
                                break;
                            default:
                                List list2 = (List) obj6;
                                list2.getClass();
                                za1 za1VarA2 = vtb.a(za3Var2);
                                aj2 aj2Var2 = rw2.a;
                                za3Var2.g(za1VarA2, nh2.c, new et1(za3Var2, list2, null, 18));
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var.p0(objQ2);
            }
            h67.q(list, szbVarW, null, kb4Var, (kb4) objQ2, dd4Var, 0);
            ou6 ou6VarL0 = gjb.l0(yib.B(yn0Var.a(lu6.a, bv4.v), 15), 12.0f);
            long j = ((q96) dd4Var.j(s96.a)).a.h;
            Object objQ3 = dd4Var.Q();
            if (objQ3 == obj5) {
                objQ3 = new bv1(a07Var, 23);
                dd4Var.p0(objQ3);
            }
            ww1.g((ib4) objQ3, ou6VarL0, null, j, 0L, null, s32.f, dd4Var, 12582918, Token.COLON);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        r64 r64Var = (r64) this.b;
        aw3 aw3Var = (aw3) this.c;
        br9 br9Var = (br9) this.d;
        yn0 yn0Var = (yn0) obj;
        pj7 pj7Var = (pj7) obj2;
        dd4 dd4Var = (dd4) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        yn0Var.getClass();
        pj7Var.getClass();
        int i2 = 2;
        if ((iIntValue & 6) == 0) {
            i = (dd4Var.f(yn0Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= dd4Var.f(pj7Var) ? 32 : 16;
        }
        int i3 = 1;
        if (dd4Var.V(i & 1, (i & Token.EXPR_VOID) != 146)) {
            szb szbVarW = yib.w(yib.w(pj7Var, yib.d(14, dd4Var, false)), gjb.q(0.0f, 0.0f, 0.0f, 72.0f, 7));
            List list = ((q64) br9Var.getValue()).a;
            lu6 lu6Var = lu6.a;
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            Object objQ = dd4Var.Q();
            Object obj5 = vl1.a;
            if (objQ == obj5) {
                objQ = new se3(22);
                dd4Var.p0(objQ);
            }
            kb4 kb4Var = (kb4) objQ;
            boolean zF = dd4Var.f(r64Var);
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == obj5) {
                objQ2 = new n64(r64Var, i3);
                dd4Var.p0(objQ2);
            }
            kb4 kb4Var2 = (kb4) objQ2;
            boolean zF2 = dd4Var.f(r64Var);
            Object objQ3 = dd4Var.Q();
            if (zF2 || objQ3 == obj5) {
                objQ3 = new n64(r64Var, i2);
                dd4Var.p0(objQ3);
            }
            t96.h("-", list, szbVarW, ou6VarF, kb4Var, kb4Var2, (kb4) objQ3, dd4Var, 27654);
            ou6 ou6VarL0 = gjb.l0(yib.B(yn0Var.a(lu6Var, bv4.v), 15), 12.0f);
            long j = ((q96) dd4Var.j(s96.a)).a.h;
            boolean zF3 = dd4Var.f(aw3Var);
            Object objQ4 = dd4Var.Q();
            if (zF3 || objQ4 == obj5) {
                objQ4 = new k51(aw3Var, 7);
                dd4Var.p0(objQ4);
            }
            ww1.g((ib4) objQ4, ou6VarL0, null, j, 0L, null, gjb.l, dd4Var, 12582912, Token.COLON);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        t27 t27Var = (t27) this.b;
        vx1 vx1Var = (vx1) this.c;
        pi2 pi2Var = (pi2) this.d;
        int iIntValue = ((Integer) obj2).intValue();
        dd4 dd4Var = (dd4) obj3;
        ((Integer) obj4).getClass();
        ((rk7) obj).getClass();
        int i = 0;
        if (iIntValue == 0) {
            dd4Var.f0(-794166529);
            boolean zH = dd4Var.h(vx1Var) | dd4Var.f(pi2Var);
            Object objQ = dd4Var.Q();
            if (zH || objQ == vl1.a) {
                objQ = new u76(vx1Var, pi2Var, i);
                dd4Var.p0(objQ);
            }
            sdc.q(t27Var, (ib4) objQ, dd4Var, 0);
            dd4Var.q(false);
        } else if (iIntValue == 1) {
            dd4Var.f0(-793747781);
            sdc.k(t27Var, dd4Var, 0);
            dd4Var.q(false);
        } else if (iIntValue == 2) {
            dd4Var.f0(-793632709);
            fe.c(t27Var, dd4Var, 0);
            dd4Var.q(false);
        } else if (iIntValue != 3) {
            dd4Var.f0(-793432728);
            dd4Var.q(false);
        } else {
            dd4Var.f0(-793522659);
            m79.u(t27Var, dd4Var, 0);
            dd4Var.q(false);
        }
        return heb.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        br9 br9Var = (br9) this.b;
        c97 c97Var = (c97) this.c;
        t27 t27Var = (t27) this.d;
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
        } else if (((a97) br9Var.getValue()).a) {
            dd4Var.f0(-1232427229);
            lc5.C(gjb.m0(gjb.k0(tg9.c, pj7Var), 12.0f, 12.0f), dd4Var, 0);
            dd4Var.q(false);
        } else if (((a97) br9Var.getValue()).b.isEmpty()) {
            dd4Var.f0(-1232157095);
            bx1.d(lx1.j0(dd4Var), wn9.K((pv9) eu9.m.getValue(), dd4Var), (String) null, gjb.k0(tg9.c, pj7Var), (String) null, (ib4) null, dd4Var, 0, 52);
            dd4Var.q(false);
        } else {
            dd4Var.f0(-1231800192);
            mv mvVar = new mv(8.0f, true, new gp(5));
            rj7 rj7Var = new rj7(12.0f, 12.0f, 12.0f, 12.0f);
            ou6 ou6VarK0 = gjb.k0(tg9.c, pj7Var);
            boolean zF = dd4Var.f(br9Var) | dd4Var.f(c97Var) | dd4Var.f(t27Var);
            Object objQ = dd4Var.Q();
            if (zF || objQ == vl1.a) {
                objQ = new fb3(16, br9Var, c97Var, t27Var);
                dd4Var.p0(objQ);
            }
            rw1.j(ou6VarK0, null, rj7Var, false, mvVar, null, null, false, null, (kb4) objQ, dd4Var, 24960, 490);
            dd4Var.q(false);
        }
        return heb.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        p83 p83Var = (p83) this.b;
        t78 t78Var = (t78) this.c;
        br9 br9Var = (br9) this.d;
        yn0 yn0Var = (yn0) obj;
        pj7 pj7Var = (pj7) obj2;
        dd4 dd4Var = (dd4) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        yn0Var.getClass();
        pj7Var.getClass();
        int i2 = 2;
        if ((iIntValue & 6) == 0) {
            i = (dd4Var.f(yn0Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= dd4Var.f(pj7Var) ? 32 : 16;
        }
        if (!dd4Var.V(i & 1, (i & Token.EXPR_VOID) != 146)) {
            dd4Var.Y();
        } else if (((s78) br9Var.getValue()).a) {
            dd4Var.f0(386116653);
            dd4Var.q(false);
        } else {
            boolean zIsEmpty = ((s78) br9Var.getValue()).b.isEmpty();
            Object obj5 = vl1.a;
            if (zIsEmpty) {
                dd4Var.f0(386184419);
                ou6 ou6VarK0 = gjb.k0(tg9.c, pj7Var);
                boolean zF = dd4Var.f(p83Var);
                Object objQ = dd4Var.Q();
                if (zF || objQ == obj5) {
                    objQ = new u66(p83Var, 3);
                    dd4Var.p0(objQ);
                }
                p7c.A(0, (ib4) objQ, dd4Var, ou6VarK0);
                dd4Var.q(false);
            } else {
                dd4Var.f0(386500836);
                List list = ((s78) br9Var.getValue()).b;
                int i3 = i;
                px3 px3Var = tg9.c;
                boolean zF2 = dd4Var.f(p83Var);
                Object objQ2 = dd4Var.Q();
                if (zF2 || objQ2 == obj5) {
                    objQ2 = new v66(p83Var, i2);
                    dd4Var.p0(objQ2);
                }
                zb4 zb4Var = (zb4) objQ2;
                boolean zF3 = dd4Var.f(t78Var);
                Object objQ3 = dd4Var.Q();
                if (zF3 || objQ3 == obj5) {
                    objQ3 = new hy7(t78Var, 3);
                    dd4Var.p0(objQ3);
                }
                p7c.z(list, pj7Var, px3Var, zb4Var, (kb4) objQ3, dd4Var, (i3 & Token.ASSIGN_MOD) | 384);
                ou6 ou6VarL0 = gjb.l0(yib.B(yn0Var.a(lu6.a, bv4.v), 15), 12.0f);
                long j = ((q96) dd4Var.j(s96.a)).a.h;
                boolean zF4 = dd4Var.f(p83Var);
                Object objQ4 = dd4Var.Q();
                if (zF4 || objQ4 == obj5) {
                    objQ4 = new u66(p83Var, 4);
                    dd4Var.p0(objQ4);
                }
                ww1.g((ib4) objQ4, ou6VarL0, null, j, 0L, null, p7c.u, dd4Var, 12582912, Token.COLON);
                dd4Var.q(false);
            }
        }
        return heb.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4) {
        final vd8 vd8Var = (vd8) this.b;
        t27 t27Var = (t27) this.c;
        br9 br9Var = (br9) this.d;
        pj7 pj7Var = (pj7) obj2;
        dd4 dd4Var = (dd4) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((yn0) obj).getClass();
        pj7Var.getClass();
        if ((iIntValue & 48) == 0) {
            iIntValue |= dd4Var.f(pj7Var) ? 32 : 16;
        }
        final int i = 0;
        final int i2 = 1;
        if (dd4Var.V(iIntValue & 1, (iIntValue & Token.TARGET) != 144)) {
            ud8 ud8Var = (ud8) br9Var.getValue();
            ou6 ou6VarB = yib.B(tg9.c, 6);
            boolean zF = dd4Var.f(vd8Var);
            Object objQ = dd4Var.Q();
            Object obj5 = vl1.a;
            if (zF || objQ == obj5) {
                objQ = new kb4() { // from class: td8
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj6) {
                        Object value;
                        Object value2;
                        Object value3;
                        Object value4;
                        Object value5;
                        int i3 = i;
                        heb hebVar = heb.a;
                        vd8 vd8Var2 = vd8Var;
                        switch (i3) {
                            case 0:
                                Boolean bool = (Boolean) obj6;
                                boolean zBooleanValue = bool.booleanValue();
                                fr9 fr9Var = vd8Var2.d;
                                if (fr9Var != null) {
                                    do {
                                        value = fr9Var.getValue();
                                        ((sd8) vd8Var2.c).a.d.e(zc8.q[2], bool);
                                    } while (!fr9Var.j(value, ud8.a((ud8) value, false, zBooleanValue, false, false, 0L, 29)));
                                }
                                break;
                            case 1:
                                Boolean bool2 = (Boolean) obj6;
                                boolean zBooleanValue2 = bool2.booleanValue();
                                fr9 fr9Var2 = vd8Var2.d;
                                if (fr9Var2 != null) {
                                    do {
                                        value2 = fr9Var2.getValue();
                                        ((sd8) vd8Var2.c).a.h.e(zc8.q[6], bool2);
                                    } while (!fr9Var2.j(value2, ud8.a((ud8) value2, false, false, zBooleanValue2, false, 0L, 27)));
                                }
                                break;
                            case 2:
                                Boolean bool3 = (Boolean) obj6;
                                boolean zBooleanValue3 = bool3.booleanValue();
                                fr9 fr9Var3 = vd8Var2.d;
                                if (fr9Var3 != null) {
                                    do {
                                        value3 = fr9Var3.getValue();
                                        ((sd8) vd8Var2.c).a.e.e(zc8.q[3], bool3);
                                    } while (!fr9Var3.j(value3, ud8.a((ud8) value3, false, false, false, zBooleanValue3, 0L, 23)));
                                }
                                break;
                            case 3:
                                Boolean bool4 = (Boolean) obj6;
                                boolean zBooleanValue4 = bool4.booleanValue();
                                fr9 fr9Var4 = vd8Var2.d;
                                if (fr9Var4 != null) {
                                    do {
                                        value4 = fr9Var4.getValue();
                                        ((sd8) vd8Var2.c).a.c.e(zc8.q[1], bool4);
                                    } while (!fr9Var4.j(value4, ud8.a((ud8) value4, zBooleanValue4, false, false, false, 0L, 30)));
                                }
                                break;
                            default:
                                Long l = (Long) obj6;
                                long jLongValue = l.longValue();
                                fr9 fr9Var5 = vd8Var2.d;
                                if (fr9Var5 != null) {
                                    do {
                                        value5 = fr9Var5.getValue();
                                        ((sd8) vd8Var2.c).a.o.e(zc8.q[13], l);
                                    } while (!fr9Var5.j(value5, ud8.a((ud8) value5, false, false, false, false, jLongValue, 15)));
                                }
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var.p0(objQ);
            }
            kb4 kb4Var = (kb4) objQ;
            boolean zF2 = dd4Var.f(vd8Var);
            Object objQ2 = dd4Var.Q();
            if (zF2 || objQ2 == obj5) {
                objQ2 = new kb4() { // from class: td8
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj6) {
                        Object value;
                        Object value2;
                        Object value3;
                        Object value4;
                        Object value5;
                        int i3 = i2;
                        heb hebVar = heb.a;
                        vd8 vd8Var2 = vd8Var;
                        switch (i3) {
                            case 0:
                                Boolean bool = (Boolean) obj6;
                                boolean zBooleanValue = bool.booleanValue();
                                fr9 fr9Var = vd8Var2.d;
                                if (fr9Var != null) {
                                    do {
                                        value = fr9Var.getValue();
                                        ((sd8) vd8Var2.c).a.d.e(zc8.q[2], bool);
                                    } while (!fr9Var.j(value, ud8.a((ud8) value, false, zBooleanValue, false, false, 0L, 29)));
                                }
                                break;
                            case 1:
                                Boolean bool2 = (Boolean) obj6;
                                boolean zBooleanValue2 = bool2.booleanValue();
                                fr9 fr9Var2 = vd8Var2.d;
                                if (fr9Var2 != null) {
                                    do {
                                        value2 = fr9Var2.getValue();
                                        ((sd8) vd8Var2.c).a.h.e(zc8.q[6], bool2);
                                    } while (!fr9Var2.j(value2, ud8.a((ud8) value2, false, false, zBooleanValue2, false, 0L, 27)));
                                }
                                break;
                            case 2:
                                Boolean bool3 = (Boolean) obj6;
                                boolean zBooleanValue3 = bool3.booleanValue();
                                fr9 fr9Var3 = vd8Var2.d;
                                if (fr9Var3 != null) {
                                    do {
                                        value3 = fr9Var3.getValue();
                                        ((sd8) vd8Var2.c).a.e.e(zc8.q[3], bool3);
                                    } while (!fr9Var3.j(value3, ud8.a((ud8) value3, false, false, false, zBooleanValue3, 0L, 23)));
                                }
                                break;
                            case 3:
                                Boolean bool4 = (Boolean) obj6;
                                boolean zBooleanValue4 = bool4.booleanValue();
                                fr9 fr9Var4 = vd8Var2.d;
                                if (fr9Var4 != null) {
                                    do {
                                        value4 = fr9Var4.getValue();
                                        ((sd8) vd8Var2.c).a.c.e(zc8.q[1], bool4);
                                    } while (!fr9Var4.j(value4, ud8.a((ud8) value4, zBooleanValue4, false, false, false, 0L, 30)));
                                }
                                break;
                            default:
                                Long l = (Long) obj6;
                                long jLongValue = l.longValue();
                                fr9 fr9Var5 = vd8Var2.d;
                                if (fr9Var5 != null) {
                                    do {
                                        value5 = fr9Var5.getValue();
                                        ((sd8) vd8Var2.c).a.o.e(zc8.q[13], l);
                                    } while (!fr9Var5.j(value5, ud8.a((ud8) value5, false, false, false, false, jLongValue, 15)));
                                }
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var.p0(objQ2);
            }
            kb4 kb4Var2 = (kb4) objQ2;
            boolean zF3 = dd4Var.f(vd8Var);
            Object objQ3 = dd4Var.Q();
            if (zF3 || objQ3 == obj5) {
                final int i3 = 2;
                objQ3 = new kb4() { // from class: td8
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj6) {
                        Object value;
                        Object value2;
                        Object value3;
                        Object value4;
                        Object value5;
                        int i32 = i3;
                        heb hebVar = heb.a;
                        vd8 vd8Var2 = vd8Var;
                        switch (i32) {
                            case 0:
                                Boolean bool = (Boolean) obj6;
                                boolean zBooleanValue = bool.booleanValue();
                                fr9 fr9Var = vd8Var2.d;
                                if (fr9Var != null) {
                                    do {
                                        value = fr9Var.getValue();
                                        ((sd8) vd8Var2.c).a.d.e(zc8.q[2], bool);
                                    } while (!fr9Var.j(value, ud8.a((ud8) value, false, zBooleanValue, false, false, 0L, 29)));
                                }
                                break;
                            case 1:
                                Boolean bool2 = (Boolean) obj6;
                                boolean zBooleanValue2 = bool2.booleanValue();
                                fr9 fr9Var2 = vd8Var2.d;
                                if (fr9Var2 != null) {
                                    do {
                                        value2 = fr9Var2.getValue();
                                        ((sd8) vd8Var2.c).a.h.e(zc8.q[6], bool2);
                                    } while (!fr9Var2.j(value2, ud8.a((ud8) value2, false, false, zBooleanValue2, false, 0L, 27)));
                                }
                                break;
                            case 2:
                                Boolean bool3 = (Boolean) obj6;
                                boolean zBooleanValue3 = bool3.booleanValue();
                                fr9 fr9Var3 = vd8Var2.d;
                                if (fr9Var3 != null) {
                                    do {
                                        value3 = fr9Var3.getValue();
                                        ((sd8) vd8Var2.c).a.e.e(zc8.q[3], bool3);
                                    } while (!fr9Var3.j(value3, ud8.a((ud8) value3, false, false, false, zBooleanValue3, 0L, 23)));
                                }
                                break;
                            case 3:
                                Boolean bool4 = (Boolean) obj6;
                                boolean zBooleanValue4 = bool4.booleanValue();
                                fr9 fr9Var4 = vd8Var2.d;
                                if (fr9Var4 != null) {
                                    do {
                                        value4 = fr9Var4.getValue();
                                        ((sd8) vd8Var2.c).a.c.e(zc8.q[1], bool4);
                                    } while (!fr9Var4.j(value4, ud8.a((ud8) value4, zBooleanValue4, false, false, false, 0L, 30)));
                                }
                                break;
                            default:
                                Long l = (Long) obj6;
                                long jLongValue = l.longValue();
                                fr9 fr9Var5 = vd8Var2.d;
                                if (fr9Var5 != null) {
                                    do {
                                        value5 = fr9Var5.getValue();
                                        ((sd8) vd8Var2.c).a.o.e(zc8.q[13], l);
                                    } while (!fr9Var5.j(value5, ud8.a((ud8) value5, false, false, false, false, jLongValue, 15)));
                                }
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var.p0(objQ3);
            }
            kb4 kb4Var3 = (kb4) objQ3;
            boolean zF4 = dd4Var.f(vd8Var);
            Object objQ4 = dd4Var.Q();
            if (zF4 || objQ4 == obj5) {
                final int i4 = 3;
                objQ4 = new kb4() { // from class: td8
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj6) {
                        Object value;
                        Object value2;
                        Object value3;
                        Object value4;
                        Object value5;
                        int i32 = i4;
                        heb hebVar = heb.a;
                        vd8 vd8Var2 = vd8Var;
                        switch (i32) {
                            case 0:
                                Boolean bool = (Boolean) obj6;
                                boolean zBooleanValue = bool.booleanValue();
                                fr9 fr9Var = vd8Var2.d;
                                if (fr9Var != null) {
                                    do {
                                        value = fr9Var.getValue();
                                        ((sd8) vd8Var2.c).a.d.e(zc8.q[2], bool);
                                    } while (!fr9Var.j(value, ud8.a((ud8) value, false, zBooleanValue, false, false, 0L, 29)));
                                }
                                break;
                            case 1:
                                Boolean bool2 = (Boolean) obj6;
                                boolean zBooleanValue2 = bool2.booleanValue();
                                fr9 fr9Var2 = vd8Var2.d;
                                if (fr9Var2 != null) {
                                    do {
                                        value2 = fr9Var2.getValue();
                                        ((sd8) vd8Var2.c).a.h.e(zc8.q[6], bool2);
                                    } while (!fr9Var2.j(value2, ud8.a((ud8) value2, false, false, zBooleanValue2, false, 0L, 27)));
                                }
                                break;
                            case 2:
                                Boolean bool3 = (Boolean) obj6;
                                boolean zBooleanValue3 = bool3.booleanValue();
                                fr9 fr9Var3 = vd8Var2.d;
                                if (fr9Var3 != null) {
                                    do {
                                        value3 = fr9Var3.getValue();
                                        ((sd8) vd8Var2.c).a.e.e(zc8.q[3], bool3);
                                    } while (!fr9Var3.j(value3, ud8.a((ud8) value3, false, false, false, zBooleanValue3, 0L, 23)));
                                }
                                break;
                            case 3:
                                Boolean bool4 = (Boolean) obj6;
                                boolean zBooleanValue4 = bool4.booleanValue();
                                fr9 fr9Var4 = vd8Var2.d;
                                if (fr9Var4 != null) {
                                    do {
                                        value4 = fr9Var4.getValue();
                                        ((sd8) vd8Var2.c).a.c.e(zc8.q[1], bool4);
                                    } while (!fr9Var4.j(value4, ud8.a((ud8) value4, zBooleanValue4, false, false, false, 0L, 30)));
                                }
                                break;
                            default:
                                Long l = (Long) obj6;
                                long jLongValue = l.longValue();
                                fr9 fr9Var5 = vd8Var2.d;
                                if (fr9Var5 != null) {
                                    do {
                                        value5 = fr9Var5.getValue();
                                        ((sd8) vd8Var2.c).a.o.e(zc8.q[13], l);
                                    } while (!fr9Var5.j(value5, ud8.a((ud8) value5, false, false, false, false, jLongValue, 15)));
                                }
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var.p0(objQ4);
            }
            kb4 kb4Var4 = (kb4) objQ4;
            boolean zF5 = dd4Var.f(t27Var);
            Object objQ5 = dd4Var.Q();
            if (zF5 || objQ5 == obj5) {
                objQ5 = new y07(t27Var, 17);
                dd4Var.p0(objQ5);
            }
            ib4 ib4Var = (ib4) objQ5;
            boolean zF6 = dd4Var.f(t27Var);
            Object objQ6 = dd4Var.Q();
            if (zF6 || objQ6 == obj5) {
                objQ6 = new y07(t27Var, 18);
                dd4Var.p0(objQ6);
            }
            ib4 ib4Var2 = (ib4) objQ6;
            boolean zF7 = dd4Var.f(vd8Var);
            Object objQ7 = dd4Var.Q();
            if (zF7 || objQ7 == obj5) {
                final int i5 = 4;
                objQ7 = new kb4() { // from class: td8
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj6) {
                        Object value;
                        Object value2;
                        Object value3;
                        Object value4;
                        Object value5;
                        int i32 = i5;
                        heb hebVar = heb.a;
                        vd8 vd8Var2 = vd8Var;
                        switch (i32) {
                            case 0:
                                Boolean bool = (Boolean) obj6;
                                boolean zBooleanValue = bool.booleanValue();
                                fr9 fr9Var = vd8Var2.d;
                                if (fr9Var != null) {
                                    do {
                                        value = fr9Var.getValue();
                                        ((sd8) vd8Var2.c).a.d.e(zc8.q[2], bool);
                                    } while (!fr9Var.j(value, ud8.a((ud8) value, false, zBooleanValue, false, false, 0L, 29)));
                                }
                                break;
                            case 1:
                                Boolean bool2 = (Boolean) obj6;
                                boolean zBooleanValue2 = bool2.booleanValue();
                                fr9 fr9Var2 = vd8Var2.d;
                                if (fr9Var2 != null) {
                                    do {
                                        value2 = fr9Var2.getValue();
                                        ((sd8) vd8Var2.c).a.h.e(zc8.q[6], bool2);
                                    } while (!fr9Var2.j(value2, ud8.a((ud8) value2, false, false, zBooleanValue2, false, 0L, 27)));
                                }
                                break;
                            case 2:
                                Boolean bool3 = (Boolean) obj6;
                                boolean zBooleanValue3 = bool3.booleanValue();
                                fr9 fr9Var3 = vd8Var2.d;
                                if (fr9Var3 != null) {
                                    do {
                                        value3 = fr9Var3.getValue();
                                        ((sd8) vd8Var2.c).a.e.e(zc8.q[3], bool3);
                                    } while (!fr9Var3.j(value3, ud8.a((ud8) value3, false, false, false, zBooleanValue3, 0L, 23)));
                                }
                                break;
                            case 3:
                                Boolean bool4 = (Boolean) obj6;
                                boolean zBooleanValue4 = bool4.booleanValue();
                                fr9 fr9Var4 = vd8Var2.d;
                                if (fr9Var4 != null) {
                                    do {
                                        value4 = fr9Var4.getValue();
                                        ((sd8) vd8Var2.c).a.c.e(zc8.q[1], bool4);
                                    } while (!fr9Var4.j(value4, ud8.a((ud8) value4, zBooleanValue4, false, false, false, 0L, 30)));
                                }
                                break;
                            default:
                                Long l = (Long) obj6;
                                long jLongValue = l.longValue();
                                fr9 fr9Var5 = vd8Var2.d;
                                if (fr9Var5 != null) {
                                    do {
                                        value5 = fr9Var5.getValue();
                                        ((sd8) vd8Var2.c).a.o.e(zc8.q[13], l);
                                    } while (!fr9Var5.j(value5, ud8.a((ud8) value5, false, false, false, false, jLongValue, 15)));
                                }
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var.p0(objQ7);
            }
            kb4 kb4Var5 = (kb4) objQ7;
            boolean zF8 = dd4Var.f(t27Var);
            Object objQ8 = dd4Var.Q();
            if (zF8 || objQ8 == obj5) {
                objQ8 = new y07(t27Var, 12);
                dd4Var.p0(objQ8);
            }
            ib4 ib4Var3 = (ib4) objQ8;
            boolean zF9 = dd4Var.f(t27Var);
            Object objQ9 = dd4Var.Q();
            if (zF9 || objQ9 == obj5) {
                objQ9 = new y07(t27Var, 13);
                dd4Var.p0(objQ9);
            }
            ib4 ib4Var4 = (ib4) objQ9;
            boolean zF10 = dd4Var.f(t27Var);
            Object objQ10 = dd4Var.Q();
            if (zF10 || objQ10 == obj5) {
                objQ10 = new y07(t27Var, 14);
                dd4Var.p0(objQ10);
            }
            ib4 ib4Var5 = (ib4) objQ10;
            boolean zF11 = dd4Var.f(t27Var);
            Object objQ11 = dd4Var.Q();
            if (zF11 || objQ11 == obj5) {
                objQ11 = new y07(t27Var, 15);
                dd4Var.p0(objQ11);
            }
            ib4 ib4Var6 = (ib4) objQ11;
            boolean zF12 = dd4Var.f(t27Var);
            Object objQ12 = dd4Var.Q();
            if (zF12 || objQ12 == obj5) {
                objQ12 = new y07(t27Var, 16);
                dd4Var.p0(objQ12);
            }
            yb0.s(ud8Var, pj7Var, ou6VarB, kb4Var, kb4Var2, kb4Var3, kb4Var4, ib4Var, ib4Var2, kb4Var5, ib4Var3, ib4Var4, ib4Var5, ib4Var6, (ib4) objQ12, dd4Var, iIntValue & Token.ASSIGN_MOD);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        z44 z44Var;
        qj5 qj5Var;
        z44 z44Var2;
        Object umVar;
        Object obj5;
        qe9 qe9Var;
        kb4 kb4Var;
        int i;
        a07 a07Var;
        float f;
        br9 br9Var;
        a07 a07Var2;
        qe9 qe9Var2 = (qe9) this.b;
        u90 u90Var = (u90) this.c;
        br9 br9Var2 = (br9) this.d;
        pj7 pj7Var = (pj7) obj2;
        dd4 dd4Var = (dd4) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        xf0 xf0Var = bv4.f;
        ((yn0) obj).getClass();
        pj7Var.getClass();
        if ((iIntValue & 48) == 0) {
            iIntValue |= dd4Var.f(pj7Var) ? 32 : 16;
        }
        if (dd4Var.V(iIntValue & 1, (iIntValue & Token.TARGET) != 144)) {
            Object[] objArr = new Object[0];
            Object objQ = dd4Var.Q();
            Object obj6 = vl1.a;
            if (objQ == obj6) {
                objQ = new aa9(22);
                dd4Var.p0(objQ);
            }
            a07 a07Var3 = (a07) ww1.b0(objArr, (ib4) objQ, dd4Var, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj6) {
                objQ2 = new aa9(23);
                dd4Var.p0(objQ2);
            }
            br9 br9Var3 = (a07) ww1.b0(objArr2, (ib4) objQ2, dd4Var, 48);
            Object[] objArr3 = new Object[0];
            Object objQ3 = dd4Var.Q();
            if (objQ3 == obj6) {
                objQ3 = new aa9(24);
                dd4Var.p0(objQ3);
            }
            a07 a07Var4 = (a07) ww1.b0(objArr3, (ib4) objQ3, dd4Var, 48);
            Object[] objArr4 = new Object[0];
            Object objQ4 = dd4Var.Q();
            if (objQ4 == obj6) {
                objQ4 = new aa9(25);
                dd4Var.p0(objQ4);
            }
            a07 a07Var5 = (a07) ww1.b0(objArr4, (ib4) objQ4, dd4Var, 48);
            Object objQ5 = dd4Var.Q();
            if (objQ5 == obj6) {
                objQ5 = ky0.f(dd4Var);
            }
            z44 z44Var3 = (z44) objQ5;
            Object objQ6 = dd4Var.Q();
            if (objQ6 == obj6) {
                objQ6 = ky0.f(dd4Var);
            }
            z44 z44Var4 = (z44) objQ6;
            ou6 ou6VarL0 = gjb.l0(kc5.Q(yn2.E(gjb.k0(yib.E(tg9.c, 14), pj7Var), dd4Var, 0), kc5.J(dd4Var), 14), 24.0f);
            ie1 ie1VarA = ge1.a(pv.d, bv4.z, dd4Var, 6);
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
            un9.s(jmVar, dd4Var, ie1VarA);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var, ou6VarL02);
            String str = (String) a07Var3.getValue();
            qj5 qj5Var2 = new qj5(0, 6, Token.INC);
            Object objQ7 = dd4Var.Q();
            if (objQ7 == obj6) {
                z44Var = z44Var3;
                objQ7 = new k56(z44Var, 3);
                dd4Var.p0(objQ7);
            } else {
                z44Var = z44Var3;
            }
            z44 z44Var5 = z44Var;
            nj5 nj5Var = new nj5((kb4) objQ7, (kb4) null, 59);
            uw1 uw1Var = s00.p(dd4Var).b;
            lu6 lu6Var = lu6.a;
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            boolean zF = dd4Var.f(a07Var3);
            Object objQ8 = dd4Var.Q();
            if (zF || objQ8 == obj6) {
                qj5Var = qj5Var2;
                objQ8 = new hp8(a07Var3, 24);
                dd4Var.p0(objQ8);
            } else {
                qj5Var = qj5Var2;
            }
            lx1.m(str, (kb4) objQ8, ou6VarF, false, false, null, s32.u, null, s32.v, null, false, null, qj5Var, nj5Var, true, 0, 0, uw1Var, null, dd4Var, 102236544, 12779520, 6061752);
            String str2 = (String) tw2.l(lu6Var, 12.0f, dd4Var, br9Var3);
            qj5 qj5Var3 = new qj5(0, 6, Token.INC);
            Object objQ9 = dd4Var.Q();
            if (objQ9 == obj6) {
                objQ9 = new k56(z44Var4, 2);
                dd4Var.p0(objQ9);
            }
            nj5 nj5Var2 = new nj5((kb4) objQ9, (kb4) null, 59);
            uw1 uw1Var2 = s00.p(dd4Var).b;
            ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
            Object objQ10 = dd4Var.Q();
            if (objQ10 == obj6) {
                objQ10 = new qc9(15);
                dd4Var.p0(objQ10);
            }
            ou6 ou6VarB = jv3.B(a29.c(ou6VarF2, false, (kb4) objQ10), z44Var5);
            boolean zF2 = dd4Var.f(br9Var3);
            Object objQ11 = dd4Var.Q();
            if (zF2 || objQ11 == obj6) {
                objQ11 = new hp8(br9Var3, 25);
                dd4Var.p0(objQ11);
            }
            lx1.m(str2, (kb4) objQ11, ou6VarB, false, false, null, s32.w, null, s32.x, null, false, null, qj5Var3, nj5Var2, true, 0, 0, uw1Var2, null, dd4Var, 102236160, 12779520, 6061752);
            String str3 = (String) tw2.l(lu6Var, 12.0f, dd4Var, a07Var4);
            qj5 qj5Var4 = new qj5(7, 7, Token.HOOK);
            boolean zF3 = dd4Var.f(qe9Var2) | dd4Var.f(a07Var3) | dd4Var.f(br9Var3) | dd4Var.f(a07Var4);
            Object objQ12 = dd4Var.Q();
            if (zF3 || objQ12 == obj6) {
                z44Var2 = z44Var4;
                obj5 = obj6;
                qe9Var = qe9Var2;
                kb4Var = null;
                i = 59;
                a07Var = a07Var3;
                f = 1.0f;
                umVar = new um(qe9Var, a07Var, br9Var3, a07Var4, 26);
                br9Var = br9Var3;
                a07Var2 = a07Var4;
                dd4Var.p0(umVar);
            } else {
                z44Var2 = z44Var4;
                obj5 = obj6;
                br9Var = br9Var3;
                qe9Var = qe9Var2;
                a07Var2 = a07Var4;
                a07Var = a07Var3;
                umVar = objQ12;
                f = 1.0f;
                kb4Var = null;
                i = 59;
            }
            nj5 nj5Var3 = new nj5((kb4) umVar, kb4Var, i);
            yub wn7Var = ((Boolean) a07Var5.getValue()).booleanValue() ? js8.y : new wn7();
            uw1 uw1Var3 = s00.p(dd4Var).b;
            ou6 ou6VarF3 = tg9.f(lu6Var, f);
            Object objQ13 = dd4Var.Q();
            if (objQ13 == obj5) {
                objQ13 = new qc9(16);
                dd4Var.p0(objQ13);
            }
            ou6 ou6VarB2 = jv3.B(a29.c(ou6VarF3, false, (kb4) objQ13), z44Var2);
            boolean zF4 = dd4Var.f(a07Var2);
            Object objQ14 = dd4Var.Q();
            if (zF4 || objQ14 == obj5) {
                objQ14 = new hp8(a07Var2, 26);
                dd4Var.p0(objQ14);
            }
            Object obj7 = obj5;
            br9 br9Var4 = br9Var;
            a07 a07Var6 = a07Var2;
            lx1.m(str3, (kb4) objQ14, ou6VarB2, false, false, null, s32.y, null, s32.z, jf0.G(2077116156, new kq2(a07Var5, 13), dd4Var), false, wn7Var, qj5Var4, nj5Var3, true, 0, 0, uw1Var3, null, dd4Var, 907542528, 12779520, 6044856);
            dd4 dd4Var2 = dd4Var;
            boolean z = ((String) tw2.l(lu6Var, 24.0f, dd4Var2, a07Var)).length() > 0 && ((String) br9Var4.getValue()).length() > 0 && ((String) a07Var6.getValue()).length() > 0;
            ou6 ou6VarE = fe.L(t96.w(tg9.n(lu6Var, 56.0f), tp8.a), lc1.c(z ? 1.0f : 0.5f, s00.o(dd4Var2).a), jf0.G).e(new xo4(bv4.B));
            boolean zH = dd4Var2.h(u90Var) | dd4Var2.f(qe9Var) | dd4Var2.f(a07Var) | dd4Var2.f(br9Var4) | dd4Var2.f(a07Var6);
            Object objQ15 = dd4Var2.Q();
            if (zH || objQ15 == obj7) {
                mm3 mm3Var = new mm3(u90Var, qe9Var, a07Var, br9Var4, a07Var6, 3);
                dd4Var2.p0(mm3Var);
                objQ15 = mm3Var;
            }
            ou6 ou6VarJ = fw.J(null, (ib4) objQ15, ou6VarE, z, 14);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL03 = s32.L0(dd4Var2, ou6VarJ);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ha6VarD);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL03);
            boolean z2 = ((pe9) br9Var2.getValue()).a;
            zn0 zn0Var = zn0.a;
            if (z2) {
                dd4Var2.f0(554894509);
                sdc.y(zn0Var.a(tg9.n(lu6Var, 24.0f), xf0Var), s00.o(dd4Var2).b, null, dd4Var2, 0, 4);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(555182871);
                mx4.a(i25.c((m53) a53.d.getValue(), dd4Var2, 0), wn9.K((pv9) mu9.P.getValue(), dd4Var2), sw1.i0(zn0Var.a(tg9.n(lu6Var, 24.0f), xf0Var), 180.0f), s00.o(dd4Var2).b, dd4Var2, 0, 0);
                dd4Var2 = dd4Var2;
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
            dd4Var2.q(true);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        aw3 aw3Var = (aw3) this.b;
        h8a h8aVar = (h8a) this.c;
        br9 br9Var = (br9) this.d;
        yn0 yn0Var = (yn0) obj;
        pj7 pj7Var = (pj7) obj2;
        dd4 dd4Var = (dd4) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        yn0Var.getClass();
        pj7Var.getClass();
        int i2 = 2;
        if ((iIntValue & 6) == 0) {
            i = (dd4Var.f(yn0Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= dd4Var.f(pj7Var) ? 32 : 16;
        }
        int i3 = 1;
        if (dd4Var.V(i & 1, (i & Token.EXPR_VOID) != 146)) {
            boolean zIsEmpty = ((e8a) br9Var.getValue()).g.isEmpty();
            Object obj5 = vl1.a;
            if (zIsEmpty) {
                dd4Var.f0(1263276164);
                ou6 ou6VarK0 = gjb.k0(tg9.c, pj7Var);
                boolean zF = dd4Var.f(aw3Var);
                Object objQ = dd4Var.Q();
                if (zF || objQ == obj5) {
                    objQ = new k51(aw3Var, 12);
                    dd4Var.p0(objQ);
                }
                p7c.K(0, (ib4) objQ, dd4Var, ou6VarK0);
                dd4Var.q(false);
            } else {
                dd4Var.f0(1263560775);
                e8a e8aVar = (e8a) br9Var.getValue();
                szb szbVarW = yib.w(yib.w(pj7Var, yib.d(14, dd4Var, false)), gjb.q(0.0f, 0.0f, 0.0f, 64.0f, 7));
                px3 px3Var = tg9.c;
                boolean zF2 = dd4Var.f(h8aVar);
                Object objQ2 = dd4Var.Q();
                if (zF2 || objQ2 == obj5) {
                    objQ2 = new p7a(h8aVar, i3);
                    dd4Var.p0(objQ2);
                }
                kb4 kb4Var = (kb4) objQ2;
                boolean zF3 = dd4Var.f(h8aVar);
                Object objQ3 = dd4Var.Q();
                if (zF3 || objQ3 == obj5) {
                    objQ3 = new p7a(h8aVar, i2);
                    dd4Var.p0(objQ3);
                }
                p7c.J(e8aVar, szbVarW, px3Var, kb4Var, (kb4) objQ3, dd4Var, 384);
                ou6 ou6VarL0 = gjb.l0(yib.B(yn0Var.a(lu6.a, bv4.v), 15), 12.0f);
                long j = ((q96) dd4Var.j(s96.a)).a.h;
                boolean zF4 = dd4Var.f(aw3Var);
                Object objQ4 = dd4Var.Q();
                if (zF4 || objQ4 == obj5) {
                    objQ4 = new k51(aw3Var, 13);
                    dd4Var.p0(objQ4);
                }
                ww1.g((ib4) objQ4, ou6VarL0, null, j, 0L, null, t96.p, dd4Var, 12582912, Token.COLON);
                dd4Var.q(false);
            }
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        s83 s83Var = (s83) this.b;
        h8a h8aVar = (h8a) this.c;
        br9 br9Var = (br9) this.d;
        yn0 yn0Var = (yn0) obj;
        pj7 pj7Var = (pj7) obj2;
        dd4 dd4Var = (dd4) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        yn0Var.getClass();
        pj7Var.getClass();
        int i2 = 4;
        if ((iIntValue & 6) == 0) {
            i = (dd4Var.f(yn0Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= dd4Var.f(pj7Var) ? 32 : 16;
        }
        if (dd4Var.V(i & 1, (i & Token.EXPR_VOID) != 146)) {
            boolean zIsEmpty = ((e8a) br9Var.getValue()).h.isEmpty();
            Object obj5 = vl1.a;
            if (zIsEmpty) {
                dd4Var.f0(1813988079);
                ou6 ou6VarK0 = gjb.k0(tg9.c, pj7Var);
                boolean zF = dd4Var.f(s83Var);
                Object objQ = dd4Var.Q();
                if (zF || objQ == obj5) {
                    objQ = new s7a(s83Var, 3);
                    dd4Var.p0(objQ);
                }
                sdc.X(0, (ib4) objQ, dd4Var, ou6VarK0);
                dd4Var.q(false);
            } else {
                dd4Var.f0(1814273682);
                List list = ((e8a) br9Var.getValue()).h;
                int i3 = i;
                px3 px3Var = tg9.c;
                boolean zF2 = dd4Var.f(h8aVar);
                Object objQ2 = dd4Var.Q();
                if (zF2 || objQ2 == obj5) {
                    objQ2 = new p7a(h8aVar, i2);
                    dd4Var.p0(objQ2);
                }
                kb4 kb4Var = (kb4) objQ2;
                boolean zF3 = dd4Var.f(s83Var);
                Object objQ3 = dd4Var.Q();
                if (zF3 || objQ3 == obj5) {
                    objQ3 = new r7a(s83Var, 0);
                    dd4Var.p0(objQ3);
                }
                sdc.W(list, pj7Var, px3Var, kb4Var, (kb4) objQ3, dd4Var, (i3 & Token.ASSIGN_MOD) | 384);
                ou6 ou6VarL0 = gjb.l0(yib.B(yn0Var.a(lu6.a, bv4.v), 15), 12.0f);
                long j = ((q96) dd4Var.j(s96.a)).a.h;
                boolean zF4 = dd4Var.f(s83Var);
                Object objQ4 = dd4Var.Q();
                if (zF4 || objQ4 == obj5) {
                    objQ4 = new s7a(s83Var, 0);
                    dd4Var.p0(objQ4);
                }
                ww1.g((ib4) objQ4, ou6VarL0, null, j, 0L, null, h67.p, dd4Var, 12582912, Token.COLON);
                dd4Var.q(false);
            }
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        h8a h8aVar = (h8a) this.b;
        t27 t27Var = (t27) this.c;
        br9 br9Var = (br9) this.d;
        pj7 pj7Var = (pj7) obj2;
        dd4 dd4Var = (dd4) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((yn0) obj).getClass();
        pj7Var.getClass();
        if ((iIntValue & 48) == 0) {
            iIntValue |= dd4Var.f(pj7Var) ? 32 : 16;
        }
        if (dd4Var.V(iIntValue & 1, (iIntValue & Token.TARGET) != 144)) {
            e8a e8aVar = (e8a) br9Var.getValue();
            int i = 6;
            ou6 ou6VarB = yib.B(tg9.c, 6);
            boolean zF = dd4Var.f(h8aVar);
            Object objQ = dd4Var.Q();
            Object obj5 = vl1.a;
            if (zF || objQ == obj5) {
                objQ = new p7a(h8aVar, 5);
                dd4Var.p0(objQ);
            }
            kb4 kb4Var = (kb4) objQ;
            boolean zF2 = dd4Var.f(h8aVar);
            Object objQ2 = dd4Var.Q();
            if (zF2 || objQ2 == obj5) {
                objQ2 = new p7a(h8aVar, i);
                dd4Var.p0(objQ2);
            }
            kb4 kb4Var2 = (kb4) objQ2;
            boolean zF3 = dd4Var.f(h8aVar);
            Object objQ3 = dd4Var.Q();
            int i2 = 7;
            if (zF3 || objQ3 == obj5) {
                objQ3 = new p7a(h8aVar, i2);
                dd4Var.p0(objQ3);
            }
            kb4 kb4Var3 = (kb4) objQ3;
            boolean zF4 = dd4Var.f(h8aVar);
            Object objQ4 = dd4Var.Q();
            if (zF4 || objQ4 == obj5) {
                objQ4 = new p7a(h8aVar, 8);
                dd4Var.p0(objQ4);
            }
            kb4 kb4Var4 = (kb4) objQ4;
            boolean zF5 = dd4Var.f(t27Var);
            Object objQ5 = dd4Var.Q();
            if (zF5 || objQ5 == obj5) {
                objQ5 = new ne9(t27Var, 6);
                dd4Var.p0(objQ5);
            }
            ib4 ib4Var = (ib4) objQ5;
            boolean zF6 = dd4Var.f(t27Var);
            Object objQ6 = dd4Var.Q();
            if (zF6 || objQ6 == obj5) {
                objQ6 = new ne9(t27Var, 7);
                dd4Var.p0(objQ6);
            }
            gc1.B(e8aVar, pj7Var, ou6VarB, kb4Var, kb4Var2, kb4Var3, kb4Var4, ib4Var, (ib4) objQ6, dd4Var, iIntValue & Token.ASSIGN_MOD);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        q83 q83Var = (q83) this.b;
        ma8 ma8Var = (ma8) this.c;
        br9 br9Var = (br9) this.d;
        yn0 yn0Var = (yn0) obj;
        pj7 pj7Var = (pj7) obj2;
        dd4 dd4Var = (dd4) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        yn0Var.getClass();
        pj7Var.getClass();
        if ((iIntValue & 6) == 0) {
            i = (dd4Var.f(yn0Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= dd4Var.f(pj7Var) ? 32 : 16;
        }
        if (!dd4Var.V(i & 1, (i & Token.EXPR_VOID) != 146)) {
            dd4Var.Y();
        } else if (((ja8) br9Var.getValue()).a) {
            dd4Var.f0(1203215833);
            dd4Var.q(false);
        } else {
            dd4Var.f0(1201809890);
            boolean zIsEmpty = ((ja8) br9Var.getValue()).b.isEmpty();
            Object obj5 = vl1.a;
            if (zIsEmpty) {
                dd4Var.f0(1201819283);
                ou6 ou6VarK0 = gjb.k0(tg9.c, pj7Var);
                boolean zF = dd4Var.f(q83Var);
                Object objQ = dd4Var.Q();
                if (zF || objQ == obj5) {
                    objQ = new zj6(q83Var, 1);
                    dd4Var.p0(objQ);
                }
                md2.n(0, (ib4) objQ, dd4Var, ou6VarK0);
                dd4Var.q(false);
                z = false;
            } else {
                dd4Var.f0(1202112295);
                List list = ((ja8) br9Var.getValue()).b;
                int i2 = i;
                px3 px3Var = tg9.c;
                boolean zF2 = dd4Var.f(q83Var);
                Object objQ2 = dd4Var.Q();
                if (zF2 || objQ2 == obj5) {
                    objQ2 = new yj6(q83Var, 3);
                    dd4Var.p0(objQ2);
                }
                kb4 kb4Var = (kb4) objQ2;
                boolean zF3 = dd4Var.f(ma8Var);
                Object objQ3 = dd4Var.Q();
                if (zF3 || objQ3 == obj5) {
                    objQ3 = new nx9(ma8Var, 5);
                    dd4Var.p0(objQ3);
                }
                md2.m(list, pj7Var, px3Var, kb4Var, (kb4) objQ3, dd4Var, (i2 & Token.ASSIGN_MOD) | 384);
                ou6 ou6VarL0 = gjb.l0(yib.B(yn0Var.a(lu6.a, bv4.v), 15), 12.0f);
                long j = ((q96) dd4Var.j(s96.a)).a.h;
                boolean zF4 = dd4Var.f(q83Var);
                Object objQ4 = dd4Var.Q();
                if (zF4 || objQ4 == obj5) {
                    objQ4 = new zj6(q83Var, 2);
                    dd4Var.p0(objQ4);
                }
                z = false;
                ww1.g((ib4) objQ4, ou6VarL0, null, j, 0L, null, kl8.s, dd4Var, 12582912, Token.COLON);
                dd4Var.q(false);
            }
            dd4Var.q(z);
        }
        return heb.a;
    }

    private final Object s(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        final gea geaVar = (gea) this.b;
        u83 u83Var = (u83) this.c;
        br9 br9Var = (br9) this.d;
        yn0 yn0Var = (yn0) obj;
        pj7 pj7Var = (pj7) obj2;
        dd4 dd4Var = (dd4) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        yn0Var.getClass();
        pj7Var.getClass();
        if ((iIntValue & 6) == 0) {
            i = (dd4Var.f(yn0Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= dd4Var.f(pj7Var) ? 32 : 16;
        }
        final int i2 = 1;
        final int i3 = 0;
        if (dd4Var.V(i & 1, (i & Token.EXPR_VOID) != 146)) {
            ((dea) br9Var.getValue()).getClass();
            dd4Var.f0(622421453);
            boolean z = ((dea) br9Var.getValue()).a;
            List list = ((dea) br9Var.getValue()).b;
            int i4 = i;
            px3 px3Var = tg9.c;
            boolean zF = dd4Var.f(geaVar);
            Object objQ = dd4Var.Q();
            Object obj5 = vl1.a;
            if (zF || objQ == obj5) {
                objQ = new kb4() { // from class: zda
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj6) {
                        int i5 = i3;
                        heb hebVar = heb.a;
                        gea geaVar2 = geaVar;
                        switch (i5) {
                            case 0:
                                p17 p17Var = (p17) obj6;
                                p17Var.getClass();
                                String str = p17Var.a;
                                str.getClass();
                                za1 za1VarA = vtb.a(geaVar2);
                                aj2 aj2Var = rw2.a;
                                geaVar2.g(za1VarA, nh2.c, new b69(geaVar2, str, null, 23));
                                break;
                            default:
                                Boolean bool = (Boolean) obj6;
                                bool.getClass();
                                fr9 fr9Var = geaVar2.s;
                                fr9Var.getClass();
                                fr9Var.l(null, bool);
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var.p0(objQ);
            }
            kb4 kb4Var = (kb4) objQ;
            boolean zF2 = dd4Var.f(u83Var);
            Object objQ2 = dd4Var.Q();
            int i5 = 3;
            if (zF2 || objQ2 == obj5) {
                objQ2 = new ik6(u83Var, i5);
                dd4Var.p0(objQ2);
            }
            kb4 kb4Var2 = (kb4) objQ2;
            boolean zF3 = dd4Var.f(geaVar);
            Object objQ3 = dd4Var.Q();
            if (zF3 || objQ3 == obj5) {
                objQ3 = new kb4() { // from class: zda
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj6) {
                        int i52 = i2;
                        heb hebVar = heb.a;
                        gea geaVar2 = geaVar;
                        switch (i52) {
                            case 0:
                                p17 p17Var = (p17) obj6;
                                p17Var.getClass();
                                String str = p17Var.a;
                                str.getClass();
                                za1 za1VarA = vtb.a(geaVar2);
                                aj2 aj2Var = rw2.a;
                                geaVar2.g(za1VarA, nh2.c, new b69(geaVar2, str, null, 23));
                                break;
                            default:
                                Boolean bool = (Boolean) obj6;
                                bool.getClass();
                                fr9 fr9Var = geaVar2.s;
                                fr9Var.getClass();
                                fr9Var.l(null, bool);
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var.p0(objQ3);
            }
            jv3.g(z, list, pj7Var, px3Var, kb4Var, kb4Var2, (kb4) objQ3, dd4Var, ((i4 << 3) & 896) | 3072);
            ou6 ou6VarL0 = gjb.l0(yib.B(yn0Var.a(lu6.a, bv4.v), 15), 12.0f);
            long j = ((q96) dd4Var.j(s96.a)).a.h;
            boolean zF4 = dd4Var.f(u83Var) | dd4Var.f(br9Var);
            Object objQ4 = dd4Var.Q();
            if (zF4 || objQ4 == obj5) {
                objQ4 = new e67(28, u83Var, br9Var);
                dd4Var.p0(objQ4);
            }
            ww1.g((ib4) objQ4, ou6VarL0, null, j, 0L, null, m79.s, dd4Var, 12582912, Token.COLON);
            dd4Var.q(false);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        final kn2 kn2Var = (kn2) this.b;
        rpa rpaVar = (rpa) this.c;
        br9 br9Var = (br9) this.d;
        yn0 yn0Var = (yn0) obj;
        pj7 pj7Var = (pj7) obj2;
        dd4 dd4Var = (dd4) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        yn0Var.getClass();
        pj7Var.getClass();
        if ((iIntValue & 6) == 0) {
            i = (dd4Var.f(yn0Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= dd4Var.f(pj7Var) ? 32 : 16;
        }
        final int i2 = 1;
        if (!dd4Var.V(i & 1, (i & Token.EXPR_VOID) != 146)) {
            dd4Var.Y();
        } else if (((ppa) br9Var.getValue()).a) {
            dd4Var.f0(1723119925);
            dd4Var.q(false);
        } else {
            dd4Var.f0(1721537158);
            boolean zIsEmpty = ((ppa) br9Var.getValue()).b.isEmpty();
            Object obj5 = vl1.a;
            if (zIsEmpty) {
                dd4Var.f0(1721549062);
                ou6 ou6VarK0 = gjb.k0(tg9.c, pj7Var);
                boolean zF = dd4Var.f(kn2Var);
                Object objQ = dd4Var.Q();
                if (zF || objQ == obj5) {
                    objQ = new jj6(kn2Var, 2);
                    dd4Var.p0(objQ);
                }
                h67.b0(0, (ib4) objQ, dd4Var, ou6VarK0);
                dd4Var.q(false);
                z = false;
            } else {
                dd4Var.f0(1721855900);
                List list = ((ppa) br9Var.getValue()).b;
                int i3 = i;
                px3 px3Var = tg9.c;
                boolean zF2 = dd4Var.f(rpaVar);
                Object objQ2 = dd4Var.Q();
                if (zF2 || objQ2 == obj5) {
                    objQ2 = new nx9(rpaVar, 9);
                    dd4Var.p0(objQ2);
                }
                kb4 kb4Var = (kb4) objQ2;
                boolean zF3 = dd4Var.f(kn2Var);
                Object objQ3 = dd4Var.Q();
                if (zF3 || objQ3 == obj5) {
                    objQ3 = new kb4() { // from class: hj6
                        @Override // defpackage.kb4
                        public final Object invoke(Object obj6) {
                            int i4 = i2;
                            heb hebVar = heb.a;
                            kn2 kn2Var2 = kn2Var;
                            switch (i4) {
                                case 0:
                                    ((Boolean) obj6).getClass();
                                    cn7 cn7Var = kn2Var2.a;
                                    Boolean bool = Boolean.FALSE;
                                    cn7Var.setValue(bool);
                                    kn2Var2.b.setValue("");
                                    kn2Var2.c.setValue(bool);
                                    break;
                                default:
                                    i6b i6bVar = (i6b) obj6;
                                    i6bVar.getClass();
                                    String str = i6bVar.c;
                                    boolean z2 = i6bVar.d;
                                    kn2Var2.getClass();
                                    str.getClass();
                                    kn2Var2.b.setValue(str);
                                    kn2Var2.c.setValue(Boolean.valueOf(z2));
                                    cn7 cn7Var2 = kn2Var2.d;
                                    Boolean bool2 = Boolean.TRUE;
                                    cn7Var2.setValue(bool2);
                                    kn2Var2.a.setValue(bool2);
                                    break;
                            }
                            return hebVar;
                        }
                    };
                    dd4Var.p0(objQ3);
                }
                h67.a0(list, pj7Var, px3Var, kb4Var, (kb4) objQ3, dd4Var, (i3 & Token.ASSIGN_MOD) | 384);
                ou6 ou6VarL0 = gjb.l0(yib.B(yn0Var.a(lu6.a, bv4.v), 15), 12.0f);
                long j = ((q96) dd4Var.j(s96.a)).a.h;
                boolean zF4 = dd4Var.f(kn2Var);
                Object objQ4 = dd4Var.Q();
                if (zF4 || objQ4 == obj5) {
                    objQ4 = new jj6(kn2Var, 3);
                    dd4Var.p0(objQ4);
                }
                z = false;
                ww1.g((ib4) objQ4, ou6VarL0, null, j, 0L, null, t1c.t, dd4Var, 12582912, Token.COLON);
                dd4Var.q(false);
            }
            dd4Var.q(z);
        }
        return heb.a;
    }

    private final Object u(Object obj, Object obj2, Object obj3, Object obj4) {
        fu6 fu6Var;
        csa csaVar = (csa) this.b;
        t27 t27Var = (t27) this.c;
        br9 br9Var = (br9) this.d;
        pj7 pj7Var = (pj7) obj2;
        dd4 dd4Var = (dd4) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((yn0) obj).getClass();
        pj7Var.getClass();
        if ((iIntValue & 48) == 0) {
            iIntValue |= dd4Var.f(pj7Var) ? 32 : 16;
        }
        int i = iIntValue;
        if (dd4Var.V(i & 1, (i & Token.TARGET) != 144)) {
            px3 px3Var = tg9.c;
            wra wraVar = (wra) br9Var.getValue();
            boolean zF = dd4Var.f(csaVar);
            Object objQ = dd4Var.Q();
            fu6 fu6Var2 = vl1.a;
            if (zF || objQ == fu6Var2) {
                s49 s49Var = new s49(1, csaVar, csa.class, "changeDarkMode", "changeDarkMode(I)V", 0, 18);
                dd4Var.p0(s49Var);
                objQ = s49Var;
            }
            ei5 ei5Var = (ei5) objQ;
            boolean zF2 = dd4Var.f(csaVar);
            Object objQ2 = dd4Var.Q();
            if (zF2 || objQ2 == fu6Var2) {
                s49 s49Var2 = new s49(1, csaVar, csa.class, "changeDynamicColor", "changeDynamicColor(Z)V", 0, 24);
                dd4Var.p0(s49Var2);
                objQ2 = s49Var2;
            }
            ei5 ei5Var2 = (ei5) objQ2;
            boolean zF3 = dd4Var.f(csaVar);
            Object objQ3 = dd4Var.Q();
            if (zF3 || objQ3 == fu6Var2) {
                s49 s49Var3 = new s49(1, csaVar, csa.class, "changeAmoledMode", "changeAmoledMode(Z)V", 0, 25);
                dd4Var.p0(s49Var3);
                objQ3 = s49Var3;
            }
            ei5 ei5Var3 = (ei5) objQ3;
            boolean zF4 = dd4Var.f(csaVar);
            Object objQ4 = dd4Var.Q();
            if (zF4 || objQ4 == fu6Var2) {
                s49 s49Var4 = new s49(1, csaVar, csa.class, "changeEInkMode", "changeEInkMode(Z)V", 0, 26);
                dd4Var.p0(s49Var4);
                objQ4 = s49Var4;
            }
            ei5 ei5Var4 = (ei5) objQ4;
            boolean zF5 = dd4Var.f(csaVar);
            Object objQ5 = dd4Var.Q();
            if (zF5 || objQ5 == fu6Var2) {
                s49 s49Var5 = new s49(1, csaVar, csa.class, "changeSwipeBack", "changeSwipeBack(I)V", 0, 27);
                dd4Var.p0(s49Var5);
                objQ5 = s49Var5;
            }
            ei5 ei5Var5 = (ei5) objQ5;
            boolean zF6 = dd4Var.f(t27Var);
            Object objQ6 = dd4Var.Q();
            if (zF6 || objQ6 == fu6Var2) {
                fu6Var = fu6Var2;
                m98 m98Var = new m98(0, t27Var, m79.class, "navigateToSettingFont", "navigateToSettingFont(Lcom/core/navigation/NavBackStack;)V", 1, 28);
                dd4Var.p0(m98Var);
                objQ6 = m98Var;
            } else {
                fu6Var = fu6Var2;
            }
            ei5 ei5Var6 = (ei5) objQ6;
            boolean zF7 = dd4Var.f(csaVar);
            Object objQ7 = dd4Var.Q();
            if (zF7 || objQ7 == fu6Var) {
                s49 s49Var6 = new s49(1, csaVar, csa.class, "changeColorScheme", "changeColorScheme(Lcom/reader/data/setting/model/ThemeColor;)V", 0, 28);
                dd4Var.p0(s49Var6);
                objQ7 = s49Var6;
            }
            ei5 ei5Var7 = (ei5) objQ7;
            boolean zF8 = dd4Var.f(csaVar);
            Object objQ8 = dd4Var.Q();
            if (zF8 || objQ8 == fu6Var) {
                s49 s49Var7 = new s49(1, csaVar, csa.class, "changeThemeColorStyle", "changeThemeColorStyle(I)V", 0, 29);
                dd4Var.p0(s49Var7);
                objQ8 = s49Var7;
            }
            ei5 ei5Var8 = (ei5) objQ8;
            boolean zF9 = dd4Var.f(csaVar);
            Object objQ9 = dd4Var.Q();
            if (zF9 || objQ9 == fu6Var) {
                vra vraVar = new vra(1, csaVar, csa.class, "changeContractLevel", "changeContractLevel(F)V", 0, 0);
                dd4Var.p0(vraVar);
                objQ9 = vraVar;
            }
            ei5 ei5Var9 = (ei5) objQ9;
            boolean zF10 = dd4Var.f(csaVar);
            Object objQ10 = dd4Var.Q();
            if (zF10 || objQ10 == fu6Var) {
                s49 s49Var8 = new s49(1, csaVar, csa.class, "addThemeColor", "addThemeColor(Ljava/lang/String;)V", 0, 19);
                dd4Var.p0(s49Var8);
                objQ10 = s49Var8;
            }
            ei5 ei5Var10 = (ei5) objQ10;
            boolean zF11 = dd4Var.f(csaVar);
            Object objQ11 = dd4Var.Q();
            if (zF11 || objQ11 == fu6Var) {
                s49 s49Var9 = new s49(1, csaVar, csa.class, "editThemeColor", "editThemeColor(Ljava/lang/String;)V", 0, 20);
                dd4Var.p0(s49Var9);
                objQ11 = s49Var9;
            }
            ei5 ei5Var11 = (ei5) objQ11;
            boolean zF12 = dd4Var.f(csaVar);
            Object objQ12 = dd4Var.Q();
            if (zF12 || objQ12 == fu6Var) {
                s49 s49Var10 = new s49(1, csaVar, csa.class, "deleteThemeColor", "deleteThemeColor(Ljava/lang/String;)V", 0, 21);
                dd4Var.p0(s49Var10);
                objQ12 = s49Var10;
            }
            ei5 ei5Var12 = (ei5) objQ12;
            boolean zF13 = dd4Var.f(csaVar);
            Object objQ13 = dd4Var.Q();
            if (zF13 || objQ13 == fu6Var) {
                s49 s49Var11 = new s49(1, csaVar, csa.class, "changeThemeBackgroundImage", "changeThemeBackgroundImage(Lcom/core/io/KFile;)V", 0, 22);
                dd4Var.p0(s49Var11);
                objQ13 = s49Var11;
            }
            ei5 ei5Var13 = (ei5) objQ13;
            boolean zF14 = dd4Var.f(csaVar);
            Object objQ14 = dd4Var.Q();
            if (zF14 || objQ14 == fu6Var) {
                s49 s49Var12 = new s49(1, csaVar, csa.class, "changeThemeBackgroundImageAlpha", "changeThemeBackgroundImageAlpha(F)V", 0, 23);
                dd4Var.p0(s49Var12);
                objQ14 = s49Var12;
            }
            vm7.C(wraVar, px3Var, pj7Var, (kb4) ei5Var, (kb4) ei5Var2, (kb4) ei5Var3, (kb4) ei5Var4, (kb4) ei5Var5, (ib4) ei5Var6, (kb4) ei5Var7, (kb4) ei5Var8, (kb4) ei5Var9, (kb4) ei5Var10, (kb4) ei5Var11, (kb4) ei5Var12, (kb4) ei5Var13, (kb4) ((ei5) objQ14), dd4Var, ((i << 3) & 896) | 48);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object v(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        t83 t83Var = (t83) this.b;
        yva yvaVar = (yva) this.c;
        br9 br9Var = (br9) this.d;
        yn0 yn0Var = (yn0) obj;
        pj7 pj7Var = (pj7) obj2;
        dd4 dd4Var = (dd4) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        yn0Var.getClass();
        pj7Var.getClass();
        if ((iIntValue & 6) == 0) {
            i = (dd4Var.f(yn0Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= dd4Var.f(pj7Var) ? 32 : 16;
        }
        if (!dd4Var.V(i & 1, (i & Token.EXPR_VOID) != 146)) {
            dd4Var.Y();
        } else if (((xva) br9Var.getValue()).a) {
            dd4Var.f0(813634662);
            dd4Var.q(false);
        } else {
            boolean zIsEmpty = ((xva) br9Var.getValue()).b.isEmpty();
            Object obj5 = vl1.a;
            if (zIsEmpty) {
                dd4Var.f0(813693500);
                ou6 ou6VarK0 = gjb.k0(tg9.c, pj7Var);
                boolean zF = dd4Var.f(t83Var);
                Object objQ = dd4Var.Q();
                if (zF || objQ == obj5) {
                    objQ = new hk6(t83Var, 1);
                    dd4Var.p0(objQ);
                }
                kl8.L(0, (ib4) objQ, dd4Var, ou6VarK0);
                dd4Var.q(false);
            } else {
                dd4Var.f0(814009762);
                List list = ((xva) br9Var.getValue()).b;
                int i2 = i;
                px3 px3Var = tg9.c;
                boolean zF2 = dd4Var.f(t83Var);
                Object objQ2 = dd4Var.Q();
                if (zF2 || objQ2 == obj5) {
                    objQ2 = new eh(t83Var, 9);
                    dd4Var.p0(objQ2);
                }
                ac4 ac4Var = (ac4) objQ2;
                boolean zF3 = dd4Var.f(yvaVar);
                Object objQ3 = dd4Var.Q();
                if (zF3 || objQ3 == obj5) {
                    objQ3 = new nx9(yvaVar, 11);
                    dd4Var.p0(objQ3);
                }
                kl8.K(list, pj7Var, px3Var, ac4Var, (kb4) objQ3, dd4Var, (i2 & Token.ASSIGN_MOD) | 384);
                ou6 ou6VarL0 = gjb.l0(yib.B(yn0Var.a(lu6.a, bv4.v), 15), 12.0f);
                long j = ((q96) dd4Var.j(s96.a)).a.h;
                boolean zF4 = dd4Var.f(t83Var);
                Object objQ4 = dd4Var.Q();
                if (zF4 || objQ4 == obj5) {
                    objQ4 = new hk6(t83Var, 2);
                    dd4Var.p0(objQ4);
                }
                ww1.g((ib4) objQ4, ou6VarL0, null, j, 0L, null, p7c.v, dd4Var, 12582912, Token.COLON);
                dd4Var.q(false);
            }
        }
        return heb.a;
    }

    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v58, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v59 */
    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        ?? r4;
        nj5 nj5Var;
        t89 t89Var;
        int i2;
        int i3 = this.a;
        int i4 = 13;
        ou6 ou6Var = lu6.a;
        Object obj5 = vl1.a;
        heb hebVar = heb.a;
        Object obj6 = this.d;
        Object obj7 = this.c;
        Object obj8 = this.b;
        int i5 = 0;
        switch (i3) {
            case 0:
                rk0 rk0Var = (rk0) obj8;
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
                if (dd4Var.V(iIntValue & 1, (iIntValue & Token.TARGET) != 144)) {
                    List list = ((jk0) a07Var2.getValue()).e;
                    szb szbVarW = yib.w(yib.w(pj7Var, yib.d(14, dd4Var, false)), gjb.q(0.0f, 64.0f, 0.0f, 0.0f, 13));
                    px3 px3Var = tg9.c;
                    boolean zF = dd4Var.f(rk0Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj5) {
                        objQ = new sj0(rk0Var, 0);
                        dd4Var.p0(objQ);
                    }
                    kb4 kb4Var = (kb4) objQ;
                    boolean zF2 = dd4Var.f(rk0Var) | dd4Var.f(a07Var);
                    Object objQ2 = dd4Var.Q();
                    if (zF2 || objQ2 == obj5) {
                        objQ2 = new il6(6, rk0Var, a07Var);
                        dd4Var.p0(objQ2);
                    }
                    kl8.u(list, szbVarW, px3Var, kb4Var, (yb4) objQ2, dd4Var, 384);
                    if (((jk0) a07Var2.getValue()).a || !((jk0) a07Var2.getValue()).e.isEmpty()) {
                        dd4Var.f0(-1999923434);
                        dd4Var.q(false);
                    } else {
                        dd4Var.f0(-2000496500);
                        ou6 ou6VarK0 = gjb.k0(px3Var, yib.w(yib.w(pj7Var, yib.d(14, dd4Var, false)), gjb.q(0.0f, 64.0f, 0.0f, 0.0f, 13)));
                        ie1 ie1VarA = ge1.a(pv.e, bv4.A, dd4Var, 54);
                        int iHashCode = Long.hashCode(dd4Var.T);
                        lr7 lr7VarL = dd4Var.l();
                        ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarK0);
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
                        nha.c(wn9.K((pv9) eu9.y.getValue(), dd4Var), (ou6) null, 0L, (g60) null, wn9.x(20), (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(s96.a)).b.j, dd4Var, 24576, 0, 130030);
                        dd4Var.q(true);
                        dd4Var.q(false);
                    }
                    boolean z = ((jk0) a07Var2.getValue()).c;
                    boolean z2 = ((jk0) a07Var2.getValue()).d;
                    ou6 ou6VarB = yib.B(gjb.p0(gjb.k0(ou6Var, pj7Var), 16.0f, 0.0f, 8.0f, 0.0f, 10), 6);
                    boolean zF3 = dd4Var.f(rk0Var);
                    Object objQ3 = dd4Var.Q();
                    if (zF3 || objQ3 == obj5) {
                        objQ3 = new sj0(rk0Var, 2);
                        dd4Var.p0(objQ3);
                    }
                    kb4 kb4Var2 = (kb4) objQ3;
                    boolean zF4 = dd4Var.f(rk0Var);
                    Object objQ4 = dd4Var.Q();
                    if (zF4 || objQ4 == obj5) {
                        objQ4 = new sj0(rk0Var, 4);
                        dd4Var.p0(objQ4);
                    }
                    kl8.s(z, z2, ou6VarB, kb4Var2, (kb4) objQ4, dd4Var, 0);
                } else {
                    dd4Var.Y();
                }
                return hebVar;
            case 1:
                t27 t27Var = (t27) obj8;
                pj7 pj7Var2 = (pj7) obj7;
                szb szbVar = (szb) obj6;
                int iIntValue2 = ((Integer) obj2).intValue();
                dd4 dd4Var2 = (dd4) obj3;
                ((Integer) obj4).getClass();
                ((rk7) obj).getClass();
                if (iIntValue2 == 0) {
                    dd4Var2.f0(2042472660);
                    ah1.b(t27Var, pj7Var2, szbVar, null, false, tg9.c, dd4Var2, 196608, 24);
                    dd4Var2.q(false);
                } else if (iIntValue2 != 1) {
                    dd4Var2.f0(2043041479);
                    dd4Var2.q(false);
                } else {
                    dd4Var2.f0(2042764401);
                    fe.h(t27Var, pj7Var2, szbVar, null, false, tg9.c, dd4Var2, 196608, 24);
                    dd4Var2.q(false);
                }
                return hebVar;
            case 2:
                mo1 mo1Var = (mo1) obj8;
                t27 t27Var2 = (t27) obj7;
                br9 br9Var = (br9) obj6;
                pj7 pj7Var3 = (pj7) obj2;
                dd4 dd4Var3 = (dd4) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((yn0) obj).getClass();
                pj7Var3.getClass();
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= dd4Var3.f(pj7Var3) ? 32 : 16;
                }
                if (dd4Var3.V(iIntValue3 & 1, (iIntValue3 & Token.TARGET) != 144)) {
                    no1 no1Var = (no1) br9Var.getValue();
                    px3 px3Var2 = tg9.c;
                    boolean zF5 = dd4Var3.f(mo1Var);
                    Object objQ5 = dd4Var3.Q();
                    if (zF5 || objQ5 == obj5) {
                        objQ5 = new x(1, mo1Var, mo1.class, "updateConnectionThread", "updateConnectionThread(I)V", 0, 25);
                        dd4Var3.p0(objQ5);
                    }
                    kb4 kb4Var3 = (kb4) ((ei5) objQ5);
                    boolean zF6 = dd4Var3.f(mo1Var);
                    Object objQ6 = dd4Var3.Q();
                    if (zF6 || objQ6 == obj5) {
                        objQ6 = new x(1, mo1Var, mo1.class, "updateConnectionDelay", "updateConnectionDelay(I)V", 0, 26);
                        dd4Var3.p0(objQ6);
                    }
                    kb4 kb4Var4 = (kb4) ((ei5) objQ6);
                    boolean zF7 = dd4Var3.f(mo1Var);
                    Object objQ7 = dd4Var3.Q();
                    if (zF7 || objQ7 == obj5) {
                        objQ7 = new x(1, mo1Var, mo1.class, "updateConnectionRetry", "updateConnectionRetry(I)V", 0, 27);
                        dd4Var3.p0(objQ7);
                    }
                    kb4 kb4Var5 = (kb4) ((ei5) objQ7);
                    boolean zF8 = dd4Var3.f(t27Var2);
                    Object objQ8 = dd4Var3.Q();
                    if (zF8 || objQ8 == obj5) {
                        objQ8 = new z6(t27Var2, 14);
                        dd4Var3.p0(objQ8);
                    }
                    md2.b(no1Var, pj7Var3, px3Var2, kb4Var3, kb4Var4, kb4Var5, null, null, (ib4) objQ8, dd4Var3, (iIntValue3 & Token.ASSIGN_MOD) | 384);
                } else {
                    dd4Var3.Y();
                }
                return hebVar;
            case 3:
                o83 o83Var = (o83) obj8;
                xz2 xz2Var = (xz2) obj7;
                br9 br9Var2 = (br9) obj6;
                yn0 yn0Var = (yn0) obj;
                pj7 pj7Var4 = (pj7) obj2;
                dd4 dd4Var4 = (dd4) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                yn0Var.getClass();
                pj7Var4.getClass();
                if ((iIntValue4 & 6) == 0) {
                    i = iIntValue4 | (dd4Var4.f(yn0Var) ? 4 : 2);
                } else {
                    i = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i |= dd4Var4.f(pj7Var4) ? 32 : 16;
                }
                if (!dd4Var4.V(i & 1, (i & Token.EXPR_VOID) != 146)) {
                    dd4Var4.Y();
                } else if (((vz2) br9Var2.getValue()).a) {
                    dd4Var4.f0(722117805);
                    dd4Var4.q(false);
                } else if (((vz2) br9Var2.getValue()).b.isEmpty()) {
                    dd4Var4.f0(722182533);
                    ou6 ou6VarK02 = gjb.k0(tg9.c, pj7Var4);
                    boolean zF9 = dd4Var4.f(o83Var);
                    Object objQ9 = dd4Var4.Q();
                    if (zF9 || objQ9 == obj5) {
                        r4 = 0;
                        objQ9 = new qz2(o83Var, 0);
                        dd4Var4.p0(objQ9);
                    } else {
                        r4 = 0;
                    }
                    ah1.o(r4, (ib4) objQ9, dd4Var4, ou6VarK02);
                    dd4Var4.q((boolean) r4);
                } else {
                    dd4Var4.f0(722496687);
                    List list2 = ((vz2) br9Var2.getValue()).b;
                    px3 px3Var3 = tg9.c;
                    boolean zF10 = dd4Var4.f(o83Var);
                    Object objQ10 = dd4Var4.Q();
                    if (zF10 || objQ10 == obj5) {
                        objQ10 = new sz2(o83Var, 0);
                        dd4Var4.p0(objQ10);
                    }
                    yb4 yb4Var = (yb4) objQ10;
                    boolean zF11 = dd4Var4.f(xz2Var);
                    Object objQ11 = dd4Var4.Q();
                    if (zF11 || objQ11 == obj5) {
                        objQ11 = new rz2(xz2Var, 1);
                        dd4Var4.p0(objQ11);
                    }
                    ah1.n(list2, pj7Var4, px3Var3, yb4Var, (kb4) objQ11, dd4Var4, (i & Token.ASSIGN_MOD) | 384);
                    ou6 ou6VarL02 = gjb.l0(yib.B(yn0Var.a(ou6Var, bv4.v), 15), 12.0f);
                    long j = ((q96) dd4Var4.j(s96.a)).a.h;
                    boolean zF12 = dd4Var4.f(o83Var);
                    Object objQ12 = dd4Var4.Q();
                    if (zF12 || objQ12 == obj5) {
                        objQ12 = new qz2(o83Var, 1);
                        dd4Var4.p0(objQ12);
                    }
                    ww1.g((ib4) objQ12, ou6VarL02, null, j, 0L, null, jf0.i, dd4Var4, 12582912, Token.COLON);
                    dd4Var4.q(false);
                }
                return hebVar;
            case 4:
                String str = (String) obj8;
                n83 n83Var = (n83) obj6;
                a07 a07Var3 = (a07) obj7;
                pj7 pj7Var5 = (pj7) obj2;
                dd4 dd4Var5 = (dd4) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                ((yn0) obj).getClass();
                pj7Var5.getClass();
                if ((iIntValue5 & 48) == 0) {
                    iIntValue5 |= dd4Var5.f(pj7Var5) ? 32 : 16;
                }
                if (!dd4Var5.V(iIntValue5 & 1, (iIntValue5 & Token.TARGET) != 144)) {
                    dd4Var5.Y();
                } else if (((m83) a07Var3.getValue()).a) {
                    dd4Var5.f0(-1224321692);
                    dd4Var5.q(false);
                } else {
                    dd4Var5.f0(-1224753181);
                    String str2 = ((m83) a07Var3.getValue()).b;
                    String str3 = ((m83) a07Var3.getValue()).c;
                    String str4 = ((m83) a07Var3.getValue()).d;
                    ou6 ou6VarE = yib.E(gjb.k0(tg9.c, pj7Var5), 14);
                    boolean zF13 = dd4Var5.f(n83Var);
                    Object objQ13 = dd4Var5.Q();
                    if (zF13 || objQ13 == obj5) {
                        objQ13 = new vx2(4, n83Var, n83.class, "editBook", "editBook(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/core/io/KFile;)V", 0, 1);
                        dd4Var5.p0(objQ13);
                    }
                    kc5.d(str, str2, str3, str4, ou6VarE, (ac4) ((ei5) objQ13), dd4Var5, 0);
                    dd4Var5.q(false);
                }
                return hebVar;
            case 5:
                a07 a07Var4 = (a07) obj7;
                pp3 pp3Var = (pp3) obj8;
                br9 br9Var3 = (br9) obj6;
                pj7 pj7Var6 = (pj7) obj2;
                dd4 dd4Var6 = (dd4) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                ((yn0) obj).getClass();
                pj7Var6.getClass();
                if ((iIntValue6 & 48) == 0) {
                    iIntValue6 |= dd4Var6.f(pj7Var6) ? 32 : 16;
                }
                if (dd4Var6.V(iIntValue6 & 1, (iIntValue6 & Token.TARGET) != 144)) {
                    op3 op3Var = (op3) br9Var3.getValue();
                    szb szbVarW2 = yib.w(pj7Var6, yib.d(14, dd4Var6, false));
                    px3 px3Var4 = tg9.c;
                    boolean zF14 = dd4Var6.f(a07Var4);
                    Object objQ14 = dd4Var6.Q();
                    if (zF14 || objQ14 == obj5) {
                        objQ14 = new zl3(a07Var4, 6);
                        dd4Var6.p0(objQ14);
                    }
                    ib4 ib4Var = (ib4) objQ14;
                    boolean zF15 = dd4Var6.f(pp3Var);
                    Object objQ15 = dd4Var6.Q();
                    if (zF15 || objQ15 == obj5) {
                        objQ15 = new mp3(pp3Var, 1);
                        dd4Var6.p0(objQ15);
                    }
                    sdc.l(op3Var, szbVarW2, px3Var4, ib4Var, (kb4) objQ15, dd4Var6, 384);
                } else {
                    dd4Var6.Y();
                }
                return hebVar;
            case 6:
                final s74 s74Var = (s74) obj8;
                t27 t27Var3 = (t27) obj7;
                br9 br9Var4 = (br9) obj6;
                pj7 pj7Var7 = (pj7) obj2;
                dd4 dd4Var7 = (dd4) obj3;
                int iIntValue7 = ((Integer) obj4).intValue();
                ((yn0) obj).getClass();
                pj7Var7.getClass();
                if ((iIntValue7 & 48) == 0) {
                    iIntValue7 |= dd4Var7.f(pj7Var7) ? 32 : 16;
                }
                if (dd4Var7.V(iIntValue7 & 1, (iIntValue7 & Token.TARGET) != 144)) {
                    p74 p74Var = (p74) br9Var4.getValue();
                    px3 px3Var5 = tg9.c;
                    boolean zF16 = dd4Var7.f(s74Var);
                    Object objQ16 = dd4Var7.Q();
                    if (zF16 || objQ16 == obj5) {
                        final int i6 = 0;
                        objQ16 = new kb4() { // from class: o74
                            @Override // defpackage.kb4
                            public final Object invoke(Object obj9) {
                                int i7 = i6;
                                heb hebVar2 = heb.a;
                                s74 s74Var2 = s74Var;
                                switch (i7) {
                                    case 0:
                                        String str5 = (String) obj9;
                                        str5.getClass();
                                        qtb.h(s74Var2, vtb.a(s74Var2), new pg(s74Var2, str5, null, 13));
                                        break;
                                    case 1:
                                        qtb.h(s74Var2, vtb.a(s74Var2), new r74(s74Var2, ((Float) obj9).floatValue(), null, 1));
                                        break;
                                    default:
                                        qtb.h(s74Var2, vtb.a(s74Var2), new r74(s74Var2, ((Float) obj9).floatValue(), null, 0));
                                        break;
                                }
                                return hebVar2;
                            }
                        };
                        dd4Var7.p0(objQ16);
                    }
                    kb4 kb4Var6 = (kb4) objQ16;
                    boolean zF17 = dd4Var7.f(s74Var);
                    Object objQ17 = dd4Var7.Q();
                    if (zF17 || objQ17 == obj5) {
                        final int i7 = 1;
                        objQ17 = new kb4() { // from class: o74
                            @Override // defpackage.kb4
                            public final Object invoke(Object obj9) {
                                int i72 = i7;
                                heb hebVar2 = heb.a;
                                s74 s74Var2 = s74Var;
                                switch (i72) {
                                    case 0:
                                        String str5 = (String) obj9;
                                        str5.getClass();
                                        qtb.h(s74Var2, vtb.a(s74Var2), new pg(s74Var2, str5, null, 13));
                                        break;
                                    case 1:
                                        qtb.h(s74Var2, vtb.a(s74Var2), new r74(s74Var2, ((Float) obj9).floatValue(), null, 1));
                                        break;
                                    default:
                                        qtb.h(s74Var2, vtb.a(s74Var2), new r74(s74Var2, ((Float) obj9).floatValue(), null, 0));
                                        break;
                                }
                                return hebVar2;
                            }
                        };
                        dd4Var7.p0(objQ17);
                    }
                    kb4 kb4Var7 = (kb4) objQ17;
                    boolean zF18 = dd4Var7.f(s74Var);
                    Object objQ18 = dd4Var7.Q();
                    if (zF18 || objQ18 == obj5) {
                        final int i8 = 2;
                        objQ18 = new kb4() { // from class: o74
                            @Override // defpackage.kb4
                            public final Object invoke(Object obj9) {
                                int i72 = i8;
                                heb hebVar2 = heb.a;
                                s74 s74Var2 = s74Var;
                                switch (i72) {
                                    case 0:
                                        String str5 = (String) obj9;
                                        str5.getClass();
                                        qtb.h(s74Var2, vtb.a(s74Var2), new pg(s74Var2, str5, null, 13));
                                        break;
                                    case 1:
                                        qtb.h(s74Var2, vtb.a(s74Var2), new r74(s74Var2, ((Float) obj9).floatValue(), null, 1));
                                        break;
                                    default:
                                        qtb.h(s74Var2, vtb.a(s74Var2), new r74(s74Var2, ((Float) obj9).floatValue(), null, 0));
                                        break;
                                }
                                return hebVar2;
                            }
                        };
                        dd4Var7.p0(objQ18);
                    }
                    kb4 kb4Var8 = (kb4) objQ18;
                    boolean zF19 = dd4Var7.f(t27Var3);
                    Object objQ19 = dd4Var7.Q();
                    if (zF19 || objQ19 == obj5) {
                        objQ19 = new zf3(t27Var3, i4);
                        dd4Var7.p0(objQ19);
                    }
                    h67.w(p74Var, px3Var5, pj7Var7, kb4Var6, kb4Var7, kb4Var8, (ib4) objQ19, dd4Var7, ((iIntValue7 << 3) & 896) | 48);
                } else {
                    dd4Var7.Y();
                }
                return hebVar;
            case 7:
                m56 m56Var = (m56) obj8;
                t27 t27Var4 = (t27) obj7;
                br9 br9Var5 = (br9) obj6;
                pj7 pj7Var8 = (pj7) obj2;
                dd4 dd4Var8 = (dd4) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                xf0 xf0Var = bv4.f;
                ((yn0) obj).getClass();
                pj7Var8.getClass();
                if ((iIntValue8 & 48) == 0) {
                    iIntValue8 |= dd4Var8.f(pj7Var8) ? 32 : 16;
                }
                int i9 = iIntValue8;
                if (!dd4Var8.V(i9 & 1, (i9 & Token.TARGET) != 144)) {
                    dd4Var8.Y();
                    return hebVar;
                }
                Object[] objArr = new Object[0];
                Object objQ20 = dd4Var8.Q();
                if (objQ20 == obj5) {
                    objQ20 = new z16(12);
                    dd4Var8.p0(objQ20);
                }
                a07 a07Var5 = (a07) ww1.b0(objArr, (ib4) objQ20, dd4Var8, 48);
                Object[] objArr2 = new Object[0];
                Object objQ21 = dd4Var8.Q();
                if (objQ21 == obj5) {
                    objQ21 = new z16(13);
                    dd4Var8.p0(objQ21);
                }
                a07 a07Var6 = (a07) ww1.b0(objArr2, (ib4) objQ21, dd4Var8, 48);
                Object[] objArr3 = new Object[0];
                Object objQ22 = dd4Var8.Q();
                if (objQ22 == obj5) {
                    objQ22 = new z16(14);
                    dd4Var8.p0(objQ22);
                }
                a07 a07Var7 = (a07) ww1.b0(objArr3, (ib4) objQ22, dd4Var8, 48);
                Object objQ23 = dd4Var8.Q();
                if (objQ23 == obj5) {
                    objQ23 = ky0.f(dd4Var8);
                }
                z44 z44Var = (z44) objQ23;
                u90 u90Var = (u90) dd4Var8.j(xm1.d);
                ou6 ou6VarL03 = gjb.l0(kc5.Q(yn2.E(gjb.k0(yib.E(tg9.c, 14), pj7Var8), dd4Var8, 0), kc5.J(dd4Var8), 14), 24.0f);
                ie1 ie1VarA2 = ge1.a(pv.d, bv4.z, dd4Var8, 6);
                int iHashCode2 = Long.hashCode(dd4Var8.T);
                lr7 lr7VarL2 = dd4Var8.l();
                ou6 ou6VarL04 = s32.L0(dd4Var8, ou6VarL03);
                ml1.k.getClass();
                um1 um1Var2 = ll1.b;
                dd4Var8.j0();
                if (dd4Var8.S) {
                    dd4Var8.k(um1Var2);
                } else {
                    dd4Var8.s0();
                }
                jm jmVar = ll1.f;
                un9.s(jmVar, dd4Var8, ie1VarA2);
                jm jmVar2 = ll1.e;
                un9.s(jmVar2, dd4Var8, lr7VarL2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                jm jmVar3 = ll1.g;
                un9.s(jmVar3, dd4Var8, numValueOf);
                kd kdVar = ll1.h;
                un9.r(dd4Var8, kdVar);
                jm jmVar4 = ll1.d;
                un9.s(jmVar4, dd4Var8, ou6VarL04);
                String str5 = (String) a07Var5.getValue();
                qj5 qj5Var = new qj5(6, 6, Token.HOOK);
                Object objQ24 = dd4Var8.Q();
                if (objQ24 == obj5) {
                    objQ24 = new k56(z44Var, 0);
                    dd4Var8.p0(objQ24);
                }
                nj5 nj5Var2 = new nj5((kb4) objQ24, (kb4) null, 59);
                uw1 uw1Var = s00.p(dd4Var8).b;
                ou6 ou6VarF = tg9.f(ou6Var, 1.0f);
                Object objQ25 = dd4Var8.Q();
                if (objQ25 == obj5) {
                    nj5Var = nj5Var2;
                    objQ25 = new rv5(19);
                    dd4Var8.p0(objQ25);
                } else {
                    nj5Var = nj5Var2;
                }
                ou6 ou6VarC = a29.c(ou6VarF, false, (kb4) objQ25);
                boolean zF20 = dd4Var8.f(a07Var5);
                Object objQ26 = dd4Var8.Q();
                if (zF20 || objQ26 == obj5) {
                    objQ26 = new tn4(a07Var5, 26);
                    dd4Var8.p0(objQ26);
                }
                lx1.m(str5, (kb4) objQ26, ou6VarC, false, false, null, vo1.e, null, vo1.f, null, false, null, qj5Var, nj5Var, true, 0, 0, uw1Var, null, dd4Var8, 102236160, 12779520, 6061752);
                String str6 = (String) tw2.l(ou6Var, 12.0f, dd4Var8, a07Var6);
                qj5 qj5Var2 = new qj5(7, 7, Token.HOOK);
                boolean zF21 = dd4Var8.f(m56Var) | dd4Var8.f(a07Var5) | dd4Var8.f(a07Var6);
                Object objQ27 = dd4Var8.Q();
                if (zF21 || objQ27 == obj5) {
                    objQ27 = new fb3(7, m56Var, a07Var5, a07Var6);
                    dd4Var8.p0(objQ27);
                }
                nj5 nj5Var3 = new nj5((kb4) objQ27, (kb4) null, 59);
                yub wn7Var = ((Boolean) a07Var7.getValue()).booleanValue() ? js8.y : new wn7();
                t89 t89Var2 = s00.p(dd4Var8).b;
                ou6 ou6VarF2 = tg9.f(ou6Var, 1.0f);
                Object objQ28 = dd4Var8.Q();
                if (objQ28 == obj5) {
                    t89Var = t89Var2;
                    objQ28 = new rv5(20);
                    dd4Var8.p0(objQ28);
                } else {
                    t89Var = t89Var2;
                }
                ou6 ou6VarB2 = jv3.B(a29.c(ou6VarF2, false, (kb4) objQ28), z44Var);
                boolean zF22 = dd4Var8.f(a07Var6);
                Object objQ29 = dd4Var8.Q();
                if (zF22 || objQ29 == obj5) {
                    objQ29 = new tn4(a07Var6, 25);
                    dd4Var8.p0(objQ29);
                }
                lx1.m(str6, (kb4) objQ29, ou6VarB2, false, false, null, vo1.g, null, vo1.h, jf0.G(-947903221, new kq2(a07Var7, 5), dd4Var8), false, wn7Var, qj5Var2, nj5Var3, true, 0, 0, t89Var, null, dd4Var8, 907542528, 12779520, 6044856);
                un9.a(dd4Var8, tg9.h(ou6Var, 8.0f));
                String strK = wn9.K((pv9) iu9.g.getValue(), dd4Var8);
                uka ukaVar = s00.q(dd4Var8).k;
                long j2 = s00.o(dd4Var8).a;
                vf0 vf0Var = bv4.B;
                xo4 xo4Var = new xo4(vf0Var);
                boolean zF23 = dd4Var8.f(t27Var4);
                Object objQ30 = dd4Var8.Q();
                if (zF23 || objQ30 == obj5) {
                    objQ30 = new zf3(t27Var4, 25);
                    dd4Var8.p0(objQ30);
                }
                nha.c(strK, fw.J(null, (ib4) objQ30, xo4Var, false, 15), j2, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var8, 0, 0, 131064);
                boolean z3 = ((String) tw2.l(ou6Var, 24.0f, dd4Var8, a07Var5)).length() > 0 && ((String) a07Var6.getValue()).length() > 0;
                ou6 ou6VarE2 = fe.L(t96.w(tg9.n(ou6Var, 56.0f), tp8.a), lc1.c(z3 ? 1.0f : 0.5f, s00.o(dd4Var8).a), jf0.G).e(new xo4(vf0Var));
                boolean zH = dd4Var8.h(u90Var) | dd4Var8.f(m56Var) | dd4Var8.f(a07Var5) | dd4Var8.f(a07Var6);
                Object objQ31 = dd4Var8.Q();
                if (zH || objQ31 == obj5) {
                    objQ31 = new wp0((Object) u90Var, (Object) m56Var, a07Var5, a07Var6, 7);
                    dd4Var8.p0(objQ31);
                }
                ou6 ou6VarJ = fw.J(null, (ib4) objQ31, ou6VarE2, z3, 14);
                ha6 ha6VarD = pn0.d(bv4.b, false);
                int iHashCode3 = Long.hashCode(dd4Var8.T);
                lr7 lr7VarL3 = dd4Var8.l();
                ou6 ou6VarL05 = s32.L0(dd4Var8, ou6VarJ);
                dd4Var8.j0();
                if (dd4Var8.S) {
                    dd4Var8.k(um1Var2);
                } else {
                    dd4Var8.s0();
                }
                un9.s(jmVar, dd4Var8, ha6VarD);
                un9.s(jmVar2, dd4Var8, lr7VarL3);
                ky0.v(iHashCode3, dd4Var8, jmVar3, dd4Var8, kdVar);
                un9.s(jmVar4, dd4Var8, ou6VarL05);
                boolean z4 = ((l56) br9Var5.getValue()).a;
                zn0 zn0Var = zn0.a;
                if (z4) {
                    dd4Var8.f0(1078191165);
                    sdc.y(zn0Var.a(tg9.n(ou6Var, 24.0f), xf0Var), s00.o(dd4Var8).b, null, dd4Var8, 0, 4);
                    dd4Var8.q(false);
                } else {
                    dd4Var8.f0(1078479434);
                    mx4.a(i25.c((m53) a53.d.getValue(), dd4Var8, 0), wn9.K((pv9) iu9.l0.getValue(), dd4Var8), sw1.i0(zn0Var.a(tg9.n(ou6Var, 24.0f), xf0Var), 180.0f), s00.o(dd4Var8).b, dd4Var8, 0, 0);
                    dd4Var8.q(false);
                }
                dd4Var8.q(true);
                dd4Var8.q(true);
                return hebVar;
            case 8:
                p83 p83Var = (p83) obj8;
                a76 a76Var = (a76) obj7;
                br9 br9Var6 = (br9) obj6;
                yn0 yn0Var2 = (yn0) obj;
                pj7 pj7Var9 = (pj7) obj2;
                dd4 dd4Var9 = (dd4) obj3;
                int iIntValue9 = ((Integer) obj4).intValue();
                yn0Var2.getClass();
                pj7Var9.getClass();
                if ((iIntValue9 & 6) == 0) {
                    i2 = iIntValue9 | (dd4Var9.f(yn0Var2) ? 4 : 2);
                } else {
                    i2 = iIntValue9;
                }
                if ((iIntValue9 & 48) == 0) {
                    i2 |= dd4Var9.f(pj7Var9) ? 32 : 16;
                }
                int i10 = i2;
                if (!dd4Var9.V(i10 & 1, (i10 & Token.EXPR_VOID) != 146)) {
                    dd4Var9.Y();
                } else if (((z66) br9Var6.getValue()).a) {
                    dd4Var9.f0(-1089495100);
                    dd4Var9.q(false);
                } else if (((z66) br9Var6.getValue()).b.isEmpty()) {
                    dd4Var9.f0(-1089438308);
                    ou6 ou6VarK03 = gjb.k0(tg9.c, pj7Var9);
                    boolean zF24 = dd4Var9.f(p83Var);
                    Object objQ32 = dd4Var9.Q();
                    if (zF24 || objQ32 == obj5) {
                        objQ32 = new u66(p83Var, 0);
                        dd4Var9.p0(objQ32);
                    }
                    jf0.i(0, (ib4) objQ32, dd4Var9, ou6VarK03);
                    dd4Var9.q(false);
                } else {
                    dd4Var9.f0(-1089124495);
                    List list3 = ((z66) br9Var6.getValue()).b;
                    px3 px3Var6 = tg9.c;
                    boolean zF25 = dd4Var9.f(p83Var);
                    Object objQ33 = dd4Var9.Q();
                    if (zF25 || objQ33 == obj5) {
                        objQ33 = new v66(p83Var, i5);
                        dd4Var9.p0(objQ33);
                    }
                    zb4 zb4Var = (zb4) objQ33;
                    boolean zF26 = dd4Var9.f(a76Var);
                    Object objQ34 = dd4Var9.Q();
                    if (zF26 || objQ34 == obj5) {
                        objQ34 = new zs5(a76Var, 6);
                        dd4Var9.p0(objQ34);
                    }
                    jf0.h(list3, pj7Var9, px3Var6, zb4Var, (kb4) objQ34, dd4Var9, (i10 & Token.ASSIGN_MOD) | 384);
                    ou6 ou6VarL06 = gjb.l0(yib.B(yn0Var2.a(ou6Var, bv4.v), 15), 12.0f);
                    long j3 = ((q96) dd4Var9.j(s96.a)).a.h;
                    boolean zF27 = dd4Var9.f(p83Var);
                    Object objQ35 = dd4Var9.Q();
                    if (zF27 || objQ35 == obj5) {
                        objQ35 = new u66(p83Var, 1);
                        dd4Var9.p0(objQ35);
                    }
                    ww1.g((ib4) objQ35, ou6VarL06, null, j3, 0L, null, fz1.g, dd4Var9, 12582912, Token.COLON);
                    dd4Var9.q(false);
                }
                return hebVar;
            case 9:
                return i(obj, obj2, obj3, obj4);
            case 10:
                return l(obj, obj2, obj3, obj4);
            case 11:
                return m(obj, obj2, obj3, obj4);
            case 12:
                return n(obj, obj2, obj3, obj4);
            case 13:
                return o(obj, obj2, obj3, obj4);
            case 14:
                return p(obj, obj2, obj3, obj4);
            case 15:
                return q(obj, obj2, obj3, obj4);
            case 16:
                return r(obj, obj2, obj3, obj4);
            case 17:
                return s(obj, obj2, obj3, obj4);
            case 18:
                return t(obj, obj2, obj3, obj4);
            case 19:
                return u(obj, obj2, obj3, obj4);
            case 20:
                return v(obj, obj2, obj3, obj4);
            case 21:
                int iIntValue10 = ((Integer) obj2).intValue();
                ((Integer) obj4).getClass();
                ((rk7) obj).getClass();
                fz1.I((String) obj8, ((erb) ((List) obj7).get(iIntValue10)).b, (kb4) obj6, tg9.c, (dd4) obj3, 3072);
                return hebVar;
            case 22:
                return a(obj, obj2, obj3, obj4);
            case 23:
                return b(obj, obj2, obj3, obj4);
            case 24:
                return d(obj, obj2, obj3, obj4);
            case 25:
                return f(obj, obj2, obj3, obj4);
            default:
                cs9 cs9Var = (cs9) obj8;
                kb4 kb4Var9 = (kb4) obj7;
                xr9 xr9Var = (xr9) obj6;
                int iIntValue11 = ((Integer) obj2).intValue();
                dd4 dd4Var10 = (dd4) obj3;
                ((Integer) obj4).intValue();
                ((rk7) obj).getClass();
                if (iIntValue11 == 0) {
                    dd4Var10.f0(888557655);
                    h67.Y(cs9Var, kb4Var9, xr9Var, dd4Var10, 0);
                    dd4Var10.q(false);
                } else if (iIntValue11 != 1) {
                    dd4Var10.f0(1775786959);
                    dd4Var10.q(false);
                } else {
                    dd4Var10.f0(888563585);
                    h67.D(cs9Var, xr9Var, dd4Var10, 0);
                    dd4Var10.q(false);
                }
                return hebVar;
        }
    }

    public /* synthetic */ ak0(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ ak0(int i, a07 a07Var, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.d = obj2;
        this.c = a07Var;
    }
}
