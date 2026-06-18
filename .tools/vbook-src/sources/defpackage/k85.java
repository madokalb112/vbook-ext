package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class k85 implements jc8 {
    public final InputStream a;

    public k85(InputStream inputStream) {
        inputStream.getClass();
        this.a = inputStream;
    }

    @Override // defpackage.jc8
    public final long K(wq0 wq0Var, long j) throws IOException {
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            gp.k(xv5.m(j, "byteCount (", ") < 0"));
            return 0L;
        }
        try {
            nz8 nz8VarA0 = wq0Var.a0(1);
            long j2 = this.a.read(nz8VarA0.a, nz8VarA0.c, (int) Math.min(j, r4.length - r5));
            int i = j2 == -1 ? 0 : (int) j2;
            if (i == 1) {
                nz8VarA0.c += i;
                wq0Var.c += (long) i;
                return j2;
            }
            if (i < 0 || i > nz8VarA0.a()) {
                throw new IllegalStateException(("Invalid number of bytes written: " + i + ". Should be in 0.." + nz8VarA0.a()).toString());
            }
            if (i != 0) {
                nz8VarA0.c += i;
                wq0Var.c += (long) i;
                return j2;
            }
            if (i12.T(nz8VarA0)) {
                wq0Var.N();
            }
            return j2;
        } catch (AssertionError e) {
            if (e.getCause() != null) {
                String message = e.getMessage();
                if (message != null ? bw9.O(message, "getsockname failed", false) : false) {
                    throw new IOException(e);
                }
            }
            throw e;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    public final String toString() {
        return "RawSource(" + this.a + ')';
    }
}
