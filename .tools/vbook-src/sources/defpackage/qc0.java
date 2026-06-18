package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qc0 {
    public static final int[] a = t1c.J("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=");

    static {
        t1c.J("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_=");
    }

    public static byte[] a(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        String strH = iw9.H(iw9.H(iw9.H(iw9.H(str, false, " ", ""), false, "\n", ""), false, "\r", ""), false, "\t", "");
        int length = strH.length();
        byte[] bArr = new byte[length];
        for (int i7 = 0; i7 < length; i7++) {
            bArr[i7] = (byte) strH.charAt(i7);
        }
        byte[] bArr2 = new byte[length];
        int i8 = 0;
        while (i6 < length) {
            int i9 = bArr[i6] & 255;
            int[] iArr = a;
            int i10 = iArr[i9];
            if (i10 < 0) {
                i6++;
            } else {
                if (i6 < length) {
                    i6++;
                } else {
                    i10 = 64;
                }
                if (i6 < length) {
                    i = i6 + 1;
                    i2 = iArr[bArr[i6] & 255];
                } else {
                    i = i6;
                    i2 = 64;
                }
                if (i < length) {
                    i3 = i + 1;
                    i4 = iArr[bArr[i] & 255];
                } else {
                    i3 = i;
                    i4 = 64;
                }
                if (i3 < length) {
                    i5 = iArr[bArr[i3] & 255];
                    i3++;
                } else {
                    i5 = 64;
                }
                int i11 = i8 + 1;
                bArr2[i8] = (byte) ((i10 << 2) | (i2 >> 4));
                if (i4 < 64) {
                    int i12 = i8 + 2;
                    bArr2[i11] = (byte) ((i2 << 4) | (i4 >> 2));
                    if (i5 < 64) {
                        i8 += 3;
                        bArr2[i12] = (byte) ((i4 << 6) | i5);
                    } else {
                        i8 = i12;
                    }
                    i6 = i3;
                } else {
                    i6 = i3;
                    i8 = i11;
                }
            }
        }
        return Arrays.copyOf(bArr2, i8);
    }

    public static String b(byte[] bArr) {
        bArr.getClass();
        StringBuilder sb = new StringBuilder(xv5.a(bArr.length, 4, 3, 4));
        int length = bArr.length % 3;
        int i = 0;
        while (i < bArr.length - 2) {
            int i2 = ((bArr[i] & 255) << 16) | ((bArr[i + 1] & 255) << 8) | (bArr[i + 2] & 255);
            i += 3;
            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".charAt((i2 >>> 18) & 63));
            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".charAt((i2 >>> 12) & 63));
            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".charAt((i2 >>> 6) & 63));
            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".charAt(i2 & 63));
        }
        if (length == 1) {
            int i3 = bArr[i] & 255;
            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".charAt(i3 >>> 2));
            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".charAt((i3 << 4) & 63));
            sb.append("==");
        } else if (length == 2) {
            int i4 = (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".charAt(i4 >>> 10));
            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".charAt((i4 >>> 4) & 63));
            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".charAt((i4 << 2) & 63));
            sb.append('=');
        }
        return sb.toString();
    }
}
