package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bs9 {
    public final long a;
    public final long b;
    public final long c;

    public bs9(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs9)) {
            return false;
        }
        bs9 bs9Var = (bs9) obj;
        return this.a == bs9Var.a && this.b == bs9Var.b && this.c == bs9Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + xv5.b(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbO = j39.o(this.a, "StatisticSession(startedAt=", ", readTime=");
        sbO.append(this.b);
        return dx1.l(sbO, ", listenTime=", this.c, ")");
    }
}
