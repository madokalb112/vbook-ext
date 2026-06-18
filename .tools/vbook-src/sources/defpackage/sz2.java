package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class sz2 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o83 b;

    public /* synthetic */ sz2(o83 o83Var, int i) {
        this.a = i;
        this.b = o83Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = vl1.a;
        heb hebVar = heb.a;
        o83 o83Var = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                o83Var.b(str, str2);
                break;
            case 1:
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    boolean zF = dd4Var.f(o83Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj3) {
                        objQ = new qz2(o83Var, 2);
                        dd4Var.p0(objQ);
                    }
                    lc5.J((ib4) objQ, null, false, null, null, null, jf0.q, dd4Var, 805306368, 510);
                }
                break;
            default:
                dd4 dd4Var2 = (dd4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dd4Var2.Y();
                } else {
                    Object objQ2 = dd4Var2.Q();
                    if (objQ2 == obj3) {
                        objQ2 = ky0.f(dd4Var2);
                    }
                    z44 z44Var = (z44) objQ2;
                    Object objQ3 = dd4Var2.Q();
                    if (objQ3 == obj3) {
                        objQ3 = new tb3(z44Var, null, 7);
                        dd4Var2.p0(objQ3);
                    }
                    lc5.u((yb4) objQ3, dd4Var2, z44Var);
                    lu6 lu6Var = lu6.a;
                    ou6 ou6VarQ = kc5.Q(tg9.f(lu6Var, 1.0f), kc5.J(dd4Var2), 14);
                    ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
                    int iHashCode = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL = dd4Var2.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarQ);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(um1Var);
                    } else {
                        dd4Var2.s0();
                    }
                    un9.s(ll1.f, dd4Var2, ie1VarA);
                    un9.s(ll1.e, dd4Var2, lr7VarL);
                    un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
                    un9.r(dd4Var2, ll1.h);
                    un9.s(ll1.d, dd4Var2, ou6VarL0);
                    String str3 = (String) o83Var.b.getValue();
                    ur9 ur9Var = s96.a;
                    uw1 uw1Var = ((q96) dd4Var2.j(ur9Var)).c.b;
                    ou6 ou6VarB = jv3.B(gjb.n0(tg9.f(lu6Var, 1.0f), 8.0f, 0.0f, 2), z44Var);
                    boolean zF2 = dd4Var2.f(o83Var);
                    Object objQ4 = dd4Var2.Q();
                    if (zF2 || objQ4 == obj3) {
                        objQ4 = new sj6(o83Var, 1);
                        dd4Var2.p0(objQ4);
                    }
                    lx1.m(str3, (kb4) objQ4, ou6VarB, false, false, null, jf0.s, null, null, null, false, null, null, null, true, 0, 0, uw1Var, null, dd4Var2, 1572864, 12582912, 6160312);
                    un9.a(dd4Var2, tg9.h(lu6Var, 12.0f));
                    String str4 = (String) o83Var.c.getValue();
                    uw1 uw1Var2 = ((q96) dd4Var2.j(ur9Var)).c.b;
                    ou6 ou6VarN0 = gjb.n0(tg9.f(lu6Var, 1.0f), 8.0f, 0.0f, 2);
                    boolean zF3 = dd4Var2.f(o83Var);
                    Object objQ5 = dd4Var2.Q();
                    if (zF3 || objQ5 == obj3) {
                        objQ5 = new sj6(o83Var, 2);
                        dd4Var2.p0(objQ5);
                    }
                    lx1.m(str4, (kb4) objQ5, ou6VarN0, false, false, null, jf0.t, null, null, null, false, null, null, null, false, 0, 0, uw1Var2, null, dd4Var2, 1573248, 0, 6291384);
                    xv5.z(dd4Var2, true, lu6Var, 12.0f, dd4Var2);
                }
                break;
        }
        return hebVar;
    }
}
