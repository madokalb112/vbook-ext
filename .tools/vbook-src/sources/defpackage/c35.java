package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class c35 {
    public final String a;
    public final List b;
    public final Set c;

    public c35(String str, List list, Set set) {
        list.getClass();
        set.getClass();
        this.a = str;
        this.b = list;
        this.c = set;
    }

    public static c35 a(c35 c35Var, String str, ArrayList arrayList, Set set, int i) {
        if ((i & 1) != 0) {
            str = c35Var.a;
        }
        List list = arrayList;
        if ((i & 2) != 0) {
            list = c35Var.b;
        }
        if ((i & 4) != 0) {
            set = c35Var.c;
        }
        c35Var.getClass();
        str.getClass();
        list.getClass();
        set.getClass();
        return new c35(str, list, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c35)) {
            return false;
        }
        c35 c35Var = (c35) obj;
        return this.a.equals(c35Var.a) && lc5.Q(this.b, c35Var.b) && lc5.Q(this.c, c35Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + j39.d(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return "ImageTableOfContentState(currentId=" + this.a + ", tocLinks=" + this.b + ", downloadingIds=" + this.c + ")";
    }
}
