package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ad2 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;
    public final long f;
    public final long g;

    public ad2(int i, long j, long j2, String str, String str2, String str3, boolean z) {
        j39.v(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = z;
        this.f = j;
        this.g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad2)) {
            return false;
        }
        ad2 ad2Var = (ad2) obj;
        return lc5.Q(this.a, ad2Var.a) && lc5.Q(this.b, ad2Var.b) && lc5.Q(this.c, ad2Var.c) && this.d == ad2Var.d && this.e == ad2Var.e && this.f == ad2Var.f && this.g == ad2Var.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + xv5.b(j39.c(tw2.d(this.d, j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("DbTrash(id=", this.a, ", bookId=", this.b, ", word=");
        dx1.t(this.d, this.c, ", type=", ", regex=", sbQ);
        sbQ.append(this.e);
        sbQ.append(", createAt=");
        sbQ.append(this.f);
        return dx1.l(sbQ, ", updateAt=", this.g, ")");
    }
}
