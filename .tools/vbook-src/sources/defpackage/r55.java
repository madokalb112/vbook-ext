package defpackage;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class r55 {
    public final Set a;
    public final Set b;
    public final Set c;
    public final Map d;

    public r55(Set set, Set set2, Set set3, Map map) {
        set.getClass();
        this.a = set;
        this.b = set2;
        this.c = set3;
        this.d = map;
    }

    public static r55 a(r55 r55Var, Set set, Set set2, Set set3, Map map, int i) {
        if ((i & 2) != 0) {
            set2 = r55Var.b;
        }
        if ((i & 4) != 0) {
            set3 = r55Var.c;
        }
        if ((i & 8) != 0) {
            map = r55Var.d;
        }
        r55Var.getClass();
        set2.getClass();
        set3.getClass();
        map.getClass();
        return new r55(set, set2, set3, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r55)) {
            return false;
        }
        r55 r55Var = (r55) obj;
        return lc5.Q(this.a, r55Var.a) && lc5.Q(this.b, r55Var.b) && lc5.Q(this.c, r55Var.c) && lc5.Q(this.d, r55Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ImportState(importProgress=" + this.a + ", importError=" + this.b + ", importSuccess=" + this.c + ", importBookIdByPath=" + this.d + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r55(int i, Set set) {
        int i2 = i & 1;
        sc3 sc3Var = sc3.a;
        this(i2 != 0 ? sc3Var : set, sc3Var, sc3Var, mc3.a);
    }
}
