package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class b21 {
    public final String a;
    public final int b;
    public final String c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final long h;

    public b21(String str, int i, String str2, int i2, boolean z, boolean z2, boolean z3, long j) {
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
        if (!(obj instanceof b21)) {
            return false;
        }
        b21 b21Var = (b21) obj;
        return lc5.Q(this.a, b21Var.a) && this.b == b21Var.b && lc5.Q(this.c, b21Var.c) && this.d == b21Var.d && this.e == b21Var.e && this.f == b21Var.f && this.g == b21Var.g && this.h == b21Var.h;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + j39.c(j39.c(j39.c(tw2.d(this.d, j39.a(tw2.d(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbN = dx1.n("Chapter(id=", this.a, ", index=", ", path=", this.b);
        dx1.t(this.d, this.c, ", count=", ", downloaded=", sbN);
        ky0.D(sbN, this.e, ", locked=", this.f, ", pay=");
        sbN.append(this.g);
        sbN.append(", lastRead=");
        sbN.append(this.h);
        sbN.append(")");
        return sbN.toString();
    }
}
