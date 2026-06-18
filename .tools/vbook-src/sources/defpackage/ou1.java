package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ou1 implements ac4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ ub4 c;
    public final /* synthetic */ ub4 d;
    public final /* synthetic */ ub4 e;
    public final /* synthetic */ kb4 f;
    public final /* synthetic */ kb4 s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    public ou1(List list, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, kb4 kb4Var4, kb4 kb4Var5, kb4 kb4Var6, kb4 kb4Var7) {
        this.a = 2;
        this.b = list;
        this.f = kb4Var;
        this.s = kb4Var2;
        this.c = kb4Var3;
        this.d = kb4Var4;
        this.e = kb4Var5;
        this.t = kb4Var6;
        this.u = kb4Var7;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        dd4 dd4Var;
        boolean z;
        Object obj5;
        Object obj6;
        dd4 dd4Var2;
        boolean z2;
        int i;
        Object obj7;
        int i2;
        Object obj8;
        ou6 ou6VarU;
        int i3 = this.a;
        heb hebVar = heb.a;
        lu6 lu6Var = lu6.a;
        List list = this.b;
        fu6 fu6Var = vl1.a;
        ub4 ub4Var = this.c;
        ub4 ub4Var2 = this.d;
        ub4 ub4Var3 = this.e;
        Object obj9 = this.t;
        Object obj10 = this.u;
        switch (i3) {
            case 0:
                ib4 ib4Var = (ib4) ub4Var3;
                dr5 dr5Var = (dr5) obj;
                int iIntValue = ((Number) obj2).intValue();
                dd4 dd4Var3 = (dd4) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                yb4 yb4Var = (yb4) ub4Var2;
                a07 a07Var = (a07) obj10;
                int i4 = (iIntValue2 & 6) == 0 ? iIntValue2 | (dd4Var3.f(dr5Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i4 |= dd4Var3.d(iIntValue) ? 32 : 16;
                }
                if (!dd4Var3.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
                    dd4Var3.Y();
                } else {
                    uj7 uj7Var = (uj7) list.get(iIntValue);
                    dd4Var3.f0(1441837038);
                    if (uj7Var instanceof j15) {
                        dd4Var3.f0(1441847732);
                        j15 j15Var = (j15) uj7Var;
                        int i5 = j15Var.i;
                        int i6 = j15Var.h;
                        boolean z3 = i6 > 0 && i5 > 0;
                        lc5.g(j15Var, tg9.c(lu6Var, 1.0f), z3 ? sdc.e0(i6 / i5, tg9.c(lu6Var, 1.0f), true) : tg9.r(tg9.c(lu6Var, 1.0f), ((x13) a07Var.getValue()).a), z3 ? sdc.e0(i6 / i5, tg9.c(lu6Var, 1.0f), true) : tg9.r(tg9.c(lu6Var, 1.0f), ((x13) a07Var.getValue()).a), (zb4) ub4Var, dd4Var3, 48);
                        dd4Var = dd4Var3;
                        z = false;
                        dd4Var.q(false);
                    } else {
                        dd4Var = dd4Var3;
                        if (uj7Var instanceof py8) {
                            dd4Var.f0(1443163806);
                            py8 py8Var = (py8) uj7Var;
                            ou6 ou6VarR = tg9.r(tg9.c(lu6Var, 1.0f), ((x13) a07Var.getValue()).a);
                            boolean zF = dd4Var.f(uj7Var) | dd4Var.f(yb4Var);
                            Object objQ = dd4Var.Q();
                            if (zF || objQ == fu6Var) {
                                z = false;
                                mu1 mu1Var = new mu1(yb4Var, py8Var, 0);
                                dd4Var.p0(mu1Var);
                                obj6 = mu1Var;
                            } else {
                                z = false;
                                obj6 = objQ;
                            }
                            lc5.F(py8Var, yn2.V(1, (ib4) obj6, dd4Var, ou6VarR, z), ib4Var, dd4Var, z ? 1 : 0);
                            dd4Var.q(z);
                        } else if (uj7Var instanceof ls9) {
                            dd4Var.f0(1443548702);
                            ls9 ls9Var = (ls9) uj7Var;
                            ou6 ou6VarR2 = tg9.r(tg9.c(lu6Var, 1.0f), ((x13) a07Var.getValue()).a);
                            boolean zF2 = dd4Var.f(uj7Var) | dd4Var.f(yb4Var);
                            Object objQ2 = dd4Var.Q();
                            if (zF2 || objQ2 == fu6Var) {
                                z = false;
                                nu1 nu1Var = new nu1(yb4Var, ls9Var, 0);
                                dd4Var.p0(nu1Var);
                                obj5 = nu1Var;
                            } else {
                                z = false;
                                obj5 = objQ2;
                            }
                            lc5.G(ls9Var, yn2.V(1, (ib4) obj5, dd4Var, ou6VarR2, z), this.f, this.s, dd4Var, 0);
                            dd4Var.q(z);
                        } else {
                            z = false;
                            z = false;
                            if (uj7Var instanceof ed3) {
                                dd4Var.f0(1443985399);
                                lc5.E(0, ib4Var, dd4Var, tg9.u((ou6) obj9));
                                dd4Var.q(false);
                            } else {
                                dd4Var.f0(1444189565);
                                dd4Var.q(false);
                            }
                        }
                    }
                    dd4Var.q(z);
                }
                break;
            case 1:
                ib4 ib4Var2 = (ib4) ub4Var3;
                dr5 dr5Var2 = (dr5) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                dd4 dd4Var4 = (dd4) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                a07 a07Var2 = (a07) obj10;
                yb4 yb4Var2 = (yb4) ub4Var2;
                int i7 = (iIntValue4 & 6) == 0 ? iIntValue4 | (dd4Var4.f(dr5Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i7 |= dd4Var4.d(iIntValue3) ? 32 : 16;
                }
                if (!dd4Var4.V(i7 & 1, (i7 & Token.EXPR_VOID) != 146)) {
                    dd4Var4.Y();
                } else {
                    uj7 uj7Var2 = (uj7) list.get(iIntValue3);
                    dd4Var4.f0(1790280365);
                    if (uj7Var2 instanceof j15) {
                        dd4Var4.f0(1790290966);
                        j15 j15Var2 = (j15) uj7Var2;
                        int i8 = j15Var2.i;
                        int i9 = j15Var2.h;
                        boolean z4 = i9 > 0 && i8 > 0;
                        ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                        if (z4) {
                            z2 = false;
                            ou6VarU = sdc.e0(i9 / i8, tg9.f(lu6Var, 1.0f), false);
                        } else {
                            z2 = false;
                            ou6VarU = tg9.u(tg9.f(lu6Var, 1.0f));
                        }
                        lc5.g(j15Var2, ou6VarF, ou6VarU, z4 ? sdc.e0(i9 / i8, tg9.f(lu6Var, 1.0f), z2) : tg9.h(tg9.f(lu6Var, 1.0f), ((x13) a07Var2.getValue()).a), (zb4) ub4Var, dd4Var4, 48);
                        dd4Var2 = dd4Var4;
                        dd4Var2.q(z2);
                    } else {
                        dd4Var2 = dd4Var4;
                        if (uj7Var2 instanceof py8) {
                            dd4Var2.f0(1791316880);
                            py8 py8Var2 = (py8) uj7Var2;
                            ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
                            boolean zF3 = dd4Var2.f(uj7Var2) | dd4Var2.f(yb4Var2);
                            Object objQ3 = dd4Var2.Q();
                            if (zF3 || objQ3 == fu6Var) {
                                i2 = 1;
                                mu1 mu1Var2 = new mu1(yb4Var2, py8Var2, 1);
                                dd4Var2.p0(mu1Var2);
                                obj8 = mu1Var2;
                            } else {
                                i2 = 1;
                                obj8 = objQ3;
                            }
                            z2 = false;
                            lc5.F(py8Var2, tg9.u(yn2.V(i2, (ib4) obj8, dd4Var2, ou6VarF2, false)), ib4Var2, dd4Var2, 0);
                            dd4Var2.q(false);
                        } else if (uj7Var2 instanceof ls9) {
                            dd4Var2.f0(1791703729);
                            ls9 ls9Var2 = (ls9) uj7Var2;
                            ou6 ou6VarF3 = tg9.f(lu6Var, 1.0f);
                            boolean zF4 = dd4Var2.f(uj7Var2) | dd4Var2.f(yb4Var2);
                            Object objQ4 = dd4Var2.Q();
                            if (zF4 || objQ4 == fu6Var) {
                                i = 1;
                                nu1 nu1Var2 = new nu1(yb4Var2, ls9Var2, 1);
                                dd4Var2.p0(nu1Var2);
                                obj7 = nu1Var2;
                            } else {
                                i = 1;
                                obj7 = objQ4;
                            }
                            z2 = false;
                            lc5.G(ls9Var2, tg9.h(yn2.V(i, (ib4) obj7, dd4Var2, ou6VarF3, false), ((x13) a07Var2.getValue()).a), this.f, this.s, dd4Var2, 0);
                            dd4Var2.q(false);
                        } else {
                            z2 = false;
                            if (uj7Var2 instanceof ed3) {
                                dd4Var2.f0(1792141387);
                                lc5.E(0, ib4Var2, dd4Var2, tg9.u((ou6) obj9));
                                dd4Var2.q(false);
                            } else {
                                dd4Var2.f0(1792345553);
                                dd4Var2.q(false);
                            }
                        }
                    }
                    dd4Var2.q(z2);
                }
                break;
            default:
                dq5 dq5Var = (dq5) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                dd4 dd4Var5 = (dd4) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                kb4 kb4Var = (kb4) obj10;
                kb4 kb4Var2 = (kb4) obj9;
                kb4 kb4Var3 = (kb4) ub4Var3;
                kb4 kb4Var4 = (kb4) ub4Var2;
                kb4 kb4Var5 = (kb4) ub4Var;
                int i10 = (iIntValue6 & 6) == 0 ? iIntValue6 | (dd4Var5.f(dq5Var) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i10 |= dd4Var5.d(iIntValue5) ? 32 : 16;
                }
                int i11 = i10;
                if (!dd4Var5.V(i11 & 1, (i11 & Token.EXPR_VOID) != 146)) {
                    dd4Var5.Y();
                } else {
                    r03 r03Var = (r03) list.get(iIntValue5);
                    dd4Var5.f0(287809821);
                    ou6 ou6VarA = dq5.a(dq5Var, tg9.f(lu6Var, 1.0f));
                    kb4 kb4Var6 = this.f;
                    boolean zF5 = dd4Var5.f(kb4Var6) | dd4Var5.h(r03Var);
                    Object objQ5 = dd4Var5.Q();
                    Object obj11 = objQ5;
                    if (zF5 || objQ5 == fu6Var) {
                        z03 z03Var = new z03(kb4Var6, r03Var, 0);
                        dd4Var5.p0(z03Var);
                        obj11 = z03Var;
                    }
                    ib4 ib4Var3 = (ib4) obj11;
                    kb4 kb4Var7 = this.s;
                    boolean zF6 = dd4Var5.f(kb4Var7) | dd4Var5.h(r03Var);
                    Object objQ6 = dd4Var5.Q();
                    Object obj12 = objQ6;
                    if (zF6 || objQ6 == fu6Var) {
                        z03 z03Var2 = new z03(kb4Var7, r03Var, 1);
                        dd4Var5.p0(z03Var2);
                        obj12 = z03Var2;
                    }
                    ib4 ib4Var4 = (ib4) obj12;
                    boolean zF7 = dd4Var5.f(kb4Var5) | dd4Var5.h(r03Var);
                    Object objQ7 = dd4Var5.Q();
                    Object obj13 = objQ7;
                    if (zF7 || objQ7 == fu6Var) {
                        z03 z03Var3 = new z03(kb4Var5, r03Var, 2);
                        dd4Var5.p0(z03Var3);
                        obj13 = z03Var3;
                    }
                    ib4 ib4Var5 = (ib4) obj13;
                    boolean zF8 = dd4Var5.f(kb4Var4) | dd4Var5.h(r03Var);
                    Object objQ8 = dd4Var5.Q();
                    Object obj14 = objQ8;
                    if (zF8 || objQ8 == fu6Var) {
                        z03 z03Var4 = new z03(kb4Var4, r03Var, 3);
                        dd4Var5.p0(z03Var4);
                        obj14 = z03Var4;
                    }
                    ib4 ib4Var6 = (ib4) obj14;
                    boolean zF9 = dd4Var5.f(kb4Var3) | dd4Var5.h(r03Var);
                    Object objQ9 = dd4Var5.Q();
                    Object obj15 = objQ9;
                    if (zF9 || objQ9 == fu6Var) {
                        z03 z03Var5 = new z03(kb4Var3, r03Var, 4);
                        dd4Var5.p0(z03Var5);
                        obj15 = z03Var5;
                    }
                    ib4 ib4Var7 = (ib4) obj15;
                    boolean zF10 = dd4Var5.f(kb4Var2) | dd4Var5.h(r03Var);
                    Object objQ10 = dd4Var5.Q();
                    Object obj16 = objQ10;
                    if (zF10 || objQ10 == fu6Var) {
                        z03 z03Var6 = new z03(kb4Var2, r03Var, 5);
                        dd4Var5.p0(z03Var6);
                        obj16 = z03Var6;
                    }
                    ib4 ib4Var8 = (ib4) obj16;
                    boolean zF11 = dd4Var5.f(kb4Var) | dd4Var5.h(r03Var);
                    Object objQ11 = dd4Var5.Q();
                    Object obj17 = objQ11;
                    if (zF11 || objQ11 == fu6Var) {
                        z03 z03Var7 = new z03(kb4Var, r03Var, 6);
                        dd4Var5.p0(z03Var7);
                        obj17 = z03Var7;
                    }
                    vo1.q(r03Var, ou6VarA, ib4Var3, ib4Var4, ib4Var5, ib4Var6, ib4Var7, ib4Var8, (ib4) obj17, dd4Var5, 0);
                    dd4Var5.q(false);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ ou1(List list, zb4 zb4Var, yb4 yb4Var, ib4 ib4Var, kb4 kb4Var, kb4 kb4Var2, ou6 ou6Var, a07 a07Var, int i) {
        this.a = i;
        this.b = list;
        this.c = zb4Var;
        this.d = yb4Var;
        this.e = ib4Var;
        this.f = kb4Var;
        this.s = kb4Var2;
        this.t = ou6Var;
        this.u = a07Var;
    }
}
