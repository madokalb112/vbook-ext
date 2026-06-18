package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class i98 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ i98(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        lu6 lu6Var = lu6.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    nha.c(wn9.K((pv9) zu9.i0.getValue(), dd4Var), (ou6) null, this.b, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(s96.a)).b.k, dd4Var, 0, 0, 131066);
                }
                break;
            case 1:
                dd4 dd4Var2 = (dd4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dd4Var2.Y();
                } else {
                    mx4.a(i25.c((m53) a53.H.getValue(), dd4Var2, 0), (String) null, tg9.n(lu6Var, 20.0f), this.b, dd4Var2, 432, 0);
                }
                break;
            default:
                dd4 dd4Var3 = (dd4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!dd4Var3.V(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dd4Var3.Y();
                } else {
                    mx4.a(i25.c((m53) f53.i0.getValue(), dd4Var3, 0), (String) null, gjb.l0(t96.w(tg9.n(lu6Var, 44.0f), tp8.a), 12.0f), this.b, dd4Var3, 48, 0);
                }
                break;
        }
        return hebVar;
    }
}
