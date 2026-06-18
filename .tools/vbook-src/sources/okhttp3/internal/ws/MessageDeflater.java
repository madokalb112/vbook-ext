package okhttp3.internal.ws;

import defpackage.he8;
import defpackage.hm2;
import defpackage.xq0;
import java.io.Closeable;
import java.util.zip.Deflater;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class MessageDeflater implements Closeable {
    public final boolean a;
    public final xq0 b;
    public final Deflater c;
    public final hm2 d;

    public MessageDeflater(boolean z) {
        this.a = z;
        xq0 xq0Var = new xq0();
        this.b = xq0Var;
        Deflater deflater = new Deflater(-1, true);
        this.c = deflater;
        this.d = new hm2(new he8(xq0Var), deflater, 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.d.close();
    }
}
