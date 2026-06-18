package defpackage;

import com.google.android.gms.internal.mlkit_common.zzav;
import java.util.Deque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nh6 extends zzav {
    public static final ThreadLocal b = new ThreadLocal();
    public final ThreadPoolExecutor a;

    public nh6() {
        ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) new LinkedBlockingQueue(), (ThreadFactory) new oi3(threadFactoryDefaultThreadFactory, 1));
        this.a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzav, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Deque deque = (Deque) b.get();
        if (deque == null || deque.size() > 1) {
            this.a.execute(new or8(runnable, 3));
            return;
        }
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzav, com.google.android.gms.internal.mlkit_common.zzx
    public final /* synthetic */ Object zza() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzav
    public final ExecutorService zzb() {
        return this.a;
    }
}
