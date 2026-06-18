package defpackage;

import java.util.List;
import java.util.Set;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ym6 implements ac4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Set d;
    public final /* synthetic */ yb4 e;
    public final /* synthetic */ kb4 f;

    public /* synthetic */ ym6(int i, kb4 kb4Var, yb4 yb4Var, String str, List list, Set set) {
        this.a = i;
        this.b = list;
        this.c = str;
        this.d = set;
        this.e = yb4Var;
        this.f = kb4Var;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        long jG;
        int i2;
        long jG2;
        int i3 = this.a;
        lu6 lu6Var = lu6.a;
        String str = this.c;
        List list = this.b;
        Object obj5 = vl1.a;
        Set set = this.d;
        yb4 yb4Var = this.e;
        kb4 kb4Var = this.f;
        switch (i3) {
            case 0:
                dr5 dr5Var = (dr5) obj;
                int iIntValue = ((Number) obj2).intValue();
                dd4 dd4Var = (dd4) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (dd4Var.f(dr5Var) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= dd4Var.d(iIntValue) ? 32 : 16;
                }
                if (dd4Var.V(i & 1, (i & Token.EXPR_VOID) != 146)) {
                    d35 d35Var = (d35) list.get(iIntValue);
                    dd4Var.f0(661320626);
                    String str2 = d35Var.a;
                    boolean zQ = lc5.Q(str, str2);
                    boolean zF = dd4Var.f(set) | dd4Var.f(str2);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj5) {
                        objQ = Boolean.valueOf(set.contains(str2));
                        dd4Var.p0(objQ);
                    }
                    boolean zBooleanValue = ((Boolean) objQ).booleanValue();
                    ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                    boolean zF2 = dd4Var.f(yb4Var) | dd4Var.f(d35Var);
                    Object objQ2 = dd4Var.Q();
                    if (zF2 || objQ2 == obj5) {
                        objQ2 = new e7(16, yb4Var, d35Var);
                        dd4Var.p0(objQ2);
                    }
                    ou6 ou6VarJ = fw.J(null, (ib4) objQ2, ou6VarF, false, 15);
                    if (zQ) {
                        dd4Var.f0(662033191);
                        jG = dd1.g(((q96) dd4Var.j(s96.a)).a, 1.0f);
                        dd4Var.q(false);
                    } else {
                        dd4Var.f0(662239868);
                        dd4Var.q(false);
                        jG = lc1.i;
                    }
                    ou6 ou6VarM0 = gjb.m0(fe.L(ou6VarJ, jG, jf0.G), 24.0f, 4.0f);
                    boolean zF3 = dd4Var.f(kb4Var) | dd4Var.f(d35Var);
                    Object objQ3 = dd4Var.Q();
                    if (zF3 || objQ3 == obj5) {
                        objQ3 = new e7(17, kb4Var, d35Var);
                        dd4Var.p0(objQ3);
                    }
                    vm7.F(d35Var, zQ, zBooleanValue, ou6VarM0, (ib4) objQ3, dd4Var, 0);
                    dd4Var.q(false);
                } else {
                    dd4Var.Y();
                }
                break;
            default:
                dr5 dr5Var2 = (dr5) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                dd4 dd4Var2 = (dd4) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (dd4Var2.f(dr5Var2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= dd4Var2.d(iIntValue3) ? 32 : 16;
                }
                if (dd4Var2.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                    koa koaVar = (koa) list.get(iIntValue3);
                    dd4Var2.f0(1524020321);
                    String str3 = koaVar.a;
                    boolean zQ2 = lc5.Q(str, str3);
                    boolean zF4 = dd4Var2.f(set) | dd4Var2.f(str3);
                    Object objQ4 = dd4Var2.Q();
                    if (zF4 || objQ4 == obj5) {
                        objQ4 = Boolean.valueOf(set.contains(str3));
                        dd4Var2.p0(objQ4);
                    }
                    boolean zBooleanValue2 = ((Boolean) objQ4).booleanValue();
                    ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
                    boolean zF5 = dd4Var2.f(yb4Var) | dd4Var2.f(koaVar);
                    Object objQ5 = dd4Var2.Q();
                    if (zF5 || objQ5 == obj5) {
                        objQ5 = new vr6(yb4Var, koaVar, 0);
                        dd4Var2.p0(objQ5);
                    }
                    ou6 ou6VarJ2 = fw.J(null, (ib4) objQ5, ou6VarF2, false, 15);
                    if (zQ2) {
                        dd4Var2.f0(1524732886);
                        jG2 = dd1.g(((q96) dd4Var2.j(s96.a)).a, 1.0f);
                        dd4Var2.q(false);
                    } else {
                        dd4Var2.f0(1524939563);
                        dd4Var2.q(false);
                        jG2 = lc1.i;
                    }
                    ou6 ou6VarM02 = gjb.m0(fe.L(ou6VarJ2, jG2, jf0.G), 24.0f, 4.0f);
                    boolean zF6 = dd4Var2.f(kb4Var) | dd4Var2.f(koaVar);
                    Object objQ6 = dd4Var2.Q();
                    if (zF6 || objQ6 == obj5) {
                        objQ6 = new e7(21, kb4Var, koaVar);
                        dd4Var2.p0(objQ6);
                    }
                    p7c.P(koaVar, zQ2, zBooleanValue2, ou6VarM02, (ib4) objQ6, dd4Var2, 0);
                    dd4Var2.q(false);
                } else {
                    dd4Var2.Y();
                }
                break;
        }
        return heb.a;
    }
}
