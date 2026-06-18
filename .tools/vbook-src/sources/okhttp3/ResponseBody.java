package okhttp3;

import defpackage.av0;
import defpackage.mr0;
import defpackage.xq0;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import okhttp3.internal._UtilCommonKt;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class ResponseBody implements Closeable {
    public static final ResponseBody$Companion$asResponseBody$1 a;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class BomAwareReader extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) throws IOException {
            cArr.getClass();
            throw new IOException("Stream closed");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [okhttp3.ResponseBody$Companion$asResponseBody$1] */
    static {
        av0 av0Var = av0.d;
        av0Var.getClass();
        final xq0 xq0Var = new xq0();
        xq0Var.F0(av0Var);
        final long length = av0Var.a.length;
        a = new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
            @Override // okhttp3.ResponseBody
            public final mr0 I0() {
                return xq0Var;
            }

            @Override // okhttp3.ResponseBody
            public final long p() {
                return length;
            }

            @Override // okhttp3.ResponseBody
            public final MediaType q() {
                return null;
            }
        };
    }

    public abstract mr0 I0();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        _UtilCommonKt.b(I0());
    }

    public abstract long p();

    public abstract MediaType q();
}
