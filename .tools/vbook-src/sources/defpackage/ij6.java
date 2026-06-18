package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ij6 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kn2 b;

    public /* synthetic */ ij6(kn2 kn2Var, int i) {
        this.a = i;
        this.b = kn2Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        long jC;
        int i = this.a;
        lu6 lu6Var = lu6.a;
        heb hebVar = heb.a;
        fu6 fu6Var = vl1.a;
        kn2 kn2Var = this.b;
        boolean z = false;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    p35 p35VarC = i25.c((m53) f53.b0.getValue(), dd4Var, 0);
                    if (((Boolean) kn2Var.c.getValue()).booleanValue()) {
                        dd4Var.f0(370292709);
                        jC = ((q96) dd4Var.j(s96.a)).a.a;
                        dd4Var.q(false);
                    } else {
                        dd4Var.f0(370387600);
                        jC = lc1.c(0.5f, ((q96) dd4Var.j(s96.a)).a.q);
                        dd4Var.q(false);
                    }
                    long j = jC;
                    ou6 ou6VarN = tg9.n(lu6Var, 24.0f);
                    boolean zF = dd4Var.f(kn2Var);
                    Object objQ = dd4Var.Q();
                    Object obj3 = objQ;
                    if (zF || objQ == fu6Var) {
                        jj6 jj6Var = new jj6(kn2Var, 0);
                        dd4Var.p0(jj6Var);
                        obj3 = jj6Var;
                    }
                    mx4.a(p35VarC, (String) null, fw.J(null, (ib4) obj3, ou6VarN, false, 15), j, dd4Var, 48, 0);
                }
                break;
            case 1:
                dd4 dd4Var2 = (dd4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dd4Var2.Y();
                } else {
                    boolean zF2 = dd4Var2.f(kn2Var);
                    Object objQ2 = dd4Var2.Q();
                    Object obj4 = objQ2;
                    if (zF2 || objQ2 == fu6Var) {
                        jj6 jj6Var2 = new jj6(kn2Var, 1);
                        dd4Var2.p0(jj6Var2);
                        obj4 = jj6Var2;
                    }
                    lc5.J((ib4) obj4, null, false, null, null, null, gc1.g, dd4Var2, 805306368, 510);
                }
                break;
            default:
                dd4 dd4Var3 = (dd4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!dd4Var3.V(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dd4Var3.Y();
                } else {
                    Object objQ3 = dd4Var3.Q();
                    Object objF = objQ3;
                    if (objQ3 == fu6Var) {
                        objF = ky0.f(dd4Var3);
                    }
                    z44 z44Var = (z44) objF;
                    Object objQ4 = dd4Var3.Q();
                    Object obj5 = objQ4;
                    if (objQ4 == fu6Var) {
                        tb3 tb3Var = new tb3(z44Var, null, 6);
                        dd4Var3.p0(tb3Var);
                        obj5 = tb3Var;
                    }
                    lc5.u((yb4) obj5, dd4Var3, z44Var);
                    Object objQ5 = dd4Var3.Q();
                    Object obj6 = objQ5;
                    if (objQ5 == fu6Var) {
                        String str = (String) kn2Var.b.getValue();
                        int length = ((String) kn2Var.b.getValue()).length();
                        cn7 cn7VarX = dk9.x(new wga(str, zk9.h(length, length), 4));
                        dd4Var3.p0(cn7VarX);
                        obj6 = cn7VarX;
                    }
                    a07 a07Var = (a07) obj6;
                    ou6 ou6VarQ = kc5.Q(tg9.f(lu6Var, 1.0f), kc5.J(dd4Var3), 14);
                    ha6 ha6VarD = pn0.d(bv4.b, false);
                    int iHashCode = Long.hashCode(dd4Var3.T);
                    lr7 lr7VarL = dd4Var3.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var3, ou6VarQ);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var3.j0();
                    if (dd4Var3.S) {
                        dd4Var3.k(um1Var);
                    } else {
                        dd4Var3.s0();
                    }
                    un9.s(ll1.f, dd4Var3, ha6VarD);
                    un9.s(ll1.e, dd4Var3, lr7VarL);
                    un9.s(ll1.g, dd4Var3, Integer.valueOf(iHashCode));
                    un9.r(dd4Var3, ll1.h);
                    un9.s(ll1.d, dd4Var3, ou6VarL0);
                    wga wgaVar = (wga) a07Var.getValue();
                    qj5 qj5Var = new qj5(0, 7, Token.INC);
                    uw1 uw1Var = ((q96) dd4Var3.j(s96.a)).c.b;
                    ou6 ou6VarB = jv3.B(gjb.n0(tg9.f(lu6Var, 1.0f), 8.0f, 0.0f, 2), z44Var);
                    boolean zF3 = dd4Var3.f(kn2Var);
                    Object objQ6 = dd4Var3.Q();
                    Object obj7 = objQ6;
                    if (zF3 || objQ6 == fu6Var) {
                        ej4 ej4Var = new ej4(19, kn2Var, a07Var);
                        dd4Var3.p0(ej4Var);
                        obj7 = ej4Var;
                    }
                    lx1.l(wgaVar, (kb4) obj7, ou6VarB, false, null, gc1.i, null, jf0.G(-1739686492, new ij6(kn2Var, z ? 1 : 0), dd4Var3), false, null, qj5Var, null, false, 0, 0, uw1Var, null, dd4Var3, 806879232, 196608, 6258104);
                    xv5.z(dd4Var3, true, lu6Var, 12.0f, dd4Var3);
                }
                break;
        }
        return hebVar;
    }
}
