package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class vi6 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ kb4 c;

    public /* synthetic */ vi6(int i, kb4 kb4Var, String str) {
        this.a = i;
        this.b = str;
        this.c = kb4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        kb4 kb4Var = this.c;
        String str = this.b;
        dd4 dd4Var = (dd4) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    cx1.b(str, gjb.k0(gjb.p0(tg9.c, 0.0f, 24.0f, 0.0f, 0.0f, 13), yib.d(13, dd4Var, false)), kb4Var, dd4Var, 0);
                }
                break;
            default:
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    ex1.b(str, gjb.p0(tg9.f(lu6.a, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13), kb4Var, dd4Var, 48);
                }
                break;
        }
        return hebVar;
    }
}
