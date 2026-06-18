package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dc2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final long g;
    public final long h;

    public dc2(String str, String str2, String str3, String str4, int i, int i2, long j, long j2) {
        tw2.A(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = i2;
        this.g = j;
        this.h = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc2)) {
            return false;
        }
        dc2 dc2Var = (dc2) obj;
        return lc5.Q(this.a, dc2Var.a) && lc5.Q(this.b, dc2Var.b) && lc5.Q(this.c, dc2Var.c) && lc5.Q(this.d, dc2Var.d) && this.e == dc2Var.e && this.f == dc2Var.f && this.g == dc2Var.g && this.h == dc2Var.h;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + xv5.b(tw2.d(this.f, tw2.d(this.e, j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("DbQtWord(id=", this.a, ", bookId=", this.b, ", word=");
        j39.y(sbQ, this.c, ", trans=", this.d, ", type=");
        ky0.u(this.e, this.f, ", mode=", ", createAt=", sbQ);
        sbQ.append(this.g);
        return dx1.l(sbQ, ", updateAt=", this.h, ")");
    }
}
