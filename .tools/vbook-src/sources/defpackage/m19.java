package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class m19 {
    public static final so a = new so(Float.NaN, Float.NaN);
    public static final s9b b = new s9b(new ax8(3), new ax8(4));
    public static final long c;
    public static final kp9 d;

    static {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        c = jFloatToRawIntBits;
        d = new kp9(new eb7(jFloatToRawIntBits), 3);
    }
}
