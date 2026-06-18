package okhttp3;

import defpackage.av0;
import defpackage.il9;
import defpackage.ra1;
import defpackage.uua;
import defpackage.xq0;
import defpackage.xv5;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class MultipartReader implements Closeable {

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Part implements Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public final class PartSource implements il9 {
        @Override // defpackage.il9
        public final long D0(long j, xq0 xq0Var) {
            xq0Var.getClass();
            if (j >= 0) {
                throw null;
            }
            throw new IllegalArgumentException(xv5.l(j, "byteCount < 0: ").toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // defpackage.il9
        public final uua l() {
            return null;
        }
    }

    static {
        av0 av0Var = av0.d;
        bx1.M(new av0[]{ra1.s("\r\n"), ra1.s("--"), ra1.s(" "), ra1.s("\t")});
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
