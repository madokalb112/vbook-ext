package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class yp6 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ kb4 c;

    public /* synthetic */ yp6(kb4 kb4Var, float f) {
        this.a = 2;
        this.c = kb4Var;
        this.b = f;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        float f = this.b;
        kb4 kb4Var = this.c;
        switch (i) {
            case 0:
                float f2 = (f * 16.0f) - 0.5f;
                if (10.0f <= f2 && f2 <= 50.0f) {
                    kb4Var.invoke(Float.valueOf(f2 / 16.0f));
                }
                break;
            case 1:
                float f3 = (f * 16.0f) + 0.5f;
                if (10.0f <= f3 && f3 <= 50.0f) {
                    kb4Var.invoke(Float.valueOf(f3 / 16.0f));
                }
                break;
            default:
                kb4Var.invoke(Float.valueOf(f));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ yp6(float f, kb4 kb4Var, int i) {
        this.a = i;
        this.b = f;
        this.c = kb4Var;
    }
}
