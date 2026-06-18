package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class o54 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final long h;

    public o54(String str, String str2, String str3, String str4, boolean z, boolean z2, int i, long j) {
        j39.v(str, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = i;
        this.h = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o54)) {
            return false;
        }
        o54 o54Var = (o54) obj;
        return lc5.Q(this.a, o54Var.a) && this.b.equals(o54Var.b) && lc5.Q(this.c, o54Var.c) && lc5.Q(this.d, o54Var.d) && this.e == o54Var.e && this.f == o54Var.f && this.g == o54Var.g && this.h == o54Var.h;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + tw2.d(this.g, j39.c(j39.c(j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("FollowBook(id=", this.a, ", name=", this.b, ", cover=");
        j39.y(sbQ, this.c, ", source=", this.d, ", isNsfw=");
        ky0.D(sbQ, this.e, ", isFollow=", this.f, ", newUpdateCount=");
        sbQ.append(this.g);
        sbQ.append(", updateAt=");
        sbQ.append(this.h);
        sbQ.append(")");
        return sbQ.toString();
    }
}
