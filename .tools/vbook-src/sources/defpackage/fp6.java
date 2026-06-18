package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class fp6 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ bc9 c;
    public final /* synthetic */ kb4 d;

    public /* synthetic */ fp6(List list, bc9 bc9Var, kb4 kb4Var, int i) {
        this.a = i;
        this.b = list;
        this.c = bc9Var;
        this.d = kb4Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        kb4 kb4Var = this.d;
        bc9 bc9Var = this.c;
        List list = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    yn2.b(tg9.f(lu6.a, 1.0f), new mv(8.0f, true, new gp(5)), new mv(8.0f, true, new gp(5)), (wf0) null, 0, 0, jf0.G(1271149993, new fp6(list, bc9Var, kb4Var, i2), dd4Var), dd4Var, 1573302);
                } else {
                    dd4Var.Y();
                }
                return hebVar;
            default:
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c44) obj).getClass();
                if (dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    int i3 = 0;
                    for (Object obj4 : list) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            gc1.i0();
                            throw null;
                        }
                        String str = (String) obj4;
                        int i5 = bc9Var.c;
                        boolean z = i5 == i3;
                        boolean z2 = i5 == i3;
                        boolean z3 = z && bc9Var.d == 0;
                        boolean zF = dd4Var2.f(kb4Var) | dd4Var2.d(i3);
                        Object objQ = dd4Var2.Q();
                        if (zF || objQ == vl1.a) {
                            objQ = new bk0(kb4Var, i3, 7);
                            dd4Var2.p0(objQ);
                        }
                        tu1.k(str, z3, z2, null, null, (ib4) objQ, dd4Var2, 0);
                        i3 = i4;
                    }
                } else {
                    dd4Var2.Y();
                }
                return hebVar;
        }
    }
}
