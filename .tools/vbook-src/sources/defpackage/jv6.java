package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jv6 implements iv6 {
    public final Context a;
    public iw0 b;
    public final ym7 c = new ym7(1.0f);
    public oq9 d;

    public jv6(Context context) {
        this.a = context;
    }

    public final float a0() {
        jt1 jt1Var;
        dr9 dr9Var;
        if (this.d == null) {
            Context context = this.a;
            tz6 tz6Var = j0c.a;
            synchronized (tz6Var) {
                try {
                    Object objG = tz6Var.g(context);
                    jt1Var = null;
                    if (objG == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        ir0 ir0VarC = vm7.c(-1, 6, null);
                        objG = cx1.s0(new pp1(new yl0(contentResolver, uriFor, new i0c(ir0VarC, sw1.D(Looper.getMainLooper())), ir0VarC, context, null, 11), 6), wx1.o(), new yq9(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        tz6Var.n(context, objG);
                    }
                    dr9Var = (dr9) objG;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.c.i(((Number) dr9Var.getValue()).floatValue());
            iw0 iw0Var = this.b;
            if (iw0Var == null) {
                gp.j("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.d = ah1.J(iw0Var, null, null, new y46(dr9Var, this, jt1Var, 8), 3);
        }
        return this.c.h();
    }

    public final Object fold(Object obj, yb4 yb4Var) {
        return yb4Var.invoke(obj, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final hx1 get(ix1 ix1Var) {
        return gx1.G(this, ix1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final jx1 minusKey(ix1 ix1Var) {
        return gx1.Q(this, ix1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final jx1 plus(jx1 jx1Var) {
        return gx1.T(this, jx1Var);
    }
}
