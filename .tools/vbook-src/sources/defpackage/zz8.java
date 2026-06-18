package defpackage;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zz8 extends av0 {
    public final transient byte[][] e;
    public final transient int[] f;

    public zz8(byte[][] bArr, int[] iArr) {
        super(av0.d.a);
        this.e = bArr;
        this.f = iArr;
    }

    @Override // defpackage.av0
    public final String a() {
        throw null;
    }

    @Override // defpackage.av0
    public final av0 c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new av0(bArrDigest);
    }

    @Override // defpackage.av0
    public final int d() {
        return this.f[this.e.length - 1];
    }

    @Override // defpackage.av0
    public final String e() {
        return u().e();
    }

    @Override // defpackage.av0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof av0) {
            av0 av0Var = (av0) obj;
            if (av0Var.d() == d() && l(0, av0Var, d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.av0
    public final int f(int i, byte[] bArr) {
        bArr.getClass();
        return u().f(i, bArr);
    }

    @Override // defpackage.av0
    public final byte[] h() {
        return r();
    }

    @Override // defpackage.av0
    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.b = i3;
        return i3;
    }

    @Override // defpackage.av0
    public final byte i(int i) {
        byte[][] bArr = this.e;
        int length = bArr.length - 1;
        int[] iArr = this.f;
        ah1.z(iArr[length], i, 1L);
        int iT = kf0.T(this, i);
        return bArr[iT][(i - (iT == 0 ? 0 : iArr[iT - 1])) + iArr[bArr.length + iT]];
    }

    @Override // defpackage.av0
    public final int j(int i, byte[] bArr) {
        bArr.getClass();
        return u().j(i, bArr);
    }

    @Override // defpackage.av0
    public final boolean l(int i, av0 av0Var, int i2) {
        av0Var.getClass();
        if (i >= 0 && i <= d() - i2) {
            int i3 = i2 + i;
            int iT = kf0.T(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.f;
                int i5 = iT == 0 ? 0 : iArr[iT - 1];
                int i6 = iArr[iT] - i5;
                byte[][] bArr = this.e;
                int i7 = iArr[bArr.length + iT];
                int iMin = Math.min(i3, i6 + i5) - i;
                if (av0Var.m(i4, bArr[iT], (i - i5) + i7, iMin)) {
                    i4 += iMin;
                    i += iMin;
                    iT++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.av0
    public final boolean m(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i < 0 || i > d() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iT = kf0.T(this, i);
        while (i < i4) {
            int[] iArr = this.f;
            int i5 = iT == 0 ? 0 : iArr[iT - 1];
            int i6 = iArr[iT] - i5;
            byte[][] bArr2 = this.e;
            int i7 = iArr[bArr2.length + iT];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!ah1.w(bArr2[iT], (i - i5) + i7, bArr, i2, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iT++;
        }
        return true;
    }

    @Override // defpackage.av0
    public final String n(Charset charset) {
        charset.getClass();
        return u().n(charset);
    }

    @Override // defpackage.av0
    public final av0 o(int i, int i2) {
        if (i < 0) {
            gp.k(xv5.k(i, "beginIndex=", " < 0"));
            return null;
        }
        if (i2 > d()) {
            StringBuilder sbU = xv5.u(i2, "endIndex=", " > length(");
            sbU.append(d());
            sbU.append(')');
            throw new IllegalArgumentException(sbU.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            gp.k(xv5.o("endIndex=", i2, i, " < beginIndex="));
            return null;
        }
        if (i == 0 && i2 == d()) {
            return this;
        }
        if (i == i2) {
            return av0.d;
        }
        int iT = kf0.T(this, i);
        int iT2 = kf0.T(this, i2 - 1);
        byte[][] bArr = this.e;
        byte[][] bArr2 = (byte[][]) fw.Z(bArr, iT, iT2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f;
        if (iT <= iT2) {
            int i4 = iT;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == iT2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = iT != 0 ? iArr2[iT - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new zz8(bArr2, iArr);
    }

    @Override // defpackage.av0
    public final av0 q() {
        return u().q();
    }

    @Override // defpackage.av0
    public final byte[] r() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.e;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            fw.R(bArr2[i], i3, bArr, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.av0
    public final void t(xq0 xq0Var, int i) {
        int iT = kf0.T(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f;
            int i3 = iT == 0 ? 0 : iArr[iT - 1];
            int i4 = iArr[iT] - i3;
            byte[][] bArr = this.e;
            int i5 = iArr[bArr.length + iT];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            oz8 oz8Var = new oz8(bArr[iT], i6, i6 + iMin, true, false);
            oz8 oz8Var2 = xq0Var.a;
            if (oz8Var2 == null) {
                oz8Var.g = oz8Var;
                oz8Var.f = oz8Var;
                xq0Var.a = oz8Var;
            } else {
                oz8 oz8Var3 = oz8Var2.g;
                oz8Var3.getClass();
                oz8Var3.b(oz8Var);
            }
            i2 += iMin;
            iT++;
        }
        xq0Var.b += (long) i;
    }

    @Override // defpackage.av0
    public final String toString() {
        return u().toString();
    }

    public final av0 u() {
        return new av0(r());
    }
}
