package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class fa implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ fa(int i, float f) {
        this.a = i;
        this.b = f;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        g23 g23Var = g23.b;
        heb hebVar = heb.a;
        float f = this.b;
        switch (i) {
            case 0:
                x33 x33Var = (x33) obj;
                x33Var.getClass();
                x33Var.a(g23.a, f);
                x33Var.a(g23Var, 0.0f);
                break;
            case 1:
                x33 x33Var2 = (x33) obj;
                x33Var2.getClass();
                x33Var2.a(g23Var, 0.0f);
                x33Var2.a(g23.c, -f);
                break;
            case 2:
                e95 e95Var = (e95) obj;
                e95Var.getClass();
                jc1 jc1Var = e95Var.b;
                jc1Var.c(new x13(f), "x");
                jc1Var.c(new x13(0.0f), "y");
                break;
            default:
                e95 e95Var2 = (e95) obj;
                e95Var2.getClass();
                e95Var2.a = new x13(f);
                break;
        }
        return hebVar;
    }
}
