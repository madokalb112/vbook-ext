package okhttp3.internal.concurrent;

import defpackage.dx1;
import defpackage.ky0;
import defpackage.r7c;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class TaskRunner implements Lockable {
    public static final Logger w;
    public static final TaskRunner x;
    public final RealBackend a;
    public final Logger b;
    public int c;
    public boolean d;
    public long e;
    public int f;
    public int s;
    public final ArrayList t;
    public final ArrayList u;
    public final TaskRunner$runnable$1 v;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public interface Backend {
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class RealBackend implements Backend {
        public final ThreadPoolExecutor a;

        public RealBackend(r7c r7cVar) {
            this.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), r7cVar);
        }
    }

    static {
        Logger logger = Logger.getLogger(TaskRunner.class.getName());
        logger.getClass();
        w = logger;
        x = new TaskRunner(new RealBackend(new r7c(ky0.s(_UtilJvmKt.b, " TaskRunner", new StringBuilder()), true)));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [okhttp3.internal.concurrent.TaskRunner$runnable$1] */
    public TaskRunner(RealBackend realBackend) {
        Logger logger = w;
        logger.getClass();
        this.a = realBackend;
        this.b = logger;
        this.c = 10000;
        this.t = new ArrayList();
        this.u = new ArrayList();
        this.v = new Runnable() { // from class: okhttp3.internal.concurrent.TaskRunner$runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                Task taskB;
                long jNanoTime;
                Task taskB2;
                TaskRunner taskRunner = this.a;
                synchronized (taskRunner) {
                    taskRunner.s++;
                    taskB = taskRunner.b();
                }
                if (taskB == null) {
                    return;
                }
                Thread threadCurrentThread = Thread.currentThread();
                String name = threadCurrentThread.getName();
                while (true) {
                    try {
                        threadCurrentThread.setName(taskB.a);
                        Logger logger2 = this.a.b;
                        TaskQueue taskQueue = taskB.c;
                        taskQueue.getClass();
                        boolean zIsLoggable = logger2.isLoggable(Level.FINE);
                        if (zIsLoggable) {
                            jNanoTime = System.nanoTime();
                            TaskLoggerKt.a(logger2, taskB, taskQueue, "starting");
                        } else {
                            jNanoTime = -1;
                        }
                        try {
                            long jA = taskB.a();
                            if (zIsLoggable) {
                                TaskLoggerKt.a(logger2, taskB, taskQueue, "finished run in " + TaskLoggerKt.b(System.nanoTime() - jNanoTime));
                            }
                            TaskRunner taskRunner2 = this.a;
                            synchronized (taskRunner2) {
                                TaskRunner.a(taskRunner2, taskB, jA, true);
                                taskB2 = taskRunner2.b();
                            }
                            if (taskB2 == null) {
                                return;
                            } else {
                                taskB = taskB2;
                            }
                        } catch (Throwable th) {
                            if (zIsLoggable) {
                                TaskLoggerKt.a(logger2, taskB, taskQueue, "failed a run in " + TaskLoggerKt.b(System.nanoTime() - jNanoTime));
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            TaskRunner taskRunner3 = this.a;
                            synchronized (taskRunner3) {
                                TaskRunner.a(taskRunner3, taskB, -1L, false);
                                if (!(th2 instanceof InterruptedException)) {
                                    throw th2;
                                }
                                Thread.currentThread().interrupt();
                                return;
                            }
                        } finally {
                            threadCurrentThread.setName(name);
                        }
                    }
                }
            }
        };
    }

    public static final void a(TaskRunner taskRunner, Task task, long j, boolean z) {
        TimeZone timeZone = _UtilJvmKt.a;
        TaskQueue taskQueue = task.c;
        taskQueue.getClass();
        if (taskQueue.d != task) {
            gp.j("Check failed.");
            return;
        }
        boolean z2 = taskQueue.f;
        taskQueue.f = false;
        taskQueue.d = null;
        taskRunner.t.remove(taskQueue);
        if (j != -1 && !z2 && !taskQueue.c) {
            taskQueue.e(task, j, true);
        }
        if (taskQueue.e.isEmpty()) {
            return;
        }
        taskRunner.u.add(taskQueue);
        if (z) {
            return;
        }
        taskRunner.e();
    }

    public final Task b() {
        long j;
        Task task;
        boolean z;
        TimeZone timeZone = _UtilJvmKt.a;
        while (true) {
            ArrayList arrayList = this.u;
            if (arrayList.isEmpty()) {
                return null;
            }
            long jNanoTime = System.nanoTime();
            int size = arrayList.size();
            long jMin = Long.MAX_VALUE;
            int i = 0;
            Task task2 = null;
            while (true) {
                if (i >= size) {
                    j = jNanoTime;
                    task = null;
                    z = false;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                Task task3 = (Task) ((TaskQueue) obj).e.get(0);
                j = jNanoTime;
                task = null;
                long jMax = Math.max(0L, task3.d - j);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (task2 != null) {
                        z = true;
                        break;
                    }
                    task2 = task3;
                }
                jNanoTime = j;
            }
            ArrayList arrayList2 = this.t;
            if (task2 != null) {
                TimeZone timeZone2 = _UtilJvmKt.a;
                task2.d = -1L;
                TaskQueue taskQueue = task2.c;
                taskQueue.getClass();
                taskQueue.e.remove(task2);
                arrayList.remove(taskQueue);
                taskQueue.d = task2;
                arrayList2.add(taskQueue);
                if (z || (!this.d && !arrayList.isEmpty())) {
                    e();
                }
                return task2;
            }
            if (this.d) {
                if (jMin >= this.e - j) {
                    return task;
                }
                notify();
                return task;
            }
            this.d = true;
            this.e = j + jMin;
            try {
                try {
                    TimeZone timeZone3 = _UtilJvmKt.a;
                    if (jMin > 0) {
                        long j2 = jMin / 1000000;
                        long j3 = jMin - (1000000 * j2);
                        if (j2 > 0 || jMin > 0) {
                            wait(j2, (int) j3);
                        }
                    }
                } catch (InterruptedException unused) {
                    TimeZone timeZone4 = _UtilJvmKt.a;
                    for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                        ((TaskQueue) arrayList2.get(size2)).b();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        TaskQueue taskQueue2 = (TaskQueue) arrayList.get(size3);
                        taskQueue2.b();
                        if (taskQueue2.e.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
            } finally {
                this.d = false;
            }
        }
    }

    public final void c(TaskQueue taskQueue) {
        taskQueue.getClass();
        TimeZone timeZone = _UtilJvmKt.a;
        if (taskQueue.d == null) {
            boolean zIsEmpty = taskQueue.e.isEmpty();
            ArrayList arrayList = this.u;
            if (zIsEmpty) {
                arrayList.remove(taskQueue);
            } else {
                byte[] bArr = _UtilCommonKt.a;
                arrayList.getClass();
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        if (this.d) {
            notify();
        } else {
            e();
        }
    }

    public final TaskQueue d() {
        int i;
        synchronized (this) {
            i = this.c;
            this.c = i + 1;
        }
        return new TaskQueue(this, dx1.f(i, "Q"));
    }

    public final void e() {
        TimeZone timeZone = _UtilJvmKt.a;
        int i = this.f;
        if (i > this.s) {
            return;
        }
        this.f = i + 1;
        TaskRunner$runnable$1 taskRunner$runnable$1 = this.v;
        taskRunner$runnable$1.getClass();
        this.a.a.execute(taskRunner$runnable$1);
    }
}
