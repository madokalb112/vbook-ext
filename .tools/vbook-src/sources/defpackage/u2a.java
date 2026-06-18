package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class u2a {
    public static final t2a Companion = new t2a();
    public static final dp5[] f = {null, null, ex1.Z(xu5.b, new dv9(20)), null, null};
    public final String a;
    public final int b;
    public final Map c;
    public final long d;
    public final long e;

    public /* synthetic */ u2a(int i, String str, int i2, Map map, long j, long j2) {
        if (31 != (i & 31)) {
            qu1.w0(i, 31, s2a.a.e());
            throw null;
        }
        this.a = str;
        this.b = i2;
        this.c = map;
        this.d = j;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2a)) {
            return false;
        }
        u2a u2aVar = (u2a) obj;
        return lc5.Q(this.a, u2aVar.a) && this.b == u2aVar.b && lc5.Q(this.c, u2aVar.c) && this.d == u2aVar.d && this.e == u2aVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + xv5.b(j39.b(tw2.d(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = dx1.n("SyncContent(id=", this.a, ", position=", ", content=", this.b);
        sbN.append(this.c);
        sbN.append(", createAt=");
        sbN.append(this.d);
        return dx1.l(sbN, ", updateAt=", this.e, ")");
    }

    public u2a(String str, int i, Map map, long j, long j2) {
        str.getClass();
        map.getClass();
        this.a = str;
        this.b = i;
        this.c = map;
        this.d = j;
        this.e = j2;
    }
}
