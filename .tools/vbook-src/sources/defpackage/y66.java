package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class y66 implements ac4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ pj8 c;
    public final /* synthetic */ a07 d;
    public final /* synthetic */ zb4 e;
    public final /* synthetic */ kb4 f;

    public /* synthetic */ y66(List list, pj8 pj8Var, a07 a07Var, zb4 zb4Var, kb4 kb4Var, int i) {
        this.a = i;
        this.b = list;
        this.c = pj8Var;
        this.d = a07Var;
        this.e = zb4Var;
        this.f = kb4Var;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.d;
        List list = this.b;
        switch (i) {
            case 0:
                dr5 dr5Var = (dr5) obj;
                int iIntValue = ((Number) obj2).intValue();
                dd4 dd4Var = (dd4) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i2 = (iIntValue2 & 6) == 0 ? (dd4Var.f(dr5Var) ? 4 : 2) | iIntValue2 : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= dd4Var.d(iIntValue) ? 32 : 16;
                }
                if (!dd4Var.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                    dd4Var.Y();
                } else {
                    yha yhaVar = (yha) list.get(iIntValue);
                    dd4Var.f0(1434014689);
                    lx1.p(dr5Var, this.c, yhaVar.a, null, false, null, jf0.G(3624498, new qb3(iIntValue == 0, iIntValue == gc1.S((List) a07Var.getValue()), this.e, yhaVar, this.f, this.d, 1), dd4Var), dd4Var, (i2 & 14) | 1572864, 28);
                    dd4Var.q(false);
                }
                break;
            default:
                dr5 dr5Var2 = (dr5) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                dd4 dd4Var2 = (dd4) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i3 = (iIntValue4 & 6) == 0 ? (dd4Var2.f(dr5Var2) ? 4 : 2) | iIntValue4 : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i3 |= dd4Var2.d(iIntValue3) ? 32 : 16;
                }
                if (!dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
                    dd4Var2.Y();
                } else {
                    o78 o78Var = (o78) list.get(iIntValue3);
                    dd4Var2.f0(-1663186337);
                    lx1.p(dr5Var2, this.c, o78Var.a, null, false, null, jf0.G(1400808167, new qb3(iIntValue3 == 0, iIntValue3 == gc1.S((List) a07Var.getValue()), this.e, o78Var, this.f, this.d, 2), dd4Var2), dd4Var2, (i3 & 14) | 1572864, 28);
                    dd4Var2.q(false);
                }
                break;
        }
        return hebVar;
    }
}
