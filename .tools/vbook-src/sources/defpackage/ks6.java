package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ks6 implements ac4 {
    public final /* synthetic */ List a;
    public final /* synthetic */ int b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ a07 d;

    public ks6(List list, int i, kb4 kb4Var, a07 a07Var) {
        this.a = list;
        this.b = i;
        this.c = kb4Var;
        this.d = a07Var;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        dr5 dr5Var = (dr5) obj;
        int iIntValue = ((Number) obj2).intValue();
        dd4 dd4Var = (dd4) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (dd4Var.f(dr5Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= dd4Var.d(iIntValue) ? 32 : 16;
        }
        boolean z = true;
        if (dd4Var.V(i & 1, (i & Token.EXPR_VOID) != 146)) {
            y71 y71Var = (y71) this.a.get(iIntValue);
            dd4Var.f0(-1714494161);
            boolean z2 = y71Var.c;
            String strN = y71Var.a;
            if (z2) {
                strN = tw2.n(strN, " (Online)");
            }
            String str = strN;
            String str2 = y71Var.b;
            boolean z3 = this.b == iIntValue;
            ou6 ou6VarF = tg9.f(lu6.a, 1.0f);
            Boolean boolValueOf = Boolean.valueOf(z3);
            kb4 kb4Var = this.c;
            boolean zF = dd4Var.f(kb4Var);
            if ((((i & Token.ASSIGN_MOD) ^ 48) <= 32 || !dd4Var.d(iIntValue)) && (i & 48) != 32) {
                z = false;
            }
            boolean z4 = zF | z;
            Object objQ = dd4Var.Q();
            if (z4 || objQ == vl1.a) {
                objQ = new hs6(iIntValue, kb4Var, this.d);
                dd4Var.p0(objQ);
            }
            gx1.c(str, str2, null, boolValueOf, ou6VarF, (ib4) objQ, dd4Var, 24576, 4);
            dd4Var.q(false);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }
}
