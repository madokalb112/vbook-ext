package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ova {
    public final String a;
    public final String b;
    public final Map c;
    public final String d;
    public final int e;

    public ova(String str, String str2, Map map, String str3, int i) {
        str.getClass();
        map.getClass();
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = str3;
        this.e = i;
    }

    public static ova a(ova ovaVar, LinkedHashMap linkedHashMap) {
        String str = ovaVar.a;
        String str2 = ovaVar.b;
        String str3 = ovaVar.d;
        int i = ovaVar.e;
        ovaVar.getClass();
        str.getClass();
        return new ova(str, str2, linkedHashMap, str3, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ova)) {
            return false;
        }
        ova ovaVar = (ova) obj;
        return lc5.Q(this.a, ovaVar.a) && lc5.Q(this.b, ovaVar.b) && lc5.Q(this.c, ovaVar.c) && this.d.equals(ovaVar.d) && this.e == ovaVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Integer.hashCode(this.e) + j39.a(j39.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("TocLink(id=", this.a, ", parentId=", this.b, ", title=");
        sbQ.append(this.c);
        sbQ.append(", path=");
        sbQ.append(this.d);
        sbQ.append(", position=");
        return tw2.q(sbQ, this.e, ")");
    }
}
