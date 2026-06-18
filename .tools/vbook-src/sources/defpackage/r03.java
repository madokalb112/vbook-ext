package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class r03 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;

    public r03(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, int i4, long j) {
        j39.w(str, str2, str3, str4, str5);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r03)) {
            return false;
        }
        r03 r03Var = (r03) obj;
        return lc5.Q(this.a, r03Var.a) && lc5.Q(this.b, r03Var.b) && lc5.Q(this.c, r03Var.c) && lc5.Q(this.d, r03Var.d) && lc5.Q(this.e, r03Var.e) && this.f == r03Var.f && this.g == r03Var.g && this.h == r03Var.h && this.i == r03Var.i && this.j == r03Var.j;
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + tw2.d(this.i, tw2.d(this.h, tw2.d(this.g, tw2.d(this.f, j39.a(j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("Download(id=", this.a, ", bookId=", this.b, ", title=");
        j39.y(sbQ, this.c, ", image=", this.d, ", path=");
        dx1.t(this.f, this.e, ", downloaded=", ", total=", sbQ);
        ky0.u(this.g, this.h, ", type=", ", status=", sbQ);
        sbQ.append(this.i);
        sbQ.append(", createAt=");
        sbQ.append(this.j);
        sbQ.append(")");
        return sbQ.toString();
    }
}
