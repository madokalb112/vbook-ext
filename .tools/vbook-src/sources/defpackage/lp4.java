package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lp4 implements t89 {
    public static final lp4 b = new lp4(0);
    public static final lp4 c = new lp4(1);
    public final /* synthetic */ int a;

    public /* synthetic */ lp4(int i) {
        this.a = i;
    }

    public final fx1 a(long j, zm5 zm5Var, pn2 pn2Var) {
        switch (this.a) {
            case 0:
                float fW0 = pn2Var.w0(30.0f);
                return new yh7(new kf8(0.0f, -fW0, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fW0));
            case 1:
                float fW02 = pn2Var.w0(30.0f);
                return new yh7(new kf8(-fW02, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fW02, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new yh7(rw1.w(0L, j));
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
