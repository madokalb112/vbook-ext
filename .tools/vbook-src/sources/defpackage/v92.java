package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class v92 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final long k;
    public final long l;

    public v92(String str, String str2, String str3, int i, String str4, int i2, boolean z, boolean z2, boolean z3, long j, long j2, long j3) {
        tw2.A(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = i2;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = j;
        this.k = j2;
        this.l = j3;
    }

    public final int a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v92)) {
            return false;
        }
        v92 v92Var = (v92) obj;
        return lc5.Q(this.a, v92Var.a) && lc5.Q(this.b, v92Var.b) && lc5.Q(this.c, v92Var.c) && this.d == v92Var.d && lc5.Q(this.e, v92Var.e) && this.f == v92Var.f && this.g == v92Var.g && this.h == v92Var.h && this.i == v92Var.i && this.j == v92Var.j && this.k == v92Var.k && this.l == v92Var.l;
    }

    public final int hashCode() {
        return Long.hashCode(this.l) + xv5.b(xv5.b(j39.c(j39.c(j39.c(tw2.d(this.f, j39.a(tw2.d(this.d, j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("DbChapter(id=", this.a, ", bookId=", this.b, ", pathId=");
        dx1.t(this.d, this.c, ", position=", ", path=", sbQ);
        dx1.t(this.f, this.e, ", count=", ", downloaded=", sbQ);
        ky0.D(sbQ, this.g, ", pay=", this.h, ", lock=");
        sbQ.append(this.i);
        sbQ.append(", lastRead=");
        sbQ.append(this.j);
        dx1.z(sbQ, ", createAt=", this.k, ", updateAt=");
        return xv5.n(this.l, ")", sbQ);
    }
}
