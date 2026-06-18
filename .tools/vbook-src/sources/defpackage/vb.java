package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vb {
    public final String a;
    public final String b;
    public final String c;
    public final e38 d;
    public final ArrayList e;

    public vb(String str, String str2, String str3, e38 e38Var, ArrayList arrayList) {
        j39.v(str2, str3, Build.MANUFACTURER);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = e38Var;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb)) {
            return false;
        }
        vb vbVar = (vb) obj;
        if (!this.a.equals(vbVar.a) || !lc5.Q(this.b, vbVar.b) || !lc5.Q(this.c, vbVar.c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return lc5.Q(str, str) && this.d.equals(vbVar.d) && this.e.equals(vbVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.a + ", versionName=" + this.b + ", appBuildVersion=" + this.c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
