package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ik0 implements ac4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ik0(List list, Object obj, kb4 kb4Var, int i) {
        this.a = i;
        this.b = list;
        this.d = obj;
        this.c = kb4Var;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        long jG;
        uw1 uw1VarD;
        long jG2;
        Object pm8Var;
        f36 f36Var;
        long jG3;
        int i = this.a;
        lu6 lu6Var = lu6.a;
        heb hebVar = heb.a;
        Object obj5 = vl1.a;
        Object obj6 = this.d;
        List list = this.b;
        Object obj7 = this.c;
        switch (i) {
            case 0:
                dr5 dr5Var = (dr5) obj;
                int iIntValue = ((Number) obj2).intValue();
                dd4 dd4Var = (dd4) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                yb4 yb4Var = (yb4) obj6;
                kb4 kb4Var = (kb4) obj7;
                int i2 = (iIntValue2 & 6) == 0 ? (dd4Var.f(dr5Var) ? 4 : 2) | iIntValue2 : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= dd4Var.d(iIntValue) ? 32 : 16;
                }
                if (!dd4Var.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                    dd4Var.Y();
                } else {
                    xm3 xm3Var = (xm3) list.get(iIntValue);
                    dd4Var.f0(-1922245362);
                    ou6 ou6VarN0 = gjb.n0(gjb.p0(dr5.a(dr5Var, tg9.f(lu6Var, 1.0f)), 0.0f, 0.0f, 0.0f, 12.0f, 7), 16.0f, 0.0f, 2);
                    boolean zF = dd4Var.f(kb4Var) | dd4Var.h(xm3Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj5) {
                        objQ = new gk0(0, xm3Var, kb4Var);
                        dd4Var.p0(objQ);
                    }
                    ib4 ib4Var = (ib4) objQ;
                    boolean zF2 = dd4Var.f(yb4Var) | dd4Var.h(xm3Var);
                    Object objQ2 = dd4Var.Q();
                    if (zF2 || objQ2 == obj5) {
                        objQ2 = new hk0(yb4Var, xm3Var, 0);
                        dd4Var.p0(objQ2);
                    }
                    kl8.t(xm3Var, ou6VarN0, ib4Var, (kb4) objQ2, dd4Var, 0);
                    dd4Var.q(false);
                }
                break;
            case 1:
                dr5 dr5Var2 = (dr5) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                dd4 dd4Var2 = (dd4) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                kb4 kb4Var2 = (kb4) obj7;
                int i3 = (iIntValue4 & 6) == 0 ? iIntValue4 | (dd4Var2.f(dr5Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i3 |= dd4Var2.d(iIntValue3) ? 32 : 16;
                }
                if (!dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
                    dd4Var2.Y();
                } else {
                    sgb sgbVar = (sgb) list.get(iIntValue3);
                    dd4Var2.f0(1272874570);
                    boolean zContains = ((t61) obj6).z.contains(sgbVar.a);
                    boolean zF3 = dd4Var2.f(kb4Var2) | dd4Var2.h(sgbVar);
                    Object objQ3 = dd4Var2.Q();
                    if (zF3 || objQ3 == obj5) {
                        objQ3 = new e7(3, kb4Var2, sgbVar);
                        dd4Var2.p0(objQ3);
                    }
                    fe.w(sgbVar, zContains, (ib4) objQ3, dd4Var2, 8);
                    dd4Var2.q(false);
                }
                break;
            case 2:
                dr5 dr5Var3 = (dr5) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                dd4 dd4Var3 = (dd4) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                kb4 kb4Var3 = (kb4) obj7;
                int i4 = (iIntValue6 & 6) == 0 ? iIntValue6 | (dd4Var3.f(dr5Var3) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i4 |= dd4Var3.d(iIntValue5) ? 32 : 16;
                }
                if (!dd4Var3.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
                    dd4Var3.Y();
                } else {
                    fv1 fv1Var = (fv1) list.get(iIntValue5);
                    dd4Var3.f0(-1270069700);
                    boolean zEquals = "".equals(String.valueOf(fv1Var.a));
                    ou6 ou6VarW = t96.w(tg9.f(lu6Var, 1.0f), vm7.N(iIntValue5, ((t41) ((a07) obj6).getValue()).g.size(), dd4Var3));
                    if ("".equals(String.valueOf(fv1Var.a))) {
                        dd4Var3.f0(-1269448368);
                        jG = lc1.c(0.65f, ((q96) dd4Var3.j(s96.a)).a.h);
                        dd4Var3.q(false);
                    } else {
                        dd4Var3.f0(-1269299847);
                        jG = dd1.g(((q96) dd4Var3.j(s96.a)).a, 1.0f);
                        dd4Var3.q(false);
                    }
                    ou6 ou6VarL = fe.L(ou6VarW, jG, jf0.G);
                    boolean zF4 = dd4Var3.f(kb4Var3) | dd4Var3.h(fv1Var);
                    Object objQ4 = dd4Var3.Q();
                    if (zF4 || objQ4 == obj5) {
                        objQ4 = new e7(i, kb4Var3, fv1Var);
                        dd4Var3.p0(objQ4);
                    }
                    vm7.g(fv1Var, zEquals, ou6VarL, (ib4) objQ4, dd4Var3, 8);
                    dd4Var3.q(false);
                }
                break;
            case 3:
                dr5 dr5Var4 = (dr5) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                dd4 dd4Var4 = (dd4) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                t02 t02Var = (t02) obj7;
                br9 br9Var = (br9) obj6;
                int i5 = (iIntValue8 & 6) == 0 ? iIntValue8 | (dd4Var4.f(dr5Var4) ? 4 : 2) : iIntValue8;
                if ((iIntValue8 & 48) == 0) {
                    i5 |= dd4Var4.d(iIntValue7) ? 32 : 16;
                }
                if (!dd4Var4.V(i5 & 1, (i5 & Token.EXPR_VOID) != 146)) {
                    dd4Var4.Y();
                } else {
                    sgb sgbVar2 = (sgb) list.get(iIntValue7);
                    dd4Var4.f0(-1864472288);
                    boolean z = iIntValue7 == 0;
                    boolean z2 = iIntValue7 == gc1.S(((s02) br9Var.getValue()).i);
                    boolean zContains2 = ((s02) br9Var.getValue()).h.contains(sgbVar2.a);
                    ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                    if (!z && !z2) {
                        dd4Var4.f0(-1722697798);
                        uw1VarD = ((q96) dd4Var4.j(s96.a)).c.a;
                        dd4Var4.q(false);
                    } else if (z && z2) {
                        dd4Var4.f0(-1722694667);
                        uw1VarD = ((q96) dd4Var4.j(s96.a)).c.d;
                        dd4Var4.q(false);
                    } else if (z) {
                        dd4Var4.f0(-1863832883);
                        ur9 ur9Var = s96.a;
                        uw1VarD = uw1.d(((q96) dd4Var4.j(ur9Var)).c.d, (ax1) null, (ax1) null, ((q96) dd4Var4.j(ur9Var)).c.a.c, ((q96) dd4Var4.j(ur9Var)).c.a.d, 3);
                        dd4Var4.q(false);
                    } else {
                        dd4Var4.f0(-1722680695);
                        ur9 ur9Var2 = s96.a;
                        uw1VarD = uw1.d(((q96) dd4Var4.j(ur9Var2)).c.d, ((q96) dd4Var4.j(ur9Var2)).c.a.a, ((q96) dd4Var4.j(ur9Var2)).c.a.b, (ax1) null, (ax1) null, 12);
                        dd4Var4.q(false);
                    }
                    ou6 ou6VarW2 = t96.w(ou6VarF, uw1VarD);
                    if (((s02) br9Var.getValue()).h.contains(sgbVar2.a)) {
                        dd4Var4.f0(-1863042662);
                        jG2 = lc1.c(0.65f, ((q96) dd4Var4.j(s96.a)).a.h);
                        dd4Var4.q(false);
                    } else {
                        dd4Var4.f0(-1862886205);
                        jG2 = dd1.g(((q96) dd4Var4.j(s96.a)).a, 1.0f);
                        dd4Var4.q(false);
                    }
                    ou6 ou6VarL2 = fe.L(ou6VarW2, jG2, jf0.G);
                    boolean zF5 = dd4Var4.f(t02Var) | dd4Var4.h(sgbVar2);
                    Object objQ5 = dd4Var4.Q();
                    if (zF5 || objQ5 == obj5) {
                        objQ5 = new e7(5, t02Var, sgbVar2);
                        dd4Var4.p0(objQ5);
                    }
                    h67.z(sgbVar2, zContains2, gjb.m0(fw.J(null, (ib4) objQ5, ou6VarL2, false, 15), 16.0f, 10.0f), dd4Var4, 8);
                    dd4Var4.q(false);
                }
                break;
            case 4:
                dr5 dr5Var5 = (dr5) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                dd4 dd4Var5 = (dd4) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                kb4 kb4Var4 = (kb4) obj7;
                int i6 = (iIntValue10 & 6) == 0 ? iIntValue10 | (dd4Var5.f(dr5Var5) ? 4 : 2) : iIntValue10;
                if ((iIntValue10 & 48) == 0) {
                    i6 |= dd4Var5.d(iIntValue9) ? 32 : 16;
                }
                if (!dd4Var5.V(i6 & 1, (i6 & Token.EXPR_VOID) != 146)) {
                    dd4Var5.Y();
                } else {
                    q26 q26Var = (q26) list.get(iIntValue9);
                    dd4Var5.f0(468565588);
                    boolean zEquals2 = q26Var.b.equals(((p74) obj6).b);
                    ou6 ou6VarR = tg9.r(gjb.n0(lu6Var, 6.0f, 0.0f, 2), 68.0f);
                    boolean zF6 = dd4Var5.f(kb4Var4) | dd4Var5.h(q26Var);
                    Object objQ6 = dd4Var5.Q();
                    if (zF6 || objQ6 == obj5) {
                        objQ6 = new e7(12, kb4Var4, q26Var);
                        dd4Var5.p0(objQ6);
                    }
                    h67.x(q26Var, zEquals2, ou6VarR, (ib4) objQ6, dd4Var5, 384);
                    dd4Var5.q(false);
                }
                break;
            case 5:
                dq5 dq5Var = (dq5) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                dd4 dd4Var6 = (dd4) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                kb4 kb4Var5 = (kb4) obj7;
                int i7 = (iIntValue12 & 6) == 0 ? iIntValue12 | (dd4Var6.f(dq5Var) ? 4 : 2) : iIntValue12;
                if ((iIntValue12 & 48) == 0) {
                    i7 |= dd4Var6.d(iIntValue11) ? 32 : 16;
                }
                if (!dd4Var6.V(i7 & 1, (i7 & Token.EXPR_VOID) != 146)) {
                    dd4Var6.Y();
                } else {
                    vl5 vl5Var = (vl5) list.get(iIntValue11);
                    dd4Var6.f0(1113038230);
                    String str = vl5Var.a;
                    String str2 = vl5Var.b;
                    boolean zF7 = dd4Var6.f(vl5Var);
                    Object objQ7 = dd4Var6.Q();
                    if (zF7 || objQ7 == obj5) {
                        String strK = j39.k(str2, '_', '-');
                        if (strK.length() == 0 || strK.equalsIgnoreCase("und")) {
                            strK = null;
                        }
                        if (strK == null) {
                            f36Var = null;
                        } else {
                            try {
                                pm8Var = new f36(tw1.n(strK));
                            } catch (Throwable th) {
                                pm8Var = new pm8(th);
                            }
                            if (pm8Var instanceof pm8) {
                                pm8Var = null;
                            }
                            f36Var = (f36) pm8Var;
                        }
                        String strA = f36Var != null ? f36Var.a() : null;
                        String str3 = strA != null ? strA : "";
                        dd4Var6.p0(str3);
                        objQ7 = str3;
                    }
                    String str4 = (String) objQ7;
                    vl5 vl5Var2 = ((gm5) obj6).a;
                    boolean zEquals3 = str2.equals(vl5Var2 != null ? vl5Var2.b : null);
                    ou6 ou6VarQ = t96.Q(dd4Var6, dq5.a(dq5Var, tg9.f(lu6Var, 1.0f)));
                    boolean zF8 = dd4Var6.f(kb4Var5) | dd4Var6.h(vl5Var);
                    Object objQ8 = dd4Var6.Q();
                    if (zF8 || objQ8 == obj5) {
                        objQ8 = new yq3(9, kb4Var5, vl5Var);
                        dd4Var6.p0(objQ8);
                    }
                    e11.w(str, str4, ou6VarQ, false, zEquals3, (kb4) objQ8, dd4Var6, 0, 8);
                    dd4Var6.q(false);
                }
                break;
            case 6:
                dr5 dr5Var6 = (dr5) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                dd4 dd4Var7 = (dd4) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                yb4 yb4Var2 = (yb4) obj6;
                int i8 = (iIntValue14 & 6) == 0 ? iIntValue14 | (dd4Var7.f(dr5Var6) ? 4 : 2) : iIntValue14;
                if ((iIntValue14 & 48) == 0) {
                    i8 |= dd4Var7.d(iIntValue13) ? 32 : 16;
                }
                if (!dd4Var7.V(i8 & 1, (i8 & Token.EXPR_VOID) != 146)) {
                    dd4Var7.Y();
                } else {
                    koa koaVar = (koa) list.get(iIntValue13);
                    dd4Var7.f0(-186558587);
                    boolean zEquals4 = ((String) obj7).equals(koaVar.a);
                    ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
                    boolean zF9 = dd4Var7.f(yb4Var2) | dd4Var7.f(koaVar);
                    Object objQ9 = dd4Var7.Q();
                    if (zF9 || objQ9 == obj5) {
                        objQ9 = new vr6(yb4Var2, koaVar, 1);
                        dd4Var7.p0(objQ9);
                    }
                    ou6 ou6VarJ = fw.J(null, (ib4) objQ9, ou6VarF2, false, 15);
                    if (zEquals4) {
                        dd4Var7.f0(-186191052);
                        jG3 = dd1.g(((q96) dd4Var7.j(s96.a)).a, 1.0f);
                        dd4Var7.q(false);
                    } else {
                        dd4Var7.f0(-185999999);
                        dd4Var7.q(false);
                        jG3 = lc1.i;
                    }
                    sdc.f(zEquals4, koaVar, gjb.m0(fe.L(ou6VarJ, jG3, jf0.G), 24.0f, 4.0f), dd4Var7, 0);
                    dd4Var7.q(false);
                }
                break;
            case 7:
                dr5 dr5Var7 = (dr5) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                dd4 dd4Var8 = (dd4) obj3;
                int iIntValue16 = ((Number) obj4).intValue();
                t27 t27Var = (t27) obj6;
                c97 c97Var = (c97) obj7;
                int i9 = (iIntValue16 & 6) == 0 ? iIntValue16 | (dd4Var8.f(dr5Var7) ? 4 : 2) : iIntValue16;
                if ((iIntValue16 & 48) == 0) {
                    i9 |= dd4Var8.d(iIntValue15) ? 32 : 16;
                }
                if (!dd4Var8.V(i9 & 1, (i9 & Token.EXPR_VOID) != 146)) {
                    dd4Var8.Y();
                } else {
                    x77 x77Var = (x77) list.get(iIntValue15);
                    dd4Var8.f0(167533888);
                    boolean zH = dd4Var8.h(x77Var) | dd4Var8.f(c97Var) | dd4Var8.f(t27Var);
                    Object objQ10 = dd4Var8.Q();
                    if (zH || objQ10 == obj5) {
                        objQ10 = new k90(i, x77Var, c97Var, t27Var);
                        dd4Var8.p0(objQ10);
                    }
                    lc5.B(x77Var, (ib4) objQ10, dd4Var8, 8);
                    dd4Var8.q(false);
                }
                break;
            default:
                dr5 dr5Var8 = (dr5) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                dd4 dd4Var9 = (dd4) obj3;
                int iIntValue18 = ((Number) obj4).intValue();
                t27 t27Var2 = (t27) obj7;
                int i10 = (iIntValue18 & 6) == 0 ? iIntValue18 | (dd4Var9.f(dr5Var8) ? 4 : 2) : iIntValue18;
                if ((iIntValue18 & 48) == 0) {
                    i10 |= dd4Var9.d(iIntValue17) ? 32 : 16;
                }
                if (!dd4Var9.V(i10 & 1, (i10 & Token.EXPR_VOID) != 146)) {
                    dd4Var9.Y();
                } else {
                    fv1 fv1Var2 = (fv1) list.get(iIntValue17);
                    dd4Var9.f0(-421838390);
                    ou6 ou6VarL3 = fe.L(t96.w(tg9.f(lu6Var, 1.0f), vm7.N(iIntValue17, ((d68) ((a07) obj6).getValue()).f.size(), dd4Var9)), dd1.g(((q96) dd4Var9.j(s96.a)).a, 1.0f), jf0.G);
                    boolean zF10 = dd4Var9.f(t27Var2) | dd4Var9.h(fv1Var2);
                    Object objQ11 = dd4Var9.Q();
                    if (zF10 || objQ11 == obj5) {
                        objQ11 = new e7(23, t27Var2, fv1Var2);
                        dd4Var9.p0(objQ11);
                    }
                    bx1.n(fv1Var2, ou6VarL3, (ib4) objQ11, dd4Var9, 8);
                    dd4Var9.q(false);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ ik0(List list, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = list;
        this.c = obj;
        this.d = obj2;
    }
}
