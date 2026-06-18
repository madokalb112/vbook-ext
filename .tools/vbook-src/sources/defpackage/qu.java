package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qu {
    public final String a;
    public final vb b;

    public qu(String str, vb vbVar) {
        j39.v(str, Build.MODEL, Build.VERSION.RELEASE);
        this.a = str;
        this.b = vbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu)) {
            return false;
        }
        qu quVar = (qu) obj;
        if (!lc5.Q(this.a, quVar.a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!lc5.Q(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return lc5.Q(str2, str2) && this.b.equals(quVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((u36.LOG_ENVIRONMENT_PROD.hashCode() + j39.a((((Build.MODEL.hashCode() + (this.a.hashCode() * 31)) * 31) + 48517564) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.5, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + u36.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.b + ')';
    }
}
