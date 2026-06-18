package okhttp3;

import defpackage.fc1;
import defpackage.k27;
import defpackage.lc5;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.WebSocket;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class OkHttpClient implements Call.Factory, WebSocket.Factory {
    public static final List D = _UtilJvmKt.j(new Protocol[]{Protocol.HTTP_2, Protocol.HTTP_1_1});
    public static final List E = _UtilJvmKt.j(new ConnectionSpec[]{ConnectionSpec.g, ConnectionSpec.h});
    public final RouteDatabase A;
    public final TaskRunner B;
    public final ConnectionPool C;
    public final Dispatcher a;
    public final List b;
    public final List c;
    public final so9 d;
    public final boolean e;
    public final boolean f;
    public final Authenticator g;
    public final boolean h;
    public final boolean i;
    public final CookieJar j;
    public final Dns k;
    public final ProxySelector l;
    public final Authenticator m;
    public final SocketFactory n;
    public final SSLSocketFactory o;
    public final X509TrustManager p;
    public final List q;
    public final List r;
    public final OkHostnameVerifier s;
    public final CertificatePinner t;
    public final CertificateChainCleaner u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final long z;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Builder {
        public long A;
        public RouteDatabase B;
        public TaskRunner C;
        public ConnectionPool b;
        public so9 e;
        public boolean f;
        public boolean g;
        public Authenticator h;
        public boolean i;
        public boolean j;
        public CookieJar k;
        public Dns l;
        public ProxySelector m;
        public Authenticator n;
        public SocketFactory o;
        public SSLSocketFactory p;
        public X509TrustManager q;
        public List r;
        public List s;
        public OkHostnameVerifier t;
        public CertificatePinner u;
        public CertificateChainCleaner v;
        public int w;
        public int x;
        public int y;
        public int z;
        public Dispatcher a = new Dispatcher();
        public final ArrayList c = new ArrayList();
        public final ArrayList d = new ArrayList();

        public Builder() {
            TimeZone timeZone = _UtilJvmKt.a;
            this.e = new so9(26);
            this.f = true;
            this.g = true;
            Authenticator authenticator = Authenticator.a;
            this.h = authenticator;
            this.i = true;
            this.j = true;
            this.k = CookieJar.a;
            this.l = Dns.a;
            this.n = authenticator;
            SocketFactory socketFactory = SocketFactory.getDefault();
            socketFactory.getClass();
            this.o = socketFactory;
            this.r = OkHttpClient.E;
            this.s = OkHttpClient.D;
            this.t = OkHostnameVerifier.a;
            this.u = CertificatePinner.c;
            this.w = 10000;
            this.x = 10000;
            this.y = 10000;
            this.z = 60000;
            this.A = 1024L;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
    }

    public OkHttpClient(Builder builder) throws NoSuchAlgorithmException, KeyStoreException {
        this.a = builder.a;
        this.b = _UtilJvmKt.i(builder.c);
        this.c = _UtilJvmKt.i(builder.d);
        this.d = builder.e;
        this.e = builder.f;
        this.f = builder.g;
        this.g = builder.h;
        this.h = builder.i;
        this.i = builder.j;
        this.j = builder.k;
        this.k = builder.l;
        ProxySelector proxySelector = builder.m;
        if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
            proxySelector = NullProxySelector.a;
        }
        this.l = proxySelector;
        this.m = builder.n;
        this.n = builder.o;
        List list = builder.r;
        this.q = list;
        this.r = builder.s;
        this.s = builder.t;
        this.v = builder.w;
        this.w = builder.x;
        this.x = builder.y;
        this.y = builder.z;
        this.z = builder.A;
        RouteDatabase routeDatabase = builder.B;
        this.A = routeDatabase == null ? new RouteDatabase() : routeDatabase;
        TaskRunner taskRunner = builder.C;
        this.B = taskRunner == null ? TaskRunner.x : taskRunner;
        ConnectionPool connectionPool = builder.b;
        if (connectionPool == null) {
            connectionPool = new ConnectionPool();
            builder.b = connectionPool;
        }
        this.C = connectionPool;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).a) {
                    SSLSocketFactory sSLSocketFactory = builder.p;
                    if (sSLSocketFactory == null) {
                        Platform platform = Platform.a;
                        Platform.a.getClass();
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init((KeyStore) null);
                        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                        trustManagers.getClass();
                        if (trustManagers.length == 1) {
                            TrustManager trustManager = trustManagers[0];
                            if (trustManager instanceof X509TrustManager) {
                                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                                this.p = x509TrustManager;
                                Platform platform2 = Platform.a;
                                platform2.getClass();
                                try {
                                    SSLContext sSLContextL = platform2.l();
                                    sSLContextL.init(null, new TrustManager[]{x509TrustManager}, null);
                                    SSLSocketFactory socketFactory = sSLContextL.getSocketFactory();
                                    socketFactory.getClass();
                                    this.o = socketFactory;
                                    CertificateChainCleaner certificateChainCleanerC = Platform.a.c(x509TrustManager);
                                    this.u = certificateChainCleanerC;
                                    CertificatePinner certificatePinner = builder.u;
                                    certificatePinner.getClass();
                                    this.t = lc5.Q(certificatePinner.b, certificateChainCleanerC) ? certificatePinner : new CertificatePinner(certificatePinner.a, certificateChainCleanerC);
                                } catch (GeneralSecurityException e) {
                                    throw new AssertionError("No System TLS: " + e, e);
                                }
                            }
                        }
                        String string = Arrays.toString(trustManagers);
                        string.getClass();
                        k27.g("Unexpected default trust managers: ".concat(string));
                        throw null;
                    }
                    this.o = sSLSocketFactory;
                    CertificateChainCleaner certificateChainCleaner = builder.v;
                    certificateChainCleaner.getClass();
                    this.u = certificateChainCleaner;
                    X509TrustManager x509TrustManager2 = builder.q;
                    x509TrustManager2.getClass();
                    this.p = x509TrustManager2;
                    CertificatePinner certificatePinner2 = builder.u;
                    certificatePinner2.getClass();
                    this.t = lc5.Q(certificatePinner2.b, certificateChainCleaner) ? certificatePinner2 : new CertificatePinner(certificatePinner2.a, certificateChainCleaner);
                }
            }
            this.o = null;
            this.u = null;
            this.p = null;
            this.t = CertificatePinner.c;
        } else {
            this.o = null;
            this.u = null;
            this.p = null;
            this.t = CertificatePinner.c;
        }
        X509TrustManager x509TrustManager3 = this.p;
        CertificateChainCleaner certificateChainCleaner2 = this.u;
        SSLSocketFactory sSLSocketFactory2 = this.o;
        List list2 = this.c;
        List list3 = this.b;
        list3.getClass();
        if (list3.contains(null)) {
            k27.h(list3, "Null interceptor: ");
            throw null;
        }
        list2.getClass();
        if (list2.contains(null)) {
            k27.h(list2, "Null network interceptor: ");
            throw null;
        }
        List list4 = this.q;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((ConnectionSpec) it2.next()).a) {
                    if (sSLSocketFactory2 == null) {
                        gp.j("sslSocketFactory == null");
                        throw null;
                    }
                    if (certificateChainCleaner2 == null) {
                        gp.j("certificateChainCleaner == null");
                        throw null;
                    }
                    if (x509TrustManager3 != null) {
                        return;
                    }
                    gp.j("x509TrustManager == null");
                    throw null;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            gp.j("Check failed.");
            throw null;
        }
        if (certificateChainCleaner2 != null) {
            gp.j("Check failed.");
            throw null;
        }
        if (x509TrustManager3 != null) {
            gp.j("Check failed.");
            throw null;
        }
        if (lc5.Q(this.t, CertificatePinner.c)) {
            return;
        }
        gp.j("Check failed.");
        throw null;
    }

    @Override // okhttp3.WebSocket.Factory
    public final RealWebSocket a(Request request, WebSocketListener webSocketListener) {
        request.getClass();
        webSocketListener.getClass();
        final RealWebSocket realWebSocket = new RealWebSocket(this.B, request, webSocketListener, new Random(), 0L, this.z, this.y);
        if (request.c.a("Sec-WebSocket-Extensions") != null) {
            RealWebSocket.j(realWebSocket, new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null, 6);
            return realWebSocket;
        }
        Builder builderB = b();
        TimeZone timeZone = _UtilJvmKt.a;
        builderB.e = new so9(26);
        List list = RealWebSocket.J;
        list.getClass();
        ArrayList arrayList = new ArrayList(list);
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        if (!arrayList.contains(protocol) && !arrayList.contains(Protocol.HTTP_1_1)) {
            k27.k(arrayList, "protocols must contain h2_prior_knowledge or http/1.1: ");
            return null;
        }
        if (arrayList.contains(protocol) && arrayList.size() > 1) {
            k27.k(arrayList, "protocols containing h2_prior_knowledge cannot use other protocols: ");
            return null;
        }
        if (arrayList.contains(Protocol.HTTP_1_0)) {
            k27.k(arrayList, "protocols must not contain http/1.0: ");
            return null;
        }
        if (arrayList.contains(null)) {
            gp.l("protocols must not contain null");
            return null;
        }
        arrayList.remove(Protocol.SPDY_3);
        if (!arrayList.equals(builderB.s)) {
            builderB.B = null;
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        listUnmodifiableList.getClass();
        builderB.s = listUnmodifiableList;
        OkHttpClient okHttpClient = new OkHttpClient(builderB);
        Request.Builder builderA = request.a();
        builderA.a("Upgrade", "websocket");
        builderA.a("Connection", "Upgrade");
        builderA.a("Sec-WebSocket-Key", realWebSocket.s);
        builderA.a("Sec-WebSocket-Version", "13");
        builderA.a("Sec-WebSocket-Extensions", "permessage-deflate");
        final Request request2 = new Request(builderA);
        RealCall realCall = new RealCall(okHttpClient, request2, true);
        realWebSocket.t = realCall;
        realCall.e(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket$connect$1
            /* JADX WARN: Removed duplicated region for block: B:39:0x00e6 A[PHI: r11 r13 r15
  0x00e6: PHI (r11v6 java.lang.Integer) = (r11v5 java.lang.Integer), (r11v10 java.lang.Integer) binds: [B:54:0x0111, B:36:0x00da] A[DONT_GENERATE, DONT_INLINE]
  0x00e6: PHI (r13v9 java.lang.Integer) = (r13v7 java.lang.Integer), (r13v5 java.lang.Integer) binds: [B:54:0x0111, B:36:0x00da] A[DONT_GENERATE, DONT_INLINE]
  0x00e6: PHI (r15v17 boolean) = (r15v11 boolean), (r15v20 boolean) binds: [B:54:0x0111, B:36:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // okhttp3.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void c(okhttp3.Call r21, okhttp3.Response r22) {
                /*
                    Method dump skipped, instruction units count: 586
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket$connect$1.c(okhttp3.Call, okhttp3.Response):void");
            }

            @Override // okhttp3.Callback
            public final void d(Call call, IOException iOException) {
                RealWebSocket.j(realWebSocket, iOException, null, 6);
            }
        });
        return realWebSocket;
    }

    public final Builder b() {
        Builder builder = new Builder();
        builder.a = this.a;
        builder.b = this.C;
        fc1.p0(builder.c, this.b);
        fc1.p0(builder.d, this.c);
        builder.e = this.d;
        builder.f = this.e;
        builder.g = this.f;
        builder.h = this.g;
        builder.i = this.h;
        builder.j = this.i;
        builder.k = this.j;
        builder.l = this.k;
        builder.m = this.l;
        builder.n = this.m;
        builder.o = this.n;
        builder.p = this.o;
        builder.q = this.p;
        builder.r = this.q;
        builder.s = this.r;
        builder.t = this.s;
        builder.u = this.t;
        builder.v = this.u;
        builder.w = this.v;
        builder.x = this.w;
        builder.y = this.x;
        builder.z = this.y;
        builder.A = this.z;
        builder.B = this.A;
        builder.C = this.B;
        return builder;
    }
}
