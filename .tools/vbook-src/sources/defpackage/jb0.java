package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class jb0 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ub4 c;
    public final /* synthetic */ int d;

    public /* synthetic */ jb0(int i, kb4 kb4Var, boolean z) {
        this.a = 2;
        this.d = i;
        this.b = z;
        this.c = kb4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        boolean z = this.b;
        heb hebVar = heb.a;
        ub4 ub4Var = this.c;
        int i2 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                m79.b(z, (ib4) ub4Var, (dd4) obj, qu1.x0(1 | i2));
                break;
            case 1:
                ((Integer) obj2).getClass();
                fw.z(z, (ib4) ub4Var, (dd4) obj, qu1.x0(1 | i2));
                break;
            default:
                kb4 kb4Var = (kb4) ub4Var;
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    lu6 lu6Var = lu6.a;
                    ou6 ou6VarN0 = gjb.n0(tg9.f(lu6Var, 1.0f), 8.0f, 0.0f, 2);
                    ie1 ie1VarA = ge1.a(new mv(12.0f, true, new gp(5)), bv4.z, dd4Var, 6);
                    int iHashCode = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL = dd4Var.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarN0);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var.j0();
                    if (dd4Var.S) {
                        dd4Var.k(um1Var);
                    } else {
                        dd4Var.s0();
                    }
                    jm jmVar = ll1.f;
                    un9.s(jmVar, dd4Var, ie1VarA);
                    jm jmVar2 = ll1.e;
                    un9.s(jmVar2, dd4Var, lr7VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    jm jmVar3 = ll1.g;
                    un9.s(jmVar3, dd4Var, numValueOf);
                    kd kdVar = ll1.h;
                    un9.r(dd4Var, kdVar);
                    jm jmVar4 = ll1.d;
                    un9.s(jmVar4, dd4Var, ou6VarL0);
                    boolean zD = dd4Var.d(i2);
                    Object objQ = dd4Var.Q();
                    if (zD || objQ == vl1.a) {
                        objQ = bv4.v(i2);
                        dd4Var.p0(objQ);
                    }
                    String strL = wn9.L((pv9) ev9.X.getValue(), new Object[]{(String) objQ}, dd4Var);
                    ur9 ur9Var = s96.a;
                    nha.c(strL, (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.k, dd4Var, 0, 0, 131070);
                    ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                    eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var, 48);
                    int iHashCode2 = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL2 = dd4Var.l();
                    ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarF);
                    dd4Var.j0();
                    if (dd4Var.S) {
                        dd4Var.k(um1Var);
                    } else {
                        dd4Var.s0();
                    }
                    un9.s(jmVar, dd4Var, eq8VarA);
                    un9.s(jmVar2, dd4Var, lr7VarL2);
                    ky0.v(iHashCode2, dd4Var, jmVar3, dd4Var, kdVar);
                    un9.s(jmVar4, dd4Var, ou6VarL02);
                    vo1.e(this.b, kb4Var, null, false, null, dd4Var, 0);
                    nha.c(wn9.K((pv9) ev9.Z.getValue(), dd4Var), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.k, dd4Var, 0, 0, 131070);
                    dd4Var.q(true);
                    dd4Var.q(true);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ jb0(boolean z, ib4 ib4Var, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = ib4Var;
        this.d = i;
    }
}
