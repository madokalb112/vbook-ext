package defpackage;

import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zy1 {
    public static final s00 c = new s00(20);
    public final eh7 a;
    public final AtomicReference b = new AtomicReference(null);

    public zy1(eh7 eh7Var) {
        this.a = eh7Var;
        eh7Var.a(new y5(this, 4));
    }

    public final s00 a() {
        zy1 zy1Var = (zy1) this.b.get();
        return zy1Var == null ? c : zy1Var.a();
    }

    public final boolean b() {
        zy1 zy1Var = (zy1) this.b.get();
        return zy1Var != null && zy1Var.b();
    }

    public final boolean c() {
        zy1 zy1Var = (zy1) this.b.get();
        return zy1Var != null && zy1Var.c();
    }

    public final void d(String str, long j, w80 w80Var) {
        String strR = ky0.r("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strR, null);
        }
        this.a.a(new yy1(str, j, w80Var));
    }
}
