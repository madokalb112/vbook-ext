package defpackage;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class si6 implements zb4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ si6(boolean z, kb4 kb4Var, xr xrVar, String str, kb4 kb4Var2) {
        this.b = z;
        this.c = kb4Var;
        this.f = xrVar;
        this.d = str;
        this.e = kb4Var2;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                xr xrVar = (xr) obj4;
                kb4 kb4Var = (kb4) obj5;
                co0 co0Var = (co0) obj;
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                co0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= dd4Var.f(co0Var) ? 4 : 2;
                }
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 19) != 18)) {
                    dd4Var.Y();
                } else {
                    ou6 ou6VarH = tg9.h(lu6.a, (co0Var.c() * 8.0f) / 9.0f);
                    String str = this.d;
                    kb4 kb4Var2 = this.c;
                    fw.q(this.b, kb4Var2, ou6VarH, true, null, null, 0L, 0L, 0.0f, 0L, null, jf0.G(1258939351, new hu2((Serializable) xrVar, (Object) str, kb4Var, (Object) kb4Var2, 11), dd4Var), dd4Var, 3072, 48, 2032);
                }
                break;
            default:
                List list = (List) obj5;
                yb4 yb4Var = (yb4) obj4;
                co0 co0Var2 = (co0) obj;
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                co0Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= dd4Var2.f(co0Var2) ? 4 : 2;
                }
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    dd4Var2.Y();
                } else {
                    fw.q(this.b, this.c, null, true, null, null, 0L, 0L, 0.0f, 0L, null, jf0.G(1332563083, new hu2(co0Var2, this.d, list, yb4Var, 13), dd4Var2), dd4Var2, 3072, 48, 2036);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ si6(boolean z, kb4 kb4Var, String str, List list, yb4 yb4Var) {
        this.b = z;
        this.c = kb4Var;
        this.d = str;
        this.e = list;
        this.f = yb4Var;
    }
}
