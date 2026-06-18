package defpackage;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mi4 implements ag9 {
    public final he8 a;
    public final Deflater b;
    public final hm2 c;
    public boolean d;
    public final CRC32 e;

    public mi4(he8 he8Var) {
        he8 he8Var2 = new he8(he8Var);
        this.a = he8Var2;
        Deflater deflater = new Deflater(-1, true);
        this.b = deflater;
        this.c = new hm2(he8Var2, deflater, 0);
        this.e = new CRC32();
        xq0 xq0Var = he8Var2.b;
        xq0Var.V0(8075);
        xq0Var.O0(8);
        xq0Var.O0(0);
        xq0Var.m5writeInt(0);
        xq0Var.O0(0);
        xq0Var.O0(0);
    }

    @Override // defpackage.ag9, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        int value;
        boolean z;
        xq0 xq0Var;
        Deflater deflater = this.b;
        he8 he8Var = this.a;
        if (this.d) {
            return;
        }
        try {
            hm2 hm2Var = this.c;
            ((Deflater) hm2Var.d).finish();
            hm2Var.p(false);
            value = (int) this.e.getValue();
            z = he8Var.c;
            xq0Var = he8Var.b;
        } catch (Throwable th) {
            th = th;
        }
        if (z) {
            throw new IllegalStateException("closed");
        }
        xq0Var.m5writeInt(ah1.R(value));
        he8Var.p();
        int bytesRead = (int) deflater.getBytesRead();
        if (he8Var.c) {
            throw new IllegalStateException("closed");
        }
        xq0Var.m5writeInt(ah1.R(bytesRead));
        he8Var.p();
        th = null;
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            he8Var.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.d = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.ag9, java.io.Flushable
    public final void flush() throws IOException {
        this.c.flush();
    }

    @Override // defpackage.ag9
    public final uua l() {
        return this.a.a.l();
    }

    @Override // defpackage.ag9
    public final void y0(long j, xq0 xq0Var) throws IOException {
        if (j < 0) {
            gp.k(xv5.l(j, "byteCount < 0: "));
            return;
        }
        if (j == 0) {
            return;
        }
        oz8 oz8Var = xq0Var.a;
        oz8Var.getClass();
        long j2 = j;
        while (j2 > 0) {
            int iMin = (int) Math.min(j2, oz8Var.c - oz8Var.b);
            this.e.update(oz8Var.a, oz8Var.b, iMin);
            j2 -= (long) iMin;
            oz8Var = oz8Var.f;
            oz8Var.getClass();
        }
        this.c.y0(j, xq0Var);
    }
}
