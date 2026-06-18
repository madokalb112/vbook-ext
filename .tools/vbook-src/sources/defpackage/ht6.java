package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ht6 implements ac4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ a07 e;

    public /* synthetic */ ht6(List list, String str, kb4 kb4Var, a07 a07Var, int i) {
        this.a = i;
        this.b = list;
        this.c = str;
        this.d = kb4Var;
        this.e = a07Var;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.e;
        Object obj5 = vl1.a;
        lu6 lu6Var = lu6.a;
        String str = this.c;
        List list = this.b;
        kb4 kb4Var = this.d;
        switch (i) {
            case 0:
                dr5 dr5Var = (dr5) obj;
                int iIntValue = ((Number) obj2).intValue();
                dd4 dd4Var = (dd4) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | (dd4Var.f(dr5Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= dd4Var.d(iIntValue) ? 32 : 16;
                }
                if (!dd4Var.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                    dd4Var.Y();
                } else {
                    r5b r5bVar = (r5b) list.get(iIntValue);
                    dd4Var.f0(-1064498060);
                    dd4Var.f0(-1973998032);
                    String strK = r5bVar.b;
                    String str2 = r5bVar.a;
                    if (strK.length() == 0) {
                        strK = str2;
                    }
                    if (strK.length() == 0) {
                        strK = wn9.K((pv9) vt9.H.getValue(), dd4Var);
                    }
                    String str3 = strK;
                    dd4Var.q(false);
                    boolean zEquals = str2.equals(str);
                    ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                    Boolean boolValueOf = Boolean.valueOf(zEquals);
                    boolean zF = dd4Var.f(kb4Var) | dd4Var.h(r5bVar);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj5) {
                        objQ = new gt6(kb4Var, r5bVar, a07Var, 0);
                        dd4Var.p0(objQ);
                    }
                    gx1.c(str3, null, null, boolValueOf, ou6VarF, (ib4) objQ, dd4Var, 24576, 6);
                    dd4Var.q(false);
                }
                break;
            default:
                dr5 dr5Var2 = (dr5) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                dd4 dd4Var2 = (dd4) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i3 = (iIntValue4 & 6) == 0 ? iIntValue4 | (dd4Var2.f(dr5Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i3 |= dd4Var2.d(iIntValue3) ? 32 : 16;
                }
                if (!dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
                    dd4Var2.Y();
                } else {
                    r5b r5bVar2 = (r5b) list.get(iIntValue3);
                    dd4Var2.f0(283232042);
                    dd4Var2.f0(-406502214);
                    String strK2 = r5bVar2.b;
                    String str4 = r5bVar2.a;
                    if (strK2.length() == 0) {
                        strK2 = str4;
                    }
                    if (strK2.length() == 0) {
                        strK2 = wn9.K((pv9) vt9.H.getValue(), dd4Var2);
                    }
                    String str5 = strK2;
                    dd4Var2.q(false);
                    boolean zEquals2 = str4.equals(str);
                    ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
                    Boolean boolValueOf2 = Boolean.valueOf(zEquals2);
                    boolean zF2 = dd4Var2.f(kb4Var) | dd4Var2.h(r5bVar2);
                    Object objQ2 = dd4Var2.Q();
                    if (zF2 || objQ2 == obj5) {
                        objQ2 = new gt6(kb4Var, r5bVar2, a07Var, 1);
                        dd4Var2.p0(objQ2);
                    }
                    gx1.c(str5, null, null, boolValueOf2, ou6VarF2, (ib4) objQ2, dd4Var2, 24576, 6);
                    dd4Var2.q(false);
                }
                break;
        }
        return hebVar;
    }
}
