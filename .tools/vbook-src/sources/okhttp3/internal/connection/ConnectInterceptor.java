package okhttp3.internal.connection;

import defpackage.uua;
import java.net.SocketException;
import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ConnectInterceptor implements Interceptor {
    public static final ConnectInterceptor a = new ConnectInterceptor();

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) throws SocketException {
        ExchangeCodec http1ExchangeCodec;
        RealCall realCall = realInterceptorChain.a;
        synchronized (realCall) {
            if (!realCall.C) {
                throw new IllegalStateException("released");
            }
            if (realCall.z || realCall.y || realCall.B || realCall.A) {
                throw new IllegalStateException("Check failed.");
            }
        }
        ExchangeFinder exchangeFinder = realCall.u;
        exchangeFinder.getClass();
        RealConnection realConnectionA = exchangeFinder.a();
        OkHttpClient okHttpClient = realCall.a;
        realConnectionA.getClass();
        okHttpClient.getClass();
        int i = realInterceptorChain.g;
        BufferedSocket bufferedSocket = realConnectionA.t;
        Http2Connection http2Connection = realConnectionA.u;
        if (http2Connection != null) {
            http1ExchangeCodec = new Http2ExchangeCodec(okHttpClient, realConnectionA, realInterceptorChain, http2Connection);
        } else {
            realConnectionA.e.setSoTimeout(i);
            uua uuaVarL = bufferedSocket.c().l();
            long j = i;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            uuaVarL.g(j, timeUnit);
            bufferedSocket.b().l().g(realInterceptorChain.h, timeUnit);
            http1ExchangeCodec = new Http1ExchangeCodec(okHttpClient, realConnectionA, bufferedSocket);
        }
        Exchange exchange = new Exchange(realCall, realCall.e, exchangeFinder, http1ExchangeCodec);
        realCall.x = exchange;
        realCall.E = exchange;
        synchronized (realCall) {
            realCall.y = true;
            realCall.z = true;
        }
        if (!realCall.D) {
            return RealInterceptorChain.a(realInterceptorChain, 0, exchange, null, 61).b(realInterceptorChain.e);
        }
        sy3.m("Canceled");
        return null;
    }
}
