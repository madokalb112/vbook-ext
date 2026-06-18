package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ie8 implements mr0 {
    public final il9 a;
    public final xq0 b;
    public boolean c;

    public ie8(il9 il9Var) {
        il9Var.getClass();
        this.a = il9Var;
        this.b = new xq0();
    }

    public final long A() throws EOFException {
        v(8L);
        long j = this.b.readLong();
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    @Override // defpackage.il9
    public final long D0(long j, xq0 xq0Var) {
        xq0Var.getClass();
        if (j < 0) {
            gp.k(xv5.l(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.c) {
            gp.j("closed");
            return 0L;
        }
        xq0 xq0Var2 = this.b;
        if (xq0Var2.b == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.a.D0(8192L, xq0Var2) == -1) {
                return -1L;
            }
        }
        return xq0Var2.D0(Math.min(j, xq0Var2.b), xq0Var);
    }

    public final short E() {
        v(2L);
        return this.b.g0();
    }

    @Override // defpackage.mr0
    public final boolean H(long j, av0 av0Var) {
        long jA;
        boolean z;
        boolean z2;
        long j2;
        av0Var.getClass();
        int iD = av0Var.d();
        if (this.c) {
            gp.j("closed");
            return false;
        }
        if (iD < 0 || j < 0 || iD > av0Var.d()) {
            return false;
        }
        if (iD == 0) {
            return true;
        }
        long j3 = 1;
        long j4 = j + 1;
        long j5 = iD;
        ah1.z(av0Var.d(), 0L, j5);
        if (this.c) {
            gp.j("closed");
            return false;
        }
        long jMax = j;
        loop0: while (true) {
            xq0 xq0Var = this.b;
            jA = b.a(xq0Var, av0Var, jMax, j4, iD);
            if (jA == -1) {
                long j6 = xq0Var.b;
                z = false;
                z2 = true;
                long j7 = (j6 - j5) + j3;
                if (j7 >= j4) {
                    break;
                }
                if (j6 >= j4) {
                    int iMax = (int) Math.max(j3, (j6 - j4) + j3);
                    int iMin = ((int) Math.min(j5, (xq0Var.b - jMax) + j3)) - 1;
                    if (iMax > iMin) {
                        break;
                    }
                    while (true) {
                        j2 = j4;
                        if (!xq0Var.R(iMin, xq0Var.b - ((long) iMin), av0Var)) {
                            if (iMin == iMax) {
                                break loop0;
                            }
                            iMin--;
                            j4 = j2;
                        } else {
                            break;
                        }
                    }
                } else {
                    j2 = j4;
                }
                if (this.a.D0(8192L, xq0Var) == -1) {
                    break;
                }
                jMax = Math.max(jMax, j7);
                j4 = j2;
                j3 = 1;
            } else {
                z = false;
                z2 = true;
                break;
            }
        }
        jA = -1;
        return jA != -1 ? z2 : z;
    }

    @Override // defpackage.mr0
    public final byte[] I() {
        il9 il9Var = this.a;
        xq0 xq0Var = this.b;
        xq0Var.K0(il9Var);
        return xq0Var.e0(xq0Var.b);
    }

    public final String N(long j) {
        v(j);
        return this.b.j0(j, q31.a);
    }

    @Override // defpackage.mr0
    public final long N0() {
        xq0 xq0Var;
        byte bE;
        v(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zRequest = request(i2);
            xq0Var = this.b;
            if (!zRequest) {
                break;
            }
            bE = xq0Var.E(i);
            if ((bE < 48 || bE > 57) && ((bE < 97 || bE > 102) && (bE < 65 || bE > 70))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            gjb.X(16);
            String string = Integer.toString(bE, 16);
            string.getClass();
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
        }
        return xq0Var.N0();
    }

    public final String P() {
        long jP = p((byte) 10, 0L, Long.MAX_VALUE);
        xq0 xq0Var = this.b;
        if (jP != -1) {
            return b.c(jP, xq0Var);
        }
        long j = xq0Var.b;
        if (j != 0) {
            return N(j);
        }
        return null;
    }

    @Override // defpackage.mr0
    public final InputStream R0() {
        return new mh0(this, 3);
    }

    @Override // defpackage.mr0
    public final String W(long j) {
        if (j < 0) {
            gp.k(xv5.l(j, "limit < 0: "));
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jP = p((byte) 10, 0L, j2);
        xq0 xq0Var = this.b;
        if (jP != -1) {
            return b.c(jP, xq0Var);
        }
        if (j2 < Long.MAX_VALUE && request(j2) && xq0Var.E(j2 - 1) == 13 && request(j2 + 1) && xq0Var.E(j2) == 10) {
            return b.c(j2, xq0Var);
        }
        xq0 xq0Var2 = new xq0();
        xq0Var.A(xq0Var2, 0L, Math.min(32L, xq0Var.b));
        throw new EOFException("\\n not found: limit=" + Math.min(xq0Var.b, j) + " content=" + xq0Var2.z(xq0Var2.b).e() + (char) 8230);
    }

    @Override // defpackage.mr0
    public final void X(long j, xq0 xq0Var) throws EOFException {
        xq0 xq0Var2 = this.b;
        try {
            v(j);
            xq0Var2.X(j, xq0Var);
        } catch (EOFException e) {
            xq0Var.K0(xq0Var2);
            throw e;
        }
    }

    @Override // defpackage.mr0
    public final xq0 b() {
        return this.b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.close();
        this.b.p();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.mr0
    public final boolean k() {
        if (this.c) {
            gp.j("closed");
            return false;
        }
        xq0 xq0Var = this.b;
        return xq0Var.k() && this.a.D0(8192L, xq0Var) == -1;
    }

    @Override // defpackage.il9
    public final uua l() {
        return this.a.l();
    }

    public final long p(byte b, long j, long j2) {
        if (this.c) {
            gp.j("closed");
            return 0L;
        }
        if (0 > j2) {
            gp.k(xv5.l(j2, "fromIndex=0 toIndex="));
            return 0L;
        }
        long jMax = 0;
        while (jMax < j2) {
            xq0 xq0Var = this.b;
            byte b2 = b;
            long j3 = j2;
            long jN = xq0Var.N(b2, jMax, j3);
            if (jN != -1) {
                return jN;
            }
            long j4 = xq0Var.b;
            if (j4 >= j3 || this.a.D0(8192L, xq0Var) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    public final int q() {
        v(4L);
        return ah1.R(this.b.readInt());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        xq0 xq0Var = this.b;
        if (xq0Var.b == 0 && this.a.D0(8192L, xq0Var) == -1) {
            return -1;
        }
        return xq0Var.read(byteBuffer);
    }

    @Override // defpackage.mr0
    public final byte readByte() {
        v(1L);
        return this.b.readByte();
    }

    @Override // defpackage.mr0
    public final void readFully(byte[] bArr) throws EOFException {
        xq0 xq0Var = this.b;
        bArr.getClass();
        try {
            v(bArr.length);
            xq0Var.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = xq0Var.b;
                if (j <= 0) {
                    throw e;
                }
                int i2 = xq0Var.read(bArr, i, (int) j);
                if (i2 == -1) {
                    w58.a();
                    return;
                }
                i += i2;
            }
        }
    }

    @Override // defpackage.mr0
    public final int readInt() {
        v(4L);
        return this.b.readInt();
    }

    @Override // defpackage.mr0
    public final long readLong() {
        v(8L);
        return this.b.readLong();
    }

    @Override // defpackage.mr0
    public final short readShort() {
        v(2L);
        return this.b.readShort();
    }

    @Override // defpackage.mr0
    public final boolean request(long j) {
        xq0 xq0Var;
        if (j < 0) {
            gp.k(xv5.l(j, "byteCount < 0: "));
            return false;
        }
        if (this.c) {
            gp.j("closed");
            return false;
        }
        do {
            xq0Var = this.b;
            if (xq0Var.b >= j) {
                return true;
            }
        } while (this.a.D0(8192L, xq0Var) != -1);
        return false;
    }

    @Override // defpackage.mr0
    public final void skip(long j) {
        if (this.c) {
            gp.j("closed");
            return;
        }
        while (j > 0) {
            xq0 xq0Var = this.b;
            if (xq0Var.b == 0 && this.a.D0(8192L, xq0Var) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, xq0Var.b);
            xq0Var.skip(jMin);
            j -= jMin;
        }
    }

    public final String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // defpackage.mr0
    public final void v(long j) {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    @Override // defpackage.mr0
    public final String v0() {
        return W(Long.MAX_VALUE);
    }

    @Override // defpackage.mr0
    public final av0 z(long j) {
        v(j);
        return this.b.z(j);
    }
}
