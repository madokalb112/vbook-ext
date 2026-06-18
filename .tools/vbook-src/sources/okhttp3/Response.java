package okhttp3;

import defpackage.pk9;
import defpackage.w58;
import java.io.Closeable;
import okhttp3.Headers;
import okhttp3.internal.connection.Exchange;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class Response implements Closeable {
    public final TrailersSource A;
    public final Request a;
    public final Protocol b;
    public final String c;
    public final int d;
    public final Handshake e;
    public final Headers f;
    public final ResponseBody s;
    public final pk9 t;
    public final Response u;
    public final Response v;
    public final Response w;
    public final long x;
    public final long y;
    public final Exchange z;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static class Builder {
        public Request a;
        public Protocol b;
        public String d;
        public Handshake e;
        public pk9 h;
        public Response i;
        public Response j;
        public Response k;
        public long l;
        public long m;
        public Exchange n;
        public int c = -1;
        public ResponseBody g = ResponseBody.a;
        public TrailersSource o = TrailersSource.a;
        public Headers.Builder f = new Headers.Builder();

        public static void b(String str, Response response) {
            if (response != null) {
                if (response.u != null) {
                    gp.k(str.concat(".networkResponse != null"));
                } else if (response.v != null) {
                    gp.k(str.concat(".cacheResponse != null"));
                } else {
                    if (response.w == null) {
                        return;
                    }
                    gp.k(str.concat(".priorResponse != null"));
                }
            }
        }

        public final Response a() {
            int i = this.c;
            if (i < 0) {
                w58.q(this.c, "code < 0: ");
                return null;
            }
            Request request = this.a;
            if (request == null) {
                gp.j("request == null");
                return null;
            }
            Protocol protocol = this.b;
            if (protocol == null) {
                gp.j("protocol == null");
                return null;
            }
            String str = this.d;
            if (str != null) {
                return new Response(request, protocol, str, i, this.e, this.f.a(), this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
            }
            gp.j("message == null");
            return null;
        }
    }

    public Response(Request request, Protocol protocol, String str, int i, Handshake handshake, Headers headers, ResponseBody responseBody, pk9 pk9Var, Response response, Response response2, Response response3, long j, long j2, Exchange exchange, TrailersSource trailersSource) {
        request.getClass();
        protocol.getClass();
        str.getClass();
        responseBody.getClass();
        trailersSource.getClass();
        this.a = request;
        this.b = protocol;
        this.c = str;
        this.d = i;
        this.e = handshake;
        this.f = headers;
        this.s = responseBody;
        this.t = pk9Var;
        this.u = response;
        this.v = response2;
        this.w = response3;
        this.x = j;
        this.y = j2;
        this.z = exchange;
        this.A = trailersSource;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.s.close();
    }

    public final Builder p() {
        Builder builder = new Builder();
        builder.c = -1;
        builder.g = ResponseBody.a;
        builder.o = TrailersSource.a;
        builder.a = this.a;
        builder.b = this.b;
        builder.c = this.d;
        builder.d = this.c;
        builder.e = this.e;
        builder.f = this.f.d();
        builder.g = this.s;
        builder.h = this.t;
        builder.i = this.u;
        builder.j = this.v;
        builder.k = this.w;
        builder.l = this.x;
        builder.m = this.y;
        builder.n = this.z;
        builder.o = this.A;
        return builder;
    }

    public final String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.d + ", message=" + this.c + ", url=" + this.a.a + '}';
    }
}
