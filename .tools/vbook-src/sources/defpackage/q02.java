package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class q02 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t02 b;
    public final /* synthetic */ a07 c;

    public /* synthetic */ q02(t02 t02Var, a07 a07Var, int i) {
        this.a = i;
        this.b = t02Var;
        this.c = a07Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        Object value;
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.c;
        switch (i) {
            case 0:
                bi5 bi5Var = (bi5) a07Var.getValue();
                t02 t02Var = this.b;
                s02 s02Var = (s02) t02Var.e.getValue();
                String string = bw9.B0(s02Var.f).toString();
                if (!s02Var.c && string.length() != 0) {
                    za1 za1VarA = vtb.a(t02Var);
                    aj2 aj2Var = rw2.a;
                    t02Var.g(za1VarA, nh2.c, new ug(t02Var, string, s02Var, bi5Var, null, 10));
                }
                break;
            default:
                String str = ((wga) a07Var.getValue()).a.b;
                str.getClass();
                t02 t02Var2 = this.b;
                t02Var2.s = str;
                t02Var2.t = 1;
                t02Var2.u = true;
                t02Var2.w.clear();
                fr9 fr9Var = t02Var2.e;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, s02.a((s02) value, true, false, false, false, false, null, null, null, lc3.a, 244)));
                }
                t02Var2.j();
                break;
        }
        return hebVar;
    }
}
