package okhttp3.internal.cache;

import defpackage.w84;
import defpackage.xq0;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class FaultHidingSink extends w84 {
    public boolean b;

    @Override // defpackage.w84, defpackage.ag9, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException unused) {
            this.b = true;
            throw null;
        }
    }

    @Override // defpackage.w84, defpackage.ag9, java.io.Flushable
    public final void flush() {
        if (this.b) {
            return;
        }
        try {
            super.flush();
        } catch (IOException unused) {
            this.b = true;
            throw null;
        }
    }

    @Override // defpackage.w84, defpackage.ag9
    public final void y0(long j, xq0 xq0Var) throws EOFException {
        if (this.b) {
            xq0Var.skip(j);
            return;
        }
        try {
            this.a.y0(j, xq0Var);
        } catch (IOException unused) {
            this.b = true;
            throw null;
        }
    }
}
