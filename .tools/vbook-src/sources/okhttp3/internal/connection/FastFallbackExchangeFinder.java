package okhttp3.internal.connection;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RoutePlanner;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class FastFallbackExchangeFinder implements ExchangeFinder {
    public final RealRoutePlanner a;
    public final TaskRunner b;
    public long c;
    public final CopyOnWriteArrayList d;
    public final BlockingQueue e;

    public FastFallbackExchangeFinder(RealRoutePlanner realRoutePlanner, TaskRunner taskRunner) {
        taskRunner.getClass();
        this.a = realRoutePlanner;
        this.b = taskRunner;
        this.c = Long.MIN_VALUE;
        this.d = new CopyOnWriteArrayList();
        this.e = new LinkedBlockingDeque();
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    public final RealConnection a() throws IOException {
        RoutePlanner.ConnectResult connectResultD;
        long j;
        RoutePlanner.ConnectResult connectResult;
        RealRoutePlanner realRoutePlanner = this.a;
        CopyOnWriteArrayList copyOnWriteArrayList = this.d;
        IOException iOException = null;
        while (true) {
            try {
                if (copyOnWriteArrayList.isEmpty() && !realRoutePlanner.a(null)) {
                    c();
                    iOException.getClass();
                    throw iOException;
                }
                if (realRoutePlanner.k.D) {
                    throw new IOException("Canceled");
                }
                TaskRunner.RealBackend realBackend = this.b.a;
                long jNanoTime = System.nanoTime();
                long j2 = this.c - jNanoTime;
                if (copyOnWriteArrayList.isEmpty() || j2 <= 0) {
                    connectResultD = d();
                    j = 250000000;
                    this.c = jNanoTime + 250000000;
                } else {
                    j = j2;
                    connectResultD = null;
                }
                if (connectResultD == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    if (copyOnWriteArrayList.isEmpty() || (connectResult = (RoutePlanner.ConnectResult) this.e.poll(j, timeUnit)) == null) {
                        connectResultD = null;
                    } else {
                        copyOnWriteArrayList.remove(connectResult.a);
                        connectResultD = connectResult;
                    }
                    if (connectResultD == null) {
                    }
                }
                RoutePlanner.Plan plan = connectResultD.a;
                boolean z = false;
                if (connectResultD.b == null && connectResultD.c == null) {
                    c();
                    if (!plan.a()) {
                        connectResultD = plan.g();
                    }
                    if (connectResultD.b == null && connectResultD.c == null) {
                        z = true;
                    }
                    if (z) {
                        return connectResultD.a.d();
                    }
                }
                Throwable th = connectResultD.c;
                if (th != null) {
                    if (!(th instanceof IOException)) {
                        throw th;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th;
                    } else {
                        i12.r(iOException, th);
                    }
                }
                RoutePlanner.Plan plan2 = connectResultD.b;
                if (plan2 != null) {
                    realRoutePlanner.p.addFirst(plan2);
                }
            } finally {
                c();
            }
        }
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    public final RoutePlanner b() {
        return this.a;
    }

    public final void c() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            RoutePlanner.Plan plan = (RoutePlanner.Plan) it.next();
            plan.cancel();
            RoutePlanner.Plan planB = plan.b();
            if (planB != null) {
                this.a.p.addLast(planB);
            }
        }
        copyOnWriteArrayList.clear();
    }

    public final RoutePlanner.ConnectResult d() {
        final RoutePlanner.Plan failedPlan;
        RealRoutePlanner realRoutePlanner = this.a;
        if (realRoutePlanner.a(null)) {
            try {
                failedPlan = realRoutePlanner.d();
            } catch (Throwable th) {
                failedPlan = new FailedPlan(th);
            }
            if (failedPlan.a()) {
                return new RoutePlanner.ConnectResult(failedPlan, null, null, 6);
            }
            if (failedPlan instanceof FailedPlan) {
                return ((FailedPlan) failedPlan).a;
            }
            this.d.add(failedPlan);
            final String str = _UtilJvmKt.b + " connect " + realRoutePlanner.i.h.f();
            this.b.d().d(new Task(str) { // from class: okhttp3.internal.connection.FastFallbackExchangeFinder$launchTcpConnect$1
                @Override // okhttp3.internal.concurrent.Task
                public final long a() throws InterruptedException {
                    RoutePlanner.ConnectResult connectResult;
                    RoutePlanner.Plan plan = failedPlan;
                    try {
                        connectResult = plan.e();
                    } catch (Throwable th2) {
                        connectResult = new RoutePlanner.ConnectResult(plan, null, th2, 2);
                    }
                    FastFallbackExchangeFinder fastFallbackExchangeFinder = this;
                    if (!fastFallbackExchangeFinder.d.contains(plan)) {
                        return -1L;
                    }
                    fastFallbackExchangeFinder.e.put(connectResult);
                    return -1L;
                }
            }, 0L);
        }
        return null;
    }
}
