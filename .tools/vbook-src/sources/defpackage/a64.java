package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class a64 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final t13 e;

    public a64(String str, String str2, String str3, boolean z, t13 t13Var) {
        str.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = t13Var;
    }

    public static a64 a(a64 a64Var, String str, t13 t13Var, int i) {
        String str2 = a64Var.a;
        String str3 = a64Var.b;
        if ((i & 4) != 0) {
            str = a64Var.c;
        }
        String str4 = str;
        boolean z = a64Var.d;
        str2.getClass();
        str4.getClass();
        return new a64(str2, str3, str4, z, t13Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a64)) {
            return false;
        }
        a64 a64Var = (a64) obj;
        return lc5.Q(this.a, a64Var.a) && this.b.equals(a64Var.b) && lc5.Q(this.c, a64Var.c) && this.d == a64Var.d && this.e == a64Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + j39.c(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("Font(id=", this.a, ", name=", this.b, ", path=");
        j39.z(sbQ, this.c, ", isDefault=", this.d, ", downloadStatus=");
        sbQ.append(this.e);
        sbQ.append(")");
        return sbQ.toString();
    }
}
