package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ao0 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ao0(int i, int i2, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, int i3) {
        this.a = 3;
        this.b = i;
        this.c = i2;
        this.d = ou6Var;
        this.e = kb4Var;
        this.f = kb4Var2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        heb hebVar = heb.a;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                sdc.e((ou6) obj3, (f9) obj5, (rj1) obj4, (dd4) obj, qu1.x0(this.b | 1), this.c);
                break;
            case 1:
                ((Integer) obj2).getClass();
                lc5.r((zk7) obj5, this.b, this.c, (ou6) obj3, (kb4) obj4, (dd4) obj, qu1.x0(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ny1.d(this.d, this.b, (js5) obj5, (rj1) obj4, (dd4) obj, qu1.x0(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                h67.P(this.b, this.c, (ou6) obj3, (kb4) obj5, (kb4) obj4, (dd4) obj, qu1.x0(385));
                break;
            case 4:
                kb4 kb4Var = (kb4) obj3;
                kb4 kb4Var2 = (kb4) obj5;
                a07 a07Var = (a07) obj4;
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    boolean z = !bw9.a0(((wga) a07Var.getValue()).a.b);
                    boolean zF = dd4Var.f(kb4Var) | dd4Var.f(kb4Var2) | dd4Var.f(a07Var);
                    int i2 = this.b;
                    boolean zD = zF | dd4Var.d(i2);
                    int i3 = this.c;
                    boolean zD2 = dd4Var.d(i3) | zD;
                    Object objQ = dd4Var.Q();
                    if (zD2 || objQ == vl1.a) {
                        wq6 wq6Var = new wq6(kb4Var, kb4Var2, i2, i3, a07Var);
                        dd4Var.p0(wq6Var);
                        objQ = wq6Var;
                    }
                    lc5.J((ib4) objQ, null, z, null, null, null, ah1.r, dd4Var, 805306368, 506);
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(1);
                rw1.e(this.b, this.c, iX0, (yb4) obj4, (dd4) obj, (ou6) obj3, (String) obj5);
                break;
            default:
                ((Integer) obj2).getClass();
                fe.B((String) obj5, this.b, this.c, (t27) obj4, (ou6) obj3, (dd4) obj, qu1.x0(24577));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ ao0(Object obj, int i, int i2, ou6 ou6Var, ub4 ub4Var, int i3, int i4) {
        this.a = i4;
        this.e = obj;
        this.b = i;
        this.c = i2;
        this.d = ou6Var;
        this.f = ub4Var;
    }

    public /* synthetic */ ao0(Object obj, int i, js5 js5Var, rj1 rj1Var, int i2) {
        this.a = 2;
        this.d = obj;
        this.b = i;
        this.e = js5Var;
        this.f = rj1Var;
        this.c = i2;
    }

    public /* synthetic */ ao0(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        this.a = i3;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = i;
        this.c = i2;
    }

    public /* synthetic */ ao0(String str, int i, int i2, t27 t27Var, ou6 ou6Var, int i3) {
        this.a = 6;
        this.e = str;
        this.b = i;
        this.c = i2;
        this.f = t27Var;
        this.d = ou6Var;
    }
}
