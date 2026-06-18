package okhttp3.internal.http2;

import defpackage.al3;
import defpackage.fr6;
import defpackage.heb;
import defpackage.ib4;
import defpackage.ky0;
import defpackage.lc5;
import defpackage.lj;
import java.io.Closeable;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.BufferedSocket;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.FlowControlListener;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.http2.PushObserver;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.flowcontrol.WindowCounter;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class Http2Connection implements Closeable, Lockable {
    public static final Settings L;
    public long A;
    public final FlowControlListener B;
    public final Settings C;
    public Settings D;
    public final WindowCounter E;
    public long F;
    public long G;
    public final BufferedSocket H;
    public final Http2Writer I;
    public final ReaderRunnable J;
    public final LinkedHashSet K;
    public final Listener a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final String c;
    public int d;
    public int e;
    public boolean f;
    public final TaskRunner s;
    public final TaskQueue t;
    public final TaskQueue u;
    public final TaskQueue v;
    public final PushObserver w;
    public long x;
    public long y;
    public long z;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Builder {
        public final TaskRunner a;
        public BufferedSocket b;
        public String c;
        public Listener d;
        public final PushObserver e;
        public FlowControlListener f;

        public Builder(TaskRunner taskRunner) {
            taskRunner.getClass();
            this.a = taskRunner;
            this.d = Listener.a;
            this.e = PushObserver.a;
            this.f = FlowControlListener.None.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static abstract class Listener {
        public static final Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1 a = new Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1();

        /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
        public static final class Companion {
        }

        public void a(Http2Connection http2Connection, Settings settings) {
            settings.getClass();
        }

        public abstract void b(Http2Stream http2Stream);
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public final class ReaderRunnable implements Http2Reader.Handler, ib4 {
        public final Http2Reader a;

        public ReaderRunnable(Http2Reader http2Reader) {
            this.a = http2Reader;
        }

        /* JADX WARN: Code restructure failed: missing block: B:55:0x00f4, code lost:
        
            if (r18 == false) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00f6, code lost:
        
            r3.k(okhttp3.Headers.b, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00fb, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(final boolean r18, final int r19, defpackage.mr0 r20, final int r21) throws java.io.EOFException {
            /*
                Method dump skipped, instruction units count: 252
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.ReaderRunnable.a(boolean, int, mr0, int):void");
        }

        public final void b(int i, List list, boolean z) {
            Http2Connection http2Connection = Http2Connection.this;
            Settings settings = Http2Connection.L;
            if (i != 0 && (i & 1) == 0) {
                TaskQueue.c(http2Connection.u, http2Connection.c + '[' + i + "] onHeaders", 0L, new b(http2Connection, i, list, z), 6);
                return;
            }
            synchronized (http2Connection) {
                Http2Stream http2StreamQ = http2Connection.q(i);
                if (http2StreamQ != null) {
                    http2StreamQ.k(_UtilJvmKt.g(list), z);
                    return;
                }
                if (http2Connection.f) {
                    return;
                }
                if (i <= http2Connection.d) {
                    return;
                }
                if (i % 2 == http2Connection.e % 2) {
                    return;
                }
                Http2Stream http2Stream = new Http2Stream(i, http2Connection, false, z, _UtilJvmKt.g(list));
                http2Connection.d = i;
                http2Connection.b.put(Integer.valueOf(i), http2Stream);
                TaskQueue.c(http2Connection.s.d(), http2Connection.c + '[' + i + "] onStream", 0L, new al3(16, http2Connection, http2Stream), 6);
            }
        }

        public final void d(int i, int i2, boolean z) {
            Http2Connection http2Connection = Http2Connection.this;
            if (!z) {
                TaskQueue.c(http2Connection.t, ky0.s(Http2Connection.this.c, " ping", new StringBuilder()), 0L, new fr6(Http2Connection.this, i, i2, 4), 6);
                return;
            }
            synchronized (http2Connection) {
                try {
                    if (i == 1) {
                        http2Connection.x++;
                    } else if (i == 2) {
                        http2Connection.z++;
                    } else if (i == 3) {
                        http2Connection.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void f(int i, List list) {
            Http2Connection http2Connection = Http2Connection.this;
            synchronized (http2Connection) {
                if (http2Connection.K.contains(Integer.valueOf(i))) {
                    http2Connection.R(i, ErrorCode.PROTOCOL_ERROR);
                    return;
                }
                http2Connection.K.add(Integer.valueOf(i));
                TaskQueue.c(http2Connection.u, http2Connection.c + '[' + i + "] onRequest", 0L, new b(http2Connection, i, list), 6);
            }
        }

        public final void i(final int i, final ErrorCode errorCode) {
            final Http2Connection http2Connection = Http2Connection.this;
            Settings settings = Http2Connection.L;
            if (i == 0 || (i & 1) != 0) {
                Http2Stream http2StreamA = http2Connection.A(i);
                if (http2StreamA != null) {
                    synchronized (http2StreamA) {
                        if (http2StreamA.h() == null) {
                            http2StreamA.x = errorCode;
                            http2StreamA.notifyAll();
                        }
                    }
                    return;
                }
                return;
            }
            TaskQueue.c(http2Connection.u, http2Connection.c + '[' + i + "] onReset", 0L, new ib4(i, errorCode) { // from class: okhttp3.internal.http2.c
                public final /* synthetic */ int b;

                @Override // defpackage.ib4
                public final Object invoke() {
                    Http2Connection http2Connection2 = this.a;
                    int i2 = this.b;
                    ((PushObserver.Companion.PushObserverCancel) http2Connection2.w).getClass();
                    synchronized (http2Connection2) {
                        http2Connection2.K.remove(Integer.valueOf(i2));
                    }
                    return heb.a;
                }
            }, 6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v12 */
        /* JADX WARN: Type inference failed for: r5v13 */
        /* JADX WARN: Type inference failed for: r5v8 */
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
        @Override // defpackage.ib4
        public final Object invoke() throws Throwable {
            Throwable th;
            Http2Connection http2Connection = Http2Connection.this;
            Http2Reader http2Reader = this.a;
            ErrorCode errorCode = ErrorCode.INTERNAL_ERROR;
            IOException iOException = null;
            try {
                try {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e) {
                    iOException = e;
                }
                if (!http2Reader.p(true, this)) {
                    throw new IOException("Required SETTINGS preface not received");
                }
                do {
                    try {
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } while (http2Reader.p(false, this));
                ErrorCode errorCode2 = ErrorCode.NO_ERROR;
                try {
                    errorCode = ErrorCode.CANCEL;
                    http2Connection.p(errorCode2, errorCode, null);
                    this = errorCode2;
                } catch (IOException e2) {
                    iOException = e2;
                    ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                    http2Connection.p(errorCode3, errorCode3, iOException);
                    this = errorCode3;
                }
                _UtilCommonKt.b(http2Reader);
                return heb.a;
            } catch (Throwable th4) {
                th = th4;
            }
            this = errorCode;
            http2Connection.p(this, errorCode, iOException);
            _UtilCommonKt.b(http2Reader);
            throw th;
        }
    }

    static {
        Settings settings = new Settings();
        settings.b(4, 65535);
        settings.b(5, 16384);
        L = settings;
    }

    public Http2Connection(Builder builder) {
        this.a = builder.d;
        String str = builder.c;
        if (str == null) {
            lc5.i0("connectionName");
            throw null;
        }
        this.c = str;
        this.e = 3;
        TaskRunner taskRunner = builder.a;
        this.s = taskRunner;
        this.t = taskRunner.d();
        this.u = taskRunner.d();
        this.v = taskRunner.d();
        this.w = PushObserver.a;
        this.B = builder.f;
        Settings settings = new Settings();
        settings.b(4, 16777216);
        this.C = settings;
        this.D = L;
        this.E = new WindowCounter(0);
        this.G = r0.a();
        BufferedSocket bufferedSocket = builder.b;
        if (bufferedSocket == null) {
            lc5.i0("socket");
            throw null;
        }
        this.H = bufferedSocket;
        this.I = new Http2Writer(bufferedSocket.b());
        this.J = new ReaderRunnable(new Http2Reader(bufferedSocket.c()));
        this.K = new LinkedHashSet();
    }

    public final Http2Stream A(int i) {
        Http2Stream http2Stream;
        synchronized (this) {
            http2Stream = (Http2Stream) this.b.remove(Integer.valueOf(i));
            notifyAll();
        }
        return http2Stream;
    }

    public final void E(ErrorCode errorCode) {
        synchronized (this.I) {
            synchronized (this) {
                if (this.f) {
                    return;
                }
                this.f = true;
                this.I.E(this.d, errorCode, _UtilCommonKt.a);
            }
        }
    }

    public final void N(long j) {
        synchronized (this) {
            try {
                WindowCounter.b(this.E, j, 0L, 2);
                long jA = this.E.a();
                if (jA >= this.C.a() / 2) {
                    a0(0, jA);
                    WindowCounter.b(this.E, 0L, jA, 1);
                }
                this.B.b(this.E);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.I.c);
        r6 = r2;
        r8.F += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(int r9, boolean r10, defpackage.xq0 r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            okhttp3.internal.http2.Http2Writer r8 = r8.I
            r8.q(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.F     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.G     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.b     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            okhttp3.internal.http2.Http2Writer r4 = r8.I     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.c     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.F     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.F = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            okhttp3.internal.http2.Http2Writer r4 = r8.I
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.q(r5, r9, r11, r2)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.P(int, boolean, xq0, long):void");
    }

    public final void R(int i, ErrorCode errorCode) {
        TaskQueue.c(this.t, this.c + '[' + i + "] writeSynReset", 0L, new lj(this, i, errorCode, 2), 6);
    }

    public final void a0(final int i, final long j) {
        TaskQueue.c(this.t, this.c + '[' + i + "] windowUpdate", 0L, new ib4() { // from class: zr4
            @Override // defpackage.ib4
            public final Object invoke() {
                Http2Connection http2Connection = this.a;
                int i2 = i;
                long j2 = j;
                Settings settings = Http2Connection.L;
                try {
                    http2Connection.I.a0(i2, j2);
                } catch (IOException e) {
                    ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                    http2Connection.p(errorCode, errorCode, e);
                }
                return heb.a;
            }
        }, 6);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        p(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void flush() {
        this.I.flush();
    }

    public final void p(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) {
        int i;
        Object[] array;
        TimeZone timeZone = _UtilJvmKt.a;
        try {
            E(errorCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.b.isEmpty()) {
                array = null;
            } else {
                array = this.b.values().toArray(new Http2Stream[0]);
                this.b.clear();
            }
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) array;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.e(errorCode2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.I.close();
        } catch (IOException unused3) {
        }
        try {
            this.H.cancel();
        } catch (IOException unused4) {
        }
        this.t.f();
        this.u.f();
        this.v.f();
    }

    public final Http2Stream q(int i) {
        Http2Stream http2Stream;
        synchronized (this) {
            http2Stream = (Http2Stream) this.b.get(Integer.valueOf(i));
        }
        return http2Stream;
    }
}
