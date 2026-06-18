package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class xb5 extends AtomicReference implements Runnable {
    public static final m9c a = new m9c(4);
    public static final m9c b = new m9c(4);

    public abstract void a(Throwable th);

    public abstract void b(Object obj);

    public final void c() {
        Runnable runnable = b;
        m9c m9cVar = a;
        Runnable runnable2 = (Runnable) get();
        if (runnable2 instanceof Thread) {
            wb5 wb5Var = new wb5(this);
            wb5.a(wb5Var, Thread.currentThread());
            if (compareAndSet(runnable2, wb5Var)) {
                try {
                    ((Thread) runnable2).interrupt();
                } finally {
                    if (((Runnable) getAndSet(m9cVar)) == runnable) {
                        LockSupport.unpark((Thread) runnable2);
                    }
                }
            }
        }
    }

    public abstract boolean d();

    public abstract Object e();

    public abstract String f();

    public final void g(Thread thread) {
        Runnable runnable = (Runnable) get();
        wb5 wb5Var = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof wb5;
            Runnable runnable2 = b;
            if (!z2 && runnable != runnable2) {
                break;
            }
            if (z2) {
                wb5Var = (wb5) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                z = Thread.interrupted() || z;
                LockSupport.park(wb5Var);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objE = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zD = d();
            m9c m9cVar = a;
            if (!zD) {
                try {
                    objE = e();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, m9cVar)) {
                            g(threadCurrentThread);
                        }
                        if (zD) {
                            return;
                        }
                        a(th);
                        return;
                    } finally {
                        if (!compareAndSet(threadCurrentThread, m9cVar)) {
                            g(threadCurrentThread);
                        }
                        if (!zD) {
                            b(null);
                        }
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        m9c m9cVar = (Runnable) get();
        if (m9cVar == a) {
            str = "running=[DONE]";
        } else if (m9cVar instanceof wb5) {
            str = "running=[INTERRUPTED]";
        } else if (m9cVar instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) m9cVar).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder sbV = xv5.v(str, ", ");
        sbV.append(f());
        return sbV.toString();
    }
}
