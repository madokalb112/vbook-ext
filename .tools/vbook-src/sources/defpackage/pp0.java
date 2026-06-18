package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class pp0 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ kb4 c;

    public /* synthetic */ pp0(List list, kb4 kb4Var, int i) {
        this.a = i;
        this.b = list;
        this.c = kb4Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        kb4 kb4Var = this.c;
        List list = this.b;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((dq5) obj).getClass();
                if (dd4Var.V(1 & iIntValue, (iIntValue & 17) != 16)) {
                    fz1.h(0, kb4Var, dd4Var, null, list);
                } else {
                    dd4Var.Y();
                }
                break;
            default:
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        gc9 gc9Var = (gc9) list.get(i2);
                        rj1 rj1VarG = jf0.G(-302072060, new ah(gc9Var, 16), dd4Var2);
                        boolean zF = dd4Var2.f(kb4Var) | dd4Var2.f(gc9Var);
                        Object objQ = dd4Var2.Q();
                        if (zF || objQ == vl1.a) {
                            objQ = new al3(14, kb4Var, gc9Var);
                            dd4Var2.p0(objQ);
                        }
                        gx1.b(rj1VarG, null, null, (ib4) objQ, dd4Var2, 6, 30);
                    }
                } else {
                    dd4Var2.Y();
                }
                break;
        }
        return hebVar;
    }
}
