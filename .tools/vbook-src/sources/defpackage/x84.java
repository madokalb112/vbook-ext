package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class x84 implements il9 {
    public final il9 a;

    public x84(il9 il9Var) {
        il9Var.getClass();
        this.a = il9Var;
    }

    @Override // defpackage.il9
    public long D0(long j, xq0 xq0Var) {
        xq0Var.getClass();
        return this.a.D0(j, xq0Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.il9
    public final uua l() {
        return this.a.l();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.a + ')';
    }
}
