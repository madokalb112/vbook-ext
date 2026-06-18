package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class i0a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public i0a(String str, String str2, String str3, String str4, boolean z) {
        j39.v(str, str3, str4);
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
        if (!(obj instanceof i0a)) {
            return false;
        }
        i0a i0aVar = (i0a) obj;
        return lc5.Q(this.a, i0aVar.a) && this.b.equals(i0aVar.b) && lc5.Q(this.c, i0aVar.c) && lc5.Q(this.d, i0aVar.d) && this.e == i0aVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("SuggestBook(id=", this.a, ", name=", this.b, ", cover=");
        j39.y(sbQ, this.c, ", source=", this.d, ", isNsfw=");
        return xv5.q(")", sbQ, this.e);
    }
}
