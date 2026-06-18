package defpackage;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fz3 {
    public final gy3 a;
    public final j69 b;

    public fz3(gy3 gy3Var, j69 j69Var, jx1 jx1Var, h69 h69Var) {
        gy3Var.getClass();
        j69Var.getClass();
        jx1Var.getClass();
        h69Var.getClass();
        this.a = gy3Var;
        this.b = j69Var;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.5.");
        gy3Var.a();
        Context applicationContext = gy3Var.a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(h69Var);
            ah1.J(wx1.b(jx1Var), null, null, new yw3(this, h69Var, (jt1) null, 2), 3);
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
