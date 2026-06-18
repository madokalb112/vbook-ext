package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class li3 extends ki3 implements im2 {
    public final Executor c;

    public li3(Executor executor) {
        Method method;
        this.c = executor;
        Method method2 = ln1.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = ln1.a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.nx1
    public final void A(jx1 jx1Var, Runnable runnable) {
        try {
            this.c.execute(runnable);
        } catch (RejectedExecutionException e) {
            qx1.o(jx1Var, e11.a("The task was rejected", e));
            aj2 aj2Var = rw2.a;
            nh2.c.A(jx1Var, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof li3) && ((li3) obj).c == this.c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.c);
    }

    @Override // defpackage.im2
    public final ax2 p(long j, Runnable runnable, jx1 jx1Var) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                qx1.o(jx1Var, e11.a("The task was rejected", e));
            }
        }
        return scheduledFutureSchedule != null ? new zw2(scheduledFutureSchedule) : og2.x.p(j, runnable, jx1Var);
    }

    @Override // defpackage.im2
    public final void q(long j, ay0 ay0Var) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            oc4 oc4Var = new oc4(6, this, ay0Var);
            jx1 jx1Var = ay0Var.e;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule((Runnable) oc4Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                qx1.o(jx1Var, e11.a("The task was rejected", e));
            }
        }
        if (scheduledFutureSchedule != null) {
            ay0Var.x(new ux0(scheduledFutureSchedule, 0));
        } else {
            og2.x.q(j, ay0Var);
        }
    }

    @Override // defpackage.nx1
    public final String toString() {
        return this.c.toString();
    }
}
