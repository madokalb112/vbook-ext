package okhttp3.internal.ws;

import defpackage.av0;
import defpackage.gc1;
import defpackage.j39;
import defpackage.ky0;
import defpackage.lc5;
import defpackage.pk9;
import defpackage.ra1;
import defpackage.rg8;
import defpackage.wn6;
import defpackage.xq0;
import defpackage.xv5;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.BufferedSocketKt$asBufferedSocket$1;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.ws.WebSocketReader;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback, Lockable {
    public static final List J = gc1.Y(Protocol.HTTP_1_1);
    public final ArrayDeque A;
    public final ArrayDeque B;
    public long C;
    public boolean D;
    public int E;
    public String F;
    public boolean G;
    public int H;
    public boolean I;
    public final WebSocketListener a;
    public final Random b;
    public final long c;
    public WebSocketExtensions d;
    public final long e;
    public final long f;
    public final String s;
    public RealCall t;
    public Task u;
    public WebSocketReader v;
    public WebSocketWriter w;
    public final TaskQueue x;
    public String y;
    public BufferedSocketKt$asBufferedSocket$1 z;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Close {
        public final int a;
        public final av0 b;
        public final long c;

        public Close(int i, long j, av0 av0Var) {
            this.a = i;
            this.b = av0Var;
            this.c = j;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Message {
        public final int a;
        public final av0 b;

        public Message(int i, av0 av0Var) {
            this.a = i;
            this.b = av0Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public final class WriterTask extends Task {
        public WriterTask() {
            super(ky0.s(RealWebSocket.this.y, " writer", new StringBuilder()), true);
        }

        @Override // okhttp3.internal.concurrent.Task
        public final long a() {
            RealWebSocket realWebSocket = RealWebSocket.this;
            try {
                return realWebSocket.n() ? 0L : -1L;
            } catch (IOException e) {
                RealWebSocket.j(realWebSocket, e, null, 2);
                return -1L;
            }
        }
    }

    public RealWebSocket(TaskRunner taskRunner, Request request, WebSocketListener webSocketListener, Random random, long j, long j2, long j3) {
        taskRunner.getClass();
        request.getClass();
        webSocketListener.getClass();
        this.a = webSocketListener;
        this.b = random;
        this.c = j;
        this.d = null;
        this.e = j2;
        this.f = j3;
        this.x = taskRunner.d();
        this.A = new ArrayDeque();
        this.B = new ArrayDeque();
        this.E = -1;
        String str = request.b;
        if (!"GET".equals(str)) {
            gp.k(ky0.r("Request must be GET: ", str));
            throw null;
        }
        av0 av0Var = av0.d;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.s = ra1.x(bArr).a();
    }

    public static void j(RealWebSocket realWebSocket, Exception exc, Response response, int i) {
        WebSocketWriter webSocketWriter;
        if ((i & 2) != 0) {
            response = null;
        }
        boolean z = (i & 4) == 0;
        realWebSocket.getClass();
        rg8 rg8Var = new rg8();
        synchronized (realWebSocket) {
            try {
                if (realWebSocket.G) {
                    return;
                }
                realWebSocket.G = true;
                BufferedSocketKt$asBufferedSocket$1 bufferedSocketKt$asBufferedSocket$1 = realWebSocket.z;
                WebSocketWriter webSocketWriter2 = realWebSocket.w;
                rg8Var.a = webSocketWriter2;
                realWebSocket.w = null;
                if (!z && webSocketWriter2 != null) {
                    TaskQueue.c(realWebSocket.x, realWebSocket.y + " writer close", 0L, new wn6(rg8Var, 18), 2);
                }
                realWebSocket.x.f();
                try {
                    realWebSocket.a.c(realWebSocket, exc, response);
                    if (bufferedSocketKt$asBufferedSocket$1 != null) {
                        bufferedSocketKt$asBufferedSocket$1.cancel();
                    }
                    if (!z || (webSocketWriter = (WebSocketWriter) rg8Var.a) == null) {
                        return;
                    }
                    _UtilCommonKt.b(webSocketWriter);
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // okhttp3.WebSocket
    public final boolean a(String str) {
        av0 av0Var = av0.d;
        return m(1, ra1.s(str));
    }

    @Override // okhttp3.WebSocket
    public final boolean b(av0 av0Var) {
        return m(2, av0Var);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final synchronized void c(av0 av0Var) {
        try {
            av0Var.getClass();
            if (!this.G && (!this.D || !this.B.isEmpty())) {
                this.A.add(av0Var);
                l();
            }
        } finally {
        }
    }

    @Override // okhttp3.WebSocket
    public final void cancel() {
        RealCall realCall = this.t;
        realCall.getClass();
        realCall.d();
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void d(String str) {
        this.a.e(this, str);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void e(av0 av0Var) {
        av0Var.getClass();
        this.a.d(this, av0Var);
    }

    @Override // okhttp3.WebSocket
    public final boolean f(int i, String str) {
        av0 av0VarS;
        long j = this.f;
        synchronized (this) {
            try {
                String strA = WebSocketProtocol.a(i);
                if (strA != null) {
                    throw new IllegalArgumentException(strA.toString());
                }
                if (str != null) {
                    av0 av0Var = av0.d;
                    av0VarS = ra1.s(str);
                    if (av0VarS.a.length > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                } else {
                    av0VarS = null;
                }
                if (!this.G && !this.D) {
                    this.D = true;
                    this.B.add(new Close(i, j, av0VarS));
                    l();
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final synchronized void g(av0 av0Var) {
        av0Var.getClass();
        this.I = false;
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void h(int i, String str) {
        if (i == -1) {
            gp.l("Failed requirement.");
            return;
        }
        synchronized (this) {
            if (this.E != -1) {
                throw new IllegalStateException("already closed");
            }
            this.E = i;
            this.F = str;
        }
        this.a.b(this, i, str);
    }

    public final pk9 i(Response response) throws ProtocolException {
        Headers headers = response.f;
        int i = response.d;
        if (i != 101) {
            StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
            sb.append(i);
            sb.append(' ');
            throw new ProtocolException(xv5.s(sb, response.c, '\''));
        }
        String strA = headers.a("Connection");
        if (strA == null) {
            strA = null;
        }
        if (!"Upgrade".equalsIgnoreCase(strA)) {
            throw new ProtocolException(j39.i('\'', "Expected 'Connection' header value 'Upgrade' but was '", strA));
        }
        String strA2 = headers.a("Upgrade");
        if (strA2 == null) {
            strA2 = null;
        }
        if (!"websocket".equalsIgnoreCase(strA2)) {
            throw new ProtocolException(j39.i('\'', "Expected 'Upgrade' header value 'websocket' but was '", strA2));
        }
        String strA3 = headers.a("Sec-WebSocket-Accept");
        String str = strA3 != null ? strA3 : null;
        av0 av0Var = av0.d;
        String strA4 = ra1.s(this.s + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").c("SHA-1").a();
        if (lc5.Q(strA4, str)) {
            pk9 pk9Var = response.t;
            if (pk9Var != null) {
                return pk9Var;
            }
            throw new ProtocolException("Web Socket socket missing: bad interceptor?");
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strA4 + "' but was '" + str + '\'');
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            r11 = this;
            monitor-enter(r11)
            int r0 = r11.E     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = r11.F     // Catch: java.lang.Throwable -> L3f
            okhttp3.internal.ws.WebSocketReader r2 = r11.v     // Catch: java.lang.Throwable -> L3f
            r3 = 0
            r11.v = r3     // Catch: java.lang.Throwable -> L3f
            boolean r4 = r11.D     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L46
            java.util.ArrayDeque r4 = r11.B     // Catch: java.lang.Throwable -> L3f
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L46
            okhttp3.internal.ws.WebSocketWriter r4 = r11.w     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L41
            r11.w = r3     // Catch: java.lang.Throwable -> L3f
            okhttp3.internal.concurrent.TaskQueue r5 = r11.x     // Catch: java.lang.Throwable -> L3f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r3.<init>()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r6 = r11.y     // Catch: java.lang.Throwable -> L3f
            r3.append(r6)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r6 = " writer close"
            r3.append(r6)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L3f
            wn6 r9 = new wn6     // Catch: java.lang.Throwable -> L3f
            r3 = 17
            r9.<init>(r4, r3)     // Catch: java.lang.Throwable -> L3f
            r10 = 2
            r7 = 0
            okhttp3.internal.concurrent.TaskQueue.c(r5, r6, r7, r9, r10)     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r0 = move-exception
            goto L67
        L41:
            okhttp3.internal.concurrent.TaskQueue r3 = r11.x     // Catch: java.lang.Throwable -> L3f
            r3.f()     // Catch: java.lang.Throwable -> L3f
        L46:
            boolean r3 = r11.G     // Catch: java.lang.Throwable -> L3f
            if (r3 != 0) goto L55
            okhttp3.internal.ws.WebSocketWriter r3 = r11.w     // Catch: java.lang.Throwable -> L3f
            if (r3 != 0) goto L55
            int r3 = r11.E     // Catch: java.lang.Throwable -> L3f
            r4 = -1
            if (r3 == r4) goto L55
            r3 = 1
            goto L56
        L55:
            r3 = 0
        L56:
            monitor-exit(r11)
            if (r3 == 0) goto L61
            okhttp3.WebSocketListener r3 = r11.a
            r1.getClass()
            r3.a(r11, r0, r1)
        L61:
            if (r2 == 0) goto L66
            okhttp3.internal._UtilCommonKt.b(r2)
        L66:
            return
        L67:
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket.k():void");
    }

    public final void l() {
        TimeZone timeZone = _UtilJvmKt.a;
        Task task = this.u;
        if (task != null) {
            this.x.d(task, 0L);
        }
    }

    public final synchronized boolean m(int i, av0 av0Var) {
        if (!this.G && !this.D) {
            long j = this.C;
            byte[] bArr = av0Var.a;
            if (((long) bArr.length) + j > 16777216) {
                f(1001, null);
                return false;
            }
            this.C = j + ((long) bArr.length);
            this.B.add(new Message(i, av0Var));
            l();
            return true;
        }
        return false;
    }

    public final boolean n() {
        String str;
        int i;
        WebSocketWriter webSocketWriter;
        String strA;
        synchronized (this) {
            try {
                boolean z = false;
                if (this.G) {
                    return false;
                }
                WebSocketWriter webSocketWriter2 = this.w;
                Object objPoll = this.A.poll();
                Object obj = null;
                if (objPoll == null) {
                    Object objPoll2 = this.B.poll();
                    if (objPoll2 instanceof Close) {
                        i = this.E;
                        str = this.F;
                        if (i != -1) {
                            webSocketWriter = this.w;
                            this.w = null;
                            if (webSocketWriter != null && this.v == null) {
                                z = true;
                            }
                            this.x.f();
                        } else {
                            long j = ((Close) objPoll2).c;
                            TaskQueue.c(this.x, this.y + " cancel", TimeUnit.MILLISECONDS.toNanos(j), new wn6(this, 16), 4);
                            webSocketWriter = null;
                        }
                    } else {
                        if (objPoll2 == null) {
                            return false;
                        }
                        str = null;
                        i = -1;
                        webSocketWriter = null;
                    }
                    obj = objPoll2;
                } else {
                    str = null;
                    i = -1;
                    webSocketWriter = null;
                }
                try {
                    if (objPoll != null) {
                        webSocketWriter2.getClass();
                        webSocketWriter2.p(10, (av0) objPoll);
                    } else if (obj instanceof Message) {
                        webSocketWriter2.getClass();
                        webSocketWriter2.q(((Message) obj).a, ((Message) obj).b);
                        synchronized (this) {
                            this.C -= (long) ((Message) obj).b.a.length;
                        }
                    } else {
                        if (!(obj instanceof Close)) {
                            throw new AssertionError();
                        }
                        webSocketWriter2.getClass();
                        int i2 = ((Close) obj).a;
                        av0 av0Var = ((Close) obj).b;
                        av0 av0VarZ = av0.d;
                        if (i2 != 0 || av0Var != null) {
                            if (i2 != 0 && (strA = WebSocketProtocol.a(i2)) != null) {
                                throw new IllegalArgumentException(strA.toString());
                            }
                            xq0 xq0Var = new xq0();
                            xq0Var.V0(i2);
                            if (av0Var != null) {
                                xq0Var.F0(av0Var);
                            }
                            av0VarZ = xq0Var.z(xq0Var.b);
                        }
                        try {
                            webSocketWriter2.p(8, av0VarZ);
                            if (z) {
                                WebSocketListener webSocketListener = this.a;
                                str.getClass();
                                webSocketListener.a(this, i, str);
                            }
                        } finally {
                            webSocketWriter2.t = true;
                        }
                    }
                    return true;
                } finally {
                    if (webSocketWriter != null) {
                        _UtilCommonKt.b(webSocketWriter);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
