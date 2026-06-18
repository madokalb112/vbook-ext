package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lra {
    public final boolean a;
    public final boolean b;
    public final long c;
    public final long d;
    public final String e;
    public final c64 f;

    public lra(boolean z, boolean z2, long j, long j2, String str, c64 c64Var) {
        c64Var.getClass();
        this.a = z;
        this.b = z2;
        this.c = j;
        this.d = j2;
        this.e = str;
        this.f = c64Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lra)) {
            return false;
        }
        lra lraVar = (lra) obj;
        return this.a == lraVar.a && this.b == lraVar.b && lc1.d(this.c, lraVar.c) && lc1.d(this.d, lraVar.d) && this.e.equals(lraVar.e) && lc5.Q(this.f, lraVar.f);
    }

    public final int hashCode() {
        int iC = j39.c(Boolean.hashCode(this.a) * 31, 31, this.b);
        int i = lc1.k;
        return this.f.hashCode() + j39.a(xv5.b(xv5.b(iC, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        String strJ = lc1.j(this.c);
        String strJ2 = lc1.j(this.d);
        StringBuilder sbR = j39.r("ThemeConfigState(isUseAppColor=", this.a, ", darkMode=", this.b, ", textColor=");
        j39.y(sbR, strJ, ", backgroundColor=", strJ2, ", backgroundImagePath=");
        sbR.append(this.e);
        sbR.append(", fontFamily=");
        sbR.append(this.f);
        sbR.append(")");
        return sbR.toString();
    }
}
