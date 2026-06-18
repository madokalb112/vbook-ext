package defpackage;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ds8 implements Closeable {
    public final int a;
    public final /* synthetic */ fs8 b;

    public ds8(fs8 fs8Var, int i) {
        this.b = fs8Var;
        this.a = i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        fs8 fs8Var = this.b;
        if (fs8Var.b.b.getValue() instanceof zn1) {
            ah1.J(fs8Var.u, null, null, new y46(fs8Var, this, null, 24), 3);
        }
    }
}
