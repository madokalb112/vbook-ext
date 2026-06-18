package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class um9 {
    public final String a;
    public final String b;
    public final String c;

    public um9(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um9)) {
            return false;
        }
        um9 um9Var = (um9) obj;
        return this.a.equals(um9Var.a) && this.b.equals(um9Var.b) && this.c.equals(um9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + j39.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ky0.s(this.c, ")", j39.q("SourceGenre(name=", this.a, ", input=", this.b, ", script="));
    }
}
