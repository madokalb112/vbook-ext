package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class c92 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final long i;
    public final long j;
    public final long k;

    public c92(String str, String str2, int i, String str3, int i2, String str4, String str5, String str6, long j, long j2, long j3) {
        j39.w(str, str2, str3, str4, str5);
        str6.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = i2;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = j;
        this.j = j2;
        this.k = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c92)) {
            return false;
        }
        c92 c92Var = (c92) obj;
        return lc5.Q(this.a, c92Var.a) && lc5.Q(this.b, c92Var.b) && this.c == c92Var.c && lc5.Q(this.d, c92Var.d) && this.e == c92Var.e && lc5.Q(this.f, c92Var.f) && lc5.Q(this.g, c92Var.g) && lc5.Q(this.h, c92Var.h) && this.i == c92Var.i && this.j == c92Var.j && this.k == c92Var.k;
    }

    public final int hashCode() {
        return Long.hashCode(this.k) + xv5.b(xv5.b(j39.a(j39.a(j39.a(tw2.d(this.e, j39.a(tw2.d(this.c, j39.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("DbBookmark(id=", this.a, ", bookId=", this.b, ", chapterIndex=");
        ky0.w(this.c, ", chapterName=", this.d, ", type=", sbQ);
        ky0.w(this.e, ", content=", this.f, ", description=", sbQ);
        j39.y(sbQ, this.g, ", color=", this.h, ", startPosition=");
        sbQ.append(this.i);
        dx1.z(sbQ, ", endPosition=", this.j, ", createAt=");
        return xv5.n(this.k, ")", sbQ);
    }
}
