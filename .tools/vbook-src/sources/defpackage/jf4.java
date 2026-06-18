package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import androidx.glance.appwidget.GlanceAppWidgetReceiver;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jf4 {
    public static h42 f;
    public final Context a;
    public final AppWidgetManager b;
    public final d6a c = new d6a(new rh(this, 7));
    public static final hf4 d = new hf4();
    public static final z08 e = qx1.J("GlanceAppWidgetManager", null, null, 14);
    public static final e18 g = new e18("list::Providers");

    public jf4(Context context) {
        this.a = context;
        this.b = AppWidgetManager.getInstance(context);
    }

    public final Object a(GlanceAppWidgetReceiver glanceAppWidgetReceiver, wd0 wd0Var, yw3 yw3Var) {
        d.getClass();
        String canonicalName = glanceAppWidgetReceiver.getClass().getCanonicalName();
        if (canonicalName == null) {
            gp.l("no receiver name");
            return null;
        }
        String canonicalName2 = wd0Var.getClass().getCanonicalName();
        if (canonicalName2 != null) {
            Object objA = ((h42) this.c.getValue()).a(new g62(canonicalName, canonicalName2, (jt1) null, 1), yw3Var);
            return objA == xx1.a ? objA : heb.a;
        }
        gp.l("no provider name");
        return null;
    }
}
