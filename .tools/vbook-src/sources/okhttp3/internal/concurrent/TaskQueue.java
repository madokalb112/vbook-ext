package okhttp3.internal.concurrent;

import defpackage.ib4;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class TaskQueue {
    public final TaskRunner a;
    public final String b;
    public boolean c;
    public Task d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class AwaitIdleTask extends Task {
        @Override // okhttp3.internal.concurrent.Task
        public final long a() {
            throw null;
        }
    }

    public TaskQueue(TaskRunner taskRunner, String str) {
        this.a = taskRunner;
        this.b = str;
    }

    public static void c(TaskQueue taskQueue, final String str, long j, final ib4 ib4Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        final boolean z = (i & 4) != 0;
        taskQueue.getClass();
        str.getClass();
        ib4Var.getClass();
        taskQueue.d(new Task(str, z) { // from class: okhttp3.internal.concurrent.TaskQueue$execute$1
            @Override // okhttp3.internal.concurrent.Task
            public final long a() {
                ib4Var.invoke();
                return -1L;
            }
        }, j);
    }

    public final void a() {
        TaskRunner taskRunner = this.a;
        TimeZone timeZone = _UtilJvmKt.a;
        synchronized (taskRunner) {
            if (b()) {
                this.a.c(this);
            }
        }
    }

    public final boolean b() {
        Task task = this.d;
        if (task != null && task.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((Task) arrayList.get(size)).b) {
                Logger logger = this.a.b;
                Task task2 = (Task) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(logger, task2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void d(Task task, long j) {
        task.getClass();
        synchronized (this.a) {
            if (!this.c) {
                if (e(task, j, false)) {
                    this.a.c(this);
                }
                return;
            }
            boolean z = task.b;
            Logger logger = this.a.b;
            if (z) {
                if (logger.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(logger, task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (logger.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(logger, task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(okhttp3.internal.concurrent.Task r12, long r13, boolean r15) {
        /*
            r11 = this;
            okhttp3.internal.concurrent.TaskRunner r0 = r11.a
            java.util.logging.Logger r0 = r0.b
            r12.getClass()
            okhttp3.internal.concurrent.TaskQueue r1 = r12.c
            r2 = 0
            if (r1 != r11) goto Ld
            goto L11
        Ld:
            if (r1 != 0) goto L87
            r12.c = r11
        L11:
            long r3 = java.lang.System.nanoTime()
            long r5 = r3 + r13
            java.util.ArrayList r1 = r11.e
            int r7 = r1.indexOf(r12)
            r8 = -1
            if (r7 == r8) goto L37
            long r9 = r12.d
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 > 0) goto L34
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r13 = r0.isLoggable(r13)
            if (r13 == 0) goto L86
            java.lang.String r13 = "already scheduled"
            okhttp3.internal.concurrent.TaskLoggerKt.a(r0, r12, r11, r13)
            return r2
        L34:
            r1.remove(r7)
        L37:
            r12.d = r5
            java.util.logging.Level r7 = java.util.logging.Level.FINE
            boolean r7 = r0.isLoggable(r7)
            if (r7 == 0) goto L5d
            if (r15 == 0) goto L4f
            long r5 = r5 - r3
            java.lang.String r15 = okhttp3.internal.concurrent.TaskLoggerKt.b(r5)
            java.lang.String r5 = "run again after "
            java.lang.String r15 = r5.concat(r15)
            goto L5a
        L4f:
            long r5 = r5 - r3
            java.lang.String r15 = okhttp3.internal.concurrent.TaskLoggerKt.b(r5)
            java.lang.String r5 = "scheduled after "
            java.lang.String r15 = r5.concat(r15)
        L5a:
            okhttp3.internal.concurrent.TaskLoggerKt.a(r0, r12, r11, r15)
        L5d:
            int r11 = r1.size()
            r15 = r2
            r0 = r15
        L63:
            if (r0 >= r11) goto L78
            java.lang.Object r5 = r1.get(r0)
            int r0 = r0 + 1
            okhttp3.internal.concurrent.Task r5 = (okhttp3.internal.concurrent.Task) r5
            long r5 = r5.d
            long r5 = r5 - r3
            int r5 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r5 <= 0) goto L75
            goto L79
        L75:
            int r15 = r15 + 1
            goto L63
        L78:
            r15 = r8
        L79:
            if (r15 != r8) goto L7f
            int r15 = r1.size()
        L7f:
            r1.add(r15, r12)
            if (r15 != 0) goto L86
            r11 = 1
            return r11
        L86:
            return r2
        L87:
            java.lang.String r11 = "task is in multiple queues"
            gp.j(r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.concurrent.TaskQueue.e(okhttp3.internal.concurrent.Task, long, boolean):boolean");
    }

    public final void f() {
        TaskRunner taskRunner = this.a;
        TimeZone timeZone = _UtilJvmKt.a;
        synchronized (taskRunner) {
            this.c = true;
            if (b()) {
                this.a.c(this);
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
