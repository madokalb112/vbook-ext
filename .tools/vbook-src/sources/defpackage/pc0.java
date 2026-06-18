package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class pc0 {
    public static final nc0 e = new nc0(-1, false, false);
    public static final byte[] f = {13, 10};
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;

    static {
        new pc0(-1, true, false);
        new pc0(76, false, true);
        new pc0(64, false, true);
    }

    public pc0(int i, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = i;
        if (z && z2) {
            gp.l("Failed requirement.");
            throw null;
        }
        this.d = i / 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(defpackage.pc0 r19, java.lang.CharSequence r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc0.a(pc0, java.lang.CharSequence, int, int):byte[]");
    }

    public static String b(pc0 pc0Var, byte[] bArr) {
        int i;
        int length = bArr.length;
        pc0Var.getClass();
        lc5.S(0, length, bArr.length);
        int iC = pc0Var.c(length);
        byte[] bArr2 = new byte[iC];
        lc5.S(0, length, bArr.length);
        int iC2 = pc0Var.c(length);
        if (iC < 0) {
            k27.m(dx1.f(iC, "destination offset: 0, destination size: "));
            return null;
        }
        if (iC2 < 0 || iC2 > iC) {
            k27.m(xv5.o("The destination array does not have enough capacity, destination offset: 0, destination size: ", iC, iC2, ", capacity needed: "));
            return null;
        }
        byte[] bArr3 = pc0Var.a ? rc0.c : rc0.a;
        int i2 = pc0Var.b ? pc0Var.d : Integer.MAX_VALUE;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = i3 + 2;
            if (i >= length) {
                break;
            }
            int iMin = Math.min((length - i3) / 3, i2);
            for (int i5 = 0; i5 < iMin; i5++) {
                int i6 = bArr[i3] & 255;
                int i7 = i3 + 2;
                int i8 = bArr[i3 + 1] & 255;
                i3 += 3;
                int i9 = (i8 << 8) | (i6 << 16) | (bArr[i7] & 255);
                bArr2[i4] = bArr3[i9 >>> 18];
                bArr2[i4 + 1] = bArr3[(i9 >>> 12) & 63];
                int i10 = i4 + 3;
                bArr2[i4 + 2] = bArr3[(i9 >>> 6) & 63];
                i4 += 4;
                bArr2[i10] = bArr3[i9 & 63];
            }
            if (iMin == i2 && i3 != length) {
                int i11 = i4 + 1;
                byte[] bArr4 = f;
                bArr2[i4] = bArr4[0];
                i4 += 2;
                bArr2[i11] = bArr4[1];
            }
        }
        int i12 = length - i3;
        if (i12 == 1) {
            int i13 = (bArr[i3] & 255) << 4;
            bArr2[i4] = bArr3[i13 >>> 6];
            bArr2[i4 + 1] = bArr3[i13 & 63];
            bArr2[i4 + 2] = 61;
            bArr2[i4 + 3] = 61;
            i3++;
        } else if (i12 == 2) {
            int i14 = ((bArr[i3 + 1] & 255) << 2) | ((bArr[i3] & 255) << 10);
            bArr2[i4] = bArr3[i14 >>> 12];
            bArr2[i4 + 1] = bArr3[(i14 >>> 6) & 63];
            bArr2[i4 + 2] = bArr3[i14 & 63];
            bArr2[i4 + 3] = 61;
            i3 = i;
        }
        if (i3 == length) {
            return new String(bArr2, q31.b);
        }
        gp.j("Check failed.");
        return null;
    }

    public final int c(int i) {
        int i2 = (i / 3) * 4;
        if (i % 3 != 0) {
            i2 += 4;
        }
        if (i2 < 0) {
            gp.l("Input is too big");
            return 0;
        }
        if (this.b) {
            i2 += ((i2 - 1) / this.c) * 2;
        }
        if (i2 >= 0) {
            return i2;
        }
        gp.l("Input is too big");
        return 0;
    }
}
