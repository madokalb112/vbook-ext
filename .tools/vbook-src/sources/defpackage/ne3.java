package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ne3 {
    public final String a;
    public final int b;
    public final String c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final long h;

    public ne3(String str, int i, String str2, int i2, boolean z, boolean z2, boolean z3, long j) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = i2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne3)) {
            return false;
        }
        ne3 ne3Var = (ne3) obj;
        return lc5.Q(this.a, ne3Var.a) && this.b == ne3Var.b && lc5.Q(this.c, ne3Var.c) && this.d == ne3Var.d && this.e == ne3Var.e && this.f == ne3Var.f && this.g == ne3Var.g && this.h == ne3Var.h;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + j39.c(j39.c(j39.c(tw2.d(this.d, j39.a(tw2.d(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbN = dx1.n("Episode(id=", this.a, ", index=", ", path=", this.b);
        dx1.t(this.d, this.c, ", count=", ", downloaded=", sbN);
        ky0.D(sbN, this.e, ", locked=", this.f, ", pay=");
        sbN.append(this.g);
        sbN.append(", lastRead=");
        sbN.append(this.h);
        sbN.append(")");
        return sbN.toString();
    }
}
