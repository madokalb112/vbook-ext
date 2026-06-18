package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class oq8 extends rq8 {
    public static final h76 i = new h76("SHA1", new wo8(18));
    public static final int[] j = {1732584193, -271733879, -1732584194, 271733878, -1009589776};
    public final int[] g;
    public final int[] h;

    public oq8() {
        super(64, 20, "SHA1");
        this.g = new int[80];
        this.h = new int[5];
        c();
    }

    @Override // defpackage.vj4
    public final void a(byte[] bArr) {
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = (byte) (this.h[i2 / 4] >>> (24 - ((i2 % 4) * 8)));
        }
    }

    @Override // defpackage.vj4
    public final void c() {
        int[] iArr = j;
        iArr.getClass();
        int[] iArr2 = this.h;
        iArr2.getClass();
        fw.Q(0, 0, 5, iArr, iArr2);
    }

    @Override // defpackage.vj4
    public final void d(byte[] bArr) {
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        while (true) {
            iArr = this.g;
            if (i5 >= 16) {
                break;
            }
            iArr[i5] = rq8.h(i5 * 4, bArr);
            i5++;
        }
        for (i2 = 16; i2 < 80; i2++) {
            iArr[i2] = Integer.rotateLeft(((iArr[i2 - 3] ^ iArr[i2 - 8]) ^ iArr[i2 - 14]) ^ iArr[i2 - 16], 1);
        }
        int[] iArr2 = this.h;
        int i6 = iArr2[0];
        int i7 = iArr2[1];
        int i8 = iArr2[2];
        int i9 = iArr2[3];
        int i10 = iArr2[4];
        int i11 = 0;
        while (i11 < 80) {
            int iRotateLeft = Integer.rotateLeft(i6, 5) + i10 + iArr[i11];
            int i12 = i11 / 20;
            if (i12 == 0) {
                i3 = (i7 & i8) | ((~i7) & i9);
                i4 = 1518500249;
            } else if (i12 == 1) {
                i3 = (i7 ^ i8) ^ i9;
                i4 = 1859775393;
            } else if (i12 != 2) {
                i3 = (i7 ^ i8) ^ i9;
                i4 = -899497514;
            } else {
                i3 = ((i7 & i8) ^ (i7 & i9)) ^ (i8 & i9);
                i4 = -1894007588;
            }
            int iRotateLeft2 = Integer.rotateLeft(i7, 30);
            i11++;
            i7 = i6;
            i6 = i3 + i4 + iRotateLeft;
            i10 = i9;
            i9 = i8;
            i8 = iRotateLeft2;
        }
        iArr2[0] = iArr2[0] + i6;
        iArr2[1] = iArr2[1] + i7;
        iArr2[2] = iArr2[2] + i8;
        iArr2[3] = iArr2[3] + i9;
        iArr2[4] = iArr2[4] + i10;
    }
}
