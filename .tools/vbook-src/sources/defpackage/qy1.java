package defpackage;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qy1 implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ k80 d;
    public final /* synthetic */ sy1 e;

    public qy1(sy1 sy1Var, long j, Throwable th, Thread thread, k80 k80Var) {
        this.e = sy1Var;
        this.a = j;
        this.b = th;
        this.c = thread;
        this.d = k80Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        long j = this.a;
        long j2 = j / 1000;
        sy1 sy1Var = this.e;
        String strE = sy1Var.e();
        if (strE == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult((Object) null);
        }
        sy1Var.c.t();
        oj1 oj1Var = sy1Var.m;
        oj1Var.getClass();
        String strConcat = "Persisting fatal event for session ".concat(strE);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        oj1Var.x(this.b, this.c, "crash", new hh3(strE, j2, mc3.a), true);
        try {
            fx3 fx3Var = sy1Var.g;
            String str = ".ae" + j;
            fx3Var.getClass();
            if (!new File((File) fx3Var.d, str).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e);
        }
        k80 k80Var = this.d;
        sy1Var.b(false, k80Var, false);
        sy1Var.c(new jw0().a, Boolean.FALSE);
        return !sy1Var.b.j() ? Tasks.forResult((Object) null) : ((TaskCompletionSource) ((AtomicReference) k80Var.i).get()).getTask().onSuccessTask((f02) sy1Var.e.b, new gi8(this, strE));
    }
}
