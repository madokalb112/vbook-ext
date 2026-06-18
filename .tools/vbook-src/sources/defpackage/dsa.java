package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dsa {
    public final long a;
    public final xr b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final double h;
    public final float i;
    public final float j;
    public final c64 k;
    public final int l;
    public final String m;
    public final float n;

    public dsa(long j, xr xrVar, int i, boolean z, boolean z2, boolean z3, int i2, double d, float f, float f2, c64 c64Var, int i3, String str, float f3) {
        xrVar.getClass();
        c64Var.getClass();
        this.a = j;
        this.b = xrVar;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = i2;
        this.h = d;
        this.i = f;
        this.j = f2;
        this.k = c64Var;
        this.l = i3;
        this.m = str;
        this.n = f3;
    }

    public static dsa a(dsa dsaVar, long j, xr xrVar, int i, boolean z, boolean z2, boolean z3, int i2, double d, float f, float f2, c64 c64Var, int i3, String str, float f3, int i4) {
        long j2 = (i4 & 1) != 0 ? dsaVar.a : j;
        xr xrVar2 = (i4 & 2) != 0 ? dsaVar.b : xrVar;
        int i5 = (i4 & 4) != 0 ? dsaVar.c : i;
        boolean z4 = (i4 & 8) != 0 ? dsaVar.d : z;
        boolean z5 = (i4 & 16) != 0 ? dsaVar.e : z2;
        boolean z6 = (i4 & 32) != 0 ? dsaVar.f : z3;
        int i6 = (i4 & 64) != 0 ? dsaVar.g : i2;
        double d2 = (i4 & Token.CASE) != 0 ? dsaVar.h : d;
        dsaVar.getClass();
        float f4 = (i4 & 512) != 0 ? dsaVar.i : f;
        float f5 = (i4 & 1024) != 0 ? dsaVar.j : f2;
        c64 c64Var2 = (i4 & 2048) != 0 ? dsaVar.k : c64Var;
        int i7 = (i4 & 4096) != 0 ? dsaVar.l : i3;
        long j3 = j2;
        String str2 = (i4 & 8192) != 0 ? dsaVar.m : str;
        float f6 = (i4 & 16384) != 0 ? dsaVar.n : f3;
        dsaVar.getClass();
        xrVar2.getClass();
        c64Var2.getClass();
        str2.getClass();
        return new dsa(j3, xrVar2, i5, z4, z5, z6, i6, d2, f4, f5, c64Var2, i7, str2, f6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsa)) {
            return false;
        }
        dsa dsaVar = (dsa) obj;
        return lc1.d(this.a, dsaVar.a) && this.b == dsaVar.b && this.c == dsaVar.c && this.d == dsaVar.d && this.e == dsaVar.e && this.f == dsaVar.f && this.g == dsaVar.g && Double.compare(this.h, dsaVar.h) == 0 && Float.compare(this.i, dsaVar.i) == 0 && Float.compare(this.j, dsaVar.j) == 0 && lc5.Q(this.k, dsaVar.k) && this.l == dsaVar.l && this.m.equals(dsaVar.m) && Float.compare(this.n, dsaVar.n) == 0;
    }

    public final int hashCode() {
        int i = lc1.k;
        return Float.hashCode(this.n) + j39.a(tw2.d(this.l, (this.k.hashCode() + tw2.c(this.j, tw2.c(this.i, j39.c((Double.hashCode(this.h) + tw2.d(this.g, j39.c(j39.c(j39.c(tw2.d(this.c, (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31), 31, this.d), 31, this.e), 31, this.f), 31)) * 31, 31, false), 31), 31)) * 31, 31), 31, this.m);
    }

    public final String toString() {
        String strJ = lc1.j(this.a);
        StringBuilder sb = new StringBuilder("ThemeState(primaryColor=");
        sb.append(strJ);
        sb.append(", background=");
        sb.append(this.b);
        sb.append(", darkTheme=");
        j39.x(sb, this.c, ", useAmoledTheme=", this.d, ", useEInkTheme=");
        ky0.D(sb, this.e, ", useSystemColor=", this.f, ", style=");
        sb.append(this.g);
        sb.append(", contrastLevel=");
        sb.append(this.h);
        sb.append(", isExtendedFidelity=false, fontScale=");
        sb.append(this.i);
        sb.append(", densityScale=");
        sb.append(this.j);
        sb.append(", fontFamily=");
        sb.append(this.k);
        sb.append(", swipeBack=");
        sb.append(this.l);
        sb.append(", backgroundImage=");
        sb.append(this.m);
        sb.append(", backgroundImageAlpha=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }
}
