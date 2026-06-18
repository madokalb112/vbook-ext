package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nc2 {
    public final String a;
    public final long b;

    public nc2(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc2)) {
            return false;
        }
        nc2 nc2Var = (nc2) obj;
        return lc5.Q(this.a, nc2Var.a) && this.b == nc2Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DbSearch(key=" + this.a + ", createAt=" + this.b + ")";
    }
}
