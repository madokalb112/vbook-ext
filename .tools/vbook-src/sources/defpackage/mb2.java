package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mb2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;

    public mb2(String str, String str2, String str3, String str4, long j) {
        tw2.A(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb2)) {
            return false;
        }
        mb2 mb2Var = (mb2) obj;
        return lc5.Q(this.a, mb2Var.a) && lc5.Q(this.b, mb2Var.b) && lc5.Q(this.c, mb2Var.c) && lc5.Q(this.d, mb2Var.d) && this.e == mb2Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("DbExtensionSource(id=", this.a, ", path=", this.b, ", author=");
        j39.y(sbQ, this.c, ", description=", this.d, ", createAt=");
        return xv5.n(this.e, ")", sbQ);
    }
}
