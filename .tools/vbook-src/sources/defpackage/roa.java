package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class roa {
    public static float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static long c(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }
}
