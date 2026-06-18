package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xa2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public xa2(String str, String str2, String str3, String str4) {
        tw2.A(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa2)) {
            return false;
        }
        xa2 xa2Var = (xa2) obj;
        return lc5.Q(this.a, xa2Var.a) && lc5.Q(this.b, xa2Var.b) && lc5.Q(this.c, xa2Var.c) && lc5.Q(this.d, xa2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return tw2.s(j39.q("DbExtensionLocalStorage(id=", this.a, ", extensionId=", this.b, ", key="), this.c, ", content=", this.d, ")");
    }
}
