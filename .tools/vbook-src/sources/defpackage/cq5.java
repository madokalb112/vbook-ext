package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class cq5 extends b58 implements li5 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cq5(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.b = i2;
    }

    @Override // defpackage.ix0
    public final qh5 computeReflected() {
        ug8.a.getClass();
        return this;
    }

    @Override // defpackage.li5
    public final Object get() {
        switch (this.b) {
            case 0:
                return ((br9) this.receiver).getValue();
            case 1:
                return ((br9) this.receiver).getValue();
            case 2:
                return ((br9) this.receiver).getValue();
            case 3:
                return ((br9) this.receiver).getValue();
            default:
                return this.receiver.getClass().getSimpleName();
        }
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        return get();
    }
}
