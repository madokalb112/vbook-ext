package okhttp3.internal.ws;

import defpackage.g75;
import defpackage.xq0;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class MessageInflater implements Closeable {
    public final boolean a;
    public final xq0 b = new xq0();
    public Inflater c;
    public g75 d;

    public MessageInflater(boolean z) {
        this.a = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        g75 g75Var = this.d;
        if (g75Var != null) {
            g75Var.close();
        }
        this.d = null;
        this.c = null;
    }
}
