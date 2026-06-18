package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ob0 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c37 b;

    public /* synthetic */ ob0(c37 c37Var, int i) {
        this.a = i;
        this.b = c37Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        c37 c37Var = this.b;
        dd4 dd4Var = (dd4) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    c37Var.a(dd4Var, 0);
                }
                break;
            case 1:
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    c37Var.a(dd4Var, 0);
                }
                break;
            case 2:
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    c37Var.a(dd4Var, 0);
                }
                break;
            default:
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    c37Var.a(dd4Var, 0);
                }
                break;
        }
        return hebVar;
    }
}
