package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bd9 implements ac4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ gd9 c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ kb4 e;

    public /* synthetic */ bd9(List list, gd9 gd9Var, kb4 kb4Var, kb4 kb4Var2, int i) {
        this.a = i;
        this.b = list;
        this.c = gd9Var;
        this.d = kb4Var;
        this.e = kb4Var2;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        heb hebVar = heb.a;
        lu6 lu6Var = lu6.a;
        gd9 gd9Var = this.c;
        List list = this.b;
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
                if (!dd4Var.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                    dd4Var.Y();
                } else {
                    ob9 ob9Var = (ob9) list.get(iIntValue);
                    dd4Var.f0(943733972);
                    sdc.a(ob9Var, gd9Var.e, gd9Var.f, gd9Var.g, dq5.a(dq5Var, tg9.f(lu6Var, 1.0f)), this.d, this.e, dd4Var, 0);
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
                    ob9 ob9Var2 = (ob9) list.get(iIntValue3);
                    dd4Var2.f0(-713272269);
                    sdc.b(ob9Var2, gd9Var.e, gd9Var.f, gd9Var.g, dq5.a(dq5Var2, tg9.f(lu6Var, 1.0f)), this.d, this.e, dd4Var2, 0);
                    dd4Var2.q(false);
                }
                break;
            default:
                dq5 dq5Var3 = (dq5) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                dd4 dd4Var3 = (dd4) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                int i4 = (iIntValue6 & 6) == 0 ? iIntValue6 | (dd4Var3.f(dq5Var3) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i4 |= dd4Var3.d(iIntValue5) ? 32 : 16;
                }
                if (!dd4Var3.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
                    dd4Var3.Y();
                } else {
                    ob9 ob9Var3 = (ob9) list.get(iIntValue5);
                    dd4Var3.f0(-1504580052);
                    sdc.c(ob9Var3, gd9Var.e, gd9Var.f, gd9Var.g, dq5.a(dq5Var3, tg9.f(lu6Var, 1.0f)), this.d, this.e, dd4Var3, 0);
                    dd4Var3.q(false);
                }
                break;
        }
        return hebVar;
    }
}
