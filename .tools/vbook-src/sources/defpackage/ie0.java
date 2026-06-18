package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ie0 {
    public final String a;
    public final String b;

    public ie0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie0)) {
            return false;
        }
        ie0 ie0Var = (ie0) obj;
        return lc5.Q(this.a, ie0Var.a) && lc5.Q(this.b, ie0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tw2.o("BasicAuthAuthentication(username=", this.a, ", password=", this.b, ")");
    }
}
