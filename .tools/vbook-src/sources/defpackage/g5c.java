package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class g5c {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public g5c(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, String str3, String str4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
    }

    public static g5c a(g5c g5cVar, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, String str3, int i) {
        if ((i & 1) != 0) {
            z = g5cVar.a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = g5cVar.b;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = g5cVar.c;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = g5cVar.d;
        }
        boolean z8 = z4;
        if ((i & 16) != 0) {
            str = g5cVar.e;
        }
        String str4 = str;
        if ((i & 32) != 0) {
            str2 = g5cVar.f;
        }
        String str5 = str2;
        String str6 = (i & 64) != 0 ? g5cVar.g : str3;
        String str7 = g5cVar.h;
        g5cVar.getClass();
        str6.getClass();
        return new g5c(z5, z6, z7, z8, str4, str5, str6, str7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5c)) {
            return false;
        }
        g5c g5cVar = (g5c) obj;
        return this.a == g5cVar.a && this.b == g5cVar.b && this.c == g5cVar.c && this.d == g5cVar.d && this.e.equals(g5cVar.e) && this.f.equals(g5cVar.f) && this.g.equals(g5cVar.g) && this.h.equals(g5cVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + j39.a(j39.a(j39.a(j39.c(j39.c(j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("ZipTextState(isLoading=", this.a, ", isImporting=", this.b, ", isImported=");
        ky0.D(sbR, this.c, ", isError=", this.d, ", bookName=");
        j39.y(sbR, this.e, ", bookAuthor=", this.f, ", bookLanguage=");
        return tw2.s(sbR, this.g, ", errorMessage=", this.h, ")");
    }
}
