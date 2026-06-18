package defpackage;

import java.util.Arrays;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cm3 {
    public final boolean A;
    public final String B;
    public final String C;
    public final byte[] D;
    public final boolean a;
    public final boolean b;
    public final om3 c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final int l;
    public final int m;
    public final String n;
    public final int o;
    public final long p;
    public final String q;
    public final rl3 r;
    public final sl3 s;
    public final String t;
    public final String u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public cm3(boolean z, boolean z2, om3 om3Var, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, int i3, String str8, int i4, long j, String str9, rl3 rl3Var, sl3 sl3Var, String str10, String str11, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str12, String str13, byte[] bArr) {
        rl3Var.getClass();
        sl3Var.getClass();
        this.a = z;
        this.b = z2;
        this.c = om3Var;
        this.d = i;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = i2;
        this.m = i3;
        this.n = str8;
        this.o = i4;
        this.p = j;
        this.q = str9;
        this.r = rl3Var;
        this.s = sl3Var;
        this.t = str10;
        this.u = str11;
        this.v = z3;
        this.w = z4;
        this.x = z5;
        this.y = z6;
        this.z = z7;
        this.A = z8;
        this.B = str12;
        this.C = str13;
        this.D = bArr;
    }

    public static cm3 a(cm3 cm3Var, boolean z, om3 om3Var, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, int i3, String str8, int i4, long j, String str9, rl3 rl3Var, sl3 sl3Var, String str10, String str11, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str12, String str13, byte[] bArr, int i5) {
        boolean z8 = (i5 & 1) != 0 ? cm3Var.a : false;
        boolean z9 = (i5 & 2) != 0 ? cm3Var.b : z;
        om3 om3Var2 = (i5 & 4) != 0 ? cm3Var.c : om3Var;
        int i6 = (i5 & 8) != 0 ? cm3Var.d : i;
        String str14 = (i5 & 16) != 0 ? cm3Var.e : str;
        String str15 = (i5 & 32) != 0 ? cm3Var.f : str2;
        String str16 = (i5 & 64) != 0 ? cm3Var.g : str3;
        String str17 = (i5 & Token.CASE) != 0 ? cm3Var.h : str4;
        String str18 = (i5 & 256) != 0 ? cm3Var.i : str5;
        String str19 = (i5 & 512) != 0 ? cm3Var.j : str6;
        String str20 = (i5 & 1024) != 0 ? cm3Var.k : str7;
        int i7 = (i5 & 2048) != 0 ? cm3Var.l : i2;
        int i8 = (i5 & 4096) != 0 ? cm3Var.m : i3;
        String str21 = (i5 & 8192) != 0 ? cm3Var.n : str8;
        boolean z10 = z8;
        int i9 = (i5 & 16384) != 0 ? cm3Var.o : i4;
        long j2 = (i5 & 32768) != 0 ? cm3Var.p : j;
        String str22 = (i5 & Parser.ARGC_LIMIT) != 0 ? cm3Var.q : str9;
        rl3 rl3Var2 = (i5 & 131072) != 0 ? cm3Var.r : rl3Var;
        String str23 = str22;
        sl3 sl3Var2 = (i5 & 262144) != 0 ? cm3Var.s : sl3Var;
        String str24 = (i5 & 524288) != 0 ? cm3Var.t : str10;
        String str25 = (i5 & 1048576) != 0 ? cm3Var.u : str11;
        boolean z11 = (i5 & 2097152) != 0 ? cm3Var.v : z2;
        boolean z12 = (i5 & 4194304) != 0 ? cm3Var.w : z3;
        boolean z13 = (i5 & 8388608) != 0 ? cm3Var.x : z4;
        boolean z14 = (i5 & 16777216) != 0 ? cm3Var.y : z5;
        boolean z15 = (i5 & 33554432) != 0 ? cm3Var.z : z6;
        boolean z16 = (i5 & 67108864) != 0 ? cm3Var.A : z7;
        String str26 = (i5 & 134217728) != 0 ? cm3Var.B : str12;
        String str27 = (i5 & 268435456) != 0 ? cm3Var.C : str13;
        byte[] bArr2 = (i5 & 536870912) != 0 ? cm3Var.D : bArr;
        cm3Var.getClass();
        str14.getClass();
        str19.getClass();
        str20.getClass();
        str21.getClass();
        str23.getClass();
        rl3Var2.getClass();
        sl3Var2.getClass();
        str24.getClass();
        str25.getClass();
        str26.getClass();
        str27.getClass();
        return new cm3(z10, z9, om3Var2, i6, str14, str15, str16, str17, str18, str19, str20, i7, i8, str21, i9, j2, str23, rl3Var2, sl3Var2, str24, str25, z11, z12, z13, z14, z15, z16, str26, str27, bArr2);
    }

    public final boolean b() {
        return e() && rw1.e0(this.r);
    }

    public final boolean c() {
        return e() && rw1.g0(this.r);
    }

    public final boolean d() {
        return e() && rw1.d0(this.r);
    }

    public final boolean e() {
        int i = this.m;
        return i == 10 || i == 20;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm3)) {
            return false;
        }
        cm3 cm3Var = (cm3) obj;
        return this.a == cm3Var.a && this.b == cm3Var.b && this.c == cm3Var.c && this.d == cm3Var.d && this.e.equals(cm3Var.e) && this.f.equals(cm3Var.f) && this.g.equals(cm3Var.g) && this.h.equals(cm3Var.h) && this.i.equals(cm3Var.i) && this.j.equals(cm3Var.j) && this.k.equals(cm3Var.k) && this.l == cm3Var.l && this.m == cm3Var.m && this.n.equals(cm3Var.n) && this.o == cm3Var.o && this.p == cm3Var.p && this.q.equals(cm3Var.q) && this.r == cm3Var.r && this.s == cm3Var.s && this.t.equals(cm3Var.t) && this.u.equals(cm3Var.u) && this.v == cm3Var.v && this.w == cm3Var.w && this.x == cm3Var.x && this.y == cm3Var.y && this.z == cm3Var.z && this.A == cm3Var.A && this.B.equals(cm3Var.B) && this.C.equals(cm3Var.C) && lc5.Q(this.D, cm3Var.D);
    }

    public final int hashCode() {
        int iC = j39.c(Boolean.hashCode(this.a) * 31, 31, this.b);
        om3 om3Var = this.c;
        int iA = j39.a(j39.a(j39.c(j39.c(j39.c(j39.c(j39.c(j39.c(j39.a(j39.a((this.s.hashCode() + ((this.r.hashCode() + j39.a(xv5.b(tw2.d(this.o, j39.a(tw2.d(this.m, tw2.d(this.l, j39.a(j39.a(j39.a(j39.a(j39.a(j39.a(j39.a(tw2.d(this.d, (iC + (om3Var == null ? 0 : om3Var.hashCode())) * 31, 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31), 31), 31, this.n), 31), 31, this.p), 31, this.q)) * 31)) * 31, 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31, this.C);
        byte[] bArr = this.D;
        return iA + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public final String toString() {
        String string = Arrays.toString(this.D);
        StringBuilder sbR = j39.r("ExportEbookState(isLoading=", this.a, ", isExporting=", this.b, ", exportPhase=");
        sbR.append(this.c);
        sbR.append(", exportProgress=");
        sbR.append(this.d);
        sbR.append(", bookId=");
        j39.y(sbR, this.e, ", bookName=", this.f, ", bookRawName=");
        j39.y(sbR, this.g, ", bookAuthor=", this.h, ", bookRawAuthor=");
        j39.y(sbR, this.i, ", bookCover=", this.j, ", bookPath=");
        dx1.t(this.l, this.k, ", bookType=", ", bookFormat=", sbR);
        ky0.w(this.m, ", bookLanguage=", this.n, ", totalChapter=", sbR);
        sbR.append(this.o);
        sbR.append(", downloadedChapterCount=");
        sbR.append(this.p);
        sbR.append(", introduction=");
        sbR.append(this.q);
        sbR.append(", format=");
        sbR.append(this.r);
        sbR.append(", scope=");
        sbR.append(this.s);
        sbR.append(", rangeStart=");
        sbR.append(this.t);
        sbR.append(", rangeEnd=");
        sbR.append(this.u);
        sbR.append(", includeIntroduction=");
        sbR.append(this.v);
        sbR.append(", includeTableOfContent=");
        sbR.append(this.w);
        sbR.append(", showChapterTitle=");
        sbR.append(this.x);
        sbR.append(", mergeIntoSingleFile=");
        sbR.append(this.y);
        sbR.append(", includeTranslateContent=");
        sbR.append(this.z);
        sbR.append(", isAutoTranslateEnabled=");
        sbR.append(this.A);
        sbR.append(", customName=");
        sbR.append(this.B);
        j39.y(sbR, ", customAuthor=", this.C, ", customCoverBytes=", string);
        sbR.append(")");
        return sbR.toString();
    }
}
