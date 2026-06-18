package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class sq4 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ sq4(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        lu6 lu6Var = lu6.a;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dd4Var.Y();
                } else {
                    ou6 ou6VarE0 = tg9.c;
                    ha6 ha6VarD = pn0.d(bv4.b, false);
                    int iHashCode = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL = dd4Var.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarE0);
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
                    String str = this.b;
                    boolean zF = dd4Var.f(str);
                    Object objQ = dd4Var.Q();
                    Object obj4 = vl1.a;
                    if (zF || objQ == obj4) {
                        objQ = dk9.x(kx.a);
                        dd4Var.p0(objQ);
                    }
                    a07 a07Var = (a07) objQ;
                    ou6 ou6VarA = zn0.a.a(lu6Var, bv4.u);
                    if (((ox) a07Var.getValue()) instanceof nx) {
                        nx nxVar = (ox) a07Var.getValue();
                        nxVar.getClass();
                        int iE = nxVar.b.a.e();
                        nx nxVar2 = (ox) a07Var.getValue();
                        nxVar2.getClass();
                        int iD = nxVar2.b.a.d();
                        if (iE > 0 && iD > 0) {
                            ou6VarE0 = iE > iD ? sdc.e0(iE / iD, tg9.f(lu6Var, 1.0f), false) : sdc.e0(iD / iE, tg9.c(lu6Var, 1.0f), false);
                        }
                    }
                    ou6 ou6VarE = ou6VarA.e(ou6VarE0);
                    qr1 qr1Var = ra1.e;
                    rj1 rj1Var = fe.h;
                    boolean zF2 = dd4Var.f(a07Var);
                    Object objQ2 = dd4Var.Q();
                    if (zF2 || objQ2 == obj4) {
                        objQ2 = new tn4(a07Var, 5);
                        dd4Var.p0(objQ2);
                    }
                    w05.a(str, qr1Var, false, null, rj1Var, ou6VarE, (kb4) objQ2, dd4Var, 196656, 284);
                    dd4Var.q(true);
                }
                break;
            case 1:
                yn0 yn0Var = (yn0) obj;
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                yn0Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= dd4Var2.f(yn0Var) ? 4 : 2;
                }
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    dd4Var2.Y();
                } else {
                    i12.g(i25.b((m53) a53.D.getValue(), dd4Var2), (String) null, yn0Var.b(), (f9) null, ra1.d, 0.0f, (qc1) null, dd4Var2, 24632, Token.ASSIGN_LOGICAL_AND);
                    nha.c(this.b, yn0Var.a(gjb.l0(lu6Var, 12.0f), bv4.f), lc1.b, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(s96.a)).b.i, dd4Var2, 384, 0, 131064);
                }
                break;
            default:
                yn0 yn0Var2 = (yn0) obj;
                dd4 dd4Var3 = (dd4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                yn0Var2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= dd4Var3.f(yn0Var2) ? 4 : 2;
                }
                if (!dd4Var3.V(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    dd4Var3.Y();
                } else {
                    i12.g(i25.b((m53) a53.D.getValue(), dd4Var3), (String) null, yn0Var2.b(), (f9) null, ra1.d, 0.0f, (qc1) null, dd4Var3, 24632, Token.ASSIGN_LOGICAL_AND);
                    nha.c(this.b, yn0Var2.a(gjb.l0(lu6Var, 12.0f), bv4.f), lc1.b, new g60(wn9.x(9), wn9.x(14), wn9.w(0.25d)), 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var3.j(s96.a)).b.i, dd4Var3, 384, 0, 131056);
                }
                break;
        }
        return hebVar;
    }
}
