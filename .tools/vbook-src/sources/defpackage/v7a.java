package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class v7a implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a07 b;
    public final /* synthetic */ aw3 c;
    public final /* synthetic */ h8a d;

    public /* synthetic */ v7a(a07 a07Var, aw3 aw3Var, h8a h8aVar, int i) {
        this.a = i;
        this.b = a07Var;
        this.c = aw3Var;
        this.d = h8aVar;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj4 = vl1.a;
        h8a h8aVar = this.d;
        aw3 aw3Var = this.c;
        a07 a07Var = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dd4Var.Y();
                } else {
                    ha6 ha6VarD = pn0.d(bv4.b, false);
                    int iHashCode = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL = dd4Var.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var, lu6.a);
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
                    p35 p35VarC = i25.c((m53) f53.J.getValue(), dd4Var, 0);
                    boolean zF = dd4Var.f(a07Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj4) {
                        objQ = new vb9(a07Var, 6);
                        dd4Var.p0(objQ);
                    }
                    sw1.r(p35VarC, (ou6) null, 0L, (ib4) objQ, dd4Var, 0, 6);
                    boolean zBooleanValue = ((Boolean) a07Var.getValue()).booleanValue();
                    rj7 rj7Var = new rj7(12.0f, 12.0f, 12.0f, 12.0f);
                    boolean zF2 = dd4Var.f(a07Var);
                    Object objQ2 = dd4Var.Q();
                    if (zF2 || objQ2 == obj4) {
                        objQ2 = new vb9(a07Var, 7);
                        dd4Var.p0(objQ2);
                    }
                    gx1.a(zBooleanValue, null, 0L, null, 0.0f, rj7Var, (ib4) objQ2, jf0.G(-1990452908, new v7a(a07Var, aw3Var, h8aVar, i2), dd4Var), dd4Var, 12779520, 30);
                    dd4Var.q(true);
                }
                break;
            default:
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    dd4Var2.Y();
                } else {
                    String strK = wn9.K((pv9) iu9.v.getValue(), dd4Var2);
                    rj1 rj1Var = h67.n;
                    boolean zF3 = dd4Var2.f(a07Var) | dd4Var2.f(aw3Var);
                    Object objQ3 = dd4Var2.Q();
                    if (zF3 || objQ3 == obj4) {
                        objQ3 = new uz2(aw3Var, a07Var, 3);
                        dd4Var2.p0(objQ3);
                    }
                    gx1.c(strK, null, rj1Var, null, null, (ib4) objQ3, dd4Var2, 384, 26);
                    String strK2 = wn9.K((pv9) eu9.Y.getValue(), dd4Var2);
                    rj1 rj1Var2 = h67.o;
                    boolean zF4 = dd4Var2.f(a07Var) | dd4Var2.f(h8aVar);
                    Object objQ4 = dd4Var2.Q();
                    if (zF4 || objQ4 == obj4) {
                        objQ4 = new e67(22, h8aVar, a07Var);
                        dd4Var2.p0(objQ4);
                    }
                    gx1.c(strK2, null, rj1Var2, null, null, (ib4) objQ4, dd4Var2, 384, 26);
                }
                break;
        }
        return hebVar;
    }
}
