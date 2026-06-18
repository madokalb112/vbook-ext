package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class nm6 implements bc4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vx1 b;
    public final /* synthetic */ pb c;
    public final /* synthetic */ ib4 d;

    public /* synthetic */ nm6(int i, pb pbVar, vx1 vx1Var, ib4 ib4Var) {
        this.a = i;
        this.b = vx1Var;
        this.c = pbVar;
        this.d = ib4Var;
    }

    @Override // defpackage.bc4
    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj6 = vl1.a;
        lu6 lu6Var = lu6.a;
        ib4 ib4Var = this.d;
        pb pbVar = this.c;
        vx1 vx1Var = this.b;
        int i2 = 1;
        int i3 = 0;
        switch (i) {
            case 0:
                ((Float) obj3).getClass();
                dd4 dd4Var = (dd4) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                ((fq8) obj).getClass();
                ((pb) obj2).getClass();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 1025) != 1024)) {
                    dd4Var.Y();
                } else {
                    p35 p35VarC = i25.c((m53) a53.H.getValue(), dd4Var, 0);
                    long j = lc1.e;
                    ou6 ou6VarL = fe.L(lu6Var, lc1.f, jf0.G);
                    boolean zH = dd4Var.h(vx1Var) | dd4Var.f(pbVar) | dd4Var.f(ib4Var);
                    Object objQ = dd4Var.Q();
                    if (zH || objQ == obj6) {
                        objQ = new om6(i3, pbVar, vx1Var, ib4Var);
                        dd4Var.p0(objQ);
                    }
                    mx4.a(p35VarC, (String) null, tg9.c(gjb.l0(tg9.r(fw.J(null, (ib4) objQ, ou6VarL, false, 15), 44.0f), 12.0f), 1.0f), j, dd4Var, 3120, 0);
                }
                break;
            default:
                ((Float) obj3).getClass();
                dd4 dd4Var2 = (dd4) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                ((fq8) obj).getClass();
                ((pb) obj2).getClass();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 1025) != 1024)) {
                    dd4Var2.Y();
                } else {
                    p35 p35VarC2 = i25.c((m53) a53.H.getValue(), dd4Var2, 0);
                    long j2 = lc1.e;
                    ou6 ou6VarL2 = fe.L(lu6Var, lc1.f, jf0.G);
                    boolean zH2 = dd4Var2.h(vx1Var) | dd4Var2.f(pbVar) | dd4Var2.f(ib4Var);
                    Object objQ2 = dd4Var2.Q();
                    if (zH2 || objQ2 == obj6) {
                        objQ2 = new om6(i2, pbVar, vx1Var, ib4Var);
                        dd4Var2.p0(objQ2);
                    }
                    mx4.a(p35VarC2, (String) null, tg9.c(gjb.l0(tg9.r(fw.J(null, (ib4) objQ2, ou6VarL2, false, 15), 44.0f), 12.0f), 1.0f), j2, dd4Var2, 3120, 0);
                }
                break;
        }
        return hebVar;
    }
}
