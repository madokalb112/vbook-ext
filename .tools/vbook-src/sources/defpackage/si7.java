package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class si7 implements ic8 {
    public final OutputStream a;

    public si7(OutputStream outputStream) {
        this.a = outputStream;
    }

    @Override // defpackage.ic8
    public final void E0(wq0 wq0Var, long j) {
        kl8.R(wq0Var.c, j);
        while (j > 0) {
            if (wq0Var.k()) {
                gp.l("Buffer is empty");
                return;
            }
            nz8 nz8Var = wq0Var.a;
            nz8Var.getClass();
            byte[] bArr = nz8Var.a;
            int i = nz8Var.b;
            int iMin = (int) Math.min(j, nz8Var.c - i);
            this.a.write(bArr, i, iMin);
            if (iMin != 0) {
                if (iMin < 0) {
                    gp.j("Returned negative read bytes count");
                    return;
                } else {
                    if (iMin > nz8Var.b()) {
                        gp.j("Returned too many bytes");
                        return;
                    }
                    wq0Var.skip(iMin);
                }
            }
            j -= (long) iMin;
        }
    }

    @Override // defpackage.ic8, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.a.flush();
    }

    public final String toString() {
        return "RawSink(" + this.a + ')';
    }
}
