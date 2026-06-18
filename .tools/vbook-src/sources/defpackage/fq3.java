package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fq3 {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;

    public fq3(HashMap map, HashMap map2, HashMap map3, HashMap map4) {
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = map4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fq3)) {
            return false;
        }
        fq3 fq3Var = (fq3) obj;
        return this.a.equals(fq3Var.a) && this.b.equals(fq3Var.b) && this.c.equals(fq3Var.c) && this.d.equals(fq3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ExtensionData(scriptData=" + this.a + ", infoData=" + this.b + ", featureData=" + this.c + ", configData=" + this.d + ")";
    }
}
