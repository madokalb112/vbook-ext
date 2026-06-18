package okhttp3.internal.http;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.ExchangeFinder;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RoutePlanner;
import okhttp3.internal.http2.ConnectionShutdownException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {
    public final OkHttpClient a;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
    }

    public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient) {
        okHttpClient.getClass();
        this.a = okHttpClient;
    }

    public static int d(Response response, int i) {
        String strA = response.f.a("Retry-After");
        if (strA == null) {
            strA = null;
        }
        if (strA == null) {
            return i;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        patternCompile.getClass();
        if (!patternCompile.matcher(strA).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strA);
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f2, code lost:
    
        if (r3 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f6, code lost:
    
        if (r3.e == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fb, code lost:
    
        if (r14.w != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fd, code lost:
    
        r14.w = true;
        r14.f.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010c, code lost:
    
        throw new java.lang.IllegalStateException("Check failed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0113, code lost:
    
        r14.e.p(r14, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0118, code lost:
    
        r14.f(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x011d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011e, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01bc, code lost:
    
        throw new java.lang.IllegalStateException("Check failed.");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.Response a(okhttp3.internal.http.RealInterceptorChain r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.RetryAndFollowUpInterceptor.a(okhttp3.internal.http.RealInterceptorChain):okhttp3.Response");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.Request b(okhttp3.Response r11, okhttp3.internal.connection.Exchange r12) throws java.net.ProtocolException {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.RetryAndFollowUpInterceptor.b(okhttp3.Response, okhttp3.internal.connection.Exchange):okhttp3.Request");
    }

    public final boolean c(IOException iOException, RealCall realCall, Request request) {
        RequestBody requestBody;
        boolean z = iOException instanceof ConnectionShutdownException;
        if (!this.a.e) {
            return false;
        }
        if ((!z && (((requestBody = request.d) != null && requestBody.d()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        Exchange exchange = realCall.E;
        if (exchange == null || !exchange.f) {
            return false;
        }
        ExchangeFinder exchangeFinder = realCall.u;
        exchangeFinder.getClass();
        RoutePlanner routePlannerB = exchangeFinder.b();
        Exchange exchange2 = realCall.E;
        return routePlannerB.a(exchange2 != null ? exchange2.c() : null);
    }
}
