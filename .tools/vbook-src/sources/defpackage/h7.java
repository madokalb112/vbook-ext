package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class h7 implements ac4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h7(int i, List list, Object obj) {
        this.a = i;
        this.b = list;
        this.c = obj;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        Object obj5 = vl1.a;
        heb hebVar = heb.a;
        lu6 lu6Var = lu6.a;
        List list = this.b;
        Object obj6 = this.c;
        int i2 = 0;
        int i3 = 1;
        switch (i) {
            case 0:
                dr5 dr5Var = (dr5) obj;
                int iIntValue = ((Number) obj2).intValue();
                dd4 dd4Var = (dd4) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                j7 j7Var = (j7) obj6;
                int i4 = (iIntValue2 & 6) == 0 ? iIntValue2 | (dd4Var.f(dr5Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i4 |= dd4Var.d(iIntValue) ? 32 : 16;
                }
                if (!dd4Var.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
                    dd4Var.Y();
                } else {
                    sgb sgbVar = (sgb) list.get(iIntValue);
                    dd4Var.f0(435578653);
                    ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                    ur9 ur9Var = s96.a;
                    ou6 ou6VarL = fe.L(t96.w(ou6VarF, ((q96) dd4Var.j(ur9Var)).c.d), ((q96) dd4Var.j(ur9Var)).a.I, jf0.G);
                    boolean zF = dd4Var.f(j7Var) | dd4Var.h(sgbVar);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj5) {
                        objQ = new e7(i2, j7Var, sgbVar);
                        dd4Var.p0(objQ);
                    }
                    vo1.d(sgbVar, gjb.m0(fw.J(null, (ib4) objQ, ou6VarL, false, 15), 14.0f, 12.0f), dd4Var, 8);
                    dd4Var.q(false);
                }
                break;
            case 1:
                dq5 dq5Var = (dq5) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                dd4 dd4Var2 = (dd4) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                a07 a07Var = (a07) obj6;
                int i5 = (iIntValue4 & 6) == 0 ? iIntValue4 | (dd4Var2.f(dq5Var) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i5 |= dd4Var2.d(iIntValue3) ? 32 : 16;
                }
                if (!dd4Var2.V(i5 & 1, (i5 & Token.EXPR_VOID) != 146)) {
                    dd4Var2.Y();
                } else {
                    pz0 pz0Var = (pz0) list.get(iIntValue3);
                    dd4Var2.f0(391148845);
                    ou6 ou6VarP0 = gjb.p0(tg9.f(lu6Var, 1.0f), 0.0f, 0.0f, 0.0f, 12.0f, 7);
                    boolean zF2 = dd4Var2.f(a07Var) | dd4Var2.f(pz0Var);
                    Object objQ2 = dd4Var2.Q();
                    if (zF2 || objQ2 == obj5) {
                        objQ2 = new e7(i3, pz0Var, a07Var);
                        dd4Var2.p0(objQ2);
                    }
                    h67.j(pz0Var, ou6VarP0, (ib4) objQ2, dd4Var2, 48);
                    dd4Var2.q(false);
                }
                break;
            default:
                dr5 dr5Var2 = (dr5) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                dd4 dd4Var3 = (dd4) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                co0 co0Var = (co0) obj6;
                int i6 = (iIntValue6 & 6) == 0 ? iIntValue6 | (dd4Var3.f(dr5Var2) ? 4 : 2) : iIntValue6;
                if ((48 & iIntValue6) == 0) {
                    i6 |= dd4Var3.d(iIntValue5) ? 32 : 16;
                }
                if (!dd4Var3.V(i6 & 1, (i6 & Token.EXPR_VOID) != 146)) {
                    dd4Var3.Y();
                } else {
                    dd4Var3.f0(560574658);
                    pn0.a(tg9.o(lu6Var, co0Var.d(), co0Var.c()), dd4Var3, 0);
                    dd4Var3.q(false);
                }
                break;
        }
        return hebVar;
    }
}
