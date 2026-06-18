package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class j57 {
    public final String a;
    public final String b;
    public final String c;

    public j57(String str, String str2, String str3) {
        j39.v(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j57)) {
            return false;
        }
        j57 j57Var = (j57) obj;
        return lc5.Q(this.a, j57Var.a) && lc5.Q(this.b, j57Var.b) && lc5.Q(this.c, j57Var.c);
    }

    public final int hashCode() {
        return Long.hashCode(100L) + j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ky0.s(this.c, ", size=100)", j39.q("NetworkFont(name=", this.a, ", path=", this.b, ", preview="));
    }
}
