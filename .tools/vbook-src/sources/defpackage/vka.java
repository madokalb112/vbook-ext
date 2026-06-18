package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vka {
    public final String a;
    public final List b;
    public final Set c;

    public vka(String str, List list, Set set) {
        list.getClass();
        set.getClass();
        this.a = str;
        this.b = list;
        this.c = set;
    }

    public static vka a(vka vkaVar, String str, ArrayList arrayList, Set set, int i) {
        if ((i & 1) != 0) {
            str = vkaVar.a;
        }
        List list = arrayList;
        if ((i & 2) != 0) {
            list = vkaVar.b;
        }
        if ((i & 4) != 0) {
            set = vkaVar.c;
        }
        vkaVar.getClass();
        str.getClass();
        list.getClass();
        set.getClass();
        return new vka(str, list, set);
    }

    public final String b() {
        return this.a;
    }

    public final Set c() {
        return this.c;
    }

    public final List d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vka)) {
            return false;
        }
        vka vkaVar = (vka) obj;
        return this.a.equals(vkaVar.a) && lc5.Q(this.b, vkaVar.b) && lc5.Q(this.c, vkaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + j39.d(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return "TextTableOfContentState(currentId=" + this.a + ", tocLinks=" + this.b + ", downloadingIds=" + this.c + ")";
    }
}
