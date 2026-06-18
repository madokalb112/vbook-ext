package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ob2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final long f;

    public ob2(String str, String str2, String str3, String str4, boolean z, long j) {
        tw2.A(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob2)) {
            return false;
        }
        ob2 ob2Var = (ob2) obj;
        return lc5.Q(this.a, ob2Var.a) && lc5.Q(this.b, ob2Var.b) && lc5.Q(this.c, ob2Var.c) && lc5.Q(this.d, ob2Var.d) && this.e == ob2Var.e && this.f == ob2Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + j39.c(j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("DbName(id=", this.a, ", bookId=", this.b, ", word=");
        j39.y(sbQ, this.c, ", replace=", this.d, ", ignoreCase=");
        sbQ.append(this.e);
        sbQ.append(", createAt=");
        sbQ.append(this.f);
        sbQ.append(")");
        return sbQ.toString();
    }
}
