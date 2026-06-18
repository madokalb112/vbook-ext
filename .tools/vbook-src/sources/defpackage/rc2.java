package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rc2 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final long e;
    public final long f;

    public rc2(String str, String str2, String str3, boolean z, long j, long j2) {
        j39.v(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = j;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc2)) {
            return false;
        }
        rc2 rc2Var = (rc2) obj;
        return lc5.Q(this.a, rc2Var.a) && lc5.Q(this.b, rc2Var.b) && lc5.Q(this.c, rc2Var.c) && this.d == rc2Var.d && this.e == rc2Var.e && this.f == rc2Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + xv5.b(j39.c(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("DbTTSWord(id=", this.a, ", word=", this.b, ", replace=");
        j39.z(sbQ, this.c, ", ignoreCase=", this.d, ", createAt=");
        sbQ.append(this.e);
        return dx1.l(sbQ, ", updateAt=", this.f, ")");
    }
}
