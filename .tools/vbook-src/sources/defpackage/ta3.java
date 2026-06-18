package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ta3 implements ac4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ bc3 d;

    public /* synthetic */ ta3(List list, kb4 kb4Var, bc3 bc3Var, int i) {
        this.a = i;
        this.b = list;
        this.c = kb4Var;
        this.d = bc3Var;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj5 = vl1.a;
        lu6 lu6Var = lu6.a;
        List list = this.b;
        kb4 kb4Var = this.c;
        bc3 bc3Var = this.d;
        switch (i) {
            case 0:
                dq5 dq5Var = (dq5) obj;
                int iIntValue = ((Number) obj2).intValue();
                dd4 dd4Var = (dd4) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | (dd4Var.f(dq5Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= dd4Var.d(iIntValue) ? 32 : 16;
                }
                int i3 = i2;
                if (!dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
                    dd4Var.Y();
                } else {
                    v93 v93Var = (v93) list.get(iIntValue);
                    dd4Var.f0(895084861);
                    ou6 ou6VarE0 = sdc.e0(1.0f, tg9.f(lu6Var, 1.0f), false);
                    boolean zF = dd4Var.f(kb4Var) | dd4Var.f(bc3Var) | dd4Var.h(v93Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj5) {
                        objQ = new ra3(v93Var, kb4Var, bc3Var, 0);
                        dd4Var.p0(objQ);
                    }
                    vw1.b(v93Var, gjb.l0(dq5.a(dq5Var, fw.J(null, (ib4) objQ, ou6VarE0, false, 15)), 4.0f), dd4Var, 0);
                    dd4Var.q(false);
                }
                break;
            default:
                dq5 dq5Var2 = (dq5) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                dd4 dd4Var2 = (dd4) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i4 = (iIntValue4 & 6) == 0 ? iIntValue4 | (dd4Var2.f(dq5Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i4 |= dd4Var2.d(iIntValue3) ? 32 : 16;
                }
                if (!dd4Var2.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
                    dd4Var2.Y();
                } else {
                    v93 v93Var2 = (v93) list.get(iIntValue3);
                    dd4Var2.f0(405148734);
                    ou6 ou6VarE02 = sdc.e0(1.0f, tg9.f(lu6Var, 1.0f), false);
                    boolean zF2 = dd4Var2.f(kb4Var) | dd4Var2.f(bc3Var) | dd4Var2.h(v93Var2);
                    Object objQ2 = dd4Var2.Q();
                    if (zF2 || objQ2 == obj5) {
                        objQ2 = new ra3(v93Var2, kb4Var, bc3Var, 1);
                        dd4Var2.p0(objQ2);
                    }
                    vw1.b(v93Var2, gjb.l0(fw.J(null, (ib4) objQ2, ou6VarE02, false, 15), 4.0f), dd4Var2, 0);
                    dd4Var2.q(false);
                }
                break;
        }
        return hebVar;
    }
}
