package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class w84 implements ag9 {
    public final ag9 a;

    public w84(ag9 ag9Var) {
        ag9Var.getClass();
        this.a = ag9Var;
    }

    @Override // defpackage.ag9, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // defpackage.ag9, java.io.Flushable
    public void flush() {
        this.a.flush();
    }

    @Override // defpackage.ag9
    public final uua l() {
        return this.a.l();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.a + ')';
    }

    @Override // defpackage.ag9
    public void y0(long j, xq0 xq0Var) {
        this.a.y0(j, xq0Var);
    }
}
