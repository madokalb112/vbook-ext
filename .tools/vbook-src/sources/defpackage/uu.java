package defpackage;

import android.os.Build;
import android.widget.RemoteViews;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class uu {
    public static final uu a = new uu();

    public final void a(RemoteViews remoteViews, int i, at2 at2Var) {
        remoteViews.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            remoteViews.setBoolean(i, "setClipToOutline", true);
            if (at2Var instanceof ts2) {
                remoteViews.setViewOutlinePreferredRadius(i, ((ts2) at2Var).a, 1);
                return;
            } else {
                w58.t(at2Var.getClass().getCanonicalName(), "Rounded corners should not be ");
                return;
            }
        }
        throw new IllegalArgumentException(("setClipToOutline is only available on SDK 31 and higher").toString());
    }

    public final void b(RemoteViews remoteViews, int i, at2 at2Var) {
        if (at2Var instanceof ys2) {
            remoteViews.setViewLayoutHeight(i, -2.0f, 0);
            return;
        }
        if (at2Var instanceof us2) {
            remoteViews.setViewLayoutHeight(i, 0.0f, 0);
            return;
        }
        if (at2Var instanceof ts2) {
            remoteViews.setViewLayoutHeight(i, ((ts2) at2Var).a, 1);
        } else if (lc5.Q(at2Var, vs2.a)) {
            remoteViews.setViewLayoutHeight(i, -1.0f, 0);
        } else {
            mn5.g();
        }
    }

    public final void c(RemoteViews remoteViews, int i, at2 at2Var) {
        if (at2Var instanceof ys2) {
            remoteViews.setViewLayoutWidth(i, -2.0f, 0);
            return;
        }
        if (at2Var instanceof us2) {
            remoteViews.setViewLayoutWidth(i, 0.0f, 0);
            return;
        }
        if (at2Var instanceof ts2) {
            remoteViews.setViewLayoutWidth(i, ((ts2) at2Var).a, 1);
        } else if (lc5.Q(at2Var, vs2.a)) {
            remoteViews.setViewLayoutWidth(i, -1.0f, 0);
        } else {
            mn5.g();
        }
    }
}
