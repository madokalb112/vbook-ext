package defpackage;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class onb {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;
    public final long j;
    public final long k;
    public final int l;
    public final float m;
    public final boolean n;
    public final float o;
    public final float p;
    public final int q;
    public final int r;
    public final boolean s;
    public final boolean t;
    public final float u;
    public final boolean v;
    public final boolean w;

    public onb(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, float f, float f2, long j, long j2, int i4, float f3, boolean z5, float f4, float f5, int i5, int i6, boolean z6, boolean z7, float f6, boolean z8, boolean z9) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = f;
        this.i = f2;
        this.j = j;
        this.k = j2;
        this.l = i4;
        this.m = f3;
        this.n = z5;
        this.o = f4;
        this.p = f5;
        this.q = i5;
        this.r = i6;
        this.s = z6;
        this.t = z7;
        this.u = f6;
        this.v = z8;
        this.w = z9;
    }

    public static onb a(onb onbVar, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, float f, float f2, long j, long j2, int i4, float f3, boolean z5, float f4, float f5, int i5, int i6, boolean z6, boolean z7, float f6, boolean z8, boolean z9, int i7) {
        int i8 = (i7 & 1) != 0 ? onbVar.a : i;
        int i9 = (i7 & 2) != 0 ? onbVar.b : i2;
        int i10 = (i7 & 4) != 0 ? onbVar.c : i3;
        boolean z10 = (i7 & 8) != 0 ? onbVar.d : z;
        boolean z11 = (i7 & 16) != 0 ? onbVar.e : z2;
        boolean z12 = (i7 & 32) != 0 ? onbVar.f : z3;
        boolean z13 = (i7 & 64) != 0 ? onbVar.g : z4;
        float f7 = (i7 & Token.CASE) != 0 ? onbVar.h : f;
        float f8 = (i7 & 256) != 0 ? onbVar.i : f2;
        long j3 = (i7 & 512) != 0 ? onbVar.j : j;
        long j4 = (i7 & 1024) != 0 ? onbVar.k : j2;
        int i11 = (i7 & 2048) != 0 ? onbVar.l : i4;
        int i12 = i8;
        float f9 = (i7 & 4096) != 0 ? onbVar.m : f3;
        boolean z14 = (i7 & 8192) != 0 ? onbVar.n : z5;
        float f10 = (i7 & 16384) != 0 ? onbVar.o : f4;
        float f11 = (i7 & 32768) != 0 ? onbVar.p : f5;
        int i13 = (i7 & Parser.ARGC_LIMIT) != 0 ? onbVar.q : i5;
        int i14 = (i7 & 131072) != 0 ? onbVar.r : i6;
        boolean z15 = (i7 & 262144) != 0 ? onbVar.s : z6;
        boolean z16 = (i7 & 524288) != 0 ? onbVar.t : z7;
        float f12 = (i7 & 1048576) != 0 ? onbVar.u : f6;
        boolean z17 = (i7 & 2097152) != 0 ? onbVar.v : z8;
        boolean z18 = (i7 & 4194304) != 0 ? onbVar.w : z9;
        onbVar.getClass();
        return new onb(i12, i9, i10, z10, z11, z12, z13, f7, f8, j3, j4, i11, f9, z14, f10, f11, i13, i14, z15, z16, f12, z17, z18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onb)) {
            return false;
        }
        onb onbVar = (onb) obj;
        return this.a == onbVar.a && this.b == onbVar.b && this.c == onbVar.c && this.d == onbVar.d && this.e == onbVar.e && this.f == onbVar.f && this.g == onbVar.g && Float.compare(this.h, onbVar.h) == 0 && Float.compare(this.i, onbVar.i) == 0 && this.j == onbVar.j && this.k == onbVar.k && this.l == onbVar.l && Float.compare(this.m, onbVar.m) == 0 && this.n == onbVar.n && Float.compare(this.o, onbVar.o) == 0 && Float.compare(this.p, onbVar.p) == 0 && this.q == onbVar.q && this.r == onbVar.r && this.s == onbVar.s && this.t == onbVar.t && Float.compare(this.u, onbVar.u) == 0 && this.v == onbVar.v && this.w == onbVar.w;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.w) + j39.c(tw2.c(this.u, j39.c(j39.c(tw2.d(this.r, tw2.d(this.q, tw2.c(this.p, tw2.c(this.o, j39.c(tw2.c(this.m, tw2.d(this.l, xv5.b(xv5.b(tw2.c(this.i, tw2.c(this.h, j39.c(j39.c(j39.c(j39.c(tw2.d(this.c, tw2.d(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), 31), 31, this.j), 31, this.k), 31), 31), 31, this.n), 31), 31), 31), 31), 31, this.s), 31, this.t), 31), 31, this.v);
    }

    public final String toString() {
        StringBuilder sbT = xv5.t(this.a, this.b, "VideoConfigState(darkMode=", ", screenOrientation=", ", resizeMode=");
        j39.x(sbT, this.c, ", isAutoPlay=", this.d, ", isAutoNextEpisode=");
        ky0.D(sbT, this.e, ", isAutoResumeLastPosition=", this.f, ", isShowSubtitle=");
        sbT.append(this.g);
        sbT.append(", subtitleTextSize=");
        sbT.append(this.h);
        sbT.append(", subtitleBackgroundOpacity=");
        sbT.append(this.i);
        sbT.append(", subtitleTextColor=");
        sbT.append(this.j);
        dx1.z(sbT, ", subtitleBackgroundColor=", this.k, ", subtitleFontWeight=");
        sbT.append(this.l);
        sbT.append(", subtitlePadding=");
        sbT.append(this.m);
        sbT.append(", isMuted=");
        sbT.append(this.n);
        sbT.append(", defaultVolume=");
        sbT.append(this.o);
        sbT.append(", playbackSpeed=");
        sbT.append(this.p);
        sbT.append(", seekForwardSeconds=");
        sbT.append(this.q);
        sbT.append(", seekBackwardSeconds=");
        j39.x(sbT, this.r, ", isAlwaysScreenOn=", this.s, ", isAutoBrightness=");
        sbT.append(this.t);
        sbT.append(", brightness=");
        sbT.append(this.u);
        sbT.append(", isLockOrientationWhenFullscreen=");
        sbT.append(this.v);
        sbT.append(", isContinuePlayInPip=");
        sbT.append(this.w);
        sbT.append(")");
        return sbT.toString();
    }
}
