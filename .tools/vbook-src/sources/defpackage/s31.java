package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class s31 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;

    public s31(long j, long j2, String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
    }

    public final long a() {
        return this.c + this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s31)) {
            return false;
        }
        s31 s31Var = (s31) obj;
        return lc5.Q(this.a, s31Var.a) && this.b.equals(s31Var.b) && this.c == s31Var.c && this.d == s31Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + xv5.b(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("ChartPoint(label=", this.a, ", key=", this.b, ", readValue=");
        sbQ.append(this.c);
        return dx1.l(sbQ, ", listenValue=", this.d, ")");
    }
}
