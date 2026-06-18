package okhttp3.internal.http2;

import defpackage.ag9;
import defpackage.hz;
import defpackage.il9;
import defpackage.ky0;
import defpackage.pk9;
import defpackage.uua;
import defpackage.xq0;
import defpackage.xv5;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.TimeZone;
import okhttp3.Headers;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.http2.flowcontrol.WindowCounter;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class Http2Stream implements Lockable, pk9 {
    public final int a;
    public final Http2Connection b;
    public final WindowCounter c;
    public long d;
    public long e;
    public final ArrayDeque f;
    public boolean s;
    public final FramingSource t;
    public final FramingSink u;
    public final StreamTimeout v;
    public final StreamTimeout w;
    public ErrorCode x;
    public IOException y;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public final class FramingSink implements ag9 {
        public final boolean a;
        public final xq0 b = new xq0();
        public boolean c;

        public FramingSink(boolean z) {
            this.a = z;
        }

        @Override // defpackage.ag9, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            TimeZone timeZone = _UtilJvmKt.a;
            synchronized (http2Stream) {
                if (this.c) {
                    return;
                }
                boolean z = http2Stream.h() == null;
                Http2Stream http2Stream2 = Http2Stream.this;
                if (!http2Stream2.u.a) {
                    if (this.b.b > 0) {
                        while (this.b.b > 0) {
                            p(true);
                        }
                    } else if (z) {
                        http2Stream2.b.P(http2Stream2.a, true, null, 0L);
                    }
                }
                Http2Stream http2Stream3 = Http2Stream.this;
                synchronized (http2Stream3) {
                    this.c = true;
                    http2Stream3.notifyAll();
                }
                Http2Stream.this.b.flush();
                Http2Stream.this.a();
            }
        }

        @Override // defpackage.ag9, java.io.Flushable
        public final void flush() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            TimeZone timeZone = _UtilJvmKt.a;
            synchronized (http2Stream) {
                http2Stream.d();
            }
            while (this.b.b > 0) {
                p(false);
                Http2Stream.this.b.flush();
            }
        }

        @Override // defpackage.ag9
        public final uua l() {
            return Http2Stream.this.w;
        }

        /* JADX WARN: Finally extract failed */
        public final void p(boolean z) throws IOException {
            long jMin;
            boolean z2;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                http2Stream.w.i();
                while (http2Stream.d >= http2Stream.e && !this.a && !this.c && http2Stream.h() == null) {
                    try {
                        try {
                            http2Stream.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        http2Stream.w.m();
                        throw th;
                    }
                }
                http2Stream.w.m();
                http2Stream.d();
                jMin = Math.min(http2Stream.e - http2Stream.d, this.b.b);
                http2Stream.d += jMin;
                z2 = z && jMin == this.b.b;
            }
            Http2Stream.this.w.i();
            try {
                Http2Stream http2Stream2 = Http2Stream.this;
                http2Stream2.b.P(http2Stream2.a, z2, this.b, jMin);
            } finally {
                Http2Stream.this.w.m();
            }
        }

        @Override // defpackage.ag9
        public final void y0(long j, xq0 xq0Var) throws IOException {
            TimeZone timeZone = _UtilJvmKt.a;
            xq0 xq0Var2 = this.b;
            xq0Var2.y0(j, xq0Var);
            while (xq0Var2.b >= 16384) {
                p(false);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public final class FramingSource implements il9 {
        public final long a;
        public boolean b;
        public final xq0 c = new xq0();
        public final xq0 d = new xq0();
        public boolean e;

        public FramingSource(long j, boolean z) {
            this.a = j;
            this.b = z;
        }

        @Override // defpackage.il9
        public final long D0(long j, xq0 xq0Var) throws Throwable {
            boolean z;
            Throwable streamResetException;
            long j2;
            long jD0;
            xq0Var.getClass();
            long j3 = 0;
            if (j < 0) {
                gp.k(xv5.l(j, "byteCount < 0: "));
                return 0L;
            }
            while (true) {
                Http2Stream http2Stream = Http2Stream.this;
                synchronized (http2Stream) {
                    http2Stream.b.getClass();
                    FramingSink framingSink = http2Stream.u;
                    z = true;
                    boolean z2 = framingSink.c || framingSink.a;
                    if (z2) {
                        http2Stream.v.i();
                    }
                    try {
                        if (http2Stream.h() == null || this.b) {
                            streamResetException = null;
                        } else {
                            streamResetException = http2Stream.y;
                            if (streamResetException == null) {
                                ErrorCode errorCodeH = http2Stream.h();
                                errorCodeH.getClass();
                                streamResetException = new StreamResetException(errorCodeH);
                            }
                        }
                        if (this.e) {
                            throw new IOException("stream closed");
                        }
                        xq0 xq0Var2 = this.d;
                        long j4 = xq0Var2.b;
                        if (j4 > j3) {
                            jD0 = xq0Var2.D0(Math.min(j, j4), xq0Var);
                            WindowCounter.b(http2Stream.c, jD0, 0L, 2);
                            long jA = http2Stream.c.a();
                            if (streamResetException == null) {
                                j2 = j3;
                                if (jA >= http2Stream.b.C.a() / 2) {
                                    http2Stream.b.a0(http2Stream.a, jA);
                                    WindowCounter.b(http2Stream.c, 0L, jA, 1);
                                }
                            } else {
                                j2 = j3;
                            }
                            z = false;
                        } else {
                            j2 = j3;
                            if (this.b || streamResetException != null) {
                                z = false;
                            } else {
                                try {
                                    http2Stream.wait();
                                } catch (InterruptedException unused) {
                                    Thread.currentThread().interrupt();
                                    throw new InterruptedIOException();
                                }
                            }
                            jD0 = -1;
                        }
                    } finally {
                        if (z2) {
                            http2Stream.v.m();
                        }
                    }
                }
                Http2Stream http2Stream2 = Http2Stream.this;
                http2Stream2.b.B.a(http2Stream2.c);
                if (!z) {
                    if (jD0 != -1) {
                        return jD0;
                    }
                    if (streamResetException == null) {
                        return -1L;
                    }
                    throw streamResetException;
                }
                j3 = j2;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            long j;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                this.e = true;
                xq0 xq0Var = this.d;
                j = xq0Var.b;
                xq0Var.p();
                http2Stream.notifyAll();
            }
            if (j > 0) {
                Http2Stream http2Stream2 = Http2Stream.this;
                TimeZone timeZone = _UtilJvmKt.a;
                http2Stream2.b.N(j);
            }
            Http2Stream.this.a();
        }

        @Override // defpackage.il9
        public final uua l() {
            return Http2Stream.this.v;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public final class StreamTimeout extends hz {
        public StreamTimeout() {
        }

        @Override // defpackage.hz
        public final IOException k(IOException iOException) {
            return new SocketTimeoutException("timeout");
        }

        @Override // defpackage.hz
        public final void l() {
            Http2Stream.this.g(ErrorCode.CANCEL);
            Http2Connection http2Connection = Http2Stream.this.b;
            synchronized (http2Connection) {
                long j = http2Connection.z;
                long j2 = http2Connection.y;
                if (j < j2) {
                    return;
                }
                http2Connection.y = j2 + 1;
                http2Connection.A = System.nanoTime() + 1000000000;
                TaskQueue.c(http2Connection.t, ky0.s(http2Connection.c, " ping", new StringBuilder()), 0L, new uk2(http2Connection, 12), 6);
            }
        }

        public final void m() throws IOException {
            if (j()) {
                throw k(null);
            }
        }
    }

    public Http2Stream(int i, Http2Connection http2Connection, boolean z, boolean z2, Headers headers) {
        http2Connection.getClass();
        this.a = i;
        this.b = http2Connection;
        this.c = new WindowCounter(i);
        this.e = http2Connection.D.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f = arrayDeque;
        this.t = new FramingSource(http2Connection.C.a(), z2);
        this.u = new FramingSink(z);
        this.v = new StreamTimeout();
        this.w = new StreamTimeout();
        if (headers == null) {
            if (i()) {
                return;
            }
            gp.j("remotely-initiated streams should have headers");
            throw null;
        }
        if (i()) {
            gp.j("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(headers);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r2 = this;
            java.util.TimeZone r0 = okhttp3.internal._UtilJvmKt.a
            monitor-enter(r2)
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.t     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.b     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1c
            boolean r0 = r0.e     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.u     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.a     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            boolean r0 = r0.c     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            goto L1a
        L18:
            r0 = move-exception
            goto L35
        L1a:
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            boolean r1 = r2.j()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            if (r0 == 0) goto L2b
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.CANCEL
            r1 = 0
            r2.e(r0, r1)
            return
        L2b:
            if (r1 != 0) goto L34
            okhttp3.internal.http2.Http2Connection r0 = r2.b
            int r2 = r2.a
            r0.A(r2)
        L34:
            return
        L35:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.a():void");
    }

    @Override // defpackage.pk9
    public final ag9 b() {
        return this.u;
    }

    @Override // defpackage.pk9
    public final il9 c() {
        return this.t;
    }

    @Override // defpackage.pk9
    public final void cancel() {
        g(ErrorCode.CANCEL);
    }

    public final void d() throws IOException {
        FramingSink framingSink = this.u;
        if (framingSink.c) {
            sy3.m("stream closed");
            return;
        }
        if (framingSink.a) {
            sy3.m("stream finished");
            return;
        }
        if (h() != null) {
            IOException iOException = this.y;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCodeH = h();
            errorCodeH.getClass();
            throw new StreamResetException(errorCodeH);
        }
    }

    public final void e(ErrorCode errorCode, IOException iOException) {
        if (f(errorCode, iOException)) {
            Http2Connection http2Connection = this.b;
            http2Connection.getClass();
            http2Connection.I.R(this.a, errorCode);
        }
    }

    public final boolean f(ErrorCode errorCode, IOException iOException) {
        TimeZone timeZone = _UtilJvmKt.a;
        synchronized (this) {
            if (h() != null) {
                return false;
            }
            this.x = errorCode;
            this.y = iOException;
            notifyAll();
            if (this.t.b) {
                if (this.u.a) {
                    return false;
                }
            }
            this.b.A(this.a);
            return true;
        }
    }

    public final void g(ErrorCode errorCode) {
        if (f(errorCode, null)) {
            this.b.R(this.a, errorCode);
        }
    }

    public final ErrorCode h() {
        ErrorCode errorCode;
        synchronized (this) {
            errorCode = this.x;
        }
        return errorCode;
    }

    public final boolean i() {
        boolean z = (this.a & 1) == 1;
        this.b.getClass();
        return true == z;
    }

    public final boolean j() {
        synchronized (this) {
            try {
                if (h() != null) {
                    return false;
                }
                FramingSource framingSource = this.t;
                if (framingSource.b || framingSource.e) {
                    FramingSink framingSink = this.u;
                    if (framingSink.a || framingSink.c) {
                        if (this.s) {
                            return false;
                        }
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(Headers headers, boolean z) {
        boolean zJ;
        headers.getClass();
        TimeZone timeZone = _UtilJvmKt.a;
        synchronized (this) {
            try {
                if (this.s && headers.a(":status") == null && headers.a(":method") == null) {
                    this.t.getClass();
                } else {
                    this.s = true;
                    this.f.add(headers);
                }
                if (z) {
                    this.t.b = true;
                }
                zJ = j();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zJ) {
            return;
        }
        this.b.A(this.a);
    }
}
