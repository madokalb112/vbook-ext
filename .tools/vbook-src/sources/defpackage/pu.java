package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class pu {
    public static final d6a a = new d6a(new s5(13));

    public static boolean a() {
        Object value = ((wb) a.getValue()).b.getValue();
        value.getClass();
        ApplicationInfo applicationInfo = ((PackageInfo) value).applicationInfo;
        boolean z = false;
        if (applicationInfo != null && (applicationInfo.flags & 2) == 0) {
            z = true;
        }
        return !z;
    }
}
