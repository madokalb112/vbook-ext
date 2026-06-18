package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wv2 implements ac4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ List b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ yb4 d;
    public final /* synthetic */ kb4 e;

    public wv2(List list, kb4 kb4Var, kb4 kb4Var2, yb4 yb4Var) {
        this.b = list;
        this.c = kb4Var;
        this.e = kb4Var2;
        this.d = yb4Var;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        int i = this.a;
        heb hebVar = heb.a;
        lu6 lu6Var = lu6.a;
        List list = this.b;
        Object obj5 = vl1.a;
        kb4 kb4Var = this.c;
        kb4 kb4Var2 = this.e;
        switch (i) {
            case 0:
                gu5 gu5Var = (gu5) obj;
                int iIntValue = ((Number) obj2).intValue();
                dd4 dd4Var = (dd4) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | (dd4Var.f(gu5Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= dd4Var.d(iIntValue) ? 32 : 16;
                }
                if (!dd4Var.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                    dd4Var.Y();
                } else {
                    pv2 pv2Var = (pv2) list.get(iIntValue);
                    dd4Var.f0(-1994672496);
                    ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                    ur9 ur9Var = s96.a;
                    ou6 ou6VarL = fe.L(t96.w(ou6VarF, ((q96) dd4Var.j(ur9Var)).c.d), dd1.g(((q96) dd4Var.j(ur9Var)).a, 2.0f), jf0.G);
                    boolean zF = dd4Var.f(kb4Var) | dd4Var.h(pv2Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj5) {
                        z = false;
                        objQ = new vv2(kb4Var, pv2Var, 0);
                        dd4Var.p0(objQ);
                    } else {
                        z = false;
                    }
                    ou6 ou6VarL0 = gjb.l0(fw.J(null, (ib4) objQ, ou6VarL, z, 15), 14.0f);
                    boolean zF2 = dd4Var.f(kb4Var2) | dd4Var.h(pv2Var);
                    Object objQ2 = dd4Var.Q();
                    if (zF2 || objQ2 == obj5) {
                        objQ2 = new vv2(kb4Var2, pv2Var, 1);
                        dd4Var.p0(objQ2);
                    }
                    fe.l(pv2Var, ou6VarL0, (ib4) objQ2, this.d, dd4Var, 8);
                    dd4Var.q(false);
                }
                break;
            default:
                dr5 dr5Var = (dr5) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                dd4 dd4Var2 = (dd4) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i3 = (iIntValue4 & 6) == 0 ? iIntValue4 | (dd4Var2.f(dr5Var) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i3 |= dd4Var2.d(iIntValue3) ? 32 : 16;
                }
                if (!dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
                    dd4Var2.Y();
                } else {
                    xm3 xm3Var = (xm3) list.get(iIntValue3);
                    dd4Var2.f0(247709757);
                    ou6 ou6VarN0 = gjb.n0(gjb.p0(dr5.a(dr5Var, tg9.f(lu6Var, 1.0f)), 0.0f, 0.0f, 0.0f, 12.0f, 7), 16.0f, 0.0f, 2);
                    boolean zF3 = dd4Var2.f(kb4Var) | dd4Var2.h(xm3Var);
                    Object objQ3 = dd4Var2.Q();
                    if (zF3 || objQ3 == obj5) {
                        objQ3 = new gk0(1, xm3Var, kb4Var);
                        dd4Var2.p0(objQ3);
                    }
                    ib4 ib4Var = (ib4) objQ3;
                    yb4 yb4Var = this.d;
                    boolean zF4 = dd4Var2.f(yb4Var) | dd4Var2.h(xm3Var);
                    Object objQ4 = dd4Var2.Q();
                    if (zF4 || objQ4 == obj5) {
                        objQ4 = new hk0(yb4Var, xm3Var, 1);
                        dd4Var2.p0(objQ4);
                    }
                    kb4 kb4Var3 = (kb4) objQ4;
                    boolean zF5 = dd4Var2.f(kb4Var2) | dd4Var2.h(xm3Var);
                    Object objQ5 = dd4Var2.Q();
                    if (zF5 || objQ5 == obj5) {
                        objQ5 = new gk0(2, xm3Var, kb4Var2);
                        dd4Var2.p0(objQ5);
                    }
                    wx1.g(xm3Var, ou6VarN0, ib4Var, kb4Var3, (ib4) objQ5, dd4Var2, 0);
                    dd4Var2.q(false);
                }
                break;
        }
        return hebVar;
    }

    public wv2(List list, kb4 kb4Var, yb4 yb4Var, kb4 kb4Var2) {
        this.b = list;
        this.c = kb4Var;
        this.d = yb4Var;
        this.e = kb4Var2;
    }
}
