package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lg6 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final float f;

    public lg6(String str, String str2, String str3, String str4, String str5, float f) {
        str5.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg6)) {
            return false;
        }
        lg6 lg6Var = (lg6) obj;
        return this.a.equals(lg6Var.a) && this.b.equals(lg6Var.b) && this.c.equals(lg6Var.c) && this.d.equals(lg6Var.d) && lc5.Q(this.e, lg6Var.e) && Float.compare(this.f, lg6Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + j39.a(j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("Metadata(title=", this.a, ", creator=", this.b, ", identifier=");
        j39.y(sbQ, this.c, ", language=", this.d, ", cover=");
        sbQ.append(this.e);
        sbQ.append(", version=");
        sbQ.append(this.f);
        sbQ.append(")");
        return sbQ.toString();
    }
}
