package okhttp3.internal.http;

import defpackage.ie8;
import defpackage.ni4;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class BridgeInterceptor implements Interceptor {
    public final CookieJar a;

    public BridgeInterceptor(CookieJar cookieJar) {
        cookieJar.getClass();
        this.a = cookieJar;
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) {
        ResponseBody responseBody;
        Request request = realInterceptorChain.e;
        Request.Builder builderA = request.a();
        HttpUrl httpUrl = request.a;
        Headers headers = request.c;
        RequestBody requestBody = request.d;
        if (requestBody != null) {
            MediaType mediaTypeB = requestBody.b();
            if (mediaTypeB != null) {
                builderA.a("Content-Type", mediaTypeB.a);
            }
            long jA = requestBody.a();
            if (jA != -1) {
                builderA.a("Content-Length", String.valueOf(jA));
                builderA.c.b("Transfer-Encoding");
            } else {
                builderA.a("Transfer-Encoding", "chunked");
                builderA.c.b("Content-Length");
            }
        }
        boolean z = false;
        if (headers.a("Host") == null) {
            builderA.a("Host", _UtilJvmKt.h(httpUrl, false));
        }
        if (headers.a("Connection") == null) {
            builderA.a("Connection", "Keep-Alive");
        }
        if (headers.a("Accept-Encoding") == null && headers.a("Range") == null) {
            builderA.a("Accept-Encoding", "gzip");
            z = true;
        }
        CookieJar cookieJar = this.a;
        cookieJar.b(httpUrl);
        if (headers.a("User-Agent") == null) {
            builderA.a("User-Agent", "okhttp/5.3.2");
        }
        Request request2 = new Request(builderA);
        Response responseB = realInterceptorChain.b(request2);
        Headers headers2 = responseB.f;
        HttpHeaders.d(cookieJar, request2.a, headers2);
        Response.Builder builderP = responseB.p();
        builderP.a = request2;
        if (z) {
            String strA = headers2.a("Content-Encoding");
            if (strA == null) {
                strA = null;
            }
            if ("gzip".equalsIgnoreCase(strA) && HttpHeaders.a(responseB) && (responseBody = responseB.s) != null) {
                ni4 ni4Var = new ni4(responseBody.I0());
                Headers.Builder builderD = headers2.d();
                builderD.b("Content-Encoding");
                builderD.b("Content-Length");
                builderP.f = builderD.a().d();
                String strA2 = headers2.a("Content-Type");
                builderP.g = new RealResponseBody(strA2 != null ? strA2 : null, -1L, new ie8(ni4Var));
            }
        }
        return builderP.a();
    }
}
