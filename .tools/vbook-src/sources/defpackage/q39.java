package defpackage;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class q39 implements Executor {
    public final /* synthetic */ int a;
    public final Executor b;
    public final Object c;
    public Object d;
    public final Object e;

    public q39(Executor executor, int i) {
        this.a = i;
        switch (i) {
            case 1:
                executor.getClass();
                this.b = executor;
                this.c = new ArrayDeque();
                this.e = new Object();
                break;
            default:
                this.b = executor;
                this.c = new ArrayDeque();
                this.e = new Object();
                break;
        }
    }

    public void a() {
        switch (this.a) {
            case 0:
                Runnable runnable = (Runnable) ((ArrayDeque) this.c).poll();
                this.d = runnable;
                if (runnable != null) {
                    this.b.execute(runnable);
                    return;
                }
                return;
            default:
                synchronized (this.e) {
                    Object objPoll = ((ArrayDeque) this.c).poll();
                    Runnable runnable2 = (Runnable) objPoll;
                    this.d = runnable2;
                    if (objPoll != null) {
                        this.b.execute(runnable2);
                    }
                    break;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                synchronized (this.e) {
                    try {
                        ((ArrayDeque) this.c).add(new oc4(9, this, runnable));
                        if (((Runnable) this.d) == null) {
                            a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 1:
                runnable.getClass();
                synchronized (this.e) {
                    ((ArrayDeque) this.c).offer(new vc6(14, runnable, this));
                    if (((Runnable) this.d) == null) {
                        a();
                    }
                    break;
                }
                return;
            default:
                try {
                    this.b.execute(runnable);
                    return;
                } catch (RuntimeException e) {
                    if (((CancellationToken) this.c).isCancellationRequested()) {
                        ((CancellationTokenSource) this.d).cancel();
                    } else {
                        ((TaskCompletionSource) this.e).setException(e);
                    }
                    throw e;
                }
        }
    }

    public /* synthetic */ q39(Executor executor, CancellationToken cancellationToken, CancellationTokenSource cancellationTokenSource, TaskCompletionSource taskCompletionSource) {
        this.a = 2;
        this.b = executor;
        this.c = cancellationToken;
        this.d = cancellationTokenSource;
        this.e = taskCompletionSource;
    }
}
