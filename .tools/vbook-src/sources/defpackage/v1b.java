package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class v1b {
    public final String a;
    public final Map b;
    public final String c;
    public final String d;
    public final String e;

    public v1b(String str, Map map, String str2, String str3, String str4) {
        str.getClass();
        map.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = map;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1b)) {
            return false;
        }
        v1b v1bVar = (v1b) obj;
        return lc5.Q(this.a, v1bVar.a) && lc5.Q(this.b, v1bVar.b) && lc5.Q(this.c, v1bVar.c) && lc5.Q(this.d, v1bVar.d) && lc5.Q(this.e, v1bVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j39.a(j39.a(j39.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackAudio(data=");
        sb.append(this.a);
        sb.append(", headers=");
        sb.append(this.b);
        sb.append(", type=");
        j39.y(sb, this.c, ", label=", this.d, ", language=");
        return ky0.s(this.e, ")", sb);
    }
}
