package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xy1 {
    public final Context a;
    public final q32 b;
    public final ab6 c;
    public final long d;
    public c85 e;
    public c85 f;
    public sy1 g;
    public final yx4 h;
    public final fx3 i;
    public final z9 j;
    public final z9 k;
    public final py1 l;
    public final zy1 m;
    public final vf8 n;
    public final y91 o;

    public xy1(gy3 gy3Var, yx4 yx4Var, zy1 zy1Var, q32 q32Var, z9 z9Var, z9 z9Var2, fx3 fx3Var, py1 py1Var, vf8 vf8Var, y91 y91Var) {
        this.b = q32Var;
        gy3Var.a();
        this.a = gy3Var.a;
        this.h = yx4Var;
        this.m = zy1Var;
        this.j = z9Var;
        this.k = z9Var2;
        this.i = fx3Var;
        this.l = py1Var;
        this.n = vf8Var;
        this.o = y91Var;
        this.d = System.currentTimeMillis();
        this.c = new ab6(10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [vy1] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(k80 k80Var) {
        y91.m();
        y91.m();
        this.e.t();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.j.d(new Object() { // from class: vy1
                });
                this.g.g();
                if (!k80Var.c().b.a) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.g.d(k80Var)) {
                    Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                }
                this.g.h(((TaskCompletionSource) ((AtomicReference) k80Var.i).get()).getTask());
                c();
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                c();
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }

    public final void b(k80 k80Var) {
        Future<?> futureSubmit = ((f02) this.o.b).a.submit(new ty1(this, k80Var, 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e3);
        }
    }

    public final void c() {
        y91.m();
        try {
            c85 c85Var = this.e;
            fx3 fx3Var = (fx3) c85Var.b;
            String str = (String) c85Var.a;
            fx3Var.getClass();
            if (new File((File) fx3Var.d, str).delete()) {
                return;
            }
            Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
        }
    }
}
