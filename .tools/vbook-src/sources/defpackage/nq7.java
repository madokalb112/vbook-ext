package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nq7 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final String e;

    public nq7(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = str2;
    }

    public static nq7 a(nq7 nq7Var, boolean z, boolean z2, String str, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = nq7Var.a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = nq7Var.b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            str = nq7Var.c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            z3 = nq7Var.d;
        }
        String str3 = nq7Var.e;
        nq7Var.getClass();
        return new nq7(str2, str3, z4, z5, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq7)) {
            return false;
        }
        nq7 nq7Var = (nq7) obj;
        return this.a == nq7Var.a && this.b == nq7Var.b && this.c.equals(nq7Var.c) && this.d == nq7Var.d && this.e.equals(nq7Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j39.c(j39.a(j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("PdfState(isLoading=", this.a, ", isImporting=", this.b, ", bookName=");
        j39.z(sbR, this.c, ", isError=", this.d, ", errorMessage=");
        return ky0.s(this.e, ")", sbR);
    }
}
