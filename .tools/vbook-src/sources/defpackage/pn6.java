package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class pn6 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ ib4 d;
    public final /* synthetic */ ib4 e;
    public final /* synthetic */ ib4 f;
    public final /* synthetic */ ib4 s;
    public final /* synthetic */ ib4 t;
    public final /* synthetic */ ib4 u;

    public /* synthetic */ pn6(boolean z, kb4 kb4Var, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, ib4 ib4Var5, ib4 ib4Var6, int i) {
        this.a = i;
        this.b = z;
        this.c = kb4Var;
        this.d = ib4Var;
        this.e = ib4Var2;
        this.f = ib4Var3;
        this.s = ib4Var4;
        this.t = ib4Var5;
        this.u = ib4Var6;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj4 = vl1.a;
        kb4 kb4Var = this.c;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((co0) obj).getClass();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dd4Var.Y();
                } else {
                    boolean zF = dd4Var.f(kb4Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj4) {
                        objQ = new tk6(7, kb4Var);
                        dd4Var.p0(objQ);
                    }
                    m79.s(this.b, (ib4) objQ, this.d, this.e, this.f, this.s, this.t, this.u, dd4Var, 48);
                }
                break;
            default:
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((co0) obj).getClass();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    dd4Var2.Y();
                } else {
                    boolean zF2 = dd4Var2.f(kb4Var);
                    Object objQ2 = dd4Var2.Q();
                    if (zF2 || objQ2 == obj4) {
                        objQ2 = new tk6(8, kb4Var);
                        dd4Var2.p0(objQ2);
                    }
                    m79.s(this.b, (ib4) objQ2, this.d, this.e, this.f, this.s, this.t, this.u, dd4Var2, 48);
                }
                break;
        }
        return hebVar;
    }
}
