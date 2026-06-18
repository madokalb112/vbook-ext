package okhttp3.internal.http1;

import defpackage.ag9;
import defpackage.bw9;
import defpackage.il9;
import defpackage.lc5;
import defpackage.lr0;
import defpackage.pk9;
import defpackage.uua;
import defpackage.w58;
import defpackage.xq0;
import defpackage.xv5;
import defpackage.z84;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.Arrays;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.BufferedSocket;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {
    public static final Headers f;
    public final OkHttpClient a;
    public final ExchangeCodec.Carrier b;
    public final BufferedSocket c;
    public int d;
    public final HeadersReader e;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public abstract class AbstractSource implements il9 {
        public final HttpUrl a;
        public final z84 b;
        public boolean c;
        public final /* synthetic */ Http1ExchangeCodec d;

        public AbstractSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            httpUrl.getClass();
            this.d = http1ExchangeCodec;
            this.a = httpUrl;
            this.b = new z84(http1ExchangeCodec.c.c().l());
        }

        @Override // defpackage.il9
        public long D0(long j, xq0 xq0Var) throws IOException {
            Http1ExchangeCodec http1ExchangeCodec = this.d;
            xq0Var.getClass();
            try {
                return http1ExchangeCodec.c.c().D0(j, xq0Var);
            } catch (IOException e) {
                http1ExchangeCodec.b.f();
                this.p(Http1ExchangeCodec.f);
                throw e;
            }
        }

        @Override // defpackage.il9
        public final uua l() {
            return this.b;
        }

        public final void p(Headers headers) {
            OkHttpClient okHttpClient;
            CookieJar cookieJar;
            headers.getClass();
            Http1ExchangeCodec http1ExchangeCodec = this.d;
            int i = http1ExchangeCodec.d;
            if (i == 6) {
                return;
            }
            if (i != 5) {
                so9.i(http1ExchangeCodec.d, "state: ");
                return;
            }
            z84 z84Var = this.b;
            uua uuaVar = z84Var.e;
            z84Var.e = uua.d;
            uuaVar.a();
            uuaVar.b();
            http1ExchangeCodec.d = 6;
            if (headers.size() <= 0 || (okHttpClient = http1ExchangeCodec.a) == null || (cookieJar = okHttpClient.j) == null) {
                return;
            }
            HttpHeaders.d(cookieJar, this.a, headers);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public final class ChunkedSink implements ag9 {
        public final z84 a;
        public boolean b;

        public ChunkedSink() {
            this.a = new z84(Http1ExchangeCodec.this.c.b().l());
        }

        @Override // defpackage.ag9, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.b) {
                return;
            }
            this.b = true;
            Http1ExchangeCodec.this.c.b().d0("0\r\n\r\n");
            z84 z84Var = this.a;
            uua uuaVar = z84Var.e;
            z84Var.e = uua.d;
            uuaVar.a();
            uuaVar.b();
            Http1ExchangeCodec.this.d = 3;
        }

        @Override // defpackage.ag9, java.io.Flushable
        public final synchronized void flush() {
            if (this.b) {
                return;
            }
            Http1ExchangeCodec.this.c.b().flush();
        }

        @Override // defpackage.ag9
        public final uua l() {
            return this.a;
        }

        @Override // defpackage.ag9
        public final void y0(long j, xq0 xq0Var) {
            if (this.b) {
                gp.j("closed");
                return;
            }
            if (j == 0) {
                return;
            }
            lr0 lr0VarB = Http1ExchangeCodec.this.c.b();
            lr0VarB.k0(j);
            lr0VarB.d0("\r\n");
            lr0VarB.y0(j, xq0Var);
            lr0VarB.d0("\r\n");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public final class ChunkedSource extends AbstractSource {
        public long e;
        public boolean f;
        public final /* synthetic */ Http1ExchangeCodec s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            super(http1ExchangeCodec, httpUrl);
            httpUrl.getClass();
            this.s = http1ExchangeCodec;
            this.e = -1L;
            this.f = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x00c4, code lost:
        
            if (r16.f == false) goto L37;
         */
        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, defpackage.il9
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final long D0(long r17, defpackage.xq0 r19) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 294
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http1.Http1ExchangeCodec.ChunkedSource.D0(long, xq0):long");
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            boolean zF;
            if (this.c) {
                return;
            }
            if (this.f) {
                TimeZone timeZone = _UtilJvmKt.a;
                TimeUnit.MILLISECONDS.getClass();
                try {
                    zF = _UtilJvmKt.f(this, 100);
                } catch (IOException unused) {
                    zF = false;
                }
                if (!zF) {
                    this.s.b.f();
                    p(Http1ExchangeCodec.f);
                }
            }
            this.c = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public final class FixedLengthSource extends AbstractSource {
        public long e;
        public final /* synthetic */ Http1ExchangeCodec f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FixedLengthSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl, long j) {
            super(http1ExchangeCodec, httpUrl);
            httpUrl.getClass();
            this.f = http1ExchangeCodec;
            this.e = j;
            if (j == 0) {
                p(Headers.b);
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, defpackage.il9
        public final long D0(long j, xq0 xq0Var) throws IOException {
            xq0Var.getClass();
            if (j < 0) {
                gp.k(xv5.l(j, "byteCount < 0: "));
                return 0L;
            }
            if (this.c) {
                gp.j("closed");
                return 0L;
            }
            long j2 = this.e;
            if (j2 == 0) {
                return -1L;
            }
            long jD0 = super.D0(Math.min(j2, j), xq0Var);
            if (jD0 == -1) {
                this.f.b.f();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                p(Http1ExchangeCodec.f);
                throw protocolException;
            }
            long j3 = this.e - jD0;
            this.e = j3;
            if (j3 == 0) {
                p(Headers.b);
            }
            return jD0;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            boolean zF;
            if (this.c) {
                return;
            }
            if (this.e != 0) {
                TimeZone timeZone = _UtilJvmKt.a;
                TimeUnit.MILLISECONDS.getClass();
                try {
                    zF = _UtilJvmKt.f(this, 100);
                } catch (IOException unused) {
                    zF = false;
                }
                if (!zF) {
                    this.f.b.f();
                    p(Http1ExchangeCodec.f);
                }
            }
            this.c = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public final class KnownLengthSink implements ag9 {
        public final z84 a;
        public boolean b;

        public KnownLengthSink() {
            this.a = new z84(Http1ExchangeCodec.this.c.b().l());
        }

        @Override // defpackage.ag9, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.b) {
                return;
            }
            this.b = true;
            Headers headers = Http1ExchangeCodec.f;
            z84 z84Var = this.a;
            uua uuaVar = z84Var.e;
            z84Var.e = uua.d;
            uuaVar.a();
            uuaVar.b();
            Http1ExchangeCodec.this.d = 3;
        }

        @Override // defpackage.ag9, java.io.Flushable
        public final void flush() {
            if (this.b) {
                return;
            }
            Http1ExchangeCodec.this.c.b().flush();
        }

        @Override // defpackage.ag9
        public final uua l() {
            return this.a;
        }

        @Override // defpackage.ag9
        public final void y0(long j, xq0 xq0Var) {
            if (this.b) {
                gp.j("closed");
            } else {
                _UtilCommonKt.a(xq0Var.b, 0L, j);
                Http1ExchangeCodec.this.c.b().y0(j, xq0Var);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public final class UnknownLengthSource extends AbstractSource {
        public boolean e;

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, defpackage.il9
        public final long D0(long j, xq0 xq0Var) throws IOException {
            xq0Var.getClass();
            if (j < 0) {
                gp.k(xv5.l(j, "byteCount < 0: "));
                return 0L;
            }
            if (this.c) {
                gp.j("closed");
                return 0L;
            }
            if (this.e) {
                return -1L;
            }
            long jD0 = super.D0(j, xq0Var);
            if (jD0 != -1) {
                return jD0;
            }
            this.e = true;
            p(Headers.b);
            return -1L;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.c) {
                return;
            }
            if (!this.e) {
                p(Http1ExchangeCodec.f);
            }
            this.c = true;
        }
    }

    static {
        Headers headers = Headers.b;
        String[] strArr = (String[]) Arrays.copyOf(new String[]{"OkHttp-Response-Body", "Truncated"}, 2);
        if (strArr.length % 2 != 0) {
            gp.l("Expected alternating header names and values");
            return;
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        int length = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (strArr2[i2] == null) {
                gp.l("Headers cannot be null");
                return;
            }
            strArr2[i2] = bw9.B0(strArr[i2]).toString();
        }
        int iO = sw1.O(0, strArr2.length - 1, 2);
        if (iO >= 0) {
            while (true) {
                String str = strArr2[i];
                String str2 = strArr2[i + 1];
                _HeadersCommonKt.b(str);
                _HeadersCommonKt.c(str2, str);
                if (i == iO) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        f = new Headers(strArr2);
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, ExchangeCodec.Carrier carrier, BufferedSocket bufferedSocket) {
        bufferedSocket.getClass();
        this.a = okHttpClient;
        this.b = carrier;
        this.c = bufferedSocket;
        this.e = new HeadersReader(bufferedSocket.c());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void a() {
        this.c.b().flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void b(Request request) {
        request.getClass();
        Proxy.Type type = this.b.h().b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(request.b);
        sb.append(' ');
        HttpUrl httpUrl = request.a;
        if (lc5.Q(httpUrl.a, "https") || type != Proxy.Type.HTTP) {
            sb.append(RequestLine.a(httpUrl));
        } else {
            sb.append(httpUrl);
        }
        sb.append(" HTTP/1.1");
        m(request.c, sb.toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final boolean c() {
        return this.d == 6;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void cancel() {
        this.b.cancel();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final il9 d(Response response) {
        Request request = response.a;
        if (!HttpHeaders.a(response)) {
            return k(request.a, 0L);
        }
        String strA = response.f.a("Transfer-Encoding");
        if (strA == null) {
            strA = null;
        }
        if ("chunked".equalsIgnoreCase(strA)) {
            HttpUrl httpUrl = request.a;
            if (this.d == 4) {
                this.d = 5;
                return new ChunkedSource(this, httpUrl);
            }
            w58.q(this.d, "state: ");
            return null;
        }
        long jE = _UtilJvmKt.e(response);
        if (jE != -1) {
            return k(request.a, jE);
        }
        HttpUrl httpUrl2 = request.a;
        if (this.d != 4) {
            w58.q(this.d, "state: ");
            return null;
        }
        this.d = 5;
        this.b.f();
        httpUrl2.getClass();
        return new UnknownLengthSource(this, httpUrl2);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final Response.Builder e(boolean z) throws IOException {
        HeadersReader headersReader = this.e;
        int i = this.d;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            w58.q(this.d, "state: ");
            return null;
        }
        try {
            String strW = headersReader.a.W(headersReader.b);
            headersReader.b -= (long) strW.length();
            StatusLine statusLineA = StatusLine.Companion.a(strW);
            int i2 = statusLineA.b;
            Response.Builder builder = new Response.Builder();
            Protocol protocol = statusLineA.a;
            protocol.getClass();
            builder.b = protocol;
            builder.c = i2;
            String str = statusLineA.c;
            str.getClass();
            builder.d = str;
            Headers.Builder builder2 = new Headers.Builder();
            while (true) {
                String strW2 = headersReader.a.W(headersReader.b);
                headersReader.b -= (long) strW2.length();
                if (strW2.length() == 0) {
                    break;
                }
                int iW = bw9.W(strW2, ':', 1, 4);
                if (iW != -1) {
                    _HeadersCommonKt.a(builder2, strW2.substring(0, iW), strW2.substring(iW + 1));
                } else if (strW2.charAt(0) == ':') {
                    _HeadersCommonKt.a(builder2, "", strW2.substring(1));
                } else {
                    _HeadersCommonKt.a(builder2, "", strW2);
                }
            }
            builder.f = builder2.a().d();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.d = 3;
                return builder;
            }
            if (102 > i2 || i2 >= 200) {
                this.d = 4;
                return builder;
            }
            this.d = 3;
            return builder;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.b.h().a.h.f()), e);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void f() {
        this.c.b().flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final pk9 g() {
        return this.c;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final long h(Response response) {
        if (!HttpHeaders.a(response)) {
            return 0L;
        }
        String strA = response.f.a("Transfer-Encoding");
        if (strA == null) {
            strA = null;
        }
        if ("chunked".equalsIgnoreCase(strA)) {
            return -1L;
        }
        return _UtilJvmKt.e(response);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final ExchangeCodec.Carrier i() {
        return this.b;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final ag9 j(Request request, long j) throws ProtocolException {
        request.getClass();
        RequestBody requestBody = request.d;
        if (requestBody != null && requestBody.c()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(request.c.a("Transfer-Encoding"))) {
            if (this.d == 1) {
                this.d = 2;
                return new ChunkedSink();
            }
            w58.q(this.d, "state: ");
            return null;
        }
        if (j == -1) {
            gp.j("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.d == 1) {
            this.d = 2;
            return new KnownLengthSink();
        }
        w58.q(this.d, "state: ");
        return null;
    }

    public final il9 k(HttpUrl httpUrl, long j) {
        if (this.d == 4) {
            this.d = 5;
            return new FixedLengthSource(this, httpUrl, j);
        }
        w58.q(this.d, "state: ");
        return null;
    }

    public final void l(Response response) {
        long jE = _UtilJvmKt.e(response);
        if (jE == -1) {
            return;
        }
        il9 il9VarK = k(response.a.a, jE);
        _UtilJvmKt.f(il9VarK, Integer.MAX_VALUE);
        ((FixedLengthSource) il9VarK).close();
    }

    public final void m(Headers headers, String str) {
        headers.getClass();
        if (this.d != 0) {
            w58.q(this.d, "state: ");
            return;
        }
        BufferedSocket bufferedSocket = this.c;
        bufferedSocket.b().d0(str).d0("\r\n");
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            bufferedSocket.b().d0(headers.c(i)).d0(": ").d0(headers.e(i)).d0("\r\n");
        }
        bufferedSocket.b().d0("\r\n");
        this.d = 1;
    }
}
