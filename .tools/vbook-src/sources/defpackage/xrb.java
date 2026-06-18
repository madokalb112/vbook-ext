package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xrb {
    public final String a;
    public final List b;
    public final Set c;

    public xrb(String str, List list, Set set) {
        list.getClass();
        set.getClass();
        this.a = str;
        this.b = list;
        this.c = set;
    }

    public static xrb a(xrb xrbVar, String str, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            str = xrbVar.a;
        }
        List list = arrayList;
        if ((i & 2) != 0) {
            list = xrbVar.b;
        }
        Set set = xrbVar.c;
        xrbVar.getClass();
        str.getClass();
        list.getClass();
        set.getClass();
        return new xrb(str, list, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrb)) {
            return false;
        }
        xrb xrbVar = (xrb) obj;
        return this.a.equals(xrbVar.a) && lc5.Q(this.b, xrbVar.b) && lc5.Q(this.c, xrbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + j39.d(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return "VideoTableOfContentState(currentId=" + this.a + ", sections=" + this.b + ", downloadingIds=" + this.c + ")";
    }
}
