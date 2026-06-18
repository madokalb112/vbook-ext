package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ii0 {
    public final String a;
    public final Map b;
    public final Map c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final Map h;
    public final Map i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    public ii0(String str, Map map, Map map2, String str2, String str3, int i, String str4, Map map3, Map map4, boolean z, boolean z2, boolean z3, boolean z4) {
        str.getClass();
        map.getClass();
        map2.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        map3.getClass();
        map4.getClass();
        this.a = str;
        this.b = map;
        this.c = map2;
        this.d = str2;
        this.e = str3;
        this.f = i;
        this.g = str4;
        this.h = map3;
        this.i = map4;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii0)) {
            return false;
        }
        ii0 ii0Var = (ii0) obj;
        return lc5.Q(this.a, ii0Var.a) && lc5.Q(this.b, ii0Var.b) && lc5.Q(this.c, ii0Var.c) && lc5.Q(this.d, ii0Var.d) && lc5.Q(this.e, ii0Var.e) && this.f == ii0Var.f && lc5.Q(this.g, ii0Var.g) && lc5.Q(this.h, ii0Var.h) && lc5.Q(this.i, ii0Var.i) && this.j == ii0Var.j && this.k == ii0Var.k && this.l == ii0Var.l && this.m == ii0Var.m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.m) + j39.c(j39.c(j39.c(j39.b(j39.b(j39.a(tw2.d(this.f, j39.a(j39.a(j39.b(j39.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Book(bookId=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", author=");
        sb.append(this.c);
        sb.append(", cover=");
        sb.append(this.d);
        sb.append(", path=");
        dx1.t(this.f, this.e, ", type=", ", language=", sb);
        sb.append(this.g);
        sb.append(", description=");
        sb.append(this.h);
        sb.append(", extras=");
        sb.append(this.i);
        sb.append(", isNfsw=");
        sb.append(this.j);
        sb.append(", isOngoing=");
        ky0.D(sb, this.k, ", isInShelf=", this.l, ", isFollow=");
        return xv5.q(")", sb, this.m);
    }
}
