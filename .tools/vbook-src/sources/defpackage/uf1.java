package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class uf1 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final String e;

    public uf1(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = str2;
    }

    public static uf1 a(uf1 uf1Var, boolean z, String str, boolean z2, String str2, int i) {
        boolean z3 = (i & 1) != 0 ? uf1Var.a : false;
        if ((i & 2) != 0) {
            z = uf1Var.b;
        }
        if ((i & 4) != 0) {
            str = uf1Var.c;
        }
        if ((i & 8) != 0) {
            z2 = uf1Var.d;
        }
        if ((i & 16) != 0) {
            str2 = uf1Var.e;
        }
        uf1Var.getClass();
        return new uf1(str, str2, z3, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf1)) {
            return false;
        }
        uf1 uf1Var = (uf1) obj;
        return this.a == uf1Var.a && this.b == uf1Var.b && this.c.equals(uf1Var.c) && this.d == uf1Var.d && this.e.equals(uf1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j39.c(j39.a(j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("ComicState(isLoading=", this.a, ", isImporting=", this.b, ", bookName=");
        j39.z(sbR, this.c, ", isError=", this.d, ", errorMessage=");
        return ky0.s(this.e, ")", sbR);
    }
}
