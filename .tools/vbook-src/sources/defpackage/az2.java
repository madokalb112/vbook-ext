package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class az2 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public az2(String str, boolean z, String str2, String str3) {
        j39.v(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public static az2 a(az2 az2Var, String str, String str2, boolean z, int i) {
        String str3 = az2Var.a;
        if ((i & 2) != 0) {
            str = az2Var.b;
        }
        if ((i & 4) != 0) {
            str2 = az2Var.c;
        }
        if ((i & 8) != 0) {
            z = az2Var.d;
        }
        az2Var.getClass();
        str3.getClass();
        str.getClass();
        str2.getClass();
        return new az2(str3, z, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az2)) {
            return false;
        }
        az2 az2Var = (az2) obj;
        return lc5.Q(this.a, az2Var.a) && lc5.Q(this.b, az2Var.b) && lc5.Q(this.c, az2Var.c) && this.d == az2Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("DomainOverride(id=", this.a, ", domain=", this.b, ", replace=");
        sbQ.append(this.c);
        sbQ.append(", enabled=");
        sbQ.append(this.d);
        sbQ.append(")");
        return sbQ.toString();
    }
}
