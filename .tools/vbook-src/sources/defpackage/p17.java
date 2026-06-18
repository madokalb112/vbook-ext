package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class p17 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public p17(String str, String str2, String str3, String str4, boolean z) {
        tw2.A(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p17)) {
            return false;
        }
        p17 p17Var = (p17) obj;
        return lc5.Q(this.a, p17Var.a) && lc5.Q(this.b, p17Var.b) && lc5.Q(this.c, p17Var.c) && lc5.Q(this.d, p17Var.d) && this.e == p17Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("NameWord(id=", this.a, ", bookId=", this.b, ", word=");
        j39.y(sbQ, this.c, ", replace=", this.d, ", ignoreCase=");
        return xv5.q(")", sbQ, this.e);
    }
}
