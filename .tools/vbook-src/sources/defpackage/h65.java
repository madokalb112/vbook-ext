package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class h65 {
    public final int a;
    public final ArrayList b;

    public h65(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h65)) {
            return false;
        }
        h65 h65Var = (h65) obj;
        return this.a == h65Var.a && this.b.equals(h65Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "IndexTag(tagId=" + this.a + ", tagValues=" + this.b + ")";
    }
}
