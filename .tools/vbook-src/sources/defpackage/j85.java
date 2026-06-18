package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class j85 implements il9 {
    public final InputStream a;
    public final uua b;

    public j85(InputStream inputStream, uua uuaVar) {
        inputStream.getClass();
        this.a = inputStream;
        this.b = uuaVar;
    }

    @Override // defpackage.il9
    public final long D0(long j, xq0 xq0Var) throws IOException {
        xq0Var.getClass();
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            gp.k(xv5.l(j, "byteCount < 0: "));
            return 0L;
        }
        try {
            this.b.f();
            oz8 oz8VarA0 = xq0Var.A0(1);
            int i = this.a.read(oz8VarA0.a, oz8VarA0.c, (int) Math.min(j, 8192 - oz8VarA0.c));
            if (i != -1) {
                oz8VarA0.c += i;
                long j2 = i;
                xq0Var.b += j2;
                return j2;
            }
            if (oz8VarA0.b != oz8VarA0.c) {
                return -1L;
            }
            xq0Var.a = oz8VarA0.a();
            xz8.a(oz8VarA0);
            return -1L;
        } catch (AssertionError e) {
            if (q7c.a(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.il9
    public final uua l() {
        return this.b;
    }

    public final String toString() {
        return "source(" + this.a + ')';
    }
}
