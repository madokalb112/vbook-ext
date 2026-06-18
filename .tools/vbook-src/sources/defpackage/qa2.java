package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qa2 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;

    public qa2(long j, long j2, String str, String str2) {
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
        if (!(obj instanceof qa2)) {
            return false;
        }
        qa2 qa2Var = (qa2) obj;
        return lc5.Q(this.a, qa2Var.a) && lc5.Q(this.b, qa2Var.b) && this.c == qa2Var.c && this.d == qa2Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + xv5.b(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("DbEmojiCategory(id=", this.a, ", thumb=", this.b, ", count=");
        sbQ.append(this.c);
        return dx1.l(sbQ, ", position=", this.d, ")");
    }
}
