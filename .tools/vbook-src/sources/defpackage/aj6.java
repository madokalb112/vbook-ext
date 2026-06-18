package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class aj6 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ kb4 c;

    public /* synthetic */ aj6(int i, kb4 kb4Var, String str) {
        this.a = i;
        this.b = str;
        this.c = kb4Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        lu6 lu6Var = lu6.a;
        kb4 kb4Var = this.c;
        String str = this.b;
        ke1 ke1Var = (ke1) obj;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                ke1Var.getClass();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dd4Var.Y();
                } else {
                    cx1.b(str, gjb.k0(tg9.f(lu6Var, 1.0f), yib.d(14, dd4Var, false)), kb4Var, dd4Var, 0);
                }
                break;
            default:
                ke1Var.getClass();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dd4Var.Y();
                } else {
                    ex1.b(str, yib.E(tg9.f(lu6Var, 1.0f), 14), kb4Var, dd4Var, 0);
                }
                break;
        }
        return hebVar;
    }
}
