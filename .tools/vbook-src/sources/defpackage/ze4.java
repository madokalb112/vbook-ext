package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ze4 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final long m;
    public final long n;

    public ze4(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, int i2, boolean z, boolean z2, boolean z3, long j, long j2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = i2;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = j;
        this.n = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ze4)) {
            return false;
        }
        ze4 ze4Var = (ze4) obj;
        return this.a.equals(ze4Var.a) && this.b.equals(ze4Var.b) && this.c.equals(ze4Var.c) && this.d == ze4Var.d && this.e.equals(ze4Var.e) && this.f.equals(ze4Var.f) && this.g.equals(ze4Var.g) && this.h.equals(ze4Var.h) && this.i == ze4Var.i && this.j == ze4Var.j && this.k == ze4Var.k && this.l == ze4Var.l && this.m == ze4Var.m && this.n == ze4Var.n;
    }

    public final int hashCode() {
        return Long.hashCode(this.n) + xv5.b(j39.c(j39.c(j39.c(tw2.d(this.i, j39.a(j39.a(j39.a(j39.a(tw2.d(this.d, j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("GetTranslateExtension(id=", this.a, ", name=", this.b, ", author=");
        dx1.t(this.d, this.c, ", version=", ", source=", sbQ);
        j39.y(sbQ, this.e, ", path=", this.f, ", description=");
        j39.y(sbQ, this.g, ", language=", this.h, ", type=");
        j39.x(sbQ, this.i, ", nsfw=", this.j, ", development=");
        ky0.D(sbQ, this.k, ", draft=", this.l, ", pinedAt=");
        sbQ.append(this.m);
        return dx1.l(sbQ, ", updateAt=", this.n, ")");
    }
}
