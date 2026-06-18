package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class jta implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kta b;

    public /* synthetic */ jta(kta ktaVar, int i) {
        this.a = i;
        this.b = ktaVar;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        kta ktaVar = this.b;
        switch (i) {
            case 0:
                return fc1.R0(new cd9(14), ktaVar.f.d);
            default:
                return new xl7(new na5(((na5) ktaVar.d.getValue()).a), (kf8) ktaVar.e.getValue());
        }
    }
}
