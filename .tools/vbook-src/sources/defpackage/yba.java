package defpackage;

import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yba {
    public final boolean A;
    public final boolean B;
    public final float C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final String a;
    public final List b;
    public final List c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final int n;
    public final int o;
    public final boolean p;
    public final float q;
    public final boolean r;
    public final boolean s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public yba(String str, List list, List list2, String str2, String str3, String str4, boolean z, String str5, float f, float f2, float f3, float f4, float f5, int i, int i2, boolean z2, float f6, boolean z3, boolean z4, int i3, int i4, int i5, int i6, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, float f7, int i7, int i8, int i9, int i10) {
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = z;
        this.h = str5;
        this.i = f;
        this.j = f2;
        this.k = f3;
        this.l = f4;
        this.m = f5;
        this.n = i;
        this.o = i2;
        this.p = z2;
        this.q = f6;
        this.r = z3;
        this.s = z4;
        this.t = i3;
        this.u = i4;
        this.v = i5;
        this.w = i6;
        this.x = z5;
        this.y = z6;
        this.z = z7;
        this.A = z8;
        this.B = z9;
        this.C = f7;
        this.D = i7;
        this.E = i8;
        this.F = i9;
        this.G = i10;
    }

    public static yba a(yba ybaVar, String str, List list, List list2, String str2, String str3, String str4, boolean z, String str5, float f, float f2, float f3, float f4, float f5, int i, int i2, boolean z2, float f6, boolean z3, boolean z4, int i3, int i4, int i5, int i6, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, float f7, int i7, int i8, int i9, int i10, int i11, int i12) {
        String str6 = (i11 & 1) != 0 ? ybaVar.a : str;
        List list3 = (i11 & 2) != 0 ? ybaVar.b : list;
        List list4 = (i11 & 4) != 0 ? ybaVar.c : list2;
        String str7 = (i11 & 8) != 0 ? ybaVar.d : str2;
        String str8 = (i11 & 16) != 0 ? ybaVar.e : str3;
        String str9 = (i11 & 32) != 0 ? ybaVar.f : str4;
        boolean z10 = (i11 & 64) != 0 ? ybaVar.g : z;
        String str10 = (i11 & Token.CASE) != 0 ? ybaVar.h : str5;
        float f8 = (i11 & 256) != 0 ? ybaVar.i : f;
        float f9 = (i11 & 512) != 0 ? ybaVar.j : f2;
        float f10 = (i11 & 1024) != 0 ? ybaVar.k : f3;
        float f11 = (i11 & 2048) != 0 ? ybaVar.l : f4;
        float f12 = (i11 & 4096) != 0 ? ybaVar.m : f5;
        int i13 = (i11 & 8192) != 0 ? ybaVar.n : i;
        String str11 = str6;
        int i14 = (i11 & 16384) != 0 ? ybaVar.o : i2;
        boolean z11 = (i11 & 32768) != 0 ? ybaVar.p : z2;
        float f13 = (i11 & Parser.ARGC_LIMIT) != 0 ? ybaVar.q : f6;
        boolean z12 = (i11 & 131072) != 0 ? ybaVar.r : z3;
        boolean z13 = (i11 & 262144) != 0 ? ybaVar.s : z4;
        int i15 = (i11 & 524288) != 0 ? ybaVar.t : i3;
        int i16 = (i11 & 1048576) != 0 ? ybaVar.u : i4;
        int i17 = (i11 & 2097152) != 0 ? ybaVar.v : i5;
        int i18 = (i11 & 4194304) != 0 ? ybaVar.w : i6;
        boolean z14 = (i11 & 8388608) != 0 ? ybaVar.x : z5;
        boolean z15 = (i11 & 16777216) != 0 ? ybaVar.y : z6;
        boolean z16 = (i11 & 33554432) != 0 ? ybaVar.z : z7;
        boolean z17 = (i11 & 67108864) != 0 ? ybaVar.A : z8;
        boolean z18 = (i11 & 134217728) != 0 ? ybaVar.B : z9;
        float f14 = (i11 & 268435456) != 0 ? ybaVar.C : f7;
        int i19 = (i11 & 536870912) != 0 ? ybaVar.D : i7;
        int i20 = (i11 & 1073741824) != 0 ? ybaVar.E : i8;
        int i21 = (i11 & Integer.MIN_VALUE) != 0 ? ybaVar.F : i9;
        int i22 = (i12 & 1) != 0 ? ybaVar.G : i10;
        ybaVar.getClass();
        str11.getClass();
        list3.getClass();
        list4.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        str10.getClass();
        return new yba(str11, list3, list4, str7, str8, str9, z10, str10, f8, f9, f10, f11, f12, i13, i14, z11, f13, z12, z13, i15, i16, i17, i18, z14, z15, z16, z17, z18, f14, i19, i20, i21, i22);
    }

    public final float b() {
        return this.C;
    }

    public final boolean c() {
        return this.z;
    }

    public final boolean d() {
        return this.x;
    }

    public final int e() {
        return this.w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yba)) {
            return false;
        }
        yba ybaVar = (yba) obj;
        return this.a.equals(ybaVar.a) && lc5.Q(this.b, ybaVar.b) && lc5.Q(this.c, ybaVar.c) && this.d.equals(ybaVar.d) && this.e.equals(ybaVar.e) && this.f.equals(ybaVar.f) && this.g == ybaVar.g && this.h.equals(ybaVar.h) && Float.compare(this.i, ybaVar.i) == 0 && Float.compare(this.j, ybaVar.j) == 0 && Float.compare(this.k, ybaVar.k) == 0 && Float.compare(this.l, ybaVar.l) == 0 && Float.compare(this.m, ybaVar.m) == 0 && this.n == ybaVar.n && this.o == ybaVar.o && this.p == ybaVar.p && Float.compare(this.q, ybaVar.q) == 0 && this.r == ybaVar.r && this.s == ybaVar.s && this.t == ybaVar.t && this.u == ybaVar.u && this.v == ybaVar.v && this.w == ybaVar.w && this.x == ybaVar.x && this.y == ybaVar.y && this.z == ybaVar.z && this.A == ybaVar.A && this.B == ybaVar.B && Float.compare(this.C, ybaVar.C) == 0 && this.D == ybaVar.D && this.E == ybaVar.E && this.F == ybaVar.F && this.G == ybaVar.G;
    }

    public final boolean f() {
        return this.B;
    }

    public final int hashCode() {
        return Integer.hashCode(this.G) + tw2.d(this.F, tw2.d(this.E, tw2.d(this.D, tw2.c(this.C, j39.c(j39.c(j39.c(j39.c(j39.c(tw2.d(this.w, tw2.d(this.v, tw2.d(this.u, tw2.d(this.t, j39.c(j39.c(tw2.c(this.q, j39.c(tw2.d(this.o, tw2.d(this.n, tw2.c(this.m, tw2.c(this.l, tw2.c(this.k, tw2.c(this.j, tw2.c(this.i, j39.a(j39.c(j39.a(j39.a(j39.a(j39.d(j39.d(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31), 31), 31), 31), 31), 31), 31), 31, this.p), 31), 31, this.r), 31, this.s), 31), 31), 31), 31), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextConfigState(themeColorId=");
        sb.append(this.a);
        sb.append(", basicThemeList=");
        sb.append(this.b);
        sb.append(", userThemeList=");
        sb.append(this.c);
        sb.append(", textColor=");
        sb.append(this.d);
        sb.append(", backgroundColor=");
        j39.y(sb, this.e, ", backgroundImagePath=", this.f, ", darkMode=");
        sb.append(this.g);
        sb.append(", fontFamily=");
        sb.append(this.h);
        sb.append(", fontSize=");
        sb.append(this.i);
        sb.append(", textIndent=");
        sb.append(this.j);
        sb.append(", lineSpacing=");
        sb.append(this.k);
        sb.append(", paragraphSpacing=");
        sb.append(this.l);
        sb.append(", letterSpacing=");
        sb.append(this.m);
        sb.append(", textAlign=");
        sb.append(this.n);
        sb.append(", orientation=");
        j39.x(sb, this.o, ", isAutoBrightness=", this.p, ", brightness=");
        sb.append(this.q);
        sb.append(", isKeepScreenOn=");
        sb.append(this.r);
        sb.append(", isEyeProtect=");
        sb.append(this.s);
        sb.append(", scrollType=");
        sb.append(this.t);
        sb.append(", twoPageLayout=");
        ky0.u(this.u, this.v, ", turnPageByTouchOrientation=", ", turnPageTouchMode=", sb);
        j39.x(sb, this.w, ", turnPageByVolume=", this.x, ", revertVolumeTurnPage=");
        ky0.D(sb, this.y, ", turnPageByKeyboard=", this.z, ", animationTurnPage=");
        ky0.D(sb, this.A, ", isShowControlWhenStartRead=", this.B, ", autoScrollSpeed=");
        sb.append(this.C);
        sb.append(", leftMargin=");
        sb.append(this.D);
        sb.append(", rightMargin=");
        ky0.u(this.E, this.F, ", topMargin=", ", bottomMargin=", sb);
        return tw2.q(sb, this.G, ")");
    }
}
