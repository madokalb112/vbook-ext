package okhttp3.internal.http2;

import defpackage.ag9;
import defpackage.av0;
import defpackage.il9;
import defpackage.pk9;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http2.Http2Stream;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class Http2ExchangeCodec implements ExchangeCodec {
    public static final List g = _UtilJvmKt.j(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    public static final List h = _UtilJvmKt.j(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});
    public final RealConnection a;
    public final RealInterceptorChain b;
    public final Http2Connection c;
    public volatile Http2Stream d;
    public final Protocol e;
    public volatile boolean f;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
    }

    public Http2ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, RealInterceptorChain realInterceptorChain, Http2Connection http2Connection) {
        okHttpClient.getClass();
        http2Connection.getClass();
        this.a = realConnection;
        this.b = realInterceptorChain;
        this.c = http2Connection;
        List list = okHttpClient.r;
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void a() throws IOException {
        Http2Stream http2Stream = this.d;
        http2Stream.getClass();
        http2Stream.u.close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void b(Request request) {
        int i;
        Http2Stream http2Stream;
        boolean z;
        request.getClass();
        if (this.d != null) {
            return;
        }
        boolean z2 = request.d != null;
        Headers headers = request.c;
        ArrayList arrayList = new ArrayList(headers.size() + 4);
        arrayList.add(new Header(Header.f, request.b));
        av0 av0Var = Header.g;
        HttpUrl httpUrl = request.a;
        arrayList.add(new Header(av0Var, RequestLine.a(httpUrl)));
        String strA = headers.a("Host");
        if (strA != null) {
            arrayList.add(new Header(Header.i, strA));
        }
        arrayList.add(new Header(Header.h, httpUrl.a));
        int size = headers.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strC = headers.c(i2);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = strC.toLowerCase(locale);
            lowerCase.getClass();
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && headers.e(i2).equals("trailers"))) {
                arrayList.add(new Header(lowerCase, headers.e(i2)));
            }
        }
        Http2Connection http2Connection = this.c;
        http2Connection.getClass();
        boolean z3 = !z2;
        synchronized (http2Connection.I) {
            synchronized (http2Connection) {
                try {
                    if (http2Connection.e > 1073741823) {
                        http2Connection.E(ErrorCode.REFUSED_STREAM);
                    }
                    if (http2Connection.f) {
                        throw new ConnectionShutdownException();
                    }
                    i = http2Connection.e;
                    http2Connection.e = i + 2;
                    http2Stream = new Http2Stream(i, http2Connection, z3, false, null);
                    z = !z2 || http2Connection.F >= http2Connection.G || http2Stream.d >= http2Stream.e;
                    if (http2Stream.j()) {
                        http2Connection.b.put(Integer.valueOf(i), http2Stream);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            http2Connection.I.N(z3, i, arrayList);
        }
        if (z) {
            http2Connection.I.flush();
        }
        this.d = http2Stream;
        boolean z4 = this.f;
        Http2Stream http2Stream2 = this.d;
        if (z4) {
            http2Stream2.getClass();
            http2Stream2.g(ErrorCode.CANCEL);
            sy3.m("Canceled");
            return;
        }
        http2Stream2.getClass();
        Http2Stream.StreamTimeout streamTimeout = http2Stream2.v;
        long j = this.b.g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        streamTimeout.g(j, timeUnit);
        Http2Stream http2Stream3 = this.d;
        http2Stream3.getClass();
        http2Stream3.w.g(this.b.h, timeUnit);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    @Override // okhttp3.internal.http.ExchangeCodec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() {
        /*
            r4 = this;
            okhttp3.internal.http2.Http2Stream r4 = r4.d
            r0 = 0
            if (r4 == 0) goto L20
            monitor-enter(r4)
            okhttp3.internal.http2.Http2Stream$FramingSource r1 = r4.t     // Catch: java.lang.Throwable -> L17
            boolean r2 = r1.b     // Catch: java.lang.Throwable -> L17
            r3 = 1
            if (r2 == 0) goto L19
            xq0 r1 = r1.d     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.k()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L19
            r1 = r3
            goto L1a
        L17:
            r0 = move-exception
            goto L1e
        L19:
            r1 = r0
        L1a:
            monitor-exit(r4)
            if (r1 != r3) goto L20
            return r3
        L1e:
            monitor-exit(r4)
            throw r0
        L20:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2ExchangeCodec.c():boolean");
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void cancel() {
        this.f = true;
        Http2Stream http2Stream = this.d;
        if (http2Stream != null) {
            http2Stream.g(ErrorCode.CANCEL);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final il9 d(Response response) {
        Http2Stream http2Stream = this.d;
        http2Stream.getClass();
        return http2Stream.t;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    @Override // okhttp3.internal.http.ExchangeCodec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.Response.Builder e(boolean r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2ExchangeCodec.e(boolean):okhttp3.Response$Builder");
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void f() {
        this.c.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final pk9 g() {
        Http2Stream http2Stream = this.d;
        http2Stream.getClass();
        return http2Stream;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final long h(Response response) {
        if (HttpHeaders.a(response)) {
            return _UtilJvmKt.e(response);
        }
        return 0L;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final ExchangeCodec.Carrier i() {
        return this.a;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final ag9 j(Request request, long j) {
        request.getClass();
        Http2Stream http2Stream = this.d;
        http2Stream.getClass();
        return http2Stream.u;
    }
}
