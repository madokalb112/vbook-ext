package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xq3 implements ac4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ kb4 d;

    public /* synthetic */ xq3(List list, kb4 kb4Var, kb4 kb4Var2, int i) {
        this.a = i;
        this.b = list;
        this.c = kb4Var;
        this.d = kb4Var2;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        kb4 kb4Var = this.c;
        Object obj5 = vl1.a;
        kb4 kb4Var2 = this.d;
        heb hebVar = heb.a;
        lu6 lu6Var = lu6.a;
        List list = this.b;
        switch (i) {
            case 0:
                dq5 dq5Var = (dq5) obj;
                int iIntValue = ((Number) obj2).intValue();
                dd4 dd4Var = (dd4) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i2 = (iIntValue2 & 6) == 0 ? (dd4Var.f(dq5Var) ? 4 : 2) | iIntValue2 : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= dd4Var.d(iIntValue) ? 32 : 16;
                }
                if (!dd4Var.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                    dd4Var.Y();
                } else {
                    to3 to3Var = (to3) list.get(iIntValue);
                    dd4Var.f0(899501514);
                    ou6 ou6VarA = dq5.a(dq5Var, lu6Var);
                    ur9 ur9Var = s96.a;
                    ou6 ou6VarW = t96.w(ou6VarA, ((q96) dd4Var.j(ur9Var)).c.a);
                    boolean z = to3Var.p;
                    boolean zF = dd4Var.f(kb4Var) | dd4Var.h(to3Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj5) {
                        objQ = new gq0(kb4Var, to3Var, 1);
                        dd4Var.p0(objQ);
                    }
                    ou6 ou6VarM0 = gjb.m0(fe.L(fw.J(null, (ib4) objQ, ou6VarW, z, 14), dd1.g(((q96) dd4Var.j(ur9Var)).a, 1.0f), jf0.G), 16.0f, 8.0f);
                    boolean zF2 = dd4Var.f(kb4Var2) | dd4Var.h(to3Var);
                    Object objQ2 = dd4Var.Q();
                    if (zF2 || objQ2 == obj5) {
                        objQ2 = new gq0(kb4Var2, to3Var, 2);
                        dd4Var.p0(objQ2);
                    }
                    gc1.l(to3Var, wm3.b, false, ou6VarM0, (ib4) objQ2, dd4Var, 48, 4);
                    dd4Var.q(false);
                }
                break;
            case 1:
                dq5 dq5Var2 = (dq5) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                dd4 dd4Var2 = (dd4) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i3 = (iIntValue4 & 6) == 0 ? iIntValue4 | (dd4Var2.f(dq5Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i3 |= dd4Var2.d(iIntValue3) ? 32 : 16;
                }
                if (!dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
                    dd4Var2.Y();
                } else {
                    o54 o54Var = (o54) list.get(iIntValue3);
                    dd4Var2.f0(2109053080);
                    ou6 ou6VarA2 = dq5.a(dq5Var2, tg9.f(lu6Var, 1.0f));
                    boolean zF3 = dd4Var2.f(kb4Var) | dd4Var2.f(o54Var);
                    Object objQ3 = dd4Var2.Q();
                    if (zF3 || objQ3 == obj5) {
                        objQ3 = new e7(11, kb4Var, o54Var);
                        dd4Var2.p0(objQ3);
                    }
                    ib4 ib4Var = (ib4) objQ3;
                    boolean zF4 = dd4Var2.f(kb4Var2) | dd4Var2.f(o54Var);
                    Object objQ4 = dd4Var2.Q();
                    if (zF4 || objQ4 == obj5) {
                        objQ4 = new yq3(i, kb4Var2, o54Var);
                        dd4Var2.p0(objQ4);
                    }
                    lc5.n(o54Var, ou6VarA2, ib4Var, (kb4) objQ4, dd4Var2, 0);
                    dd4Var2.q(false);
                }
                break;
            case 2:
                dr5 dr5Var = (dr5) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                dd4 dd4Var3 = (dd4) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                int i4 = (iIntValue6 & 6) == 0 ? iIntValue6 | (dd4Var3.f(dr5Var) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i4 |= dd4Var3.d(iIntValue5) ? 32 : 16;
                }
                if (!dd4Var3.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
                    dd4Var3.Y();
                } else {
                    i0a i0aVar = (i0a) list.get(iIntValue5);
                    dd4Var3.f0(-1083893663);
                    t96.t(i0aVar, gjb.m0(lu6Var, 24.0f, 6.0f), this.c, this.d, dd4Var3, 48);
                    dd4Var3.q(false);
                }
                break;
            case 3:
                dr5 dr5Var2 = (dr5) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                dd4 dd4Var4 = (dd4) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                int i5 = (iIntValue8 & 6) == 0 ? (dd4Var4.f(dr5Var2) ? 4 : 2) | iIntValue8 : iIntValue8;
                if ((iIntValue8 & 48) == 0) {
                    i5 |= dd4Var4.d(iIntValue7) ? 32 : 16;
                }
                if (!dd4Var4.V(i5 & 1, (i5 & Token.EXPR_VOID) != 146)) {
                    dd4Var4.Y();
                } else {
                    oy4 oy4Var = (oy4) list.get(iIntValue7);
                    dd4Var4.f0(-728007554);
                    ou6 ou6VarM02 = gjb.m0(dr5.a(dr5Var2, tg9.f(lu6Var, 1.0f)), 20.0f, 4.0f);
                    boolean zF5 = dd4Var4.f(kb4Var) | dd4Var4.f(oy4Var);
                    Object objQ5 = dd4Var4.Q();
                    if (zF5 || objQ5 == obj5) {
                        objQ5 = new sm6(kb4Var, oy4Var, 0);
                        dd4Var4.p0(objQ5);
                    }
                    ib4 ib4Var2 = (ib4) objQ5;
                    boolean zF6 = dd4Var4.f(kb4Var2) | dd4Var4.f(oy4Var);
                    Object objQ6 = dd4Var4.Q();
                    if (zF6 || objQ6 == obj5) {
                        objQ6 = new sm6(kb4Var2, oy4Var, 1);
                        dd4Var4.p0(objQ6);
                    }
                    vm7.b(oy4Var, ou6VarM02, ib4Var2, (ib4) objQ6, dd4Var4, 0);
                    dd4Var4.q(false);
                }
                break;
            case 4:
                dr5 dr5Var3 = (dr5) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                dd4 dd4Var5 = (dd4) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                int i6 = (iIntValue10 & 6) == 0 ? iIntValue10 | (dd4Var5.f(dr5Var3) ? 4 : 2) : iIntValue10;
                if ((iIntValue10 & 48) == 0) {
                    i6 |= dd4Var5.d(iIntValue9) ? 32 : 16;
                }
                if (!dd4Var5.V(i6 & 1, (i6 & Token.EXPR_VOID) != 146)) {
                    dd4Var5.Y();
                } else {
                    v78 v78Var = (v78) list.get(iIntValue9);
                    dd4Var5.f0(-441087805);
                    ou6 ou6VarM03 = gjb.m0(dr5.a(dr5Var3, tg9.f(lu6Var, 1.0f)), 8.0f, 4.0f);
                    boolean zF7 = dd4Var5.f(kb4Var) | dd4Var5.h(v78Var);
                    Object objQ7 = dd4Var5.Q();
                    if (zF7 || objQ7 == obj5) {
                        objQ7 = new vn6(kb4Var, v78Var, 0);
                        dd4Var5.p0(objQ7);
                    }
                    ib4 ib4Var3 = (ib4) objQ7;
                    boolean zF8 = dd4Var5.f(kb4Var2) | dd4Var5.h(v78Var);
                    Object objQ8 = dd4Var5.Q();
                    if (zF8 || objQ8 == obj5) {
                        objQ8 = new vn6(kb4Var2, v78Var, 1);
                        dd4Var5.p0(objQ8);
                    }
                    wx1.D(v78Var, ou6VarM03, ib4Var3, (ib4) objQ8, dd4Var5, 8);
                    dd4Var5.q(false);
                }
                break;
            case 5:
                dq5 dq5Var3 = (dq5) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                dd4 dd4Var6 = (dd4) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                int i7 = (iIntValue12 & 6) == 0 ? iIntValue12 | (dd4Var6.f(dq5Var3) ? 4 : 2) : iIntValue12;
                if ((iIntValue12 & 48) == 0) {
                    i7 |= dd4Var6.d(iIntValue11) ? 32 : 16;
                }
                if (!dd4Var6.V(i7 & 1, (i7 & Token.EXPR_VOID) != 146)) {
                    dd4Var6.Y();
                } else {
                    ob9 ob9Var = (ob9) list.get(iIntValue11);
                    dd4Var6.f0(709105337);
                    sdc.d(ob9Var, dq5.a(dq5Var3, gjb.p0(gjb.l0(tg9.f(lu6Var, 1.0f), 4.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7)), this.c, this.d, dd4Var6, 0);
                    dd4Var6.q(false);
                }
                break;
            default:
                dq5 dq5Var4 = (dq5) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                dd4 dd4Var7 = (dd4) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                int i8 = (iIntValue14 & 6) == 0 ? iIntValue14 | (dd4Var7.f(dq5Var4) ? 4 : 2) : iIntValue14;
                if ((iIntValue14 & 48) == 0) {
                    i8 |= dd4Var7.d(iIntValue13) ? 32 : 16;
                }
                if (!dd4Var7.V(i8 & 1, (i8 & Token.EXPR_VOID) != 146)) {
                    dd4Var7.Y();
                } else {
                    ob9 ob9Var2 = (ob9) list.get(iIntValue13);
                    dd4Var7.f0(1133375330);
                    sdc.d(ob9Var2, dq5.a(dq5Var4, tg9.f(lu6Var, 1.0f)), this.c, this.d, dd4Var7, 0);
                    dd4Var7.q(false);
                }
                break;
        }
        return hebVar;
    }
}
