package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ap6 implements yb4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ap6(long j, String str, uka ukaVar, br9 br9Var) {
        this.b = j;
        this.c = str;
        this.d = ukaVar;
        this.e = br9Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                qu1.k(this.c, (String) obj4, this.b, (ou6) obj3, (dd4) obj, qu1.x0(3073));
                break;
            default:
                uka ukaVar = (uka) obj4;
                br9 br9Var = (br9) obj3;
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var, 48);
                    int iHashCode = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL = dd4Var.l();
                    lu6 lu6Var = lu6.a;
                    ou6 ou6VarL0 = s32.L0(dd4Var, lu6Var);
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
                    p35 p35VarC = i25.c((m53) a53.e.getValue(), dd4Var, 0);
                    ou6 ou6VarI0 = sw1.i0(tg9.n(lu6Var, 16.0f), ((Number) br9Var.getValue()).floatValue());
                    long j = this.b;
                    mx4.a(p35VarC, (String) null, ou6VarI0, j, dd4Var, 48, 0);
                    un9.a(dd4Var, tg9.r(lu6Var, 8.0f));
                    nha.c(this.c, (ou6) null, j, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 1, 0, (kb4) null, ukaVar, dd4Var, 0, 24576, 114682);
                    dd4Var.q(true);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ ap6(String str, String str2, long j, ou6 ou6Var, int i) {
        this.c = str;
        this.d = str2;
        this.b = j;
        this.e = ou6Var;
    }
}
