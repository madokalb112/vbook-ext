package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class h0a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public h0a(String str, String str2, String str3, String str4, String str5) {
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0a)) {
            return false;
        }
        h0a h0aVar = (h0a) obj;
        return this.a.equals(h0aVar.a) && this.b.equals(h0aVar.b) && lc5.Q(this.c, h0aVar.c) && this.d.equals(h0aVar.d) && this.e.equals(h0aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("Suggest(name=", this.a, ", cover=", this.b, ", path=");
        j39.y(sbQ, this.c, ", description=", this.d, ", tag=");
        return ky0.s(this.e, ")", sbQ);
    }
}
