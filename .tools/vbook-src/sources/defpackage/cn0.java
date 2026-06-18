package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class cn0 implements yb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;

    public /* synthetic */ cn0(int i, kb4 kb4Var, int i2, ou6 ou6Var, rj1 rj1Var, int i3) {
        this.b = i;
        this.f = kb4Var;
        this.d = i2;
        this.c = ou6Var;
        this.s = rj1Var;
        this.e = i3;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        heb hebVar;
        f9 f9Var;
        List list;
        boolean z;
        int i = this.a;
        int i2 = this.e;
        int i3 = this.d;
        heb hebVar2 = heb.a;
        Object obj3 = this.c;
        Object obj4 = this.s;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                t1c.b(this.b, (kb4) obj5, this.d, (ou6) obj3, (rj1) obj4, (dd4) obj, qu1.x0(i2 | 1));
                return hebVar2;
            case 1:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(i3 | 1);
                gc1.r(this.b, iX0, this.e, (yb4) obj4, (dd4) obj, (ou6) obj3, (String) obj5);
                return hebVar2;
            case 2:
                kb4 kb4Var = (kb4) obj5;
                List list2 = (List) obj3;
                kb4 kb4Var2 = (kb4) obj4;
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                f9 f9Var2 = bv4.b;
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                    return hebVar2;
                }
                ha6 ha6VarD = pn0.d(f9Var2, false);
                int iHashCode = Long.hashCode(dd4Var.T);
                lr7 lr7VarL = dd4Var.l();
                lu6 lu6Var = lu6.a;
                ou6 ou6VarL0 = s32.L0(dd4Var, lu6Var);
                ml1.k.getClass();
                um1 um1Var = ll1.b;
                dd4Var.j0();
                if (dd4Var.S) {
                    dd4Var.k(um1Var);
                } else {
                    dd4Var.s0();
                }
                un9.s(ll1.f, dd4Var, ha6VarD);
                un9.s(ll1.e, dd4Var, lr7VarL);
                un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
                un9.r(dd4Var, ll1.h);
                un9.s(ll1.d, dd4Var, ou6VarL0);
                p35 p35VarC = i25.c((m53) a53.M.getValue(), dd4Var, 0);
                int i4 = this.b;
                boolean z2 = i4 == 0;
                boolean zF = dd4Var.f(kb4Var);
                Object objQ = dd4Var.Q();
                Object obj6 = vl1.a;
                if (zF || objQ == obj6) {
                    objQ = new b41(11, kb4Var);
                    dd4Var.p0(objQ);
                }
                sdc.t(0, (ib4) objQ, dd4Var, p35VarC, null, z2);
                dd4 dd4Var2 = dd4Var;
                int i5 = 6;
                if (i3 > 0) {
                    dd4Var2.f0(666449420);
                    ou6 ou6VarA = zn0.a.a(lu6Var, bv4.d);
                    rj1 rj1VarG = jf0.G(253360494, new i51(i3, i5), dd4Var2);
                    f9Var = f9Var2;
                    hebVar = hebVar2;
                    yb0.a(3072, 6, 0L, 0L, rj1VarG, dd4Var2, ou6VarA);
                    dd4Var2 = dd4Var2;
                    dd4Var2.q(false);
                } else {
                    hebVar = hebVar2;
                    f9Var = f9Var2;
                    dd4Var2.f0(666603180);
                    dd4Var2.q(false);
                }
                dd4Var2.q(true);
                p35 p35VarC2 = i25.c((m53) a53.t.getValue(), dd4Var2, 0);
                boolean z3 = 1 == i4;
                boolean zF2 = dd4Var2.f(kb4Var);
                Object objQ2 = dd4Var2.Q();
                if (zF2 || objQ2 == obj6) {
                    objQ2 = new b41(13, kb4Var);
                    dd4Var2.p0(objQ2);
                }
                dd4 dd4Var3 = dd4Var2;
                sdc.t(0, (ib4) objQ2, dd4Var3, p35VarC2, null, z3);
                p35 p35VarC3 = i25.c((m53) f53.l.getValue(), dd4Var3, 0);
                boolean z4 = 2 == i4;
                boolean zF3 = dd4Var3.f(kb4Var);
                Object objQ3 = dd4Var3.Q();
                if (zF3 || objQ3 == obj6) {
                    objQ3 = new b41(14, kb4Var);
                    dd4Var3.p0(objQ3);
                }
                sdc.t(0, (ib4) objQ3, dd4Var3, p35VarC3, null, z4);
                List listR = wm9.r((hv9) rv.w.getValue(), dd4Var3);
                boolean zF4 = dd4Var3.f(list2);
                Object objQ4 = dd4Var3.Q();
                if (zF4 || objQ4 == obj6) {
                    List listU0 = fc1.u0(listR);
                    ArrayList arrayList = new ArrayList(gc1.M(listU0, 10));
                    int i6 = 0;
                    for (Object obj7 : listU0) {
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            gc1.i0();
                            throw null;
                        }
                        String str = (String) obj7;
                        Long l = (Long) fc1.A0(i6, list2);
                        List list3 = listR;
                        arrayList.add(new gc9(i6, str, l != null ? l.longValue() : 0L));
                        listR = list3;
                        i6 = i7;
                    }
                    list = listR;
                    objQ4 = dk9.x(arrayList);
                    dd4Var3.p0(objQ4);
                } else {
                    list = listR;
                }
                a07 a07Var = (a07) objQ4;
                ha6 ha6VarD2 = pn0.d(f9Var, false);
                int iHashCode2 = Long.hashCode(dd4Var3.T);
                lr7 lr7VarL2 = dd4Var3.l();
                ou6 ou6VarL02 = s32.L0(dd4Var3, lu6Var);
                ml1.k.getClass();
                um1 um1Var2 = ll1.b;
                dd4Var3.j0();
                if (dd4Var3.S) {
                    dd4Var3.k(um1Var2);
                } else {
                    dd4Var3.s0();
                }
                un9.s(ll1.f, dd4Var3, ha6VarD2);
                un9.s(ll1.e, dd4Var3, lr7VarL2);
                un9.s(ll1.g, dd4Var3, Integer.valueOf(iHashCode2));
                un9.r(dd4Var3, ll1.h);
                un9.s(ll1.d, dd4Var3, ou6VarL02);
                Object[] objArr = new Object[0];
                Object objQ5 = dd4Var3.Q();
                if (objQ5 == obj6) {
                    objQ5 = new un4(3);
                    dd4Var3.p0(objQ5);
                }
                a07 a07Var2 = (a07) ww1.b0(objArr, (ib4) objQ5, dd4Var3, 48);
                String str2 = (String) fc1.A0(i2, list);
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = str2;
                boolean z5 = 3 == i4;
                boolean z6 = !((List) a07Var.getValue()).isEmpty();
                boolean zF5 = dd4Var3.f(kb4Var);
                Object objQ6 = dd4Var3.Q();
                if (zF5 || objQ6 == obj6) {
                    objQ6 = new b41(15, kb4Var);
                    dd4Var3.p0(objQ6);
                }
                ib4 ib4Var = (ib4) objQ6;
                boolean zF6 = dd4Var3.f(a07Var) | dd4Var3.f(a07Var2);
                Object objQ7 = dd4Var3.Q();
                if (zF6 || objQ7 == obj6) {
                    objQ7 = new x41(a07Var, a07Var2, 6);
                    dd4Var3.p0(objQ7);
                }
                sdc.Z(str3, z5, z6, ib4Var, (ib4) objQ7, dd4Var3, 3072, 0);
                boolean zBooleanValue = ((Boolean) a07Var2.getValue()).booleanValue();
                List list4 = (List) a07Var.getValue();
                boolean zF7 = dd4Var3.f(a07Var2);
                Object objQ8 = dd4Var3.Q();
                if (zF7 || objQ8 == obj6) {
                    objQ8 = new zl3(a07Var2, 21);
                    dd4Var3.p0(objQ8);
                }
                ib4 ib4Var2 = (ib4) objQ8;
                boolean zF8 = dd4Var3.f(kb4Var2) | dd4Var3.f(a07Var2);
                Object objQ9 = dd4Var3.Q();
                if (zF8 || objQ9 == obj6) {
                    z = true;
                    objQ9 = new vt2(1, kb4Var2, a07Var2);
                    dd4Var3.p0(objQ9);
                } else {
                    z = true;
                }
                sdc.P(zBooleanValue, list4, ib4Var2, (kb4) objQ9, dd4Var3, 0);
                dd4Var3.q(z);
                String strK = wn9.K((pv9) iu9.n.getValue(), dd4Var3);
                boolean z7 = 4 == i4;
                boolean zF9 = dd4Var3.f(kb4Var);
                Object objQ10 = dd4Var3.Q();
                if (zF9 || objQ10 == obj6) {
                    objQ10 = new b41(16, kb4Var);
                    dd4Var3.p0(objQ10);
                }
                sdc.Z(strK, z7, false, (ib4) objQ10, null, dd4Var3, 3072, 36);
                String strK2 = wn9.K((pv9) eu9.I0.getValue(), dd4Var3);
                boolean z8 = 5 == i4;
                boolean zF10 = dd4Var3.f(kb4Var);
                Object objQ11 = dd4Var3.Q();
                if (zF10 || objQ11 == obj6) {
                    objQ11 = new b41(12, kb4Var);
                    dd4Var3.p0(objQ11);
                }
                sdc.Z(strK2, z8, false, (ib4) objQ11, null, dd4Var3, 3072, 36);
                return hebVar;
            default:
                ((Integer) obj2).getClass();
                m79.n((p35) obj5, (String) obj4, this.b, (ou6) obj3, (dd4) obj, qu1.x0(i3 | 1), this.e);
                return hebVar2;
        }
    }

    public /* synthetic */ cn0(int i, kb4 kb4Var, List list, int i2, int i3, kb4 kb4Var2) {
        this.b = i;
        this.f = kb4Var;
        this.c = list;
        this.d = i2;
        this.e = i3;
        this.s = kb4Var2;
    }

    public /* synthetic */ cn0(p35 p35Var, String str, int i, ou6 ou6Var, int i2, int i3) {
        this.f = p35Var;
        this.s = str;
        this.b = i;
        this.c = ou6Var;
        this.d = i2;
        this.e = i3;
    }

    public /* synthetic */ cn0(String str, int i, ou6 ou6Var, yb4 yb4Var, int i2, int i3) {
        this.f = str;
        this.b = i;
        this.c = ou6Var;
        this.s = yb4Var;
        this.d = i2;
        this.e = i3;
    }
}
