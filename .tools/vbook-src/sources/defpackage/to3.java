package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class to3 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final boolean h;
    public final int i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final long r;

    public to3(String str, String str2, String str3, String str4, String str5, String str6, int i, boolean z, int i2, String str7, String str8, String str9, String str10, boolean z2, boolean z3, boolean z4, boolean z5, long j) {
        j39.w(str, str2, str3, str4, str5);
        j39.v(str6, str9, str10);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = i;
        this.h = z;
        this.i = i2;
        this.j = str7;
        this.k = str8;
        this.l = str9;
        this.m = str10;
        this.n = z2;
        this.o = z3;
        this.p = z4;
        this.q = z5;
        this.r = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to3)) {
            return false;
        }
        to3 to3Var = (to3) obj;
        return lc5.Q(this.a, to3Var.a) && lc5.Q(this.b, to3Var.b) && lc5.Q(this.c, to3Var.c) && lc5.Q(this.d, to3Var.d) && lc5.Q(this.e, to3Var.e) && lc5.Q(this.f, to3Var.f) && this.g == to3Var.g && this.h == to3Var.h && this.i == to3Var.i && this.j.equals(to3Var.j) && this.k.equals(to3Var.k) && lc5.Q(this.l, to3Var.l) && lc5.Q(this.m, to3Var.m) && this.n == to3Var.n && this.o == to3Var.o && this.p == to3Var.p && this.q == to3Var.q && this.r == to3Var.r;
    }

    public final int hashCode() {
        return Long.hashCode(this.r) + j39.c(j39.c(j39.c(j39.c(j39.a(j39.a(j39.a(j39.a(tw2.d(this.i, j39.c(tw2.d(this.g, j39.a(j39.a(j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h), 31), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("ExtensionInfo(id=", this.a, ", name=", this.b, ", icon=");
        j39.y(sbQ, this.c, ", source=", this.d, ", host=");
        j39.y(sbQ, this.e, ", author=", this.f, ", version=");
        j39.x(sbQ, this.g, ", isNsfw=", this.h, ", type=");
        ky0.w(this.i, ", language=", this.j, ", country=", sbQ);
        j39.y(sbQ, this.k, ", description=", this.l, ", path=");
        j39.z(sbQ, this.m, ", isDevelopment=", this.n, ", isDraft=");
        ky0.D(sbQ, this.o, ", isInstalled=", this.p, ", isPined=");
        sbQ.append(this.q);
        sbQ.append(", update=");
        sbQ.append(this.r);
        sbQ.append(")");
        return sbQ.toString();
    }
}
