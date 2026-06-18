package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xb2 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final long e;
    public final long f;

    public xb2(String str, String str2, int i, String str3, long j, long j2) {
        j39.v(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = j;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb2)) {
            return false;
        }
        xb2 xb2Var = (xb2) obj;
        return lc5.Q(this.a, xb2Var.a) && lc5.Q(this.b, xb2Var.b) && this.c == xb2Var.c && lc5.Q(this.d, xb2Var.d) && this.e == xb2Var.e && this.f == xb2Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + xv5.b(j39.a(tw2.d(this.c, j39.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("DbPage(id=", this.a, ", bookId=", this.b, ", position=");
        ky0.w(this.c, ", path=", this.d, ", createAt=", sbQ);
        sbQ.append(this.e);
        return dx1.l(sbQ, ", updateAt=", this.f, ")");
    }
}
