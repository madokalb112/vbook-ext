package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class di1 implements jt1 {
    public static final di1 b = new di1(0);
    public static final di1 c = new di1(1);
    public final /* synthetic */ int a;

    public /* synthetic */ di1(int i) {
        this.a = i;
    }

    @Override // defpackage.jt1
    public final jx1 getContext() {
        int i = this.a;
        hc3 hc3Var = hc3.a;
        switch (i) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            case 1:
            default:
                return hc3Var;
        }
    }

    @Override // defpackage.jt1
    public final void resumeWith(Object obj) {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            case 1:
            default:
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void b(Object obj) {
    }

    private final void c(Object obj) {
    }
}
