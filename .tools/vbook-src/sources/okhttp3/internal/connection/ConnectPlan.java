package okhttp3.internal.connection;

import defpackage.av0;
import defpackage.cw9;
import defpackage.dx1;
import defpackage.fc1;
import defpackage.iw9;
import defpackage.lc5;
import defpackage.ma0;
import defpackage.q27;
import defpackage.ra1;
import defpackage.s16;
import defpackage.uua;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.CipherSuite;
import okhttp3.ConnectionSpec;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RoutePlanner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ConnectPlan implements RoutePlanner.Plan, ExchangeCodec.Carrier {
    public final boolean A;
    public volatile boolean B;
    public Socket C;
    public Socket D;
    public Handshake E;
    public Protocol F;
    public BufferedSocketKt$asBufferedSocket$1 G;
    public RealConnection H;
    public final TaskRunner a;
    public final RealConnectionPool b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean s;
    public final RealCall t;
    public final RealRoutePlanner u;
    public final Route v;
    public final List w;
    public final int x;
    public final Request y;
    public final int z;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public ConnectPlan(TaskRunner taskRunner, RealConnectionPool realConnectionPool, int i, int i2, int i3, int i4, boolean z, RealCall realCall, RealRoutePlanner realRoutePlanner, Route route, List list, int i5, Request request, int i6, boolean z2) {
        taskRunner.getClass();
        realConnectionPool.getClass();
        route.getClass();
        this.a = taskRunner;
        this.b = realConnectionPool;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.s = z;
        this.t = realCall;
        this.u = realRoutePlanner;
        this.v = route;
        this.w = list;
        this.x = i5;
        this.y = request;
        this.z = i6;
        this.A = z2;
    }

    public static ConnectPlan l(ConnectPlan connectPlan, int i, Request request, int i2, boolean z, int i3) {
        return new ConnectPlan(connectPlan.a, connectPlan.b, connectPlan.c, connectPlan.d, connectPlan.e, connectPlan.f, connectPlan.s, connectPlan.t, connectPlan.u, connectPlan.v, connectPlan.w, (i3 & 1) != 0 ? connectPlan.x : i, (i3 & 2) != 0 ? connectPlan.y : request, (i3 & 4) != 0 ? connectPlan.z : i2, (i3 & 8) != 0 ? connectPlan.A : z);
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final boolean a() {
        return this.F != null;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.Plan b() {
        return new ConnectPlan(this.a, this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A);
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan, okhttp3.internal.http.ExchangeCodec.Carrier
    public final void cancel() {
        this.B = true;
        Socket socket = this.C;
        if (socket != null) {
            _UtilJvmKt.c(socket);
        }
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RealConnection d() {
        RouteDatabase routeDatabase = this.t.a.A;
        Route route = this.v;
        synchronized (routeDatabase) {
            route.getClass();
            routeDatabase.a.remove(route);
        }
        RealConnection realConnection = this.H;
        realConnection.getClass();
        this.v.getClass();
        ReusePlan reusePlanF = this.u.f(this, this.w);
        if (reusePlanF != null) {
            return reusePlanF.a;
        }
        synchronized (realConnection) {
            RealConnectionPool realConnectionPool = this.b;
            realConnectionPool.getClass();
            TimeZone timeZone = _UtilJvmKt.a;
            realConnectionPool.d.add(realConnection);
            realConnectionPool.b.d(realConnectionPool.c, 0L);
            this.t.b(realConnection);
        }
        RealCall realCall = this.t;
        realCall.e.j(realCall, realConnection);
        return realConnection;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.ConnectResult e() {
        Socket socket;
        Socket socket2;
        RealConnectionPool realConnectionPool = this.b;
        Route route = this.v;
        RealCall realCall = this.t;
        CopyOnWriteArrayList copyOnWriteArrayList = realCall.F;
        if (this.C != null) {
            gp.j("TCP already connected");
            return null;
        }
        copyOnWriteArrayList.add(this);
        boolean z = false;
        try {
            try {
                realCall.e.i(realCall, route.c, route.b);
                realConnectionPool.getClass();
                i();
                z = true;
                RoutePlanner.ConnectResult connectResult = new RoutePlanner.ConnectResult(this, null, null, 6);
                copyOnWriteArrayList.remove(this);
                return connectResult;
            } catch (IOException e) {
                Address address = route.a;
                if (route.b.type() != Proxy.Type.DIRECT) {
                    Address address2 = route.a;
                    address2.g.connectFailed(address2.h.g(), route.b.address(), e);
                }
                realCall.e.h(realCall, route.c, route.b, e);
                realConnectionPool.getClass();
                RoutePlanner.ConnectResult connectResult2 = new RoutePlanner.ConnectResult(this, null, e, 2);
                copyOnWriteArrayList.remove(this);
                if (!z && (socket = this.C) != null) {
                    _UtilJvmKt.c(socket);
                }
                return connectResult2;
            }
        } catch (Throwable th) {
            copyOnWriteArrayList.remove(this);
            if (!z && (socket2 = this.C) != null) {
                _UtilJvmKt.c(socket2);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054 A[Catch: all -> 0x0037, IOException -> 0x003a, TRY_ENTER, TryCatch #0 {IOException -> 0x003a, blocks: (B:9:0x002a, B:11:0x0032, B:27:0x0054, B:29:0x0058, B:31:0x0062, B:33:0x0066, B:35:0x0070, B:40:0x00a4, B:41:0x00a7, B:42:0x00a8, B:43:0x00af, B:44:0x00b0, B:45:0x00b3), top: B:124:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4 A[Catch: all -> 0x0037, IOException -> 0x0127, TRY_ENTER, TryCatch #1 {IOException -> 0x0127, blocks: (B:7:0x0026, B:24:0x004d, B:46:0x00b4, B:50:0x00c3, B:49:0x00c1), top: B:125:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e8 A[Catch: all -> 0x0037, IOException -> 0x0112, TRY_LEAVE, TryCatch #5 {all -> 0x0037, blocks: (B:7:0x0026, B:9:0x002a, B:11:0x0032, B:24:0x004d, B:27:0x0054, B:29:0x0058, B:31:0x0062, B:33:0x0066, B:35:0x0070, B:36:0x0094, B:52:0x00c7, B:54:0x00cc, B:56:0x00cf, B:58:0x00dd, B:60:0x00e8, B:62:0x00ed, B:85:0x012a, B:87:0x0136, B:90:0x013b, B:93:0x0140, B:95:0x0144, B:98:0x014d, B:101:0x0152, B:105:0x0159, B:75:0x0118, B:76:0x011d, B:40:0x00a4, B:41:0x00a7, B:42:0x00a8, B:43:0x00af, B:44:0x00b0, B:45:0x00b3, B:46:0x00b4, B:50:0x00c3, B:49:0x00c1), top: B:125:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0116  */
    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.internal.connection.RoutePlanner.ConnectResult g() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.ConnectPlan.g():okhttp3.internal.connection.RoutePlanner$ConnectResult");
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final Route h() {
        return this.v;
    }

    public final void i() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = this.v.b.type();
        int i = type == null ? -1 : WhenMappings.a[type.ordinal()];
        if (i == 1 || i == 2) {
            socketCreateSocket = this.v.a.b.createSocket();
            socketCreateSocket.getClass();
        } else {
            socketCreateSocket = new Socket(this.v.b);
        }
        this.C = socketCreateSocket;
        if (this.B) {
            sy3.m("canceled");
            return;
        }
        socketCreateSocket.setSoTimeout(this.f);
        try {
            Platform platform = Platform.a;
            Platform.a.f(socketCreateSocket, this.v.c, this.e);
            try {
                this.G = new BufferedSocketKt$asBufferedSocket$1(new s16(socketCreateSocket));
            } catch (NullPointerException e) {
                if (lc5.Q(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.v.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void j(SSLSocket sSLSocket, ConnectionSpec connectionSpec) {
        Protocol protocolA;
        Address address = this.v.a;
        try {
            if (connectionSpec.b) {
                Platform platform = Platform.a;
                Platform.a.e(sSLSocket, address.h.d, address.i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            session.getClass();
            Handshake handshakeA = Handshake.Companion.a(session);
            HostnameVerifier hostnameVerifier = address.d;
            hostnameVerifier.getClass();
            if (hostnameVerifier.verify(address.h.d, session)) {
                CertificatePinner certificatePinner = address.e;
                certificatePinner.getClass();
                this.E = new Handshake(handshakeA.a, handshakeA.b, handshakeA.c, new ma0(5, certificatePinner, handshakeA, address));
                address.h.d.getClass();
                Iterator it = certificatePinner.a.iterator();
                String strG = null;
                if (it.hasNext()) {
                    ((CertificatePinner.Pin) it.next()).getClass();
                    iw9.K(null, "**.", false);
                    throw null;
                }
                if (connectionSpec.b) {
                    Platform platform2 = Platform.a;
                    strG = Platform.a.g(sSLSocket);
                }
                this.D = sSLSocket;
                this.G = new BufferedSocketKt$asBufferedSocket$1(new s16(sSLSocket));
                if (strG != null) {
                    Protocol.b.getClass();
                    protocolA = Protocol.Companion.a(strG);
                } else {
                    protocolA = Protocol.HTTP_1_1;
                }
                this.F = protocolA;
                Platform platform3 = Platform.a;
                Platform.a.getClass();
                return;
            }
            List listA = handshakeA.a();
            if (listA.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + address.h.d + " not verified (no certificates)");
            }
            Object obj = listA.get(0);
            obj.getClass();
            X509Certificate x509Certificate = (X509Certificate) obj;
            StringBuilder sb = new StringBuilder("\n            |Hostname ");
            sb.append(address.h.d);
            sb.append(" not verified:\n            |    certificate: ");
            CertificatePinner certificatePinner2 = CertificatePinner.c;
            StringBuilder sb2 = new StringBuilder("sha256/");
            av0 av0Var = av0.d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            encoded.getClass();
            sb2.append(ra1.x(encoded).c("SHA-256").a());
            sb.append(sb2.toString());
            sb.append("\n            |    DN: ");
            sb.append(x509Certificate.getSubjectDN().getName());
            sb.append("\n            |    subjectAltNames: ");
            sb.append(fc1.I0(OkHostnameVerifier.a(x509Certificate, 7), OkHostnameVerifier.a(x509Certificate, 2)));
            sb.append("\n            ");
            throw new SSLPeerUnverifiedException(cw9.u(sb.toString()));
        } catch (Throwable th) {
            Platform platform4 = Platform.a;
            Platform.a.getClass();
            _UtilJvmKt.c(sSLSocket);
            throw th;
        }
    }

    public final RoutePlanner.ConnectResult k() throws IOException {
        Request request;
        Request request2 = this.y;
        request2.getClass();
        Route route = this.v;
        Address address = route.a;
        Proxy proxy = route.b;
        InetSocketAddress inetSocketAddress = route.c;
        String str = "CONNECT " + _UtilJvmKt.h(address.h, true) + " HTTP/1.1";
        while (true) {
            BufferedSocketKt$asBufferedSocket$1 bufferedSocketKt$asBufferedSocket$1 = this.G;
            if (bufferedSocketKt$asBufferedSocket$1 == null) {
                lc5.i0("socket");
                throw null;
            }
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, bufferedSocketKt$asBufferedSocket$1);
            BufferedSocketKt$asBufferedSocket$1 bufferedSocketKt$asBufferedSocket$12 = this.G;
            if (bufferedSocketKt$asBufferedSocket$12 == null) {
                lc5.i0("socket");
                throw null;
            }
            uua uuaVarL = bufferedSocketKt$asBufferedSocket$12.b.a.l();
            long j = this.c;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            uuaVarL.g(j, timeUnit);
            BufferedSocketKt$asBufferedSocket$1 bufferedSocketKt$asBufferedSocket$13 = this.G;
            if (bufferedSocketKt$asBufferedSocket$13 == null) {
                lc5.i0("socket");
                throw null;
            }
            bufferedSocketKt$asBufferedSocket$13.c.a.l().g(this.d, timeUnit);
            http1ExchangeCodec.m(request2.c, str);
            http1ExchangeCodec.a();
            Response.Builder builderE = http1ExchangeCodec.e(false);
            builderE.getClass();
            builderE.a = request2;
            Response responseA = builderE.a();
            int i = responseA.d;
            http1ExchangeCodec.l(responseA);
            if (i == 200) {
                request = null;
                break;
            }
            if (i != 407) {
                sy3.m(dx1.f(i, "Unexpected response code for CONNECT: "));
                return null;
            }
            Request requestA = route.a.f.a(route, responseA);
            if (requestA == null) {
                sy3.m("Failed to authenticate with proxy");
                return null;
            }
            String strA = responseA.f.a("Connection");
            if (strA == null) {
                strA = null;
            }
            if ("close".equalsIgnoreCase(strA)) {
                request = requestA;
                break;
            }
            request2 = requestA;
        }
        if (request == null) {
            return new RoutePlanner.ConnectResult(this, null, null, 6);
        }
        Socket socket = this.C;
        if (socket != null) {
            _UtilJvmKt.c(socket);
        }
        int i2 = this.x + 1;
        RealCall realCall = this.t;
        if (i2 < 21) {
            realCall.e.g(realCall, inetSocketAddress, proxy);
            return new RoutePlanner.ConnectResult(this, l(this, i2, request, 0, false, 12), null, 4);
        }
        ProtocolException protocolException = new ProtocolException("Too many tunnel connections attempted: 21");
        realCall.e.h(realCall, inetSocketAddress, proxy, protocolException);
        this.b.getClass();
        return new RoutePlanner.ConnectResult(this, null, protocolException, 2);
    }

    public final ConnectPlan m(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        list.getClass();
        int i = this.z;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            ConnectionSpec connectionSpec = (ConnectionSpec) list.get(i2);
            connectionSpec.getClass();
            if (connectionSpec.a && (((strArr = connectionSpec.d) == null || _UtilCommonKt.f(strArr, sSLSocket.getEnabledProtocols(), q27.b)) && ((strArr2 = connectionSpec.c) == null || _UtilCommonKt.f(strArr2, sSLSocket.getEnabledCipherSuites(), CipherSuite.c)))) {
                return l(this, 0, null, i2, i != -1, 3);
            }
        }
        return null;
    }

    public final ConnectPlan n(List list, SSLSocket sSLSocket) throws UnknownServiceException {
        list.getClass();
        if (this.z != -1) {
            return this;
        }
        ConnectPlan connectPlanM = m(list, sSLSocket);
        if (connectPlanM != null) {
            return connectPlanM;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.A);
        sb.append(", modes=");
        sb.append(list);
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        enabledProtocols.getClass();
        String string = Arrays.toString(enabledProtocols);
        string.getClass();
        sb.append(", supported protocols=");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void f() {
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void c(RealCall realCall, IOException iOException) {
    }
}
