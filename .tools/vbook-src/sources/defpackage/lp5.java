package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class lp5 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ br9 b;
    public final /* synthetic */ ym7 c;

    public /* synthetic */ lp5(br9 br9Var, ym7 ym7Var, int i) {
        this.a = i;
        this.b = br9Var;
        this.c = ym7Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        ym7 ym7Var = this.c;
        br9 br9Var = this.b;
        float fFloatValue = ((Float) obj).floatValue();
        switch (i) {
            case 0:
                float fFloatValue2 = 1.0f - ((Number) br9Var.getValue()).floatValue();
                if (fFloatValue2 < 0.0f) {
                    fFloatValue2 = 0.0f;
                }
                ym7Var.i(wx1.P(fFloatValue, 0.0f, fFloatValue2));
                break;
            case 1:
                float fFloatValue3 = 1.0f - ((Number) br9Var.getValue()).floatValue();
                if (fFloatValue3 < 0.0f) {
                    fFloatValue3 = 0.0f;
                }
                ym7Var.i(wx1.P(fFloatValue, 0.0f, fFloatValue3));
                break;
            default:
                float fFloatValue4 = 1.0f - ((Number) br9Var.getValue()).floatValue();
                if (fFloatValue4 < 0.0f) {
                    fFloatValue4 = 0.0f;
                }
                ym7Var.i(wx1.P(fFloatValue, 0.0f, fFloatValue4));
                break;
        }
        return hebVar;
    }
}
