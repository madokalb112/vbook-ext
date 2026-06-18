package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class tt5 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ tt5(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        int i2 = this.c;
        int i3 = this.b;
        switch (i) {
            case 0:
                return new st5(i3, i2);
            case 1:
                return dk9.x((i3 + 1) + "-" + Math.min(i3 + 50, i2));
            default:
                return new al7(0.0f, i3, i2);
        }
    }
}
