package defpackage;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wq0 implements jl9, bg9 {
    public nz8 a;
    public nz8 b;
    public long c;

    public final void A(ic8 ic8Var, long j) throws EOFException {
        ic8Var.getClass();
        if (j < 0) {
            gp.k(xv5.m(j, "byteCount (", ") < 0"));
            return;
        }
        long j2 = this.c;
        if (j2 >= j) {
            ic8Var.E0(this, j);
        } else {
            ic8Var.E0(this, j2);
            throw new EOFException(xv5.n(this.c, " bytes were written.", j39.o(j, "Buffer exhausted before writing ", " bytes. Only ")));
        }
    }

    @Override // defpackage.bg9
    public final void C(short s) {
        nz8 nz8VarA0 = a0(2);
        byte[] bArr = nz8VarA0.a;
        int i = nz8VarA0.c;
        bArr[i] = (byte) ((s >>> 8) & 255);
        bArr[i + 1] = (byte) (s & 255);
        nz8VarA0.c = i + 2;
        this.c += 2;
    }

    public final void E() {
        nz8 nz8Var = this.a;
        nz8Var.getClass();
        nz8 nz8Var2 = nz8Var.f;
        this.a = nz8Var2;
        if (nz8Var2 == null) {
            this.b = null;
        } else {
            nz8Var2.g = null;
        }
        nz8Var.f = null;
        yz8.a(nz8Var);
    }

    @Override // defpackage.ic8
    public final void E0(wq0 wq0Var, long j) {
        nz8 nz8VarB;
        if (wq0Var == this) {
            gp.l("source == this");
            return;
        }
        kl8.R(wq0Var.c, j);
        while (j > 0) {
            wq0Var.a.getClass();
            int i = 0;
            if (j < r0.b()) {
                nz8 nz8Var = this.b;
                if (nz8Var != null && nz8Var.e) {
                    long j2 = ((long) nz8Var.c) + j;
                    sg8 sg8Var = nz8Var.d;
                    if (j2 - ((long) ((sg8Var == null || sg8Var.a <= 0) ? nz8Var.b : 0)) <= 8192) {
                        nz8 nz8Var2 = wq0Var.a;
                        nz8Var2.getClass();
                        nz8Var2.g(nz8Var, (int) j);
                        wq0Var.c -= j;
                        this.c += j;
                        return;
                    }
                }
                nz8 nz8Var3 = wq0Var.a;
                nz8Var3.getClass();
                int i2 = (int) j;
                if (i2 <= 0 || i2 > nz8Var3.c - nz8Var3.b) {
                    gp.l("byteCount out of range");
                    return;
                }
                if (i2 >= 1024) {
                    nz8VarB = nz8Var3.f();
                } else {
                    nz8VarB = yz8.b();
                    byte[] bArr = nz8Var3.a;
                    byte[] bArr2 = nz8VarB.a;
                    int i3 = nz8Var3.b;
                    fw.W(bArr, bArr2, 0, i3, i3 + i2, 2);
                }
                nz8VarB.c = nz8VarB.b + i2;
                nz8Var3.b += i2;
                nz8 nz8Var4 = nz8Var3.g;
                if (nz8Var4 != null) {
                    nz8Var4.e(nz8VarB);
                } else {
                    nz8VarB.f = nz8Var3;
                    nz8Var3.g = nz8VarB;
                }
                wq0Var.a = nz8VarB;
            }
            nz8 nz8Var5 = wq0Var.a;
            nz8Var5.getClass();
            long jB = nz8Var5.b();
            nz8 nz8VarD = nz8Var5.d();
            wq0Var.a = nz8VarD;
            if (nz8VarD == null) {
                wq0Var.b = null;
            }
            if (this.a == null) {
                this.a = nz8Var5;
                this.b = nz8Var5;
            } else {
                nz8 nz8Var6 = this.b;
                nz8Var6.getClass();
                nz8Var6.e(nz8Var5);
                nz8 nz8Var7 = nz8Var5.g;
                if (nz8Var7 == null) {
                    gp.j("cannot compact");
                    return;
                }
                if (nz8Var7.e) {
                    int i4 = nz8Var5.c - nz8Var5.b;
                    int i5 = 8192 - nz8Var7.c;
                    nz8Var7.getClass();
                    sg8 sg8Var2 = nz8Var7.d;
                    if (sg8Var2 == null || sg8Var2.a <= 0) {
                        nz8 nz8Var8 = nz8Var5.g;
                        nz8Var8.getClass();
                        i = nz8Var8.b;
                    }
                    if (i4 <= i5 + i) {
                        nz8 nz8Var9 = nz8Var5.g;
                        nz8Var9.getClass();
                        nz8Var5.g(nz8Var9, i4);
                        if (nz8Var5.d() != null) {
                            gp.j("Check failed.");
                            return;
                        } else {
                            yz8.a(nz8Var5);
                            nz8Var5 = nz8Var9;
                        }
                    }
                }
                this.b = nz8Var5;
                if (nz8Var5.g == null) {
                    this.a = nz8Var5;
                }
            }
            wq0Var.c -= jB;
            this.c += jB;
            j -= jB;
        }
    }

    @Override // defpackage.jc8
    public final long K(wq0 wq0Var, long j) {
        wq0Var.getClass();
        if (j < 0) {
            gp.k(xv5.m(j, "byteCount (", ") < 0"));
            return 0L;
        }
        long j2 = this.c;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        wq0Var.E0(this, j);
        return j;
    }

    @Override // defpackage.bg9
    public final void M(byte b) {
        nz8 nz8VarA0 = a0(1);
        byte[] bArr = nz8VarA0.a;
        int i = nz8VarA0.c;
        nz8VarA0.c = i + 1;
        bArr[i] = b;
        this.c++;
    }

    public final /* synthetic */ void N() {
        nz8 nz8Var = this.b;
        nz8Var.getClass();
        nz8 nz8Var2 = nz8Var.g;
        this.b = nz8Var2;
        if (nz8Var2 == null) {
            this.a = null;
        } else {
            nz8Var2.f = null;
        }
        nz8Var.g = null;
        yz8.a(nz8Var);
    }

    public final void P(long j) throws EOFException {
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.c + ", required: " + j + ')');
    }

    public final long R(ic8 ic8Var) {
        ic8Var.getClass();
        long j = this.c;
        if (j > 0) {
            ic8Var.E0(this, j);
        }
        return j;
    }

    public final /* synthetic */ nz8 a0(int i) {
        if (i < 1 || i > 8192) {
            gp.k(xv5.k(i, "unexpected capacity (", "), should be in range [1, 8192]"));
            return null;
        }
        nz8 nz8Var = this.b;
        if (nz8Var == null) {
            nz8 nz8VarB = yz8.b();
            this.a = nz8VarB;
            this.b = nz8VarB;
            return nz8VarB;
        }
        if (nz8Var.c + i <= 8192 && nz8Var.e) {
            return nz8Var;
        }
        nz8 nz8VarB2 = yz8.b();
        nz8Var.e(nz8VarB2);
        this.b = nz8VarB2;
        return nz8VarB2;
    }

    @Override // defpackage.bg9
    public final void b0(int i, byte[] bArr) {
        bArr.getClass();
        kl8.Q(bArr.length, 0L, i);
        int i2 = 0;
        while (i2 < i) {
            nz8 nz8VarA0 = a0(1);
            int iMin = Math.min(i - i2, nz8VarA0.a()) + i2;
            fw.R(bArr, nz8VarA0.c, nz8VarA0.a, i2, iMin);
            nz8VarA0.c = (iMin - i2) + nz8VarA0.c;
            i2 = iMin;
        }
        this.c += (long) i;
    }

    @Override // defpackage.jl9
    public final boolean k() {
        return this.c == 0;
    }

    public final byte p(long j) {
        long j2 = 0;
        if (j < 0 || j >= this.c) {
            k27.m(xv5.n(this.c, "))", j39.o(j, "position (", ") is not within the range [0..size(")));
            return (byte) 0;
        }
        nz8 nz8Var = this.a;
        if (j == 0) {
            nz8Var.getClass();
            return nz8Var.c(0);
        }
        nz8Var.getClass();
        long j3 = this.c;
        if (j3 - j < j) {
            nz8 nz8Var2 = this.b;
            while (nz8Var2 != null && j3 > j) {
                j3 -= (long) (nz8Var2.c - nz8Var2.b);
                if (j3 <= j) {
                    break;
                }
                nz8Var2 = nz8Var2.g;
            }
            nz8Var2.getClass();
            return nz8Var2.c((int) (j - j3));
        }
        nz8 nz8Var3 = this.a;
        while (nz8Var3 != null) {
            long j4 = ((long) (nz8Var3.c - nz8Var3.b)) + j2;
            if (j4 > j) {
                break;
            }
            nz8Var3 = nz8Var3.f;
            j2 = j4;
        }
        nz8Var3.getClass();
        return nz8Var3.c((int) (j - j2));
    }

    @Override // defpackage.jl9
    public final se8 peek() {
        return new se8(new tq7(this));
    }

    public final int q(byte[] bArr, int i, int i2) {
        kl8.Q(bArr.length, i, i2);
        nz8 nz8Var = this.a;
        if (nz8Var == null) {
            return -1;
        }
        int iMin = Math.min(i2 - i, nz8Var.b());
        int i3 = (i + iMin) - i;
        byte[] bArr2 = nz8Var.a;
        int i4 = nz8Var.b;
        fw.R(bArr2, i, bArr, i4, i4 + i3);
        nz8Var.b += i3;
        this.c -= (long) iMin;
        if (i12.T(nz8Var)) {
            E();
        }
        return iMin;
    }

    @Override // defpackage.bg9
    public final void q0(jl9 jl9Var, long j) throws EOFException {
        if (j < 0) {
            gp.k(xv5.m(j, "byteCount (", ") < 0"));
            return;
        }
        long j2 = j;
        while (j2 > 0) {
            long jK = jl9Var.K(this, j2);
            if (jK == -1) {
                throw new EOFException(xv5.n(j - j2, " were read.", j39.o(j, "Source exhausted before reading ", " bytes. Only ")));
            }
            j2 -= jK;
        }
    }

    @Override // defpackage.jl9
    public final byte readByte() throws EOFException {
        nz8 nz8Var = this.a;
        if (nz8Var == null) {
            P(1L);
            throw null;
        }
        int iB = nz8Var.b();
        if (iB == 0) {
            E();
            return readByte();
        }
        byte[] bArr = nz8Var.a;
        int i = nz8Var.b;
        nz8Var.b = i + 1;
        byte b = bArr[i];
        this.c--;
        if (iB == 1) {
            E();
        }
        return b;
    }

    public final short readShort() throws EOFException {
        nz8 nz8Var = this.a;
        if (nz8Var == null) {
            P(2L);
            throw null;
        }
        int iB = nz8Var.b();
        if (iB < 2) {
            v(2L);
            if (iB == 0) {
                E();
                return readShort();
            }
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = nz8Var.a;
        int i = nz8Var.b;
        short s = (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
        nz8Var.b = i + 2;
        this.c -= 2;
        if (iB == 2) {
            E();
        }
        return s;
    }

    @Override // defpackage.jl9
    public final boolean request(long j) {
        if (j >= 0) {
            return this.c >= j;
        }
        gp.k(xv5.m(j, "byteCount: ", " < 0"));
        return false;
    }

    public final void skip(long j) throws EOFException {
        if (j < 0) {
            gp.k(xv5.m(j, "byteCount (", ") < 0"));
            return;
        }
        long j2 = j;
        while (j2 > 0) {
            nz8 nz8Var = this.a;
            if (nz8Var == null) {
                throw new EOFException(xv5.m(j, "Buffer exhausted before skipping ", " bytes."));
            }
            int iMin = (int) Math.min(j2, nz8Var.c - nz8Var.b);
            long j3 = iMin;
            this.c -= j3;
            j2 -= j3;
            int i = nz8Var.b + iMin;
            nz8Var.b = i;
            if (i == nz8Var.c) {
                E();
            }
        }
    }

    public final String toString() {
        long j = this.c;
        if (j == 0) {
            return "Buffer(size=0)";
        }
        int iMin = (int) Math.min(64L, j);
        StringBuilder sb = new StringBuilder((iMin * 2) + (this.c > 64 ? 1 : 0));
        int i = 0;
        for (nz8 nz8Var = this.a; nz8Var != null; nz8Var = nz8Var.f) {
            int i2 = 0;
            while (i < iMin && i2 < nz8Var.b()) {
                int i3 = i2 + 1;
                byte bC = nz8Var.c(i2);
                i++;
                char[] cArr = kl8.B;
                sb.append(cArr[(bC >> 4) & 15]);
                sb.append(cArr[bC & 15]);
                i2 = i3;
            }
        }
        if (this.c > 64) {
            sb.append((char) 8230);
        }
        return "Buffer(size=" + this.c + " hex=" + ((Object) sb) + ')';
    }

    @Override // defpackage.bg9
    public final long u0(jc8 jc8Var) {
        jc8Var.getClass();
        long j = 0;
        while (true) {
            long jK = jc8Var.K(this, 8192L);
            if (jK == -1) {
                return j;
            }
            j += jK;
        }
    }

    @Override // defpackage.jl9
    public final void v(long j) throws EOFException {
        if (j < 0) {
            gp.k(xv5.l(j, "byteCount: "));
            return;
        }
        if (this.c >= j) {
            return;
        }
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.c + ", required: " + j + ')');
    }

    @Override // defpackage.bg9
    public final void writeInt(int i) {
        nz8 nz8VarA0 = a0(4);
        byte[] bArr = nz8VarA0.a;
        int i2 = nz8VarA0.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        nz8VarA0.c = i2 + 4;
        this.c += 4;
    }

    @Override // defpackage.jl9
    public final wq0 b() {
        return this;
    }

    @Override // java.lang.AutoCloseable, defpackage.ic8
    public final void close() {
    }

    @Override // java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.bg9
    public final void t0() {
    }
}
