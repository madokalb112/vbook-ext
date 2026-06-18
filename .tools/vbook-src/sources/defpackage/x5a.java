package defpackage;

import java.util.Map;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class x5a {
    public static final w5a Companion = new w5a();
    public static final dp5[] h = {null, ex1.Z(xu5.b, new i5a(4)), null, null, null, null, null};
    public final String a;
    public final Map b;
    public final String c;
    public final String d;
    public final int e;
    public final long f;
    public final long g;

    public /* synthetic */ x5a(int i, String str, Map map, String str2, String str3, int i2, long j, long j2) {
        if (127 != (i & Token.SWITCH)) {
            qu1.w0(i, Token.SWITCH, v5a.a.e());
            throw null;
        }
        this.a = str;
        this.b = map;
        this.c = str2;
        this.d = str3;
        this.e = i2;
        this.f = j;
        this.g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5a)) {
            return false;
        }
        x5a x5aVar = (x5a) obj;
        return lc5.Q(this.a, x5aVar.a) && lc5.Q(this.b, x5aVar.b) && lc5.Q(this.c, x5aVar.c) && lc5.Q(this.d, x5aVar.d) && this.e == x5aVar.e && this.f == x5aVar.f && this.g == x5aVar.g;
    }

    public final int hashCode() {
        int iB = j39.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return Long.hashCode(this.g) + xv5.b(tw2.d(this.e, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SyncTocLink(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", path=");
        j39.y(sb, this.c, ", parentId=", this.d, ", position=");
        sb.append(this.e);
        sb.append(", createAt=");
        sb.append(this.f);
        return dx1.l(sb, ", updateAt=", this.g, ")");
    }

    public x5a(String str, Map map, String str2, String str3, int i, long j, long j2) {
        str.getClass();
        map.getClass();
        this.a = str;
        this.b = map;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = j;
        this.g = j2;
    }
}
