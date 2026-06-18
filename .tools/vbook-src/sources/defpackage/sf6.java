package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class sf6 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ym b;

    public /* synthetic */ sf6(ym ymVar, int i) {
        this.a = i;
        this.b = ymVar;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        ym ymVar = this.b;
        bn8 bn8Var = (bn8) obj;
        bn8Var.getClass();
        switch (i) {
            case 0:
                bn8Var.B(((Number) ymVar.d()).floatValue());
                break;
            case 1:
                float fFloatValue = ((Number) ymVar.d()).floatValue();
                bn8Var.n(fFloatValue);
                bn8Var.o(fFloatValue);
                break;
            default:
                bn8Var.n(((Number) ymVar.d()).floatValue());
                bn8Var.o(((Number) ymVar.d()).floatValue());
                break;
        }
        return hebVar;
    }
}
