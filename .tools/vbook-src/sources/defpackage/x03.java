package defpackage;

import java.util.List;
import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class x03 implements yb4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ ub4 s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ x03(r03 r03Var, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, ib4 ib4Var5, ib4 ib4Var6, ib4 ib4Var7, int i) {
        this.b = r03Var;
        this.c = ou6Var;
        this.d = ib4Var;
        this.e = ib4Var2;
        this.f = ib4Var3;
        this.s = ib4Var4;
        this.t = ib4Var5;
        this.u = ib4Var6;
        this.v = ib4Var7;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj3 = this.v;
        Object obj4 = this.u;
        Object obj5 = this.t;
        ub4 ub4Var = this.s;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.c;
        Object obj10 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                vo1.q((r03) obj10, (ou6) obj9, (ib4) obj8, (ib4) obj7, (ib4) obj6, (ib4) ub4Var, (ib4) obj5, (ib4) obj4, (ib4) obj3, (dd4) obj, qu1.x0(1));
                break;
            default:
                final a07 a07Var = (a07) obj10;
                final cc4 cc4Var = (cc4) obj9;
                final a07 a07Var2 = (a07) obj8;
                final a07 a07Var3 = (a07) obj7;
                final a07 a07Var4 = (a07) obj6;
                final kb4 kb4Var = (kb4) ub4Var;
                final a07 a07Var5 = (a07) obj5;
                final a07 a07Var6 = (a07) obj4;
                final a07 a07Var7 = (a07) obj3;
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    boolean zF = dd4Var.f(a07Var) | dd4Var.f(cc4Var) | dd4Var.f(a07Var2) | dd4Var.f(a07Var3) | dd4Var.f(a07Var4) | dd4Var.f(kb4Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == vl1.a) {
                        ib4 ib4Var = new ib4() { // from class: ei6
                            @Override // defpackage.ib4
                            public final Object invoke() {
                                int iIntValue2 = ((Number) a07Var.getValue()).intValue();
                                cc4 cc4Var2 = cc4Var;
                                a07 a07Var8 = a07Var2;
                                a07 a07Var9 = a07Var3;
                                a07 a07Var10 = a07Var4;
                                a07 a07Var11 = a07Var5;
                                if (iIntValue2 == 0) {
                                    cc4Var2.h(-1, -1, Boolean.valueOf(sw1.k(a07Var8)), Boolean.valueOf(sw1.l(a07Var9)), Boolean.valueOf(sw1.j(a07Var10)), (List) a07Var11.getValue());
                                } else if (iIntValue2 == 1) {
                                    cc4Var2.h(-1, 50, Boolean.valueOf(sw1.k(a07Var8)), Boolean.valueOf(sw1.l(a07Var9)), Boolean.valueOf(sw1.j(a07Var10)), (List) a07Var11.getValue());
                                } else if (iIntValue2 == 2) {
                                    cc4Var2.h(-1, 100, Boolean.valueOf(sw1.k(a07Var8)), Boolean.valueOf(sw1.l(a07Var9)), Boolean.valueOf(sw1.j(a07Var10)), (List) a07Var11.getValue());
                                } else if (iIntValue2 == 3) {
                                    cc4Var2.h(-1, Integer.valueOf(Context.VERSION_ES6), Boolean.valueOf(sw1.k(a07Var8)), Boolean.valueOf(sw1.l(a07Var9)), Boolean.valueOf(sw1.j(a07Var10)), (List) a07Var11.getValue());
                                } else if (iIntValue2 == 4) {
                                    Integer numM = iw9.M((String) a07Var6.getValue());
                                    int iIntValue3 = numM != null ? numM.intValue() : 0;
                                    if (iIntValue3 < 1) {
                                        iIntValue3 = 1;
                                    }
                                    int i2 = iIntValue3 - 1;
                                    Integer numM2 = iw9.M((String) a07Var7.getValue());
                                    int iIntValue4 = numM2 != null ? numM2.intValue() : 0;
                                    if (iIntValue4 < 1) {
                                        iIntValue4 = 1;
                                    }
                                    int i3 = (iIntValue4 - 1) - i2;
                                    cc4Var2.h(Integer.valueOf(i2), Integer.valueOf((i3 >= 0 ? i3 : 0) + 1), Boolean.FALSE, Boolean.valueOf(sw1.l(a07Var9)), Boolean.valueOf(sw1.j(a07Var10)), (List) a07Var11.getValue());
                                }
                                kb4Var.invoke(Boolean.FALSE);
                                return heb.a;
                            }
                        };
                        dd4Var.p0(ib4Var);
                        objQ = ib4Var;
                    }
                    lc5.J((ib4) objQ, null, false, null, null, null, lc5.r, dd4Var, 805306368, 510);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ x03(kb4 kb4Var, cc4 cc4Var, a07 a07Var, a07 a07Var2, a07 a07Var3, a07 a07Var4, a07 a07Var5, a07 a07Var6, a07 a07Var7) {
        this.b = a07Var;
        this.c = cc4Var;
        this.d = a07Var2;
        this.e = a07Var3;
        this.f = a07Var4;
        this.s = kb4Var;
        this.t = a07Var5;
        this.u = a07Var6;
        this.v = a07Var7;
    }
}
