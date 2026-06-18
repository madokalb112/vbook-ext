package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class o7a {
    public final String a;
    public final String b;
    public final List c;

    public o7a(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7a)) {
            return false;
        }
        o7a o7aVar = (o7a) obj;
        return this.a.equals(o7aVar.a) && this.b.equals(o7aVar.b) && lc5.Q(this.c, o7aVar.c);
    }

    public final int hashCode() {
        int iA = j39.a(this.a.hashCode() * 31, 31, this.b);
        List list = this.c;
        return iA + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return tw2.t(j39.q("TOC(label=", this.a, ", href=", this.b, ", subitems="), this.c, ")");
    }
}
