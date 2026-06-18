package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class jp5 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ br9 c;

    public /* synthetic */ jp5(float f, br9 br9Var, int i) {
        this.a = i;
        this.b = f;
        this.c = br9Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        br9 br9Var = this.c;
        float f = this.b;
        switch (i) {
            case 0:
                float fFloatValue = ((Number) br9Var.getValue()).floatValue();
                if (fFloatValue >= f) {
                    f = fFloatValue;
                }
                return Float.valueOf(f);
            case 1:
                float fFloatValue2 = ((Number) br9Var.getValue()).floatValue();
                if (fFloatValue2 >= f) {
                    f = fFloatValue2;
                }
                return Float.valueOf(f);
            default:
                float fFloatValue3 = ((Number) br9Var.getValue()).floatValue();
                if (fFloatValue3 >= f) {
                    f = fFloatValue3;
                }
                return Float.valueOf(f);
        }
    }
}
