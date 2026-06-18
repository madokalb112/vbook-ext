package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class kv8 implements zb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ rj1 b;
    public final /* synthetic */ pj7 c;

    public /* synthetic */ kv8(rj1 rj1Var, pj7 pj7Var) {
        this.b = rj1Var;
        this.c = pj7Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        zn0 zn0Var = zn0.a;
        pj7 pj7Var = this.c;
        rj1 rj1Var = this.b;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((yn0) obj).getClass();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dd4Var.Y();
                } else {
                    ou6 ou6VarP0 = gjb.p0(lu6.a, 0.0f, pj7Var.d(), 0.0f, 0.0f, 13);
                    ha6 ha6VarD = pn0.d(bv4.b, false);
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
                    un9.s(ll1.f, dd4Var, ha6VarD);
                    un9.s(ll1.e, dd4Var, lr7VarL);
                    un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
                    un9.r(dd4Var, ll1.h);
                    un9.s(ll1.d, dd4Var, ou6VarL0);
                    rj1Var.g(zn0Var, new rj7(0.0f, 0.0f, 0.0f, 0.0f), dd4Var, 54);
                    dd4Var.q(true);
                }
                break;
            default:
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((yn0) obj).getClass();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    dd4Var2.Y();
                } else {
                    ha6 ha6VarD2 = pn0.d(bv4.b, false);
                    int iHashCode2 = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL2 = dd4Var2.l();
                    ou6 ou6VarL02 = s32.L0(dd4Var2, lu6.a);
                    ml1.k.getClass();
                    um1 um1Var2 = ll1.b;
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(um1Var2);
                    } else {
                        dd4Var2.s0();
                    }
                    un9.s(ll1.f, dd4Var2, ha6VarD2);
                    un9.s(ll1.e, dd4Var2, lr7VarL2);
                    un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode2));
                    un9.r(dd4Var2, ll1.h);
                    un9.s(ll1.d, dd4Var2, ou6VarL02);
                    rj1Var.g(zn0Var, gjb.q(0.0f, pj7Var.d(), 0.0f, 0.0f, 13), dd4Var2, 6);
                    dd4Var2.q(true);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ kv8(pj7 pj7Var, rj1 rj1Var) {
        this.c = pj7Var;
        this.b = rj1Var;
    }
}
