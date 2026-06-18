package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ny4 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;

    public ny4(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.p = z7;
        this.q = z8;
        this.r = z9;
    }

    public static ny4 a(ny4 ny4Var, String str, String str2, String str3, String str4, String str5, int i, String str6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i2) {
        String str7 = (i2 & 1) != 0 ? ny4Var.a : str;
        String str8 = (i2 & 2) != 0 ? ny4Var.b : str2;
        String str9 = (i2 & 4) != 0 ? ny4Var.c : str3;
        String str10 = ny4Var.g;
        String str11 = ny4Var.h;
        String str12 = (i2 & 256) != 0 ? ny4Var.i : str6;
        boolean z10 = (i2 & 8192) != 0 ? ny4Var.n : z5;
        boolean z11 = (65536 & i2) != 0 ? ny4Var.q : z8;
        boolean z12 = (i2 & 131072) != 0 ? ny4Var.r : z9;
        ny4Var.getClass();
        str7.getClass();
        str4.getClass();
        str5.getClass();
        return new ny4(str7, str8, str9, str4, str5, i, str10, str11, str12, z, z2, z3, z4, z10, z6, z7, z11, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny4)) {
            return false;
        }
        ny4 ny4Var = (ny4) obj;
        return this.a.equals(ny4Var.a) && this.b.equals(ny4Var.b) && this.c.equals(ny4Var.c) && this.d.equals(ny4Var.d) && this.e.equals(ny4Var.e) && this.f == ny4Var.f && this.g.equals(ny4Var.g) && this.h.equals(ny4Var.h) && this.i.equals(ny4Var.i) && this.j == ny4Var.j && this.k == ny4Var.k && this.l == ny4Var.l && this.m == ny4Var.m && this.n == ny4Var.n && this.o == ny4Var.o && this.p == ny4Var.p && this.q == ny4Var.q && this.r == ny4Var.r;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.r) + j39.c(j39.c(j39.c(j39.c(j39.c(j39.c(j39.c(j39.c(j39.a(j39.a(j39.a(tw2.d(this.f, j39.a(j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("ImageBookState(bookId=", this.a, ", name=", this.b, ", author=");
        j39.y(sbQ, this.c, ", cover=", this.d, ", path=");
        dx1.t(this.f, this.e, ", type=", ", translateMode=", sbQ);
        j39.y(sbQ, this.g, ", language=", this.h, ", description=");
        j39.z(sbQ, this.i, ", isNfsw=", this.j, ", isOngoing=");
        ky0.D(sbQ, this.k, ", isInShelf=", this.l, ", isFollow=");
        ky0.D(sbQ, this.m, ", isSupportShowDetail=", this.n, ", isSupportDownload=");
        ky0.D(sbQ, this.o, ", isSupportReload=", this.p, ", isSupportShowChapterName=");
        sbQ.append(this.q);
        sbQ.append(", isHideEndChapterDivider=");
        sbQ.append(this.r);
        sbQ.append(")");
        return sbQ.toString();
    }
}
