package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ue4 {
    public final String a;
    public final Map b;

    public ue4(String str, Map map) {
        str.getClass();
        map.getClass();
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ue4)) {
            return false;
        }
        ue4 ue4Var = (ue4) obj;
        return lc5.Q(this.a, ue4Var.a) && lc5.Q(this.b, ue4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GetReadExtensionTranslateData(id=" + this.a + ", translateData=" + this.b + ")";
    }
}
