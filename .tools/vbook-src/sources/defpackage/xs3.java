package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xs3 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public xs3(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, String str3, String str4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
    }

    public static xs3 a(xs3 xs3Var, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, String str3, int i) {
        if ((i & 1) != 0) {
            z = xs3Var.a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = xs3Var.b;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = xs3Var.c;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = xs3Var.d;
        }
        boolean z8 = z4;
        if ((i & 16) != 0) {
            str = xs3Var.e;
        }
        String str4 = str;
        if ((i & 32) != 0) {
            str2 = xs3Var.f;
        }
        String str5 = str2;
        String str6 = (i & 64) != 0 ? xs3Var.g : str3;
        String str7 = xs3Var.h;
        xs3Var.getClass();
        str6.getClass();
        return new xs3(z5, z6, z7, z8, str4, str5, str6, str7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs3)) {
            return false;
        }
        xs3 xs3Var = (xs3) obj;
        return this.a == xs3Var.a && this.b == xs3Var.b && this.c == xs3Var.c && this.d == xs3Var.d && this.e.equals(xs3Var.e) && this.f.equals(xs3Var.f) && this.g.equals(xs3Var.g) && this.h.equals(xs3Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + j39.a(j39.a(j39.a(j39.c(j39.c(j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("FB2State(isLoading=", this.a, ", isImporting=", this.b, ", isImported=");
        ky0.D(sbR, this.c, ", isError=", this.d, ", bookName=");
        j39.y(sbR, this.e, ", bookAuthor=", this.f, ", bookLanguage=");
        return tw2.s(sbR, this.g, ", errorMessage=", this.h, ")");
    }
}
