package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bc2 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;

    public bc2(long j, long j2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc2)) {
            return false;
        }
        bc2 bc2Var = (bc2) obj;
        return lc5.Q(this.a, bc2Var.a) && lc5.Q(this.b, bc2Var.b) && this.c == bc2Var.c && this.d == bc2Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + xv5.b(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("DbQtNameSkip(id=", this.a, ", word=", this.b, ", createAt=");
        sbQ.append(this.c);
        return dx1.l(sbQ, ", updateAt=", this.d, ")");
    }
}
