package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rb3 implements ac4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ List b;
    public final /* synthetic */ kj8 c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ kb4 e;
    public final /* synthetic */ a07 f;

    public rb3(List list, kj8 kj8Var, kb4 kb4Var, kb4 kb4Var2, a07 a07Var) {
        this.b = list;
        this.c = kj8Var;
        this.d = kb4Var;
        this.e = kb4Var2;
        this.f = a07Var;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        heb hebVar = heb.a;
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
                    w93 w93Var = (w93) list.get(iIntValue);
                    dd4Var.f0(1435631037);
                    gx1.o(dq5Var, this.c, w93Var.a, null, false, null, jf0.G(-1838104654, new qb3(iIntValue == 0, iIntValue == gc1.S((List) this.f.getValue()), w93Var, this.d, this.e, this.f), dd4Var), dd4Var, (i2 & 14) | 1572864);
                    dd4Var.q(false);
                }
                break;
            default:
                dq5 dq5Var2 = (dq5) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                dd4 dd4Var2 = (dd4) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i3 = (iIntValue4 & 6) == 0 ? (dd4Var2.f(dq5Var2) ? 4 : 2) | iIntValue4 : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i3 |= dd4Var2.d(iIntValue3) ? 32 : 16;
                }
                if (!dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
                    dd4Var2.Y();
                } else {
                    String str = (String) list.get(iIntValue3);
                    dd4Var2.f0(1320453703);
                    gx1.o(dq5Var2, this.c, str, null, false, null, jf0.G(1167897837, new l90(str, this.d, this.e, this.f, 10), dd4Var2), dd4Var2, (i3 & 14) | 1572864);
                    dd4Var2.q(false);
                }
                break;
        }
        return hebVar;
    }

    public rb3(List list, kj8 kj8Var, a07 a07Var, kb4 kb4Var, kb4 kb4Var2) {
        this.b = list;
        this.c = kj8Var;
        this.f = a07Var;
        this.d = kb4Var;
        this.e = kb4Var2;
    }
}
