package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class sl6 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj1 b;
    public final /* synthetic */ rj1 c;

    public /* synthetic */ sl6(rj1 rj1Var, rj1 rj1Var2, int i) {
        this.a = i;
        this.b = rj1Var;
        this.c = rj1Var2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        jv jvVar = pv.c;
        rj1 rj1Var = this.c;
        rj1 rj1Var2 = this.b;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    ou6 ou6VarP0 = gjb.p0(gjb.k0(tg9.c, yib.e(dd4Var, 3)), 0.0f, 6.0f, 0.0f, 0.0f, 13);
                    ie1 ie1VarA = ge1.a(jvVar, bv4.z, dd4Var, 0);
                    int iHashCode = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL = dd4Var.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarP0);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var.j0();
                    if (dd4Var.S) {
                        dd4Var.k(um1Var);
                    } else {
                        dd4Var.s0();
                    }
                    un9.s(ll1.f, dd4Var, ie1VarA);
                    un9.s(ll1.e, dd4Var, lr7VarL);
                    un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
                    un9.r(dd4Var, ll1.h);
                    un9.s(ll1.d, dd4Var, ou6VarL0);
                    rj1Var2.invoke(dd4Var, 0);
                    rj1Var.invoke(dd4Var, 0);
                    dd4Var.q(true);
                }
                break;
            default:
                dd4 dd4Var2 = (dd4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dd4Var2.Y();
                } else {
                    ou6 ou6VarP02 = gjb.p0(gjb.k0(tg9.c, yib.e(dd4Var2, 3)), 0.0f, 6.0f, 0.0f, 0.0f, 13);
                    ie1 ie1VarA2 = ge1.a(jvVar, bv4.z, dd4Var2, 0);
                    int iHashCode2 = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL2 = dd4Var2.l();
                    ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarP02);
                    ml1.k.getClass();
                    um1 um1Var2 = ll1.b;
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(um1Var2);
                    } else {
                        dd4Var2.s0();
                    }
                    un9.s(ll1.f, dd4Var2, ie1VarA2);
                    un9.s(ll1.e, dd4Var2, lr7VarL2);
                    un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode2));
                    un9.r(dd4Var2, ll1.h);
                    un9.s(ll1.d, dd4Var2, ou6VarL02);
                    rj1Var2.invoke(dd4Var2, 0);
                    rj1Var.invoke(dd4Var2, 0);
                    dd4Var2.q(true);
                }
                break;
        }
        return hebVar;
    }
}
