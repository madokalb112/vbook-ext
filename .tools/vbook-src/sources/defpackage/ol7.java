package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ol7 implements ac4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ co0 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ ib4 s;
    public final /* synthetic */ kb4 t;
    public final /* synthetic */ kb4 u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public ol7(List list, co0 co0Var, lra lraVar, jka jkaVar, aoa aoaVar, zja zjaVar, kba kbaVar, ib4 ib4Var, kb4 kb4Var, kb4 kb4Var2) {
        this.a = 2;
        this.b = list;
        this.c = co0Var;
        this.d = lraVar;
        this.e = jkaVar;
        this.f = aoaVar;
        this.v = zjaVar;
        this.w = kbaVar;
        this.s = ib4Var;
        this.t = kb4Var;
        this.u = kb4Var2;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        dd4 dd4Var;
        boolean z;
        dd4 dd4Var2;
        boolean z2;
        int iOrdinal;
        int i = this.a;
        ib4 ib4Var = this.s;
        heb hebVar = heb.a;
        lu6 lu6Var = lu6.a;
        Object obj5 = this.w;
        Object obj6 = this.v;
        Object obj7 = this.f;
        Object obj8 = this.e;
        Object obj9 = this.d;
        List list = this.b;
        switch (i) {
            case 0:
                dr5 dr5Var = (dr5) obj;
                int iIntValue = ((Number) obj2).intValue();
                dd4 dd4Var3 = (dd4) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                yb4 yb4Var = (yb4) obj8;
                yb4 yb4Var2 = (yb4) obj9;
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | (dd4Var3.f(dr5Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= dd4Var3.d(iIntValue) ? 32 : 16;
                }
                if (!dd4Var3.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                    dd4Var3.Y();
                } else {
                    uj7 uj7Var = (uj7) list.get(iIntValue);
                    dd4Var3.f0(1786951842);
                    boolean z3 = uj7Var instanceof j15;
                    Object obj10 = vl1.a;
                    co0 co0Var = this.c;
                    if (z3) {
                        dd4Var3.f0(1786963404);
                        float fD = x13.b(co0Var.c(), 0.0f) > 0 ? co0Var.d() / co0Var.c() : 1.0f;
                        j15 j15Var = (j15) uj7Var;
                        ou6 ou6VarR = tg9.r(tg9.c(lu6Var, 1.0f), co0Var.d());
                        boolean zF = dd4Var3.f(yb4Var2) | dd4Var3.f(uj7Var);
                        Object objQ = dd4Var3.Q();
                        if (zF || objQ == obj10) {
                            objQ = new ml7(yb4Var2, j15Var, 0);
                            dd4Var3.p0(objQ);
                        }
                        kb4 kb4Var = (kb4) objQ;
                        boolean zF2 = dd4Var3.f(yb4Var) | dd4Var3.f(uj7Var);
                        Object objQ2 = dd4Var3.Q();
                        if (zF2 || objQ2 == obj10) {
                            objQ2 = new ml7(yb4Var, j15Var, 1);
                            dd4Var3.p0(objQ2);
                        }
                        kb4 kb4Var2 = (kb4) objQ2;
                        zb4 zb4Var = (zb4) obj7;
                        boolean z4 = (((i2 & Token.ASSIGN_MOD) ^ 48) > 32 && dd4Var3.d(iIntValue)) || (i2 & 48) == 32;
                        Object objQ3 = dd4Var3.Q();
                        if (z4 || objQ3 == obj10) {
                            objQ3 = new nl7(iIntValue, (a07) obj5, (br9) obj6);
                            dd4Var3.p0(objQ3);
                        }
                        sdc.I(j15Var, fD, ek7.b, ou6VarR, kb4Var, kb4Var2, zb4Var, (kb4) objQ3, dd4Var3, 384);
                        dd4Var = dd4Var3;
                        dd4Var.q(false);
                        z = false;
                    } else {
                        dd4Var = dd4Var3;
                        if (uj7Var instanceof py8) {
                            dd4Var.f0(1787875021);
                            py8 py8Var = (py8) uj7Var;
                            ou6 ou6VarC = tg9.c(lu6Var, 1.0f);
                            boolean zF3 = dd4Var.f(yb4Var2) | dd4Var.f(uj7Var);
                            Object objQ4 = dd4Var.Q();
                            if (zF3 || objQ4 == obj10) {
                                objQ4 = new mu1(yb4Var2, py8Var, 2);
                                dd4Var.p0(objQ4);
                            }
                            z = false;
                            sdc.G(py8Var, tg9.r(yn2.V(1, (ib4) objQ4, dd4Var, ou6VarC, false), co0Var.d()), ib4Var, dd4Var, 0);
                            dd4Var.q(false);
                        } else if (uj7Var instanceof ls9) {
                            dd4Var.f0(1788294761);
                            ls9 ls9Var = (ls9) uj7Var;
                            ou6 ou6VarC2 = tg9.c(lu6Var, 1.0f);
                            boolean zF4 = dd4Var.f(yb4Var2) | dd4Var.f(uj7Var);
                            Object objQ5 = dd4Var.Q();
                            if (zF4 || objQ5 == obj10) {
                                objQ5 = new nu1(yb4Var2, ls9Var, 2);
                                dd4Var.p0(objQ5);
                            }
                            z = false;
                            sdc.H(ls9Var, tg9.r(yn2.V(1, (ib4) objQ5, dd4Var, ou6VarC2, false), co0Var.d()), this.t, this.u, dd4Var, 0);
                            dd4Var.q(false);
                        } else {
                            z = false;
                            if (uj7Var instanceof ed3) {
                                dd4Var.f0(1788769495);
                                sdc.F(6, ib4Var, dd4Var, tg9.c);
                                dd4Var.q(false);
                            } else {
                                dd4Var.f0(1788991083);
                                dd4Var.q(false);
                            }
                        }
                    }
                    dd4Var.q(z);
                }
                break;
            case 1:
                dr5 dr5Var2 = (dr5) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                dd4 dd4Var4 = (dd4) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                yb4 yb4Var3 = (yb4) obj8;
                a07 a07Var = (a07) obj5;
                br9 br9Var = (br9) obj6;
                yb4 yb4Var4 = (yb4) obj9;
                int i3 = (iIntValue4 & 6) == 0 ? iIntValue4 | (dd4Var4.f(dr5Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i3 |= dd4Var4.d(iIntValue3) ? 32 : 16;
                }
                if (!dd4Var4.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
                    dd4Var4.Y();
                } else {
                    uj7 uj7Var2 = (uj7) list.get(iIntValue3);
                    dd4Var4.f0(617921471);
                    boolean z5 = uj7Var2 instanceof j15;
                    co0 co0Var2 = this.c;
                    Object obj11 = vl1.a;
                    if (z5) {
                        dd4Var4.f0(617932971);
                        boolean zD = dd4Var4.d(((Number) br9Var.getValue()).intValue()) | ((((i3 & Token.ASSIGN_MOD) ^ 48) > 32 && dd4Var4.d(iIntValue3)) || (i3 & 48) == 32) | dd4Var4.d(((dk7) a07Var.getValue()).ordinal());
                        Object objQ6 = dd4Var4.Q();
                        if (zD || objQ6 == obj11) {
                            int iIntValue5 = ((Number) br9Var.getValue()).intValue();
                            objQ6 = ek7.a;
                            if (iIntValue3 >= iIntValue5) {
                                int iIntValue6 = ((Number) br9Var.getValue()).intValue();
                                ek7 ek7Var = ek7.b;
                                if (iIntValue3 != iIntValue6 || (iOrdinal = ((dk7) a07Var.getValue()).ordinal()) == 1 || iOrdinal != 2) {
                                    objQ6 = ek7Var;
                                }
                            }
                            dd4Var4.p0(objQ6);
                        }
                        ek7 ek7Var2 = (ek7) objQ6;
                        float fD2 = x13.b(co0Var2.c(), 0.0f) > 0 ? co0Var2.d() / co0Var2.c() : 1.0f;
                        j15 j15Var2 = (j15) uj7Var2;
                        ou6 ou6VarF = tg9.f(tg9.h(lu6Var, co0Var2.c()), 1.0f);
                        boolean zF5 = dd4Var4.f(yb4Var4) | dd4Var4.f(uj7Var2);
                        Object objQ7 = dd4Var4.Q();
                        if (zF5 || objQ7 == obj11) {
                            objQ7 = new ml7(yb4Var4, j15Var2, 2);
                            dd4Var4.p0(objQ7);
                        }
                        kb4 kb4Var3 = (kb4) objQ7;
                        boolean zF6 = dd4Var4.f(yb4Var3) | dd4Var4.f(uj7Var2);
                        Object objQ8 = dd4Var4.Q();
                        if (zF6 || objQ8 == obj11) {
                            objQ8 = new ml7(yb4Var3, j15Var2, 3);
                            dd4Var4.p0(objQ8);
                        }
                        kb4 kb4Var4 = (kb4) objQ8;
                        zb4 zb4Var2 = (zb4) obj7;
                        Object objQ9 = dd4Var4.Q();
                        if (objQ9 == obj11) {
                            objQ9 = rz5.f;
                            dd4Var4.p0(objQ9);
                        }
                        sdc.I(j15Var2, fD2, ek7Var2, ou6VarF, kb4Var3, kb4Var4, zb4Var2, (kb4) objQ9, dd4Var4, 12582912);
                        dd4Var2 = dd4Var4;
                        dd4Var2.q(false);
                        z2 = false;
                    } else {
                        dd4Var2 = dd4Var4;
                        if (uj7Var2 instanceof py8) {
                            dd4Var2.f0(619379896);
                            py8 py8Var2 = (py8) uj7Var2;
                            ou6 ou6VarH = tg9.h(lu6Var, co0Var2.c());
                            boolean zF7 = dd4Var2.f(uj7Var2) | dd4Var2.f(yb4Var4);
                            Object objQ10 = dd4Var2.Q();
                            if (zF7 || objQ10 == obj11) {
                                objQ10 = new mu1(yb4Var4, py8Var2, 3);
                                dd4Var2.p0(objQ10);
                            }
                            sdc.G(py8Var2, tg9.f(yn2.V(1, (ib4) objQ10, dd4Var2, ou6VarH, false), 1.0f), ib4Var, dd4Var2, 0);
                            dd4Var2.q(false);
                            z2 = false;
                        } else if (uj7Var2 instanceof ls9) {
                            dd4Var2.f0(619800628);
                            ls9 ls9Var2 = (ls9) uj7Var2;
                            ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
                            boolean zF8 = dd4Var2.f(uj7Var2) | dd4Var2.f(yb4Var4);
                            Object objQ11 = dd4Var2.Q();
                            if (zF8 || objQ11 == obj11) {
                                objQ11 = new nu1(yb4Var4, ls9Var2, 3);
                                dd4Var2.p0(objQ11);
                            }
                            z2 = false;
                            sdc.H(ls9Var2, tg9.h(yn2.V(1, (ib4) objQ11, dd4Var2, ou6VarF2, false), co0Var2.c()), this.t, this.u, dd4Var2, 0);
                            dd4Var2.q(false);
                        } else {
                            z2 = false;
                            if (uj7Var2 instanceof ed3) {
                                dd4Var2.f0(620276323);
                                sdc.F(6, ib4Var, dd4Var2, tg9.c);
                                dd4Var2.q(false);
                            } else {
                                dd4Var2.f0(620497911);
                                dd4Var2.q(false);
                            }
                        }
                    }
                    dd4Var2.q(z2);
                }
                break;
            default:
                dr5 dr5Var3 = (dr5) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                dd4 dd4Var5 = (dd4) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                int i4 = (iIntValue8 & 6) == 0 ? iIntValue8 | (dd4Var5.f(dr5Var3) ? 4 : 2) : iIntValue8;
                if ((iIntValue8 & 48) == 0) {
                    i4 |= dd4Var5.d(iIntValue7) ? 32 : 16;
                }
                if (!dd4Var5.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
                    dd4Var5.Y();
                } else {
                    tj7 tj7Var = (tj7) list.get(iIntValue7);
                    dd4Var5.f0(-2110974923);
                    pu1.v(this.c, tj7Var, ((lra) obj9).c, (jka) obj8, (aoa) obj7, (zja) obj6, (kba) obj5, tg9.f(lu6Var, 1.0f), this.s, this.t, this.u, dd4Var5, 12582912);
                    dd4Var5.q(false);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ ol7(List list, co0 co0Var, yb4 yb4Var, yb4 yb4Var2, zb4 zb4Var, ib4 ib4Var, kb4 kb4Var, kb4 kb4Var2, br9 br9Var, a07 a07Var, int i) {
        this.a = i;
        this.b = list;
        this.c = co0Var;
        this.d = yb4Var;
        this.e = yb4Var2;
        this.f = zb4Var;
        this.s = ib4Var;
        this.t = kb4Var;
        this.u = kb4Var2;
        this.v = br9Var;
        this.w = a07Var;
    }
}
