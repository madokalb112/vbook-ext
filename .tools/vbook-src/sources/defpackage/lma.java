package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class lma implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ym7 b;

    public /* synthetic */ lma(ym7 ym7Var, int i) {
        this.a = i;
        this.b = ym7Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        ym7 ym7Var = this.b;
        na5 na5Var = (na5) obj;
        switch (i) {
            case 0:
                float f = (int) (na5Var.a & 4294967295L);
                if (f < 1.0f) {
                    f = 1.0f;
                }
                ym7Var.i(f);
                break;
            default:
                ym7Var.i((int) (na5Var.a >> 32));
                break;
        }
        return hebVar;
    }
}
