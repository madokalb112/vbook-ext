package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class u7a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s83 b;

    public /* synthetic */ u7a(s83 s83Var, int i) {
        this.a = i;
        this.b = s83Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        long jC;
        int i = this.a;
        lu6 lu6Var = lu6.a;
        heb hebVar = heb.a;
        Object obj3 = vl1.a;
        s83 s83Var = this.b;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    p35 p35VarC = i25.c((m53) f53.H.getValue(), dd4Var, 0);
                    if (((Boolean) s83Var.d.getValue()).booleanValue()) {
                        dd4Var.f0(70535324);
                        jC = ((q96) dd4Var.j(s96.a)).a.a;
                        dd4Var.q(false);
                    } else {
                        dd4Var.f0(70630215);
                        jC = lc1.c(0.5f, ((q96) dd4Var.j(s96.a)).a.q);
                        dd4Var.q(false);
                    }
                    ou6 ou6VarN = tg9.n(lu6Var, 24.0f);
                    boolean zF = dd4Var.f(s83Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj3) {
                        objQ = new s7a(s83Var, 2);
                        dd4Var.p0(objQ);
                    }
                    mx4.a(p35VarC, (String) null, fw.J(null, (ib4) objQ, ou6VarN, false, 15), jC, dd4Var, 48, 0);
                }
                break;
            case 1:
                dd4 dd4Var2 = (dd4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dd4Var2.Y();
                } else {
                    boolean zF2 = dd4Var2.f(s83Var);
                    Object objQ2 = dd4Var2.Q();
                    if (zF2 || objQ2 == obj3) {
                        objQ2 = new s7a(s83Var, 1);
                        dd4Var2.p0(objQ2);
                    }
                    lc5.J((ib4) objQ2, null, false, null, null, null, h67.r, dd4Var2, 805306368, 510);
                }
                break;
            default:
                dd4 dd4Var3 = (dd4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!dd4Var3.V(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dd4Var3.Y();
                } else {
                    Object objQ3 = dd4Var3.Q();
                    if (objQ3 == obj3) {
                        objQ3 = ky0.f(dd4Var3);
                    }
                    z44 z44Var = (z44) objQ3;
                    Object objQ4 = dd4Var3.Q();
                    if (objQ4 == obj3) {
                        objQ4 = new tb3(z44Var, null, 16);
                        dd4Var3.p0(objQ4);
                    }
                    lc5.u((yb4) objQ4, dd4Var3, z44Var);
                    ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                    ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var3, 0);
                    int iHashCode = Long.hashCode(dd4Var3.T);
                    lr7 lr7VarL = dd4Var3.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var3, ou6VarF);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var3.j0();
                    if (dd4Var3.S) {
                        dd4Var3.k(um1Var);
                    } else {
                        dd4Var3.s0();
                    }
                    un9.s(ll1.f, dd4Var3, ie1VarA);
                    un9.s(ll1.e, dd4Var3, lr7VarL);
                    un9.s(ll1.g, dd4Var3, Integer.valueOf(iHashCode));
                    un9.r(dd4Var3, ll1.h);
                    un9.s(ll1.d, dd4Var3, ou6VarL0);
                    String str = (String) s83Var.b.getValue();
                    qj5 qj5Var = new qj5(0, 6, Token.INC);
                    ur9 ur9Var = s96.a;
                    uw1 uw1Var = ((q96) dd4Var3.j(ur9Var)).c.b;
                    ou6 ou6VarB = jv3.B(gjb.n0(tg9.f(lu6Var, 1.0f), 8.0f, 0.0f, 2), z44Var);
                    boolean zF3 = dd4Var3.f(s83Var);
                    Object objQ5 = dd4Var3.Q();
                    if (zF3 || objQ5 == obj3) {
                        objQ5 = new r7a(s83Var, 1);
                        dd4Var3.p0(objQ5);
                    }
                    lx1.m(str, (kb4) objQ5, ou6VarB, false, false, null, h67.t, null, null, null, false, null, qj5Var, null, true, 0, 0, uw1Var, null, dd4Var3, 1572864, 12779520, 6127544);
                    un9.a(dd4Var3, tg9.h(lu6Var, 12.0f));
                    String str2 = (String) s83Var.c.getValue();
                    qj5 qj5Var2 = new qj5(0, 7, Token.INC);
                    uw1 uw1Var2 = ((q96) dd4Var3.j(ur9Var)).c.b;
                    ou6 ou6VarN0 = gjb.n0(tg9.f(lu6Var, 1.0f), 8.0f, 0.0f, 2);
                    boolean zF4 = dd4Var3.f(s83Var);
                    Object objQ6 = dd4Var3.Q();
                    if (zF4 || objQ6 == obj3) {
                        objQ6 = new r7a(s83Var, 2);
                        dd4Var3.p0(objQ6);
                    }
                    lx1.m(str2, (kb4) objQ6, ou6VarN0, false, false, null, h67.u, null, null, jf0.G(305065997, new u7a(s83Var, 0), dd4Var3), false, null, qj5Var2, null, true, 0, 0, uw1Var2, null, dd4Var3, 806879616, 12779520, 6127032);
                    xv5.z(dd4Var3, true, lu6Var, 12.0f, dd4Var3);
                }
                break;
        }
        return hebVar;
    }
}
