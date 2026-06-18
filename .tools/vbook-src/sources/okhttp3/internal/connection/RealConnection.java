package okhttp3.internal.connection;

import defpackage.mr0;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.Address;
import okhttp3.Connection;
import okhttp3.Handshake;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Route;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.FlowControlListener;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Http2Writer;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection, ExchangeCodec.Carrier, Lockable {
    public int A;
    public final ArrayList B;
    public long C;
    public final TaskRunner b;
    public final Route c;
    public final Socket d;
    public final Socket e;
    public final Handshake f;
    public final Protocol s;
    public final BufferedSocket t;
    public Http2Connection u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public int z;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
    }

    public RealConnection(TaskRunner taskRunner, RealConnectionPool realConnectionPool, Route route, Socket socket, Socket socket2, Handshake handshake, Protocol protocol, BufferedSocketKt$asBufferedSocket$1 bufferedSocketKt$asBufferedSocket$1) {
        taskRunner.getClass();
        realConnectionPool.getClass();
        route.getClass();
        socket.getClass();
        socket2.getClass();
        protocol.getClass();
        bufferedSocketKt$asBufferedSocket$1.getClass();
        this.b = taskRunner;
        this.c = route;
        this.d = socket;
        this.e = socket2;
        this.f = handshake;
        this.s = protocol;
        this.t = bufferedSocketKt$asBufferedSocket$1;
        this.A = 1;
        this.B = new ArrayList();
        this.C = Long.MAX_VALUE;
    }

    public static void d(OkHttpClient okHttpClient, Route route, IOException iOException) {
        okHttpClient.getClass();
        route.getClass();
        iOException.getClass();
        if (route.b.type() != Proxy.Type.DIRECT) {
            Address address = route.a;
            address.g.connectFailed(address.h.g(), route.b.address(), iOException);
        }
        RouteDatabase routeDatabase = okHttpClient.A;
        synchronized (routeDatabase) {
            routeDatabase.a.add(route);
        }
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final void a(Http2Connection http2Connection, Settings settings) {
        settings.getClass();
        synchronized (this) {
            this.A = (settings.a & 8) != 0 ? settings.b[3] : Integer.MAX_VALUE;
        }
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final void b(Http2Stream http2Stream) {
        http2Stream.e(ErrorCode.REFUSED_STREAM, null);
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void c(RealCall realCall, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof StreamResetException)) {
                    if (!(this.u != null) || (iOException instanceof ConnectionShutdownException)) {
                        this.v = true;
                        if (this.y == 0) {
                            if (iOException != null) {
                                d(realCall.a, this.c, iOException);
                            }
                            this.x++;
                        }
                    }
                } else if (((StreamResetException) iOException).a == ErrorCode.REFUSED_STREAM) {
                    int i = this.z + 1;
                    this.z = i;
                    if (i > 1) {
                        this.v = true;
                        this.x++;
                    }
                } else if (((StreamResetException) iOException).a != ErrorCode.CANCEL || !realCall.D) {
                    this.v = true;
                    this.x++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void cancel() {
        _UtilJvmKt.c(this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(okhttp3.Address r9, java.util.List r10) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.e(okhttp3.Address, java.util.List):boolean");
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final void f() {
        synchronized (this) {
            this.v = true;
        }
    }

    public final boolean g(boolean z) {
        long j;
        TimeZone timeZone = _UtilJvmKt.a;
        long jNanoTime = System.nanoTime();
        if (this.d.isClosed() || this.e.isClosed() || this.e.isInputShutdown() || this.e.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.u;
        if (http2Connection != null) {
            synchronized (http2Connection) {
                if (http2Connection.f) {
                    return false;
                }
                if (http2Connection.z < http2Connection.y) {
                    if (jNanoTime >= http2Connection.A) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.C;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.e;
        mr0 mr0VarC = this.t.c();
        socket.getClass();
        mr0VarC.getClass();
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !mr0VarC.k();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public final Route h() {
        return this.c;
    }

    public final void i() throws SocketException {
        this.C = System.nanoTime();
        Protocol protocol = this.s;
        if (protocol == Protocol.HTTP_2 || protocol == Protocol.H2_PRIOR_KNOWLEDGE) {
            this.e.setSoTimeout(0);
            Object obj = ConnectionListener.a;
            FlowControlListener flowControlListener = obj instanceof FlowControlListener ? (FlowControlListener) obj : null;
            if (flowControlListener == null) {
                flowControlListener = FlowControlListener.None.a;
            }
            Http2Connection.Builder builder = new Http2Connection.Builder(this.b);
            BufferedSocket bufferedSocket = this.t;
            String str = this.c.a.h.d;
            bufferedSocket.getClass();
            str.getClass();
            builder.b = bufferedSocket;
            builder.c = _UtilJvmKt.b + ' ' + str;
            builder.d = this;
            builder.f = flowControlListener;
            Http2Connection http2Connection = new Http2Connection(builder);
            this.u = http2Connection;
            Settings settings = Http2Connection.L;
            this.A = (settings.a & 8) != 0 ? settings.b[3] : Integer.MAX_VALUE;
            Http2Writer http2Writer = http2Connection.I;
            synchronized (http2Writer) {
                try {
                    if (http2Writer.d) {
                        throw new IOException("closed");
                    }
                    Logger logger = Http2Writer.f;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(_UtilJvmKt.d(">> CONNECTION " + Http2.a.e(), new Object[0]));
                    }
                    http2Writer.a.Q0(Http2.a);
                    http2Writer.a.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Http2Writer http2Writer2 = http2Connection.I;
            Settings settings2 = http2Connection.C;
            http2Writer2.getClass();
            settings2.getClass();
            synchronized (http2Writer2) {
                try {
                    if (http2Writer2.d) {
                        throw new IOException("closed");
                    }
                    http2Writer2.A(0, Integer.bitCount(settings2.a) * 6, 4, 0);
                    for (int i = 0; i < 10; i++) {
                        boolean z = true;
                        if (((1 << i) & settings2.a) == 0) {
                            z = false;
                        }
                        if (z) {
                            http2Writer2.a.writeShort(i);
                            http2Writer2.a.writeInt(settings2.b[i]);
                        }
                    }
                    http2Writer2.a.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (http2Connection.C.a() != 65535) {
                http2Connection.I.a0(0, r7 - 65535);
            }
            TaskQueue.c(http2Connection.s.d(), http2Connection.c, 0L, http2Connection.J, 6);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        Route route = this.c;
        sb.append(route.a.h.d);
        sb.append(':');
        sb.append(route.a.h.e);
        sb.append(", proxy=");
        sb.append(route.b);
        sb.append(" hostAddress=");
        sb.append(route.c);
        sb.append(" cipherSuite=");
        Handshake handshake = this.f;
        sb.append(handshake != null ? handshake.b : "none");
        sb.append(" protocol=");
        sb.append(this.s);
        sb.append('}');
        return sb.toString();
    }
}
