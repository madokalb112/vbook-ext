package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class z92 {
    public final String a;
    public final String b;
    public final int c;
    public final Map d;
    public final long e;
    public final long f;

    public z92(String str, String str2, int i, Map map, long j, long j2) {
        str.getClass();
        str2.getClass();
        map.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = map;
        this.e = j;
        this.f = j2;
    }

    public static z92 a(z92 z92Var, Map map) {
        String str = z92Var.a;
        String str2 = z92Var.b;
        int i = z92Var.c;
        long j = z92Var.e;
        long j2 = z92Var.f;
        str.getClass();
        str2.getClass();
        return new z92(str, str2, i, map, j, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z92)) {
            return false;
        }
        z92 z92Var = (z92) obj;
        return lc5.Q(this.a, z92Var.a) && lc5.Q(this.b, z92Var.b) && this.c == z92Var.c && lc5.Q(this.d, z92Var.d) && this.e == z92Var.e && this.f == z92Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + xv5.b(j39.b(tw2.d(this.c, j39.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("DbContent(id=", this.a, ", bookId=", this.b, ", position=");
        sbQ.append(this.c);
        sbQ.append(", content=");
        sbQ.append(this.d);
        sbQ.append(", createAt=");
        sbQ.append(this.e);
        return dx1.l(sbQ, ", updateAt=", this.f, ")");
    }
}
