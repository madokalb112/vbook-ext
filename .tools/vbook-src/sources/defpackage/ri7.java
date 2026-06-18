package defpackage;

import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ri7 implements ag9 {
    public final FileOutputStream a;
    public final uua b;

    public ri7(FileOutputStream fileOutputStream, uua uuaVar) {
        this.a = fileOutputStream;
        this.b = uuaVar;
    }

    @Override // defpackage.ag9, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.ag9, java.io.Flushable
    public final void flush() throws IOException {
        this.a.flush();
    }

    @Override // defpackage.ag9
    public final uua l() {
        return this.b;
    }

    public final String toString() {
        return "sink(" + this.a + ')';
    }

    @Override // defpackage.ag9
    public final void y0(long j, xq0 xq0Var) throws IOException {
        ah1.z(xq0Var.b, 0L, j);
        while (j > 0) {
            this.b.f();
            oz8 oz8Var = xq0Var.a;
            oz8Var.getClass();
            int iMin = (int) Math.min(j, oz8Var.c - oz8Var.b);
            this.a.write(oz8Var.a, oz8Var.b, iMin);
            int i = oz8Var.b + iMin;
            oz8Var.b = i;
            long j2 = iMin;
            j -= j2;
            xq0Var.b -= j2;
            if (i == oz8Var.c) {
                xq0Var.a = oz8Var.a();
                xz8.a(oz8Var);
            }
        }
    }
}
