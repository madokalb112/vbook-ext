package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class rf6 implements kb4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rf6(float f, bb1 bb1Var, int i) {
        this.b = f;
        this.d = bb1Var;
        this.c = i;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.c;
        Object obj2 = this.d;
        float f = this.b;
        switch (i) {
            case 0:
                bn8 bn8Var = (bn8) obj;
                bn8Var.getClass();
                float fP = wx1.P((((Number) ((ym) obj2).d()).floatValue() * i2) / f, 0.0f, 1.0f);
                bn8Var.c(fP);
                float f2 = (fP * 0.25f) + 0.75f;
                bn8Var.n(f2);
                bn8Var.o(f2);
                break;
            default:
                bb1 bb1Var = (bb1) obj2;
                l29.e((n29) obj, new x38(((Number) wx1.S(Float.valueOf(f), bb1Var)).floatValue(), bb1Var, i2));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ rf6(ym ymVar, int i, float f) {
        this.d = ymVar;
        this.c = i;
        this.b = f;
    }
}
