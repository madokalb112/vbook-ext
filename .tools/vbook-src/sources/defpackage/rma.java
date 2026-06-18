package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class rma implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ rma(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(i2 / 100.0f);
            default:
                return lw1.M(Integer.valueOf(i2));
        }
    }
}
