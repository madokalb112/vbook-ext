package defpackage;

import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sa3 implements ac4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ a07 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public sa3(List list, kb4 kb4Var, ib4 ib4Var, a07 a07Var, br9 br9Var) {
        this.a = 2;
        this.b = list;
        this.d = kb4Var;
        this.e = ib4Var;
        this.c = a07Var;
        this.f = br9Var;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        long jG;
        boolean z;
        dd4 dd4Var;
        boolean z2;
        int i = this.a;
        Object obj5 = vl1.a;
        lu6 lu6Var = lu6.a;
        a07 a07Var = this.c;
        heb hebVar = heb.a;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        List list = this.b;
        switch (i) {
            case 0:
                dr5 dr5Var = (dr5) obj;
                int iIntValue = ((Number) obj2).intValue();
                dd4 dd4Var2 = (dd4) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                wq5 wq5Var = (wq5) obj7;
                vx1 vx1Var = (vx1) obj8;
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | (dd4Var2.f(dr5Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= dd4Var2.d(iIntValue) ? 32 : 16;
                }
                if (!dd4Var2.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                    dd4Var2.Y();
                } else {
                    w93 w93Var = (w93) list.get(iIntValue);
                    dd4Var2.f0(935007347);
                    boolean zQ = lc5.Q((String) ((br9) obj6).getValue(), w93Var.a);
                    ou6 ou6VarW = t96.w(gjb.l0(tg9.n(lu6Var, 40.0f), 2.0f), rw1.k0(o96.a.p(), dd4Var2));
                    if (zQ) {
                        dd4Var2.f0(935278007);
                        jG = dd1.g(((q96) dd4Var2.j(s96.a)).a, 4.0f);
                        dd4Var2.q(false);
                    } else {
                        dd4Var2.f0(935400829);
                        dd4Var2.q(false);
                        jG = lc1.i;
                    }
                    ou6 ou6VarL = fe.L(ou6VarW, jG, jf0.G);
                    boolean zH = dd4Var2.h(vx1Var) | dd4Var2.f(wq5Var) | dd4Var2.h(w93Var);
                    Object objQ = dd4Var2.Q();
                    if (zH || objQ == obj5) {
                        objQ = new qa3(w93Var, vx1Var, wq5Var, a07Var);
                        dd4Var2.p0(objQ);
                    }
                    ou6 ou6VarL0 = gjb.l0(fw.J(null, (ib4) objQ, ou6VarL, false, 15), 6.0f);
                    ha6 ha6VarD = pn0.d(bv4.b, false);
                    int iHashCode = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL = dd4Var2.l();
                    ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarL0);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(um1Var);
                    } else {
                        dd4Var2.s0();
                    }
                    un9.s(ll1.f, dd4Var2, ha6VarD);
                    un9.s(ll1.e, dd4Var2, lr7VarL);
                    un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
                    un9.r(dd4Var2, ll1.h);
                    un9.s(ll1.d, dd4Var2, ou6VarL02);
                    w05.a(w93Var.b, ra1.e, false, null, fz1.c, tg9.c, null, dd4Var2, 1769520, 412);
                    dd4Var2.q(true);
                    dd4Var2.q(false);
                }
                break;
            case 1:
                dr5 dr5Var2 = (dr5) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                dd4 dd4Var3 = (dd4) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i3 = (iIntValue4 & 6) == 0 ? iIntValue4 | (dd4Var3.f(dr5Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i3 |= dd4Var3.d(iIntValue3) ? 32 : 16;
                }
                if (!dd4Var3.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
                    dd4Var3.Y();
                } else {
                    az2 az2Var = (az2) list.get(iIntValue3);
                    dd4Var3.f0(-343104461);
                    lx1.p(dr5Var2, (pj8) obj8, az2Var.a, null, false, null, jf0.G(-1531813331, new l90((yb4) obj7, az2Var, (kb4) obj6, this.c, 3), dd4Var3), dd4Var3, (i3 & 14) | 1572864, 28);
                    dd4Var3.q(false);
                }
                break;
            case 2:
                dr5 dr5Var3 = (dr5) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                dd4 dd4Var4 = (dd4) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                ib4 ib4Var = (ib4) obj7;
                kb4 kb4Var = (kb4) obj8;
                br9 br9Var = (br9) obj6;
                int i4 = (iIntValue6 & 6) == 0 ? iIntValue6 | (dd4Var4.f(dr5Var3) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i4 |= dd4Var4.d(iIntValue5) ? 32 : 16;
                }
                if (!dd4Var4.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
                    dd4Var4.Y();
                } else {
                    bi5 bi5Var = (bi5) list.get(iIntValue5);
                    dd4Var4.f0(1787623097);
                    ou6 ou6VarN0 = gjb.n0(tg9.f(lu6Var, 1.0f), 12.0f, 0.0f, 2);
                    eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var4, 48);
                    int iHashCode2 = Long.hashCode(dd4Var4.T);
                    lr7 lr7VarL2 = dd4Var4.l();
                    ou6 ou6VarL03 = s32.L0(dd4Var4, ou6VarN0);
                    ml1.k.getClass();
                    um1 um1Var2 = ll1.b;
                    dd4Var4.j0();
                    if (dd4Var4.S) {
                        dd4Var4.k(um1Var2);
                    } else {
                        dd4Var4.s0();
                    }
                    un9.s(ll1.f, dd4Var4, eq8VarA);
                    un9.s(ll1.e, dd4Var4, lr7VarL2);
                    un9.s(ll1.g, dd4Var4, Integer.valueOf(iHashCode2));
                    un9.r(dd4Var4, ll1.h);
                    un9.s(ll1.d, dd4Var4, ou6VarL03);
                    boolean zF = dd4Var4.f((List) a07Var.getValue()) | dd4Var4.f(bi5Var);
                    Object objQ2 = dd4Var4.Q();
                    if (zF || objQ2 == obj5) {
                        List list2 = (List) a07Var.getValue();
                        if (list2 == null || !list2.isEmpty()) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                if (lc5.Q(((bi5) it.next()).b(), bi5Var.b())) {
                                    z = true;
                                    objQ2 = Boolean.valueOf(z);
                                    dd4Var4.p0(objQ2);
                                }
                            }
                            z = false;
                            objQ2 = Boolean.valueOf(z);
                            dd4Var4.p0(objQ2);
                        } else {
                            z = false;
                            objQ2 = Boolean.valueOf(z);
                            dd4Var4.p0(objQ2);
                        }
                    }
                    boolean zBooleanValue = ((Boolean) objQ2).booleanValue();
                    boolean zF2 = dd4Var4.f(((r55) br9Var.getValue()).a) | dd4Var4.f(bi5Var);
                    Object objQ3 = dd4Var4.Q();
                    if (zF2 || objQ3 == obj5) {
                        objQ3 = Boolean.valueOf(((r55) br9Var.getValue()).a.contains(bi5Var.b()));
                        dd4Var4.p0(objQ3);
                    }
                    boolean zBooleanValue2 = ((Boolean) objQ3).booleanValue();
                    boolean zF3 = dd4Var4.f(((r55) br9Var.getValue()).b) | dd4Var4.f(bi5Var);
                    Object objQ4 = dd4Var4.Q();
                    if (zF3 || objQ4 == obj5) {
                        objQ4 = Boolean.valueOf(((r55) br9Var.getValue()).b.contains(bi5Var.b()));
                        dd4Var4.p0(objQ4);
                    }
                    boolean zBooleanValue3 = ((Boolean) objQ4).booleanValue();
                    boolean zF4 = dd4Var4.f(((r55) br9Var.getValue()).c) | dd4Var4.f(bi5Var);
                    Object objQ5 = dd4Var4.Q();
                    if (zF4 || objQ5 == obj5) {
                        objQ5 = Boolean.valueOf(((r55) br9Var.getValue()).c.contains(bi5Var.b()));
                        dd4Var4.p0(objQ5);
                    }
                    boolean zBooleanValue4 = ((Boolean) objQ5).booleanValue();
                    boolean zF5 = dd4Var4.f(((r55) br9Var.getValue()).d) | dd4Var4.f(bi5Var);
                    Object objQ6 = dd4Var4.Q();
                    if (zF5 || objQ6 == obj5) {
                        objQ6 = (String) ((r55) br9Var.getValue()).d.get(bi5Var.b());
                        dd4Var4.p0(objQ6);
                    }
                    String str = (String) objQ6;
                    if (zBooleanValue4) {
                        dd4Var = dd4Var4;
                        dd4Var.f0(66694595);
                        dd4Var.q(false);
                    } else {
                        dd4Var4.f0(66228510);
                        boolean zF6 = dd4Var4.f(bi5Var);
                        Object objQ7 = dd4Var4.Q();
                        if (zF6 || objQ7 == obj5) {
                            objQ7 = new yq3(23, bi5Var, a07Var);
                            dd4Var4.p0(objQ7);
                        }
                        vo1.e(zBooleanValue, (kb4) objQ7, null, false, null, dd4Var4, 0);
                        dd4Var = dd4Var4;
                        dd4Var.q(false);
                    }
                    String name = bi5Var.getName();
                    ur9 ur9Var = s96.a;
                    nha.c(name, gjb.o0(new bp5(1.0f, true), zBooleanValue4 ? 0.0f : 12.0f, 8.0f, 12.0f, 8.0f), ((q96) dd4Var.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 2, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.j, dd4Var, 0, 24960, 110584);
                    if (zBooleanValue2) {
                        dd4Var.f0(67394699);
                        sdc.y(tg9.n(lu6Var, 24.0f), 0L, null, dd4Var, 6, 6);
                        dd4Var.q(false);
                        z2 = false;
                    } else if (zBooleanValue4) {
                        dd4Var.f0(67604724);
                        if (str != null) {
                            dd4Var.f0(67644249);
                            boolean zF7 = dd4Var.f(kb4Var) | dd4Var.f(str) | dd4Var.f(ib4Var);
                            Object objQ8 = dd4Var.Q();
                            if (zF7 || objQ8 == obj5) {
                                objQ8 = new k90(3, kb4Var, str, ib4Var);
                                dd4Var.p0(objQ8);
                            }
                            lc5.m((ib4) objQ8, tg9.h(lu6Var, 32.0f), false, null, null, null, null, dd4Var, 805306416);
                            z2 = false;
                            dd4Var.q(false);
                        } else {
                            z2 = false;
                            dd4Var.f0(68406632);
                            mx4.a(i25.c((m53) a53.v.getValue(), dd4Var, 0), (String) null, tg9.n(lu6Var, 24.0f), ((q96) dd4Var.j(ur9Var)).a.a, dd4Var, 432, 0);
                            dd4Var.q(false);
                        }
                        dd4Var.q(z2);
                    } else {
                        z2 = false;
                        if (zBooleanValue3) {
                            dd4Var.f0(68816638);
                            mx4.a(i25.c((m53) a53.R.getValue(), dd4Var, 0), (String) null, tg9.n(lu6Var, 24.0f), ((q96) dd4Var.j(ur9Var)).a.w, dd4Var, 432, 0);
                            dd4Var.q(false);
                        } else {
                            dd4Var.f0(69120035);
                            dd4Var.q(false);
                        }
                    }
                    dd4Var.q(true);
                    dd4Var.q(z2);
                }
                break;
            default:
                dr5 dr5Var4 = (dr5) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                dd4 dd4Var5 = (dd4) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                int i5 = (iIntValue8 & 6) == 0 ? iIntValue8 | (dd4Var5.f(dr5Var4) ? 4 : 2) : iIntValue8;
                if ((iIntValue8 & 48) == 0) {
                    i5 |= dd4Var5.d(iIntValue7) ? 32 : 16;
                }
                if (!dd4Var5.V(i5 & 1, (i5 & Token.EXPR_VOID) != 146)) {
                    dd4Var5.Y();
                } else {
                    dab dabVar = (dab) list.get(iIntValue7);
                    dd4Var5.f0(-912276151);
                    lx1.p(dr5Var4, (pj8) obj8, dabVar.a, null, false, null, jf0.G(-1686838816, new qb3(iIntValue7 == 0, iIntValue7 == gc1.S((List) a07Var.getValue()), (ac4) obj7, dabVar, (kb4) obj6, this.c, 3), dd4Var5), dd4Var5, (i5 & 14) | 1572864, 28);
                    dd4Var5.q(false);
                }
                break;
        }
        return hebVar;
    }

    public sa3(List list, pj8 pj8Var, a07 a07Var, ac4 ac4Var, kb4 kb4Var) {
        this.a = 3;
        this.b = list;
        this.d = pj8Var;
        this.c = a07Var;
        this.e = ac4Var;
        this.f = kb4Var;
    }

    public /* synthetic */ sa3(List list, Object obj, Object obj2, Object obj3, a07 a07Var, int i) {
        this.a = i;
        this.b = list;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = a07Var;
    }
}
