package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class n41 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb4 b;
    public final /* synthetic */ ib4 c;

    public /* synthetic */ n41(ib4 ib4Var, kb4 kb4Var) {
        this.a = 2;
        this.c = ib4Var;
        this.b = kb4Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        ib4 ib4Var = this.c;
        heb hebVar = heb.a;
        Object obj4 = vl1.a;
        kb4 kb4Var = this.b;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((dr5) obj).getClass();
                if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ou6 ou6VarP0 = gjb.p0(tg9.f(lu6.a, 1.0f), 0.0f, 0.0f, 0.0f, 4.0f, 7);
                    eq8 eq8VarA = dq8.a(new mv(8.0f, true, new gp(5)), bv4.w, dd4Var, 6);
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
                    un9.s(ll1.f, dd4Var, eq8VarA);
                    un9.s(ll1.e, dd4Var, lr7VarL);
                    un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
                    un9.r(dd4Var, ll1.h);
                    un9.s(ll1.d, dd4Var, ou6VarL0);
                    String strK = wn9.K((pv9) vt9.L0.getValue(), dd4Var);
                    if (1.0f <= 0.0d) {
                        o75.a("invalid weight; must be greater than zero");
                    }
                    bp5 bp5Var = new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    boolean zF = dd4Var.f(kb4Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj4) {
                        objQ = new b41(1, kb4Var);
                        dd4Var.p0(objQ);
                    }
                    vm7.m(0, (ib4) objQ, dd4Var, bp5Var, strK, false);
                    String strK2 = wn9.K((pv9) zt9.q.getValue(), dd4Var);
                    if (1.0f <= 0.0d) {
                        o75.a("invalid weight; must be greater than zero");
                    }
                    vm7.m(48, this.c, dd4Var, new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), strK2, false);
                    dd4Var.q(true);
                } else {
                    dd4Var.Y();
                }
                return hebVar;
            case 1:
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    p35 p35VarC = i25.c((m53) a53.k0.getValue(), dd4Var2, 0);
                    boolean zF2 = dd4Var2.f(kb4Var) | dd4Var2.f(ib4Var);
                    Object objQ2 = dd4Var2.Q();
                    if (zF2 || objQ2 == obj4) {
                        objQ2 = new wl4(ib4Var, kb4Var);
                        dd4Var2.p0(objQ2);
                    }
                    sw1.r(p35VarC, (ou6) null, 0L, (ib4) objQ2, dd4Var2, 0, 6);
                } else {
                    dd4Var2.Y();
                }
                return hebVar;
            default:
                dd4 dd4Var3 = (dd4) obj2;
                ((Integer) obj3).getClass();
                dd4Var3.f0(759876635);
                Object objQ3 = dd4Var3.Q();
                if (objQ3 == obj4) {
                    objQ3 = dk9.n(ib4Var);
                    dd4Var3.p0(objQ3);
                }
                br9 br9Var = (br9) objQ3;
                Object objQ4 = dd4Var3.Q();
                if (objQ4 == obj4) {
                    objQ4 = new ym(new eb7(((eb7) br9Var.getValue()).a), m19.b, new eb7(m19.c), 8);
                    dd4Var3.p0(objQ4);
                }
                ym ymVar = (ym) objQ4;
                boolean zH = dd4Var3.h(ymVar);
                Object objQ5 = dd4Var3.Q();
                if (zH || objQ5 == obj4) {
                    objQ5 = new lq8(br9Var, ymVar, (jt1) null, 4);
                    dd4Var3.p0(objQ5);
                }
                lc5.u((yb4) objQ5, dd4Var3, hebVar);
                qo qoVar = ymVar.c;
                boolean zF3 = dd4Var3.f(qoVar);
                Object objQ6 = dd4Var3.Q();
                if (zF3 || objQ6 == obj4) {
                    objQ6 = new op0(qoVar, 22);
                    dd4Var3.p0(objQ6);
                }
                ou6 ou6Var = (ou6) kb4Var.invoke((ib4) objQ6);
                dd4Var3.q(false);
                return ou6Var;
        }
    }

    public /* synthetic */ n41(int i, ib4 ib4Var, kb4 kb4Var) {
        this.a = i;
        this.b = kb4Var;
        this.c = ib4Var;
    }
}
