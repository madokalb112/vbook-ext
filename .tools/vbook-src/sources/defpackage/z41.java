package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class z41 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ ub4 f;

    public /* synthetic */ z41(ihb ihbVar, List list, boolean z, a07 a07Var, kb4 kb4Var) {
        this.a = 10;
        this.d = ihbVar;
        this.e = list;
        this.c = z;
        this.b = a07Var;
        this.f = kb4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        ub4 ub4Var = this.f;
        Object obj3 = this.e;
        Object obj4 = this.b;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                kl8.k((String) obj5, this.c, (ou6) obj3, (ib4) obj4, (ib4) ub4Var, (dd4) obj, qu1.x0(199729));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ev1.a((ib4) obj4, (kf8) obj5, (kb4) obj3, this.c, (kb4) ub4Var, (dd4) obj, qu1.x0(7));
                break;
            case 2:
                ((Integer) obj2).getClass();
                t1c.f(this.c, (to3) obj5, (t27) obj4, (ou6) obj3, (kb4) ub4Var, (dd4) obj, qu1.x0(3073));
                break;
            case 3:
                ((Integer) obj2).getClass();
                m79.o(this.c, (String) obj5, (String) obj3, (kb4) obj4, (kb4) ub4Var, (dd4) obj, qu1.x0(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                lc5.A(this.c, (xr) obj3, (String) obj5, (kb4) obj4, (kb4) ub4Var, (dd4) obj, qu1.x0(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ww1.n(this.c, (String) obj5, (q5a) obj3, (kb4) obj4, (kb4) ub4Var, (dd4) obj, qu1.x0(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ex1.f(this.c, (String) obj5, (lm8) obj3, (kb4) obj4, (kb4) ub4Var, (dd4) obj, qu1.x0(3073));
                break;
            case 7:
                ((Integer) obj2).getClass();
                yn2.g(this.c, (kk0) obj5, (kb4) obj3, (kb4) ub4Var, (ib4) obj4, (dd4) obj, qu1.x0(65));
                break;
            case 8:
                ((Integer) obj2).getClass();
                wx1.m((String) obj5, (String) obj4, this.c, (ou6) obj3, (kb4) ub4Var, (dd4) obj, qu1.x0(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                qu1.e(this.c, (List) obj5, (List) obj3, (kb4) obj4, (kb4) ub4Var, (dd4) obj, qu1.x0(1));
                break;
            case 10:
                ihb ihbVar = (ihb) obj5;
                List list = (List) obj3;
                a07 a07Var = (a07) obj4;
                kb4 kb4Var = (kb4) ub4Var;
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    String str = (String) a07Var.getValue();
                    List list2 = list.isEmpty() ? ihbVar.h : list;
                    boolean zF = dd4Var.f(a07Var);
                    Object objQ = dd4Var.Q();
                    Object obj6 = vl1.a;
                    if (zF || objQ == obj6) {
                        objQ = new wo6(a07Var, 21);
                        dd4Var.p0(objQ);
                    }
                    kb4 kb4Var2 = (kb4) objQ;
                    boolean zF2 = dd4Var.f(kb4Var) | dd4Var.h(list);
                    Object objQ2 = dd4Var.Q();
                    if (zF2 || objQ2 == obj6) {
                        objQ2 = new vf6(27, kb4Var, list);
                        dd4Var.p0(objQ2);
                    }
                    lx1.u(ihbVar, str, list2, this.c, kb4Var2, (ib4) objQ2, null, dd4Var, 8);
                }
                break;
            case 11:
                ((Integer) obj2).getClass();
                lx1.k((ihb) obj5, this.c, (kb4) obj3, (kb4) obj4, (kb4) ub4Var, (dd4) obj, qu1.x0(9));
                break;
            default:
                ((Integer) obj2).getClass();
                gjb.K((xq2) obj5, (List) obj4, this.c, (ou6) obj3, (kb4) ub4Var, (dd4) obj, qu1.x0(24585));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ z41(ib4 ib4Var, kf8 kf8Var, kb4 kb4Var, boolean z, kb4 kb4Var2, int i) {
        this.a = 1;
        this.b = ib4Var;
        this.d = kf8Var;
        this.e = kb4Var;
        this.c = z;
        this.f = kb4Var2;
    }

    public /* synthetic */ z41(Object obj, Object obj2, boolean z, ou6 ou6Var, kb4 kb4Var, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = obj2;
        this.c = z;
        this.e = ou6Var;
        this.f = kb4Var;
    }

    public /* synthetic */ z41(Object obj, boolean z, Object obj2, ub4 ub4Var, ub4 ub4Var2, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.c = z;
        this.e = obj2;
        this.b = ub4Var;
        this.f = ub4Var2;
    }

    public /* synthetic */ z41(boolean z, xr xrVar, String str, kb4 kb4Var, kb4 kb4Var2, int i) {
        this.a = 4;
        this.c = z;
        this.e = xrVar;
        this.d = str;
        this.b = kb4Var;
        this.f = kb4Var2;
    }

    public /* synthetic */ z41(boolean z, kk0 kk0Var, kb4 kb4Var, kb4 kb4Var2, ib4 ib4Var, int i) {
        this.a = 7;
        this.c = z;
        this.d = kk0Var;
        this.e = kb4Var;
        this.f = kb4Var2;
        this.b = ib4Var;
    }

    public /* synthetic */ z41(boolean z, to3 to3Var, t27 t27Var, ou6 ou6Var, kb4 kb4Var, int i) {
        this.a = 2;
        this.c = z;
        this.d = to3Var;
        this.b = t27Var;
        this.e = ou6Var;
        this.f = kb4Var;
    }

    public /* synthetic */ z41(boolean z, Object obj, Object obj2, kb4 kb4Var, kb4 kb4Var2, int i, int i2) {
        this.a = i2;
        this.c = z;
        this.d = obj;
        this.e = obj2;
        this.b = kb4Var;
        this.f = kb4Var2;
    }
}
