package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class uq2 implements ac4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ uq2(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        heb hebVar = heb.a;
        List list = this.b;
        int i2 = 1;
        int i3 = 0;
        switch (i) {
            case 0:
                dq5 dq5Var = (dq5) obj;
                int iIntValue = ((Number) obj2).intValue();
                dd4 dd4Var = (dd4) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i4 = (iIntValue2 & 6) == 0 ? iIntValue2 | (dd4Var.f(dq5Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i4 |= dd4Var.d(iIntValue) ? 32 : 16;
                }
                if (!dd4Var.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
                    dd4Var.Y();
                } else {
                    fn8 fn8Var = (fn8) list.get(iIntValue);
                    dd4Var.f0(1355994262);
                    fw.n(gjb.p0(lu6.a, 0.0f, 16.0f, 0.0f, 0.0f, 13), jf0.G(-1854349459, new tq2(fn8Var, i3), dd4Var), dd4Var, 54);
                    dd4Var.q(false);
                }
                break;
            case 1:
                dq5 dq5Var2 = (dq5) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                dd4 dd4Var2 = (dd4) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i5 = (iIntValue4 & 6) == 0 ? iIntValue4 | (dd4Var2.f(dq5Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i5 |= dd4Var2.d(iIntValue3) ? 32 : 16;
                }
                if (!dd4Var2.V(i5 & 1, (i5 & Token.EXPR_VOID) != 146)) {
                    dd4Var2.Y();
                } else {
                    fn8 fn8Var2 = (fn8) list.get(iIntValue3);
                    dd4Var2.f0(-2096997436);
                    fw.n(gjb.p0(lu6.a, 0.0f, 16.0f, 0.0f, 0.0f, 13), jf0.G(767842047, new tq2(fn8Var2, i2), dd4Var2), dd4Var2, 54);
                    dd4Var2.q(false);
                }
                break;
            case 2:
                dr5 dr5Var = (dr5) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                dd4 dd4Var3 = (dd4) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                int i6 = (iIntValue6 & 6) == 0 ? iIntValue6 | (dd4Var3.f(dr5Var) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i6 |= dd4Var3.d(iIntValue5) ? 32 : 16;
                }
                if (!dd4Var3.V(i6 & 1, (i6 & Token.EXPR_VOID) != 146)) {
                    dd4Var3.Y();
                } else {
                    to3 to3Var = (to3) list.get(iIntValue5);
                    dd4Var3.f0(1144324397);
                    lx1.s(to3Var, dd4Var3, 0);
                    dd4Var3.q(false);
                }
                break;
            default:
                dr5 dr5Var2 = (dr5) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                dd4 dd4Var4 = (dd4) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                int i7 = (iIntValue8 & 6) == 0 ? iIntValue8 | (dd4Var4.f(dr5Var2) ? 4 : 2) : iIntValue8;
                if ((iIntValue8 & 48) == 0) {
                    i7 |= dd4Var4.d(iIntValue7) ? 32 : 16;
                }
                if (!dd4Var4.V(i7 & 1, (i7 & Token.EXPR_VOID) != 146)) {
                    dd4Var4.Y();
                } else {
                    zf1 zf1Var = (zf1) list.get(iIntValue7);
                    dd4Var4.f0(-322619445);
                    ql9.c(zf1Var, tl9.j(dd4Var4, tg9.f(lu6.a, 1.0f)), dd4Var4, 8);
                    dd4Var4.q(false);
                }
                break;
        }
        return hebVar;
    }
}
