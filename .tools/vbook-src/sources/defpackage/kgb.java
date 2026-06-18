package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class kgb implements krb {
    public final String a;
    public final Map b;
    public final String c;
    public final String d;

    public kgb(String str, String str2, String str3, Map map) {
        str.getClass();
        map.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = map;
        this.c = str2;
        this.d = str3;
    }

    public final Map a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgb)) {
            return false;
        }
        kgb kgbVar = (kgb) obj;
        return lc5.Q(this.a, kgbVar.a) && lc5.Q(this.b, kgbVar.b) && lc5.Q(this.c, kgbVar.c) && lc5.Q(this.d, kgbVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j39.a(j39.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UriVideoSource(uri=");
        sb.append(this.a);
        sb.append(", headers=");
        sb.append(this.b);
        sb.append(", mimeType=");
        return tw2.s(sb, this.c, ", baseUrl=", this.d, ")");
    }
}
