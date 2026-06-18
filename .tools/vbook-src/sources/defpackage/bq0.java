package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bq0 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bq0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                return new bi4(((bi4) ((k7) obj4).invoke((qq5) obj, ((List) obj3).get(((Number) obj2).intValue()))).a);
            case 1:
                dd4 dd4Var = (dd4) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && dd4Var.F()) {
                    dd4Var.Y();
                } else {
                    ev1.b((ou6) obj4, jf0.G(-1630443845, new cv1((h12) obj3, 0), dd4Var), dd4Var, 48);
                }
                return hebVar;
            case 2:
                dd4 dd4Var2 = (dd4) obj;
                br9 br9Var = (br9) obj3;
                if ((((Number) obj2).intValue() & 3) == 2 && dd4Var2.F()) {
                    dd4Var2.Y();
                } else {
                    a07 a07VarA = dk9.A((e12) obj4, dd4Var2);
                    ou6 ou6VarN = tg9.n(lu6.a, 20.0f);
                    dd4Var2.f0(-1633490746);
                    boolean zF = dd4Var2.f(a07VarA) | dd4Var2.f(br9Var);
                    Object objQ = dd4Var2.Q();
                    if (zF || objQ == vl1.a) {
                        objQ = new v(24, a07VarA, br9Var);
                        dd4Var2.p0(objQ);
                    }
                    dd4Var2.q(false);
                    pn0.a(md2.B(ou6VarN, (kb4) objQ), dd4Var2, 0);
                }
                return hebVar;
            case 3:
                return new bi4(((bi4) ((kx1) obj4).invoke((qq5) obj, ((List) obj3).get(((Number) obj2).intValue()))).a);
            case 4:
                return new bi4(((bi4) ((vw8) obj4).invoke((qq5) obj, ((List) obj3).get(((Number) obj2).intValue()))).a);
            case 5:
                return new bi4(((bi4) ((vw8) obj4).invoke((qq5) obj, ((List) obj3).get(((Number) obj2).intValue()))).a);
            default:
                int iIntValue = ((Number) obj2).intValue();
                return new bi4(((bi4) ((tn8) obj4).c((qq5) obj, Integer.valueOf(iIntValue), ((List) obj3).get(iIntValue))).a);
        }
    }
}
