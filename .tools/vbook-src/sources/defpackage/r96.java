package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class r96 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xbb b;
    public final /* synthetic */ rj1 c;

    public /* synthetic */ r96(xbb xbbVar, rj1 rj1Var, int i) {
        this.a = i;
        this.b = xbbVar;
        this.c = rj1Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        rj1 rj1Var = this.c;
        xbb xbbVar = this.b;
        int i2 = 1;
        dd4 dd4Var = (dd4) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    a08.a(jf0.G(-241536773, new r96(xbbVar, rj1Var, i2), dd4Var), dd4Var, 6);
                }
                break;
            default:
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    nha.a(xbbVar.j, rj1Var, dd4Var, 0);
                }
                break;
        }
        return hebVar;
    }
}
