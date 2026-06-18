package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ol9 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yl9 b;

    public /* synthetic */ ol9(yl9 yl9Var, int i) {
        this.a = i;
        this.b = yl9Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        yl9 yl9Var = this.b;
        ux5 ux5Var = (ux5) obj;
        switch (i) {
            case 0:
                ux5Var.getClass();
                yl9Var.k();
                return new pl9(ux5Var, yl9Var, 0);
            default:
                ux5Var.getClass();
                yl9Var.k();
                return new pl9(ux5Var, yl9Var, 1);
        }
    }
}
