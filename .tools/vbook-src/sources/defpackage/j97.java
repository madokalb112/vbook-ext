package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class j97 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;

    public j97(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
        this.e = str2;
    }

    public static j97 a(j97 j97Var, boolean z, boolean z2, String str, int i) {
        boolean z3 = (i & 1) != 0 ? j97Var.a : false;
        if ((i & 2) != 0) {
            z = j97Var.b;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            z2 = j97Var.c;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            str = j97Var.d;
        }
        String str2 = j97Var.e;
        j97Var.getClass();
        return new j97(str, str2, z3, z4, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j97)) {
            return false;
        }
        j97 j97Var = (j97) obj;
        return this.a == j97Var.a && this.b == j97Var.b && this.c == j97Var.c && this.d.equals(j97Var.d) && this.e.equals(j97Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j39.a(j39.c(j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("NovelState(isLoading=", this.a, ", isImporting=", this.b, ", isError=");
        sbR.append(this.c);
        sbR.append(", bookName=");
        sbR.append(this.d);
        sbR.append(", errorMessage=");
        return ky0.s(this.e, ")", sbR);
    }
}
