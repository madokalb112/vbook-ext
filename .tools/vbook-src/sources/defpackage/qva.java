package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qva {
    public final String a;
    public final String b;
    public final Map c;
    public final String d;

    public qva(String str, String str2, String str3, Map map) {
        str.getClass();
        map.getClass();
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qva)) {
            return false;
        }
        qva qvaVar = (qva) obj;
        return lc5.Q(this.a, qvaVar.a) && lc5.Q(this.b, qvaVar.b) && lc5.Q(this.c, qvaVar.c) && this.d.equals(qvaVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + j39.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("TocLink(id=", this.a, ", parentId=", this.b, ", title=");
        sbQ.append(this.c);
        sbQ.append(", path=");
        sbQ.append(this.d);
        sbQ.append(")");
        return sbQ.toString();
    }
}
