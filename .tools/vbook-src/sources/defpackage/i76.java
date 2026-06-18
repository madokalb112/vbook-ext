package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class i76 extends vj4 {
    public static final h76 j = new h76("MD5", new z16(15));
    public static final int[] k = {7, 12, 17, 22, 5, 9, 14, 20, 4, 11, 16, 23, 6, 10, 15, 21};
    public static final int[] l;
    public final int[] g;
    public final int[] h;
    public final int[] i;

    static {
        int[] iArr = new int[64];
        for (int i = 0; i < 64; i++) {
            iArr[i] = (int) (Math.abs(Math.sin(((double) i) + 1.0d)) * 4.294967296E9d);
        }
        l = iArr;
    }

    public i76() {
        super(64, 16, "MD5");
        this.g = new int[4];
        this.h = new int[4];
        this.i = new int[16];
        c();
    }

    @Override // defpackage.vj4
    public final void a(byte[] bArr) {
        for (int i = 0; i < 16; i++) {
            bArr[i] = (byte) (this.g[i / 4] >>> ((i % 4) * 8));
        }
    }

    @Override // defpackage.vj4
    public final byte[] b(long j2) {
        long j3 = this.a;
        long j4 = 8 * j2;
        int i = (int) (((((j2 + 8) / j3) + 1) * j3) - j2);
        byte[] bArr = new byte[i];
        bArr[0] = -128;
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[(i - 8) + i2] = (byte) (j4 >>> (i2 * 8));
        }
        return bArr;
    }

    @Override // defpackage.vj4
    public final void c() {
        int[] iArr = this.g;
        iArr[0] = 1732584193;
        iArr[1] = -271733879;
        iArr[2] = -1732584194;
        iArr[3] = 271733878;
    }

    @Override // defpackage.vj4
    public final void d(byte[] bArr) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        while (true) {
            iArr = this.i;
            if (i6 >= 64) {
                break;
            }
            int i7 = i6 >>> 2;
            iArr[i7] = (bArr[i6] << 24) | (iArr[i7] >>> 8);
            i6++;
        }
        int i8 = 0;
        while (true) {
            iArr2 = this.h;
            iArr3 = this.g;
            if (i8 >= 4) {
                break;
            }
            iArr2[i8] = iArr3[i8];
            i8++;
        }
        for (int i9 = 0; i9 < 64; i9++) {
            int i10 = i9 / 16;
            if (i10 == 0) {
                int i11 = iArr3[1];
                i = ((~i11) & iArr3[3]) | (iArr3[2] & i11);
            } else if (i10 != 1) {
                if (i10 == 2) {
                    i4 = iArr3[1] ^ iArr3[2];
                    i5 = iArr3[3];
                } else if (i10 != 3) {
                    i = 0;
                } else {
                    i4 = iArr3[2];
                    i5 = iArr3[1] | (~iArr3[3]);
                }
                i = i4 ^ i5;
            } else {
                int i12 = iArr3[1];
                int i13 = iArr3[3];
                i = (i12 & i13) | ((~i13) & iArr3[2]);
            }
            if (i10 != 0) {
                if (i10 == 1) {
                    i3 = (i9 * 5) + 1;
                } else if (i10 == 2) {
                    i3 = (i9 * 3) + 5;
                } else if (i10 != 3) {
                    i2 = 0;
                } else {
                    i3 = i9 * 7;
                }
                i2 = i3 & 15;
            } else {
                i2 = i9;
            }
            int iRotateLeft = Integer.rotateLeft(iArr3[0] + i + iArr[i2] + l[i9], k[(i10 << 2) | (i9 & 3)]) + iArr3[1];
            iArr3[0] = iArr3[3];
            iArr3[3] = iArr3[2];
            iArr3[2] = iArr3[1];
            iArr3[1] = iRotateLeft;
        }
        for (int i14 = 0; i14 < 4; i14++) {
            iArr3[i14] = iArr3[i14] + iArr2[i14];
        }
    }
}
