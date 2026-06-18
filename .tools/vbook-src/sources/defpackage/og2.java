package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class og2 extends eh3 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final og2 x;
    public static final long y;

    static {
        Long l;
        og2 og2Var = new og2();
        x = og2Var;
        og2Var.F0(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        y = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.eh3
    public final void W0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.W0(runnable);
    }

    @Override // defpackage.eh3
    public final Thread a1() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(x.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.eh3
    public final void c1(long j, ch3 ch3Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void i1() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            e1();
            notifyAll();
        }
    }

    @Override // defpackage.eh3, defpackage.im2
    public final ax2 p(long j, Runnable runnable, jx1 jx1Var) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return l77.a;
        }
        long jNanoTime = System.nanoTime();
        bh3 bh3Var = new bh3(j2 + jNanoTime, runnable);
        f1(jNanoTime, bh3Var);
        return bh3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zB1;
        isa.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zB1) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jO0 = O0();
                    if (jO0 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = y + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            i1();
                            if (b1()) {
                                return;
                            }
                            a1();
                            return;
                        }
                        if (jO0 > j2) {
                            jO0 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jO0 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            i1();
                            if (b1()) {
                                return;
                            }
                            a1();
                            return;
                        }
                        LockSupport.parkNanos(this, jO0);
                    }
                }
            }
        } finally {
            _thread = null;
            i1();
            if (!b1()) {
                a1();
            }
        }
    }

    @Override // defpackage.eh3, defpackage.zg3
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.nx1
    public final String toString() {
        return "DefaultExecutor";
    }
}
