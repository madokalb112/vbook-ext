package defpackage;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fba {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final boolean g;
    public final String h;
    public final boolean i;
    public final String j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;

    public fba(String str, String str2, String str3, String str4, String str5, int i, boolean z, String str6, boolean z2, String str7, String str8, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = z;
        this.h = str6;
        this.i = z2;
        this.j = str7;
        this.k = str8;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.p = z7;
        this.q = z8;
        this.r = z9;
        this.s = z10;
    }

    public static fba a(fba fbaVar, String str, String str2, String str3, String str4, String str5, int i, boolean z, String str6, boolean z2, String str7, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i2) {
        String str8 = (i2 & 1) != 0 ? fbaVar.a : str;
        String str9 = (i2 & 2) != 0 ? fbaVar.b : str2;
        String str10 = (i2 & 4) != 0 ? fbaVar.c : str3;
        String str11 = (i2 & 8) != 0 ? fbaVar.d : str4;
        String str12 = (i2 & 16) != 0 ? fbaVar.e : str5;
        int i3 = (i2 & 32) != 0 ? fbaVar.f : i;
        boolean z11 = (i2 & 64) != 0 ? fbaVar.g : z;
        String str13 = (i2 & Token.CASE) != 0 ? fbaVar.h : str6;
        boolean z12 = (i2 & 256) != 0 ? fbaVar.i : z2;
        String str14 = fbaVar.j;
        String str15 = (i2 & 1024) != 0 ? fbaVar.k : str7;
        boolean z13 = (i2 & 2048) != 0 ? fbaVar.l : z3;
        boolean z14 = (i2 & 4096) != 0 ? fbaVar.m : z4;
        boolean z15 = (i2 & 8192) != 0 ? fbaVar.n : z5;
        String str16 = str8;
        boolean z16 = (i2 & 16384) != 0 ? fbaVar.o : z6;
        boolean z17 = (i2 & 32768) != 0 ? fbaVar.p : z7;
        boolean z18 = (i2 & Parser.ARGC_LIMIT) != 0 ? fbaVar.q : z8;
        boolean z19 = (i2 & 131072) != 0 ? fbaVar.r : z9;
        boolean z20 = (i2 & 262144) != 0 ? fbaVar.s : z10;
        fbaVar.getClass();
        str16.getClass();
        str11.getClass();
        str12.getClass();
        return new fba(str16, str9, str10, str11, str12, i3, z11, str13, z12, str14, str15, z13, z14, z15, z16, z17, z18, z19, z20);
    }

    public final boolean b() {
        return this.i;
    }

    public final boolean c() {
        return this.n;
    }

    public final boolean d() {
        return this.o;
    }

    public final boolean e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fba)) {
            return false;
        }
        fba fbaVar = (fba) obj;
        return this.a.equals(fbaVar.a) && this.b.equals(fbaVar.b) && this.c.equals(fbaVar.c) && this.d.equals(fbaVar.d) && this.e.equals(fbaVar.e) && this.f == fbaVar.f && this.g == fbaVar.g && this.h.equals(fbaVar.h) && this.i == fbaVar.i && this.j.equals(fbaVar.j) && this.k.equals(fbaVar.k) && this.l == fbaVar.l && this.m == fbaVar.m && this.n == fbaVar.n && this.o == fbaVar.o && this.p == fbaVar.p && this.q == fbaVar.q && this.r == fbaVar.r && this.s == fbaVar.s;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.s) + j39.c(j39.c(j39.c(j39.c(j39.c(j39.c(j39.c(j39.a(j39.a(j39.c(j39.a(j39.c(tw2.d(this.f, j39.a(j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("TextBookState(bookId=", this.a, ", name=", this.b, ", author=");
        j39.y(sbQ, this.c, ", cover=", this.d, ", path=");
        dx1.t(this.f, this.e, ", type=", ", isShowChapter=", sbQ);
        sbQ.append(this.g);
        sbQ.append(", extensionId=");
        sbQ.append(this.h);
        sbQ.append(", isInQtTranslate=");
        sbQ.append(this.i);
        sbQ.append(", language=");
        sbQ.append(this.j);
        sbQ.append(", description=");
        j39.z(sbQ, this.k, ", isNfsw=", this.l, ", isOngoing=");
        ky0.D(sbQ, this.m, ", isInShelf=", this.n, ", isOffline=");
        ky0.D(sbQ, this.o, ", isFollow=", this.p, ", isDownloading=");
        ky0.D(sbQ, this.q, ", isSupportDownload=", this.r, ", isSupportReload=");
        return xv5.q(")", sbQ, this.s);
    }
}
