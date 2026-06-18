package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class s80 extends vo8 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public s80(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            k27.n("Null rolloutId");
            throw null;
        }
        this.b = str;
        if (str2 == null) {
            k27.n("Null parameterKey");
            throw null;
        }
        this.c = str2;
        this.d = str3;
        if (str4 == null) {
            k27.n("Null variantId");
            throw null;
        }
        this.e = str4;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vo8)) {
            return false;
        }
        s80 s80Var = (s80) ((vo8) obj);
        return this.b.equals(s80Var.b) && this.c.equals(s80Var.c) && this.d.equals(s80Var.d) && this.e.equals(s80Var.e) && this.f == s80Var.f;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        long j = this.f;
        return ((int) ((j >>> 32) ^ j)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.b);
        sb.append(", parameterKey=");
        sb.append(this.c);
        sb.append(", parameterValue=");
        sb.append(this.d);
        sb.append(", variantId=");
        sb.append(this.e);
        sb.append(", templateVersion=");
        return xv5.n(this.f, "}", sb);
    }
}
