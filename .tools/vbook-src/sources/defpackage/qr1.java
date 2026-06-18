package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qr1 implements sr1 {
    public final /* synthetic */ int a;

    public /* synthetic */ qr1(int i) {
        this.a = i;
    }

    public final long a(long j, long j2) {
        switch (this.a) {
            case 0:
                float fMax = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
                int i = du8.c;
                return jFloatToRawIntBits;
            case 1:
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                int i2 = du8.c;
                return jFloatToRawIntBits2;
            case 2:
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
                int i3 = du8.c;
                return jFloatToRawIntBits3;
            case 3:
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
                int i4 = du8.c;
                return jFloatToRawIntBits4;
            case 4:
                float fN = kl8.N(j, j2);
                long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(fN)) << 32) | (((long) Float.floatToRawIntBits(fN)) & 4294967295L);
                int i5 = du8.c;
                return jFloatToRawIntBits5;
            default:
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                    long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
                    int i6 = du8.c;
                    return jFloatToRawIntBits6;
                }
                float fN2 = kl8.N(j, j2);
                long jFloatToRawIntBits7 = (((long) Float.floatToRawIntBits(fN2)) << 32) | (((long) Float.floatToRawIntBits(fN2)) & 4294967295L);
                int i7 = du8.c;
                return jFloatToRawIntBits7;
        }
    }
}
