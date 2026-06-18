package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class d65 {
    public final ArrayList a;
    public final HashMap b;

    public d65(ArrayList arrayList, HashMap map) {
        this.a = arrayList;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d65)) {
            return false;
        }
        d65 d65Var = (d65) obj;
        return this.a.equals(d65Var.a) && this.b.equals(d65Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IndexData(table=" + this.a + ", cncx=" + this.b + ")";
    }
}
