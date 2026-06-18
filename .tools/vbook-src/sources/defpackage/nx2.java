package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nx2 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public nx2(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, String str3, String str4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
    }

    public static nx2 a(nx2 nx2Var, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, String str3, int i) {
        if ((i & 1) != 0) {
            z = nx2Var.a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = nx2Var.b;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = nx2Var.c;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = nx2Var.d;
        }
        boolean z8 = z4;
        if ((i & 16) != 0) {
            str = nx2Var.e;
        }
        String str4 = str;
        if ((i & 32) != 0) {
            str2 = nx2Var.f;
        }
        String str5 = str2;
        String str6 = (i & 64) != 0 ? nx2Var.g : str3;
        String str7 = nx2Var.h;
        nx2Var.getClass();
        str6.getClass();
        return new nx2(z5, z6, z7, z8, str4, str5, str6, str7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx2)) {
            return false;
        }
        nx2 nx2Var = (nx2) obj;
        return this.a == nx2Var.a && this.b == nx2Var.b && this.c == nx2Var.c && this.d == nx2Var.d && this.e.equals(nx2Var.e) && this.f.equals(nx2Var.f) && this.g.equals(nx2Var.g) && this.h.equals(nx2Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + j39.a(j39.a(j39.a(j39.c(j39.c(j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("DocState(isLoading=", this.a, ", isImporting=", this.b, ", isImported=");
        ky0.D(sbR, this.c, ", isError=", this.d, ", bookName=");
        j39.y(sbR, this.e, ", bookAuthor=", this.f, ", bookLanguage=");
        return tw2.s(sbR, this.g, ", errorMessage=", this.h, ")");
    }
}
