package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class du1 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a15 b;
    public final /* synthetic */ j15 c;

    public /* synthetic */ du1(a15 a15Var, j15 j15Var, int i) {
        this.a = i;
        this.b = a15Var;
        this.c = j15Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        j15 j15Var = this.c;
        a15 a15Var = this.b;
        yw2 yw2Var = (yw2) obj;
        switch (i) {
            case 0:
                yw2Var.getClass();
                return new ku1(a15Var, j15Var, 0);
            default:
                yw2Var.getClass();
                return new ku1(a15Var, j15Var, 1);
        }
    }
}
