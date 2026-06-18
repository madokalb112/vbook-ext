package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ni4 implements il9 {
    public byte a;
    public final ie8 b;
    public final Inflater c;
    public final g75 d;
    public final CRC32 e;

    public ni4(mr0 mr0Var) {
        mr0Var.getClass();
        ie8 ie8Var = new ie8(mr0Var);
        this.b = ie8Var;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new g75(ie8Var, inflater);
        this.e = new CRC32();
    }

    public static void p(int i, int i2, String str) throws IOException {
        if (i2 == i) {
            return;
        }
        StringBuilder sbV = xv5.v(str, ": actual 0x");
        sbV.append(bw9.i0(8, ah1.Z(i2)));
        sbV.append(" != expected 0x");
        sbV.append(bw9.i0(8, ah1.Z(i)));
        throw new IOException(sbV.toString());
    }

    @Override // defpackage.il9
    public final long D0(long j, xq0 xq0Var) throws IOException {
        ni4 ni4Var = this;
        xq0Var.getClass();
        if (j < 0) {
            gp.k(xv5.l(j, "byteCount < 0: "));
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        byte b = ni4Var.a;
        CRC32 crc32 = ni4Var.e;
        ie8 ie8Var = ni4Var.b;
        if (b == 0) {
            ie8Var.v(10L);
            xq0 xq0Var2 = ie8Var.b;
            byte bE = xq0Var2.E(3L);
            boolean z = ((bE >> 1) & 1) == 1;
            if (z) {
                ni4Var.q(xq0Var2, 0L, 10L);
            }
            p(8075, ie8Var.readShort(), "ID1ID2");
            ie8Var.skip(8L);
            if (((bE >> 2) & 1) == 1) {
                ie8Var.v(2L);
                if (z) {
                    q(xq0Var2, 0L, 2L);
                }
                long jG0 = xq0Var2.g0() & 65535;
                ie8Var.v(jG0);
                if (z) {
                    q(xq0Var2, 0L, jG0);
                }
                ie8Var.skip(jG0);
            }
            if (((bE >> 3) & 1) == 1) {
                long jP = ie8Var.p((byte) 0, 0L, Long.MAX_VALUE);
                if (jP == -1) {
                    throw new EOFException();
                }
                if (z) {
                    q(xq0Var2, 0L, jP + 1);
                }
                ie8Var.skip(jP + 1);
            }
            if (((bE >> 4) & 1) == 1) {
                long jP2 = ie8Var.p((byte) 0, 0L, Long.MAX_VALUE);
                if (jP2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    ni4Var = this;
                    ni4Var.q(xq0Var2, 0L, jP2 + 1);
                } else {
                    ni4Var = this;
                }
                ie8Var.skip(jP2 + 1);
            } else {
                ni4Var = this;
            }
            if (z) {
                p(ie8Var.E(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            ni4Var.a = (byte) 1;
        }
        if (ni4Var.a == 1) {
            long j2 = xq0Var.b;
            long jD0 = ni4Var.d.D0(j, xq0Var);
            if (jD0 != -1) {
                ni4Var.q(xq0Var, j2, jD0);
                return jD0;
            }
            ni4Var.a = (byte) 2;
        }
        if (ni4Var.a == 2) {
            p(ie8Var.q(), (int) crc32.getValue(), "CRC");
            p(ie8Var.q(), (int) ni4Var.c.getBytesWritten(), "ISIZE");
            ni4Var.a = (byte) 3;
            if (!ie8Var.k()) {
                sy3.m("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }

    @Override // defpackage.il9
    public final uua l() {
        return this.b.a.l();
    }

    public final void q(xq0 xq0Var, long j, long j2) {
        oz8 oz8Var = xq0Var.a;
        oz8Var.getClass();
        while (true) {
            int i = oz8Var.c;
            int i2 = oz8Var.b;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            oz8Var = oz8Var.f;
            oz8Var.getClass();
        }
        while (j2 > 0) {
            int i3 = (int) (((long) oz8Var.b) + j);
            int iMin = (int) Math.min(oz8Var.c - i3, j2);
            this.e.update(oz8Var.a, i3, iMin);
            j2 -= (long) iMin;
            oz8Var = oz8Var.f;
            oz8Var.getClass();
            j = 0;
        }
    }
}
