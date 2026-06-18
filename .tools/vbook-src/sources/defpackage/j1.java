package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mozilla.javascript.ES6Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class j1 implements ListenableFuture {
    private static final t0 ATOMIC_HELPER;
    static final boolean GENERATE_CANCELLATION_CAUSES;
    private static final Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    static final vt5 log;
    private volatile x0 listeners;
    private volatile Object value;
    private volatile i1 waiters;

    static {
        boolean z;
        Throwable th;
        t0 a1Var;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        GENERATE_CANCELLATION_CAUSES = z;
        log = new vt5(j1.class);
        Throwable th2 = null;
        try {
            a1Var = new h1();
            th = null;
        } catch (Error | Exception e) {
            th = e;
            try {
                a1Var = new y0(AtomicReferenceFieldUpdater.newUpdater(i1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i1.class, i1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(j1.class, i1.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(j1.class, x0.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(j1.class, Object.class, ES6Iterator.VALUE_PROPERTY));
            } catch (Error | Exception e2) {
                th2 = e2;
                a1Var = new a1();
            }
        }
        ATOMIC_HELPER = a1Var;
        if (th2 != null) {
            vt5 vt5Var = log;
            Logger loggerA = vt5Var.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th);
            vt5Var.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        NULL = new Object();
    }

    public static void c(j1 j1Var, boolean z) {
        x0 x0Var = null;
        while (true) {
            j1Var.getClass();
            for (i1 i1VarE = ATOMIC_HELPER.e(j1Var); i1VarE != null; i1VarE = i1VarE.b) {
                Thread thread = i1VarE.a;
                if (thread != null) {
                    i1VarE.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                j1Var.interruptTask();
                z = false;
            }
            j1Var.afterDone();
            x0 x0Var2 = x0Var;
            x0 x0VarD = ATOMIC_HELPER.d(j1Var);
            x0 x0Var3 = x0Var2;
            while (x0VarD != null) {
                x0 x0Var4 = x0VarD.c;
                x0VarD.c = x0Var3;
                x0Var3 = x0VarD;
                x0VarD = x0Var4;
            }
            while (x0Var3 != null) {
                x0Var = x0Var3.c;
                Runnable runnable = x0Var3.a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof z0) {
                    z0 z0Var = (z0) runnable;
                    j1Var = z0Var.a;
                    if (j1Var.value == z0Var) {
                        if (ATOMIC_HELPER.b(j1Var, z0Var, f(z0Var.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = x0Var3.b;
                    Objects.requireNonNull(executor);
                    d(runnable, executor);
                }
                x0Var3 = x0Var;
            }
            return;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            log.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof u0) {
            Throwable th = ((u0) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof w0) {
            throw new ExecutionException(((w0) obj).a);
        }
        if (obj == NULL) {
            return null;
        }
        return obj;
    }

    public static Object f(ListenableFuture listenableFuture) {
        Object obj;
        Throwable thTryInternalFastPathGetFailure;
        if (listenableFuture instanceof b1) {
            Object u0Var = ((j1) listenableFuture).value;
            if (u0Var instanceof u0) {
                u0 u0Var2 = (u0) u0Var;
                if (u0Var2.a) {
                    u0Var = u0Var2.b != null ? new u0(false, u0Var2.b) : u0.d;
                }
            }
            Objects.requireNonNull(u0Var);
            return u0Var;
        }
        if ((listenableFuture instanceof j1) && (thTryInternalFastPathGetFailure = ((j1) listenableFuture).tryInternalFastPathGetFailure()) != null) {
            return new w0(thTryInternalFastPathGetFailure);
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        boolean z = true;
        if ((!GENERATE_CANCELLATION_CAUSES) && zIsCancelled) {
            u0 u0Var3 = u0.d;
            Objects.requireNonNull(u0Var3);
            return u0Var3;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = listenableFuture.get();
                        break;
                    } catch (Error e) {
                        e = e;
                        return new w0(e);
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (Error | Exception e2) {
                e = e2;
                return new w0(e);
            } catch (CancellationException e3) {
                if (zIsCancelled) {
                    return new u0(false, e3);
                }
                return new w0(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e3));
            } catch (ExecutionException e4) {
                if (!zIsCancelled) {
                    return new w0(e4.getCause());
                }
                return new u0(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture, e4));
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? NULL : obj;
        }
        return new u0(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture));
    }

    public final void a(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (Exception e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        b(sb, obj);
        sb.append("]");
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        x0 x0Var;
        x0 x0Var2 = x0.d;
        fx1.N(runnable, "Runnable was null.");
        fx1.N(executor, "Executor was null.");
        if (!isDone() && (x0Var = this.listeners) != x0Var2) {
            x0 x0Var3 = new x0(runnable, executor);
            do {
                x0Var3.c = x0Var;
                if (ATOMIC_HELPER.a(this, x0Var, x0Var3)) {
                    return;
                } else {
                    x0Var = this.listeners;
                }
            } while (x0Var != x0Var2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        u0 u0Var;
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof z0)) {
            return false;
        }
        if (GENERATE_CANCELLATION_CAUSES) {
            u0Var = new u0(z, new CancellationException("Future.cancel() was called."));
        } else {
            u0Var = z ? u0.c : u0.d;
            Objects.requireNonNull(u0Var);
        }
        boolean z2 = false;
        while (true) {
            if (ATOMIC_HELPER.b(this, obj, u0Var)) {
                c(this, z);
                if (!(obj instanceof z0)) {
                    break;
                }
                ListenableFuture listenableFuture = ((z0) obj).b;
                if (!(listenableFuture instanceof b1)) {
                    listenableFuture.cancel(z);
                    break;
                }
                this = (j1) listenableFuture;
                obj = this.value;
                if (!(obj == null) && !(obj instanceof z0)) {
                    break;
                }
                z2 = true;
            } else {
                obj = this.value;
                if (!(obj instanceof z0)) {
                    return z2;
                }
            }
        }
        return true;
    }

    public final void g(i1 i1Var) {
        i1Var.a = null;
        while (true) {
            i1 i1Var2 = this.waiters;
            if (i1Var2 == i1.c) {
                return;
            }
            i1 i1Var3 = null;
            while (i1Var2 != null) {
                i1 i1Var4 = i1Var2.b;
                if (i1Var2.a != null) {
                    i1Var3 = i1Var2;
                } else if (i1Var3 != null) {
                    i1Var3.b = i1Var4;
                    if (i1Var3.a == null) {
                        break;
                    }
                } else if (!ATOMIC_HELPER.c(this, i1Var2, i1Var4)) {
                    break;
                }
                i1Var2 = i1Var4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        long j2;
        i1 i1Var = i1.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) && (!(obj instanceof z0))) {
            return e(obj);
        }
        long j3 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= SPIN_THRESHOLD_NANOS) {
            i1 i1Var2 = this.waiters;
            if (i1Var2 != i1Var) {
                i1 i1Var3 = new i1();
                z = true;
                while (true) {
                    ATOMIC_HELPER.f(i1Var3, i1Var2);
                    if (ATOMIC_HELPER.c(this, i1Var2, i1Var3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                g(i1Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof z0))) {
                                return e(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= SPIN_THRESHOLD_NANOS);
                        g(i1Var3);
                    } else {
                        long j4 = j3;
                        i1Var2 = this.waiters;
                        if (i1Var2 == i1Var) {
                            break;
                        }
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.value;
            Objects.requireNonNull(obj3);
            return e(obj3);
        }
        z = true;
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = this.value;
            if ((obj4 != null ? z : false) && (!(obj4 instanceof z0))) {
                return e(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbO = j39.o(j, "Waited ", " ");
        sbO.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbO.toString();
        if (nanos + SPIN_THRESHOLD_NANOS < j2) {
            String strConcat = string3.concat(" (plus ");
            long j5 = -nanos;
            long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(jConvert);
            boolean z2 = (jConvert == j2 || nanos2 > SPIN_THRESHOLD_NANOS) ? z : false;
            if (jConvert > j2) {
                String strConcat2 = strConcat + jConvert + " " + lowerCase;
                if (z2) {
                    strConcat2 = strConcat2.concat(",");
                }
                strConcat = strConcat2.concat(" ");
            }
            if (z2) {
                strConcat = strConcat + nanos2 + " nanoseconds ";
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(dx1.h(string3, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof u0;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r2 instanceof z0)) & (this.value != null);
    }

    public final void maybePropagateCancellationTo(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String pendingToString() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public boolean set(Object obj) {
        if (obj == null) {
            obj = NULL;
        }
        if (!ATOMIC_HELPER.b(this, null, obj)) {
            return false;
        }
        c(this, false);
        return true;
    }

    public boolean setException(Throwable th) {
        th.getClass();
        if (!ATOMIC_HELPER.b(this, null, new w0(th))) {
            return false;
        }
        c(this, false);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean setFuture(com.google.common.util.concurrent.ListenableFuture r6) {
        /*
            r5 = this;
            r6.getClass()
            java.lang.Object r0 = r5.value
            r1 = 0
            if (r0 != 0) goto L44
            boolean r0 = r6.isDone()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L20
            java.lang.Object r6 = f(r6)
            t0 r0 = defpackage.j1.ATOMIC_HELPER
            boolean r6 = r0.b(r5, r3, r6)
            if (r6 == 0) goto L4f
            c(r5, r1)
            return r2
        L20:
            z0 r0 = new z0
            r0.<init>(r5, r6)
            t0 r4 = defpackage.j1.ATOMIC_HELPER
            boolean r3 = r4.b(r5, r3, r0)
            if (r3 == 0) goto L42
            et2 r1 = et2.a     // Catch: java.lang.Throwable -> L33
            r6.addListener(r0, r1)     // Catch: java.lang.Throwable -> L33
            return r2
        L33:
            r6 = move-exception
            w0 r1 = new w0     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            w0 r1 = defpackage.w0.b
        L3c:
            t0 r6 = defpackage.j1.ATOMIC_HELPER
            r6.b(r5, r0, r1)
            return r2
        L42:
            java.lang.Object r0 = r5.value
        L44:
            boolean r5 = r0 instanceof defpackage.u0
            if (r5 == 0) goto L4f
            u0 r0 = (defpackage.u0) r0
            boolean r5 = r0.a
            r6.cancel(r5)
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j1.setFuture(com.google.common.util.concurrent.ListenableFuture):boolean");
    }

    public String toString() {
        String strPendingToString;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.value;
            if (obj instanceof z0) {
                sb.append(", setFuture=[");
                ListenableFuture listenableFuture = ((z0) obj).b;
                try {
                    if (listenableFuture == this) {
                        sb.append("this future");
                    } else {
                        sb.append(listenableFuture);
                    }
                } catch (Exception e) {
                    e = e;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                } catch (StackOverflowError e2) {
                    e = e2;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strPendingToString = pendingToString();
                    if (ny1.m0(strPendingToString)) {
                        strPendingToString = null;
                    }
                } catch (Exception | StackOverflowError e3) {
                    strPendingToString = "Exception thrown from implementation: " + e3.getClass();
                }
                if (strPendingToString != null) {
                    sb.append(", info=[");
                    sb.append(strPendingToString);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                a(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final Throwable tryInternalFastPathGetFailure() {
        if (!(this instanceof b1)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof w0) {
            return ((w0) obj).a;
        }
        return null;
    }

    public final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof u0) && ((u0) obj).a;
    }

    public void afterDone() {
    }

    public void interruptTask() {
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        i1 i1Var = i1.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof z0))) {
                return e(obj2);
            }
            i1 i1Var2 = this.waiters;
            if (i1Var2 != i1Var) {
                i1 i1Var3 = new i1();
                do {
                    ATOMIC_HELPER.f(i1Var3, i1Var2);
                    if (ATOMIC_HELPER.c(this, i1Var2, i1Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                g(i1Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof z0))));
                        return e(obj);
                    }
                    i1Var2 = this.waiters;
                } while (i1Var2 != i1Var);
            }
            Object obj3 = this.value;
            Objects.requireNonNull(obj3);
            return e(obj3);
        }
        throw new InterruptedException();
    }
}
