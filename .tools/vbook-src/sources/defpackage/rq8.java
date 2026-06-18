package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class rq8 extends vj4 {
    public rq8(int i, int i2) {
        super(i, i2, "SHA" + (i2 * 8));
    }

    public static int h(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) | (bArr[i + 3] & 255) | ((bArr[i + 2] & 255) << 8) | ((bArr[i + 1] & 255) << 16);
    }

    @Override // defpackage.vj4
    public final byte[] b(long j) {
        long j2 = j % 64;
        long j3 = 64 - j2;
        if (j3 < 9) {
            j3 = 128 - j2;
        }
        int i = (int) j3;
        byte[] bArr = new byte[i];
        bArr[0] = -128;
        long j4 = j * 8;
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[(i - 1) - i2] = (byte) ((j4 >>> (i2 * 8)) & 255);
        }
        return bArr;
    }
}
