package defpackage;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zy4 {
    public final int a;
    public final int b;
    public final float c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final float j;
    public final int k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;

    public zy4(int i, int i2, float f, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, float f2, int i5, int i6, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = i3;
        this.e = i4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = f2;
        this.k = i5;
        this.l = i6;
        this.m = z5;
        this.n = z6;
        this.o = z7;
        this.p = z8;
        this.q = z9;
        this.r = z10;
        this.s = z11;
        this.t = z12;
    }

    public static zy4 a(zy4 zy4Var, int i, int i2, float f, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, float f2, int i5, int i6, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i7) {
        int i8 = (i7 & 1) != 0 ? zy4Var.a : i;
        int i9 = (i7 & 2) != 0 ? zy4Var.b : i2;
        float f3 = (i7 & 4) != 0 ? zy4Var.c : f;
        int i10 = (i7 & 8) != 0 ? zy4Var.d : i3;
        int i11 = (i7 & 16) != 0 ? zy4Var.e : i4;
        boolean z13 = (i7 & 32) != 0 ? zy4Var.f : z;
        boolean z14 = (i7 & 64) != 0 ? zy4Var.g : z2;
        boolean z15 = (i7 & Token.CASE) != 0 ? zy4Var.h : z3;
        boolean z16 = (i7 & 256) != 0 ? zy4Var.i : z4;
        float f4 = (i7 & 512) != 0 ? zy4Var.j : f2;
        zy4Var.getClass();
        int i12 = (i7 & 2048) != 0 ? zy4Var.k : i5;
        int i13 = (i7 & 4096) != 0 ? zy4Var.l : i6;
        boolean z17 = (i7 & 8192) != 0 ? zy4Var.m : z5;
        boolean z18 = (i7 & 16384) != 0 ? zy4Var.n : z6;
        boolean z19 = (i7 & 32768) != 0 ? zy4Var.o : z7;
        boolean z20 = (i7 & Parser.ARGC_LIMIT) != 0 ? zy4Var.p : z8;
        boolean z21 = (i7 & 131072) != 0 ? zy4Var.q : z9;
        boolean z22 = (i7 & 262144) != 0 ? zy4Var.r : z10;
        boolean z23 = (i7 & 524288) != 0 ? zy4Var.s : z11;
        boolean z24 = (i7 & 1048576) != 0 ? zy4Var.t : z12;
        zy4Var.getClass();
        return new zy4(i8, i9, f3, i10, i11, z13, z14, z15, z16, f4, i12, i13, z17, z18, z19, z20, z21, z22, z23, z24);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy4)) {
            return false;
        }
        zy4 zy4Var = (zy4) obj;
        return this.a == zy4Var.a && this.b == zy4Var.b && Float.compare(this.c, zy4Var.c) == 0 && this.d == zy4Var.d && this.e == zy4Var.e && this.f == zy4Var.f && this.g == zy4Var.g && this.h == zy4Var.h && this.i == zy4Var.i && Float.compare(this.j, zy4Var.j) == 0 && this.k == zy4Var.k && this.l == zy4Var.l && this.m == zy4Var.m && this.n == zy4Var.n && this.o == zy4Var.o && this.p == zy4Var.p && this.q == zy4Var.q && this.r == zy4Var.r && this.s == zy4Var.s && this.t == zy4Var.t;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.t) + j39.c(j39.c(j39.c(j39.c(j39.c(j39.c(j39.c(tw2.d(this.l, tw2.d(this.k, j39.c(tw2.c(this.j, j39.c(j39.c(j39.c(j39.c(tw2.d(this.e, tw2.d(this.d, tw2.c(this.c, tw2.d(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31), 31, false), 31), 31), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s);
    }

    public final String toString() {
        StringBuilder sbT = xv5.t(this.a, this.b, "ImageConfigState(scrollType=", ", scrollDirection=", ", autoScrollSpeed=");
        sbT.append(this.c);
        sbT.append(", darkMode=");
        sbT.append(this.d);
        sbT.append(", screenOrientation=");
        j39.x(sbT, this.e, ", isShowCutout=", this.f, ", isOptimizePage=");
        ky0.D(sbT, this.g, ", isDoublePage=", this.h, ", isAutoBrightness=");
        sbT.append(this.i);
        sbT.append(", brightness=");
        sbT.append(this.j);
        sbT.append(", isEyeProtect=false, turnPageByTouchOrientation=");
        ky0.u(this.k, this.l, ", turnPageTouchMode=", ", turnPageByVolume=", sbT);
        ky0.D(sbT, this.m, ", revertVolumeTurnPage=", this.n, ", turnPageByKeyboard=");
        ky0.D(sbT, this.o, ", animationTurnPage=", this.p, ", isAlwaysScreenOn=");
        ky0.D(sbT, this.q, ", isShowReadingProgress=", this.r, ", isEnableZoomDoubleTap=");
        sbT.append(this.s);
        sbT.append(", isShowControlWhenStartRead=");
        sbT.append(this.t);
        sbT.append(")");
        return sbT.toString();
    }
}
