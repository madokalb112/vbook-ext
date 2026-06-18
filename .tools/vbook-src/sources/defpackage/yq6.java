package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class yq6 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oja b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ yb4 d;
    public final /* synthetic */ yb4 e;
    public final /* synthetic */ zb4 f;
    public final /* synthetic */ yb4 s;
    public final /* synthetic */ zb4 t;
    public final /* synthetic */ ib4 u;
    public final /* synthetic */ yb4 v;
    public final /* synthetic */ ib4 w;

    public /* synthetic */ yq6(oja ojaVar, kb4 kb4Var, yb4 yb4Var, yb4 yb4Var2, zb4 zb4Var, yb4 yb4Var3, zb4 zb4Var2, ib4 ib4Var, yb4 yb4Var4, ib4 ib4Var2, int i) {
        this.a = i;
        this.b = ojaVar;
        this.c = kb4Var;
        this.d = yb4Var;
        this.e = yb4Var2;
        this.f = zb4Var;
        this.s = yb4Var3;
        this.t = zb4Var2;
        this.u = ib4Var;
        this.v = yb4Var4;
        this.w = ib4Var2;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj4 = vl1.a;
        lu6 lu6Var = lu6.a;
        kb4 kb4Var = this.c;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((co0) obj).getClass();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dd4Var.Y();
                } else {
                    ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                    ur9 ur9Var = s96.a;
                    ou6 ou6VarQ = kc5.Q(fe.L(t96.w(ou6VarF, ((q96) dd4Var.j(ur9Var)).c.c), dd1.g(((q96) dd4Var.j(ur9Var)).a, 1.0f), jf0.G), kc5.J(dd4Var), 14);
                    boolean zF = dd4Var.f(kb4Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj4) {
                        objQ = new tk6(26, kb4Var);
                        dd4Var.p0(objQ);
                    }
                    rw1.t(this.b, ou6VarQ, (ib4) objQ, this.d, this.e, this.f, this.s, this.t, this.u, this.v, this.w, dd4Var, 0);
                }
                break;
            default:
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((co0) obj).getClass();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    dd4Var2.Y();
                } else {
                    ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
                    ur9 ur9Var2 = s96.a;
                    ou6 ou6VarQ2 = kc5.Q(fe.L(t96.w(ou6VarF2, ((q96) dd4Var2.j(ur9Var2)).c.c), dd1.g(((q96) dd4Var2.j(ur9Var2)).a, 1.0f), jf0.G), kc5.J(dd4Var2), 14);
                    boolean zF2 = dd4Var2.f(kb4Var);
                    Object objQ2 = dd4Var2.Q();
                    if (zF2 || objQ2 == obj4) {
                        objQ2 = new tk6(27, kb4Var);
                        dd4Var2.p0(objQ2);
                    }
                    rw1.t(this.b, ou6VarQ2, (ib4) objQ2, this.d, this.e, this.f, this.s, this.t, this.u, this.v, this.w, dd4Var2, 0);
                }
                break;
        }
        return hebVar;
    }
}
