package okhttp3.internal;

import defpackage.ie8;
import defpackage.il9;
import defpackage.mr0;
import defpackage.uua;
import defpackage.xq0;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class UnreadableResponseBody extends ResponseBody implements il9 {
    public final MediaType b;
    public final long c;

    public UnreadableResponseBody(MediaType mediaType, long j) {
        this.b = mediaType;
        this.c = j;
    }

    @Override // defpackage.il9
    public final long D0(long j, xq0 xq0Var) {
        xq0Var.getClass();
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // okhttp3.ResponseBody
    public final mr0 I0() {
        return new ie8(this);
    }

    @Override // defpackage.il9
    public final uua l() {
        return uua.d;
    }

    @Override // okhttp3.ResponseBody
    public final long p() {
        return this.c;
    }

    @Override // okhttp3.ResponseBody
    public final MediaType q() {
        return this.b;
    }

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
