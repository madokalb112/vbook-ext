package okhttp3.internal.cache2;

import defpackage.av0;
import defpackage.il9;
import defpackage.ra1;
import defpackage.uua;
import defpackage.xq0;
import okhttp3.internal.concurrent.Lockable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class Relay implements Lockable {

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
    }

    static {
        av0 av0Var = av0.d;
        ra1.s("OkHttp cache v1\n");
        ra1.s("OkHttp DIRTY :(\n");
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public final class RelaySource implements il9 {
        @Override // defpackage.il9
        public final long D0(long j, xq0 xq0Var) {
            xq0Var.getClass();
            throw new IllegalStateException("Check failed.");
        }

        @Override // defpackage.il9
        public final uua l() {
            return null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }
}
