package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class n01 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final String e;

    public n01(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = str2;
    }

    public static n01 a(n01 n01Var, boolean z, boolean z2, String str, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = n01Var.a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = n01Var.b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            str = n01Var.c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            z3 = n01Var.d;
        }
        String str3 = n01Var.e;
        n01Var.getClass();
        return new n01(str2, str3, z4, z5, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n01)) {
            return false;
        }
        n01 n01Var = (n01) obj;
        return this.a == n01Var.a && this.b == n01Var.b && this.c.equals(n01Var.c) && this.d == n01Var.d && this.e.equals(n01Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j39.c(j39.a(j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("CbzState(isLoading=", this.a, ", isImporting=", this.b, ", bookName=");
        j39.z(sbR, this.c, ", isError=", this.d, ", errorMessage=");
        return ky0.s(this.e, ")", sbR);
    }
}
