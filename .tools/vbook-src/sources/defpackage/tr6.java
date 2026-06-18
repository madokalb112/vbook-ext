package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class tr6 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bka b;

    public /* synthetic */ tr6(bka bkaVar, int i) {
        this.a = i;
        this.b = bkaVar;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        bka bkaVar = this.b;
        lu6 lu6Var = lu6.a;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else if (!bkaVar.a) {
                    dd4Var.f0(-283952506);
                    dd4Var.q(false);
                } else {
                    dd4Var.f0(-284238729);
                    l16.a(2.0f, 48, 1, 0L, dd4Var, gjb.l0(t96.w(tg9.n(lu6Var, 44.0f), tp8.a), 12.0f));
                    dd4Var.q(false);
                }
                break;
            default:
                dd4 dd4Var2 = (dd4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dd4Var2.Y();
                } else if (!bkaVar.a) {
                    dd4Var2.f0(-1947886519);
                    mx4.a(i25.c((m53) f53.i0.getValue(), dd4Var2, 0), (String) null, gjb.l0(t96.w(tg9.n(lu6Var, 44.0f), tp8.a), 12.0f), ((q96) dd4Var2.j(s96.a)).a.q, dd4Var2, 48, 0);
                    dd4Var2.q(false);
                } else {
                    dd4Var2.f0(-1948193605);
                    l16.a(2.0f, 48, 1, 0L, dd4Var2, gjb.l0(t96.w(tg9.n(lu6Var, 44.0f), tp8.a), 12.0f));
                    dd4Var2.q(false);
                }
                break;
        }
        return hebVar;
    }
}
