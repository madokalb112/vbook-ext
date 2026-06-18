package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dv1 implements zb4 {
    public final /* synthetic */ List a;
    public final /* synthetic */ e12 b;
    public final /* synthetic */ kb4 c;

    public dv1(List list, e12 e12Var, kb4 kb4Var) {
        this.a = list;
        this.b = e12Var;
        this.c = kb4Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        dd4 dd4Var = (dd4) obj2;
        int iIntValue2 = ((Number) obj3).intValue();
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= dd4Var.d(iIntValue) ? 4 : 2;
        }
        if ((iIntValue2 & 19) == 18 && dd4Var.F()) {
            dd4Var.Y();
        } else {
            e12 e12Var = (e12) this.a.get(iIntValue);
            boolean zQ = lc5.Q(this.b, e12Var);
            dd4Var.f0(-1633490746);
            kb4 kb4Var = this.c;
            boolean zF = dd4Var.f(kb4Var) | dd4Var.f(e12Var);
            Object objQ = dd4Var.Q();
            if (zF || objQ == vl1.a) {
                objQ = new y6(21, kb4Var, e12Var);
                dd4Var.p0(objQ);
            }
            dd4Var.q(false);
            ev1.d(e12Var, zQ, (ib4) objQ, null, dd4Var, 0);
        }
        return heb.a;
    }
}
