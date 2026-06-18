package defpackage;

import android.R;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class h {
    public static final int[] g = new int[256];
    public static final int[] h = new int[256];
    public static final int[] i = new int[256];
    public static final int[] j = new int[256];
    public static final int[] k = new int[256];
    public static final int[] l = new int[256];
    public static final int[] m = new int[256];
    public static final int[] n = new int[256];
    public static final int[] o = new int[256];
    public static final int[] p = new int[256];
    public static final int[] q = {0, 1, 2, 4, 8, 16, 32, 64, Token.CASE, 27, 54};
    public final int[] a;
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    static {
        int[] iArr = new int[256];
        int i2 = 0;
        while (i2 < 256) {
            iArr[i2] = i2 >= 128 ? (i2 << 1) ^ 283 : i2 << 1;
            i2++;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < 256; i5++) {
            int i6 = ((((i3 << 1) ^ i3) ^ (i3 << 2)) ^ (i3 << 3)) ^ (i3 << 4);
            int i7 = ((i6 & 255) ^ (i6 >>> 8)) ^ 99;
            g[i4] = i7;
            h[i7] = i4;
            int i8 = iArr[i4];
            int i9 = iArr[i8];
            int i10 = iArr[i9];
            int i11 = (iArr[i7] * 257) ^ (i7 * R.attr.transcriptMode);
            i[i4] = (i11 << 24) | (i11 >>> 8);
            j[i4] = (i11 << 16) | (i11 >>> 16);
            k[i4] = (i11 << 8) | (i11 >>> 24);
            l[i4] = i11;
            int i12 = (((i9 * 65537) ^ (R.attr.cacheColorHint * i10)) ^ (i8 * 257)) ^ (R.attr.transcriptMode * i4);
            m[i7] = (i12 << 24) | (i12 >>> 8);
            n[i7] = (i12 << 16) | (i12 >>> 16);
            o[i7] = (i12 << 8) | (i12 >>> 24);
            p[i7] = i12;
            if (i4 == 0) {
                i3 = 1;
                i4 = 1;
            } else {
                i4 = iArr[iArr[iArr[i10 ^ i8]]] ^ i8;
                i3 ^= iArr[iArr[i3]];
            }
        }
    }

    public h(byte[] bArr) {
        int[] iArr;
        int i2;
        bArr.getClass();
        int length = bArr.length / 4;
        int[] iArr2 = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr2[i3] = fz1.b0(bArr, i3 * 4);
        }
        this.a = iArr2;
        this.b = length;
        this.c = length + 6;
        int i4 = (length + 7) * 4;
        this.d = i4;
        int[] iArr3 = new int[i4];
        int i5 = 0;
        while (true) {
            iArr = g;
            if (i5 >= i4) {
                break;
            }
            int i6 = this.b;
            if (i5 < i6) {
                i2 = this.a[i5];
            } else {
                int i7 = iArr3[i5 - 1];
                int i8 = i5 % i6;
                if (i8 == 0) {
                    int i9 = (i7 >>> 24) | (i7 << 8);
                    i7 = (q[i5 / i6] << 24) ^ (iArr[i9 & 255] | (((iArr[(i9 >>> 24) & 255] << 24) | (iArr[(i9 >>> 16) & 255] << 16)) | (iArr[(i9 >>> 8) & 255] << 8)));
                } else if (i6 > 6 && i8 == 4) {
                    i7 = (iArr[(i7 >>> 24) & 255] << 24) | (iArr[(i7 >>> 16) & 255] << 16) | (iArr[(i7 >>> 8) & 255] << 8) | iArr[i7 & 255];
                }
                i2 = iArr3[i5 - i6] ^ i7;
            }
            iArr3[i5] = i2;
            i5++;
        }
        this.e = iArr3;
        int i10 = this.d;
        int[] iArr4 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.d - i11;
            int i13 = i11 % 4;
            int[] iArr5 = this.e;
            int i14 = i13 != 0 ? iArr5[i12] : iArr5[i12 - 4];
            if (i11 >= 4 && i12 > 4) {
                i14 = p[iArr[i14 & 255]] ^ ((m[iArr[(i14 >>> 24) & 255]] ^ n[iArr[(i14 >>> 16) & 255]]) ^ o[iArr[(i14 >>> 8) & 255]]);
            }
            iArr4[i11] = i14;
        }
        this.f = iArr4;
    }

    public final void a(byte[] bArr, int i2, int i3) {
        ga5 ga5VarQ0 = wx1.q0(wx1.s0(0, i3), 16);
        int i4 = ga5VarQ0.a;
        int i5 = ga5VarQ0.b;
        int i6 = ga5VarQ0.c;
        if ((i6 <= 0 || i4 > i5) && (i6 >= 0 || i5 > i4)) {
            return;
        }
        while (true) {
            h hVar = this;
            byte[] bArr2 = bArr;
            hVar.b(bArr2, i2 + i4, this.f, m, n, o, p, h, true);
            if (i4 == i5) {
                return;
            }
            i4 += i6;
            this = hVar;
            bArr = bArr2;
        }
    }

    public final void b(byte[] bArr, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, boolean z) {
        char c = 3;
        int i3 = 1;
        int i4 = !z ? 1 : 3;
        int i5 = !z ? 3 : 1;
        int iB0 = fz1.b0(bArr, i2) ^ iArr[0];
        int i6 = 4;
        int i7 = (i4 * 4) + i2;
        int iB02 = fz1.b0(bArr, i7) ^ iArr[1];
        int i8 = i2 + 8;
        int iB03 = fz1.b0(bArr, i8) ^ iArr[2];
        int i9 = (i5 * 4) + i2;
        int iB04 = fz1.b0(bArr, i9) ^ iArr[3];
        while (i3 < this.c) {
            int i10 = (((iArr2[(iB0 >>> 24) & 255] ^ iArr3[(iB02 >>> 16) & 255]) ^ iArr4[(iB03 >>> 8) & 255]) ^ iArr5[iB04 & 255]) ^ iArr[i6];
            char c2 = c;
            int i11 = (((iArr3[(iB03 >>> 16) & 255] ^ iArr2[(iB02 >>> 24) & 255]) ^ iArr4[(iB04 >>> 8) & 255]) ^ iArr5[iB0 & 255]) ^ iArr[i6 + 1];
            int i12 = i6 + 3;
            int i13 = (((iArr3[(iB04 >>> 16) & 255] ^ iArr2[(iB03 >>> 24) & 255]) ^ iArr4[(iB0 >>> 8) & 255]) ^ iArr5[iB02 & 255]) ^ iArr[i6 + 2];
            i6 += 4;
            iB04 = (((iArr3[(iB0 >>> 16) & 255] ^ iArr2[(iB04 >>> 24) & 255]) ^ iArr4[(iB02 >>> 8) & 255]) ^ iArr5[iB03 & 255]) ^ iArr[i12];
            i3++;
            iB02 = i11;
            iB03 = i13;
            iB0 = i10;
            c = c2;
        }
        int i14 = ((((iArr6[(iB0 >>> 24) & 255] << 24) | (iArr6[(iB02 >>> 16) & 255] << 16)) | (iArr6[(iB03 >>> 8) & 255] << 8)) | iArr6[iB04 & 255]) ^ iArr[i6];
        int i15 = iArr[i6 + 1] ^ ((((iArr6[(iB02 >>> 24) & 255] << 24) | (iArr6[(iB03 >>> 16) & 255] << 16)) | (iArr6[(iB04 >>> 8) & 255] << 8)) | iArr6[iB0 & 255]);
        int i16 = ((((iArr6[(iB03 >>> 24) & 255] << 24) | (iArr6[(iB04 >>> 16) & 255] << 16)) | (iArr6[(iB0 >>> 8) & 255] << 8)) | iArr6[iB02 & 255]) ^ iArr[i6 + 2];
        int i17 = ((((iArr6[(iB0 >>> 16) & 255] << 16) | (iArr6[(iB04 >>> 24) & 255] << 24)) | (iArr6[(iB02 >>> 8) & 255] << 8)) | iArr6[iB03 & 255]) ^ iArr[i6 + 3];
        fz1.M(bArr, i2, i14);
        fz1.M(bArr, i7, i15);
        fz1.M(bArr, i8, i16);
        fz1.M(bArr, i9, i17);
    }

    public final void c(byte[] bArr, int i2, int i3) {
        ga5 ga5VarQ0 = wx1.q0(wx1.s0(0, i3), 16);
        int i4 = ga5VarQ0.a;
        int i5 = ga5VarQ0.b;
        int i6 = ga5VarQ0.c;
        if ((i6 <= 0 || i4 > i5) && (i6 >= 0 || i5 > i4)) {
            return;
        }
        while (true) {
            h hVar = this;
            byte[] bArr2 = bArr;
            hVar.b(bArr2, i2 + i4, this.e, i, j, k, l, g, false);
            if (i4 == i5) {
                return;
            }
            i4 += i6;
            this = hVar;
            bArr = bArr2;
        }
    }
}
