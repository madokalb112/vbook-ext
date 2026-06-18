package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lc2 {
    public final String a;
    public final long b;
    public final long c;
    public final long d;

    public lc2(String str, long j, long j2, long j3) {
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc2)) {
            return false;
        }
        lc2 lc2Var = (lc2) obj;
        return lc5.Q(this.a, lc2Var.a) && this.b == lc2Var.b && this.c == lc2Var.c && this.d == lc2Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + xv5.b(xv5.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DbReadHistory(id=");
        sb.append(this.a);
        sb.append(", readTime=");
        sb.append(this.b);
        dx1.z(sb, ", listenTime=", this.c, ", createAt=");
        return xv5.n(this.d, ")", sb);
    }
}
