package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class il0 implements ac4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ kb4 e;

    public /* synthetic */ il0(List list, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, int i) {
        this.a = i;
        this.b = list;
        this.c = kb4Var;
        this.d = kb4Var2;
        this.e = kb4Var3;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        dd4 dd4Var;
        int i = this.a;
        heb hebVar = heb.a;
        List list = this.b;
        Object obj5 = vl1.a;
        kb4 kb4Var = this.c;
        kb4 kb4Var2 = this.d;
        kb4 kb4Var3 = this.e;
        lu6 lu6Var = lu6.a;
        switch (i) {
            case 0:
                gu5 gu5Var = (gu5) obj;
                int iIntValue = ((Number) obj2).intValue();
                dd4 dd4Var2 = (dd4) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | (dd4Var2.f(gu5Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= dd4Var2.d(iIntValue) ? 32 : 16;
                }
                if (!dd4Var2.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                    dd4Var2.Y();
                } else {
                    wk0 wk0Var = (wk0) list.get(iIntValue);
                    dd4Var2.f0(-32777665);
                    ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                    ur9 ur9Var = s96.a;
                    ou6 ou6VarW = t96.w(ou6VarF, ((q96) dd4Var2.j(ur9Var)).c.d);
                    boolean zF = dd4Var2.f(kb4Var) | dd4Var2.h(wk0Var);
                    Object objQ = dd4Var2.Q();
                    if (zF || objQ == obj5) {
                        objQ = new hl0(kb4Var, wk0Var, 0);
                        dd4Var2.p0(objQ);
                    }
                    ou6 ou6VarL0 = gjb.l0(fe.L(fw.J(null, (ib4) objQ, ou6VarW, false, 15), dd1.g(((q96) dd4Var2.j(ur9Var)).a, 2.0f), jf0.G), 14.0f);
                    boolean zF2 = dd4Var2.f(kb4Var2) | dd4Var2.h(wk0Var);
                    Object objQ2 = dd4Var2.Q();
                    if (zF2 || objQ2 == obj5) {
                        objQ2 = new hl0(kb4Var2, wk0Var, 1);
                        dd4Var2.p0(objQ2);
                    }
                    ib4 ib4Var = (ib4) objQ2;
                    boolean zF3 = dd4Var2.f(kb4Var3) | dd4Var2.h(wk0Var);
                    Object objQ3 = dd4Var2.Q();
                    if (zF3 || objQ3 == obj5) {
                        objQ3 = new hl0(kb4Var3, wk0Var, 2);
                        dd4Var2.p0(objQ3);
                    }
                    ah1.d(wk0Var, ou6VarL0, ib4Var, (ib4) objQ3, dd4Var2, 8);
                    dd4Var2.q(false);
                }
                break;
            case 1:
                dr5 dr5Var = (dr5) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                dd4 dd4Var3 = (dd4) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i3 = (iIntValue4 & 6) == 0 ? iIntValue4 | (dd4Var3.f(dr5Var) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i3 |= dd4Var3.d(iIntValue3) ? 32 : 16;
                }
                if (!dd4Var3.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
                    dd4Var3.Y();
                } else {
                    String str = (String) list.get(iIntValue3);
                    dd4Var3.f0(1458690951);
                    ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
                    boolean zF4 = dd4Var3.f(kb4Var) | dd4Var3.f(str);
                    Object objQ4 = dd4Var3.Q();
                    if (zF4 || objQ4 == obj5) {
                        objQ4 = new o85(0, kb4Var, str);
                        dd4Var3.p0(objQ4);
                    }
                    ou6 ou6VarM0 = gjb.m0(fw.J(null, (ib4) objQ4, ou6VarF2, false, 15), 24.0f, 8.0f);
                    boolean zF5 = dd4Var3.f(kb4Var2) | dd4Var3.f(str);
                    Object objQ5 = dd4Var3.Q();
                    if (zF5 || objQ5 == obj5) {
                        objQ5 = new o85(1, kb4Var2, str);
                        dd4Var3.p0(objQ5);
                    }
                    ib4 ib4Var2 = (ib4) objQ5;
                    boolean zF6 = dd4Var3.f(kb4Var3) | dd4Var3.f(str);
                    Object objQ6 = dd4Var3.Q();
                    if (zF6 || objQ6 == obj5) {
                        objQ6 = new o85(2, kb4Var3, str);
                        dd4Var3.p0(objQ6);
                    }
                    wx1.z(0, ib4Var2, (ib4) objQ6, dd4Var3, ou6VarM0, str);
                    dd4Var3.q(false);
                }
                break;
            case 2:
                dr5 dr5Var2 = (dr5) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                dd4 dd4Var4 = (dd4) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                int i4 = (iIntValue6 & 6) == 0 ? iIntValue6 | (dd4Var4.f(dr5Var2) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i4 |= dd4Var4.d(iIntValue5) ? 32 : 16;
                }
                if (!dd4Var4.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
                    dd4Var4.Y();
                } else {
                    bp0 bp0Var = (bp0) list.get(iIntValue5);
                    dd4Var4.f0(-2132820669);
                    ou6 ou6VarF3 = tg9.f(lu6Var, 1.0f);
                    boolean zF7 = dd4Var4.f(kb4Var) | dd4Var4.h(bp0Var);
                    Object objQ7 = dd4Var4.Q();
                    if (zF7 || objQ7 == obj5) {
                        objQ7 = new aq0(kb4Var, bp0Var, 1);
                        dd4Var4.p0(objQ7);
                    }
                    ou6 ou6VarM02 = gjb.m0(fw.J(null, (ib4) objQ7, ou6VarF3, false, 15), 24.0f, 8.0f);
                    boolean zF8 = dd4Var4.f(kb4Var2) | dd4Var4.h(bp0Var);
                    Object objQ8 = dd4Var4.Q();
                    if (zF8 || objQ8 == obj5) {
                        objQ8 = new aq0(kb4Var2, bp0Var, 2);
                        dd4Var4.p0(objQ8);
                    }
                    ib4 ib4Var3 = (ib4) objQ8;
                    boolean zF9 = dd4Var4.f(kb4Var3) | dd4Var4.h(bp0Var);
                    Object objQ9 = dd4Var4.Q();
                    if (zF9 || objQ9 == obj5) {
                        objQ9 = new aq0(kb4Var3, bp0Var, 3);
                        dd4Var4.p0(objQ9);
                    }
                    wx1.a(bp0Var, ou6VarM02, ib4Var3, (ib4) objQ9, dd4Var4, 0);
                    dd4Var4.q(false);
                }
                break;
            case 3:
                dr5 dr5Var3 = (dr5) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                dd4 dd4Var5 = (dd4) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                int i5 = (iIntValue8 & 6) == 0 ? (dd4Var5.f(dr5Var3) ? 4 : 2) | iIntValue8 : iIntValue8;
                if ((iIntValue8 & 48) == 0) {
                    i5 |= dd4Var5.d(iIntValue7) ? 32 : 16;
                }
                if (!dd4Var5.V(i5 & 1, (i5 & Token.EXPR_VOID) != 146)) {
                    dd4Var5.Y();
                } else {
                    to3 to3Var = (to3) list.get(iIntValue7);
                    dd4Var5.f0(-718473785);
                    boolean z = iIntValue7 == 0;
                    ou6 ou6VarA = dr5.a(dr5Var3, tg9.f(lu6Var, 1.0f));
                    boolean zF10 = dd4Var5.f(kb4Var) | dd4Var5.h(to3Var);
                    Object objQ10 = dd4Var5.Q();
                    if (zF10 || objQ10 == obj5) {
                        objQ10 = new gq0(kb4Var, to3Var, 7);
                        dd4Var5.p0(objQ10);
                    }
                    ib4 ib4Var4 = (ib4) objQ10;
                    boolean zF11 = dd4Var5.f(kb4Var2) | dd4Var5.h(to3Var);
                    Object objQ11 = dd4Var5.Q();
                    if (zF11 || objQ11 == obj5) {
                        objQ11 = new gq0(kb4Var2, to3Var, 8);
                        dd4Var5.p0(objQ11);
                    }
                    ib4 ib4Var5 = (ib4) objQ11;
                    boolean zF12 = dd4Var5.f(kb4Var3) | dd4Var5.h(to3Var);
                    Object objQ12 = dd4Var5.Q();
                    if (zF12 || objQ12 == obj5) {
                        objQ12 = new gq0(kb4Var3, to3Var, 9);
                        dd4Var5.p0(objQ12);
                    }
                    sw1.c(z, to3Var, ou6VarA, ib4Var4, ib4Var5, (ib4) objQ12, dd4Var5, 0);
                    dd4Var5.q(false);
                }
                break;
            case 4:
                dr5 dr5Var4 = (dr5) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                dd4 dd4Var6 = (dd4) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                int i6 = (iIntValue10 & 6) == 0 ? iIntValue10 | (dd4Var6.f(dr5Var4) ? 4 : 2) : iIntValue10;
                if ((iIntValue10 & 48) == 0) {
                    i6 |= dd4Var6.d(iIntValue9) ? 32 : 16;
                }
                if (!dd4Var6.V(i6 & 1, (i6 & Token.EXPR_VOID) != 146)) {
                    dd4Var6.Y();
                } else {
                    String str2 = (String) list.get(iIntValue9);
                    dd4Var6.f0(-656991884);
                    ou6 ou6VarF4 = tg9.f(lu6Var, 1.0f);
                    boolean zF13 = dd4Var6.f(kb4Var) | dd4Var6.f(str2);
                    Object objQ13 = dd4Var6.Q();
                    if (zF13 || objQ13 == obj5) {
                        objQ13 = new o85(3, kb4Var, str2);
                        dd4Var6.p0(objQ13);
                    }
                    ou6 ou6VarM03 = gjb.m0(fw.J(null, (ib4) objQ13, ou6VarF4, false, 15), 24.0f, 8.0f);
                    boolean zF14 = dd4Var6.f(kb4Var2) | dd4Var6.f(str2);
                    Object objQ14 = dd4Var6.Q();
                    if (zF14 || objQ14 == obj5) {
                        objQ14 = new o85(4, kb4Var2, str2);
                        dd4Var6.p0(objQ14);
                    }
                    ib4 ib4Var6 = (ib4) objQ14;
                    boolean zF15 = dd4Var6.f(kb4Var3) | dd4Var6.f(str2);
                    Object objQ15 = dd4Var6.Q();
                    if (zF15 || objQ15 == obj5) {
                        objQ15 = new o85(5, kb4Var3, str2);
                        dd4Var6.p0(objQ15);
                    }
                    wx1.y(0, ib4Var6, (ib4) objQ15, dd4Var6, ou6VarM03, str2);
                    dd4Var6.q(false);
                }
                break;
            default:
                dr5 dr5Var5 = (dr5) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                dd4 dd4Var7 = (dd4) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                int i7 = (iIntValue12 & 6) == 0 ? iIntValue12 | (dd4Var7.f(dr5Var5) ? 4 : 2) : iIntValue12;
                if ((iIntValue12 & 48) == 0) {
                    i7 |= dd4Var7.d(iIntValue11) ? 32 : 16;
                }
                int i8 = i7;
                if (!dd4Var7.V(i8 & 1, (i8 & Token.EXPR_VOID) != 146)) {
                    dd4Var7.Y();
                } else {
                    gba gbaVar = (gba) list.get(iIntValue11);
                    dd4Var7.f0(-1868770680);
                    if (gbaVar.e == 0) {
                        dd4Var7.f0(-1868753724);
                        ou6 ou6VarM04 = gjb.m0(dr5.a(dr5Var5, tg9.f(lu6Var, 1.0f)), 20.0f, 4.0f);
                        boolean zF16 = dd4Var7.f(kb4Var) | dd4Var7.f(gbaVar);
                        Object objQ16 = dd4Var7.Q();
                        if (zF16 || objQ16 == obj5) {
                            objQ16 = new jba(kb4Var, gbaVar, 0);
                            dd4Var7.p0(objQ16);
                        }
                        ib4 ib4Var7 = (ib4) objQ16;
                        boolean zF17 = dd4Var7.f(kb4Var2) | dd4Var7.f(gbaVar);
                        Object objQ17 = dd4Var7.Q();
                        if (zF17 || objQ17 == obj5) {
                            objQ17 = new jba(kb4Var2, gbaVar, 1);
                            dd4Var7.p0(objQ17);
                        }
                        jf0.c(gbaVar, ou6VarM04, ib4Var7, (ib4) objQ17, dd4Var7, 0);
                        dd4Var = dd4Var7;
                        dd4Var.q(false);
                    } else {
                        dd4Var = dd4Var7;
                        dd4Var.f0(-1868176783);
                        ou6 ou6VarM05 = gjb.m0(dr5.a(dr5Var5, tg9.f(lu6Var, 1.0f)), 20.0f, 4.0f);
                        boolean zF18 = dd4Var.f(kb4Var) | dd4Var.f(gbaVar);
                        Object objQ18 = dd4Var.Q();
                        if (zF18 || objQ18 == obj5) {
                            objQ18 = new jba(kb4Var, gbaVar, 2);
                            dd4Var.p0(objQ18);
                        }
                        ib4 ib4Var8 = (ib4) objQ18;
                        boolean zF19 = dd4Var.f(kb4Var3) | dd4Var.f(gbaVar);
                        Object objQ19 = dd4Var.Q();
                        if (zF19 || objQ19 == obj5) {
                            objQ19 = new jba(kb4Var3, gbaVar, 3);
                            dd4Var.p0(objQ19);
                        }
                        ib4 ib4Var9 = (ib4) objQ19;
                        boolean zF20 = dd4Var.f(kb4Var2) | dd4Var.f(gbaVar);
                        Object objQ20 = dd4Var.Q();
                        if (zF20 || objQ20 == obj5) {
                            objQ20 = new jba(kb4Var2, gbaVar, 4);
                            dd4Var.p0(objQ20);
                        }
                        jf0.m(gbaVar, ou6VarM05, ib4Var8, ib4Var9, (ib4) objQ20, dd4Var, 0);
                        dd4Var.q(false);
                    }
                    dd4Var.q(false);
                }
                break;
        }
        return hebVar;
    }
}
