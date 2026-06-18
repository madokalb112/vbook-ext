package defpackage;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class mj1 implements s58 {
    public final /* synthetic */ int a;

    @Override // defpackage.s58
    public final Object get() {
        switch (this.a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return ExecutorsRegistrar.a();
            case 2:
                ep5 ep5Var = ExecutorsRegistrar.a;
                return new xm2(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new o22("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 3:
                ep5 ep5Var2 = ExecutorsRegistrar.a;
                return new xm2(Executors.newCachedThreadPool(new o22("Firebase Blocking", 11, (StrictMode.ThreadPolicy) null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                ep5 ep5Var3 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new o22("Firebase Scheduler", 0, (StrictMode.ThreadPolicy) null));
            default:
                return null;
        }
    }
}
