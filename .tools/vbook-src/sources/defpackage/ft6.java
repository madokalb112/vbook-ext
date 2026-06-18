package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ft6 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ epa b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ yb4 e;

    public /* synthetic */ ft6(epa epaVar, kb4 kb4Var, kb4 kb4Var2, yb4 yb4Var, int i) {
        this.a = i;
        this.b = epaVar;
        this.c = kb4Var;
        this.d = kb4Var2;
        this.e = yb4Var;
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
                        objQ = new ir6(13, kb4Var);
                        dd4Var.p0(objQ);
                    }
                    ex1.l(this.b, ou6VarQ, (ib4) objQ, this.d, this.e, dd4Var, 0);
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
                        objQ2 = new ir6(12, kb4Var);
                        dd4Var2.p0(objQ2);
                    }
                    ex1.l(this.b, ou6VarQ2, (ib4) objQ2, this.d, this.e, dd4Var2, 0);
                }
                break;
        }
        return hebVar;
    }
}
