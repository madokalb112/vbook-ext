package okhttp3.internal.connection;

import defpackage.fc1;
import defpackage.hz;
import defpackage.lc5;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.connection.RoutePlanner;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class RealCall implements Call, Cloneable, Lockable {
    public boolean A;
    public boolean B;
    public boolean C;
    public volatile boolean D;
    public volatile Exchange E;
    public final CopyOnWriteArrayList F;
    public final OkHttpClient a;
    public final Request b;
    public final boolean c;
    public final RealConnectionPool d;
    public final EventListener e;
    public final RealCall$timeout$1 f;
    public final AtomicBoolean s;
    public Object t;
    public ExchangeFinder u;
    public RealConnection v;
    public boolean w;
    public Exchange x;
    public boolean y;
    public boolean z;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public final class AsyncCall implements Runnable {
        public final Callback a;
        public volatile AtomicInteger b = new AtomicInteger(0);

        public AsyncCall(Callback callback) {
            this.a = callback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Dispatcher dispatcher;
            String strConcat = "OkHttp ".concat(RealCall.this.b.a.f());
            RealCall realCall = RealCall.this;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(strConcat);
            try {
                realCall.f.i();
                boolean z = false;
                try {
                    try {
                        try {
                            this.a.c(realCall, realCall.g());
                            dispatcher = realCall.a.a;
                        } catch (IOException e) {
                            e = e;
                            z = true;
                            if (z) {
                                Platform platform = Platform.a;
                                Platform.a.j(4, "Callback failure for ".concat(RealCall.a(realCall)), e);
                            } else {
                                this.a.d(realCall, e);
                            }
                            dispatcher = realCall.a.a;
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            realCall.d();
                            if (!z) {
                                IOException iOException = new IOException("canceled due to " + th);
                                iOException.initCause(th);
                                this.a.d(realCall, iOException);
                            }
                            if (!(th instanceof InterruptedException)) {
                                throw th;
                            }
                            Thread.currentThread().interrupt();
                            dispatcher = realCall.a.a;
                        }
                    } catch (Throwable th2) {
                        Dispatcher dispatcher2 = realCall.a.a;
                        dispatcher2.getClass();
                        Dispatcher.c(dispatcher2, null, this, 3);
                        throw th2;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th3) {
                    th = th3;
                }
                dispatcher.getClass();
                Dispatcher.c(dispatcher, null, this, 3);
            } finally {
                threadCurrentThread.setName(name);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class CallReference extends WeakReference<RealCall> {
        public final Object a;

        public CallReference(RealCall realCall, Object obj) {
            super(realCall);
            this.a = obj;
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [okhttp3.internal.connection.RealCall$timeout$1, uua] */
    public RealCall(OkHttpClient okHttpClient, Request request, boolean z) {
        okHttpClient.getClass();
        request.getClass();
        this.a = okHttpClient;
        this.b = request;
        this.c = z;
        this.d = okHttpClient.C.a;
        okHttpClient.d.getClass();
        TimeZone timeZone = _UtilJvmKt.a;
        this.e = EventListener.a;
        ?? r3 = new hz() { // from class: okhttp3.internal.connection.RealCall$timeout$1
            @Override // defpackage.hz
            public final void l() {
                this.n.d();
            }
        };
        r3.g(0L, TimeUnit.MILLISECONDS);
        this.f = r3;
        this.s = new AtomicBoolean();
        this.C = true;
        this.F = new CopyOnWriteArrayList();
        new AtomicReference(request.e);
    }

    public static final String a(RealCall realCall) {
        StringBuilder sb = new StringBuilder();
        sb.append(realCall.D ? "canceled " : "");
        sb.append(realCall.c ? "web socket" : "call");
        sb.append(" to ");
        sb.append(realCall.b.a.f());
        return sb.toString();
    }

    public final void b(RealConnection realConnection) {
        realConnection.getClass();
        TimeZone timeZone = _UtilJvmKt.a;
        if (this.v != null) {
            gp.j("Check failed.");
        } else {
            this.v = realConnection;
            realConnection.B.add(new CallReference(this, this.t));
        }
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket socketJ;
        TimeZone timeZone = _UtilJvmKt.a;
        RealConnection realConnection = this.v;
        if (realConnection != null) {
            synchronized (realConnection) {
                socketJ = j();
            }
            if (this.v == null) {
                if (socketJ != null) {
                    _UtilJvmKt.c(socketJ);
                }
                this.e.k(this, realConnection);
            } else if (socketJ != null) {
                gp.j("Check failed.");
                return null;
            }
        }
        if (!this.w && j()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        EventListener eventListener = this.e;
        if (iOException == null) {
            eventListener.c(this);
            return interruptedIOException;
        }
        interruptedIOException.getClass();
        eventListener.d(this, interruptedIOException);
        return interruptedIOException;
    }

    public final Object clone() {
        return new RealCall(this.a, this.b, this.c);
    }

    public final void d() {
        if (this.D) {
            return;
        }
        this.D = true;
        Exchange exchange = this.E;
        if (exchange != null) {
            exchange.d.cancel();
        }
        Iterator it = this.F.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((RoutePlanner.Plan) it.next()).cancel();
        }
        this.e.f(this);
    }

    public final void e(Callback callback) {
        if (!this.s.compareAndSet(false, true)) {
            gp.j("Already Executed");
            return;
        }
        Platform platform = Platform.a;
        this.t = Platform.a.h();
        this.e.e(this);
        Dispatcher dispatcher = this.a.a;
        AsyncCall asyncCall = new AsyncCall(callback);
        dispatcher.getClass();
        Dispatcher.c(dispatcher, asyncCall, null, 6);
    }

    public final void f(boolean z) {
        Exchange exchange;
        synchronized (this) {
            if (!this.C) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (exchange = this.E) != null) {
            exchange.d.cancel();
            exchange.a.h(exchange, true, true, true, true, null);
        }
        this.x = null;
    }

    public final Response g() {
        ArrayList arrayList = new ArrayList();
        fc1.p0(arrayList, this.a.b);
        arrayList.add(new RetryAndFollowUpInterceptor(this.a));
        arrayList.add(new BridgeInterceptor(this.a.j));
        this.a.getClass();
        arrayList.add(new CacheInterceptor());
        arrayList.add(ConnectInterceptor.a);
        if (!this.c) {
            fc1.p0(arrayList, this.a.c);
        }
        arrayList.add(CallServerInterceptor.a);
        Request request = this.b;
        OkHttpClient okHttpClient = this.a;
        try {
            try {
                Response responseB = new RealInterceptorChain(this, arrayList, 0, null, request, okHttpClient.v, okHttpClient.w, okHttpClient.x).b(this.b);
                if (this.D) {
                    _UtilCommonKt.b(responseB);
                    throw new IOException("Canceled");
                }
                i(null);
                return responseB;
            } catch (IOException e) {
                IOException iOExceptionI = i(e);
                iOExceptionI.getClass();
                throw iOExceptionI;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                i(null);
            }
            throw th;
        }
    }

    public final IOException h(Exchange exchange, boolean z, boolean z2, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        exchange.getClass();
        if (exchange.equals(this.E)) {
            synchronized (this) {
                z5 = false;
                if (z) {
                    try {
                        if (!this.y) {
                            if ((z2 || !this.z) && ((!z4 || !this.A) && (!z3 || !this.B))) {
                            }
                        }
                        if (z) {
                            this.y = false;
                        }
                        if (z2) {
                            this.z = false;
                        }
                        if (z4) {
                            this.A = false;
                        }
                        if (z3) {
                            this.B = false;
                        }
                        boolean z7 = (this.y || this.z || this.A || this.B) ? false : true;
                        if (z7) {
                            if (!this.C) {
                                z5 = true;
                            }
                        }
                        boolean z8 = z5;
                        z5 = z7;
                        z6 = z8;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    z6 = z2 ? false : false;
                }
            }
            if (z5) {
                this.E = null;
                RealConnection realConnection = this.v;
                if (realConnection != null) {
                    synchronized (realConnection) {
                        realConnection.y++;
                    }
                }
            }
            if (z6) {
                return c(iOException);
            }
        }
        return iOException;
    }

    public final IOException i(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.C) {
                this.C = false;
                if (!this.y && !this.z && !this.A) {
                    if (!this.B) {
                        z = true;
                    }
                }
            }
        }
        return z ? c(iOException) : iOException;
    }

    public final Socket j() {
        RealConnection realConnection = this.v;
        realConnection.getClass();
        TimeZone timeZone = _UtilJvmKt.a;
        ArrayList arrayList = realConnection.B;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            if (lc5.Q(((Reference) obj).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            gp.j("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.v = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        realConnection.C = System.nanoTime();
        RealConnectionPool realConnectionPool = this.d;
        ConcurrentLinkedQueue concurrentLinkedQueue = realConnectionPool.d;
        TaskQueue taskQueue = realConnectionPool.b;
        TimeZone timeZone2 = _UtilJvmKt.a;
        if (!realConnection.v) {
            taskQueue.d(realConnectionPool.c, 0L);
            return null;
        }
        realConnection.v = true;
        concurrentLinkedQueue.remove(realConnection);
        if (concurrentLinkedQueue.isEmpty()) {
            taskQueue.a();
        }
        return realConnection.e;
    }

    @Override // okhttp3.Call
    public final boolean q() {
        return this.D;
    }
}
