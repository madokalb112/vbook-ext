package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ga implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public /* synthetic */ ga(float f, float f2, int i) {
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        float f = this.c;
        float f2 = this.b;
        switch (i) {
            case 0:
                x33 x33Var = (x33) obj;
                x33Var.getClass();
                x33Var.a(g23.a, -f2);
                x33Var.a(g23.b, 0.0f);
                x33Var.a(g23.c, f);
                break;
            case 1:
                e95 e95Var = (e95) obj;
                e95Var.getClass();
                jc1 jc1Var = e95Var.b;
                jc1Var.c(new x13(f2), "horizontal");
                jc1Var.c(new x13(f), "vertical");
                break;
            default:
                bn8 bn8Var = (bn8) obj;
                bn8Var.getClass();
                bn8Var.B(bn8Var.E.b() * f2);
                bn8Var.c(wx1.P(f, 0.0f, 1.0f));
                break;
        }
        return hebVar;
    }
}
